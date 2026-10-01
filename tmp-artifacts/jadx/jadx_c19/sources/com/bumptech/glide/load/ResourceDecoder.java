package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import o.SaversKtExternalSyntheticLambda30;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ResourceDecoder<T, Z> {
    boolean IAuthTabCallback(@NonNull T t, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException;

    Resource<Z> onNavigationEvent(@NonNull T t, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException;
}
