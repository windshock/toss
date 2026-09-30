package im.toss.features.ble.web;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import im.toss.features.ble.web.CheckBLEPermissionMessageHandler$BluetoothStateObserver$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.getValues;
import o.zzbb;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class CheckBLEPermissionMessageHandler$BluetoothStateObserver implements DefaultLifecycleObserver {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private final FragmentActivity onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final Function1<Boolean, Unit> onNavigationEvent;
    private final getValues onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(CheckBLEPermissionMessageHandler$BluetoothStateObserver checkBLEPermissionMessageHandler$BluetoothStateObserver, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(checkBLEPermissionMessageHandler$BluetoothStateObserver, z);
        int i4 = IAuthTabCallback + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return unitOnExtraCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckBLEPermissionMessageHandler$BluetoothStateObserver(@NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = fragmentActivity;
        this.onNavigationEvent = function1;
        this.onWarmupCompleted = new getValues(new CheckBLEPermissionMessageHandler$BluetoothStateObserver$.ExternalSyntheticLambda0(this));
    }

    public /* bridge */ void onCreate(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = IAuthTabCallbackDefault + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onDestroy(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onPause(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 57;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onResume(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(CheckBLEPermissionMessageHandler$BluetoothStateObserver checkBLEPermissionMessageHandler$BluetoothStateObserver, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        checkBLEPermissionMessageHandler$BluetoothStateObserver.onNavigationEvent.invoke(Boolean.valueOf(z));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.getLifecycle().onExtraCallbackWithResult(this);
        this.onExtraCallback.getLifecycle().IAuthTabCallback(this);
        int i4 = IAuthTabCallback + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onStart(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        super.onStart(textFieldScrollKtExternalSyntheticLambda0);
        if (this.onExtraCallbackWithResult) {
            return;
        }
        int i4 = IAuthTabCallbackDefault + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            zzbb.onWarmupCompleted(this.onWarmupCompleted, this.onExtraCallback, getValues.Companion.onWarmupCompleted(), 3);
            z = false;
        } else {
            zzbb.onWarmupCompleted(this.onWarmupCompleted, this.onExtraCallback, getValues.Companion.onWarmupCompleted(), 2);
            z = true;
        }
        this.onExtraCallbackWithResult = z;
    }

    public void onStop(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        super.onStop(textFieldScrollKtExternalSyntheticLambda0);
        if (this.onExtraCallbackWithResult) {
            int i2 = IAuthTabCallback + 95;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            zzbb.onWarmupCompleted(this.onWarmupCompleted, this.onExtraCallback);
            this.onExtraCallbackWithResult = false;
        }
        int i4 = IAuthTabCallback + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
