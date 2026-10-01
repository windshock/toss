package o;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewHolder<T> implements SaversKtExternalSyntheticLambda29<T> {
    private static final SaversKtExternalSyntheticLambda29<?> onExtraCallback = new AndroidViewHolder();

    @Override // o.SaversKtExternalSyntheticLambda29
    public Resource<T> transform(@NonNull Context context, @NonNull Resource<T> resource, int i2, int i3) {
        return resource;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }

    public static <T> AndroidViewHolder<T> onWarmupCompleted() {
        return (AndroidViewHolder) onExtraCallback;
    }

    private AndroidViewHolder() {
    }
}
