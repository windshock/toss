package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1rSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    public final Typography7 IAuthTabCallback;
    public final Typography5 IAuthTabCallbackStub;
    private final View asInterface;
    public final TdsImageView onExtraCallback;
    public final TdsRoundLayout onExtraCallbackWithResult;
    public final Typography5 onNavigationEvent;
    public final View onTransact;
    public final Typography7 onWarmupCompleted;

    private AFk1rSDK(@NonNull View view, @NonNull TdsImageView tdsImageView, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull Typography5 typography5, @NonNull Typography7 typography7, @NonNull Typography7 typography72, @NonNull Typography5 typography52, @NonNull View view2) {
        this.asInterface = view;
        this.onExtraCallback = tdsImageView;
        this.onExtraCallbackWithResult = tdsRoundLayout;
        this.onNavigationEvent = typography5;
        this.IAuthTabCallback = typography7;
        this.onWarmupCompleted = typography72;
        this.IAuthTabCallbackStub = typography52;
        this.onTransact = view2;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AFk1rSDK onNavigationEvent(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.text_field_spinner, viewGroup);
        AFk1rSDK aFk1rSDKOnExtraCallback = onExtraCallback(viewGroup);
        int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return aFk1rSDKOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AFk1rSDK onExtraCallback(@NonNull View view) {
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        Typography5 typography5OnNavigationEvent2;
        View viewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asBinder + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.arrow;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (tdsImageViewOnNavigationEvent != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.bgView))) != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.hint))) != null) {
            int i5 = IAuthTabCallbackDefault + 45;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.label);
                throw null;
            }
            i4 = R.id.label;
            Typography7 typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (typography7OnNavigationEvent2 != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.message))) != null && (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.title))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.underline))) != null) {
                AFk1rSDK aFk1rSDK = new AFk1rSDK(view, tdsImageViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, typography5OnNavigationEvent, typography7OnNavigationEvent2, typography7OnNavigationEvent, typography5OnNavigationEvent2, viewOnNavigationEvent);
                int i6 = IAuthTabCallbackDefault + 123;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    return aFk1rSDK;
                }
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
