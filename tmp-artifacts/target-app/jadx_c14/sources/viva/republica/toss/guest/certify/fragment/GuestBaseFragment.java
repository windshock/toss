package viva.republica.toss.guest.certify.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseFragment;
import im.toss.features.verify.login.model.network.AuthPolicy;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinError;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.HexEncoder;
import o.PopupLayoutExternalSyntheticLambda0;
import o.RippleNode;
import o.SetDetectableSize;
import o.TextFieldKtExternalSyntheticLambda4;
import o.access13800;
import o.getMaxScale;
import o.getPhotoHeight;
import o.isJacksonCreator;
import o.setPopupContentSizefhxjrPA;
import o.setPositionProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.guest.certify.CertifyGuestViewModel;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class GuestBaseFragment extends BaseFragment {
    private final Lazy onExtraCallback;

    public GuestBaseFragment() {
        this.onExtraCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CertifyGuestViewModel.class), new onNavigationEvent(this), new onExtraCallback(null, this), new onExtraCallbackWithResult(this));
    }

    public GuestBaseFragment(int i) {
        super(i);
        this.onExtraCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CertifyGuestViewModel.class), new IAuthTabCallback(this), new onWarmupCompleted(null, this), new onTransact(this));
    }

    public final CertifyGuestViewModel onUnminimized() {
        return (CertifyGuestViewModel) this.onExtraCallback.getValue();
    }

    public static /* synthetic */ void IAuthTabCallback(GuestBaseFragment guestBaseFragment, int i, Bundle bundle, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        guestBaseFragment.onExtraCallback(i, bundle);
    }

    public final void onExtraCallback(final int i, @Nullable final Bundle bundle) {
        final setPositionProvider setpositionproviderOnExtraCallbackWithResult = PopupLayoutExternalSyntheticLambda0.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return GuestBaseFragment.onWarmupCompleted((setPopupContentSizefhxjrPA) obj);
            }
        });
        try {
            requireActivity().runOnUiThread(new Runnable() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    GuestBaseFragment.onNavigationEvent(this.f$0, i, bundle, setpositionproviderOnExtraCallbackWithResult);
                }
            });
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("GuestBaseFragment", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        setpopupcontentsizefhxjrpa.onExtraCallback(new Function1() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return GuestBaseFragment.onExtraCallback((TextFieldKtExternalSyntheticLambda4) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(TextFieldKtExternalSyntheticLambda4 textFieldKtExternalSyntheticLambda4) {
        Intrinsics.checkNotNullParameter(textFieldKtExternalSyntheticLambda4, "");
        textFieldKtExternalSyntheticLambda4.IAuthTabCallback(R.anim.anim_window_in_from_right);
        textFieldKtExternalSyntheticLambda4.onExtraCallbackWithResult(R.anim.anim_window_out_to_left);
        textFieldKtExternalSyntheticLambda4.onNavigationEvent(androidx.navigation.ui.R.anim.nav_default_pop_enter_anim);
        textFieldKtExternalSyntheticLambda4.onExtraCallback(androidx.navigation.ui.R.anim.nav_default_pop_exit_anim);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(GuestBaseFragment guestBaseFragment, int i, Bundle bundle, setPositionProvider setpositionprovider) {
        RippleNode.onNavigationEvent(guestBaseFragment).onWarmupCompleted(i, bundle, setpositionprovider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(GuestBaseFragment guestBaseFragment, Intent intent, Pair pair, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeActivity");
        }
        if ((i & 2) != 0) {
            pair = new Pair(Integer.valueOf(R.anim.anim_window_in_from_right), Integer.valueOf(R.anim.anim_window_out_to_left));
        }
        guestBaseFragment.onWarmupCompleted(intent, (Pair<Integer, Integer>) pair);
    }

    protected final void onWarmupCompleted(@NotNull Intent intent, @NotNull Pair<Integer, Integer> pair) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Object[] objArr = {onUnminimized()};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        if (((LiveData) CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, 327394819, -327394801, ICustomTabsCallbackStubProxy.onExtraCallback())).getValue() == AuthPolicy.SIGN_UP && onUnminimized().onExtraCallback()) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return GuestBaseFragment.onNavigationEvent(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
            return;
        }
        intent.addFlags(131072);
        startActivity(intent);
        isJacksonCreator.onExtraCallback onextracallback = isJacksonCreator.Companion;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        if (onextracallback.IAuthTabCallback(contextRequireContext2)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
                return;
            }
            return;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.overridePendingTransition(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(GuestBaseFragment guestBaseFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(guestBaseFragment.getString(R.string.guest_sign_up_requested_dialog_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(guestBaseFragment.getString(R.string.guest_sign_up_requested_dialog_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_confirm, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return GuestBaseFragment.onExtraCallbackWithResult((DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new DialogInterface.OnDismissListener() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda11
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                GuestBaseFragment.onExtraCallback(dialogInterface);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(DialogInterface dialogInterface) {
        AppLovinError.Companion.onExtraCallbackWithResult().IAuthTabCallback(false);
    }

    public final boolean onActivityResized() {
        Activity activity = getActivity();
        if (activity != null) {
            if (activity.isFinishing()) {
                activity = null;
            }
            if (activity != null) {
                return HexEncoder.onNavigationEvent(activity, false);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackDefault() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object onNavigationEvent(GuestBaseFragment guestBaseFragment, Function0 function0, Function1 function1, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withNonVisitorSmsGate-RgG5Fkc");
        }
        if ((i & 1) != 0) {
            function0 = new GuestBaseFragment$.ExternalSyntheticLambda3();
        }
        return guestBaseFragment.onWarmupCompleted((Function0<Unit>) function0, function1, access13800Var);
    }

    public final <T> Object onWarmupCompleted(@NotNull Function0<Unit> function0, @NotNull Function1<? super access13800<? super Result<? extends T>>, ? extends Object> function1, @NotNull access13800<? super Result<? extends T>> access13800Var) {
        if (!onActivityResized()) {
            function0.invoke();
            return null;
        }
        return function1.invoke(access13800Var);
    }

    public final void onRelationshipValidationResult() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return GuestBaseFragment.onNavigationEvent((CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.ask_stop_progress_and_back_to_entry_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.IAuthTabCallbackDefault(new Function1() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return GuestBaseFragment.IAuthTabCallbackDefault((DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2115179004, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -2115178997, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult4, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackDefault(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        AppLovinError.Companion.onExtraCallbackWithResult().IAuthTabCallback(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onNavigationEvent(GuestBaseFragment guestBaseFragment, String str, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEnrollmentClickEvent");
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        guestBaseFragment.onWarmupCompleted(str, (Function1<? super SetDetectableSize, Unit>) function1);
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable final Function1<? super SetDetectableSize, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        ConvertByteArrayToFloatArray.onWarmupCompleted(str, false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return GuestBaseFragment.onExtraCallback(this.f$0, function1, (SetDetectableSize) obj);
            }
        }, 28, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(GuestBaseFragment guestBaseFragment, Function1 function1, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("act_type", "enrollment_funnel");
        setDetectableSize.onExtraCallback("screen_name", guestBaseFragment.getScreenName());
        if (function1 != null) {
            function1.invoke(setDetectableSize);
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable final Function1<? super SetDetectableSize, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        ConvertByteArrayToFloatArray.onWarmupCompleted(str, false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return GuestBaseFragment.onNavigationEvent(this.f$0, function1, (SetDetectableSize) obj);
            }
        }, 28, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(GuestBaseFragment guestBaseFragment, Function1 function1, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "impression");
        setDetectableSize.onExtraCallback("act_type", "enrollment_funnel");
        setDetectableSize.onExtraCallback("screen_name", guestBaseFragment.getScreenName());
        if (function1 != null) {
            function1.invoke(setDetectableSize);
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallback(@NotNull Throwable th, @NotNull Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (th instanceof getPhotoHeight) {
            th = ((getPhotoHeight) th).getCause();
        }
        getMaxScale getmaxscale = getMaxScale.IAuthTabCallback;
        if (getmaxscale.IAuthTabCallback(th)) {
            getmaxscale.onNavigationEvent(requireBaseActivity(), onUnminimized().access100(), new Function0() { // from class: viva.republica.toss.guest.certify.fragment.GuestBaseFragment$$ExternalSyntheticLambda6
                public final Object invoke() {
                    return GuestBaseFragment.IAuthTabCallback(this.f$0);
                }
            });
        } else {
            function1.invoke(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(GuestBaseFragment guestBaseFragment) {
        guestBaseFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0, Fragment fragment) {
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
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    public static final class onTransact extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }
}
