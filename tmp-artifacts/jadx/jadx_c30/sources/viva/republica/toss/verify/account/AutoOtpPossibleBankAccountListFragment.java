package viva.republica.toss.verify.account;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.base.BaseFragment;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.GetSymmIV;
import o.PageContext;
import o.addAllCommandLine;
import o.enableVirtualViewContainerStateExperimental;
import o.enableVirtualViewDebugFeatures;
import o.enableVirtualViewWindowFocusDetection;
import o.fuseboxEnabledRelease;
import o.perfIssuesEnabled;
import o.perfMonitorV2Enabled;
import o.preFillDefault;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.verify.session.VerifySessionViewModel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AutoOtpPossibleBankAccountListFragment extends BaseFragment {
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback = {new PropertyReference1Impl<>(AutoOtpPossibleBankAccountListFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentBankAccountListBinding;", 0)};
    public static final int onExtraCallback = 8;
    private final Lazy asInterface;
    private final PageContext onExtraCallbackWithResult;
    private final List<perfIssuesEnabled> onNavigationEvent;
    private onExtraCallbackWithResult onWarmupCompleted;

    public long getScreenId() {
        return -1L;
    }

    public AutoOtpPossibleBankAccountListFragment() {
        super(R.layout.fragment_bank_account_list);
        this.onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.onWarmupCompleted);
        this.asInterface = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(VerifySessionViewModel.class), new onExtraCallback(this), new onNavigationEvent(null, this), new onTransact(this));
        this.onNavigationEvent = new ArrayList();
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, GetSymmIV> {
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        IAuthTabCallback() {
            super(1, GetSymmIV.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentBankAccountListBinding;", 0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final GetSymmIV invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return GetSymmIV.onExtraCallback(view);
        }
    }

    private final GetSymmIV onWarmupCompleted() {
        return (GetSymmIV) this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, IAuthTabCallback[0]);
    }

    private final VerifySessionViewModel onExtraCallback() {
        return (VerifySessionViewModel) this.asInterface.getValue();
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        super.onAttach(context);
        if (!(context instanceof onExtraCallbackWithResult)) {
            if (!(getParentFragment() instanceof onExtraCallbackWithResult)) {
                throw new IllegalStateException("Must implement callback from parent Activity or Fragment");
            }
            Fragment parentFragment = getParentFragment();
            if (parentFragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.verify.account.AutoOtpPossibleBankAccountListFragment.Callback");
            }
            context = (onExtraCallbackWithResult) parentFragment;
        }
        this.onWarmupCompleted = (onExtraCallbackWithResult) context;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        IAuthTabCallback();
        onNavigationEvent();
    }

    private final void IAuthTabCallback() {
        this.onNavigationEvent.clear();
        this.onNavigationEvent.addAll(CollectionsKt.plus(CollectionsKt.toList(((enableVirtualViewWindowFocusDetection) VerifySessionViewModel.onExtraCallbackWithResult(-1184650058, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onExtraCallback()}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1184650066)).asInterface()), new perfMonitorV2Enabled()));
    }

    private final void onNavigationEvent() {
        GetSymmIV getSymmIVOnWarmupCompleted = onWarmupCompleted();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        String strOnWarmupCompleted = enableVirtualViewDebugFeatures.onWarmupCompleted(contextRequireContext, onExtraCallback().onExtraCallbackWithResult().IAuthTabCallback());
        TdsTopV1View tdsTopV1View = getSymmIVOnWarmupCompleted.onWarmupCompleted;
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperText(strOnWarmupCompleted);
        getSymmIVOnWarmupCompleted.IAuthTabCallback.setLayoutManager(new LinearLayoutManager(requireActivity()));
        TdsRecyclerView tdsRecyclerView = getSymmIVOnWarmupCompleted.IAuthTabCallback;
        enableVirtualViewContainerStateExperimental enablevirtualviewcontainerstateexperimental = new enableVirtualViewContainerStateExperimental(new onWarmupCompleted());
        enablevirtualviewcontainerstateexperimental.onExtraCallbackWithResult(this.onNavigationEvent, true);
        tdsRecyclerView.setAdapter(enablevirtualviewcontainerstateexperimental);
    }

    public static final class onWarmupCompleted implements enableVirtualViewContainerStateExperimental.onExtraCallback {
        onWarmupCompleted() {
        }

        @Override // o.enableVirtualViewContainerStateExperimental.onExtraCallback
        public void onExtraCallbackWithResult(fuseboxEnabledRelease fuseboxenabledrelease) {
            Intrinsics.checkNotNullParameter(fuseboxenabledrelease, BuildConfig.FLAVOR);
            onExtraCallbackWithResult onextracallbackwithresult = AutoOtpPossibleBankAccountListFragment.this.onWarmupCompleted;
            if (onextracallbackwithresult == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                onextracallbackwithresult = null;
            }
            onextracallbackwithresult.onWarmupCompleted(fuseboxenabledrelease);
        }

        @Override // o.enableVirtualViewContainerStateExperimental.onExtraCallback
        public void onNavigationEvent() {
            onExtraCallbackWithResult onextracallbackwithresult = AutoOtpPossibleBankAccountListFragment.this.onWarmupCompleted;
            if (onextracallbackwithresult == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                onextracallbackwithresult = null;
            }
            onextracallbackwithresult.onExtraCallback();
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, BuildConfig.FLAVOR);
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onTransact extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }
}
