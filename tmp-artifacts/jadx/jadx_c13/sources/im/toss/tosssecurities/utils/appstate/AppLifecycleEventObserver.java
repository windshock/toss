package im.toss.tosssecurities.utils.appstate;

import androidx.lifecycle.LifecycleEventObserver;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AppLifecycleEventObserver implements LifecycleEventObserver {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final onWarmupCompleted onExtraCallbackWithResult;
    private Boolean onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 1;
                int i = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP.ordinal()] = 2;
                int i4 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY.ordinal()] = 3;
                int i7 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallback = iArr;
        }
    }

    public interface onWarmupCompleted {
        void onExtraCallbackWithResult();

        void onWarmupCompleted();
    }

    public AppLifecycleEventObserver(@NotNull onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onExtraCallbackWithResult = onwarmupcompleted;
    }

    public void onStateChanged(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i2 = IAuthTabCallback.onExtraCallback[onextracallbackwithresult.ordinal()];
        if (i2 == 1) {
            Boolean bool = this.onWarmupCompleted;
            if (bool == null || Intrinsics.areEqual(bool, Boolean.TRUE)) {
                this.onExtraCallbackWithResult.onWarmupCompleted();
            }
            this.onWarmupCompleted = Boolean.FALSE;
            return;
        }
        int i3 = onNavigationEvent + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0 ? i2 != 2 : i2 != 2) {
            if (i2 != 3) {
                return;
            }
            textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(this);
        } else {
            this.onWarmupCompleted = Boolean.TRUE;
            this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 61;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }
}
