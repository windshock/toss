package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.home.ui.dst.R;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.RVManifestIProxyManifest;
import o.Remote;
import o.clearDebugStorageKey;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeDstAnalysisAssetLoanAccountFragment extends Hilt_HomeDstAnalysisAssetLoanAccountFragment<clearDebugStorageKey, HomeDstAnalysisAssetLoanAccountViewModel, RVManifestIProxyManifest> {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private final Lazy IAuthTabCallback;
    private final String onExtraCallback;

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return -1L;
    }

    public /* synthetic */ Remote onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        HomeDstAnalysisAssetLoanAccountViewModel homeDstAnalysisAssetLoanAccountViewModelExtraCommand = extraCommand();
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return homeDstAnalysisAssetLoanAccountViewModelExtraCommand;
    }

    /* renamed from: im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan.HomeDstAnalysisAssetLoanAccountFragment$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<View, clearDebugStorageKey> {
        public static final AnonymousClass1 IAuthTabCallback = new AnonymousClass1();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 57;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        AnonymousClass1() {
            super(1, clearDebugStorageKey.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/home/ui/dst/databinding/HomeFragmentHomeDstRecyclerviewBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            clearDebugStorageKey cleardebugstoragekeyOnNavigationEvent = onNavigationEvent((View) obj);
            int i4 = onExtraCallbackWithResult + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return cleardebugstoragekeyOnNavigationEvent;
        }

        public final clearDebugStorageKey onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            clearDebugStorageKey cleardebugstoragekeyIAuthTabCallback = clearDebugStorageKey.IAuthTabCallback(view);
            int i4 = onExtraCallbackWithResult + 99;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
            return cleardebugstoragekeyIAuthTabCallback;
        }
    }

    public HomeDstAnalysisAssetLoanAccountFragment() {
        super(R.layout.home_fragment_home_dst_recyclerview, AnonymousClass1.IAuthTabCallback);
        this.onExtraCallback = "home_analysis_asset_loan_account";
        this.IAuthTabCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(HomeDstAnalysisAssetLoanAccountViewModel.class), new IAuthTabCallback(this), new onNavigationEvent(null, this), new onExtraCallbackWithResult(this));
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public HomeDstAnalysisAssetLoanAccountViewModel extraCommand() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeDstAnalysisAssetLoanAccountViewModel homeDstAnalysisAssetLoanAccountViewModel = (HomeDstAnalysisAssetLoanAccountViewModel) this.IAuthTabCallback.getValue();
        int i4 = IAuthTabCallbackStub + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return homeDstAnalysisAssetLoanAccountViewModel;
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getViewModelStore(), "");
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            int i3 = onWarmupCompleted + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return viewModelStore;
        }
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent();
            int i4 = IAuthTabCallback + 13;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedOnNavigationEvent;
            }
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
            Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory(), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
            int i3 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            int i3 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return defaultViewModelCreationExtras;
            }
            obj.hashCode();
            throw null;
        }
    }
}
