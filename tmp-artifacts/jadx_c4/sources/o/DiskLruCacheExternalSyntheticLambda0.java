package o;

import android.text.TextUtils;
import javax.crypto.spec.IvParameterSpec;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DiskLruCacheExternalSyntheticLambda0 implements getMax {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 onWarmupCompleted;

    @Inject
    public DiskLruCacheExternalSyntheticLambda0(@NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        this.onWarmupCompleted = constraintsSizeResolverExternalSyntheticLambda0;
    }

    private final String IAuthTabCallback(String str) {
        int i = 2 % 2;
        String strSubstring = (Integer.toHexString(str.hashCode()) + this.onWarmupCompleted.IAuthTabCallbackDefault()).substring(0, this.onWarmupCompleted.IAuthTabCallbackDefault().length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return strSubstring;
    }

    @Override // o.getMax
    public String onNavigationEvent(@NotNull String str, @NotNull String str2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (!TextUtils.isEmpty(str)) {
                str = setup.IAuthTabCallback(setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, IAuthTabCallback(str2), (IvParameterSpec) null, 2, (Object) null), str, 0, 2, null);
            }
        }
        return str;
    }

    @Override // o.getMax
    public String IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (str.length() > 0) {
                str = setup.onNavigationEvent(setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, IAuthTabCallback(str2), null, 2, null), str, 0, 2, null);
            }
        }
        return str;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return "newValueCipher";
        }
        throw null;
    }
}
