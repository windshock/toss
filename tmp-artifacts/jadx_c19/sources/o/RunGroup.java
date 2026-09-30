package o;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RunGroup implements SaversKtExternalSyntheticLambda29<TransitionExternalSyntheticLambda6> {
    private final SaversKtExternalSyntheticLambda29<Bitmap> onWarmupCompleted;

    public RunGroup(SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29) {
        this.onWarmupCompleted = (SaversKtExternalSyntheticLambda29) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda29);
    }

    @Override // o.SaversKtExternalSyntheticLambda29
    public Resource<TransitionExternalSyntheticLambda6> transform(@NonNull Context context, @NonNull Resource<TransitionExternalSyntheticLambda6> resource, int i2, int i3) {
        TransitionExternalSyntheticLambda6 transitionExternalSyntheticLambda6IAuthTabCallback = resource.IAuthTabCallback();
        Resource<Bitmap> setupdateblock = new setUpdateBlock(transitionExternalSyntheticLambda6IAuthTabCallback.onExtraCallback(), Glide.onNavigationEvent(context).onNavigationEvent());
        Resource<Bitmap> resourceTransform = this.onWarmupCompleted.transform(context, setupdateblock, i2, i3);
        if (!setupdateblock.equals(resourceTransform)) {
            setupdateblock.asBinder();
        }
        transitionExternalSyntheticLambda6IAuthTabCallback.onExtraCallbackWithResult(this.onWarmupCompleted, resourceTransform.IAuthTabCallback());
        return resource;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public boolean equals(Object obj) {
        if (obj instanceof RunGroup) {
            return this.onWarmupCompleted.equals(((RunGroup) obj).onWarmupCompleted);
        }
        return false;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public int hashCode() {
        return this.onWarmupCompleted.hashCode();
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.onWarmupCompleted.updateDiskCacheKey(messageDigest);
    }
}
