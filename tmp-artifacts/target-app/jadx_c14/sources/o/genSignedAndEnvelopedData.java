package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography6;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class genSignedAndEnvelopedData implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsButtonV1View IAuthTabCallback;
    public final View IAuthTabCallbackDefault;
    public final Typography6 IAuthTabCallbackStub;
    public final Typography3 asBinder;
    public final LinearLayout asInterface;
    public final View onExtraCallback;
    public final TdsButtonV1View onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    private final View onTransact;
    public final TdsButtonV1View onWarmupCompleted;

    private genSignedAndEnvelopedData(@NonNull View view, @NonNull TdsImageView tdsImageView, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull TdsButtonV1View tdsButtonV1View2, @NonNull TdsButtonV1View tdsButtonV1View3, @NonNull View view2, @NonNull View view3, @NonNull Typography3 typography3, @NonNull Typography6 typography6, @NonNull LinearLayout linearLayout) {
        this.onTransact = view;
        this.onNavigationEvent = tdsImageView;
        this.onExtraCallbackWithResult = tdsButtonV1View;
        this.onWarmupCompleted = tdsButtonV1View2;
        this.IAuthTabCallback = tdsButtonV1View3;
        this.onExtraCallback = view2;
        this.IAuthTabCallbackDefault = view3;
        this.asBinder = typography3;
        this.IAuthTabCallbackStub = typography6;
        this.asInterface = linearLayout;
    }

    public View getRoot() {
        return this.onTransact;
    }

    public static genSignedAndEnvelopedData onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_amount_input_row, viewGroup);
        return onExtraCallbackWithResult(viewGroup);
    }

    public static genSignedAndEnvelopedData onExtraCallbackWithResult(@NonNull View view) {
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent2;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent3;
        View viewOnNavigationEvent;
        View viewOnNavigationEvent2;
        Typography3 typography3OnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        int i = R.id.arrow;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsImageViewOnNavigationEvent != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.button1))) != null && (tdsButtonV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.button2))) != null && (tdsButtonV1ViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.button3))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.cursor))) != null && (viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.line))) != null && (typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text1))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text2))) != null) {
            i = R.id.view_over_limit;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null) {
                return new genSignedAndEnvelopedData(view, tdsImageViewOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent2, tdsButtonV1ViewOnNavigationEvent3, viewOnNavigationEvent, viewOnNavigationEvent2, typography3OnNavigationEvent, typography6OnNavigationEvent, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
