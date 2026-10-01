package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.SubTypography10;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1mSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final Typography7 onExtraCallbackWithResult;
    private final ConstraintLayout onNavigationEvent;
    public final SubTypography10 onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutOnExtraCallback;
    }

    private AFk1mSDK(@NonNull ConstraintLayout constraintLayout, @NonNull Typography7 typography7, @NonNull SubTypography10 subTypography10) {
        this.onNavigationEvent = constraintLayout;
        this.onExtraCallbackWithResult = typography7;
        this.onWarmupCompleted = subTypography10;
    }

    public ConstraintLayout onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
      0x0027: PHI (r2v3 im.toss.tds.view.component.atom.text.Typography7) = (r2v2 im.toss.tds.view.component.atom.text.Typography7), (r2v6 im.toss.tds.view.component.atom.text.Typography7) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFk1mSDK IAuthTabCallback(@NonNull View view) {
        int i;
        Typography7 typography7OnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.id.description;
            typography7OnNavigationEvent = (Typography7) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            int i4 = 91 / 0;
            if (typography7OnNavigationEvent != null) {
                i = R.id.title;
                SubTypography10 subTypography10OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (subTypography10OnNavigationEvent != null) {
                    AFk1mSDK aFk1mSDK = new AFk1mSDK((ConstraintLayout) view, typography7OnNavigationEvent, subTypography10OnNavigationEvent);
                    int i5 = IAuthTabCallback + 25;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return aFk1mSDK;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            i = R.id.description;
            typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (typography7OnNavigationEvent != null) {
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
