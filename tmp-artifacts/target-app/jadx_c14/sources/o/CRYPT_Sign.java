package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.TdsSegmentedControlV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.dialog.BottomSheetSwitcher;
import im.toss.uikit.widget.grid.TdsListGridV1View;
import im.toss.uikit.widget.textField.TextField;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CRYPT_Sign implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsButtonV1View IAuthTabCallback;
    public final BottomSheetHeader IAuthTabCallbackDefault;
    public final LinearLayout IAuthTabCallbackStub;
    private final BottomSheetSwitcher IAuthTabCallbackStubProxy;
    public final TdsListGridV1View asBinder;
    public final TdsSegmentedControlV1View asInterface;
    public final BottomSheetSwitcher onExtraCallback;
    public final TdsListGridV1View onExtraCallbackWithResult;
    public final TextField onNavigationEvent;
    public final ConstraintLayout onTransact;
    public final TdsListGridV1View onWarmupCompleted;

    private CRYPT_Sign(@NonNull BottomSheetSwitcher bottomSheetSwitcher, @NonNull BottomSheetSwitcher bottomSheetSwitcher2, @NonNull TdsListGridV1View tdsListGridV1View, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull TdsListGridV1View tdsListGridV1View2, @NonNull TextField textField, @NonNull TdsListGridV1View tdsListGridV1View3, @NonNull TdsSegmentedControlV1View tdsSegmentedControlV1View, @NonNull ConstraintLayout constraintLayout, @NonNull BottomSheetHeader bottomSheetHeader, @NonNull LinearLayout linearLayout) {
        this.IAuthTabCallbackStubProxy = bottomSheetSwitcher;
        this.onExtraCallback = bottomSheetSwitcher2;
        this.onExtraCallbackWithResult = tdsListGridV1View;
        this.IAuthTabCallback = tdsButtonV1View;
        this.onWarmupCompleted = tdsListGridV1View2;
        this.onNavigationEvent = textField;
        this.asBinder = tdsListGridV1View3;
        this.asInterface = tdsSegmentedControlV1View;
        this.onTransact = constraintLayout;
        this.IAuthTabCallbackDefault = bottomSheetHeader;
        this.IAuthTabCallbackStub = linearLayout;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public BottomSheetSwitcher getRoot() {
        return this.IAuthTabCallbackStubProxy;
    }

    public static CRYPT_Sign onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CRYPT_Sign onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_input_broker_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CRYPT_Sign onExtraCallback(@NonNull View view) {
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        TdsListGridV1View tdsListGridV1ViewOnNavigationEvent;
        TextField textFieldOnNavigationEvent;
        TdsListGridV1View tdsListGridV1ViewOnNavigationEvent2;
        TdsSegmentedControlV1View tdsSegmentedControlV1ViewOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        BottomSheetHeader bottomSheetHeaderOnNavigationEvent;
        BottomSheetSwitcher bottomSheetSwitcher = (BottomSheetSwitcher) view;
        int i = R.id.broker_apt;
        TdsListGridV1View tdsListGridV1ViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsListGridV1ViewOnNavigationEvent3 != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.broker_button))) != null && (tdsListGridV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.broker_car))) != null && (textFieldOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.broker_input))) != null && (tdsListGridV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.broker_name))) != null && (tdsSegmentedControlV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.broker_tab))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.dst_container))) != null && (bottomSheetHeaderOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header))) != null) {
            i = R.id.src_container;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null) {
                return new CRYPT_Sign(bottomSheetSwitcher, bottomSheetSwitcher, tdsListGridV1ViewOnNavigationEvent3, tdsButtonV1ViewOnNavigationEvent, tdsListGridV1ViewOnNavigationEvent, textFieldOnNavigationEvent, tdsListGridV1ViewOnNavigationEvent2, tdsSegmentedControlV1ViewOnNavigationEvent, constraintLayoutOnNavigationEvent, bottomSheetHeaderOnNavigationEvent, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
