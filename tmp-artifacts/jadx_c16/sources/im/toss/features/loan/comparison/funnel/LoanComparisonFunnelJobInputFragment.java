package im.toss.features.loan.comparison.funnel;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.features.loan.comparison.funnel.LoanComparisonFunnelJobInputFragment$;
import im.toss.features.loan.ui.R;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.ConvertFloatArrayToByteArray;
import o.PageRenderReadyListener;
import o.PlayerErrorCode;
import o.SetDetectableSize;
import o.SubsamplingScaleImageViewDefaultOnStateChangedListener;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.addAllCommandLine;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.onPreviewReleased;
import o.preFillDefault;
import o.readIntokhttp;
import o.setProtocolsokhttp;
import o.showTraceDebugPanel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;
import viva.republica.toss.network.model.loan.LoanFunnelType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanComparisonFunnelJobInputFragment extends Hilt_LoanComparisonFunnelJobInputFragment {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact;
    private onPreviewReleased IAuthTabCallbackStub;
    private int asBinder = R.layout.fragment_loan_comparison_funnel_job_input;
    private final PageRenderReadyListener onExtraCallback = preFillDefault.IAuthTabCallback(this, onExtraCallback.onNavigationEvent);
    private List<? extends TdsListRowV1View> onExtraCallbackWithResult;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted = {new PropertyReference1Impl<>(LoanComparisonFunnelJobInputFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonFunnelJobInputBinding;", 0)};
    public static final int onNavigationEvent = 8;

    static {
        int i = getInterfaceDescriptor + 21;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsListRowV1View tdsListRowV1View, LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(tdsListRowV1View, loanComparisonFunnelJobInputFragment, view, suspendAnimationKtExternalSyntheticLambda4);
        int i4 = asInterface + 55;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanComparisonFunnelJobInputFragment, setDetectableSize);
        int i4 = asInterface + 61;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallback(LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment, showTraceDebugPanel showtracedebugpanel, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(loanComparisonFunnelJobInputFragment, showtracedebugpanel, view);
        int i4 = onTransact + 57;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsListRowV1View tdsListRowV1View, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(tdsListRowV1View, view);
        int i4 = onTransact + 61;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i;
        int i11 = (~i10) | i9;
        int i12 = ~i;
        int i13 = (~(i5 | i10)) | (~(i8 | i12)) | (~(i12 | i3));
        int i14 = i3 + i + i6 + ((-1017789379) * i2) + (461141949 * i4);
        int i15 = i14 * i14;
        int i16 = ((-551480932) * i3) + 431816704 + ((-1613042074) * i) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i6) + ((-1727660032) * i2) + (1912995840 * i4) + ((-1005256704) * i15);
        int i17 = ((i3 * (-1063000396)) - 360994079) + (i * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i6 * (-1063000885)) + (i2 * (-90181537)) + (i4 * (-1548859681)) + (i15 * 816250880);
        int i18 = i16 + (i17 * i17 * 1493368832);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ void onNavigationEvent(showTraceDebugPanel showtracedebugpanel, LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(805996306, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -805996304, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{showtracedebugpanel, loanComparisonFunnelJobInputFragment, view}, iOnWarmupCompleted2);
        int i4 = asInterface + 87;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, LoanFunnelType loanFunnelType, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, loanFunnelType, setDetectableSize);
        int i4 = asInterface + 125;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            onNavigationEvent(-1025031081, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1025031081, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{loanComparisonFunnelJobInputFragment}, iOnWarmupCompleted2);
            return;
        }
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted4 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(-1025031081, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1025031081, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{loanComparisonFunnelJobInputFragment}, iOnWarmupCompleted4);
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return 1013809L;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return "loan_comparison_select_job_category";
    }

    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, showTraceDebugPanel> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        onExtraCallback() {
            super(1, showTraceDebugPanel.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonFunnelJobInputBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            showTraceDebugPanel showtracedebugpanelOnNavigationEvent = onNavigationEvent((View) obj);
            if (i3 == 0) {
                int i4 = 14 / 0;
            }
            int i5 = IAuthTabCallback + 25;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return showtracedebugpanelOnNavigationEvent;
        }

        public final showTraceDebugPanel onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                showTraceDebugPanel.onExtraCallbackWithResult(view);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            showTraceDebugPanel showtracedebugpanelOnExtraCallbackWithResult = showTraceDebugPanel.onExtraCallbackWithResult(view);
            int i3 = onExtraCallback + 33;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return showtracedebugpanelOnExtraCallbackWithResult;
        }
    }

    private final showTraceDebugPanel IAuthTabCallbackStub() {
        PageRenderReadyListener pageRenderReadyListener;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = asInterface + 79;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            pageRenderReadyListener = this.onExtraCallback;
            addallcommandline = onWarmupCompleted[1];
        } else {
            pageRenderReadyListener = this.onExtraCallback;
            addallcommandline = onWarmupCompleted[0];
        }
        showTraceDebugPanel showtracedebugpanelOnNavigationEvent = pageRenderReadyListener.onNavigationEvent(this, addallcommandline);
        int i3 = asInterface + 85;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return showtracedebugpanelOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int i4 = asInterface + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r1
      0x0026: PHI (r1v5 o.showTraceDebugPanel) = (r1v4 o.showTraceDebugPanel), (r1v11 o.showTraceDebugPanel) binds: [B:8:0x0024, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() {
        showTraceDebugPanel showtracedebugpanelIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = asInterface + 13;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
            showtracedebugpanelIAuthTabCallbackStub = IAuthTabCallbackStub();
            int i3 = 39 / 0;
            if (showtracedebugpanelIAuthTabCallbackStub != null) {
                TdsBottomCtaV1View tdsBottomCtaV1View = showtracedebugpanelIAuthTabCallbackStub.asInterface;
                if (tdsBottomCtaV1View != null) {
                    int i4 = asInterface + 37;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        tdsBottomCtaV1View.asInterface();
                        obj.hashCode();
                        throw null;
                    }
                    TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface();
                    if (tdsButtonV1ViewAsInterface != null) {
                        int i5 = asInterface + 49;
                        onTransact = i5 % 128;
                        int i6 = i5 % 2;
                        tdsButtonV1ViewAsInterface.setLoading(false);
                    }
                }
            }
        } else {
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
            showtracedebugpanelIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (showtracedebugpanelIAuthTabCallbackStub != null) {
            }
        }
        int i7 = asInterface + 117;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment = (LoanComparisonFunnelJobInputFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        showTraceDebugPanel showtracedebugpanelIAuthTabCallbackStub = loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub();
        if (showtracedebugpanelIAuthTabCallbackStub == null) {
            return null;
        }
        showtracedebugpanelIAuthTabCallbackStub.access000.setText(loanComparisonFunnelJobInputFragment.getString(R.string.loan_comparison_funnel___cc73d5d1e3, new Object[]{PlayerErrorCode.onPostMessage()}));
        BaseTextView baseTextViewIAuthTabCallback = showtracedebugpanelIAuthTabCallbackStub.onTransact.IAuthTabCallback();
        Context contextRequireContext = loanComparisonFunnelJobInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Configuration configuration = contextRequireContext.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        baseTextViewIAuthTabCallback.setTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).onRelationshipValidationResult());
        BaseTextView baseTextViewIAuthTabCallback2 = showtracedebugpanelIAuthTabCallbackStub.access100.IAuthTabCallback();
        Context contextRequireContext2 = loanComparisonFunnelJobInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        Configuration configuration2 = contextRequireContext2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        baseTextViewIAuthTabCallback2.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration2)).onRelationshipValidationResult());
        loanComparisonFunnelJobInputFragment.asBinder();
        loanComparisonFunnelJobInputFragment.onMinimized();
        Unit unitOnMessageChannelReady = loanComparisonFunnelJobInputFragment.onMessageChannelReady();
        int i4 = onTransact + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnMessageChannelReady;
    }

    private final Unit asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub();
            obj.hashCode();
            throw null;
        }
        showTraceDebugPanel showtracedebugpanelIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (showtracedebugpanelIAuthTabCallbackStub == null) {
            int i3 = asInterface + 101;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        LoanComparisonFunnelJobInputFragment$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new LoanComparisonFunnelJobInputFragment$.ExternalSyntheticLambda6(this, showtracedebugpanelIAuthTabCallbackStub);
        TdsBottomCtaV1View tdsBottomCtaV1View = showtracedebugpanelIAuthTabCallbackStub.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        ScrollView scrollView = showtracedebugpanelIAuthTabCallbackStub.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, scrollView, false, 0, 6, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View2 = showtracedebugpanelIAuthTabCallbackStub.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View2, viva.republica.toss.R.string.next, externalSyntheticLambda6, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        onPreviewReleased onpreviewreleased = loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub;
        String apiValue = null;
        if (onpreviewreleased != null) {
            int i2 = onTransact + 105;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                onpreviewreleased.getApiValue();
                apiValue.hashCode();
                throw null;
            }
            apiValue = onpreviewreleased.getApiValue();
        } else {
            int i3 = asInterface + 35;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
        setDetectableSize.onExtraCallback("job", apiValue);
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment, showTraceDebugPanel showtracedebugpanel, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub == null) {
            return;
        }
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1005756L, false, (String) null, (Map) null, new LoanComparisonFunnelJobInputFragment$.ExternalSyntheticLambda5(loanComparisonFunnelJobInputFragment), 14, (Object) null);
        LoanFunnelNavigatorViewModel loanFunnelNavigatorViewModelOnTransact = loanComparisonFunnelJobInputFragment.onTransact();
        onPreviewReleased onpreviewreleased = loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub;
        String code = null;
        if (onpreviewreleased != null) {
            int i4 = onTransact + 23;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                onpreviewreleased.getCode();
                throw null;
            }
            code = onpreviewreleased.getCode();
        }
        loanFunnelNavigatorViewModelOnTransact.IAuthTabCallback(code);
        showtracedebugpanel.asInterface.asInterface().setLoading(true);
        loanComparisonFunnelJobInputFragment.onActivityLayout();
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 115;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 65 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
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
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    int i3 = onNavigationEvent + 41;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i5 = onNavigationEvent + 125;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    private final Unit onMinimized() {
        int i = 2 % 2;
        showTraceDebugPanel showtracedebugpanelIAuthTabCallbackStub = IAuthTabCallbackStub();
        List<? extends TdsListRowV1View> list = null;
        if (showtracedebugpanelIAuthTabCallbackStub == null) {
            return null;
        }
        this.onExtraCallbackWithResult = CollectionsKt.listOf(new TdsListRowV1View[]{showtracedebugpanelIAuthTabCallbackStub.onNavigationEvent, showtracedebugpanelIAuthTabCallbackStub.onExtraCallback, showtracedebugpanelIAuthTabCallbackStub.onExtraCallbackWithResult, showtracedebugpanelIAuthTabCallbackStub.onWarmupCompleted, showtracedebugpanelIAuthTabCallbackStub.IAuthTabCallback});
        LoanComparisonFunnelJobInputFragment$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new LoanComparisonFunnelJobInputFragment$.ExternalSyntheticLambda3(showtracedebugpanelIAuthTabCallbackStub, this);
        List<? extends TdsListRowV1View> list2 = this.onExtraCallbackWithResult;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = asInterface + 103;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 4;
            }
        } else {
            list = list2;
        }
        for (TdsListRowV1View tdsListRowV1View : list) {
            onExtraCallbackWithResult(tdsListRowV1View);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setOnClickListener(new LoanComparisonFunnelJobInputFragment$.ExternalSyntheticLambda4(tdsListRowV1View));
            }
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = tdsListRowV1View.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
                int i4 = onTransact + 65;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls2.setType(TdsCheckBoxV2View.onNavigationEvent.LINE_TRANSPARENT);
            }
            tdsListRowV1View.setOnClickListener(externalSyntheticLambda3);
            IAuthTabCallback(tdsListRowV1View);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        showTraceDebugPanel showtracedebugpanel = (showTraceDebugPanel) objArr[0];
        LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment = (LoanComparisonFunnelJobInputFragment) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = view instanceof TdsListRowV1View ? (TdsListRowV1View) view : null;
        if (tdsListRowV1View != null) {
            showtracedebugpanel.asInterface.setEnabledCta(true);
            loanComparisonFunnelJobInputFragment.onWarmupCompleted(tdsListRowV1View);
            if (loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub != onPreviewReleased.Companion.onExtraCallback(tdsListRowV1View.getTag().toString())) {
                List<? extends TdsListRowV1View> list = loanComparisonFunnelJobInputFragment.onExtraCallbackWithResult;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    list = null;
                }
                Iterator<T> it = list.iterator();
                int i4 = asInterface + 59;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                while (!(!it.hasNext())) {
                    loanComparisonFunnelJobInputFragment.IAuthTabCallback((TdsListRowV1View) it.next());
                }
                loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub = loanComparisonFunnelJobInputFragment.onNavigationEvent(tdsListRowV1View);
            }
        }
        return null;
    }

    private static final void onExtraCallback(TdsListRowV1View tdsListRowV1View, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        tdsListRowV1View.performClick();
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = onTransact + 103;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    private final Unit onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        List<? extends TdsListRowV1View> list = null;
        if (IAuthTabCallbackStub() == null) {
            return null;
        }
        Object[] objArr = {asInterface()};
        String str = (String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr);
        List<? extends TdsListRowV1View> list2 = this.onExtraCallbackWithResult;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            int i4 = onTransact + 49;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 4;
            }
            list = list2;
        }
        for (TdsListRowV1View tdsListRowV1View : list) {
            int i6 = asInterface + 13;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            boolean zAreEqual = Intrinsics.areEqual(tdsListRowV1View.getTag(), str);
            if (zAreEqual) {
                onWarmupCompleted(tdsListRowV1View);
                this.IAuthTabCallbackStub = onNavigationEvent(tdsListRowV1View);
            }
            if (!zAreEqual) {
                IAuthTabCallback(tdsListRowV1View);
            }
        }
        return Unit.INSTANCE;
    }

    private final void onActivityLayout() {
        int i = 2 % 2;
        onPreviewReleased.onWarmupCompleted onwarmupcompleted = onPreviewReleased.Companion;
        Object[] objArr = {asInterface()};
        onPreviewReleased onpreviewreleasedOnExtraCallback = onwarmupcompleted.onExtraCallback((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr));
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(-1725192431, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1725192435, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, iOnWarmupCompleted2);
        if (onTransact().onPostMessage()) {
            getInterfaceDescriptor();
            return;
        }
        if (onpreviewreleasedOnExtraCallback.isNeedJobInfo() || onpreviewreleasedOnExtraCallback == onPreviewReleased.ETC) {
            writeTypedObject();
            return;
        }
        int i2 = asInterface + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel();
        int i4 = onTransact + 27;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String apiValue;
        LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment = (LoanComparisonFunnelJobInputFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        LoanFunnelType loanFunnelTypeAsInterface = loanComparisonFunnelJobInputFragment.onTransact().asInterface();
        int i4 = loanFunnelTypeAsInterface == null ? -1 : IAuthTabCallback.onNavigationEvent[loanFunnelTypeAsInterface.ordinal()];
        if (i4 == 1) {
            apiValue = onPreviewReleased.SELF_BUSINESS.getApiValue();
        } else {
            int i5 = onTransact + 31;
            asInterface = i5 % 128;
            if (i5 % 2 != 0 ? i4 == 2 : i4 == 5) {
                onPreviewReleased onpreviewreleased = loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub;
                apiValue = onpreviewreleased != null ? onpreviewreleased.getApiValue() : null;
            } else {
                onPreviewReleased onpreviewreleased2 = loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub;
                if (onpreviewreleased2 != null) {
                    apiValue = onpreviewreleased2.getApiValue();
                }
            }
        }
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1233141L, false, (String) null, (Map) null, new LoanComparisonFunnelJobInputFragment$.ExternalSyntheticLambda0(apiValue, loanFunnelTypeAsInterface), 14, (Object) null);
        return null;
    }

    private static final Unit onNavigationEvent(String str, LoanFunnelType loanFunnelType, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("job_type", str);
        String strName = null;
        if (loanFunnelType != null) {
            int i2 = onTransact + 77;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                loanFunnelType.name();
                throw null;
            }
            strName = loanFunnelType.name();
        }
        setDetectableSize.onExtraCallback("funnel_type", strName);
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 93;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private final Unit onWarmupCompleted(TdsListRowV1View tdsListRowV1View) {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 75;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        showTraceDebugPanel showtracedebugpanelIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (showtracedebugpanelIAuthTabCallbackStub == null) {
            return null;
        }
        TdsRoundLayout tdsRoundLayout = showtracedebugpanelIAuthTabCallbackStub.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        int i5 = 8;
        if (tdsListRowV1View.getId() == showtracedebugpanelIAuthTabCallbackStub.onExtraCallback.getId()) {
            int i6 = onTransact + 65;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        } else {
            i = 8;
        }
        tdsRoundLayout.setVisibility(i);
        Typography6 typography6 = showtracedebugpanelIAuthTabCallbackStub.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(typography6, "");
        if (tdsListRowV1View.getId() == showtracedebugpanelIAuthTabCallbackStub.IAuthTabCallback.getId()) {
            int i8 = asInterface + 39;
            int i9 = i8 % 128;
            onTransact = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 75;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            i5 = 0;
        } else {
            int i13 = asInterface + 43;
            onTransact = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 / 3;
            }
        }
        typography6.setVisibility(i5);
        TdsRoundLayout tdsRoundLayout2 = showtracedebugpanelIAuthTabCallbackStub.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        if (tdsRoundLayout2.getVisibility() == 0) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1235683L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        }
        Typography6 typography62 = showtracedebugpanelIAuthTabCallbackStub.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(typography62, "");
        if (typography62.getVisibility() == 0) {
            int i15 = onTransact + 125;
            asInterface = i15 % 128;
            if (i15 % 2 == 0) {
                onNavigationEvent(150699119, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -150699116, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
                throw null;
            }
            onNavigationEvent(150699119, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -150699116, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v5 im.toss.tds.view.component.atom.text.BaseTextView) = (r1v4 im.toss.tds.view.component.atom.text.BaseTextView), (r1v7 im.toss.tds.view.component.atom.text.BaseTextView) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(TdsListRowV1View tdsListRowV1View) {
        BaseTextView baseTextViewICustomTabsCallbackDefault;
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            tdsListRowV1View.setRightCheckBoxChecked(false);
            baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
            if (baseTextViewICustomTabsCallbackDefault != null) {
                Context context = tdsListRowV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                baseTextViewICustomTabsCallbackDefault.setTextColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).onRelationshipValidationResult());
            }
        } else {
            tdsListRowV1View.setRightCheckBoxChecked(false);
            baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
            if (baseTextViewICustomTabsCallbackDefault != null) {
            }
        }
        int i3 = asInterface + 53;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    private final onPreviewReleased onNavigationEvent(TdsListRowV1View tdsListRowV1View) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        tdsListRowV1View.setRightCheckBoxChecked(true);
        BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            Context context = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            baseTextViewICustomTabsCallbackDefault.setTextColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).asInterface());
        }
        onPreviewReleased onpreviewreleasedOnExtraCallback = onPreviewReleased.Companion.onExtraCallback(tdsListRowV1View.getTag().toString());
        int i4 = asInterface + 123;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return onpreviewreleasedOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View) = 
      (r1v4 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View)
      (r1v8 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View)
     binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(TdsListRowV1View tdsListRowV1View) {
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls;
        int i = 2 % 2;
        int i2 = onTransact + 121;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View.prefetchWithMultipleUrls();
            int i3 = 35 / 0;
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                int i4 = onTransact + 43;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setImportantForAccessibility(5);
                } else {
                    tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setImportantForAccessibility(4);
                }
            }
        } else {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
            }
        }
        setProtocolsokhttp.IAuthTabCallback(tdsListRowV1View, new LoanComparisonFunnelJobInputFragment$.ExternalSyntheticLambda1(tdsListRowV1View, this));
        int i5 = onTransact + 97;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(TdsListRowV1View tdsListRowV1View, LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        String string;
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                int i3 = asInterface + 77;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls.isChecked()) {
                    int i5 = onTransact + 77;
                    asInterface = i5 % 128;
                    if (i5 % 2 == 0) {
                        loanComparisonFunnelJobInputFragment.getString(R.string.loan_talkback_checkbox_checked);
                        throw null;
                    }
                    string = loanComparisonFunnelJobInputFragment.getString(R.string.loan_talkback_checkbox_checked);
                } else {
                    string = loanComparisonFunnelJobInputFragment.getString(R.string.loan_talkback_checkbox_unchecked) + ", " + loanComparisonFunnelJobInputFragment.getString(R.string.loan_talkback_checkbox_check_and_next);
                }
                suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(string);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment = (LoanComparisonFunnelJobInputFragment) objArr[0];
        int i = 2 % 2;
        showTraceDebugPanel showtracedebugpanelIAuthTabCallbackStub = loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub();
        if (showtracedebugpanelIAuthTabCallbackStub == null) {
            return null;
        }
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ScrollView scrollView = showtracedebugpanelIAuthTabCallbackStub.getInterfaceDescriptor;
        if (scrollView == null) {
            return null;
        }
        scrollView.post(new LoanComparisonFunnelJobInputFragment$.ExternalSyntheticLambda2(loanComparisonFunnelJobInputFragment));
        int i4 = asInterface + 69;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[PHI: r4
      0x0034: PHI (r4v4 o.showTraceDebugPanel) = (r4v3 o.showTraceDebugPanel), (r4v6 o.showTraceDebugPanel) binds: [B:14:0x0032, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        showTraceDebugPanel showtracedebugpanelIAuthTabCallbackStub;
        ScrollView scrollView;
        showTraceDebugPanel showtracedebugpanelIAuthTabCallbackStub2;
        LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment = (LoanComparisonFunnelJobInputFragment) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (loanComparisonFunnelJobInputFragment.isAdded() && (showtracedebugpanelIAuthTabCallbackStub = loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub()) != null && (scrollView = showtracedebugpanelIAuthTabCallbackStub.getInterfaceDescriptor) != null) {
            int i2 = asInterface + 93;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                showtracedebugpanelIAuthTabCallbackStub2 = loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub();
                int i3 = 41 / 0;
                if (showtracedebugpanelIAuthTabCallbackStub2 != null) {
                    Typography6 typography6 = showtracedebugpanelIAuthTabCallbackStub2.IAuthTabCallbackStub;
                    if (typography6 != null) {
                        int i4 = onTransact + 3;
                        asInterface = i4 % 128;
                        if (i4 % 2 == 0) {
                            loanComparisonFunnelJobInputFragment.onExtraCallbackWithResult((View) typography6, scrollView);
                            obj.hashCode();
                            throw null;
                        }
                        if (!loanComparisonFunnelJobInputFragment.onExtraCallbackWithResult((View) typography6, scrollView)) {
                            scrollView.smoothScrollTo(0, scrollView.getHeight());
                            int i5 = asInterface + 61;
                            onTransact = i5 % 128;
                            int i6 = i5 % 2;
                        }
                    }
                }
            } else {
                showtracedebugpanelIAuthTabCallbackStub2 = loanComparisonFunnelJobInputFragment.IAuthTabCallbackStub();
                if (showtracedebugpanelIAuthTabCallbackStub2 != null) {
                }
            }
        }
        return null;
    }

    private final boolean onExtraCallbackWithResult(View view, ScrollView scrollView) {
        int i = 2 % 2;
        Rect rect = new Rect();
        scrollView.getHitRect(rect);
        if (view.getLocalVisibleRect(rect)) {
            int i2 = onTransact + 49;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                rect.height();
                view.getHeight();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (rect.height() >= view.getHeight()) {
                return true;
            }
        }
        int i3 = asInterface + 59;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return false;
    }

    private final void IAuthTabCallbackDefault() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(150699119, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -150699116, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, iOnWarmupCompleted2);
    }

    private static final void onExtraCallback(LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(-1025031081, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1025031081, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{loanComparisonFunnelJobInputFragment}, iOnWarmupCompleted2);
    }

    private static final void onWarmupCompleted(showTraceDebugPanel showtracedebugpanel, LoanComparisonFunnelJobInputFragment loanComparisonFunnelJobInputFragment, View view) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(805996306, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -805996304, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{showtracedebugpanel, loanComparisonFunnelJobInputFragment, view}, iOnWarmupCompleted2);
    }

    private final Unit onPostMessage() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) onNavigationEvent(-281364118, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 281364119, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, iOnWarmupCompleted2);
    }

    private final void onUnminimized() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(-1725192431, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1725192435, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, iOnWarmupCompleted2);
    }
}
