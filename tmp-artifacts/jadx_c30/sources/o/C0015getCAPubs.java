package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import viva.republica.toss.R;

/* renamed from: o.getCAPubs, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class C0015getCAPubs implements SearchBarKtExternalSyntheticLambda5 {
    private final FrameLayout IAuthTabCallback;
    public final Typography6 onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;

    private C0015getCAPubs(@NonNull FrameLayout frameLayout, @NonNull TdsImageView tdsImageView, @NonNull Typography6 typography6) {
        this.IAuthTabCallback = frameLayout;
        this.onNavigationEvent = tdsImageView;
        this.onExtraCallbackWithResult = typography6;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static C0015getCAPubs IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_account_agreement_term, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static C0015getCAPubs onExtraCallbackWithResult(@NonNull View view) {
        Typography6 typography6OnNavigationEvent;
        int i = R.id.arrow;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsImageViewOnNavigationEvent != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            return new C0015getCAPubs((FrameLayout) view, tdsImageViewOnNavigationEvent, typography6OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
