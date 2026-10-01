package im.toss.feature.credit.ui.main.consulting;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.main.R;
import im.toss.feature.credit.ui.main.consulting.CreditConsultingSelectCategoryFragment;
import im.toss.features.credit.data.response.CreditConsultingCategory;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppMsgReceiver2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.PageRenderReadyListener;
import o.ParamUtils;
import o.SetDetectingInterval;
import o.access502;
import o.access800;
import o.addAllCommandLine;
import o.enableReportDataOptimize;
import o.exitAllPages;
import o.findResAndMsg;
import o.getAdService;
import o.getRouteDatabase;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.preFillDefault;
import o.readIntokhttp;
import o.setProxySelectorokhttp;
import o.setRubIn;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditConsultingSelectCategoryFragment extends Hilt_CreditConsultingSelectCategoryFragment implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder;
    private static char asInterface;
    private static int getInterfaceDescriptor;
    public static final int onExtraCallback;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static char onTransact;
    private final Lazy IAuthTabCallback;
    private final PageRenderReadyListener onExtraCallbackWithResult;
    private final Lazy onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(CreditConsultingSelectCategoryFragment.class, "binding", "getBinding()Lim/toss/feature/credit/ui/main/databinding/FragmentCreditConsultingSelectCategoryBinding;", 0)};
        onExtraCallback = 8;
        int i = getInterfaceDescriptor + 89;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditConsultingSelectCategoryFragment creditConsultingSelectCategoryFragment, TdsTopV2View tdsTopV2View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditConsultingSelectCategoryFragment, tdsTopV2View);
        int i4 = asBinder + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditConsultingSelectCategoryFragment creditConsultingSelectCategoryFragment, CreditConsultingCategory creditConsultingCategory) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditConsultingSelectCategoryFragment, creditConsultingCategory);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditConsultingSelectCategoryFragment creditConsultingSelectCategoryFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditConsultingSelectCategoryFragment, onwarmupcompleted);
        int i4 = IAuthTabCallbackStubProxy + 13;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i4 = asBinder + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = IAuthTabCallbackStubProxy + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.access200();
        }
        int i3 = 74 / 0;
        return super/*o.openJavaCrashMonitor*/.access200();
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.removeAttachLongUserData*/.aq_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i3 = IAuthTabCallbackStubProxy + 111;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        Map<String, Object> mapAr_;
        int i = 2 % 2;
        int i2 = asBinder + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
            int i3 = 37 / 0;
        } else {
            mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        }
        int i4 = IAuthTabCallbackStubProxy + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return findresandmsgAs_;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = asBinder + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return screenId;
        }
        throw null;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = IAuthTabCallbackStubProxy + 31;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = IAuthTabCallbackStubProxy + 85;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 != 0) {
            throw null;
        }
        int i4 = asBinder + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = asBinder + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsServiceDefault();
        }
        ICustomTabsServiceDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashOnWarmupCompleted = onWarmupCompleted();
        int i4 = asBinder + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashOnWarmupCompleted;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i4 = asBinder + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return setrubinValidateRelationship;
        }
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = asBinder + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    public CreditConsultingSelectCategoryFragment() {
        super(R.layout.fragment_credit_consulting_select_category);
        this.IAuthTabCallback = isStopUpload.onExtraCallback(this, 1310339L, (Function1) null, new Function1() { // from class: im.toss.feature.credit.ui.main.consulting.CreditConsultingSelectCategoryFragment$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 119;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = CreditConsultingSelectCategoryFragment.onExtraCallback(this.f$0, (initMiniApp.onWarmupCompleted) obj);
                int i4 = onExtraCallbackWithResult + 49;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        }, 2, (Object) null);
        this.onExtraCallbackWithResult = preFillDefault.IAuthTabCallback(this, onExtraCallback.onWarmupCompleted);
        this.onWarmupCompleted = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CreditConsultingViewModel.class), new IAuthTabCallback(this), new onExtraCallbackWithResult(null, this), new IAuthTabCallbackStub(this));
    }

    public static final class onWarmupCompleted extends exitAllPages<CreditConsultingCategory> {
        public static final int IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 0;
        private static int asInterface = 0;
        private static int onTransact = 1;
        private final Function1<CreditConsultingCategory, Unit> onNavigationEvent;

        static {
            int i = asInterface + 11;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
        }

        public static final class onExtraCallback implements Function1<Object, Boolean> {
            private static int IAuthTabCallback = 0;
            public static final onExtraCallback onExtraCallback = new onExtraCallback();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 107;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Boolean boolOnWarmupCompleted = onWarmupCompleted(obj);
                int i4 = IAuthTabCallback + 115;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 98 / 0;
                }
                return boolOnWarmupCompleted;
            }

            public final Boolean onWarmupCompleted(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 113;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(obj, "");
                    return Boolean.valueOf(obj instanceof CreditConsultingCategory);
                }
                Intrinsics.checkNotNullParameter(obj, "");
                int i3 = 8 / 0;
                return Boolean.valueOf(obj instanceof CreditConsultingCategory);
            }
        }

        public onWarmupCompleted(@NotNull Function1<? super CreditConsultingCategory, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult.onWarmupCompleted(viva.republica.toss.R.layout.item_tds_list_row_v1);
            onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.consulting.CreditConsultingSelectCategoryFragment$CreditConsultingSelectCategoryAdapter$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 83;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    CreditConsultingSelectCategoryFragment.onWarmupCompleted onwarmupcompleted = this.f$0;
                    AppMsgReceiver2 appMsgReceiver2 = (AppMsgReceiver2) obj;
                    if (i3 == 0) {
                        return CreditConsultingSelectCategoryFragment.onWarmupCompleted.IAuthTabCallback(onwarmupcompleted, appMsgReceiver2, (CreditConsultingCategory) obj2);
                    }
                    CreditConsultingSelectCategoryFragment.onWarmupCompleted.IAuthTabCallback(onwarmupcompleted, appMsgReceiver2, (CreditConsultingCategory) obj2);
                    throw null;
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                onextracallbackwithresult.onExtraCallback(onExtraCallback.onExtraCallback);
                int i = asBinder + 5;
                onTransact = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            }
            onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
            int i4 = asBinder + 51;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        public static final class IAuthTabCallback implements getAdService {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ Configuration onExtraCallbackWithResult;

            public IAuthTabCallback(Configuration configuration) {
                this.onExtraCallbackWithResult = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 49;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                        return getSpecialFeatureOptInStatus.Light;
                    }
                    int i3 = IAuthTabCallback + 17;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return getSpecialFeatureOptInStatus.Dark;
                }
                readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onExtraCallbackWithResult implements getAdService {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Configuration onNavigationEvent;

            public onExtraCallbackWithResult(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                        return getSpecialFeatureOptInStatus.Light;
                    }
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i3 = onWarmupCompleted + 85;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                readIntokhttp.onExtraCallback(this.onNavigationEvent);
                throw null;
            }
        }

        public static Unit onNavigationEvent(onWarmupCompleted onwarmupcompleted, CreditConsultingCategory creditConsultingCategory, View view) {
            int i = 2 % 2;
            int i2 = asBinder + 57;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                onwarmupcompleted.onNavigationEvent.invoke(creditConsultingCategory);
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            onwarmupcompleted.onNavigationEvent.invoke(creditConsultingCategory);
            Unit unit2 = Unit.INSTANCE;
            int i3 = asBinder + 23;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 46 / 0;
            }
            return unit2;
        }

        public static Unit IAuthTabCallback(final onWarmupCompleted onwarmupcompleted, AppMsgReceiver2 appMsgReceiver2, final CreditConsultingCategory creditConsultingCategory) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(creditConsultingCategory, "");
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, "");
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
            tdsListRowV1View2.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View2, 24), varyMatches.IAuthTabCallback(tdsListRowV1View2, 24));
            tdsListRowV1View2.setRightArrow(true);
            tdsListRowV1View2.setLeftImage(creditConsultingCategory.onNavigationEvent());
            tdsListRowV1View2.setCenterText1(creditConsultingCategory.asBinder());
            Context context = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new IAuthTabCallback(configuration)).ICustomTabsCallbackStubProxy());
            tdsListRowV1View2.setCenterText2(creditConsultingCategory.onWarmupCompleted());
            Context context2 = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            tdsListRowV1View2.setCenterText2Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).onPostMessage());
            Object[] objArr = {tdsListRowV1View2, ParamUtils.NORMAL, new Function1() { // from class: im.toss.feature.credit.ui.main.consulting.CreditConsultingSelectCategoryFragment$CreditConsultingSelectCategoryAdapter$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnNavigationEvent = CreditConsultingSelectCategoryFragment.onWarmupCompleted.onNavigationEvent(this.f$0, creditConsultingCategory, (View) obj);
                    int i5 = onNavigationEvent + 101;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return unitOnNavigationEvent;
                }
            }};
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i2 = onTransact + 33;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }
    }

    public hasCrashWhenJavaCrash onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallback.getValue();
        int i3 = IAuthTabCallbackStubProxy + 25;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
        }
        return hascrashwhenjavacrash;
    }

    private static final Unit onExtraCallbackWithResult(CreditConsultingSelectCategoryFragment creditConsultingSelectCategoryFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        FragmentActivity activity = creditConsultingSelectCategoryFragment.getActivity();
        if (activity != null) {
            int i2 = IAuthTabCallbackStubProxy + 85;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{41517, 27345, 20039, 18536, 31411, 45738, 59772, 24282}, 8 - View.MeasureSpec.getSize(0), objArr);
            onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(activity.getIntent()));
            onwarmupcompleted.onExtraCallback("funnel", "apply");
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 5;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return unit;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, access800> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        static {
            int i = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
            super(1, access800.class, "bind", "bind(Landroid/view/View;)Lim/toss/feature/credit/ui/main/databinding/FragmentCreditConsultingSelectCategoryBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            access800 access800VarOnExtraCallback = onExtraCallback((View) obj);
            if (i3 != 0) {
                int i4 = 18 / 0;
            }
            return access800VarOnExtraCallback;
        }

        public final access800 onExtraCallback(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                return access800.onExtraCallbackWithResult(view);
            }
            Intrinsics.checkNotNullParameter(view, "");
            access800.onExtraCallbackWithResult(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final access800 onTransact() {
        PageRenderReadyListener pageRenderReadyListener;
        addAllCommandLine<?> addallcommandline;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            pageRenderReadyListener = this.onExtraCallbackWithResult;
            addallcommandline = onNavigationEvent[0];
        } else {
            pageRenderReadyListener = this.onExtraCallbackWithResult;
            addallcommandline = onNavigationEvent[0];
        }
        access800 access800Var = (access800) pageRenderReadyListener.onNavigationEvent((Fragment) this, addallcommandline);
        int i3 = asBinder + 125;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return access800Var;
    }

    private final CreditConsultingViewModel asInterface() {
        CreditConsultingViewModel creditConsultingViewModel;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            creditConsultingViewModel = (CreditConsultingViewModel) this.onWarmupCompleted.getValue();
            int i3 = 61 / 0;
        } else {
            creditConsultingViewModel = (CreditConsultingViewModel) this.onWarmupCompleted.getValue();
        }
        int i4 = IAuthTabCallbackStubProxy + 115;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return creditConsultingViewModel;
    }

    @Override // im.toss.base.BaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IAuthTabCallbackStubProxy();
        int i4 = asBinder + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(CreditConsultingSelectCategoryFragment creditConsultingSelectCategoryFragment, CreditConsultingCategory creditConsultingCategory) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(creditConsultingCategory, "");
        creditConsultingSelectCategoryFragment.asInterface().onExtraCallback(creditConsultingCategory);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(CreditConsultingSelectCategoryFragment creditConsultingSelectCategoryFragment, TdsTopV2View tdsTopV2View) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsTopV2View, "");
        String string = creditConsultingSelectCategoryFragment.getString(R.string.credit_consulting_select_theme_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        String string2 = creditConsultingSelectCategoryFragment.getString(R.string.credit_consulting_select_theme_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        tdsTopV2View.setSubtitle2Text(string2);
        tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setSubtitle2TextColor(new getUrlokhttp(new onNavigationEvent(configuration)).ICustomTabsCallbackStubProxy());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.feature.credit.ui.main.consulting.CreditConsultingSelectCategoryFragment.onNavigationEvent.IAuthTabCallback + 31;
            im.toss.feature.credit.ui.main.consulting.CreditConsultingSelectCategoryFragment.onNavigationEvent.onWarmupCompleted = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult)) != true) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 99 / 0;
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $11 + 115;
            $10 = i6 % 128;
            int i7 = i6 % i3;
            cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = $10 + 3;
            $11 = i8 % 128;
            if (i8 % i3 == 0) {
                int i9 = 2 / 4;
            }
            int i10 = 58224;
            int i11 = i5;
            while (i11 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i5];
                char[] cArr4 = cArr3;
                int i12 = (c2 + i10) ^ ((c2 << 4) + ((char) (onTransact ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[i3] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 10;
                        int keyRepeatDelay = 12434 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iCombineMeasuredStates, keyRepeatDelay, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (asInterface ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackStub)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i11++;
                    int i14 = $11 + 49;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                i2 = 2;
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 14, 19901 - Color.red(0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void IAuthTabCallbackStubProxy() {
        access800 access800VarOnTransact;
        int i = 2 % 2;
        int i2 = asBinder + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            access800VarOnTransact = onTransact();
            int i3 = 28 / 0;
            if (access800VarOnTransact == null) {
                return;
            }
        } else {
            access800VarOnTransact = onTransact();
            if (access800VarOnTransact == null) {
                return;
            }
        }
        RecyclerView recyclerView = access800VarOnTransact.onWarmupCompleted;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(new Function1() { // from class: im.toss.feature.credit.ui.main.consulting.CreditConsultingSelectCategoryFragment$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 41;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                CreditConsultingSelectCategoryFragment creditConsultingSelectCategoryFragment = this.f$0;
                CreditConsultingCategory creditConsultingCategory = (CreditConsultingCategory) obj;
                if (i6 != 0) {
                    return CreditConsultingSelectCategoryFragment.onExtraCallback(creditConsultingSelectCategoryFragment, creditConsultingCategory);
                }
                CreditConsultingSelectCategoryFragment.onExtraCallback(creditConsultingSelectCategoryFragment, creditConsultingCategory);
                throw null;
            }
        });
        Object[] objArr = {asInterface().onTransact()};
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onwarmupcompleted.onNavigationEvent((List) enableReportDataOptimize.onWarmupCompleted(objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, -760994305, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 760994305));
        recyclerView.setAdapter(onwarmupcompleted);
        FrameLayout frameLayout = access800VarOnTransact.onNavigationEvent;
        Intrinsics.checkNotNull(frameLayout);
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        getRouteDatabase.IAuthTabCallback(linearLayout, new Function1() { // from class: im.toss.feature.credit.ui.main.consulting.CreditConsultingSelectCategoryFragment$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Unit unitIAuthTabCallback = CreditConsultingSelectCategoryFragment.IAuthTabCallback(this.f$0, (TdsTopV2View) obj);
                int i7 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return unitIAuthTabCallback;
            }
        });
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, linearLayout);
        int i4 = IAuthTabCallbackStubProxy + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onExtraCallbackWithResult() {
        asInterface = (char) 31016;
        IAuthTabCallbackStub = (char) 25325;
        onTransact = (char) 26532;
        IAuthTabCallbackDefault = (char) 58353;
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 80 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            int i4 = onExtraCallback + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallback + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedOnNavigationEvent;
            }
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory(), "");
                throw null;
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i4 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            if (r1 != null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            r2 = im.toss.feature.credit.ui.main.consulting.CreditConsultingSelectCategoryFragment.onExtraCallbackWithResult.IAuthTabCallback + 41;
            im.toss.feature.credit.ui.main.consulting.CreditConsultingSelectCategoryFragment.onExtraCallbackWithResult.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            if (r1 != null) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i4 = i3 + 123;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (i5 == 0) {
                    int i6 = 70 / 0;
                }
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }
}
