package im.toss.core.biometric;

import android.content.Context;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import java.security.InvalidKeyException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BaseLayerExternalSyntheticLambda0;
import o.BuildConfig;
import o.IconRoundCornerProgressBar;
import o.RectangleShape;
import o.ReducedMotionMode;
import o.ReducedMotionOption;
import o.RememberLottieCompositionKtlottieComposition1;
import o.RepeaterParser;
import o.drawIconBackgroundColor;
import o.forValue;
import o.getByteBuffer;
import o.toNativeBlendMode;
import o.toPaintCap;
import o.toPaintJoin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RxBiometric {
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class WhenMappings {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[RepeaterParser.values().length];
            try {
                iArr[RepeaterParser.AES.ordinal()] = 1;
                int i = onExtraCallback + 17;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RepeaterParser.RSA.ordinal()] = 2;
                int i4 = onExtraCallback + 57;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 109;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RectangleShape onExtraCallbackWithResult(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            RectangleShape rectangleShapeOnNavigationEvent = toNativeBlendMode.Companion.onNavigationEvent(context);
            int i4 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return rectangleShapeOnNavigationEvent;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onExtraCallbackWithResult(@NotNull Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                int i3 = 26 / 0;
                if (!(th instanceof KeyPermanentlyInvalidatedException)) {
                    int i4 = onExtraCallbackWithResult + 5;
                    onWarmupCompleted = i4 % 128;
                    boolean z = th instanceof InvalidKeyException;
                    if (i4 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!z) {
                        return false;
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(th, "");
                if (!(th instanceof KeyPermanentlyInvalidatedException)) {
                }
            }
            int i5 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final getByteBuffer<drawIconBackgroundColor<BuildConfig>> onWarmupCompleted(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull RepeaterParser repeaterParser, @NotNull Context context, @Nullable String str, @NotNull String str2, @NotNull String str3, int i, @Nullable String str4) throws NoWhenBranchMatchedException {
        Object objOnWarmupCompleted;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Intrinsics.checkNotNullParameter(repeaterParser, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int i3 = WhenMappings.onWarmupCompleted[repeaterParser.ordinal()];
        if (i3 == 1) {
            objOnWarmupCompleted = ReducedMotionOption.Companion.onWarmupCompleted(context, str, str2);
            int i4 = IAuthTabCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = onNavigationEvent + 107;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            objOnWarmupCompleted = BaseLayerExternalSyntheticLambda0.Companion.onExtraCallbackWithResult(context, str, str2);
        }
        getByteBuffer<drawIconBackgroundColor<BuildConfig>> getbytebufferIAuthTabCallback = getByteBuffer.IAuthTabCallback(new ReducedMotionMode(rememberLottieCompositionKtlottieComposition1, str3, i, str4).onNavigationEvent((toPaintJoin) objOnWarmupCompleted));
        Intrinsics.checkNotNullExpressionValue(getbytebufferIAuthTabCallback, "");
        return getbytebufferIAuthTabCallback;
    }

    public static /* synthetic */ getByteBuffer onWarmupCompleted(RxBiometric rxBiometric, Context context, RepeaterParser repeaterParser, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
        boolean z2;
        int i3 = 2 % 2;
        if ((i2 & 64) != 0) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 125;
            onNavigationEvent = i5 % 128;
            boolean z3 = i5 % 2 != 0;
            int i6 = i4 + 39;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 3;
            }
            z2 = z3;
        } else {
            z2 = z;
        }
        return rxBiometric.IAuthTabCallback(context, repeaterParser, str, str2, str3, i, z2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final getByteBuffer<drawIconBackgroundColor<IconRoundCornerProgressBar>> IAuthTabCallback(@NotNull Context context, @NotNull RepeaterParser repeaterParser, @Nullable String str, @NotNull String str2, @NotNull String str3, int i, boolean z) throws NoWhenBranchMatchedException {
        toPaintCap topaintcapOnWarmupCompleted;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(repeaterParser, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int i3 = WhenMappings.onWarmupCompleted[repeaterParser.ordinal()];
        if (i3 != 1) {
            int i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            toPaintCap.onExtraCallbackWithResult onextracallbackwithresult = toPaintCap.Companion;
            char[] charArray = str2.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "");
            topaintcapOnWarmupCompleted = onextracallbackwithresult.onExtraCallback(context, str, charArray, z);
        } else {
            forValue.onExtraCallback onextracallback = forValue.Companion;
            char[] charArray2 = str2.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "");
            topaintcapOnWarmupCompleted = onextracallback.onWarmupCompleted(context, str, charArray2, z);
            int i6 = IAuthTabCallback + 15;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 4;
            }
        }
        getByteBuffer<drawIconBackgroundColor<IconRoundCornerProgressBar>> getbytebufferIAuthTabCallback = getByteBuffer.IAuthTabCallback(new ReducedMotionMode(null, str3, i, null, 8, null).onNavigationEvent((toPaintJoin) topaintcapOnWarmupCompleted));
        Intrinsics.checkNotNullExpressionValue(getbytebufferIAuthTabCallback, "");
        int i8 = onNavigationEvent + 65;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return getbytebufferIAuthTabCallback;
    }
}
