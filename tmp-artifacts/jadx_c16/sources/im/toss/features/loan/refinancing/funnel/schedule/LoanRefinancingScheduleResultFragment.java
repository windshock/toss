package im.toss.features.loan.refinancing.funnel.schedule;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.refinancing.funnel.schedule.LoanRefinancingScheduleResultFragment$;
import im.toss.features.loan.ui.R;
import im.toss.tds.view.component.anim.logo.AnimateLogoSwapView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.ConvertByteArrayToFloatArray;
import o.DERSet;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda30;
import o.PageContext;
import o.PixelCopyCompatPixelCopyStubExternalSyntheticLambda0;
import o.PluginInfo;
import o.SetDetectableSize;
import o.TextKtExternalSyntheticLambda7;
import o.TraceDebugEngineExtension;
import o.addAllCommandLine;
import o.getKekid;
import o.getProxyokhttp;
import o.isActive;
import o.preFillDefault;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingScheduleResultFragment extends Hilt_LoanRefinancingScheduleResultFragment {
    private static int IAuthTabCallbackDefault = 0;
    private static int access000 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final TextKtExternalSyntheticLambda7 IAuthTabCallback = new TextKtExternalSyntheticLambda7(Reflection.getOrCreateKotlinClass(isActive.class), new IAuthTabCallback(this));
    private int onExtraCallback = R.layout.fragment_loan_refinancing_schedule_result;
    private final PageContext onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onNavigationEvent);
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted = {new PropertyReference1Impl<>(LoanRefinancingScheduleResultFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingScheduleResultBinding;", 0)};
    public static final int onNavigationEvent = 8;

    static {
        int i = IAuthTabCallbackDefault + 67;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(LoanRefinancingScheduleResultFragment loanRefinancingScheduleResultFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(loanRefinancingScheduleResultFragment, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingScheduleResultFragment loanRefinancingScheduleResultFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(loanRefinancingScheduleResultFragment, view);
        int i4 = asBinder + 111;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingScheduleResultFragment loanRefinancingScheduleResultFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanRefinancingScheduleResultFragment, setDetectableSize);
        int i4 = asBinder + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return 1280861L;
        }
        int i3 = 83 / 0;
        return 1280861L;
    }

    private final isActive onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        isActive isactive = (isActive) this.IAuthTabCallback.getValue();
        int i4 = asBinder + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return isactive;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i2 + 67;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
        return i5;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, TraceDebugEngineExtension> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallback + 105;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
            super(1, TraceDebugEngineExtension.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingScheduleResultBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 != 0) {
                onExtraCallback(view);
                throw null;
            }
            TraceDebugEngineExtension traceDebugEngineExtensionOnExtraCallback = onExtraCallback(view);
            int i3 = onWarmupCompleted + 39;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return traceDebugEngineExtensionOnExtraCallback;
        }

        public final TraceDebugEngineExtension onExtraCallback(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            TraceDebugEngineExtension traceDebugEngineExtensionOnWarmupCompleted = TraceDebugEngineExtension.onWarmupCompleted(view);
            int i4 = IAuthTabCallback + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return traceDebugEngineExtensionOnWarmupCompleted;
            }
            throw null;
        }
    }

    private final TraceDebugEngineExtension onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TraceDebugEngineExtension traceDebugEngineExtensionOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, onWarmupCompleted[0]);
        Intrinsics.checkNotNullExpressionValue(traceDebugEngineExtensionOnExtraCallbackWithResult, "");
        TraceDebugEngineExtension traceDebugEngineExtension = traceDebugEngineExtensionOnExtraCallbackWithResult;
        int i4 = asBinder + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return traceDebugEngineExtension;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            IAuthTabCallback(onExtraCallback().onExtraCallbackWithResult());
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            IAuthTabCallback(onExtraCallback().onExtraCallbackWithResult());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallback implements Function0<Bundle> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment onExtraCallbackWithResult;

        public IAuthTabCallback(Fragment fragment) {
            this.onExtraCallbackWithResult = fragment;
        }

        public /* synthetic */ Object invoke() {
            Bundle bundleOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                bundleOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = 30 / 0;
            } else {
                bundleOnExtraCallbackWithResult = onExtraCallbackWithResult();
            }
            int i4 = onWarmupCompleted + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return bundleOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Bundle onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Bundle arguments = this.onExtraCallbackWithResult.getArguments();
            if (arguments != null) {
                int i4 = onWarmupCompleted + 67;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return arguments;
                }
                throw null;
            }
            throw new IllegalStateException("Fragment " + this.onExtraCallbackWithResult + " has null arguments");
        }
    }

    private static final Unit onExtraCallback(LoanRefinancingScheduleResultFragment loanRefinancingScheduleResultFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i4 = R.string.loan_refinancing_compare_directly;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        setDetectableSize.onExtraCallback("banner_title", loanRefinancingScheduleResultFragment.getString(i4, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())}));
        setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingScheduleResultFragment.getString(R.string.loan_question_want_to_find_new_loan_low));
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 45;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final void onExtraCallback(LoanRefinancingScheduleResultFragment loanRefinancingScheduleResultFragment, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1280863L, false, (String) null, (Map) null, new LoanRefinancingScheduleResultFragment$.ExternalSyntheticLambda2(loanRefinancingScheduleResultFragment), 14, (Object) null);
        loanRefinancingScheduleResultFragment.onWarmupCompleted("refinancing_loan__schedule_complete", false);
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
    }

    private final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        TraceDebugEngineExtension traceDebugEngineExtensionOnTransact = onTransact();
        traceDebugEngineExtensionOnTransact.access000.setText(PixelCopyCompatPixelCopyStubExternalSyntheticLambda0.onExtraCallback(str, 0, (Html.ImageGetter) null, (Html.TagHandler) null));
        traceDebugEngineExtensionOnTransact.asInterface.setOnClickListener(new LoanRefinancingScheduleResultFragment$.ExternalSyntheticLambda0(this));
        TdsListRowV1View tdsListRowV1View = traceDebugEngineExtensionOnTransact.asInterface;
        int i2 = R.string.loan_refinancing_compare_directly;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        tdsListRowV1View.setCenterText2(getString(i2, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())}));
        BaseTextView baseTextViewICustomTabsCallbackDefault = traceDebugEngineExtensionOnTransact.asInterface.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            baseTextViewICustomTabsCallbackDefault.setPadding(baseTextViewICustomTabsCallbackDefault.getPaddingLeft(), baseTextViewICustomTabsCallbackDefault.getPaddingTop(), varyMatches.onNavigationEvent(48, displayMetrics), baseTextViewICustomTabsCallbackDefault.getPaddingBottom());
        }
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = traceDebugEngineExtensionOnTransact.asInterface.ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            int i3 = onTransact + 123;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            baseTextViewICustomTabsCallbackStubProxy.setPadding(baseTextViewICustomTabsCallbackStubProxy.getPaddingLeft(), baseTextViewICustomTabsCallbackStubProxy.getPaddingTop(), varyMatches.onNavigationEvent(48, displayMetrics2), baseTextViewICustomTabsCallbackStubProxy.getPaddingBottom());
        }
        AnimateLogoSwapView animateLogoSwapView = traceDebugEngineExtensionOnTransact.IAuthTabCallbackStub;
        List listOnWarmupCompleted = ImagePipelineExperimentsBuilderExternalSyntheticLambda30.INSTANCE.onWarmupCompleted();
        ArrayList arrayList = new ArrayList();
        Iterator it = listOnWarmupCompleted.iterator();
        while (it.hasNext()) {
            arrayList.add(new getProxyokhttp((String) it.next(), new PluginInfo(40.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 60, (DefaultConstructorMarker) null)));
            int i5 = onTransact + 65;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        animateLogoSwapView.onExtraCallbackWithResult(arrayList);
        TdsBottomCtaV1View tdsBottomCtaV1View = traceDebugEngineExtensionOnTransact.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        ScrollView scrollView = onTransact().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, scrollView, false, 0, 6, (Object) null);
        traceDebugEngineExtensionOnTransact.onNavigationEvent.asInterface().setOnClickListener(new LoanRefinancingScheduleResultFragment$.ExternalSyntheticLambda1(this));
    }

    private static final void onWarmupCompleted(LoanRefinancingScheduleResultFragment loanRefinancingScheduleResultFragment, View view) {
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertByteArrayToFloatArray.onExtraCallback(1280865L, true, (String) null, (Map) null, (Function1) null, 34, (Object) null);
            z = true;
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1280865L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            z = false;
        }
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(loanRefinancingScheduleResultFragment, z, (Intent) null, 3, (Object) null);
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(this, false, (Intent) null, 3, (Object) null);
        int i4 = asBinder + 1;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
