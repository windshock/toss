package o;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ALCCamera$IAuthTabCallback extends CustomTabsServiceConnection {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private Function1<? super Boolean, Unit> onExtraCallback;

    /* JADX WARN: Illegal instructions before constructor call */
    public ALCCamera$IAuthTabCallback() {
        Function1 function1 = null;
        this(function1, 1, function1);
    }

    public ALCCamera$IAuthTabCallback(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onExtraCallback = function1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ALCCamera$IAuthTabCallback(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 1;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            function1 = null;
        }
        this(function1);
    }

    public final void IAuthTabCallback(@Nullable Function1<? super Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = function1;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
    }

    public static final class onExtraCallbackWithResult extends CustomTabsCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ removeMenuProvider IAuthTabCallback;

        onExtraCallbackWithResult(removeMenuProvider removemenuprovider) {
            this.IAuthTabCallback = removemenuprovider;
        }

        public void onNavigationEvent(int i, Bundle bundle) {
            int i2 = 2 % 2;
            if (!Intrinsics.areEqual(ALCCamera.onNavigationEvent(), ALCCamera$IAuthTabCallback.this)) {
                ALCCamera.onExtraCallback();
                Objects.toString(this.IAuthTabCallback);
                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CustomTabsSession", "ignore onNavigationEvent", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("navigationEvent", Integer.valueOf(i)), getWrite.IAuthTabCallback("client", this.IAuthTabCallback), getWrite.IAuthTabCallback("connection", ALCCamera.onNavigationEvent()), getWrite.IAuthTabCallback("this", ALCCamera$IAuthTabCallback.this)}), (String) null, false, (String) null, 56, (Object) null);
                return;
            }
            if (i == 5) {
                ALCCamera.onExtraCallback();
                Objects.toString(this.IAuthTabCallback);
                ALCCamera.IAuthTabCallback().onExtraCallback(getWrite.IAuthTabCallback(Boolean.TRUE, "TAB_SHOWN"));
                return;
            }
            int i3 = onWarmupCompleted + 17;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (i != 6) {
                return;
            }
            ALCCamera.onExtraCallback();
            Objects.toString(this.IAuthTabCallback);
            ALCCamera.IAuthTabCallback().onExtraCallback(getWrite.IAuthTabCallback(Boolean.FALSE, "TAB_HIDDEN"));
            int i5 = onWarmupCompleted + 69;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    public void onCustomTabsServiceConnected(@NotNull ComponentName componentName, @NotNull removeMenuProvider removemenuprovider) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(componentName, "");
        Intrinsics.checkNotNullParameter(removemenuprovider, "");
        ALCCamera.onExtraCallback();
        Objects.toString(removemenuprovider);
        ALCCamera.onWarmupCompleted(removemenuprovider.onWarmupCompleted(new onExtraCallbackWithResult(removemenuprovider)));
        Function1<? super Boolean, Unit> function1 = this.onExtraCallback;
        if (function1 != null) {
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(Boolean.TRUE);
        }
        int i4 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onServiceDisconnected(@Nullable ComponentName componentName) {
        int i = 2 % 2;
        ALCCamera.onExtraCallback();
        Objects.toString(componentName);
        ALCCamera.IAuthTabCallback().onExtraCallback(getWrite.IAuthTabCallback(Boolean.FALSE, "onServiceDisconnected"));
        ALCCamera.onWarmupCompleted((removeOnNewIntentListener) null);
        ALCCamera aLCCamera = ALCCamera.onWarmupCompleted;
        ALCCamera.IAuthTabCallback((ALCCamera$IAuthTabCallback) null);
        this.onExtraCallback = null;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }
}
