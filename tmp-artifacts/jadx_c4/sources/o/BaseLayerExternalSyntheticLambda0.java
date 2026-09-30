package o;

import android.content.Context;
import androidx.biometric.BiometricPrompt;
import im.toss.core.biometric.RsaCipherProvider;
import im.toss.core.biometric.data.ResultData;
import javax.crypto.Cipher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseLayerExternalSyntheticLambda0 implements toPaintJoin<BuildConfig> {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private final onValueChanged onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final RsaCipherProvider onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 41;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 35 / 0;
        }
    }

    public /* synthetic */ BaseLayerExternalSyntheticLambda0(RsaCipherProvider rsaCipherProvider, String str, onValueChanged onvaluechanged, DefaultConstructorMarker defaultConstructorMarker) {
        this(rsaCipherProvider, str, onvaluechanged);
    }

    private BaseLayerExternalSyntheticLambda0(RsaCipherProvider rsaCipherProvider, String str, onValueChanged onvaluechanged) {
        this.onWarmupCompleted = rsaCipherProvider;
        this.onNavigationEvent = str;
        this.onExtraCallbackWithResult = onvaluechanged;
    }

    @Override // o.toPaintJoin
    public /* synthetic */ ResultData onExtraCallback(BiometricPrompt.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(onextracallback);
        }
        IAuthTabCallback(onextracallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final BaseLayerExternalSyntheticLambda0 onExtraCallbackWithResult(@NotNull Context context, @Nullable String str, @NotNull String str2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str2, "");
            BaseLayerExternalSyntheticLambda0 baseLayerExternalSyntheticLambda0 = new BaseLayerExternalSyntheticLambda0(new RsaCipherProvider(context, str), str2, new RememberLottieCompositionKtrememberLottieComposition1(), null);
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return baseLayerExternalSyntheticLambda0;
            }
            throw null;
        }
    }

    @Override // o.toPaintJoin
    public BiometricPrompt.IAuthTabCallback onNavigationEvent() throws Exception {
        int i = 2 % 2;
        try {
            BiometricPrompt.IAuthTabCallback iAuthTabCallback = new BiometricPrompt.IAuthTabCallback(this.onWarmupCompleted.onExtraCallback());
            int i2 = IAuthTabCallbackStub + 57;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        } catch (Exception e) {
            Exception excOnExtraCallback = this.onWarmupCompleted.onExtraCallback(e);
            Intrinsics.checkNotNullExpressionValue(excOnExtraCallback, "");
            throw excOnExtraCallback;
        }
    }

    public BuildConfig IAuthTabCallback(@NotNull BiometricPrompt.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        BiometricPrompt.IAuthTabCallback iAuthTabCallbackOnExtraCallback = onextracallback.onExtraCallback();
        Intrinsics.checkNotNull(iAuthTabCallbackOnExtraCallback);
        Cipher cipherIAuthTabCallback = iAuthTabCallbackOnExtraCallback.IAuthTabCallback();
        Intrinsics.checkNotNull(cipherIAuthTabCallback);
        char[] cArrOnExtraCallbackWithResult = RoundedCornersParser.onExtraCallbackWithResult(cipherIAuthTabCallback.doFinal(this.onExtraCallbackWithResult.onWarmupCompleted(this.onNavigationEvent)));
        Intrinsics.checkNotNullExpressionValue(cArrOnExtraCallbackWithResult, "");
        BuildConfig buildConfig = new BuildConfig(new String(cArrOnExtraCallbackWithResult));
        int i2 = asBinder + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return buildConfig;
    }
}
