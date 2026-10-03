package viva.republica.toss.common.accountchooser;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.activity.OnBackPressedCallback;
import androidx.core.widget.NestedScrollView;
import im.toss.base.BaseFragment;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import im.toss.uikit.widget.textView.top.TdsTopV1T05View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.Base64Encoder;
import o.CRYPT_VerifySignatureValue_NoAlgorithmInfo;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda7;
import o.CarouselKtExternalSyntheticLambda8;
import o.CarouselPagerStateExternalSyntheticLambda1;
import o.M_;
import o.PageContext;
import o.RecomposerawaitIdle2;
import o.ReusableRememberObserverHolder;
import o.RippleNode;
import o.SearchBarKtExternalSyntheticLambda5;
import o.TurboModuleInteropUtilsParsingException;
import o.addAllCommandLine;
import o.checkDeviceBrand;
import o.dangerouslyForceOverride;
import o.extraCommand;
import o.getSignForPKCS7V2;
import o.preFillDefault;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.widget.BankListView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class AbsAccountInputFragment extends BaseFragment {
    private final PageContext IAuthTabCallback;
    private Base64Encoder onExtraCallbackWithResult;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent = {new PropertyReference1Impl<>(AbsAccountInputFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentAbsAccountInputBinding;", 0)};
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onExtraCallback = 8;

    protected abstract CharSequence IAuthTabCallback();

    public long getScreenId() {
        return -1L;
    }

    protected abstract checkDeviceBrand onExtraCallbackWithResult();

    protected abstract void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2);

    protected abstract CharSequence onNavigationEvent();

    protected abstract Function1<Base64Encoder, Boolean> onWarmupCompleted();

    public AbsAccountInputFragment() {
        super(R.layout.fragment_abs_account_input);
        this.IAuthTabCallback = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.onNavigationEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted(Base64Encoder base64Encoder) throws Resources.NotFoundException {
        this.onExtraCallbackWithResult = base64Encoder;
        if (base64Encoder != null) {
            onNavigationEvent(base64Encoder);
        }
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, CRYPT_VerifySignatureValue_NoAlgorithmInfo> {
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();

        IAuthTabCallback() {
            super(1, CRYPT_VerifySignatureValue_NoAlgorithmInfo.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentAbsAccountInputBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CRYPT_VerifySignatureValue_NoAlgorithmInfo invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return CRYPT_VerifySignatureValue_NoAlgorithmInfo.onNavigationEvent(view);
        }
    }

    private final CRYPT_VerifySignatureValue_NoAlgorithmInfo asInterface() {
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(this, onNavigationEvent[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        return (CRYPT_VerifySignatureValue_NoAlgorithmInfo) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
    }

    private final TdsTopV1T03View IAuthTabCallbackDefault() {
        TdsTopV1T03View tdsTopV1T03View = asInterface().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1T03View, "");
        return tdsTopV1T03View;
    }

    private final TdsTopV1T05View onTransact() {
        TdsTopV1T05View tdsTopV1T05View = asInterface().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1T05View, "");
        return tdsTopV1T05View;
    }

    private final TdsTopV1T05View onExtraCallback() {
        TdsTopV1T05View tdsTopV1T05View = asInterface().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1T05View, "");
        return tdsTopV1T05View;
    }

    private final BankListView IAuthTabCallbackStub() {
        BankListView bankListView = asInterface().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(bankListView, "");
        return bankListView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeyboardBottomCta IAuthTabCallbackStubProxy() {
        KeyboardBottomCta keyboardBottomCta = asInterface().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        return keyboardBottomCta;
    }

    private final ViewFlipper access000() {
        ViewFlipper viewFlipper = asInterface().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(viewFlipper, "");
        return viewFlipper;
    }

    private final TdsTopV1T03View asBinder() {
        TdsTopV1T03View tdsTopV1T03View = asInterface().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1T03View, "");
        return tdsTopV1T03View;
    }

    private final TextFieldLine IAuthTabCallback_Parcel() {
        TextFieldLine textFieldLine = asInterface().asBinder;
        Intrinsics.checkNotNullExpressionValue(textFieldLine, "");
        return textFieldLine;
    }

    private final NestedScrollView access100() {
        NestedScrollView nestedScrollView = asInterface().onTransact;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        return nestedScrollView;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IAuthTabCallbackDefault().setText(IAuthTabCallback());
        CharSequence charSequenceOnNavigationEvent = onNavigationEvent();
        if (charSequenceOnNavigationEvent != null) {
            if (charSequenceOnNavigationEvent.length() <= 0) {
                charSequenceOnNavigationEvent = null;
            }
            if (charSequenceOnNavigationEvent != null) {
                TdsTopV1T05View tdsTopV1T05ViewOnTransact = onTransact();
                tdsTopV1T05ViewOnTransact.setText(charSequenceOnNavigationEvent);
                tdsTopV1T05ViewOnTransact.setVisibility(0);
                TdsTopV1T05View tdsTopV1T05ViewOnExtraCallback = onExtraCallback();
                tdsTopV1T05ViewOnExtraCallback.setText(charSequenceOnNavigationEvent);
                tdsTopV1T05ViewOnExtraCallback.setVisibility(0);
            }
        }
        BankListView bankListViewIAuthTabCallbackStub = IAuthTabCallbackStub();
        BankListView.onWarmupCompleted(bankListViewIAuthTabCallbackStub, false, (String) null, onExtraCallbackWithResult(), onWarmupCompleted(), 3, (Object) null);
        bankListViewIAuthTabCallbackStub.setItemClickListener(new onExtraCallback());
        bankListViewIAuthTabCallbackStub.setNestedScrollingEnabled(false);
        TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted = IAuthTabCallbackStubProxy().onWarmupCompleted();
        tdsButtonV1ViewOnWarmupCompleted.setEnabled(false);
        tdsButtonV1ViewOnWarmupCompleted.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.common.accountchooser.AbsAccountInputFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbsAccountInputFragment.onExtraCallback(this.f$0, view2);
            }
        });
        extraCommand.IAuthTabCallback(requireActivity().getOnBackPressedDispatcher(), this, false, new Function1() { // from class: viva.republica.toss.common.accountchooser.AbsAccountInputFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return AbsAccountInputFragment.onExtraCallbackWithResult(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 2, (Object) null);
    }

    public static final class onExtraCallbackWithResult implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onExtraCallbackWithResult() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbsAccountInputFragment.this.IAuthTabCallbackStubProxy().onWarmupCompleted().setEnabled(editable != null && editable.length() >= 7);
        }
    }

    public static final class onExtraCallback implements TurboModuleInteropUtilsParsingException {
        onExtraCallback() {
        }

        public /* bridge */ void onNavigationEvent() {
            super.onNavigationEvent();
        }

        public void onNavigationEvent(Base64Encoder base64Encoder) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(base64Encoder, "");
            AbsAccountInputFragment.this.onWarmupCompleted(base64Encoder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(AbsAccountInputFragment absAccountInputFragment, View view) {
        absAccountInputFragment.getInterfaceDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(AbsAccountInputFragment absAccountInputFragment, OnBackPressedCallback onBackPressedCallback) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        if (absAccountInputFragment.onExtraCallbackWithResult(absAccountInputFragment.access000())) {
            return Unit.INSTANCE;
        }
        if (absAccountInputFragment.access000().getDisplayedChild() > 0) {
            absAccountInputFragment.onWarmupCompleted((Base64Encoder) null);
            absAccountInputFragment.onWarmupCompleted(absAccountInputFragment.access000());
            return Unit.INSTANCE;
        }
        RippleNode.onNavigationEvent(absAccountInputFragment).getInterfaceDescriptor();
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(Base64Encoder base64Encoder) throws Resources.NotFoundException {
        asBinder().setText(getString(R.string.app_common_accountchooser___c74102c2d0, new Object[]{getSignForPKCS7V2.onWarmupCompleted.asBinder(String.valueOf(base64Encoder.IAuthTabCallback()))}));
        EditText editText = IAuthTabCallback_Parcel().getEditText();
        if (editText != null) {
            editText.setText((CharSequence) null);
            editText.setHint(getString(R.string.app_common_accountchooser___10f36bba09));
            editText.setInputType(2);
            editText.setImeOptions(6);
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(15)});
            DisplayMetrics displayMetrics = editText.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            editText.setCompoundDrawablePadding(varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics));
            Context context = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
            Context context2 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent(context2).onExtraCallback(base64Encoder.onWarmupCompleted()).onNavigationEvent(varyMatches.IAuthTabCallback(editText, 24)).IAuthTabCallback(new onWarmupCompleted(editText)).onExtraCallbackWithResult());
            editText.addTextChangedListener(new onExtraCallbackWithResult());
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: viva.republica.toss.common.accountchooser.AbsAccountInputFragment$$ExternalSyntheticLambda1
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return AbsAccountInputFragment.onNavigationEvent(this.f$0, textView, i, keyEvent);
                }
            });
        }
        onNavigationEvent(access000());
    }

    public static final class onWarmupCompleted implements ReusableRememberObserverHolder {
        final /* synthetic */ EditText onExtraCallback;

        onWarmupCompleted(EditText editText) {
            this.onExtraCallback = editText;
        }

        public /* bridge */ void IAuthTabCallback(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            super.IAuthTabCallback(carouselKtExternalSyntheticLambda7);
        }

        public /* bridge */ void onWarmupCompleted(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            super.onWarmupCompleted(carouselKtExternalSyntheticLambda7);
        }

        public void onExtraCallbackWithResult(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda7, "");
            EditText editText = this.onExtraCallback;
            Resources resources = editText.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            editText.setCompoundDrawablesWithIntrinsicBounds(CarouselPagerStateExternalSyntheticLambda1.onWarmupCompleted(carouselKtExternalSyntheticLambda7, resources), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(AbsAccountInputFragment absAccountInputFragment, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        absAccountInputFragment.getInterfaceDescriptor();
        return false;
    }

    private final void getInterfaceDescriptor() {
        String strValueOf;
        EditText editText;
        Editable text;
        String string;
        Base64Encoder base64Encoder = this.onExtraCallbackWithResult;
        if (base64Encoder == null || (strValueOf = String.valueOf(base64Encoder.IAuthTabCallback())) == null || (editText = IAuthTabCallback_Parcel().getEditText()) == null || (text = editText.getText()) == null || (string = text.toString()) == null) {
            return;
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            onExtraCallbackWithResult(strValueOf, string);
        }
    }

    private final void readTypedObject() {
        boolean z = access000().getDisplayedChild() == 1;
        IAuthTabCallbackStubProxy().setVisibility(z ? 0 : 4);
        if (z) {
            if (canShowSoftInput(IAuthTabCallback_Parcel().getEditText())) {
                M_.onNavigationEvent(1312897292, new Object[]{M_.onExtraCallback, IAuthTabCallback_Parcel().getEditText()}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
            }
        } else {
            M_.onExtraCallback.onExtraCallback(IAuthTabCallback_Parcel().getEditText());
            access000().postOnAnimation(new Runnable() { // from class: viva.republica.toss.common.accountchooser.AbsAccountInputFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AbsAccountInputFragment.onExtraCallback(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(AbsAccountInputFragment absAccountInputFragment) {
        absAccountInputFragment.access100().scrollTo(0, 0);
    }

    private final void onNavigationEvent(ViewFlipper viewFlipper) throws Resources.NotFoundException {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(viewFlipper.getContext(), R.anim.slide_in_left);
        dangerouslyForceOverride dangerouslyforceoverride = dangerouslyForceOverride.onExtraCallbackWithResult;
        animationLoadAnimation.setInterpolator(dangerouslyforceoverride.IAuthTabCallback());
        animationLoadAnimation.setDuration(300L);
        viewFlipper.setInAnimation(animationLoadAnimation);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(viewFlipper.getContext(), R.anim.slide_out_left);
        animationLoadAnimation2.setInterpolator(dangerouslyforceoverride.IAuthTabCallback());
        animationLoadAnimation2.setDuration(300L);
        viewFlipper.setOutAnimation(animationLoadAnimation2);
        viewFlipper.showNext();
        readTypedObject();
    }

    private final void onWarmupCompleted(ViewFlipper viewFlipper) throws Resources.NotFoundException {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(viewFlipper.getContext(), R.anim.slide_in_right);
        dangerouslyForceOverride dangerouslyforceoverride = dangerouslyForceOverride.onExtraCallbackWithResult;
        animationLoadAnimation.setInterpolator(dangerouslyforceoverride.IAuthTabCallback());
        animationLoadAnimation.setDuration(300L);
        viewFlipper.setInAnimation(animationLoadAnimation);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(viewFlipper.getContext(), R.anim.slide_out_right);
        animationLoadAnimation2.setInterpolator(dangerouslyforceoverride.IAuthTabCallback());
        animationLoadAnimation2.setDuration(300L);
        viewFlipper.setOutAnimation(animationLoadAnimation2);
        viewFlipper.showPrevious();
        readTypedObject();
    }

    private final boolean onExtraCallbackWithResult(ViewFlipper viewFlipper) {
        Animation inAnimation = viewFlipper.getInAnimation();
        if (inAnimation != null && !inAnimation.hasEnded()) {
            return true;
        }
        Animation outAnimation = viewFlipper.getOutAnimation();
        return (outAnimation == null || outAnimation.hasEnded()) ? false : true;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
