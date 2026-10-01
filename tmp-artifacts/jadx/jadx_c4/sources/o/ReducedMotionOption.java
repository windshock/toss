package o;

import android.content.Context;
import androidx.biometric.BiometricPrompt;
import im.toss.core.biometric.data.ResultData;
import javax.crypto.Cipher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ReducedMotionOption implements toPaintJoin<BuildConfig> {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent = 1;
    private static int onTransact;
    private final onValueChanged onExtraCallback;
    private final RememberLottieCompositionKtloadImagesFromAssets2 onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    static {
        int i = onNavigationEvent + 91;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ ReducedMotionOption(RememberLottieCompositionKtloadImagesFromAssets2 rememberLottieCompositionKtloadImagesFromAssets2, String str, onValueChanged onvaluechanged, DefaultConstructorMarker defaultConstructorMarker) {
        this(rememberLottieCompositionKtloadImagesFromAssets2, str, onvaluechanged);
    }

    private ReducedMotionOption(RememberLottieCompositionKtloadImagesFromAssets2 rememberLottieCompositionKtloadImagesFromAssets2, String str, onValueChanged onvaluechanged) {
        this.onExtraCallbackWithResult = rememberLottieCompositionKtloadImagesFromAssets2;
        this.onWarmupCompleted = str;
        this.onExtraCallback = onvaluechanged;
    }

    @Override // o.toPaintJoin
    public /* synthetic */ ResultData onExtraCallback(BiometricPrompt.onExtraCallback onextracallback) throws tempExtension {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BuildConfig buildConfigOnNavigationEvent = onNavigationEvent(onextracallback);
        int i4 = onTransact + 19;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return buildConfigOnNavigationEvent;
    }

    public static final class IAuthTabCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final ReducedMotionOption onWarmupCompleted(@NotNull Context context, @Nullable String str, @NotNull String str2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str2, "");
            ReducedMotionOption reducedMotionOption = new ReducedMotionOption(new RememberLottieCompositionKtloadImagesFromAssets2(context, str), str2, new RememberLottieCompositionKtrememberLottieComposition1(), null);
            int i2 = onWarmupCompleted + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return reducedMotionOption;
            }
            throw null;
        }
    }

    @Override // o.toPaintJoin
    public BiometricPrompt.IAuthTabCallback onNavigationEvent() throws Exception {
        int i = 2 % 2;
        try {
            BiometricPrompt.IAuthTabCallback iAuthTabCallback = new BiometricPrompt.IAuthTabCallback(this.onExtraCallbackWithResult.IAuthTabCallback(RectangleShapeParser.onExtraCallbackWithResult(this.onExtraCallback, this.onWarmupCompleted).onExtraCallback()));
            int i2 = asInterface + 19;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        } catch (Exception e) {
            Exception excOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(e);
            Intrinsics.checkNotNullExpressionValue(excOnExtraCallback, "");
            throw excOnExtraCallback;
        }
    }

    public BuildConfig onNavigationEvent(@NotNull BiometricPrompt.onExtraCallback onextracallback) throws tempExtension {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        RectangleShapeParser rectangleShapeParserOnExtraCallbackWithResult = RectangleShapeParser.onExtraCallbackWithResult(this.onExtraCallback, this.onWarmupCompleted);
        BiometricPrompt.IAuthTabCallback iAuthTabCallbackOnExtraCallback = onextracallback.onExtraCallback();
        Intrinsics.checkNotNull(iAuthTabCallbackOnExtraCallback);
        Cipher cipherIAuthTabCallback = iAuthTabCallbackOnExtraCallback.IAuthTabCallback();
        Intrinsics.checkNotNull(cipherIAuthTabCallback);
        char[] cArrOnExtraCallbackWithResult = RoundedCornersParser.onExtraCallbackWithResult(cipherIAuthTabCallback.doFinal(rectangleShapeParserOnExtraCallbackWithResult.IAuthTabCallback()));
        Intrinsics.checkNotNullExpressionValue(cArrOnExtraCallbackWithResult, "");
        BuildConfig buildConfig = new BuildConfig(new String(cArrOnExtraCallbackWithResult));
        int i2 = asInterface + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return buildConfig;
    }
}
