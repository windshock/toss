package im.toss.features.home.feature.asset_home.fragment.home;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.home.feature.asset_home.viewmodel.home.investment.AssetInvestmentMiniHomeViewModel;
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
public final class AssetInvestmentMiniHomeFragment extends Hilt_AssetInvestmentMiniHomeFragment<AssetInvestmentMiniHomeViewModel> {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private final Lazy onExtraCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(AssetInvestmentMiniHomeViewModel.class), new onExtraCallback(this), new onWarmupCompleted(null, this), new onNavigationEvent(this));

    public /* synthetic */ AutoCallback IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AssetInvestmentMiniHomeViewModel assetInvestmentMiniHomeViewModelOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallbackStub + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return assetInvestmentMiniHomeViewModelOnNavigationEvent;
    }

    public String IAuthTabCallbackStub() {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            strOnWarmupCompleted = extParasm.onExtraCallback.IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted();
            int i3 = 10 / 0;
        } else {
            strOnWarmupCompleted = extParasm.onExtraCallback.IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted();
        }
        int i4 = IAuthTabCallbackStub + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = extParasm.onExtraCallback.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback();
        int i4 = IAuthTabCallback + 65;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return jOnExtraCallback;
    }

    protected AssetInvestmentMiniHomeViewModel onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        AssetInvestmentMiniHomeViewModel assetInvestmentMiniHomeViewModel = (AssetInvestmentMiniHomeViewModel) this.onExtraCallback.getValue();
        int i3 = IAuthTabCallback + 49;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return assetInvestmentMiniHomeViewModel;
        }
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            onNavigationEvent().setEngagementSignalsCallback();
        } else {
            super.onCreate(bundle);
            onNavigationEvent().setEngagementSignalsCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // im.toss.features.home.feature.asset_home.fragment.home.AssetInvestmentFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
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

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            int i4 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent();
                throw null;
            }
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent();
            int i3 = IAuthTabCallback + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return onwarmupcompletedOnNavigationEvent;
        }

        public final ViewModelProvider.onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory(), "");
                throw null;
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent = onNavigationEvent();
            if (i3 == 0) {
                int i4 = 5 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onNavigationEvent() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                int i3 = onWarmupCompleted + 1;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            int i4 = onWarmupCompleted + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
            }
            return defaultViewModelCreationExtras;
        }
    }
}
