package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1wSDK4 implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100;
    public final TdsImageView IAuthTabCallback;
    public final Typography6 IAuthTabCallbackDefault;
    public final View IAuthTabCallbackStub;
    private final ConstraintLayout IAuthTabCallbackStubProxy;
    public final View asBinder;
    public final TdsRoundLayout asInterface;
    public final AnimateText onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final ConstraintLayout onTransact;
    public final TdsImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnWarmupCompleted = onWarmupCompleted();
        int i4 = access100 + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayoutOnWarmupCompleted;
        }
        throw null;
    }

    private AFj1wSDK4(@NonNull ConstraintLayout constraintLayout, @NonNull AnimateText animateText, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull TdsImageView tdsImageView3, @NonNull TdsImageView tdsImageView4, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull View view2, @NonNull Typography6 typography6) {
        this.IAuthTabCallbackStubProxy = constraintLayout;
        this.onExtraCallback = animateText;
        this.onNavigationEvent = tdsImageView;
        this.onExtraCallbackWithResult = tdsImageView2;
        this.IAuthTabCallback = tdsImageView3;
        this.onWarmupCompleted = tdsImageView4;
        this.asInterface = tdsRoundLayout;
        this.onTransact = constraintLayout2;
        this.asBinder = view;
        this.IAuthTabCallbackStub = view2;
        this.IAuthTabCallbackDefault = typography6;
    }

    public ConstraintLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 31;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 59;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r4
      0x0022: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFj1wSDK4 onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.point_toast_v2_view, viewGroup, true);
            if (z) {
                int i3 = IAuthTabCallback_Parcel + 77;
                access100 = i3 % 128;
                if (i3 % 2 != 0) {
                    viewGroup.addView(viewInflate);
                    int i4 = 79 / 0;
                } else {
                    viewGroup.addView(viewInflate);
                }
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.point_toast_v2_view, viewGroup, false);
            if (!(!z)) {
            }
        }
        return onNavigationEvent(viewInflate);
    }

    public static AFj1wSDK4 onNavigationEvent(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.animate_text;
        AnimateText animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (animateTextOnNavigationEvent != null) {
            int i3 = IAuthTabCallback_Parcel + 21;
            access100 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.bg_left);
                throw null;
            }
            i2 = R.id.bg_left;
            TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (tdsImageViewOnNavigationEvent2 != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.bg_right))) != null) {
                int i4 = IAuthTabCallback_Parcel + 67;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                i2 = R.id.bg_top;
                TdsImageView tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (tdsImageViewOnNavigationEvent3 != null) {
                    int i6 = access100 + 25;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = R.id.iv_point;
                    TdsImageView tdsImageViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (tdsImageViewOnNavigationEvent4 != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.layout_toast))) != null) {
                        int i8 = access100 + 65;
                        IAuthTabCallback_Parcel = i8 % 128;
                        if (i8 % 2 == 0) {
                            SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.layout_toast_inside);
                            throw null;
                        }
                        i2 = R.id.layout_toast_inside;
                        ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (constraintLayoutOnNavigationEvent != null) {
                            int i9 = access100 + 31;
                            IAuthTabCallback_Parcel = i9 % 128;
                            if (i9 % 2 == 0) {
                                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.space_bottom);
                                obj.hashCode();
                                throw null;
                            }
                            i2 = R.id.space_bottom;
                            View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (viewOnNavigationEvent != null) {
                                int i10 = IAuthTabCallback_Parcel + 67;
                                access100 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.space_top);
                                    obj.hashCode();
                                    throw null;
                                }
                                i2 = R.id.space_top;
                                View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                if (viewOnNavigationEvent2 != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.tv_point_position))) != null) {
                                    return new AFj1wSDK4((ConstraintLayout) view, animateTextOnNavigationEvent, tdsImageViewOnNavigationEvent2, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent3, tdsImageViewOnNavigationEvent4, tdsRoundLayoutOnNavigationEvent, constraintLayoutOnNavigationEvent, viewOnNavigationEvent, viewOnNavigationEvent2, typography6OnNavigationEvent);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
