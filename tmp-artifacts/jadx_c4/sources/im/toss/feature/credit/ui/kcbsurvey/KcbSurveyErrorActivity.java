package im.toss.feature.credit.ui.kcbsurvey;

import android.animation.AnimatorInflater;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyErrorActivity;
import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyErrorActivity$;
import im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IPostMessageServiceStubProxy;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.TimelineExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.access15300;
import o.findResAndMsg;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.readIntokhttp;
import o.readTimeout;
import o.response;
import o.rvInitOpt;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setRubIn;
import o.varyMatches;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class KcbSurveyErrorActivity extends Hilt_KcbSurveyErrorActivity implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 0;
    public static final int asBinder;
    private static long asInterface = 0;
    private static int getInterfaceDescriptor = 1;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy IAuthTabCallbackStub = isStopUpload.onNavigationEvent(this, 1480375, (Function1) null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyErrorActivity$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = KcbSurveyErrorActivity.onNavigationEvent(this.f$0, (initMiniApp.onWarmupCompleted) obj);
            int i4 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnNavigationEvent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }, 2, (Object) null);
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyErrorActivity$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = KcbSurveyErrorActivity.onNavigationEvent(this.f$0);
            int i4 = IAuthTabCallback + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return strOnNavigationEvent;
            }
            throw null;
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyErrorActivity$$ExternalSyntheticLambda2
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KcbSurveyErrorActivity.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = KcbSurveyErrorActivity.onWarmupCompleted(this.f$0);
            int i4 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackOnWarmupCompleted;
        }
    });

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.DENIED.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.ETC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAuthTabCallback.TIME_OUT.ordinal()] = 3;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IAuthTabCallback.ALREADY_COMPLETED.ordinal()] = 4;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IAuthTabCallback.EXPIRED.ordinal()] = 5;
                int i6 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallback = iArr;
        }
    }

    static {
        onVerticalScrollEvent();
        Companion = new onExtraCallback(null);
        asBinder = 8;
        int i = IAuthTabCallbackStubProxy + 11;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(KcbSurveyErrorActivity kcbSurveyErrorActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(kcbSurveyErrorActivity, view);
        int i4 = getInterfaceDescriptor + 117;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return unitOnNavigationEvent;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [android.app.Activity, im.toss.base.BaseActivity, im.toss.feature.credit.ui.kcbsurvey.KcbSurveyErrorActivity, java.lang.Object] */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i8 | i6)) | i7;
        int i10 = (~(i7 | (~i6) | i2)) | (~(i8 | i7 | i6));
        int i11 = (~(i6 | i2)) | (~(i3 | i2));
        int i12 = i3 + i2 + i + ((-1520811122) * i5) + (1880343047 * i4);
        int i13 = i12 * i12;
        int i14 = ((i3 * (-660833811)) - 1995073173) + (i2 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + ((-660833671) * i) + (644061726 * i5) + ((-2012083377) * i4) + (i13 * (-1027145728));
        int i15 = (((-88056299) * i3) - 1254686720) + (875799021 * i2) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i) + ((-206831616) * i5) + (408289280 * i4) + ((-683737088) * i13) + (i14 * i14 * 814809088);
        if (i15 != 1) {
            return i15 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
        }
        ?? r0 = (KcbSurveyErrorActivity) objArr[0];
        int i16 = 2 % 2;
        if (!rvInitOpt.onExtraCallbackWithResult.onExtraCallback((String) onExtraCallbackWithResult(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1358790, -1358788, new Object[]{r0}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback()))) {
            int i17 = getInterfaceDescriptor + 87;
            access100 = i17 % 128;
            int i18 = i17 % 2;
            SessionTrackerb.IAuthTabCallback(r0.ICustomTabsService_Parcel(), (Activity) r0, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback, false, (String) onExtraCallbackWithResult(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1358790, -1358788, new Object[]{r0}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback()), false, null, 13, null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        r0.finish();
        int i19 = getInterfaceDescriptor + 13;
        access100 = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static /* synthetic */ String onNavigationEvent(KcbSurveyErrorActivity kcbSurveyErrorActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(kcbSurveyErrorActivity);
        int i4 = access100 + 91;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return strIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(KcbSurveyErrorActivity kcbSurveyErrorActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(kcbSurveyErrorActivity, onwarmupcompleted);
        int i4 = getInterfaceDescriptor + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ IAuthTabCallback onWarmupCompleted(KcbSurveyErrorActivity kcbSurveyErrorActivity) {
        int i = 2 % 2;
        int i2 = access100 + 119;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallbackOnExtraCallback = onExtraCallback(kcbSurveyErrorActivity);
        int i4 = getInterfaceDescriptor + 81;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallbackOnExtraCallback;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 43;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i3 = getInterfaceDescriptor + 75;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = access100 + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = getInterfaceDescriptor + 109;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return strICustomTabsServiceStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = access100 + 7;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = access100 + 115;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = access100 + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = getInterfaceDescriptor + 37;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return viewAq_;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = access100 + 9;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = access100 + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = access100 + 95;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return findresandmsgAs_;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = access100 + 125;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return screenId;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = access100 + 99;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = access100 + 57;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = access100 + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 25;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = access100 + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 59;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = getInterfaceDescriptor + 67;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        int i4 = access100 + 89;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashICustomTabsServiceStub;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.validateRelationship();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i3 = access100 + 23;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = access100 + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackStub.getValue();
        int i4 = access100 + 43;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrash;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(KcbSurveyErrorActivity kcbSurveyErrorActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        String lowerCase;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a(new char[]{49522, 20458, 24087, 49408, 25349, 43032, 37215, 54693, 24412, 51819, 13304, 13910}, 1 - Drawable.resolveOpacity(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        onwarmupcompleted.onExtraCallback(strIntern, (String) onExtraCallbackWithResult(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1358790, -1358788, new Object[]{kcbSurveyErrorActivity}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback));
        IAuthTabCallback iAuthTabCallbackIPostMessageServiceDefault = kcbSurveyErrorActivity.IPostMessageServiceDefault();
        if (iAuthTabCallbackIPostMessageServiceDefault != null) {
            int i2 = getInterfaceDescriptor + 47;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            String strName = iAuthTabCallbackIPostMessageServiceDefault.name();
            if (strName != null) {
                lowerCase = strName.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            } else {
                int i4 = getInterfaceDescriptor + 53;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                lowerCase = null;
            }
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{11904, 8576, 15997, 12018, 24231, 50802, 61728, 59415, 45232, 41991}, -TextUtils.indexOf((CharSequence) "", '0'), objArr2);
        onwarmupcompleted.onExtraCallback(((String) objArr2[0]).intern(), lowerCase);
        return Unit.INSTANCE;
    }

    public final SessionTrackerb ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 69;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i4 = i2 + 91;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = getInterfaceDescriptor + 87;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        KcbSurveyErrorActivity kcbSurveyErrorActivity = (KcbSurveyErrorActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        String str = (String) kcbSurveyErrorActivity.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 37;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallback(KcbSurveyErrorActivity kcbSurveyErrorActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        h5ScreenShotObserverOnChangeOpt.onExtraCallback onextracallback = h5ScreenShotObserverOnChangeOpt.Companion;
        Intent intent = kcbSurveyErrorActivity.getIntent();
        if (i3 != 0) {
            return onextracallback.onNavigationEvent(intent);
        }
        onextracallback.onNavigationEvent(intent);
        throw null;
    }

    private final IAuthTabCallback IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) this.onTransact.getValue();
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return iAuthTabCallback;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyErrorActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(onSessionEnded());
        if (IPostMessageServiceDefault() == null) {
            int i2 = getInterfaceDescriptor + 55;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            finish();
            int i4 = access100 + 55;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = getInterfaceDescriptor + 97;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asInterface ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 55;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 79;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asInterface)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (Process.myTid() >> 22)), TextUtils.lastIndexOf("", '0') + 85, View.combineMeasuredStates(0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 19 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 8808 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = im.toss.feature.credit.ui.kcbsurvey.KcbSurveyErrorActivity.onNavigationEvent.onNavigationEvent + 57;
            im.toss.feature.credit.ui.kcbsurvey.KcbSurveyErrorActivity.onNavigationEvent.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 40 / 0;
            }
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onWarmupCompleted(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            Object obj = null;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                int i2 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i3 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(KcbSurveyErrorActivity kcbSurveyErrorActivity, View view) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        IAuthTabCallback iAuthTabCallbackIPostMessageServiceDefault = kcbSurveyErrorActivity.IPostMessageServiceDefault();
        if (iAuthTabCallbackIPostMessageServiceDefault == null) {
            int i3 = access100 + 1;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            i = -1;
        } else {
            i = onExtraCallbackWithResult.onExtraCallback[iAuthTabCallbackIPostMessageServiceDefault.ordinal()];
            int i5 = access100 + 69;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
        }
        if (i == -1) {
            kcbSurveyErrorActivity.finish();
        } else if (i != 1) {
            int i7 = access100 + 75;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 != 0 ? i == 2 : i == 4) {
                onExtraCallbackWithResult(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -1935829344, 1935829345, new Object[]{kcbSurveyErrorActivity}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
            } else {
                if (i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                kcbSurveyErrorActivity.IPostMessageServiceStubProxy();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final List<String> IPostMessageServiceStub() throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        IAuthTabCallback iAuthTabCallbackIPostMessageServiceDefault = IPostMessageServiceDefault();
        if (iAuthTabCallbackIPostMessageServiceDefault == null) {
            int i3 = getInterfaceDescriptor + 123;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            i = -1;
        } else {
            i = onExtraCallbackWithResult.onExtraCallback[iAuthTabCallbackIPostMessageServiceDefault.ordinal()];
        }
        if (i == -1) {
            return CollectionsKt.emptyList();
        }
        int i5 = getInterfaceDescriptor + 27;
        int i6 = i5 % 128;
        access100 = i6;
        if (i5 % 2 == 0 ? i == 1 : i == 0) {
            return CollectionsKt.listOf(getString(R.string.credit_kcb_survey_error_denied));
        }
        if (i == 2) {
            return CollectionsKt.listOf(getString(R.string.credit_kcb_survey_error_etc));
        }
        int i7 = i6 + 51;
        int i8 = i7 % 128;
        getInterfaceDescriptor = i8;
        if (i7 % 2 != 0 ? i == 3 : i == 5) {
            List<String> listListOf = CollectionsKt.listOf(new String[]{getString(R.string.credit_kcb_survey_error_timeout_1), getString(R.string.credit_kcb_survey_error_timeout_2)});
            int i9 = getInterfaceDescriptor + 83;
            access100 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 86 / 0;
            }
            return listListOf;
        }
        if (i == 4) {
            return CollectionsKt.listOf(new String[]{getString(R.string.credit_kcb_survey_error_already_completed_1), getString(R.string.credit_kcb_survey_error_already_completed_2)});
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        int i11 = i8 + 121;
        access100 = i11 % 128;
        if (i11 % 2 == 0) {
            return CollectionsKt.listOf(new String[]{getString(R.string.credit_kcb_survey_error_expired_1), getString(R.string.credit_kcb_survey_error_expired_2)});
        }
        String string = getString(R.string.credit_kcb_survey_error_expired_1);
        String string2 = getString(R.string.credit_kcb_survey_error_expired_2);
        String[] strArr = new String[2];
        strArr[1] = string;
        strArr[1] = string2;
        return CollectionsKt.listOf(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String IEngagementSignalsCallbackDefault() {
        int i;
        String string;
        int i2 = 2 % 2;
        IAuthTabCallback iAuthTabCallbackIPostMessageServiceDefault = IPostMessageServiceDefault();
        if (iAuthTabCallbackIPostMessageServiceDefault == null) {
            int i3 = getInterfaceDescriptor + 71;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            i = -1;
        } else {
            i = onExtraCallbackWithResult.onExtraCallback[iAuthTabCallbackIPostMessageServiceDefault.ordinal()];
        }
        if (i != 1) {
            int i4 = getInterfaceDescriptor + 49;
            int i5 = i4 % 128;
            access100 = i5;
            int i6 = i4 % 2;
            if (i != 2) {
                int i7 = i5 + 105;
                int i8 = i7 % 128;
                getInterfaceDescriptor = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 121;
                access100 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 / 3;
                }
                string = "";
            } else {
                string = getString(R.string.credit_kcb_survey_error_etc_description);
            }
        } else {
            string = getString(R.string.credit_kcb_survey_error_denied_description);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        IAuthTabCallback iAuthTabCallbackIPostMessageServiceDefault = ((KcbSurveyErrorActivity) objArr[0]).IPostMessageServiceDefault();
        if (iAuthTabCallbackIPostMessageServiceDefault == null) {
            int i3 = getInterfaceDescriptor + 111;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 18 / 0;
            }
            i = -1;
        } else {
            i = onExtraCallbackWithResult.onExtraCallback[iAuthTabCallbackIPostMessageServiceDefault.ordinal()];
        }
        if (i == -1) {
            return "";
        }
        int i5 = getInterfaceDescriptor;
        int i6 = i5 + 107;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        if (i == 1 || i == 2) {
            Object[] objArr2 = new Object[1];
            a(new char[]{34929, 45301, 47569, 34841, 59592, 22294, 30347, 24189, 5726, 13628, 54388, 48582, 46266, 38094, 45654, 7105, 21260, 29245, 5053, 31077, 61806, 53633, 61756, 55507, 40916, 20475, 24324, 9834, 15933, 11623, 15586, 33864, 56474, 35972, 39434, 58354, 31422, 27383, 31725, 16731, 6412, 51222, 55702, 41130, 42880, 42920, 18292, 3833, 17888, 1360, 9347, 27679, 58438}, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            int i8 = getInterfaceDescriptor + 67;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            return strIntern;
        }
        if (i != 3) {
            int i10 = i5 + 97;
            access100 = i10 % 128;
            if (i10 % 2 == 0 ? i == 4 : i == 2) {
                Object[] objArr3 = new Object[1];
                a(new char[]{20794, 1515, 34836, 20818, 55219, 57864, 18254, 24838, 53013, 32802, 58801, 33469, 28145, 8656, 33683, 9402, 35399, 50979, 8824, 17950, 10277, 25759, 49401, 59304, 18079, 64229, 28353, 6417, 59254, 39033, 3367, 47923, 1489, 14746, 43983, 56457, 41973, 57321, 18987, 32336, 49202, 32123, 59467, 40863, 32451, 4788, 30396, 12681, 40160, 45072, 5464, 21357}, 1 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                int i11 = access100 + 103;
                getInterfaceDescriptor = i11 % 128;
                if (i11 % 2 != 0) {
                    return strIntern2;
                }
                throw null;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Object[] objArr4 = new Object[1];
        a(new char[]{14619, 2694, 19312, 14707, 61439, 60773, 33834, 22858, 42804, 36687, 9941, 47857, 1488, 11965, 16631, 7414, 57958, 51278, 57628, 32338, 16388, 27634, 925, 57316, 11966, 62856, 44453, 8541, 36695, 38678, 52851, 33568, 28076, 14043, 26865, 58523, 52108, 53392, 35084, 17972, 43086, 29243, 11133, 42960, 5875, 7623, 46545}, 1 - ((Process.getThreadPriority(0) + 20) >> 6), objArr4);
        return ((String) objArr4[0]).intern();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String IEngagementSignalsCallbackStub() throws NoWhenBranchMatchedException {
        String string;
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallbackIPostMessageServiceDefault = IPostMessageServiceDefault();
        int i2 = iAuthTabCallbackIPostMessageServiceDefault == null ? -1 : onExtraCallbackWithResult.onExtraCallback[iAuthTabCallbackIPostMessageServiceDefault.ordinal()];
        if (i2 != -1) {
            int i3 = getInterfaceDescriptor + 5;
            access100 = i3 % 128;
            if (i3 % 2 == 0 ? i2 == 1 : i2 == 0) {
                string = getString(im.toss.uikit.R.string.uikit_confirm);
            } else if (i2 != 2) {
                if (i2 == 3 || i2 == 4) {
                    string = getString(viva.republica.toss.R.string.next);
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = getString(im.toss.uikit.R.string.uikit_confirm);
                }
            }
        } else {
            string = "";
        }
        Intrinsics.checkNotNull(string);
        int i4 = access100 + 65;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IPostMessageServiceStubProxy() throws Throwable {
        String str;
        int i = 2 % 2;
        KcbSurveyNotificationTermActivity.onExtraCallback onextracallback = KcbSurveyNotificationTermActivity.Companion;
        String str2 = (String) onExtraCallbackWithResult(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1358790, -1358788, new Object[]{this}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
        IAuthTabCallback iAuthTabCallbackIPostMessageServiceDefault = IPostMessageServiceDefault();
        Object obj = null;
        if (iAuthTabCallbackIPostMessageServiceDefault != null) {
            int i2 = getInterfaceDescriptor + 69;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                iAuthTabCallbackIPostMessageServiceDefault.name();
                obj.hashCode();
                throw null;
            }
            String strName = iAuthTabCallbackIPostMessageServiceDefault.name();
            if (strName != null) {
                String lowerCase = strName.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                str = lowerCase == null ? "" : lowerCase;
            }
        }
        startActivity(KcbSurveyNotificationTermActivity.onExtraCallback.onWarmupCompleted(onextracallback, this, str2, str, false, 8, null));
        finish();
        int i3 = getInterfaceDescriptor + 17;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        public static final IAuthTabCallback ALREADY_COMPLETED;
        public static final IAuthTabCallback DENIED;
        public static final IAuthTabCallback ETC;
        public static final IAuthTabCallback EXPIRED;
        private static int IAuthTabCallback = 0;
        public static final IAuthTabCallback TIME_OUT;
        private static int onExtraCallback = 0;
        private static char[] onExtraCallbackWithResult = null;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {TIME_OUT, EXPIRED, DENIED, ETC, ALREADY_COMPLETED};
            int i5 = i3 + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 79;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 6 / 0;
            }
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onWarmupCompleted + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                int i3 = 16 / 0;
            } else {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            }
            int i4 = IAuthTabCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            onNavigationEvent();
            TIME_OUT = new IAuthTabCallback("TIME_OUT", 0);
            EXPIRED = new IAuthTabCallback("EXPIRED", 1);
            Object[] objArr = new Object[1];
            a(new int[]{0, 6, 0, 5}, false, new byte[]{1, 1, 1, 0, 1, 0}, objArr);
            DENIED = new IAuthTabCallback(((String) objArr[0]).intern(), 2);
            ETC = new IAuthTabCallback("ETC", 3);
            ALREADY_COMPLETED = new IAuthTabCallback("ALREADY_COMPLETED", 4);
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onNavigationEvent + 119;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onExtraCallbackWithResult;
            long j = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - ExpandableListView.getPackedPositionGroup(j)), 35 - ExpandableListView.getPackedPositionType(j), 14239 - Color.green(0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i7 = $11 + 81;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10934), (ViewConfiguration.getWindowTouchSlop() >> 8) + 65, (Process.myPid() >> 22) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 17657 - Color.alpha(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 70 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i11 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i11, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i11);
            }
            if (z) {
                int i12 = $11 + 119;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        static void onNavigationEvent() {
            onExtraCallbackWithResult = new char[]{27244, 27143, 27141, 27145, 27146, 27146};
        }
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static char[] onNavigationEvent = {27171, 27293, 27293, 27284, 27293, 27267, 27267, 27293};

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull IAuthTabCallback iAuthTabCallback) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intent intent = new Intent(context, (Class<?>) KcbSurveyErrorActivity.class);
            Object[] objArr = new Object[1];
            a(new int[]{0, 8, 104, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str).putExtra("kcbSurveyErrorType", iAuthTabCallback);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 80 / 0;
            }
            return intentPutExtra;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = onNavigationEvent;
            long j = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 35283), 34 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 14239 - (Process.myPid() >> 22), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        j = 0;
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
                        int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10935), ExpandableListView.getPackedPositionType(0L) + 65, 16718 - (ViewConfiguration.getScrollBarSize() >> 8), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), View.resolveSize(0, 0) + 29, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 49468), (ViewConfiguration.getTouchSlop() >> 8) + 70, Color.rgb(0, 0, 0) + 16789702, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                int i10 = $10 + 49;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i12 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i12, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i12);
            }
            if (z) {
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i13 = $11 + 83;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] * iArr[5]);
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent >>> 1;
                    } else {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View onSessionEnded() throws Throwable {
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
            int i2 = getInterfaceDescriptor + 111;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onNavigationEvent(true);
            Unit unit = Unit.INSTANCE;
        }
        IPostMessageServiceStubProxy supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.IAuthTabCallbackStub(false);
            Unit unit2 = Unit.INSTANCE;
            int i4 = access100 + 55;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        LinearLayout linearLayout2 = new LinearLayout(context3);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        layoutParams3.width = -1;
        layoutParams3.height = 0;
        layoutParams3.weight = 1.0f;
        linearLayout2.setLayoutParams(layoutParams2);
        Context context4 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsImageView tdsImageView = new TdsImageView(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams4 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
        DisplayMetrics displayMetrics = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        layoutParams5.width = varyMatches.onNavigationEvent(100, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        layoutParams5.height = varyMatches.onNavigationEvent(100, displayMetrics2);
        layoutParams5.gravity = 1;
        tdsImageView.setLayoutParams(layoutParams4);
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        TdsImageView.setImage$default(tdsImageView, (String) onExtraCallbackWithResult(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -859726806, 859726806, new Object[]{this}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsImageView);
        Context context5 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        AnimateText animateText = new AnimateText(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        animateText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        DisplayMetrics displayMetrics3 = animateText.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics3);
        DisplayMetrics displayMetrics4 = animateText.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(16, displayMetrics4);
        DisplayMetrics displayMetrics5 = animateText.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(animateText, iOnNavigationEvent, iOnNavigationEvent2, varyMatches.onNavigationEvent(24, displayMetrics5), 0);
        animateText.setSubTypography(5);
        animateText.setFont(response.Bold);
        Context context6 = animateText.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        Configuration configuration = context6.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        animateText.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).onRelationshipValidationResult());
        List<String> listIPostMessageServiceStub = IPostMessageServiceStub();
        readTimeout.asInterface.onExtraCallback onextracallback = readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult;
        AnimateText.onNavigationEvent onnavigationevent = AnimateText.onNavigationEvent.CENTER;
        Object[] objArr = new Object[1];
        a(new char[]{12605, 17587, 8469, 12556, 44748}, 1 - View.combineMeasuredStates(0, 0), objArr);
        AnimateText.onWarmupCompleted(animateText, listIPostMessageServiceStub, onextracallback, 300, 0, ((String) objArr[0]).intern(), onnavigationevent, false, (Function0) null, (Function0) null, (Function0) null, 0, (Integer) null, 4040, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, animateText);
        BaseTextView baseTextView = (BaseTextView) Typography6.class.getDeclaredConstructor(Context.class).newInstance(linearLayout2.getContext());
        Intrinsics.checkNotNull(baseTextView);
        DisplayMetrics displayMetrics6 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(baseTextView, varyMatches.onNavigationEvent(16, displayMetrics6));
        baseTextView.setText(IEngagementSignalsCallbackDefault());
        baseTextView.setGravity(1);
        Context context7 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        Configuration configuration2 = context7.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        baseTextView.setTextColor(new getUrlokhttp(new onWarmupCompleted(configuration2)).onPostMessage());
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, linearLayout2);
        Context context8 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context8);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, IEngagementSignalsCallbackStub(), new KcbSurveyErrorActivity$.ExternalSyntheticLambda3(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        return linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.app.Activity, im.toss.feature.credit.ui.kcbsurvey.KcbSurveyErrorActivity] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r5v64, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object[]] */
    private static final IAuthTabCallback onExtraCallback(KcbSurveyErrorActivity kcbSurveyErrorActivity) {
        Bundle extras;
        ?? string;
        int i;
        Object next;
        int i2 = 2 % 2;
        Intent intent = kcbSurveyErrorActivity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("kcbSurveyErrorType")) {
            return null;
        }
        if (!zzbq.onNavigationEvent(intent)) {
            Bundle extras2 = intent.getExtras();
            Object obj = extras2 != null ? extras2.get("kcbSurveyErrorType") : null;
            return (IAuthTabCallback) (obj instanceof IAuthTabCallback ? obj : null);
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 == null || (string = extras3.getString("kcbSurveyErrorType")) == 0) {
            return null;
        }
        if (Intrinsics.areEqual(IAuthTabCallback.class, Integer.class)) {
            int i3 = access100 + 107;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                i = 53;
                string = StringsKt.toIntOrNull((String) string);
                int i4 = i / 0;
            } else {
                string = StringsKt.toIntOrNull((String) string);
            }
        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Long.class)) {
            string = StringsKt.toLongOrNull((String) string);
        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Float.class)) {
            string = StringsKt.toFloatOrNull((String) string);
        } else if (!(!Intrinsics.areEqual(IAuthTabCallback.class, Double.class))) {
            int i5 = access100 + 59;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                i = 73;
                string = StringsKt.toDoubleOrNull((String) string);
                int i42 = i / 0;
            } else {
                string = StringsKt.toDoubleOrNull((String) string);
            }
        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Short.class)) {
            string = StringsKt.toShortOrNull((String) string);
        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Byte.class)) {
            string = StringsKt.toByteOrNull((String) string);
        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Boolean.class)) {
            string = Boolean.valueOf(Boolean.parseBoolean(string));
        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Character.class)) {
            string = Character.valueOf(string.charAt(0));
        } else if (!Intrinsics.areEqual(IAuthTabCallback.class, String.class)) {
            if (Intrinsics.areEqual(IAuthTabCallback.class, Integer[].class)) {
                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listSplit$default) {
                    if (((String) obj2).length() > 0) {
                        int i6 = access100 + 35;
                        getInterfaceDescriptor = i6 % 128;
                        int i7 = i6 % 2;
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                }
                string = arrayList2.toArray(new Integer[0]);
            } else if (Intrinsics.areEqual(IAuthTabCallback.class, Long[].class)) {
                List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listSplit$default2) {
                    if (((String) obj3).length() > 0) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                }
                string = arrayList4.toArray(new Long[0]);
            } else if (Intrinsics.areEqual(IAuthTabCallback.class, Float[].class)) {
                List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : listSplit$default3) {
                    if (((String) obj4).length() > 0) {
                        arrayList5.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                }
                string = arrayList6.toArray(new Float[0]);
            } else if (Intrinsics.areEqual(IAuthTabCallback.class, Double[].class)) {
                List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : listSplit$default4) {
                    if (((String) obj5).length() > 0) {
                        arrayList7.add(obj5);
                    }
                }
                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                }
                string = arrayList8.toArray(new Double[0]);
            } else if (Intrinsics.areEqual(IAuthTabCallback.class, Short[].class)) {
                List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList9 = new ArrayList();
                for (Object obj6 : listSplit$default5) {
                    if (((String) obj6).length() > 0) {
                        arrayList9.add(obj6);
                    }
                }
                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                Iterator it5 = arrayList9.iterator();
                while (it5.hasNext()) {
                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                }
                string = arrayList10.toArray(new Short[0]);
            } else if (Intrinsics.areEqual(IAuthTabCallback.class, Byte[].class)) {
                List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList11 = new ArrayList();
                for (Object obj7 : listSplit$default6) {
                    int i8 = getInterfaceDescriptor + 15;
                    access100 = i8 % 128;
                    int i9 = i8 % 2;
                    if (((String) obj7).length() > 0) {
                        arrayList11.add(obj7);
                    }
                }
                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                Iterator it6 = arrayList11.iterator();
                while (it6.hasNext()) {
                    int i10 = access100 + 111;
                    getInterfaceDescriptor = i10 % 128;
                    if (i10 % 2 == 0) {
                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                        throw null;
                    }
                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                }
                string = arrayList12.toArray(new Byte[0]);
            } else if (Intrinsics.areEqual(IAuthTabCallback.class, Boolean[].class)) {
                List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList13 = new ArrayList();
                int i11 = getInterfaceDescriptor + 125;
                access100 = i11 % 128;
                int i12 = i11 % 2;
                for (Object obj8 : listSplit$default7) {
                    if (((String) obj8).length() > 0) {
                        arrayList13.add(obj8);
                    }
                }
                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                Iterator it7 = arrayList13.iterator();
                while (it7.hasNext()) {
                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                }
                string = arrayList14.toArray(new Boolean[0]);
            } else if (Intrinsics.areEqual(IAuthTabCallback.class, Character[].class)) {
                List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList15 = new ArrayList();
                for (Object obj9 : listSplit$default8) {
                    if (((String) obj9).length() > 0) {
                        arrayList15.add(obj9);
                    }
                }
                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                Iterator it8 = arrayList15.iterator();
                while (it8.hasNext()) {
                    int i13 = getInterfaceDescriptor + 69;
                    access100 = i13 % 128;
                    arrayList16.add(Character.valueOf(i13 % 2 != 0 ? StringsKt.trim((String) it8.next()).toString().charAt(1) : StringsKt.trim((String) it8.next()).toString().charAt(0)));
                }
                string = arrayList16.toArray(new Character[0]);
            } else if (Intrinsics.areEqual(IAuthTabCallback.class, String[].class)) {
                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList17 = new ArrayList();
                for (Object obj10 : listSplit$default9) {
                    if (((String) obj10).length() > 0) {
                        int i14 = getInterfaceDescriptor + 11;
                        access100 = i14 % 128;
                        if (i14 % 2 != 0) {
                            arrayList17.add(obj10);
                            obj.hashCode();
                            throw null;
                        }
                        arrayList17.add(obj10);
                    }
                }
                string = arrayList17.toArray(new String[0]);
            } else {
                Object[] enumConstants = IAuthTabCallback.class.getEnumConstants();
                if (enumConstants != null) {
                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                    for (Object obj11 : enumConstants) {
                        Intrinsics.checkNotNull(obj11, "");
                        arrayList18.add((Enum) obj11);
                    }
                    Iterator it9 = arrayList18.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next = null;
                            break;
                        }
                        int i15 = access100 + 107;
                        getInterfaceDescriptor = i15 % 128;
                        int i16 = i15 % 2;
                        next = it9.next();
                        if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                            break;
                        }
                    }
                    string = (Enum) next;
                } else {
                    string = 0;
                }
                if (string == 0) {
                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                        throw new IllegalArgumentException(IAuthTabCallback.class.getSimpleName() + " is not supported");
                    }
                    string = 0;
                }
            }
        }
        if (string instanceof IAuthTabCallback) {
            obj = string;
        } else {
            int i17 = getInterfaceDescriptor + 117;
            access100 = i17 % 128;
            int i18 = i17 % 2;
        }
        return (IAuthTabCallback) obj;
    }

    private final String IEngagementSignalsCallbackStubProxy() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (String) onExtraCallbackWithResult(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -859726806, 859726806, new Object[]{this}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback);
    }

    private final String IEngagementSignalsCallback_Parcel() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (String) onExtraCallbackWithResult(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1358790, -1358788, new Object[]{this}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback);
    }

    private final void IPostMessageService() throws Throwable {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        onExtraCallbackWithResult(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -1935829344, 1935829345, new Object[]{this}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback);
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyErrorActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyErrorActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = getInterfaceDescriptor + 59;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyErrorActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access100 + 45;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyErrorActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 1;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onVerticalScrollEvent() {
        asInterface = -1432136362999833445L;
    }
}
