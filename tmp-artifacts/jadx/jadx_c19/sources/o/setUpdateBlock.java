package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setUpdateBlock implements Resource<Bitmap>, Savers_androidKtExternalSyntheticLambda0 {
    private final Bitmap IAuthTabCallback;
    private final Savers_androidKtExternalSyntheticLambda5 onNavigationEvent;

    public static setUpdateBlock onWarmupCompleted(@Nullable Bitmap bitmap, @NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5) {
        if (bitmap == null) {
            return null;
        }
        return new setUpdateBlock(bitmap, savers_androidKtExternalSyntheticLambda5);
    }

    public setUpdateBlock(@NonNull Bitmap bitmap, @NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5) {
        this.IAuthTabCallback = (Bitmap) markHierarchyDirty.onExtraCallbackWithResult(bitmap, "Bitmap must not be null");
        this.onNavigationEvent = (Savers_androidKtExternalSyntheticLambda5) markHierarchyDirty.onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda5, "BitmapPool must not be null");
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class<Bitmap> onExtraCallbackWithResult() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public Bitmap IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int onExtraCallback() {
        return applyConstraintsFromLayoutParams.onWarmupCompleted(this.IAuthTabCallback);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void asBinder() {
        this.onNavigationEvent.onWarmupCompleted(this.IAuthTabCallback);
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda0
    public void onWarmupCompleted() {
        this.IAuthTabCallback.prepareToDraw();
    }
}
