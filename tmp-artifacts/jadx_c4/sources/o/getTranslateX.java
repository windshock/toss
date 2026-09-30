package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.ads_sdk.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.gradient.TdsRadialGradientView;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTranslateX implements SearchBarKtExternalSyntheticLambda5 {
    private static int extraCallbackWithResult = 1;
    private static int readTypedObject;
    public final LinearLayout IAuthTabCallback;
    public final TdsRoundLayout IAuthTabCallbackDefault;
    public final TdsRadialGradientView IAuthTabCallbackStub;
    public final LinearLayout IAuthTabCallbackStubProxy;
    public final Typography3 IAuthTabCallback_Parcel;
    private final View ICustomTabsCallback;
    public final Typography5 access000;
    public final Typography5 access100;
    public final TdsRoundLayout asBinder;
    public final TdsRadialGradientView asInterface;
    public final TdsRoundLayout getInterfaceDescriptor;
    public final ConstraintLayout onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsRoundLayout onTransact;
    public final View onWarmupCompleted;

    private getTranslateX(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull View view2, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull TdsRadialGradientView tdsRadialGradientView, @NonNull TdsRadialGradientView tdsRadialGradientView2, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsRoundLayout tdsRoundLayout2, @NonNull TdsRoundLayout tdsRoundLayout3, @NonNull TdsRoundLayout tdsRoundLayout4, @NonNull LinearLayout linearLayout2, @NonNull Typography5 typography5, @NonNull Typography5 typography52, @NonNull Typography3 typography3) {
        this.ICustomTabsCallback = view;
        this.onExtraCallback = constraintLayout;
        this.IAuthTabCallback = linearLayout;
        this.onWarmupCompleted = view2;
        this.onNavigationEvent = tdsImageView;
        this.onExtraCallbackWithResult = tdsImageView2;
        this.asInterface = tdsRadialGradientView;
        this.IAuthTabCallbackStub = tdsRadialGradientView2;
        this.asBinder = tdsRoundLayout;
        this.IAuthTabCallbackDefault = tdsRoundLayout2;
        this.onTransact = tdsRoundLayout3;
        this.getInterfaceDescriptor = tdsRoundLayout4;
        this.IAuthTabCallbackStubProxy = linearLayout2;
        this.access000 = typography5;
        this.access100 = typography52;
        this.IAuthTabCallback_Parcel = typography3;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View view = this.ICustomTabsCallback;
        int i4 = i3 + 115;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    public static getTranslateX IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 3;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (viewGroup != null) {
            int i5 = i2 + 101;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                layoutInflater.inflate(R.layout.ads_sdk_end_card_bottom_sheet, viewGroup);
                return IAuthTabCallback(viewGroup);
            }
            layoutInflater.inflate(R.layout.ads_sdk_end_card_bottom_sheet, viewGroup);
            IAuthTabCallback(viewGroup);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        throw new NullPointerException("parent");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe A[PHI: r3
      0x00fe: PHI (r3v5 int) = 
      (r3v4 int)
      (r3v6 int)
      (r3v7 int)
      (r3v8 int)
      (r3v12 int)
      (r3v13 int)
      (r3v14 int)
      (r3v15 int)
      (r3v16 int)
      (r3v17 int)
      (r3v21 int)
     binds: [B:10:0x0031, B:12:0x0039, B:14:0x0043, B:16:0x004d, B:18:0x0060, B:20:0x006a, B:22:0x0074, B:24:0x007e, B:26:0x0088, B:28:0x0092, B:30:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r3
      0x0028: PHI (r3v3 androidx.constraintlayout.widget.ConstraintLayout) = (r3v2 androidx.constraintlayout.widget.ConstraintLayout), (r3v30 androidx.constraintlayout.widget.ConstraintLayout) binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static getTranslateX IAuthTabCallback(@NonNull View view) {
        int i;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        View viewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        TdsRadialGradientView tdsRadialGradientViewOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent2;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent3;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent4;
        Typography5 typography5OnNavigationEvent;
        Typography3 typography3OnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 49;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.id.card_container;
            constraintLayoutOnNavigationEvent = (ConstraintLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            int i4 = 4 / 0;
            if (constraintLayoutOnNavigationEvent != null) {
                ConstraintLayout constraintLayout = constraintLayoutOnNavigationEvent;
                int i5 = R.id.content_container;
                LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i5);
                if (linearLayout == null || (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i5 = R.id.dim_view))) == null || (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i5 = R.id.iv_close))) == null || (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i5 = R.id.iv_end_card))) == null) {
                    i = i5;
                } else {
                    int i6 = readTypedObject + 91;
                    extraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    i5 = R.id.iv_gradient_list;
                    TdsRadialGradientView tdsRadialGradientViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i5);
                    if (tdsRadialGradientViewOnNavigationEvent2 != null && (tdsRadialGradientViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i5 = R.id.iv_gradient_no_list))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i5 = R.id.layout_close))) != null && (tdsRoundLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i5 = R.id.layout_cta))) != null && (tdsRoundLayoutOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i5 = R.id.layout_image_frame))) != null && (tdsRoundLayoutOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i5 = R.id.layout_sheet))) != null) {
                        int i8 = extraCallbackWithResult + 49;
                        readTypedObject = i8 % 128;
                        int i9 = i8 % 2;
                        i5 = R.id.list_container;
                        LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i5);
                        if (linearLayout2 != null) {
                            int i10 = readTypedObject + 11;
                            extraCallbackWithResult = i10 % 128;
                            if (i10 % 2 == 0) {
                                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.tv_cta);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i11 = R.id.tv_cta;
                            Typography5 typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i11);
                            if (typography5OnNavigationEvent2 != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i11 = R.id.tv_subtitle))) != null && (typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i11 = R.id.tv_title))) != null) {
                                return new getTranslateX(view, constraintLayout, linearLayout, viewOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, tdsRadialGradientViewOnNavigationEvent2, tdsRadialGradientViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent2, tdsRoundLayoutOnNavigationEvent3, tdsRoundLayoutOnNavigationEvent4, linearLayout2, typography5OnNavigationEvent2, typography5OnNavigationEvent, typography3OnNavigationEvent);
                            }
                            i = i11;
                        }
                    }
                }
            }
        } else {
            i = R.id.card_container;
            constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (constraintLayoutOnNavigationEvent != null) {
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
