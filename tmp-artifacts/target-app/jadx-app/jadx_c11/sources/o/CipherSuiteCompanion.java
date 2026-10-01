package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface CipherSuiteCompanion {

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[getSpecialFeatureOptInStatus.values().length];
            try {
                iArr[getSpecialFeatureOptInStatus.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getSpecialFeatureOptInStatus.Dark.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 51;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
            int i4 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    int IAuthTabCallback();

    int onExtraCallbackWithResult();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    default int onNavigationEvent(@NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
        int i2 = onNavigationEvent.onExtraCallback[getspecialfeatureoptinstatus.ordinal()];
        if (i2 == 1) {
            return IAuthTabCallback();
        }
        if (i2 == 2) {
            return onExtraCallbackWithResult();
        }
        throw new NoWhenBranchMatchedException();
    }
}
