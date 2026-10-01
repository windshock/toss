package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.text.Typography7;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RevokeCertificate implements SearchBarKtExternalSyntheticLambda5 {
    private final LinearLayout onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    public final Typography7 onWarmupCompleted;

    private RevokeCertificate(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull Typography7 typography7) {
        this.onExtraCallbackWithResult = linearLayout;
        this.onNavigationEvent = linearLayout2;
        this.onWarmupCompleted = typography7;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static RevokeCertificate onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_typhography7, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static RevokeCertificate onNavigationEvent(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.text;
        Typography7 typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (typography7OnNavigationEvent != null) {
            return new RevokeCertificate(linearLayout, linearLayout, typography7OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
