package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class removeWaiter implements Resource<BitmapDrawable>, Savers_androidKtExternalSyntheticLambda0 {
    private final Resources IAuthTabCallback;
    private final Resource<Bitmap> onExtraCallbackWithResult;

    public static Resource<BitmapDrawable> onExtraCallback(@NonNull Resources resources, @Nullable Resource<Bitmap> resource) {
        if (resource == null) {
            return null;
        }
        return new removeWaiter(resources, resource);
    }

    private removeWaiter(@NonNull Resources resources, @NonNull Resource<Bitmap> resource) {
        this.IAuthTabCallback = (Resources) markHierarchyDirty.onExtraCallbackWithResult(resources);
        this.onExtraCallbackWithResult = (Resource) markHierarchyDirty.onExtraCallbackWithResult(resource);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class<BitmapDrawable> onExtraCallbackWithResult() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable IAuthTabCallback() {
        return new BitmapDrawable(this.IAuthTabCallback, this.onExtraCallbackWithResult.IAuthTabCallback());
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int onExtraCallback() {
        return this.onExtraCallbackWithResult.onExtraCallback();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void asBinder() {
        this.onExtraCallbackWithResult.asBinder();
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda0
    public void onWarmupCompleted() {
        Resource<Bitmap> resource = this.onExtraCallbackWithResult;
        if (resource instanceof Savers_androidKtExternalSyntheticLambda0) {
            ((Savers_androidKtExternalSyntheticLambda0) resource).onWarmupCompleted();
        }
    }
}
