package im.toss.features.loan.refinancing.funnel.input;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.input.LoanRefinancingJobInputFragment$;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
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
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.ConvertByteArrayToFloatArray;
import o.PageRenderReadyListener;
import o.PlayerErrorCode;
import o.RippleNode;
import o.RotationProvider1;
import o.RsaUtil;
import o.SetDetectableSize;
import o.SubsamplingScaleImageViewDefaultOnStateChangedListener;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.WebSocketFactory;
import o.addAllCommandLine;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.onPreviewReleased;
import o.onRenderReady;
import o.preFillDefault;
import o.readIntokhttp;
import o.setProtocolsokhttp;
import o.showTraceDebugPanel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanFunnelType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingJobInputFragment extends Hilt_LoanRefinancingJobInputFragment {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int onTransact;
    private onPreviewReleased asBinder;
    private int onExtraCallbackWithResult = R.layout.fragment_loan_comparison_funnel_job_input;
    private final PageRenderReadyListener onNavigationEvent = preFillDefault.IAuthTabCallback(this, onExtraCallbackWithResult.IAuthTabCallback);
    private List<? extends TdsListRowV1View> onWarmupCompleted;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback = {new PropertyReference1Impl<>(LoanRefinancingJobInputFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonFunnelJobInputBinding;", 0)};
    public static final int onExtraCallback = 8;

    static {
        int i = IAuthTabCallback_Parcel + 81;
        access000 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(LoanRefinancingJobInputFragment loanRefinancingJobInputFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(loanRefinancingJobInputFragment, view);
        int i4 = IAuthTabCallbackDefault + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingJobInputFragment loanRefinancingJobInputFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(616939225, -616939223, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingJobInputFragment, setDetectableSize}, iIAuthTabCallback3);
        int i4 = IAuthTabCallbackDefault + 69;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i4)) | i;
        int i9 = (~(i7 | (~i4))) | (~((~i) | i7)) | (~(i | i2 | i4));
        int i10 = ~(i4 | i);
        int i11 = i + i2 + i5 + ((-813770285) * i6) + (135932771 * i3);
        int i12 = i11 * i11;
        int i13 = (526900465 * i) + 74317824 + ((-1745228167) * i2) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i5) + (1331953664 * i6) + ((-366739456) * i3) + ((-1308753920) * i12);
        int i14 = (i * 1149714451) + 247108311 + (i2 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i5 * 1149713731) + (i6 * 1918847289) + (i3 * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ void onNavigationEvent(LoanRefinancingJobInputFragment loanRefinancingJobInputFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {loanRefinancingJobInputFragment};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        if (i3 != 0) {
            onNavigationEvent(1636352202, -1636352198, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, WebSocketFactory.onExtraCallback.IAuthTabCallback());
            throw null;
        }
        onNavigationEvent(1636352202, -1636352198, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, WebSocketFactory.onExtraCallback.IAuthTabCallback());
        int i4 = onTransact + 115;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(showTraceDebugPanel showtracedebugpanel, LoanRefinancingJobInputFragment loanRefinancingJobInputFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(showtracedebugpanel, loanRefinancingJobInputFragment, view);
        int i4 = IAuthTabCallbackDefault + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsListRowV1View tdsListRowV1View, LoanRefinancingJobInputFragment loanRefinancingJobInputFragment, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(-411758578, 411758581, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{tdsListRowV1View, loanRefinancingJobInputFragment, view, suspendAnimationKtExternalSyntheticLambda4}, iIAuthTabCallback3);
        int i4 = IAuthTabCallbackDefault + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(TdsListRowV1View tdsListRowV1View, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(tdsListRowV1View, view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 35;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return 1251703L;
        }
        throw null;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i3 + 125;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return "loan_comparison_select_job_category";
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, showTraceDebugPanel> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 103;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onExtraCallbackWithResult() {
            super(1, showTraceDebugPanel.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonFunnelJobInputBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 != 0) {
                onNavigationEvent(view);
                throw null;
            }
            showTraceDebugPanel showtracedebugpanelOnNavigationEvent = onNavigationEvent(view);
            int i3 = onWarmupCompleted + 119;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return showtracedebugpanelOnNavigationEvent;
        }

        public final showTraceDebugPanel onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                showTraceDebugPanel.onExtraCallbackWithResult(view);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            showTraceDebugPanel showtracedebugpanelOnExtraCallbackWithResult = showTraceDebugPanel.onExtraCallbackWithResult(view);
            int i3 = onWarmupCompleted + 85;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return showtracedebugpanelOnExtraCallbackWithResult;
        }
    }

    private final showTraceDebugPanel asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        showTraceDebugPanel showtracedebugpanelOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(this, IAuthTabCallback[0]);
        int i4 = IAuthTabCallbackDefault + 25;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return showtracedebugpanelOnNavigationEvent;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            isEngagementSignalsApiAvailable();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isEngagementSignalsApiAvailable();
        int i3 = onTransact + 1;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private final Unit isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        showTraceDebugPanel showtracedebugpanelAsBinder = asBinder();
        if (showtracedebugpanelAsBinder == null) {
            int i4 = onTransact + 85;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        showtracedebugpanelAsBinder.access000.setText(getString(R.string.loan_comparison_funnel___cc73d5d1e3, new Object[]{PlayerErrorCode.onPostMessage()}));
        BaseTextView baseTextViewIAuthTabCallback = showtracedebugpanelAsBinder.onTransact.IAuthTabCallback();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Configuration configuration = contextRequireContext.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        baseTextViewIAuthTabCallback.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).onRelationshipValidationResult());
        BaseTextView baseTextViewIAuthTabCallback2 = showtracedebugpanelAsBinder.access100.IAuthTabCallback();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        Configuration configuration2 = contextRequireContext2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        baseTextViewIAuthTabCallback2.setTextColor(new getUrlokhttp(new onWarmupCompleted(configuration2)).onRelationshipValidationResult());
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        onTransact();
        return IAuthTabCallbackStub();
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanRefinancingJobInputFragment loanRefinancingJobInputFragment = (LoanRefinancingJobInputFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            loanRefinancingJobInputFragment.asBinder();
            obj.hashCode();
            throw null;
        }
        showTraceDebugPanel showtracedebugpanelAsBinder = loanRefinancingJobInputFragment.asBinder();
        if (showtracedebugpanelAsBinder == null) {
            int i3 = IAuthTabCallbackDefault + 79;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 37 / 0;
            }
            return null;
        }
        LoanRefinancingJobInputFragment$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new LoanRefinancingJobInputFragment$.ExternalSyntheticLambda0(loanRefinancingJobInputFragment);
        TdsBottomCtaV1View tdsBottomCtaV1View = showtracedebugpanelAsBinder.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        ScrollView scrollView = showtracedebugpanelAsBinder.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, scrollView, false, 0, 6, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View2 = showtracedebugpanelAsBinder.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View2, viva.republica.toss.R.string.next, externalSyntheticLambda0, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanRefinancingJobInputFragment loanRefinancingJobInputFragment = (LoanRefinancingJobInputFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            onPreviewReleased onpreviewreleased = loanRefinancingJobInputFragment.asBinder;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        onPreviewReleased onpreviewreleased2 = loanRefinancingJobInputFragment.asBinder;
        setDetectableSize.onExtraCallback("job", onpreviewreleased2 != null ? onpreviewreleased2.getApiValue() : null);
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 61;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(LoanRefinancingJobInputFragment loanRefinancingJobInputFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        String code = null;
        if (i2 % 2 == 0) {
            onPreviewReleased onpreviewreleased = loanRefinancingJobInputFragment.asBinder;
            code.hashCode();
            throw null;
        }
        if (loanRefinancingJobInputFragment.asBinder == null) {
            int i4 = i3 + 75;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1251705L, false, (String) null, (Map) null, new LoanRefinancingJobInputFragment$.ExternalSyntheticLambda5(loanRefinancingJobInputFragment), 14, (Object) null);
        LoanRefinancingViewModel loanRefinancingViewModelAccess100 = loanRefinancingJobInputFragment.access100();
        onPreviewReleased onpreviewreleased2 = loanRefinancingJobInputFragment.asBinder;
        if (onpreviewreleased2 != null) {
            int i5 = onTransact + 39;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                onpreviewreleased2.getCode();
                throw null;
            }
            code = onpreviewreleased2.getCode();
        }
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -965982715, iOnNavigationEvent3, 965982732, iOnNavigationEvent2, new Object[]{loanRefinancingViewModelAccess100, code});
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        onNavigationEvent(-673605225, 673605225, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingJobInputFragment}, iIAuthTabCallback3);
    }

    private final Unit onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        showTraceDebugPanel showtracedebugpanelAsBinder = asBinder();
        List<? extends TdsListRowV1View> list = null;
        if (showtracedebugpanelAsBinder == null) {
            int i4 = IAuthTabCallbackDefault + 37;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        this.onWarmupCompleted = CollectionsKt.listOf(new TdsListRowV1View[]{showtracedebugpanelAsBinder.onNavigationEvent, showtracedebugpanelAsBinder.onExtraCallback, showtracedebugpanelAsBinder.onExtraCallbackWithResult, showtracedebugpanelAsBinder.onWarmupCompleted, showtracedebugpanelAsBinder.IAuthTabCallback});
        LoanRefinancingJobInputFragment$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new LoanRefinancingJobInputFragment$.ExternalSyntheticLambda1(showtracedebugpanelAsBinder, this);
        List<? extends TdsListRowV1View> list2 = this.onWarmupCompleted;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            list = list2;
        }
        for (TdsListRowV1View tdsListRowV1View : list) {
            onNavigationEvent(tdsListRowV1View);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setOnClickListener(new LoanRefinancingJobInputFragment$.ExternalSyntheticLambda2(tdsListRowV1View));
            }
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = tdsListRowV1View.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls2.setType(TdsCheckBoxV2View.onNavigationEvent.LINE_TRANSPARENT);
            }
            tdsListRowV1View.setOnClickListener(externalSyntheticLambda1);
            onExtraCallback(tdsListRowV1View);
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onNavigationEvent + 123;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 78 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            int i6 = IAuthTabCallback + 25;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i7 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onTransact(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 79;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i5 = onNavigationEvent + 65;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    private static final void IAuthTabCallback(showTraceDebugPanel showtracedebugpanel, LoanRefinancingJobInputFragment loanRefinancingJobInputFragment, View view) {
        TdsListRowV1View tdsListRowV1View;
        int i = 2 % 2;
        int i2 = onTransact + 41;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        List<? extends TdsListRowV1View> list = null;
        if (view instanceof TdsListRowV1View) {
            tdsListRowV1View = (TdsListRowV1View) view;
            int i5 = i3 + 73;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        } else {
            tdsListRowV1View = null;
        }
        if (tdsListRowV1View != null) {
            showtracedebugpanel.asInterface.setEnabledCta(true);
            loanRefinancingJobInputFragment.onExtraCallbackWithResult(tdsListRowV1View);
            if (loanRefinancingJobInputFragment.asBinder == onPreviewReleased.Companion.onExtraCallback(tdsListRowV1View.getTag().toString())) {
                return;
            }
            List<? extends TdsListRowV1View> list2 = loanRefinancingJobInputFragment.onWarmupCompleted;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                list = list2;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                loanRefinancingJobInputFragment.onExtraCallback((TdsListRowV1View) it.next());
                int i7 = IAuthTabCallbackDefault + 101;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
            }
            loanRefinancingJobInputFragment.asBinder = loanRefinancingJobInputFragment.IAuthTabCallback(tdsListRowV1View);
        }
    }

    private static final void onExtraCallback(TdsListRowV1View tdsListRowV1View, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        tdsListRowV1View.performClick();
        int i4 = IAuthTabCallbackDefault + 91;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[PHI: r4 r5
      0x0087: PHI (r4v8 im.toss.tds.view.component.compound.listrow.TdsListRowV1View) = 
      (r4v7 im.toss.tds.view.component.compound.listrow.TdsListRowV1View)
      (r4v11 im.toss.tds.view.component.compound.listrow.TdsListRowV1View)
     binds: [B:17:0x0085, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r5v4 boolean) = (r5v3 boolean), (r5v10 boolean) binds: [B:17:0x0085, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Unit IAuthTabCallbackStub() {
        TdsListRowV1View tdsListRowV1View;
        boolean zAreEqual;
        int i = 2 % 2;
        List<? extends TdsListRowV1View> list = null;
        if (asBinder() == null) {
            int i2 = onTransact + 47;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            list.hashCode();
            throw null;
        }
        Object[] objArr = {extraCallback()};
        String str = (String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr);
        List<? extends TdsListRowV1View> list2 = this.onWarmupCompleted;
        if (list2 == null) {
            int i3 = IAuthTabCallbackDefault + 23;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = onTransact + 69;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        } else {
            list = list2;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i7 = IAuthTabCallbackDefault + 81;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                tdsListRowV1View = (TdsListRowV1View) it.next();
                zAreEqual = Intrinsics.areEqual(tdsListRowV1View.getTag(), str);
                int i8 = 47 / 0;
                if (zAreEqual) {
                    onExtraCallbackWithResult(tdsListRowV1View);
                    this.asBinder = IAuthTabCallback(tdsListRowV1View);
                }
            } else {
                tdsListRowV1View = (TdsListRowV1View) it.next();
                zAreEqual = Intrinsics.areEqual(tdsListRowV1View.getTag(), str);
                if (zAreEqual) {
                }
            }
            if (!zAreEqual) {
                int i9 = IAuthTabCallbackDefault + 103;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                onExtraCallback(tdsListRowV1View);
            }
        }
        return Unit.INSTANCE;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onRenderReady.onNavigationEvent(this, "KEY_FUNNEL_BACK", Boolean.TRUE, false, 4, (Object) null);
        int i4 = IAuthTabCallbackDefault + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r1 = im.toss.features.loan.refinancing.funnel.input.LoanRefinancingJobInputFragment.IAuthTabCallbackDefault + 121;
        im.toss.features.loan.refinancing.funnel.input.LoanRefinancingJobInputFragment.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r5.postMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r5.postMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (o.DERSet.onExtraCallback.AudioAttributesImplBaseParcelizer() <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        o.RippleNode.onNavigationEvent(r5).onNavigationEvent(im.toss.features.loan.ui.R.id.loanRefinancingCarInputFragment);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r5.ICustomTabsCallback_Parcel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (o.DERSet.onExtraCallback.AudioAttributesImplBaseParcelizer() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        o.RippleNode.onNavigationEvent(r5).onNavigationEvent(im.toss.features.loan.ui.R.id.loanRefinancingCarInputFragment);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        r5.extraCommand();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r1 == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        LoanRefinancingJobInputFragment loanRefinancingJobInputFragment = (LoanRefinancingJobInputFragment) objArr[0];
        int i2 = 2 % 2;
        int i3 = onTransact + 39;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            i = IAuthTabCallback.onNavigationEvent[loanRefinancingJobInputFragment.access100().getInterfaceDescriptor().ordinal()];
        } else {
            i = IAuthTabCallback.onNavigationEvent[loanRefinancingJobInputFragment.access100().getInterfaceDescriptor().ordinal()];
        }
    }

    private final void postMessage() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        extraCallback().IAuthTabCallback(LoanFunnelType.MANUAL);
        onPreviewReleased onpreviewreleased = this.asBinder;
        if (onpreviewreleased != null) {
            int i4 = IAuthTabCallbackDefault + 25;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (onpreviewreleased.isUnemployed()) {
                RsaUtil rsaUtil = RsaUtil.onNavigationEvent;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                RippleNode.onNavigationEvent(this).onWarmupCompleted(R.id.loanRefinancingAdditionalInputFragment, RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("additionalInfo", RsaUtil.onWarmupCompleted(rsaUtil, contextRequireContext, false, 2, (Object) null))}));
                int i6 = IAuthTabCallbackDefault + 3;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingJobDetailFragment);
    }

    private final Unit onExtraCallbackWithResult(TdsListRowV1View tdsListRowV1View) {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 99;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        showTraceDebugPanel showtracedebugpanelAsBinder = asBinder();
        if (showtracedebugpanelAsBinder == null) {
            return null;
        }
        int i5 = IAuthTabCallbackDefault + 73;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(showtracedebugpanelAsBinder.asBinder, "");
            tdsListRowV1View.getId();
            showtracedebugpanelAsBinder.onExtraCallback.getId();
            throw null;
        }
        TdsRoundLayout tdsRoundLayout = showtracedebugpanelAsBinder.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        int i6 = 0;
        if (tdsListRowV1View.getId() == showtracedebugpanelAsBinder.onExtraCallback.getId()) {
            int i7 = onTransact + 25;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        } else {
            i = 8;
        }
        tdsRoundLayout.setVisibility(i);
        Typography6 typography6 = showtracedebugpanelAsBinder.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(typography6, "");
        if (tdsListRowV1View.getId() == showtracedebugpanelAsBinder.IAuthTabCallback.getId()) {
            int i9 = IAuthTabCallbackDefault + 87;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i6 = 8;
        }
        typography6.setVisibility(i6);
        TdsRoundLayout tdsRoundLayout2 = showtracedebugpanelAsBinder.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        if (tdsRoundLayout2.getVisibility() == 0) {
            ConvertByteArrayToFloatArray.onExtraCallback(1235683L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        }
        Typography6 typography62 = showtracedebugpanelAsBinder.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(typography62, "");
        if (typography62.getVisibility() == 0) {
            onExtraCallback();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v6 im.toss.tds.view.component.atom.text.BaseTextView) = (r1v5 im.toss.tds.view.component.atom.text.BaseTextView), (r1v10 im.toss.tds.view.component.atom.text.BaseTextView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(TdsListRowV1View tdsListRowV1View) {
        BaseTextView baseTextViewICustomTabsCallbackDefault;
        int i = 2 % 2;
        int i2 = onTransact + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            tdsListRowV1View.setRightCheckBoxChecked(true);
            baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
            if (baseTextViewICustomTabsCallbackDefault != null) {
                Context context = tdsListRowV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                baseTextViewICustomTabsCallbackDefault.setTextColor(new getUrlokhttp(new onTransact(configuration)).onRelationshipValidationResult());
                int i3 = onTransact + 69;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            tdsListRowV1View.setRightCheckBoxChecked(false);
            baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
            if (baseTextViewICustomTabsCallbackDefault != null) {
            }
        }
        int i5 = onTransact + 27;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private final onPreviewReleased IAuthTabCallback(TdsListRowV1View tdsListRowV1View) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        tdsListRowV1View.setRightCheckBoxChecked(true);
        BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            Context context = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            baseTextViewICustomTabsCallbackDefault.setTextColor(new getUrlokhttp(new onExtraCallback(configuration)).asInterface());
            int i4 = onTransact + 65;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return onPreviewReleased.Companion.onExtraCallback(tdsListRowV1View.getTag().toString());
    }

    private final void onNavigationEvent(TdsListRowV1View tdsListRowV1View) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            tdsListRowV1View.prefetchWithMultipleUrls();
            throw null;
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View.prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setImportantForAccessibility(4);
        }
        setProtocolsokhttp.IAuthTabCallback(tdsListRowV1View, new LoanRefinancingJobInputFragment$.ExternalSyntheticLambda4(tdsListRowV1View, this));
        int i3 = onTransact + 93;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 23 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String string;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) objArr[0];
        LoanRefinancingJobInputFragment loanRefinancingJobInputFragment = (LoanRefinancingJobInputFragment) objArr[1];
        SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4 = (SuspendAnimationKtExternalSyntheticLambda4) objArr[3];
        int i = 2 % 2;
        int i2 = onTransact + 81;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls == null || !tdsCheckBoxV2ViewPrefetchWithMultipleUrls.isChecked()) {
                string = loanRefinancingJobInputFragment.getString(R.string.loan_talkback_checkbox_unchecked) + ", " + loanRefinancingJobInputFragment.getString(R.string.loan_talkback_checkbox_check_and_next);
            } else {
                int i3 = IAuthTabCallbackDefault + 41;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    string = loanRefinancingJobInputFragment.getString(R.string.loan_talkback_checkbox_checked);
                    int i4 = 42 / 0;
                } else {
                    string = loanRefinancingJobInputFragment.getString(R.string.loan_talkback_checkbox_checked);
                }
            }
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(string);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 75;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        showTraceDebugPanel showtracedebugpanelAsBinder = asBinder();
        if (showtracedebugpanelAsBinder != null) {
            int i4 = onTransact + 13;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            ScrollView scrollView = showtracedebugpanelAsBinder.getInterfaceDescriptor;
            if (scrollView != null) {
                scrollView.post(new LoanRefinancingJobInputFragment$.ExternalSyntheticLambda3(this));
                int i6 = onTransact + 99;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        showTraceDebugPanel showtracedebugpanelAsBinder;
        ScrollView scrollView;
        Typography6 typography6;
        LoanRefinancingJobInputFragment loanRefinancingJobInputFragment = (LoanRefinancingJobInputFragment) objArr[0];
        int i = 2 % 2;
        if (!loanRefinancingJobInputFragment.isAdded() || (showtracedebugpanelAsBinder = loanRefinancingJobInputFragment.asBinder()) == null || (scrollView = showtracedebugpanelAsBinder.getInterfaceDescriptor) == null) {
            return null;
        }
        int i2 = onTransact + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        showTraceDebugPanel showtracedebugpanelAsBinder2 = loanRefinancingJobInputFragment.asBinder();
        if (showtracedebugpanelAsBinder2 == null || (typography6 = showtracedebugpanelAsBinder2.IAuthTabCallbackStub) == null || loanRefinancingJobInputFragment.onNavigationEvent((View) typography6, scrollView)) {
            return null;
        }
        scrollView.smoothScrollTo(0, scrollView.getHeight());
        int i4 = IAuthTabCallbackDefault + 123;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        int i5 = 2 / 2;
        return null;
    }

    private final boolean onNavigationEvent(View view, ScrollView scrollView) {
        int i = 2 % 2;
        Rect rect = new Rect();
        scrollView.getHitRect(rect);
        if (view.getLocalVisibleRect(rect)) {
            int i2 = IAuthTabCallbackDefault + 47;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                rect.height();
                view.getHeight();
                throw null;
            }
            if (rect.height() >= view.getHeight()) {
                return true;
            }
        }
        int i3 = onTransact + 113;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private static final void onWarmupCompleted(LoanRefinancingJobInputFragment loanRefinancingJobInputFragment) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        onNavigationEvent(1636352202, -1636352198, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingJobInputFragment}, iIAuthTabCallback3);
    }

    private final Unit asInterface() {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onNavigationEvent(2014359828, -2014359827, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this}, iIAuthTabCallback3);
    }

    private static final Unit onNavigationEvent(LoanRefinancingJobInputFragment loanRefinancingJobInputFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onNavigationEvent(616939225, -616939223, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingJobInputFragment, setDetectableSize}, iIAuthTabCallback3);
    }

    private final void newSessionWithExtras() {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        onNavigationEvent(-673605225, 673605225, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this}, iIAuthTabCallback3);
    }

    private static final Unit IAuthTabCallback(TdsListRowV1View tdsListRowV1View, LoanRefinancingJobInputFragment loanRefinancingJobInputFragment, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onNavigationEvent(-411758578, 411758581, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{tdsListRowV1View, loanRefinancingJobInputFragment, view, suspendAnimationKtExternalSyntheticLambda4}, iIAuthTabCallback3);
    }
}
