package im.toss.features.loan.refinancing.funnel.account;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.loan.refinancing.data.RefinancingAccountState;
import im.toss.features.loan.refinancing.funnel.account.LoanRefinancingNoAccountFragment$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.ui.R;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.tds.view.component.anim.logo.AnimateLogoSwapView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.ConvertByteArrayToFloatArray;
import o.DERSet;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda30;
import o.JsErrorInterceptionExtension;
import o.PageContext;
import o.PlayerErrorCode;
import o.PluginInfo;
import o.RippleNode;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.addAllCommandLine;
import o.clearWrite;
import o.getDevNetworkType;
import o.getKekid;
import o.getPreRenderJob;
import o.getProxyokhttp;
import o.preFillDefault;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingNoAccountFragment extends Hilt_LoanRefinancingNoAccountFragment {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private int onExtraCallbackWithResult = R.layout.fragment_loan_refinancing_no_account;
    private final PageContext onNavigationEvent;
    private final Lazy onWarmupCompleted;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback = {new PropertyReference1Impl<>(LoanRefinancingNoAccountFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingNoAccountBinding;", 0)};
    public static final int IAuthTabCallback = 8;

    static final /* synthetic */ class IAuthTabCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        IAuthTabCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i2 = onNavigationEvent + 101;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i4 = onNavigationEvent + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i3 + 49;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = onWarmupCompleted + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        int i = IAuthTabCallbackDefault + 117;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment = (LoanRefinancingNoAccountFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder(loanRefinancingNoAccountFragment, setDetectableSize);
        }
        asBinder(loanRefinancingNoAccountFragment, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(1566315420, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1566315420, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{loanRefinancingNoAccountFragment, setDetectableSize}, iIAuthTabCallback2);
        int i4 = onTransact + 35;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(loanRefinancingNoAccountFragment, view);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment = (LoanRefinancingNoAccountFragment) objArr[0];
        RefinancingAccountState refinancingAccountState = (RefinancingAccountState) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(loanRefinancingNoAccountFragment, refinancingAccountState);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingNoAccountFragment, refinancingAccountState);
        int i3 = onTransact + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingNoAccountFragment, setDetectableSize);
        int i4 = asBinder + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(loanRefinancingNoAccountFragment, view);
        int i4 = asBinder + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i3 | i4);
        int i8 = i | i7;
        int i9 = (~(i4 | (~i))) | i3;
        int i10 = i3 + i + i6 + ((-1932811043) * i5) + (1521317780 * i2);
        int i11 = i10 * i10;
        int i12 = ((i3 * (-919556932)) - 154402816) + ((-919556932) * i) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i6) + ((-2098724864) * i5) + ((-1398800384) * i2) + ((-1444151296) * i11);
        int i13 = (i3 * 1794637580) + 2133191799 + (i * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i6 * 1794637741) + (i5 * (-1844343719)) + (i2 * (-1188939004)) + (i11 * (-394526720));
        int i14 = i12 + (i13 * i13 * 821297152);
        if (i14 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i14 == 2) {
            return onNavigationEvent(objArr);
        }
        LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment = (LoanRefinancingNoAccountFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i15 = 2 % 2;
        int i16 = asBinder + 49;
        onTransact = i16 % 128;
        int i17 = i16 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("banner_title", loanRefinancingNoAccountFragment.getString(R.string.loan_go_to_comparison_with_number, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, new Object[]{DERSet.onExtraCallback}, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).intValue())}));
        setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingNoAccountFragment.getString(R.string.loan_question_no_account));
        setDetectableSize.onExtraCallback("case", "no-loans");
        Unit unit = Unit.INSTANCE;
        int i18 = onTransact + 69;
        asBinder = i18 % 128;
        int i19 = i18 % 2;
        return unit;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 7;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return 1251651L;
        }
        throw null;
    }

    public LoanRefinancingNoAccountFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(new onNavigationEvent(this)));
        this.onWarmupCompleted = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(LoanRefinancingAccountViewModel.class), new onWarmupCompleted(lazyOnNavigationEvent), new IAuthTabCallbackDefault(null, lazyOnNavigationEvent), new onTransact(this, lazyOnNavigationEvent));
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onWarmupCompleted);
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i3 + 109;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 77 / 0;
        }
        return i5;
    }

    private final LoanRefinancingAccountViewModel asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        LoanRefinancingAccountViewModel loanRefinancingAccountViewModel = (LoanRefinancingAccountViewModel) this.onWarmupCompleted.getValue();
        int i3 = asBinder + 89;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return loanRefinancingAccountViewModel;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, JsErrorInterceptionExtension> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        static {
            int i = onExtraCallback + 55;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        onExtraCallbackWithResult() {
            super(1, JsErrorInterceptionExtension.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingNoAccountBinding;", 0);
        }

        public final JsErrorInterceptionExtension IAuthTabCallback(View view) {
            JsErrorInterceptionExtension jsErrorInterceptionExtensionOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                jsErrorInterceptionExtensionOnExtraCallbackWithResult = JsErrorInterceptionExtension.onExtraCallbackWithResult(view);
                int i3 = 45 / 0;
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                jsErrorInterceptionExtensionOnExtraCallbackWithResult = JsErrorInterceptionExtension.onExtraCallbackWithResult(view);
            }
            int i4 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return jsErrorInterceptionExtensionOnExtraCallbackWithResult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            JsErrorInterceptionExtension jsErrorInterceptionExtensionIAuthTabCallback = IAuthTabCallback((View) obj);
            int i4 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return jsErrorInterceptionExtensionIAuthTabCallback;
        }
    }

    private final JsErrorInterceptionExtension onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        JsErrorInterceptionExtension jsErrorInterceptionExtensionOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this, onExtraCallback[0]);
        Intrinsics.checkNotNullExpressionValue(jsErrorInterceptionExtensionOnExtraCallbackWithResult, "");
        JsErrorInterceptionExtension jsErrorInterceptionExtension = jsErrorInterceptionExtensionOnExtraCallbackWithResult;
        int i4 = onTransact + 115;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return jsErrorInterceptionExtension;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            asBinder().onExtraCallback(access100());
            asInterface();
            IAuthTabCallbackStub();
            return;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        asBinder().onExtraCallback(access100());
        asInterface();
        IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1251653L, false, (String) null, (Map) null, new LoanRefinancingNoAccountFragment$.ExternalSyntheticLambda1(loanRefinancingNoAccountFragment), 14, (Object) null);
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(iOnWarmupCompleted2, -1113360422, 1113360436, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted3, new Object[]{loanRefinancingNoAccountFragment, "refinancing_loan__unable_check_my_loan"});
        int i2 = asBinder + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("case", "non_connect");
            setDetectableSize.onExtraCallback("cta_title", loanRefinancingNoAccountFragment.getString(R.string.loan_cta_reconnect));
            unit = Unit.INSTANCE;
            int i3 = 82 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("case", "non_connect");
            setDetectableSize.onExtraCallback("cta_title", loanRefinancingNoAccountFragment.getString(R.string.loan_cta_reconnect));
            unit = Unit.INSTANCE;
        }
        int i4 = asBinder + 29;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallback(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, View view) {
        List listOnNavigationEvent;
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1251655L, false, (String) null, (Map) null, new LoanRefinancingNoAccountFragment$.ExternalSyntheticLambda0(loanRefinancingNoAccountFragment), 14, (Object) null);
        RefinancingAccountState refinancingAccountStateWriteTypedObject = loanRefinancingNoAccountFragment.access100().writeTypedObject();
        Object obj = null;
        if (refinancingAccountStateWriteTypedObject != null) {
            int i2 = asBinder + 3;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                refinancingAccountStateWriteTypedObject.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            listOnNavigationEvent = refinancingAccountStateWriteTypedObject.onNavigationEvent();
        } else {
            listOnNavigationEvent = null;
        }
        List list = listOnNavigationEvent;
        if (list == null || list.isEmpty()) {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1046567755, 1046567768, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{loanRefinancingNoAccountFragment, null, "refinancing_loan__unable_check_my_loan", false, 5, null});
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listOnNavigationEvent.iterator();
        while (!(!it.hasNext())) {
            int i3 = onTransact + 115;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                arrayList.add(((getDevNetworkType) it.next()).IAuthTabCallback_Parcel());
                obj.hashCode();
                throw null;
            }
            arrayList.add(((getDevNetworkType) it.next()).IAuthTabCallback_Parcel());
        }
        Object[] objArr = {loanRefinancingNoAccountFragment, CollectionsKt.joinToString$default(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), "refinancing_loan__unable_check_my_loan", false, 4, null};
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1046567755, 1046567768, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr);
    }

    private final boolean asInterface() {
        int i = 2 % 2;
        JsErrorInterceptionExtension jsErrorInterceptionExtensionOnExtraCallback = onExtraCallback();
        jsErrorInterceptionExtensionOnExtraCallback.IAuthTabCallbackDefault.setLowerText(getString(R.string.loan_refinancing_please_connect_loan, new Object[]{PlayerErrorCode.onPostMessage()}));
        TdsListRowV1View tdsListRowV1View = jsErrorInterceptionExtensionOnExtraCallback.onNavigationEvent;
        int i2 = R.string.loan_go_to_comparison_with_number;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        tdsListRowV1View.setCenterText2(getString(i2, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())}));
        jsErrorInterceptionExtensionOnExtraCallback.onNavigationEvent.setOnClickListener(new LoanRefinancingNoAccountFragment$.ExternalSyntheticLambda2(this));
        BaseTextView baseTextViewICustomTabsCallbackDefault = jsErrorInterceptionExtensionOnExtraCallback.onNavigationEvent.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            int i3 = asBinder + 29;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            baseTextViewICustomTabsCallbackDefault.setPadding(baseTextViewICustomTabsCallbackDefault.getPaddingLeft(), baseTextViewICustomTabsCallbackDefault.getPaddingTop(), varyMatches.onNavigationEvent(48, displayMetrics), baseTextViewICustomTabsCallbackDefault.getPaddingBottom());
        }
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = jsErrorInterceptionExtensionOnExtraCallback.onNavigationEvent.ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            int i5 = onTransact + 5;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            baseTextViewICustomTabsCallbackStubProxy.setPadding(baseTextViewICustomTabsCallbackStubProxy.getPaddingLeft(), baseTextViewICustomTabsCallbackStubProxy.getPaddingTop(), varyMatches.onNavigationEvent(48, displayMetrics2), baseTextViewICustomTabsCallbackStubProxy.getPaddingBottom());
        }
        AnimateLogoSwapView animateLogoSwapView = jsErrorInterceptionExtensionOnExtraCallback.asBinder;
        List listOnWarmupCompleted = ImagePipelineExperimentsBuilderExternalSyntheticLambda30.INSTANCE.onWarmupCompleted();
        ArrayList arrayList = new ArrayList();
        for (Iterator it = listOnWarmupCompleted.iterator(); it.hasNext(); it = it) {
            arrayList.add(new getProxyokhttp((String) it.next(), new PluginInfo(40.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 60, (DefaultConstructorMarker) null)));
        }
        animateLogoSwapView.onExtraCallbackWithResult(arrayList);
        jsErrorInterceptionExtensionOnExtraCallback.onExtraCallback.asInterface().setOnClickListener(new LoanRefinancingNoAccountFragment$.ExternalSyntheticLambda3(this));
        return ConvertByteArrayToFloatArray.onExtraCallback(1251977L, false, (String) null, (Map) null, new LoanRefinancingNoAccountFragment$.ExternalSyntheticLambda4(this), 14, (Object) null);
    }

    private static final Unit asBinder(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i4 = R.string.loan_go_to_comparison_with_number;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        setDetectableSize.onExtraCallback("banner_title", loanRefinancingNoAccountFragment.getString(i4, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())}));
        setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingNoAccountFragment.getString(R.string.loan_question_no_account));
        setDetectableSize.onExtraCallback("case", "no-loans");
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 29;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        access100().ICustomTabsCallbackStub().observe(getViewLifecycleOwner(), new IAuthTabCallback(new LoanRefinancingNoAccountFragment$.ExternalSyntheticLambda5(this)));
        int i2 = asBinder + 93;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
    }

    private static final Unit onNavigationEvent(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, RefinancingAccountState refinancingAccountState) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            if (!refinancingAccountState.onExtraCallbackWithResult().isEmpty()) {
                RippleNode.onNavigationEvent(loanRefinancingNoAccountFragment).onNavigationEvent(R.id.loanRefinancingAccountCheckFragment);
                int i3 = asBinder + 15;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
            return Unit.INSTANCE;
        }
        refinancingAccountState.onExtraCallbackWithResult().isEmpty();
        throw null;
    }

    public void aZ_() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder().IAuthTabCallback();
            throw null;
        }
        asBinder().IAuthTabCallback();
        int i3 = asBinder + 13;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<Fragment> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return fragmentOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Fragment onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.$this_viewModels;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            if (i3 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
                int i3 = 92 / 0;
            } else {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
            }
            int i4 = onExtraCallback + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 IAuthTabCallback() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                int i4 = onExtraCallback + 21;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (!(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6)) {
                int i6 = IAuthTabCallback + 89;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = null;
            } else {
                int i8 = onExtraCallback + 13;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            }
            return textFieldKeyInputExternalSyntheticLambda6 != null ? textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    public static final class onTransact extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onWarmupCompleted();
                obj.hashCode();
                throw null;
            }
            ViewModelProvider.onWarmupCompleted onWarmupCompleted = onWarmupCompleted();
            int i3 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return onWarmupCompleted;
            }
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onWarmupCompleted() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            Object obj = null;
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i2 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 == null || (defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory()) == null) {
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                return defaultViewModelProviderFactory2;
            }
            int i4 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return defaultViewModelProviderFactory;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent();
            int i4 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            if (i3 != 0) {
                int i4 = 23 / 0;
            }
            return viewModelStore;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-2045926778, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 2045926779, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{loanRefinancingNoAccountFragment, setDetectableSize}, iIAuthTabCallback2);
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, RefinancingAccountState refinancingAccountState) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-464764656, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 464764658, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{loanRefinancingNoAccountFragment, refinancingAccountState}, iIAuthTabCallback2);
    }

    private static final Unit onWarmupCompleted(LoanRefinancingNoAccountFragment loanRefinancingNoAccountFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onWarmupCompleted(1566315420, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1566315420, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{loanRefinancingNoAccountFragment, setDetectableSize}, iIAuthTabCallback2);
    }
}
