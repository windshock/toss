package o;

import androidx.biometric.BiometricPrompt;
import im.toss.core.biometric.data.ResultData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface RememberLottieCompositionKtrememberLottieComposition3<T extends ResultData> extends toPaintJoin<T> {
    default Void IAuthTabCallback() {
        int i = 2 % 2;
        return null;
    }

    default Void IAuthTabCallback(@NotNull BiometricPrompt.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        return null;
    }

    T onExtraCallback();

    @Override // o.toPaintJoin
    /* synthetic */ default ResultData onExtraCallback(BiometricPrompt.onExtraCallback onextracallback) {
        int i = 2 % 2;
        return (ResultData) IAuthTabCallback(onextracallback);
    }

    @Override // o.toPaintJoin
    /* synthetic */ default BiometricPrompt.IAuthTabCallback onNavigationEvent() {
        int i = 2 % 2;
        return IAuthTabCallback();
    }
}
