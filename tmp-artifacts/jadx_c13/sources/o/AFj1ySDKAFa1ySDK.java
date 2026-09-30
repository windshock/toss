package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1ySDKAFa1ySDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    public final TdsImageView IAuthTabCallback;
    public final TdsRoundLayout IAuthTabCallbackDefault;
    public final View IAuthTabCallbackStub;
    public final TdsRollingNumberV1View IAuthTabCallbackStubProxy;
    public final Typography5 access000;
    public final View asBinder;
    public final TdsRollingNumberV1View asInterface;
    private final ConstraintLayout getInterfaceDescriptor;
    public final TdsImageView onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    public final SubTypography8 onTransact;
    public final TdsImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallback_Parcel + 119;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayoutOnWarmupCompleted;
        }
        throw null;
    }

    private AFj1ySDKAFa1ySDK(@NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull TdsImageView tdsImageView3, @NonNull TdsImageView tdsImageView4, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsRollingNumberV1View tdsRollingNumberV1View, @NonNull View view, @NonNull View view2, @NonNull SubTypography8 subTypography8, @NonNull Typography5 typography5, @NonNull TdsRollingNumberV1View tdsRollingNumberV1View2) {
        this.getInterfaceDescriptor = constraintLayout;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallback = tdsImageView2;
        this.onExtraCallbackWithResult = tdsImageView3;
        this.onWarmupCompleted = tdsImageView4;
        this.onNavigationEvent = constraintLayout2;
        this.IAuthTabCallbackDefault = tdsRoundLayout;
        this.asInterface = tdsRollingNumberV1View;
        this.asBinder = view;
        this.IAuthTabCallbackStub = view2;
        this.onTransact = subTypography8;
        this.access000 = typography5;
        this.IAuthTabCallbackStubProxy = tdsRollingNumberV1View2;
    }

    public ConstraintLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.getInterfaceDescriptor;
        int i5 = i3 + 9;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
      0x0022: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFj1ySDKAFa1ySDK IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            viewInflate = layoutInflater.inflate(R.layout.point_toast_view, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
                int i3 = access100 + 79;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.point_toast_view, viewGroup, false);
            if (!(!z)) {
            }
        }
        return IAuthTabCallback(viewInflate);
    }

    public static AFj1ySDKAFa1ySDK IAuthTabCallback(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        TdsRollingNumberV1View tdsRollingNumberV1ViewOnNavigationEvent;
        View viewOnNavigationEvent;
        SubTypography8 subTypography8OnNavigationEvent;
        TdsRollingNumberV1View tdsRollingNumberV1ViewOnNavigationEvent2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.bg_left;
        TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (tdsImageViewOnNavigationEvent2 != null) {
            int i5 = access100 + 21;
            IAuthTabCallback_Parcel = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.bg_right);
                throw null;
            }
            i4 = R.id.bg_right;
            TdsImageView tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (tdsImageViewOnNavigationEvent3 != null) {
                int i6 = IAuthTabCallback_Parcel + 111;
                access100 = i6 % 128;
                if (i6 % 2 == 0) {
                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.bg_top);
                    throw null;
                }
                i4 = R.id.bg_top;
                TdsImageView tdsImageViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (tdsImageViewOnNavigationEvent4 != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.iv_point))) != null) {
                    int i7 = access100 + 33;
                    IAuthTabCallback_Parcel = i7 % 128;
                    if (i7 % 2 != 0) {
                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.layout_bg);
                        obj.hashCode();
                        throw null;
                    }
                    i4 = R.id.layout_bg;
                    ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                    if (constraintLayoutOnNavigationEvent != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.layout_toast))) != null && (tdsRollingNumberV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.rolling_number))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.space_bottom))) != null) {
                        int i8 = access100 + 19;
                        IAuthTabCallback_Parcel = i8 % 128;
                        int i9 = i8 % 2;
                        i4 = R.id.space_top;
                        View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                        if (viewOnNavigationEvent2 != null && (subTypography8OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.tv_add))) != null) {
                            int i10 = access100 + 105;
                            IAuthTabCallback_Parcel = i10 % 128;
                            if (i10 % 2 != 0) {
                                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.tv_timer);
                                throw null;
                            }
                            i4 = R.id.tv_timer;
                            Typography5 typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                            if (typography5OnNavigationEvent != null && (tdsRollingNumberV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.void_animate_number))) != null) {
                                return new AFj1ySDKAFa1ySDK((ConstraintLayout) view, tdsImageViewOnNavigationEvent2, tdsImageViewOnNavigationEvent3, tdsImageViewOnNavigationEvent4, tdsImageViewOnNavigationEvent, constraintLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, tdsRollingNumberV1ViewOnNavigationEvent, viewOnNavigationEvent, viewOnNavigationEvent2, subTypography8OnNavigationEvent, typography5OnNavigationEvent, tdsRollingNumberV1ViewOnNavigationEvent2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
