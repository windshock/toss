package o;

import android.content.Context;
import androidx.biometric.BiometricPrompt;
import im.toss.core.biometric.RsaCipherProvider;
import im.toss.core.biometric.data.ResultData;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class toPaintCap implements RememberLottieCompositionKtrememberLottieComposition3<IconRoundCornerProgressBar> {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int asInterface = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final RsaCipherProvider IAuthTabCallback;
    private final char[] onExtraCallback;
    private final onValueChanged onNavigationEvent;

    static {
        int i = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ toPaintCap(RsaCipherProvider rsaCipherProvider, char[] cArr, onValueChanged onvaluechanged, DefaultConstructorMarker defaultConstructorMarker) {
        this(rsaCipherProvider, cArr, onvaluechanged);
    }

    private toPaintCap(RsaCipherProvider rsaCipherProvider, char[] cArr, onValueChanged onvaluechanged) {
        this.IAuthTabCallback = rsaCipherProvider;
        this.onExtraCallback = cArr;
        this.onNavigationEvent = onvaluechanged;
    }

    public /* bridge */ Void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Void voidIAuthTabCallback = super.IAuthTabCallback();
        int i4 = onTransact + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return voidIAuthTabCallback;
    }

    public /* bridge */ Void IAuthTabCallback(@NotNull BiometricPrompt.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            super.IAuthTabCallback(onextracallback);
            throw null;
        }
        Void voidIAuthTabCallback = super.IAuthTabCallback(onextracallback);
        int i3 = asInterface + 101;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return voidIAuthTabCallback;
    }

    public /* synthetic */ ResultData onExtraCallback() throws BadPaddingException, IllegalBlockSizeException {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IconRoundCornerProgressBar iconRoundCornerProgressBarOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onTransact + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iconRoundCornerProgressBarOnExtraCallbackWithResult;
    }

    public /* synthetic */ ResultData onExtraCallback(BiometricPrompt.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ResultData resultDataIAuthTabCallback = IAuthTabCallback(onextracallback);
        int i4 = onTransact + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return resultDataIAuthTabCallback;
    }

    public /* synthetic */ BiometricPrompt.IAuthTabCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BiometricPrompt.IAuthTabCallback IAuthTabCallback = IAuthTabCallback();
        int i4 = asInterface + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return IAuthTabCallback;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final toPaintCap onExtraCallback(@NotNull Context context, @Nullable String str, @NotNull char[] cArr, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(cArr, "");
            toPaintCap topaintcap = new toPaintCap(new RsaCipherProvider(context, str, z), cArr, new RememberLottieCompositionKtrememberLottieComposition1(), null);
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return topaintcap;
        }
    }

    public IconRoundCornerProgressBar onExtraCallbackWithResult() throws BadPaddingException, IllegalBlockSizeException {
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this.IAuthTabCallback.onWarmupCompleted().doFinal(RoundedCornersParser.IAuthTabCallback(this.onExtraCallback)));
        Intrinsics.checkNotNull(strOnExtraCallbackWithResult);
        IconRoundCornerProgressBar iconRoundCornerProgressBar = new IconRoundCornerProgressBar(strOnExtraCallbackWithResult);
        int i2 = asInterface + 27;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return iconRoundCornerProgressBar;
        }
        throw null;
    }
}
