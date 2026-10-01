package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0 {

    public interface onExtraCallbackWithResult {
        void onNavigationEvent(@NonNull Resource<?> resource);
    }

    Resource<?> IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26);

    Resource<?> IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, @Nullable Resource<?> resource);

    void onExtraCallback(int i2);

    void onNavigationEvent(@NonNull onExtraCallbackWithResult onextracallbackwithresult);

    void onWarmupCompleted();
}
