package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TransitionExternalSyntheticLambda5 implements ResourceDecoder<File, File> {
    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(@NonNull File file, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<File> onNavigationEvent(@NonNull File file, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new getInterpolation(file);
    }
}
