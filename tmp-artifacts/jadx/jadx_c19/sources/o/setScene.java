package o;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.target.ImageViewTarget;
import com.bumptech.glide.request.target.ViewTarget;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setScene extends ImageViewTarget<Drawable> {
    public setScene(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.ImageViewTarget
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void setResource(@Nullable Drawable drawable) {
        ((ImageView) ((ViewTarget) this).IAuthTabCallback).setImageDrawable(drawable);
    }
}
