package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1oSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    public final Typography7 IAuthTabCallback;
    public final TdsImageView onExtraCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final SubTypography8 onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallback = onExtraCallback();
        int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayoutOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFk1oSDK(@NonNull ConstraintLayout constraintLayout, @NonNull Typography7 typography7, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull SubTypography8 subTypography8) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.IAuthTabCallback = typography7;
        this.onExtraCallback = tdsImageView;
        this.onNavigationEvent = tdsImageView2;
        this.onWarmupCompleted = subTypography8;
    }

    public ConstraintLayout onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AFk1oSDK onExtraCallbackWithResult(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        SubTypography8 subTypography8OnNavigationEvent;
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = R.id.description;
            Typography7 typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (typography7OnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.icon))) != null) {
                int i4 = IAuthTabCallbackDefault + 73;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    i3 = R.id.imageButton;
                    TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                    if (tdsImageViewOnNavigationEvent2 != null && (subTypography8OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.title))) != null) {
                        AFk1oSDK aFk1oSDK = new AFk1oSDK((ConstraintLayout) view, typography7OnNavigationEvent, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, subTypography8OnNavigationEvent);
                        int i5 = asBinder + 1;
                        IAuthTabCallbackDefault = i5 % 128;
                        if (i5 % 2 == 0) {
                            return aFk1oSDK;
                        }
                        throw null;
                    }
                } else {
                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.imageButton);
                    throw null;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.description);
        obj.hashCode();
        throw null;
    }
}
