package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accesssetIndexp {

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[asArray.values().length];
            try {
                iArr[asArray.PW_4_DIGIT_1_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[asArray.PW_6_DIGIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[nativeReadByte.values().length];
            try {
                iArr2[nativeReadByte.PW_4_DIGIT_1_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[nativeReadByte.PW_6_DIGIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr2;
            int[] iArr3 = new int[setPluginVersion.values().length];
            try {
                iArr3[setPluginVersion.PW_4_DIGIT_1_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[setPluginVersion.PW_6_DIGIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            onNavigationEvent = iArr3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final nativeReadByte onExtraCallback(@NotNull asArray asarray) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(asarray, "");
        int i = onNavigationEvent.onWarmupCompleted[asarray.ordinal()];
        if (i == 1) {
            return nativeReadByte.PW_4_DIGIT_1_ALPHA;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return nativeReadByte.PW_6_DIGIT;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final asArray IAuthTabCallback(@NotNull nativeReadByte nativereadbyte) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        int i = onNavigationEvent.IAuthTabCallback[nativereadbyte.ordinal()];
        if (i == 1) {
            return asArray.PW_4_DIGIT_1_ALPHA;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return asArray.PW_6_DIGIT;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final setPluginVersion onWarmupCompleted(@NotNull nativeReadByte nativereadbyte) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        int i = onNavigationEvent.IAuthTabCallback[nativereadbyte.ordinal()];
        if (i == 1) {
            return setPluginVersion.PW_4_DIGIT_1_ALPHA;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return setPluginVersion.PW_6_DIGIT;
    }
}
