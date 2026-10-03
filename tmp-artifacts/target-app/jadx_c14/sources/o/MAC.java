package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography6;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MAC implements SearchBarKtExternalSyntheticLambda5 {
    public final LinearLayout IAuthTabCallback;
    public final Typography6 IAuthTabCallbackStub;
    public final View asInterface;
    public final TdsImageView onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final RelativeLayout onNavigationEvent;
    private final LinearLayout onTransact;
    public final Typography3 onWarmupCompleted;

    private MAC(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TdsImageView tdsImageView, @NonNull Typography3 typography3, @NonNull TdsImageView tdsImageView2, @NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull Typography6 typography6) {
        this.onTransact = linearLayout;
        this.IAuthTabCallback = linearLayout2;
        this.onExtraCallbackWithResult = tdsImageView;
        this.onWarmupCompleted = typography3;
        this.onExtraCallback = tdsImageView2;
        this.onNavigationEvent = relativeLayout;
        this.asInterface = view;
        this.IAuthTabCallbackStub = typography6;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onTransact;
    }

    public static MAC onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_transfer_message_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static MAC onWarmupCompleted(@NonNull View view) {
        Typography3 typography3OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        View viewOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.delete_button;
        TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsImageViewOnNavigationEvent2 != null && (typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.emoji))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.icon))) != null) {
            i = R.id.icon_background;
            RelativeLayout relativeLayout = (RelativeLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (relativeLayout != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.no_delete_margin))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text))) != null) {
                return new MAC(linearLayout, linearLayout, tdsImageViewOnNavigationEvent2, typography3OnNavigationEvent, tdsImageViewOnNavigationEvent, relativeLayout, viewOnNavigationEvent, typography6OnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
