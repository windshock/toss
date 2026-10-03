package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textField.TextFieldLine;
import viva.republica.toss.R;
import viva.republica.toss.widget.BankListView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_Init implements SearchBarKtExternalSyntheticLambda5 {
    public final KeyboardBottomCta IAuthTabCallback;
    public final TextFieldLine IAuthTabCallbackDefault;
    public final TdsButtonV1View IAuthTabCallbackStub;
    public final View IAuthTabCallback_Parcel;
    public final TdsTopV2View asBinder;
    public final Barrier asInterface;
    private final FrameLayout getInterfaceDescriptor;
    public final BankListView onExtraCallback;
    public final RecyclerView onExtraCallbackWithResult;
    public final TextFieldLine onNavigationEvent;
    public final Toolbar onTransact;
    public final AppBarLayout onWarmupCompleted;

    private CERT_Init(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull BankListView bankListView, @NonNull RecyclerView recyclerView, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull TextFieldLine textFieldLine, @NonNull TextFieldLine textFieldLine2, @NonNull Barrier barrier, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull Toolbar toolbar, @NonNull TdsTopV2View tdsTopV2View, @NonNull View view) {
        this.getInterfaceDescriptor = frameLayout;
        this.onWarmupCompleted = appBarLayout;
        this.onExtraCallback = bankListView;
        this.onExtraCallbackWithResult = recyclerView;
        this.IAuthTabCallback = keyboardBottomCta;
        this.onNavigationEvent = textFieldLine;
        this.IAuthTabCallbackDefault = textFieldLine2;
        this.asInterface = barrier;
        this.IAuthTabCallbackStub = tdsButtonV1View;
        this.onTransact = toolbar;
        this.asBinder = tdsTopV2View;
        this.IAuthTabCallback_Parcel = view;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.getInterfaceDescriptor;
    }

    public static CERT_Init onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CERT_Init onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_legacy_account_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CERT_Init onExtraCallback(@NonNull View view) {
        BankListView bankListViewOnNavigationEvent;
        RecyclerView recyclerViewOnNavigationEvent;
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent2;
        Barrier barrierOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        View viewOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (bankListViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bankList))) != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bankPredictList))) != null && (keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.confirm))) != null && (textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputAccountHolder))) != null && (textFieldLineOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputAccountNumber))) != null && (barrierOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputBarrier))) != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recommendAccountButton))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.touch_interceptor))) != null) {
            return new CERT_Init((FrameLayout) view, appBarLayoutOnNavigationEvent, bankListViewOnNavigationEvent, recyclerViewOnNavigationEvent, keyboardBottomCtaOnNavigationEvent, textFieldLineOnNavigationEvent, textFieldLineOnNavigationEvent2, barrierOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV2ViewOnNavigationEvent, viewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
