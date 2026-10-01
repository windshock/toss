package im.toss.features.home.feature.asset_home.fragment.home;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.home.feature.asset_home.viewmodel.home.investment.AssetInvestmentCategoryHomeViewModel;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AutoCallback;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.extParasm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AssetInvestmentCategoryHomeFragment extends Hilt_AssetInvestmentCategoryHomeFragment<AssetInvestmentCategoryHomeViewModel> {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private final Lazy onExtraCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(AssetInvestmentCategoryHomeViewModel.class), new onNavigationEvent(this), new onExtraCallbackWithResult(null, this), new onWarmupCompleted(this));

    public /* synthetic */ AutoCallback IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AssetInvestmentCategoryHomeViewModel assetInvestmentCategoryHomeViewModelOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 75;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return assetInvestmentCategoryHomeViewModelOnNavigationEvent;
        }
        throw null;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = extParasm.onNavigationEvent.onExtraCallback.onWarmupCompleted.onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return strOnWarmupCompleted;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        long jOnTransact = extParasm.onNavigationEvent.onExtraCallback.onWarmupCompleted.onTransact();
        int i4 = IAuthTabCallback + 23;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return jOnTransact;
        }
        throw null;
    }

    protected AssetInvestmentCategoryHomeViewModel onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AssetInvestmentCategoryHomeViewModel assetInvestmentCategoryHomeViewModel = (AssetInvestmentCategoryHomeViewModel) this.onExtraCallback.getValue();
        int i4 = IAuthTabCallbackStub + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return assetInvestmentCategoryHomeViewModel;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        onNavigationEvent().setEngagementSignalsCallback();
        int i4 = IAuthTabCallback + 77;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.features.home.feature.asset_home.fragment.home.AssetInvestmentFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            int i3 = 6 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
        }
        int i4 = IAuthTabCallback + 1;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
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
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 IAuthTabCallback() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                int i4 = onWarmupCompleted + 5;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 87 / 0;
                }
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            int i6 = IAuthTabCallback + 101;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            int i3 = onNavigationEvent + 69;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getViewModelStore(), "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            int i3 = onNavigationEvent + 97;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 64 / 0;
            }
            return viewModelStore;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            int i4 = onExtraCallback + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 60 / 0;
            }
            return onwarmupcompletedOnExtraCallback;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory(), "");
                throw null;
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }
}
