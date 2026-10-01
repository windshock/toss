package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import im.toss.uikit.gradient.TdsRadialGradientView;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HttpException implements SearchBarKtExternalSyntheticLambda5 {
    private static int asBinder = 1;
    private static int onTransact;
    public final Typography5 IAuthTabCallback;
    private final View asInterface;
    public final ConstraintLayout onExtraCallback;
    public final TdsRoundLayout onExtraCallbackWithResult;
    public final View onNavigationEvent;
    public final TdsRadialGradientView onWarmupCompleted;

    private HttpException(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull View view2, @NonNull TdsRadialGradientView tdsRadialGradientView, @NonNull Typography5 typography5) {
        this.asInterface = view;
        this.onExtraCallback = constraintLayout;
        this.onExtraCallbackWithResult = tdsRoundLayout;
        this.onNavigationEvent = view2;
        this.onWarmupCompleted = tdsRadialGradientView;
        this.IAuthTabCallback = typography5;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 21;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        View view = this.asInterface;
        int i5 = i2 + 111;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static HttpException onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_backgrounded_gradient_button_view, viewGroup);
        HttpException httpExceptionIAuthTabCallback = IAuthTabCallback(viewGroup);
        int i3 = onTransact + 103;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return httpExceptionIAuthTabCallback;
    }

    public static HttpException IAuthTabCallback(@NonNull View view) {
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        View viewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.background_container;
        ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (constraintLayoutOnNavigationEvent != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.button_container))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.dim))) != null) {
            int i3 = asBinder + 91;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.gradient_background;
            TdsRadialGradientView tdsRadialGradientView = (TdsRadialGradientView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (tdsRadialGradientView != null) {
                int i5 = asBinder + 47;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    i2 = R.id.tv_title;
                    Typography5 typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (typography5OnNavigationEvent != null) {
                        return new HttpException(view, constraintLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, viewOnNavigationEvent, tdsRadialGradientView, typography5OnNavigationEvent);
                    }
                } else {
                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.tv_title);
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
