package o;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.SubcomposeAsyncImageKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealStrongMemoryCache {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final TextRoundCornerProgressBarSavedState1 IAuthTabCallback;
    private final SubcomposeAsyncImageKtExternalSyntheticLambda0 onExtraCallback;
    private final Context onExtraCallbackWithResult;

    public RealStrongMemoryCache(@NotNull Context context, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull SubcomposeAsyncImageKtExternalSyntheticLambda0 subcomposeAsyncImageKtExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(subcomposeAsyncImageKtExternalSyntheticLambda0, "");
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallback = textRoundCornerProgressBarSavedState1;
        this.onExtraCallback = subcomposeAsyncImageKtExternalSyntheticLambda0;
    }

    public static /* synthetic */ SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onNavigationEvent(RealStrongMemoryCache realStrongMemoryCache, String str, int i, int i2, boolean z, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 2) != 0) {
            int i5 = onNavigationEvent + 123;
            onWarmupCompleted = i5 % 128;
            i = i5 % 2 == 0 ? 5 : 4;
        }
        if ((i3 & 4) != 0) {
            int i6 = onNavigationEvent + 99;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            i2 = -99;
        }
        return realStrongMemoryCache.onExtraCallbackWithResult(str, i, i2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r9
      0x002b: PHI (r9v8 int) = (r9v7 int), (r9v15 int) binds: [B:10:0x0029, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onExtraCallbackWithResult(@NotNull String str, int i, int i2, boolean z) throws RealMemoryCache, BitmapFactoryDecoderExternalSyntheticLambda2, ResourceIntMapper, IllegalArgumentException, RealStrongMemoryCachecache1 {
        int iOnWarmupCompleted;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            int i4 = onWarmupCompleted + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                iOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(str, -1);
                int i5 = 15 / 0;
                if (iOnWarmupCompleted != -1) {
                    int i6 = onWarmupCompleted;
                    int i7 = i6 + 47;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnWarmupCompleted != 0 && iOnWarmupCompleted != 1) {
                        int i9 = i6 + 53;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 == 0) {
                        }
                    }
                    return this.onExtraCallback.onWarmupCompleted(iOnWarmupCompleted);
                }
                if (i2 != -99) {
                    Map<String, ?> all = this.onExtraCallbackWithResult.getSharedPreferences(str, 0).getAll();
                    Intrinsics.checkNotNullExpressionValue(all, "");
                    if (!all.isEmpty()) {
                        SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(i2);
                        int i10 = onNavigationEvent + 13;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 != 0) {
                            return onnavigationeventOnWarmupCompleted;
                        }
                        throw null;
                    }
                }
            } else {
                iOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(str, -1);
                if (iOnWarmupCompleted != -1) {
                }
            }
        }
        if (i != 4) {
            throw new RealMemoryCache(str, 4, i);
        }
        int i11 = onWarmupCompleted + 53;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 == 0) {
            return onWarmupCompleted(str, i);
        }
        SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnWarmupCompleted2 = onWarmupCompleted(str, i);
        int i12 = 95 / 0;
        return onnavigationeventOnWarmupCompleted2;
    }

    public final SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onExtraCallback(@NotNull String str, int i) throws RealMemoryCache, ResourceIntMapper, RealStrongMemoryCachecache1 {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i != 1) {
            int i5 = onWarmupCompleted + 81;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (i != 2) {
                throw new RealMemoryCache(str, 2, i);
            }
        }
        SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(str, i);
        int i7 = onNavigationEvent + 59;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    public final SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onExtraCallback(@NotNull String str) throws ResourceIntMapper, RealStrongMemoryCachecache1 {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(str, 0);
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    public final SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback.onExtraCallback(str, -2, true);
        SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted();
        int i4 = onNavigationEvent + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private final SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onWarmupCompleted(String str, int i) throws ResourceIntMapper, RealStrongMemoryCachecache1 {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(str, -1);
        if (iOnWarmupCompleted == -2) {
            return this.onExtraCallback.onWarmupCompleted();
        }
        if (iOnWarmupCompleted == -1) {
            this.IAuthTabCallback.onExtraCallback(str, i, true);
        } else if (iOnWarmupCompleted != i) {
            int i5 = onWarmupCompleted;
            int i6 = i5 + 81;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0 ? i == 4 : i == 4) {
                int i7 = i5 + 15;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                if (iOnWarmupCompleted < 4 || iOnWarmupCompleted == 5) {
                    this.IAuthTabCallback.onExtraCallback(str, i, true);
                    throw new ResourceIntMapper(str, iOnWarmupCompleted, i);
                }
            }
            throw new RealStrongMemoryCachecache1(str, iOnWarmupCompleted, i);
        }
        return this.onExtraCallback.onWarmupCompleted(i);
    }
}
