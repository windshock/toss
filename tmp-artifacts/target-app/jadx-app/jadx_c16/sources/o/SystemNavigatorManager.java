package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import im.toss.features.benefit.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SystemNavigatorManager implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    public final Typography6 IAuthTabCallback;
    public final View IAuthTabCallbackStub;
    private final ConstraintLayout asInterface;
    public final TdsRoundLayout onExtraCallback;
    public final View onExtraCallbackWithResult;
    public final Guideline onNavigationEvent;
    public final TdsImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    private SystemNavigatorManager(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull View view, @NonNull TdsImageView tdsImageView, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull Typography6 typography6, @NonNull View view2) {
        this.asInterface = constraintLayout;
        this.onNavigationEvent = guideline;
        this.onExtraCallbackWithResult = view;
        this.onWarmupCompleted = tdsImageView;
        this.onExtraCallback = tdsRoundLayout;
        this.IAuthTabCallback = typography6;
        this.IAuthTabCallbackStub = view2;
    }

    public ConstraintLayout IAuthTabCallback() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 71;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            constraintLayout = this.asInterface;
            int i4 = 43 / 0;
        } else {
            constraintLayout = this.asInterface;
        }
        int i5 = i2 + 19;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static SystemNavigatorManager IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.benefit_slim_point_section, viewGroup, false);
        if (z) {
            int i4 = IAuthTabCallbackDefault + 73;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return IAuthTabCallback(viewInflate);
    }

    public static SystemNavigatorManager IAuthTabCallback(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        View viewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.centerHorizontalGuideline;
        Guideline guidelineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (guidelineOnNavigationEvent != null) {
            int i3 = onTransact + 49;
            IAuthTabCallbackDefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                i2 = R.id.leftDivider;
                View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (viewOnNavigationEvent2 != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.pointIcon))) != null) {
                    int i4 = onTransact + 35;
                    IAuthTabCallbackDefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        i2 = R.id.pointLayout;
                        TdsRoundLayout tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (tdsRoundLayoutOnNavigationEvent != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.pointText))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.rightDivider))) != null) {
                            return new SystemNavigatorManager((ConstraintLayout) view, guidelineOnNavigationEvent, viewOnNavigationEvent2, tdsImageViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, typography6OnNavigationEvent, viewOnNavigationEvent);
                        }
                    } else {
                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.pointLayout);
                        obj.hashCode();
                        throw null;
                    }
                }
            } else {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.leftDivider);
                obj.hashCode();
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
