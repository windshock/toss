package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Carousel implements ResourceEncoder<TransitionExternalSyntheticLambda6> {
    @Override // com.bumptech.glide.load.ResourceEncoder
    public SaversKtExternalSyntheticLambda23 IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return SaversKtExternalSyntheticLambda23.SOURCE;
    }

    @Override // o.SaversKtExternalSyntheticLambda24
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public boolean onExtraCallback(@NonNull Resource<TransitionExternalSyntheticLambda6> resource, @NonNull File file, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws Throwable {
        try {
            Barrier.onExtraCallbackWithResult(resource.IAuthTabCallback().onNavigationEvent(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
