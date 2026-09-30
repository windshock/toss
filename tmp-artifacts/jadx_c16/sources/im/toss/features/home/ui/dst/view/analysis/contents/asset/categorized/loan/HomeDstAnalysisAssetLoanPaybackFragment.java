package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan;

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
public final class HomeDstAnalysisAssetLoanPaybackFragment extends Hilt_HomeDstAnalysisAssetLoanPaybackFragment<clearDebugStorageKey, HomeDstAnalysisAssetLoanPaybackViewModel, RVManifestIProxyManifest> {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private final Lazy onExtraCallback;
    private final String onExtraCallbackWithResult;

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AutoCallback IAuthTabCallbackStubProxy() {
        HomeDstAnalysisAssetLoanPaybackViewModel homeDstAnalysisAssetLoanPaybackViewModelICustomTabsService;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            homeDstAnalysisAssetLoanPaybackViewModelICustomTabsService = ICustomTabsService();
            int i3 = 33 / 0;
        } else {
            homeDstAnalysisAssetLoanPaybackViewModelICustomTabsService = ICustomTabsService();
        }
        int i4 = IAuthTabCallback + 103;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return homeDstAnalysisAssetLoanPaybackViewModelICustomTabsService;
    }

    /* renamed from: im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan.HomeDstAnalysisAssetLoanPaybackFragment$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<View, clearDebugStorageKey> {
        private static int IAuthTabCallback = 1;
        public static final AnonymousClass5 onExtraCallback = new AnonymousClass5();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 15;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        AnonymousClass5() {
            super(1, clearDebugStorageKey.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/home/ui/dst/databinding/HomeFragmentHomeDstRecyclerviewBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            View view = (View) obj;
            if (i2 % 2 == 0) {
                onNavigationEvent(view);
                obj2.hashCode();
                throw null;
            }
            clearDebugStorageKey cleardebugstoragekeyOnNavigationEvent = onNavigationEvent(view);
            int i3 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return cleardebugstoragekeyOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }

        public final clearDebugStorageKey onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            clearDebugStorageKey cleardebugstoragekeyIAuthTabCallback = clearDebugStorageKey.IAuthTabCallback(view);
            int i4 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return cleardebugstoragekeyIAuthTabCallback;
        }
    }

    public HomeDstAnalysisAssetLoanPaybackFragment() {
        super(R.layout.home_fragment_home_dst_recyclerview, AnonymousClass5.onExtraCallback);
        this.onExtraCallbackWithResult = "home_analysis_asset_loan_transaction";
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(new onExtraCallbackWithResult(this)));
        this.onExtraCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(HomeDstAnalysisAssetLoanPaybackViewModel.class), new IAuthTabCallback(lazyOnNavigationEvent), new onExtraCallback(null, lazyOnNavigationEvent), new onNavigationEvent(this, lazyOnNavigationEvent));
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    protected HomeDstAnalysisAssetLoanPaybackViewModel ICustomTabsService() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeDstAnalysisAssetLoanPaybackViewModel homeDstAnalysisAssetLoanPaybackViewModel = (HomeDstAnalysisAssetLoanPaybackViewModel) this.onExtraCallback.getValue();
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return homeDstAnalysisAssetLoanPaybackViewModel;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<Fragment> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnExtraCallback = onExtraCallback();
            int i4 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 24 / 0;
            }
            return fragmentOnExtraCallback;
        }

        public final Fragment onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Fragment fragment = this.$this_viewModels;
            int i4 = i3 + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 31 / 0;
            }
            return fragment;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnExtraCallback = onExtraCallback();
            int i4 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i4 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            if (i3 == 0) {
                int i4 = 0 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i4 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 40 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i2 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i4 = onNavigationEvent + 49;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                    }
                    throw null;
                }
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                int i5 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 == null) {
                return AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            }
            int i7 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            }
            textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            throw null;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onWarmupCompleted = onWarmupCompleted();
            int i4 = onNavigationEvent + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onWarmupCompleted;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if (r1 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (r1 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            r2 = im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan.HomeDstAnalysisAssetLoanPaybackFragment.onNavigationEvent.onNavigationEvent + 119;
            im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan.HomeDstAnalysisAssetLoanPaybackFragment.onNavigationEvent.onExtraCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        
            if ((r2 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ViewModelProvider.onWarmupCompleted onWarmupCompleted() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i2 = onNavigationEvent + 91;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i4 = onNavigationEvent + 125;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                    int i5 = 54 / 0;
                } else {
                    defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            return defaultViewModelProviderFactory2;
        }
    }
}
