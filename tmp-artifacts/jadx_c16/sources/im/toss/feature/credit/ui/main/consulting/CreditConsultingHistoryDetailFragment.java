package im.toss.feature.credit.ui.main.consulting;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import im.toss.feature.credit.ui.main.R;
import im.toss.feature.credit.ui.main.consulting.CreditConsultingHistoryDetailFragment$;
import im.toss.features.credit.data.response.CreditConsultingHistory;
import im.toss.features.credit.data.response.CreditConsultingReservationResponse;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access13800;
import o.enableReportDataOptimize;
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
import o.minWebSocketMessageToCompress;
import o.readIntokhttp;
import o.setBaseDeeplink;
import o.setCurrentIndex;
import o.setProxySelectorokhttp;
import o.setRubIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditConsultingHistoryDetailFragment extends Hilt_CreditConsultingHistoryDetailFragment implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static long onWarmupCompleted = -5542136591595297457L;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy onNavigationEvent = isStopUpload.onExtraCallback(this, 1310673, (Function1) null, new CreditConsultingHistoryDetailFragment$.ExternalSyntheticLambda3(this), 2, (Object) null);
    private final Lazy onExtraCallbackWithResult = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CreditConsultingViewModel.class), new asInterface(this), new onTransact(null, this), new IAuthTabCallbackStub(this));

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i2;
        int i8 = ~(i7 | i | i5);
        int i9 = (~((~i5) | i)) | (~(i | i2));
        int i10 = i + i2 + i6 + (32217706 * i4) + (238734613 * i3);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i) - 528416768) + (677943110 * i2) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i6) + ((-154927104) * i4) + ((-131989504) * i3) + ((-1876361216) * i11);
        int i13 = ((i * 1127137324) - 440746823) + (i2 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i6 * 1127136485) + (i4 * 976419026) + (i3 * 1106960329) + (i11 * 279773184);
        if (i12 + (i13 * i13 * (-1943076864)) == 1) {
            return onWarmupCompleted(objArr);
        }
        CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment = (CreditConsultingHistoryDetailFragment) objArr[0];
        initMiniApp.onWarmupCompleted onwarmupcompleted = (initMiniApp.onWarmupCompleted) objArr[1];
        int i14 = 2 % 2;
        int i15 = onExtraCallback + 99;
        IAuthTabCallback = i15 % 128;
        int i16 = i15 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditConsultingHistoryDetailFragment, onwarmupcompleted);
        int i17 = onExtraCallback + 37;
        IAuthTabCallback = i17 % 128;
        int i18 = i17 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(creditConsultingHistoryDetailFragment, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(creditConsultingHistoryDetailFragment, view);
        int i3 = IAuthTabCallback + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(-633791517, 633791518, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{creditConsultingHistoryDetailFragment, tdsListHeaderV3View});
        int i4 = onExtraCallback + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment, TdsListRowV1View tdsListRowV1View, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditConsultingHistoryDetailFragment, tdsListRowV1View, view);
        int i4 = onExtraCallback + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static final /* synthetic */ CreditConsultingViewModel onExtraCallbackWithResult(CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditConsultingViewModel creditConsultingViewModelIAuthTabCallbackStub = creditConsultingHistoryDetailFragment.IAuthTabCallbackStub();
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = IAuthTabCallback + 63;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return creditConsultingViewModelIAuthTabCallbackStub;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        }
        super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = onExtraCallback + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return strICustomTabsServiceStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = onExtraCallback + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.access200();
        }
        super/*o.openJavaCrashMonitor*/.access200();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = onExtraCallback + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return mapAr_;
        }
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.as_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i3 = IAuthTabCallback + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getScreenId();
        }
        super.getScreenId();
        throw null;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getScreenParams();
        }
        super.getScreenParams();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = IAuthTabCallback + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        int i5 = onExtraCallback + 73;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i3 = IAuthTabCallback + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashOnExtraCallbackWithResult;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.validateRelationship();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i3 = IAuthTabCallback + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = onExtraCallback + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public hasCrashWhenJavaCrash onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.onNavigationEvent.getValue();
        int i4 = IAuthTabCallback + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return hascrashwhenjavacrash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        FragmentActivity activity = creditConsultingHistoryDetailFragment.getActivity();
        if (activity != null) {
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{8202, 27636, 47052, 50086, 4014, 23431, 59243, 13141}, KeyEvent.keyCodeFromString("") + 19433, objArr);
            onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(activity.getIntent()));
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 47;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final CreditConsultingViewModel IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) this.onExtraCallbackWithResult.getValue();
        int i4 = IAuthTabCallback + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return creditConsultingViewModel;
    }

    public final SessionTrackerb onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment = (CreditConsultingHistoryDetailFragment) objArr[0];
        TdsListHeaderV3View tdsListHeaderV3View = (TdsListHeaderV3View) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsListHeaderV3View, "");
        TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.PARAGRAPH, (String) null, (Function0) null, 6, (Object) null);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.LARGE);
        tdsListHeaderV3View.setTitleText(creditConsultingHistoryDetailFragment.getString(R.string.credit_consulting_history_detail));
        Context context = tdsListHeaderV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onRelationshipValidationResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onExtraCallback + 107;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 == 0) {
                    int i5 = 95 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.IAuthTabCallback))) {
                int i2 = onExtraCallback + 87;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onWarmupCompleted + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                obj.hashCode();
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i3 = onNavigationEvent + 33;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.IAuthTabCallback))) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 39;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i5 = $11 + 81;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') - 24, Color.red(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSize(0, 0) + 59, TextUtils.indexOf((CharSequence) "", '0') + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
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
            int i8 = $11 + 41;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (Process.myPid() >> 22) + 59, (ViewConfiguration.getJumpTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 58 - ((byte) KeyEvent.getModifierMetaStateMask()), 6383 - ExpandableListView.getPackedPositionGroup(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onWarmupCompleted(CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment, TdsListRowV1View tdsListRowV1View, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        SessionTrackerb sessionTrackerbOnWarmupCompleted = creditConsultingHistoryDetailFragment.onWarmupCompleted();
        Context context = tdsListRowV1View.getContext();
        Object[] objArr = new Object[1];
        a(new char[]{8203, 43148, 12584, 47549, 597, 35534, 4987, 39931, 25759, 60690, 30113, 65145, 18075, 53002, 22498, 8296, 43291, 12714, 47719, 733, 35657, 5112, 40042, 25936, 60813, 30270, 65196, 18262, 53213, 22584, 8434, 43422, 12840, 47846, 859, 35801, 5224, 40164, 26013, 60931, 30389, 65406, 18370, 53324, 22759, 8561, 43583, 12931, 47989, 907, 35865, 5292, 40254, 26190, 61128, 30509, 65445, 18519, 53447, 22881, 8694, 43664, 13076, 48106, 1115, 36059, 5503, 40431, 26261, 61209}, Color.blue(0) + 34961, objArr);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnWarmupCompleted, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment, View view) {
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager;
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            creditConsultingHistoryDetailFragment.getActivity();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = creditConsultingHistoryDetailFragment.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.extraCommand();
            int i3 = IAuthTabCallback + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        setBaseDeeplink.onNavigationEvent(this, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, new asBinder(this, (access13800) null), 1, (Object) null);
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            int i4 = onWarmupCompleted + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return defaultViewModelProviderFactory;
        }
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = 20 / 0;
            } else {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            }
            int i4 = onNavigationEvent + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getViewModelStore(), "");
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class onTransact extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            if (r0 != null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            if (r0 != null) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i4 = i3 + 7;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (i5 != 0) {
                    int i6 = 32 / 0;
                }
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        CreditConsultingHistory creditConsultingHistoryOnExtraCallback = IAuthTabCallbackStub().onTransact().onExtraCallback();
        if (creditConsultingHistoryOnExtraCallback == null) {
            CreditConsultingReservationResponse creditConsultingReservationResponseIAuthTabCallbackStubProxy = IAuthTabCallbackStub().onTransact().IAuthTabCallbackStubProxy();
            creditConsultingHistoryOnExtraCallback = creditConsultingReservationResponseIAuthTabCallbackStubProxy != null ? creditConsultingReservationResponseIAuthTabCallbackStubProxy.onNavigationEvent() : null;
        }
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Context context2 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        minWebSocketMessageToCompress.onNavigationEvent(linearLayout, new CreditConsultingHistoryDetailFragment$.ExternalSyntheticLambda0(this));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context3, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = TdsListRowV1View.onExtraCallbackWithResult.ROW1A;
        tdsListRowV1View.setCenterType(onextracallbackwithresult);
        tdsListRowV1View.setCenterText1(getString(R.string.credit_consulting_confirm_category));
        TdsListRowV1View.asBinder asbinder = TdsListRowV1View.asBinder.ROW1E;
        tdsListRowV1View.setRightType(asbinder);
        tdsListRowV1View.setRightText1(creditConsultingHistoryOnExtraCallback != null ? creditConsultingHistoryOnExtraCallback.onNavigationEvent() : null);
        Context context4 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setRightText1Color(new getUrlokhttp(new onNavigationEvent(configuration)).ICustomTabsCallbackStubProxy());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsListRowV1View tdsListRowV1View2 = new TdsListRowV1View(context5, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View2.setCenterType(onextracallbackwithresult);
        tdsListRowV1View2.setCenterText1(getString(R.string.credit_consulting_confirm_date));
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW2A);
        tdsListRowV1View2.setRightText1(IAuthTabCallbackStub().onTransact().onExtraCallbackWithResult());
        tdsListRowV1View2.setRightText2((String) enableReportDataOptimize.onWarmupCompleted(new Object[]{IAuthTabCallbackStub().onTransact()}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1819829352, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1819829350));
        Context context6 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        Configuration configuration2 = context6.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View2.setRightText1Color(new getUrlokhttp(new onExtraCallback(configuration2)).ICustomTabsCallbackStubProxy());
        Context context7 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        Configuration configuration3 = context7.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        tdsListRowV1View2.setRightText2Color(new getUrlokhttp(new onWarmupCompleted(configuration3)).onPostMessage());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View2);
        Context context8 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        TdsListRowV1View tdsListRowV1View3 = new TdsListRowV1View(context8, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View3.setCenterType(onextracallbackwithresult);
        tdsListRowV1View3.setCenterText1(getString(R.string.credit_consulting_confirm_organization));
        tdsListRowV1View3.setRightType(asbinder);
        if (creditConsultingHistoryOnExtraCallback != null) {
            int i2 = onExtraCallback + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            strIAuthTabCallback = creditConsultingHistoryOnExtraCallback.IAuthTabCallback();
        } else {
            strIAuthTabCallback = null;
        }
        tdsListRowV1View3.setRightText1(strIAuthTabCallback);
        Context context9 = tdsListRowV1View3.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        Configuration configuration4 = context9.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        tdsListRowV1View3.setRightText1Color(new getUrlokhttp(new IAuthTabCallback(configuration4)).ICustomTabsCallbackStubProxy());
        if (IAuthTabCallbackStub().onTransact().onTransact()) {
            tdsListRowV1View3.setRightArrow(true);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View3);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsScrollView);
        Context context10 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context10);
        tdsBottomCtaV1View.setGravity(80);
        String string = getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new CreditConsultingHistoryDetailFragment$.ExternalSyntheticLambda2(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsBottomCtaV1View);
        int i4 = IAuthTabCallback + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return frameLayout;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(838249277, -838249277, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{creditConsultingHistoryDetailFragment, onwarmupcompleted});
    }

    private static final Unit onExtraCallbackWithResult(CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment, TdsListHeaderV3View tdsListHeaderV3View) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(-633791517, 633791518, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{creditConsultingHistoryDetailFragment, tdsListHeaderV3View});
    }
}
