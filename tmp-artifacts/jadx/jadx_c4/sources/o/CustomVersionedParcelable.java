package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.ads_sdk.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CustomVersionedParcelable implements SearchBarKtExternalSyntheticLambda5 {
    private static int ICustomTabsCallback = 0;
    private static int extraCallback = 1;
    public final Barrier IAuthTabCallback;
    public final Typography6 IAuthTabCallbackDefault;
    public final ConstraintLayout IAuthTabCallbackStub;
    public final Typography6 IAuthTabCallbackStubProxy;
    public final Typography7 IAuthTabCallback_Parcel;
    public final SubTypography13 access000;
    public final SubTypography13 access100;
    public final TdsRoundLayout asBinder;
    public final ConstraintLayout asInterface;
    public final Typography6 getInterfaceDescriptor;
    public final TdsImageView onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsRoundLayout onTransact;
    public final Barrier onWarmupCompleted;
    private final View writeTypedObject;

    private CustomVersionedParcelable(@NonNull View view, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull TdsImageView tdsImageView3, @NonNull ConstraintLayout constraintLayout, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsRoundLayout tdsRoundLayout2, @NonNull ConstraintLayout constraintLayout2, @NonNull Typography6 typography6, @NonNull SubTypography13 subTypography13, @NonNull SubTypography13 subTypography132, @NonNull Typography6 typography62, @NonNull Typography6 typography63, @NonNull Typography7 typography7) {
        this.writeTypedObject = view;
        this.onWarmupCompleted = barrier;
        this.IAuthTabCallback = barrier2;
        this.onExtraCallback = tdsImageView;
        this.onNavigationEvent = tdsImageView2;
        this.onExtraCallbackWithResult = tdsImageView3;
        this.IAuthTabCallbackStub = constraintLayout;
        this.asBinder = tdsRoundLayout;
        this.onTransact = tdsRoundLayout2;
        this.asInterface = constraintLayout2;
        this.IAuthTabCallbackDefault = typography6;
        this.access000 = subTypography13;
        this.access100 = subTypography132;
        this.IAuthTabCallbackStubProxy = typography62;
        this.getInterfaceDescriptor = typography63;
        this.IAuthTabCallback_Parcel = typography7;
    }

    public View getRoot() {
        View view;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 == 0) {
            view = this.writeTypedObject;
            int i4 = 45 / 0;
        } else {
            view = this.writeTypedObject;
        }
        int i5 = i3 + 77;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return view;
    }

    public static CustomVersionedParcelable onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        int i2 = extraCallback + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        layoutInflater.inflate(R.layout.ads_sdk_v2_feed_ad_view, viewGroup);
        CustomVersionedParcelable customVersionedParcelableOnNavigationEvent = onNavigationEvent(viewGroup);
        int i4 = ICustomTabsCallback + 1;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return customVersionedParcelableOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[PHI: r0
      0x009e: PHI (r0v6 im.toss.tds.view.component.atom.text.Typography6) = (r0v5 im.toss.tds.view.component.atom.text.Typography6), (r0v14 im.toss.tds.view.component.atom.text.Typography6) binds: [B:26:0x009c, B:23:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CustomVersionedParcelable onNavigationEvent(@NonNull View view) {
        Barrier barrierOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent2;
        Typography6 typography6OnNavigationEvent;
        SubTypography13 subTypography13OnNavigationEvent;
        Typography6 typography6OnNavigationEvent2;
        Typography6 typography6OnNavigationEvent3;
        Typography7 typography7OnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.barrier_image_bottom;
        Barrier barrierOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (barrierOnNavigationEvent2 != null && (barrierOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.barrier_top_section_below))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iv_icon))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iv_main))) != null) {
            int i3 = ICustomTabsCallback + 71;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.iv_more;
            TdsImageView tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (tdsImageViewOnNavigationEvent3 != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.layout_content))) != null) {
                int i5 = ICustomTabsCallback + 33;
                extraCallback = i5 % 128;
                int i6 = i5 % 2;
                i2 = R.id.layout_icon;
                TdsRoundLayout tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (tdsRoundLayoutOnNavigationEvent != null) {
                    int i7 = ICustomTabsCallback + 41;
                    extraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = R.id.layout_main;
                    TdsRoundLayout tdsRoundLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (tdsRoundLayoutOnNavigationEvent2 != null && (constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.layout_main_bottom))) != null) {
                        int i9 = extraCallback + 71;
                        ICustomTabsCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            i2 = R.id.tv_content_row1;
                            typography6OnNavigationEvent = (Typography6) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            int i10 = 15 / 0;
                            if (typography6OnNavigationEvent != null) {
                                Typography6 typography6 = typography6OnNavigationEvent;
                                i2 = R.id.tv_content_row2;
                                SubTypography13 subTypography13OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                if (subTypography13OnNavigationEvent2 != null && (subTypography13OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.tv_disc))) != null && (typography6OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.tv_more))) != null && (typography6OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.tv_row1))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.tv_row2))) != null) {
                                    return new CustomVersionedParcelable(view, barrierOnNavigationEvent2, barrierOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, tdsImageViewOnNavigationEvent3, constraintLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent2, constraintLayoutOnNavigationEvent2, typography6, subTypography13OnNavigationEvent2, subTypography13OnNavigationEvent, typography6OnNavigationEvent2, typography6OnNavigationEvent3, typography7OnNavigationEvent);
                                }
                            }
                        } else {
                            i2 = R.id.tv_content_row1;
                            typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (typography6OnNavigationEvent != null) {
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
