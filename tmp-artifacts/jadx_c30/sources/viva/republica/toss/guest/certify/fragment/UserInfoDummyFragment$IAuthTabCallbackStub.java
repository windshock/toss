package viva.republica.toss.guest.certify.fragment;

import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.FragmentActivity;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.ConvertFloatArrayToByteArray;
import o.ICustomTabsCallback_Parcel;
import o.PopupLayoutExternalSyntheticLambda0;
import o.RippleNode;
import o.TextFieldKtExternalSyntheticLambda4;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getPackageType;
import o.setPopupContentSizefhxjrPA;
import o.setPositionProvider;
import viva.republica.toss.R;
import viva.republica.toss.guest.certify.fragment.UserInfoDummyFragment$IAuthTabCallbackStub;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class UserInfoDummyFragment$IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    int label;
    final /* synthetic */ UserInfoDummyFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserInfoDummyFragment$IAuthTabCallbackStub(UserInfoDummyFragment userInfoDummyFragment, access13800<? super UserInfoDummyFragment$IAuthTabCallbackStub> access13800Var) {
        super(2, access13800Var);
        this.this$0 = userInfoDummyFragment;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new UserInfoDummyFragment$IAuthTabCallbackStub(this.this$0, access13800Var);
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FragmentActivity activity;
        ICustomTabsCallback_Parcel onBackPressedDispatcher;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            getPackageType getpackagetypeIAuthTabCallbackDefault = this.this$0.onUnminimized().IAuthTabCallbackDefault();
            if (getpackagetypeIAuthTabCallbackDefault != null) {
                this.label = 1;
                if (getpackagetypeIAuthTabCallbackDefault.onNavigationEvent(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        if (this.this$0.onUnminimized().mayLaunchUrl() && (activity = this.this$0.getActivity()) != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, BuildConfig.FLAVOR);
            onBackPressedDispatcher.onExtraCallbackWithResult(viewLifecycleOwner, new AnonymousClass1(this.this$0));
        }
        UserInfoDummyFragment.onNavigationEvent(new Object[]{this.this$0}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1903249268, -1903249255);
        UserInfoDummyFragment.onWarmupCompleted(this.this$0);
        return Unit.INSTANCE;
    }

    /* renamed from: viva.republica.toss.guest.certify.fragment.UserInfoDummyFragment$IAuthTabCallbackStub$1, reason: invalid class name */
    public static final class AnonymousClass1 extends OnBackPressedCallback {
        final /* synthetic */ UserInfoDummyFragment IAuthTabCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UserInfoDummyFragment userInfoDummyFragment) {
            super(true);
            this.IAuthTabCallback = userInfoDummyFragment;
        }

        public void handleOnBackPressed() {
            this.IAuthTabCallback.onUnminimized().onTransact(!this.IAuthTabCallback.onPostMessage() || this.IAuthTabCallback.onUnminimized().onMinimized());
            final setPositionProvider setpositionproviderOnExtraCallbackWithResult = PopupLayoutExternalSyntheticLambda0.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.guest.certify.fragment.UserInfoDummyFragment$onViewCreated$1$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return UserInfoDummyFragment$IAuthTabCallbackStub.AnonymousClass1.onNavigationEvent((setPopupContentSizefhxjrPA) obj);
                }
            });
            try {
                FragmentActivity fragmentActivityRequireActivity = this.IAuthTabCallback.requireActivity();
                final UserInfoDummyFragment userInfoDummyFragment = this.IAuthTabCallback;
                fragmentActivityRequireActivity.runOnUiThread(new Runnable() { // from class: viva.republica.toss.guest.certify.fragment.UserInfoDummyFragment$onViewCreated$1$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserInfoDummyFragment$IAuthTabCallbackStub.AnonymousClass1.onNavigationEvent(userInfoDummyFragment, setpositionproviderOnExtraCallbackWithResult);
                    }
                });
            } catch (Exception e) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("GuestBaseFragment", e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onNavigationEvent(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
            Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, BuildConfig.FLAVOR);
            setpopupcontentsizefhxjrpa.onExtraCallback(new Function1() { // from class: viva.republica.toss.guest.certify.fragment.UserInfoDummyFragment$onViewCreated$1$1$$ExternalSyntheticLambda2
                public final Object invoke(Object obj) {
                    return UserInfoDummyFragment$IAuthTabCallbackStub.AnonymousClass1.onExtraCallback((TextFieldKtExternalSyntheticLambda4) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallback(TextFieldKtExternalSyntheticLambda4 textFieldKtExternalSyntheticLambda4) {
            Intrinsics.checkNotNullParameter(textFieldKtExternalSyntheticLambda4, BuildConfig.FLAVOR);
            textFieldKtExternalSyntheticLambda4.onExtraCallback(R.anim.anim_window_in_from_right);
            textFieldKtExternalSyntheticLambda4.onExtraCallback(R.anim.anim_window_out_to_left);
            textFieldKtExternalSyntheticLambda4.IAuthTabCallback(androidx.navigation.ui.R.anim.nav_default_pop_enter_anim);
            textFieldKtExternalSyntheticLambda4.onExtraCallbackWithResult(androidx.navigation.ui.R.anim.nav_default_pop_exit_anim);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onNavigationEvent(UserInfoDummyFragment userInfoDummyFragment, setPositionProvider setpositionprovider) {
            RippleNode.onNavigationEvent(userInfoDummyFragment).onWarmupCompleted(R.id.action_userInfoDummyFragment_to_loginNudgeFragment, (Bundle) null, setpositionprovider);
        }
    }
}
