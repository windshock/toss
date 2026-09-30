package im.toss.features.loan.refinancing.funnel.account;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.loan.refinancing.data.RefinancingAccountState;
import im.toss.features.loan.refinancing.funnel.account.LoanRefinancingAccountCheckFragment$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.ui.R;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
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
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.PageContext;
import o.PlayerErrorCode;
import o.RippleNode;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TraceDebugViewManager3;
import o.addAllCommandLine;
import o.clearWrite;
import o.getDevNetworkType;
import o.preFillDefault;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingAccountCheckFragment extends Hilt_LoanRefinancingAccountCheckFragment {
    private static int IAuthTabCallbackDefault = 0;
    private static int access000 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final PageContext IAuthTabCallback;
    private int onExtraCallback = R.layout.fragment_loan_refinancing_account_check;
    private final Lazy onExtraCallbackWithResult;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted = {new PropertyReference1Impl<>(LoanRefinancingAccountCheckFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingAccountCheckBinding;", 0)};
    public static final int onNavigationEvent = 8;

    static final /* synthetic */ class onNavigationEvent implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final /* synthetic */ Function1 onWarmupCompleted;

        onNavigationEvent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || (!(obj instanceof FunctionAdapter))) {
                return false;
            }
            int i5 = i3 + 37;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 1;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i2 + 35;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.invoke(obj);
                int i3 = 31 / 0;
            } else {
                this.onWarmupCompleted.invoke(obj);
            }
            int i4 = IAuthTabCallback + 17;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static {
        int i = access000 + 53;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i4)) | i9 | (~(i8 | i4));
        int i11 = ~i4;
        int i12 = (~(i11 | i8 | i2)) | (~(i7 | i11 | i3));
        int i13 = i2 + i3 + i + ((-195996979) * i5) + ((-904719387) * i6);
        int i14 = i13 * i13;
        int i15 = (i2 * 1886715248) + 940376064 + (1886715248 * i3) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i) + ((-1389494272) * i5) + (1623064576 * i6) + (1510801408 * i14);
        int i16 = (i2 * 1590984816) + 1398186415 + (i3 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i * 1590985553) + (i5 * (-1025631779)) + (i6 * 1121679989) + (i14 * 622657536);
        return i15 + ((i16 * i16) * (-1928134656)) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setDetectableSize);
        int i4 = onTransact + 25;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanRefinancingAccountCheckFragment loanRefinancingAccountCheckFragment = (LoanRefinancingAccountCheckFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(loanRefinancingAccountCheckFragment, view);
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingAccountCheckFragment loanRefinancingAccountCheckFragment, RefinancingAccountState refinancingAccountState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingAccountCheckFragment, refinancingAccountState);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return 1251647L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LoanRefinancingAccountCheckFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(new onExtraCallbackWithResult(this)));
        this.onExtraCallbackWithResult = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(LoanRefinancingAccountViewModel.class), new onExtraCallback(lazyOnNavigationEvent), new onTransact(null, lazyOnNavigationEvent), new asBinder(this, lazyOnNavigationEvent));
        this.IAuthTabCallback = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.onNavigationEvent);
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 115;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i2 + 111;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private final LoanRefinancingAccountViewModel asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingAccountViewModel loanRefinancingAccountViewModel = (LoanRefinancingAccountViewModel) this.onExtraCallbackWithResult.getValue();
        if (i3 == 0) {
            return loanRefinancingAccountViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, TraceDebugViewManager3> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 83;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 83 / 0;
            }
        }

        IAuthTabCallback() {
            super(1, TraceDebugViewManager3.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingAccountCheckBinding;", 0);
        }

        public final TraceDebugViewManager3 IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            TraceDebugViewManager3 traceDebugViewManager3OnExtraCallback = TraceDebugViewManager3.onExtraCallback(view);
            int i4 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return traceDebugViewManager3OnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i2 % 128;
            Object obj2 = null;
            View view = (View) obj;
            if (i2 % 2 == 0) {
                IAuthTabCallback(view);
                throw null;
            }
            TraceDebugViewManager3 traceDebugViewManager3IAuthTabCallback = IAuthTabCallback(view);
            int i3 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return traceDebugViewManager3IAuthTabCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private final TraceDebugViewManager3 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = i2 % 2 != 0 ? this.IAuthTabCallback.onExtraCallbackWithResult(this, onWarmupCompleted[0]) : this.IAuthTabCallback.onExtraCallbackWithResult(this, onWarmupCompleted[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        return (TraceDebugViewManager3) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        asBinder().onExtraCallback(access100());
        IAuthTabCallback(new Object[]{this}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1416149087, -1416149087, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        onTransact();
        int i4 = IAuthTabCallbackDefault + 59;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("kcb_yn", "N");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("kcb_yn", "N");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 123;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final void onNavigationEvent(LoanRefinancingAccountCheckFragment loanRefinancingAccountCheckFragment, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1251649L, false, (String) null, (Map) null, new LoanRefinancingAccountCheckFragment$.ExternalSyntheticLambda2(), 14, (Object) null);
        RefinancingAccountState refinancingAccountStateWriteTypedObject = loanRefinancingAccountCheckFragment.access100().writeTypedObject();
        List listOnNavigationEvent = null;
        if (refinancingAccountStateWriteTypedObject != null) {
            int i2 = onTransact + 29;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                refinancingAccountStateWriteTypedObject.onNavigationEvent();
                listOnNavigationEvent.hashCode();
                throw null;
            }
            listOnNavigationEvent = refinancingAccountStateWriteTypedObject.onNavigationEvent();
        }
        List list = listOnNavigationEvent;
        if (list == null || list.isEmpty()) {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(iOnWarmupCompleted2, -1046567755, 1046567768, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted3, new Object[]{loanRefinancingAccountCheckFragment, null, "refinancing_loan__connect_loan", false, 5, null});
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listOnNavigationEvent.iterator();
        while (it.hasNext()) {
            int i3 = onTransact + 13;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            arrayList.add(((getDevNetworkType) it.next()).IAuthTabCallback_Parcel());
        }
        Object[] objArr = {loanRefinancingAccountCheckFragment, CollectionsKt.joinToString$default(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), "refinancing_loan__connect_loan", false, 4, null};
        int iOnWarmupCompleted4 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1046567755, 1046567768, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted4, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanRefinancingAccountCheckFragment loanRefinancingAccountCheckFragment = (LoanRefinancingAccountCheckFragment) objArr[0];
        int i = 2 % 2;
        TraceDebugViewManager3 traceDebugViewManager3OnExtraCallback = loanRefinancingAccountCheckFragment.onExtraCallback();
        TdsBottomCtaV1View tdsBottomCtaV1View = traceDebugViewManager3OnExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        ScrollView scrollView = traceDebugViewManager3OnExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, scrollView, false, 0, 6, (Object) null);
        tdsBottomCtaV1View.asInterface().setOnClickListener(new LoanRefinancingAccountCheckFragment$.ExternalSyntheticLambda1(loanRefinancingAccountCheckFragment));
        traceDebugViewManager3OnExtraCallback.onTransact.setUpperText(loanRefinancingAccountCheckFragment.getString(R.string.loan_refinancing_check_user_loan, new Object[]{PlayerErrorCode.onPostMessage()}));
        traceDebugViewManager3OnExtraCallback.onExtraCallback.setMaxProgress(0.95f);
        int i2 = IAuthTabCallbackDefault + 23;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void onTransact() {
        int i = 2 % 2;
        asBinder().onExtraCallback().observe(getViewLifecycleOwner(), new onNavigationEvent(new LoanRefinancingAccountCheckFragment$.ExternalSyntheticLambda0(this)));
        int i2 = onTransact + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingAccountCheckFragment loanRefinancingAccountCheckFragment, RefinancingAccountState refinancingAccountState) {
        int i = 2 % 2;
        Object obj = null;
        if (refinancingAccountState.onExtraCallbackWithResult().isEmpty()) {
            RippleNode.onNavigationEvent(loanRefinancingAccountCheckFragment).onNavigationEvent(R.id.loanRefinancingNoAccountFragment);
        } else {
            int i2 = onTransact + 1;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                RippleNode.onNavigationEvent(loanRefinancingAccountCheckFragment).onNavigationEvent(R.id.loanRefinancingInfraCheckFragment);
                obj.hashCode();
                throw null;
            }
            RippleNode.onNavigationEvent(loanRefinancingAccountCheckFragment).onNavigationEvent(R.id.loanRefinancingInfraCheckFragment);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 57;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public void aZ_() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        asBinder().IAuthTabCallback();
        int i4 = onTransact + 69;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        screenParams.put("kcb_yn", "N");
        int i4 = onTransact + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    private final void IAuthTabCallbackStub() {
        IAuthTabCallback(new Object[]{this}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1416149087, -1416149087, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<Fragment> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnWarmupCompleted = onWarmupCompleted();
            if (i3 == 0) {
                int i4 = 11 / 0;
            }
            return fragmentOnWarmupCompleted;
        }

        public final Fragment onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.$this_viewModels;
            }
            throw null;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnExtraCallback = onExtraCallback();
            int i3 = onExtraCallbackWithResult + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i4 = onExtraCallbackWithResult + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
            }
            throw null;
        }
    }

    public static final class asBinder extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted IAuthTabCallback() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
                if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                    textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                    int i3 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    textFieldKeyInputExternalSyntheticLambda6 = null;
                }
                if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                    int i5 = onExtraCallbackWithResult + 15;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                        if (defaultViewModelProviderFactory != null) {
                            return defaultViewModelProviderFactory;
                        }
                    } else {
                        textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                        throw null;
                    }
                }
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                return defaultViewModelProviderFactory2;
            }
            boolean z = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate) instanceof TextFieldKeyInputExternalSyntheticLambda6;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i4 = IAuthTabCallback + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
            }
            return viewModelStore;
        }
    }

    public static final class onTransact extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i4 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            if (r1 != null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r3 = im.toss.features.loan.refinancing.funnel.account.LoanRefinancingAccountCheckFragment.onTransact.onExtraCallbackWithResult + 9;
            im.toss.features.loan.refinancing.funnel.account.LoanRefinancingAccountCheckFragment.onTransact.onNavigationEvent = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            if ((r3 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            if (r1 != null) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = null;
            if (function0 != null) {
                int i2 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                    int i3 = 60 / 0;
                } else {
                    androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                }
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                textFieldKeyInputExternalSyntheticLambda6 = (TextFieldKeyInputExternalSyntheticLambda6) androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent;
            } else {
                int i4 = onNavigationEvent + 7;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 == null) {
                return AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            }
            int i6 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
        }
    }
}
