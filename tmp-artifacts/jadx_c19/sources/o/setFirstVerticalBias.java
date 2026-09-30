package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setFirstVerticalBias implements ResourceTranscoder<Bitmap, BitmapDrawable> {
    private final Resources onNavigationEvent;

    public setFirstVerticalBias(@NonNull Resources resources) {
        this.onNavigationEvent = (Resources) markHierarchyDirty.onExtraCallbackWithResult(resources);
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource<BitmapDrawable> onWarmupCompleted(@NonNull Resource<Bitmap> resource, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return removeWaiter.onExtraCallback(this.onNavigationEvent, resource);
    }
}
