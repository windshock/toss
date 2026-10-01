package com.tnkfactory.ad.basic;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.DateRangePickerKtDateRangePicker5ExternalSyntheticLambda0;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.ViewTransitionExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkBasicBannerItem$AdListItem$bind$1$1 extends BitmapImageViewTarget {
    public final /* synthetic */ Ref.ObjectRef a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TnkBasicBannerItem$AdListItem$bind$1$1(Ref.ObjectRef objectRef, ImageView imageView) {
        super(imageView);
        this.a = objectRef;
    }

    public static final void a(Ref.ObjectRef objectRef, DateRangePickerKtDateRangePicker5ExternalSyntheticLambda0 dateRangePickerKtDateRangePicker5ExternalSyntheticLambda0) {
        DateRangePickerKtDateRangePicker5ExternalSyntheticLambda0.onExtraCallbackWithResult onExtraCallbackWithResult;
        if (dateRangePickerKtDateRangePicker5ExternalSyntheticLambda0 == null || (onExtraCallbackWithResult = dateRangePickerKtDateRangePicker5ExternalSyntheticLambda0.onExtraCallbackWithResult()) == null) {
            return;
        }
        int iOnExtraCallback = onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallbackWithResult = VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(iOnExtraCallback) < 0.5d ? VideoEncoderInfoImplExternalSyntheticLambda0.onExtraCallbackWithResult(iOnExtraCallback, -1, 0.3f) : VideoEncoderInfoImplExternalSyntheticLambda0.onExtraCallbackWithResult(iOnExtraCallback, -16777216, 0.4f);
        LinearLayout linearLayout = (LinearLayout) objectRef.element;
        if (linearLayout != null) {
            linearLayout.setBackgroundTintList(ColorStateList.valueOf(iOnExtraCallbackWithResult));
        }
    }

    @Override // com.bumptech.glide.request.target.ImageViewTarget, o.setTransitionDuration
    public /* bridge */ /* synthetic */ void onResourceReady(Object obj, ViewTransitionExternalSyntheticLambda0 viewTransitionExternalSyntheticLambda0) {
        onResourceReady((Bitmap) obj, (ViewTransitionExternalSyntheticLambda0<? super Bitmap>) viewTransitionExternalSyntheticLambda0);
    }

    public void onResourceReady(Bitmap bitmap, ViewTransitionExternalSyntheticLambda0<? super Bitmap> viewTransitionExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        super.onResourceReady((TnkBasicBannerItem$AdListItem$bind$1$1) bitmap, (ViewTransitionExternalSyntheticLambda0<? super TnkBasicBannerItem$AdListItem$bind$1$1>) viewTransitionExternalSyntheticLambda0);
        DateRangePickerKtDateRangePicker5ExternalSyntheticLambda0.onExtraCallback onextracallbackIAuthTabCallback = DateRangePickerKtDateRangePicker5ExternalSyntheticLambda0.IAuthTabCallback(bitmap);
        final Ref.ObjectRef objectRef = this.a;
        onextracallbackIAuthTabCallback.onNavigationEvent(new DateRangePickerKtDateRangePicker5ExternalSyntheticLambda0.onNavigationEvent() { // from class: com.tnkfactory.ad.basic.TnkBasicBannerItem$AdListItem$bind$1$1$$ExternalSyntheticLambda0
            public final void onGenerated(DateRangePickerKtDateRangePicker5ExternalSyntheticLambda0 dateRangePickerKtDateRangePicker5ExternalSyntheticLambda0) {
                TnkBasicBannerItem$AdListItem$bind$1$1.a(objectRef, dateRangePickerKtDateRangePicker5ExternalSyntheticLambda0);
            }
        });
    }
}
