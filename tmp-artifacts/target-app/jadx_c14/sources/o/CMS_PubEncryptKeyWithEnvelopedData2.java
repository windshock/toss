package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.NumpadView;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;
import viva.republica.toss.send.v4.widget.AmountInputRow;
import viva.republica.toss.send.v4.widget.DepositInfoRow;
import viva.republica.toss.send.v4.widget.TransferConfirmView;
import viva.republica.toss.send.v4.widget.WithdrawInfoRow;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_PubEncryptKeyWithEnvelopedData2 implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    public final LinearLayout IAuthTabCallbackDefault;
    public final Typography6 IAuthTabCallbackStub;
    public final LinearLayout IAuthTabCallbackStubProxy;
    public final TdsButtonV1View IAuthTabCallback_Parcel;
    public final TdsButtonV1View ICustomTabsCallback;
    public final NumpadView access000;
    public final ProgressBar access100;
    public final ScrollView asBinder;
    public final View asInterface;
    public final ConstraintLayout extraCallback;
    public final ConstraintLayout extraCallbackWithResult;
    public final FrameLayout getInterfaceDescriptor;
    private final ConstraintLayout onActivityLayout;
    public final WithdrawInfoRow onActivityResized;
    public final DepositInfoRow onExtraCallback;
    public final TdsButtonV1View onExtraCallbackWithResult;
    public final View onMessageChannelReady;
    public final TransferConfirmView onMinimized;
    public final TdsButtonV1View onNavigationEvent;
    public final Toolbar onPostMessage;
    public final Barrier onTransact;
    public final AmountInputRow onWarmupCompleted;
    public final ConstraintLayout readTypedObject;
    public final FrameLayout writeTypedObject;

    private CMS_PubEncryptKeyWithEnvelopedData2(@NonNull ConstraintLayout constraintLayout, @NonNull AmountInputRow amountInputRow, @NonNull AppBarLayout appBarLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull TdsButtonV1View tdsButtonV1View2, @NonNull DepositInfoRow depositInfoRow, @NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout, @NonNull Typography6 typography6, @NonNull View view, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull TdsButtonV1View tdsButtonV1View3, @NonNull NumpadView numpadView, @NonNull LinearLayout linearLayout2, @NonNull ProgressBar progressBar, @NonNull FrameLayout frameLayout2, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsButtonV1View tdsButtonV1View4, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull View view2, @NonNull Toolbar toolbar, @NonNull TransferConfirmView transferConfirmView, @NonNull WithdrawInfoRow withdrawInfoRow) {
        this.onActivityLayout = constraintLayout;
        this.onWarmupCompleted = amountInputRow;
        this.IAuthTabCallback = appBarLayout;
        this.onExtraCallbackWithResult = tdsButtonV1View;
        this.onNavigationEvent = tdsButtonV1View2;
        this.onExtraCallback = depositInfoRow;
        this.asBinder = scrollView;
        this.IAuthTabCallbackDefault = linearLayout;
        this.IAuthTabCallbackStub = typography6;
        this.asInterface = view;
        this.onTransact = barrier;
        this.getInterfaceDescriptor = frameLayout;
        this.IAuthTabCallback_Parcel = tdsButtonV1View3;
        this.access000 = numpadView;
        this.IAuthTabCallbackStubProxy = linearLayout2;
        this.access100 = progressBar;
        this.writeTypedObject = frameLayout2;
        this.extraCallback = constraintLayout2;
        this.ICustomTabsCallback = tdsButtonV1View4;
        this.extraCallbackWithResult = constraintLayout3;
        this.readTypedObject = constraintLayout4;
        this.onMessageChannelReady = view2;
        this.onPostMessage = toolbar;
        this.onMinimized = transferConfirmView;
        this.onActivityResized = withdrawInfoRow;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onActivityLayout;
    }

    public static CMS_PubEncryptKeyWithEnvelopedData2 onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CMS_PubEncryptKeyWithEnvelopedData2 onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_transfer_send, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static CMS_PubEncryptKeyWithEnvelopedData2 onWarmupCompleted(@NonNull View view) {
        AppBarLayout appBarLayoutOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent2;
        DepositInfoRow depositInfoRowOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        View viewOnNavigationEvent;
        Barrier barrierOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent3;
        NumpadView numpadViewOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent2;
        View viewOnNavigationEvent2;
        Toolbar toolbarOnNavigationEvent;
        TransferConfirmView transferConfirmViewOnNavigationEvent;
        WithdrawInfoRow withdrawInfoRowOnNavigationEvent;
        int i = R.id.amount_row;
        AmountInputRow amountInputRowOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (amountInputRowOnNavigationEvent != null && (appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.app_bar_layout))) != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.confirm_cta))) != null && (tdsButtonV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.confirm_fixed_amount_cta))) != null && (depositInfoRowOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.deposit_info_row))) != null) {
            i = R.id.deposit_info_scroll_view;
            ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (scrollView != null) {
                i = R.id.deposit_info_wrapper;
                LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (linearLayout != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.fee_message))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.init_touch_blocker))) != null && (barrierOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input_barrier))) != null) {
                    i = R.id.lab_frame_layout;
                    FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (frameLayout != null && (tdsButtonV1ViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.message_row))) != null && (numpadViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.numpad))) != null) {
                        i = R.id.numpad_wrapper;
                        LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.progress_bar;
                            ProgressBar progressBar = (ProgressBar) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                            if (progressBar != null) {
                                i = R.id.progress_cover_container;
                                FrameLayout frameLayout2 = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                if (frameLayout2 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i = R.id.send_cta;
                                    TdsButtonV1View tdsButtonV1ViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                    if (tdsButtonV1ViewOnNavigationEvent4 != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.send_cta_wrapper))) != null && (constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.send_input_container))) != null && (viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.send_touch_blocker))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (transferConfirmViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.transfer_confirm_view))) != null && (withdrawInfoRowOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.withdraw_account_row))) != null) {
                                        return new CMS_PubEncryptKeyWithEnvelopedData2(constraintLayout, amountInputRowOnNavigationEvent, appBarLayoutOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent2, depositInfoRowOnNavigationEvent, scrollView, linearLayout, typography6OnNavigationEvent, viewOnNavigationEvent, barrierOnNavigationEvent, frameLayout, tdsButtonV1ViewOnNavigationEvent3, numpadViewOnNavigationEvent, linearLayout2, progressBar, frameLayout2, constraintLayout, tdsButtonV1ViewOnNavigationEvent4, constraintLayoutOnNavigationEvent, constraintLayoutOnNavigationEvent2, viewOnNavigationEvent2, toolbarOnNavigationEvent, transferConfirmViewOnNavigationEvent, withdrawInfoRowOnNavigationEvent);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
