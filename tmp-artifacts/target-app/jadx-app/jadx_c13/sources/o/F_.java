package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.R;
import im.toss.uikit.widget.SafePlayerView;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class F_ implements SearchBarKtExternalSyntheticLambda5 {
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    public final Typography6 IAuthTabCallback;
    public final TdsTextButtonV0View IAuthTabCallbackDefault;
    public final TdsImageView IAuthTabCallbackStub;
    public final SafePlayerView IAuthTabCallback_Parcel;
    private final View access000;
    public final TdsImageView asBinder;
    public final LinearLayout asInterface;
    public final Typography6 onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    public final Typography4 onTransact;
    public final View onWarmupCompleted;

    private F_(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull View view2, @NonNull ConstraintLayout constraintLayout2, @NonNull Typography6 typography6, @NonNull Typography6 typography62, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull TdsTextButtonV0View tdsTextButtonV0View, @NonNull Typography4 typography4, @NonNull LinearLayout linearLayout, @NonNull SafePlayerView safePlayerView) {
        this.access000 = view;
        this.onNavigationEvent = constraintLayout;
        this.onWarmupCompleted = view2;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.IAuthTabCallback = typography6;
        this.onExtraCallback = typography62;
        this.IAuthTabCallbackStub = tdsImageView;
        this.asBinder = tdsImageView2;
        this.IAuthTabCallbackDefault = tdsTextButtonV0View;
        this.onTransact = typography4;
        this.asInterface = linearLayout;
        this.IAuthTabCallback_Parcel = safePlayerView;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 53;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        View view = this.access000;
        int i5 = i2 + 83;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return view;
    }

    public static F_ onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        int i2 = getInterfaceDescriptor + 23;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            layoutInflater.inflate(R.layout.banner, viewGroup);
            F_ f_OnWarmupCompleted = onWarmupCompleted(viewGroup);
            int i3 = access100 + 43;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                return f_OnWarmupCompleted;
            }
            throw null;
        }
        layoutInflater.inflate(R.layout.banner, viewGroup);
        onWarmupCompleted(viewGroup);
        throw null;
    }

    public static F_ onWarmupCompleted(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        Typography6 typography6OnNavigationEvent2;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsTextButtonV0View tdsTextButtonV0ViewOnNavigationEvent;
        Typography4 typography4OnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.bottomBarrier;
        ConstraintLayout constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (constraintLayoutOnNavigationEvent2 != null) {
            int i3 = access100 + 27;
            getInterfaceDescriptor = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.clickView);
                obj.hashCode();
                throw null;
            }
            i2 = R.id.clickView;
            View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (viewOnNavigationEvent != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.container))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.description1))) != null && (typography6OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.description2))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.icon))) != null) {
                int i4 = getInterfaceDescriptor + 57;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                i2 = R.id.image;
                TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (tdsImageViewOnNavigationEvent2 != null && (tdsTextButtonV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.textButton))) != null && (typography4OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.title))) != null) {
                    int i6 = access100 + 97;
                    getInterfaceDescriptor = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    i2 = R.id.topBarrier;
                    LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (linearLayout != null) {
                        int i7 = getInterfaceDescriptor + 123;
                        access100 = i7 % 128;
                        if (i7 % 2 == 0) {
                            throw null;
                        }
                        i2 = R.id.video;
                        SafePlayerView safePlayerView = (SafePlayerView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (safePlayerView != null) {
                            return new F_(view, constraintLayoutOnNavigationEvent2, viewOnNavigationEvent, constraintLayoutOnNavigationEvent, typography6OnNavigationEvent, typography6OnNavigationEvent2, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, tdsTextButtonV0ViewOnNavigationEvent, typography4OnNavigationEvent, linearLayout, safePlayerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
