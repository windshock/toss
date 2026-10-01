package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.toss.feature.credit.ui.main.R;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.image.TdsImageView;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class access700 implements SearchBarKtExternalSyntheticLambda5 {
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    public final AnimateText IAuthTabCallback;
    public final TdsImageView onExtraCallback;
    private final LinearLayout onNavigationEvent;
    public final LinearLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinearLayout linearLayoutIAuthTabCallback = IAuthTabCallback();
        int i3 = onExtraCallbackWithResult + 101;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return linearLayoutIAuthTabCallback;
    }

    private access700(@NonNull LinearLayout linearLayout, @NonNull TdsImageView tdsImageView, @NonNull AnimateText animateText, @NonNull LinearLayout linearLayout2) {
        this.onNavigationEvent = linearLayout;
        this.onExtraCallback = tdsImageView;
        this.IAuthTabCallback = animateText;
        this.onWarmupCompleted = linearLayout2;
    }

    public LinearLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = this.onNavigationEvent;
        int i5 = i2 + 121;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static access700 onExtraCallback(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.badge_arrow;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (tdsImageViewOnNavigationEvent != null) {
            int i5 = onTransact + 81;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                i4 = R.id.badge_text;
                AnimateText animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (animateTextOnNavigationEvent != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new access700(linearLayout, tdsImageViewOnNavigationEvent, animateTextOnNavigationEvent, linearLayout);
                }
            } else {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.badge_text);
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
