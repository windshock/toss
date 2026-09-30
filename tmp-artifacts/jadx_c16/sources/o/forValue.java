package o;

import android.content.Context;
import androidx.biometric.BiometricPrompt;
import im.toss.core.biometric.data.ResultData;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class forValue implements toPaintJoin<IconRoundCornerProgressBar> {
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private final RememberLottieCompositionKtloadImagesFromAssets2 onExtraCallbackWithResult;
    private final onValueChanged onNavigationEvent;
    private final char[] onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = IAuthTabCallback + 51;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ forValue(RememberLottieCompositionKtloadImagesFromAssets2 rememberLottieCompositionKtloadImagesFromAssets2, char[] cArr, onValueChanged onvaluechanged, DefaultConstructorMarker defaultConstructorMarker) {
        this(rememberLottieCompositionKtloadImagesFromAssets2, cArr, onvaluechanged);
    }

    private forValue(RememberLottieCompositionKtloadImagesFromAssets2 rememberLottieCompositionKtloadImagesFromAssets2, char[] cArr, onValueChanged onvaluechanged) {
        this.onExtraCallbackWithResult = rememberLottieCompositionKtloadImagesFromAssets2;
        this.onWarmupCompleted = cArr;
        this.onNavigationEvent = onvaluechanged;
    }

    public /* synthetic */ ResultData onExtraCallback(BiometricPrompt.onExtraCallback onextracallback) throws BadPaddingException, IllegalBlockSizeException {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IconRoundCornerProgressBar iconRoundCornerProgressBarIAuthTabCallback = IAuthTabCallback(onextracallback);
        int i4 = asBinder + 63;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iconRoundCornerProgressBarIAuthTabCallback;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final forValue onWarmupCompleted(@NotNull Context context, @Nullable String str, @NotNull char[] cArr, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(cArr, "");
            DefaultConstructorMarker defaultConstructorMarker = null;
            forValue forvalue = new forValue(new RememberLottieCompositionKtloadImagesFromAssets2(context, str, z), cArr, new RememberLottieCompositionKtrememberLottieComposition1(), defaultConstructorMarker);
            int i2 = onExtraCallbackWithResult + 111;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return forvalue;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }
    }

    public BiometricPrompt.IAuthTabCallback onNavigationEvent() throws Exception {
        int i = 2 % 2;
        try {
            BiometricPrompt.IAuthTabCallback iAuthTabCallback = new BiometricPrompt.IAuthTabCallback(this.onExtraCallbackWithResult.onWarmupCompleted());
            int i2 = asBinder + 39;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        } catch (Exception e) {
            Exception excOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(e);
            Intrinsics.checkNotNullExpressionValue(excOnExtraCallback, "");
            throw excOnExtraCallback;
        }
    }

    public IconRoundCornerProgressBar IAuthTabCallback(@NotNull BiometricPrompt.onExtraCallback onextracallback) throws BadPaddingException, IllegalBlockSizeException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        BiometricPrompt.IAuthTabCallback iAuthTabCallbackOnExtraCallback = onextracallback.onExtraCallback();
        Intrinsics.checkNotNull(iAuthTabCallbackOnExtraCallback);
        Cipher cipherIAuthTabCallback = iAuthTabCallbackOnExtraCallback.IAuthTabCallback();
        Intrinsics.checkNotNull(cipherIAuthTabCallback);
        String string = RectangleShapeParser.IAuthTabCallback(this.onNavigationEvent, cipherIAuthTabCallback.doFinal(RoundedCornersParser.IAuthTabCallback(this.onWarmupCompleted)), ((IvParameterSpec) cipherIAuthTabCallback.getParameters().getParameterSpec(IvParameterSpec.class)).getIV()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        RectangleShapeParser.IAuthTabCallback(string);
        IconRoundCornerProgressBar iconRoundCornerProgressBar = new IconRoundCornerProgressBar(string);
        int i2 = asBinder + 115;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return iconRoundCornerProgressBar;
    }
}
