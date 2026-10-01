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
public final class getPathName implements SearchBarKtExternalSyntheticLambda5 {
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    public final TdsImageView IAuthTabCallback;
    public final ConstraintLayout IAuthTabCallbackDefault;
    public final TdsRoundLayout IAuthTabCallbackStub;
    public final Typography6 IAuthTabCallbackStubProxy;
    public final Typography6 IAuthTabCallback_Parcel;
    public final Typography7 ICustomTabsCallback;
    public final Typography6 access000;
    public final SubTypography13 access100;
    public final View asBinder;
    public final ConstraintLayout asInterface;
    private final View extraCallbackWithResult;
    public final Typography6 getInterfaceDescriptor;
    public final TdsImageView onExtraCallback;
    public final Barrier onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsRoundLayout onTransact;
    public final Barrier onWarmupCompleted;

    private getPathName(@NonNull View view, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull TdsImageView tdsImageView3, @NonNull ConstraintLayout constraintLayout, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsRoundLayout tdsRoundLayout2, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2, @NonNull Typography6 typography6, @NonNull Typography6 typography62, @NonNull SubTypography13 subTypography13, @NonNull Typography6 typography63, @NonNull Typography6 typography64, @NonNull Typography7 typography7) {
        this.extraCallbackWithResult = view;
        this.onWarmupCompleted = barrier;
        this.onExtraCallbackWithResult = barrier2;
        this.onNavigationEvent = tdsImageView;
        this.IAuthTabCallback = tdsImageView2;
        this.onExtraCallback = tdsImageView3;
        this.IAuthTabCallbackDefault = constraintLayout;
        this.onTransact = tdsRoundLayout;
        this.IAuthTabCallbackStub = tdsRoundLayout2;
        this.asInterface = constraintLayout2;
        this.asBinder = view2;
        this.getInterfaceDescriptor = typography6;
        this.access000 = typography62;
        this.access100 = subTypography13;
        this.IAuthTabCallback_Parcel = typography63;
        this.IAuthTabCallbackStubProxy = typography64;
        this.ICustomTabsCallback = typography7;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.extraCallbackWithResult;
        }
        throw null;
    }

    public static getPathName onExtraCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 117;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.ads_sdk_feed_ad_view, viewGroup);
        getPathName getpathnameOnExtraCallback = onExtraCallback(viewGroup);
        int i3 = readTypedObject + 89;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return getpathnameOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5 A[PHI: r0
      0x00b5: PHI (r0v12 im.toss.tds.view.component.atom.text.Typography6) = (r0v11 im.toss.tds.view.component.atom.text.Typography6), (r0v17 im.toss.tds.view.component.atom.text.Typography6) binds: [B:36:0x00b3, B:33:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static getPathName onExtraCallback(@NonNull View view) {
        Barrier barrierOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        TdsImageView tdsImageViewOnNavigationEvent3;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent2;
        ConstraintLayout constraintLayoutOnNavigationEvent2;
        View viewOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        Typography6 typography6OnNavigationEvent2;
        SubTypography13 subTypography13OnNavigationEvent;
        Typography6 typography6OnNavigationEvent3;
        Typography7 typography7OnNavigationEvent;
        int i = 2 % 2;
        int i2 = writeTypedObject + 63;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.barrier_image_bottom;
            Barrier barrierOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (barrierOnNavigationEvent2 != null && (barrierOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.barrier_top_section_below))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.iv_icon))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.iv_main))) != null && (tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.iv_more))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.layout_content))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.layout_icon))) != null && (tdsRoundLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.layout_main))) != null && (constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.layout_main_bottom))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.space_middle))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.tv_content_row1))) != null && (typography6OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.tv_content_row2))) != null && (subTypography13OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.tv_disc))) != null) {
                int i4 = readTypedObject + 99;
                writeTypedObject = i4 % 128;
                if (i4 % 2 == 0) {
                    i3 = R.id.tv_more;
                    typography6OnNavigationEvent3 = (Typography6) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                    int i5 = 42 / 0;
                    if (typography6OnNavigationEvent3 != null) {
                        Typography6 typography6 = typography6OnNavigationEvent3;
                        i3 = R.id.tv_row1;
                        Typography6 typography6OnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                        if (typography6OnNavigationEvent4 != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.tv_row2))) != null) {
                            return new getPathName(view, barrierOnNavigationEvent2, barrierOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, tdsImageViewOnNavigationEvent3, constraintLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent2, constraintLayoutOnNavigationEvent2, viewOnNavigationEvent, typography6OnNavigationEvent, typography6OnNavigationEvent2, subTypography13OnNavigationEvent, typography6, typography6OnNavigationEvent4, typography7OnNavigationEvent);
                        }
                    }
                } else {
                    i3 = R.id.tv_more;
                    typography6OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                    if (typography6OnNavigationEvent3 != null) {
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.barrier_image_bottom);
        throw null;
    }
}
