package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setOnDensityChangedui<DataType> implements ResourceDecoder<DataType, BitmapDrawable> {
    private final Resources IAuthTabCallback;
    private final ResourceDecoder<DataType, Bitmap> onExtraCallbackWithResult;

    public setOnDensityChangedui(@NonNull Resources resources, @NonNull ResourceDecoder<DataType, Bitmap> resourceDecoder) {
        this.IAuthTabCallback = (Resources) markHierarchyDirty.onExtraCallbackWithResult(resources);
        this.onExtraCallbackWithResult = (ResourceDecoder) markHierarchyDirty.onExtraCallbackWithResult(resourceDecoder);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean IAuthTabCallback(@NonNull DataType datatype, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return this.onExtraCallbackWithResult.IAuthTabCallback(datatype, saversKtExternalSyntheticLambda30);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<BitmapDrawable> onNavigationEvent(@NonNull DataType datatype, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return removeWaiter.onExtraCallback(this.IAuthTabCallback, this.onExtraCallbackWithResult.onNavigationEvent(datatype, i2, i3, saversKtExternalSyntheticLambda30));
    }
}
