package o;

import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setCacheokhttp {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        static {
            int[] iArr = new int[TdsBadgeV1View.IAuthTabCallback.values().length];
            try {
                iArr[TdsBadgeV1View.IAuthTabCallback.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TdsBadgeV1View.IAuthTabCallback.MEDIUM.ordinal()] = 2;
                int i = onExtraCallback + 69;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TdsBadgeV1View.IAuthTabCallback.SMALL.ordinal()] = 3;
                int i3 = onExtraCallback + 77;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TdsBadgeV1View.IAuthTabCallback.TINY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
            int i6 = onExtraCallbackWithResult + 1;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 63 / 0;
            }
        }
    }

    public static final /* synthetic */ float onNavigationEvent(TdsBadgeV1View.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(iAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallback);
        int i3 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
        }
        return fOnExtraCallbackWithResult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final float onExtraCallbackWithResult(TdsBadgeV1View.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent.IAuthTabCallback[iAuthTabCallback.ordinal()];
        if (i2 == 1) {
            return 29.0f;
        }
        int i3 = onWarmupCompleted + 19;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (i2 == 2) {
            return 26.0f;
        }
        int i6 = i4 + 117;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        if (i2 == 3) {
            return 24.0f;
        }
        if (i2 == 4) {
            return 21.0f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
