package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1vSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int asBinder = 1;
    private static int asInterface;
    public final TdsImageView IAuthTabCallback;
    public final View IAuthTabCallbackDefault;
    public final Typography7 onExtraCallback;
    public final Typography3 onExtraCallbackWithResult;
    public final Typography7 onNavigationEvent;
    private final View onTransact;
    public final Typography7 onWarmupCompleted;

    private AFk1vSDK(@NonNull View view, @NonNull TdsImageView tdsImageView, @NonNull Typography7 typography7, @NonNull Typography7 typography72, @NonNull Typography7 typography73, @NonNull Typography3 typography3, @NonNull View view2) {
        this.onTransact = view;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallback = typography7;
        this.onWarmupCompleted = typography72;
        this.onNavigationEvent = typography73;
        this.onExtraCallbackWithResult = typography3;
        this.IAuthTabCallbackDefault = view2;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        View view = this.onTransact;
        int i5 = i3 + 35;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return view;
    }

    public static AFk1vSDK onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.text_value_line, viewGroup);
        AFk1vSDK aFk1vSDKOnWarmupCompleted = onWarmupCompleted(viewGroup);
        int i3 = asBinder + 51;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return aFk1vSDKOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static AFk1vSDK onWarmupCompleted(@NonNull View view) {
        Typography7 typography7OnNavigationEvent;
        Typography7 typography7OnNavigationEvent2;
        int i = 2 % 2;
        int i2 = R.id.arrow;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (tdsImageViewOnNavigationEvent != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.label))) != null && (typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.message))) != null) {
            int i3 = asBinder + 17;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.subtext;
            Typography7 typography7OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (typography7OnNavigationEvent3 != null) {
                int i5 = asInterface + 115;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                i2 = R.id.text;
                Typography3 typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (typography3OnNavigationEvent != null) {
                    int i7 = asInterface + 53;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = R.id.underline;
                    View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (viewOnNavigationEvent != null) {
                        return new AFk1vSDK(view, tdsImageViewOnNavigationEvent, typography7OnNavigationEvent, typography7OnNavigationEvent2, typography7OnNavigationEvent3, typography3OnNavigationEvent, viewOnNavigationEvent);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
