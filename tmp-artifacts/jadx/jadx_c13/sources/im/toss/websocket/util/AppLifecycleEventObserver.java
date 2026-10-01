package im.toss.websocket.util;

import androidx.lifecycle.LifecycleEventObserver;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AppLifecycleEventObserver implements LifecycleEventObserver {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final onExtraCallbackWithResult onExtraCallback;
    private Boolean onExtraCallbackWithResult;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 1;
                int i = onWarmupCompleted + 65;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP.ordinal()] = 2;
                int i4 = onWarmupCompleted + 71;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY.ordinal()] = 3;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public interface onExtraCallbackWithResult {
        void onWarmupCompleted();
    }

    public AppLifecycleEventObserver(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onExtraCallback = onextracallbackwithresult;
    }

    public void onStateChanged(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i4 = IAuthTabCallback.onExtraCallbackWithResult[onextracallbackwithresult.ordinal()];
        if (i4 == 1) {
            Boolean bool = this.onExtraCallbackWithResult;
            if (bool == null || Intrinsics.areEqual(bool, Boolean.TRUE)) {
                this.onExtraCallback.onWarmupCompleted();
            }
            this.onExtraCallbackWithResult = Boolean.FALSE;
            return;
        }
        int i5 = onNavigationEvent + 7;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        if (i4 == 2) {
            this.onExtraCallbackWithResult = Boolean.TRUE;
        } else {
            if (i4 != 3) {
                return;
            }
            textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(this);
            int i7 = onNavigationEvent + 17;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
    }
}
