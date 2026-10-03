package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.post.Paragraph;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_Update_Result implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View IAuthTabCallback;
    public final TdsTopV2View IAuthTabCallbackDefault;
    public final LinearLayout IAuthTabCallbackStub;
    public final LinearLayout asBinder;
    public final NestedScrollView asInterface;
    private final LinearLayout getInterfaceDescriptor;
    public final Paragraph onExtraCallback;
    public final LinearLayout onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsTopV2View onTransact;
    public final TdsImageView onWarmupCompleted;

    private CMP_Update_Result(@NonNull LinearLayout linearLayout, @NonNull Paragraph paragraph, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull NestedScrollView nestedScrollView, @NonNull TdsTopV2View tdsTopV2View, @NonNull TdsTopV2View tdsTopV2View2) {
        this.getInterfaceDescriptor = linearLayout;
        this.onExtraCallback = paragraph;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onWarmupCompleted = tdsImageView;
        this.onNavigationEvent = tdsImageView2;
        this.onExtraCallbackWithResult = linearLayout2;
        this.asBinder = linearLayout3;
        this.IAuthTabCallbackStub = linearLayout4;
        this.asInterface = nestedScrollView;
        this.IAuthTabCallbackDefault = tdsTopV2View;
        this.onTransact = tdsTopV2View2;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.getInterfaceDescriptor;
    }

    public static CMP_Update_Result onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CMP_Update_Result IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sms_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CMP_Update_Result onNavigationEvent(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        NestedScrollView nestedScrollViewOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent2;
        int i = R.id.description_2;
        Paragraph paragraphOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (paragraphOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.fixed_bottom_cta))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.image_1))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.image_2))) != null) {
            i = R.id.page_1;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null) {
                i = R.id.page_2;
                LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (linearLayout2 != null) {
                    i = R.id.page_container;
                    LinearLayout linearLayout3 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (linearLayout3 != null && (nestedScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.scroll_view))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top_1))) != null && (tdsTopV2ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top_2))) != null) {
                        return new CMP_Update_Result((LinearLayout) view, paragraphOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, linearLayout, linearLayout2, linearLayout3, nestedScrollViewOnNavigationEvent, tdsTopV2ViewOnNavigationEvent, tdsTopV2ViewOnNavigationEvent2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
