package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.deposit;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.home.ui.dst.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AutoCallback;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.RVManifestIProxyManifest;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TombstoneProtosMemoryMappingBuilder;
import o.clearDebugStorageKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeDstAnalysisAssetDepositTransactionFragment extends Hilt_HomeDstAnalysisAssetDepositTransactionFragment<clearDebugStorageKey, HomeDstAnalysisAssetDepositTransactionViewModel, RVManifestIProxyManifest> {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback;
    private final Lazy IAuthTabCallback;
    private final String onExtraCallbackWithResult;

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            int i4 = 3 / 0;
        }
        int i5 = i3 + 45;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public /* synthetic */ AutoCallback IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        HomeDstAnalysisAssetDepositTransactionViewModel homeDstAnalysisAssetDepositTransactionViewModelIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return homeDstAnalysisAssetDepositTransactionViewModelIsEngagementSignalsApiAvailable;
    }

    /* renamed from: im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.deposit.HomeDstAnalysisAssetDepositTransactionFragment$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<View, clearDebugStorageKey> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final AnonymousClass4 onNavigationEvent = new AnonymousClass4();
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 73;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        AnonymousClass4() {
            super(1, clearDebugStorageKey.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/home/ui/dst/databinding/HomeFragmentHomeDstRecyclerviewBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 == 0) {
                onNavigationEvent(view);
                throw null;
            }
            clearDebugStorageKey cleardebugstoragekeyOnNavigationEvent = onNavigationEvent(view);
            int i3 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return cleardebugstoragekeyOnNavigationEvent;
        }

        public final clearDebugStorageKey onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            clearDebugStorageKey cleardebugstoragekeyIAuthTabCallback = clearDebugStorageKey.IAuthTabCallback(view);
            int i4 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return cleardebugstoragekeyIAuthTabCallback;
            }
            throw null;
        }
    }

    public HomeDstAnalysisAssetDepositTransactionFragment() {
        super(R.layout.home_fragment_home_dst_recyclerview, AnonymousClass4.onNavigationEvent);
        this.onExtraCallbackWithResult = "home_analysis_asset_deposit_transaction";
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(new onExtraCallbackWithResult(this)));
        this.IAuthTabCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(HomeDstAnalysisAssetDepositTransactionViewModel.class), new onExtraCallback(lazyOnNavigationEvent), new onNavigationEvent(null, lazyOnNavigationEvent), new IAuthTabCallback(this, lazyOnNavigationEvent));
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 77;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    protected HomeDstAnalysisAssetDepositTransactionViewModel isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        HomeDstAnalysisAssetDepositTransactionViewModel homeDstAnalysisAssetDepositTransactionViewModel = (HomeDstAnalysisAssetDepositTransactionViewModel) this.IAuthTabCallback.getValue();
        int i4 = IAuthTabCallbackStub + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return homeDstAnalysisAssetDepositTransactionViewModel;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int i4 = IAuthTabCallbackStub + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<Fragment> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            throw null;
        }

        public final Fragment onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i3 + 97;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return fragment;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted();
            int i4 = IAuthTabCallback + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i3 = onWarmupCompleted + 91;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onWarmupCompleted = onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 56 / 0;
            }
            return onWarmupCompleted;
        }

        public final ViewModelProvider.onWarmupCompleted onWarmupCompleted() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i2 = onExtraCallback + 31;
                onNavigationEvent = i2 % 128;
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
            int i4 = onNavigationEvent + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return defaultViewModelProviderFactory;
            }
            throw null;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallback + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            if (i3 != 0) {
                int i4 = 19 / 0;
            }
            return viewModelStore;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i2 = IAuthTabCallback + 25;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i4 = IAuthTabCallback + 71;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = !((textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) ^ true) ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent : null;
            return textFieldKeyInputExternalSyntheticLambda6 != null ? textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }
}
