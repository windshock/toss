package im.toss.rn.toss.core.common.util;

import androidx.lifecycle.LifecycleEventObserver;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossReactLifecycleEventEmitter implements LifecycleEventObserver {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Function1<String, Unit> onExtraCallback;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 2;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE.ordinal()] = 4;
                int i2 = onExtraCallbackWithResult + 93;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            onNavigationEvent = iArr;
            int i5 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    static {
        int i = IAuthTabCallback + 5;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TossReactLifecycleEventEmitter(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = function1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void onStateChanged(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        switch (IAuthTabCallback.onNavigationEvent[onextracallbackwithresult.ordinal()]) {
            case 1:
                str = "onCreate";
                break;
            case 2:
                str = "onStart";
                break;
            case 3:
                str = "onResume";
                break;
            case 4:
                int i2 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                str = "onPause";
                break;
            case 5:
                str = "onStop";
                break;
            case 6:
                str = "onDestroy";
                break;
            case 7:
                str = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (str != null) {
            int i4 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallback.invoke(str);
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final void onExtraCallback(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull TossReactLifecycleEventEmitter tossReactLifecycleEventEmitter) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Intrinsics.checkNotNullParameter(tossReactLifecycleEventEmitter, "");
                textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(tossReactLifecycleEventEmitter);
                throw null;
            }
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(tossReactLifecycleEventEmitter, "");
            textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(tossReactLifecycleEventEmitter);
            int i3 = onExtraCallback + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }
}
