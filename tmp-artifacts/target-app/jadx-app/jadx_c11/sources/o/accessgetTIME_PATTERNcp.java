package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.setCipherSuitesokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetTIME_PATTERNcp {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[parseDomain.values().length];
            try {
                iArr[parseDomain.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[parseDomain.DRAW.ordinal()] = 2;
                int i = onExtraCallback + 65;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[parseDomain.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[pathMatch.values().length];
            try {
                iArr2[pathMatch.R8.ordinal()] = 1;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[pathMatch.RGBA8.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[pathMatch.RGB10_A2.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[pathMatch.DEPTH24STENCIL8.ordinal()] = 4;
                int i5 = IAuthTabCallback + 73;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            onWarmupCompleted = iArr2;
        }
    }

    public static final /* synthetic */ setCipherSuitesokhttp.IAuthTabCallback onExtraCallback(pathMatch pathmatch) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setCipherSuitesokhttp.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = onWarmupCompleted(pathmatch);
        int i4 = IAuthTabCallback + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iAuthTabCallbackOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final int IAuthTabCallback(@NotNull parseDomain parsedomain) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parsedomain, "");
        int i2 = IAuthTabCallback.onNavigationEvent[parsedomain.ordinal()];
        if (i2 == 1) {
            return 36008;
        }
        int i3 = onExtraCallback;
        int i4 = i3 + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 ? i2 == 2 : i2 == 3) {
            int i5 = i3 + 107;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return 36009;
        }
        int i7 = i3 + 99;
        int i8 = i7 % 128;
        IAuthTabCallback = i8;
        int i9 = i7 % 2;
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = i8 + 97;
        onExtraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return 36160;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final setCipherSuitesokhttp.IAuthTabCallback onWarmupCompleted(pathMatch pathmatch) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = IAuthTabCallback.onWarmupCompleted[pathmatch.ordinal()];
        if (i4 == 1) {
            return setCipherSuitesokhttp.IAuthTabCallback.R8;
        }
        if (i4 != 2) {
            int i5 = onExtraCallback + 37;
            int i6 = i5 % 128;
            IAuthTabCallback = i6;
            int i7 = i5 % 2;
            if (i4 == 3) {
                return setCipherSuitesokhttp.IAuthTabCallback.RGB10_A2;
            }
            int i8 = i6 + 109;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0 ? i4 != 4 : i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return setCipherSuitesokhttp.IAuthTabCallback.DEPTH24STENCIL8;
        }
        setCipherSuitesokhttp.IAuthTabCallback iAuthTabCallback = setCipherSuitesokhttp.IAuthTabCallback.RGBA8;
        int i9 = IAuthTabCallback + 83;
        onExtraCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
