package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setOnModifierChangedui implements ResourceEncoder<BitmapDrawable> {
    private final ResourceEncoder<Bitmap> onExtraCallback;
    private final Savers_androidKtExternalSyntheticLambda5 onNavigationEvent;

    public setOnModifierChangedui(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, ResourceEncoder<Bitmap> resourceEncoder) {
        this.onNavigationEvent = savers_androidKtExternalSyntheticLambda5;
        this.onExtraCallback = resourceEncoder;
    }

    @Override // o.SaversKtExternalSyntheticLambda24
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean onExtraCallback(@NonNull Resource<BitmapDrawable> resource, @NonNull File file, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return this.onExtraCallback.onExtraCallback(new setUpdateBlock(resource.IAuthTabCallback().getBitmap(), this.onNavigationEvent), file, saversKtExternalSyntheticLambda30);
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public SaversKtExternalSyntheticLambda23 IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return this.onExtraCallback.IAuthTabCallback(saversKtExternalSyntheticLambda30);
    }
}
