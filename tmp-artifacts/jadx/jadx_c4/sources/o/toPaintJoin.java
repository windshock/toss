package o;

import androidx.biometric.BiometricPrompt;
import im.toss.core.biometric.data.ResultData;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface toPaintJoin<T extends ResultData> {
    T onExtraCallback(@NotNull BiometricPrompt.onExtraCallback onextracallback);

    BiometricPrompt.IAuthTabCallback onNavigationEvent();
}
