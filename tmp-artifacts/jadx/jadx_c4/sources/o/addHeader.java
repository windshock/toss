package o;

import android.text.TextUtils;
import javax.crypto.spec.IvParameterSpec;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addHeader implements getMax {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 onWarmupCompleted;

    @Inject
    public addHeader(@NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        this.onWarmupCompleted = constraintsSizeResolverExternalSyntheticLambda0;
    }

    private final String onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        String strSubstring = (Integer.toHexString(str.hashCode()) + this.onWarmupCompleted.IAuthTabCallbackDefault()).substring(0, this.onWarmupCompleted.IAuthTabCallbackDefault().length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return strSubstring;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getMax
    public String onNavigationEvent(@NotNull String str, @NotNull String str2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (!TextUtils.isEmpty(str)) {
                str = setup.onExtraCallback(setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, onExtraCallbackWithResult(str2), (IvParameterSpec) null, 2, (Object) null), str, 0);
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
                str = setup.onWarmupCompleted(setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, onExtraCallbackWithResult(str2), null, 2, null), str, 0);
            }
        }
        return str;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return "bankValueCipher";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
