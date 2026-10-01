package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewHolderExternalSyntheticLambda0 implements ResourceDecoder<ImageDecoder.Source, Bitmap> {
    private final Savers_androidKtExternalSyntheticLambda5 onExtraCallback = new Savers_androidKtExternalSyntheticLambda3();

    public boolean pL_(@NonNull ImageDecoder.Source source, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* synthetic */ boolean IAuthTabCallback(@NonNull ImageDecoder.Source source, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return pL_(setSavedStateRegistryOwner.pM_(source), saversKtExternalSyntheticLambda30);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* synthetic */ Resource<Bitmap> onNavigationEvent(@NonNull ImageDecoder.Source source, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return pK_(setSavedStateRegistryOwner.pM_(source), i2, i3, saversKtExternalSyntheticLambda30);
    }

    public Resource<Bitmap> pK_(@NonNull ImageDecoder.Source source, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new setLifecycleOwner(i2, i3, saversKtExternalSyntheticLambda30));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new setUpdateBlock(bitmapDecodeBitmap, this.onExtraCallback);
    }
}
