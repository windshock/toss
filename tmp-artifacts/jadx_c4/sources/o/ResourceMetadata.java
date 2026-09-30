package o;

import javax.crypto.spec.IvParameterSpec;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ResourceMetadata implements getProgressColor {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 onExtraCallbackWithResult;

    @Inject
    public ResourceMetadata(@NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        this.onExtraCallbackWithResult = constraintsSizeResolverExternalSyntheticLambda0;
    }

    @Override // o.getProgressColor
    public String onExtraCallbackWithResult(@NotNull String str) {
        String string;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                String strOnExtraCallback = setup.onExtraCallback(setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, this.onExtraCallbackWithResult.IAuthTabCallbackDefault(), (IvParameterSpec) null, 2, (Object) null), str, 0);
                int length = strOnExtraCallback.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare(strOnExtraCallback.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                string = strOnExtraCallback.subSequence(i, length + 1).toString();
            } catch (BaseRoundCornerProgressBarSavedState e) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("keyCipher::encode", e);
                string = "";
            }
        }
        return string;
    }

    @Override // o.getProgressColor
    public String onWarmupCompleted(@NotNull String str) {
        String strOnWarmupCompleted;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            strOnWarmupCompleted = setup.onWarmupCompleted(setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, this.onExtraCallbackWithResult.IAuthTabCallbackDefault(), null, 2, null), str, 0);
        }
        return strOnWarmupCompleted;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return "tossKeyCipher";
        }
        obj.hashCode();
        throw null;
    }
}
