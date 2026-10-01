package com.tnkfactory.ad.basic;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.tnkfactory.ad.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkLoadingDialog extends Dialog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TnkLoadingDialog(@NotNull Context context, int i2) {
        super(context, i2);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final void a(TnkLoadingDialog tnkLoadingDialog) {
        tnkLoadingDialog.setCancelable(true);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.com_tnk_offerwall_dialog_loading);
        View viewFindViewById = findViewById(R.id.iv_loading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        ImageView imageView = (ImageView) viewFindViewById;
        Drawable drawable = getContext().getApplicationContext().getDrawable(R.drawable.com_tnk_offerwall_loading_1);
        Intrinsics.checkNotNull(drawable, "");
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
        imageView.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.registerAnimationCallback(new TnkLoadingDialog$onCreate$endListener$1(imageView, animatedVectorDrawable));
        Drawable drawable2 = imageView.getDrawable();
        Intrinsics.checkNotNull(drawable2, "");
        ((AnimatedVectorDrawable) drawable2).start();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        setCancelable(false);
        ImageView imageView = (ImageView) findViewById(R.id.iv_loading);
        if (imageView != null) {
            imageView.postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkLoadingDialog$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TnkLoadingDialog.a(this.f$0);
                }
            }, 1000L);
        }
    }
}
