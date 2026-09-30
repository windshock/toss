package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;
import im.toss.uikit.widget.textField.NumberEditText;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class B_ implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    public final View IAuthTabCallback;
    private final View IAuthTabCallbackDefault;
    public final Typography7 onExtraCallback;
    public final NumberEditText onExtraCallbackWithResult;
    public final Typography7 onNavigationEvent;
    public final Typography7 onWarmupCompleted;

    private B_(@NonNull View view, @NonNull Typography7 typography7, @NonNull Typography7 typography72, @NonNull Typography7 typography73, @NonNull NumberEditText numberEditText, @NonNull View view2) {
        this.IAuthTabCallbackDefault = view;
        this.onExtraCallback = typography7;
        this.onNavigationEvent = typography72;
        this.onWarmupCompleted = typography73;
        this.onExtraCallbackWithResult = numberEditText;
        this.IAuthTabCallback = view2;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 77;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        View view = this.IAuthTabCallbackDefault;
        int i5 = i2 + 107;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        throw null;
    }

    public static B_ onNavigationEvent(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        int i4 = i3 + 17;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            layoutInflater.inflate(R.layout.number_field_line, viewGroup);
            return onExtraCallbackWithResult(viewGroup);
        }
        layoutInflater.inflate(R.layout.number_field_line, viewGroup);
        B_ b_OnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup);
        int i5 = 26 / 0;
        return b_OnExtraCallbackWithResult;
    }

    public static B_ onExtraCallbackWithResult(@NonNull View view) {
        Typography7 typography7OnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.label;
        Typography7 typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (typography7OnNavigationEvent2 != null) {
            int i3 = asInterface + 95;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.message;
            Typography7 typography7OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (typography7OnNavigationEvent3 != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.subtext))) != null) {
                i2 = R.id.text;
                NumberEditText numberEditText = (NumberEditText) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (numberEditText != null) {
                    int i5 = asInterface + 25;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = R.id.underline;
                    View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (viewOnNavigationEvent != null) {
                        B_ b_ = new B_(view, typography7OnNavigationEvent2, typography7OnNavigationEvent3, typography7OnNavigationEvent, numberEditText, viewOnNavigationEvent);
                        int i7 = IAuthTabCallbackStub + 37;
                        asInterface = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 49 / 0;
                        }
                        return b_;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
