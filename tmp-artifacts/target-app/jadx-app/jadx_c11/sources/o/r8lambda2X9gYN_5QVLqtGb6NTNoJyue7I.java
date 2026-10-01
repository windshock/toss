package o;

import androidx.compose.animation.core.RepeatMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda2X9gYN_5QVLqtGb6NTNoJyue7I {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int onExtraCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[getExtraParameters.values().length];
            try {
                iArr[getExtraParameters.Normal.ordinal()] = 1;
                int i = onExtraCallback + 81;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getExtraParameters.Alternate.ordinal()] = 2;
                int i4 = onExtraCallback + 79;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final RepeatMode onExtraCallback(@NotNull getExtraParameters getextraparameters) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        int i2 = onWarmupCompleted.onExtraCallbackWithResult[getextraparameters.ordinal()];
        if (i2 == 1) {
            return RepeatMode.Restart;
        }
        int i3 = onNavigationEvent;
        int i4 = i3 + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i3 + 23;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            RepeatMode repeatMode = RepeatMode.Reverse;
            throw null;
        }
        RepeatMode repeatMode2 = RepeatMode.Reverse;
        int i7 = onNavigationEvent + 87;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return repeatMode2;
    }
}
