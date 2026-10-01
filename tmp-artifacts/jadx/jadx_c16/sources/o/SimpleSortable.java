package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.home.core.ui.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.TdsRoundLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SimpleSortable implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final ConstraintLayout onExtraCallback;
    public final TdsRoundLayout onExtraCallbackWithResult;
    public final TdsImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        ConstraintLayout constraintLayoutIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            constraintLayoutIAuthTabCallback = IAuthTabCallback();
            int i3 = 30 / 0;
        } else {
            constraintLayoutIAuthTabCallback = IAuthTabCallback();
        }
        int i4 = IAuthTabCallback + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayoutIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SimpleSortable(@NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView, @NonNull TdsRoundLayout tdsRoundLayout) {
        this.onExtraCallback = constraintLayout;
        this.onWarmupCompleted = tdsImageView;
        this.onExtraCallbackWithResult = tdsRoundLayout;
    }

    public ConstraintLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.onExtraCallback;
        int i4 = i2 + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static SimpleSortable onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.home_v2_core_ui_dynamic_intelligence_inner_close_view, viewGroup, false);
        if (z) {
            int i4 = onNavigationEvent + 81;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 95 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        return IAuthTabCallback(viewInflate);
    }

    public static SimpleSortable IAuthTabCallback(@NonNull View view) {
        int i = 2 % 2;
        int i2 = R.id.closeImageView;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (tdsImageViewOnNavigationEvent != null) {
            int i3 = IAuthTabCallback + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.container;
            TdsRoundLayout tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (tdsRoundLayoutOnNavigationEvent != null) {
                SimpleSortable simpleSortable = new SimpleSortable((ConstraintLayout) view, tdsImageViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent);
                int i5 = IAuthTabCallback + 115;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return simpleSortable;
                }
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
