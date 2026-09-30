package o;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ALCFaceSDK11 {
    Collection<String> IAuthTabCallback();

    void IAuthTabCallback(@NotNull C0063getFeatureExtension c0063getFeatureExtension);

    void onExtraCallback(@NotNull String str);

    void onExtraCallbackWithResult(@NotNull String str);

    void onExtraCallbackWithResult(@NotNull C0062getAttributeExtension c0062getAttributeExtension);

    Collection<String> onNavigationEvent();

    C0062getAttributeExtension onNavigationEvent(@NotNull String str);

    C0063getFeatureExtension onWarmupCompleted(@NotNull String str);

    void onWarmupCompleted(boolean z);
}
