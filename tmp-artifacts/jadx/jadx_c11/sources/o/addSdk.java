package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.addSdk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface addSdk {
    public static final onExtraCallback Companion = onExtraCallback.onNavigationEvent;

    public interface IAuthTabCallback {
        addSdk Nullable();
    }

    Dialog onNavigationEvent(@NotNull Throwable th, @Nullable Context context, boolean z, @Nullable Function0<Unit> function0, @Nullable Function1<? super DialogInterface, Unit> function1);

    static /* synthetic */ Dialog onExtraCallbackWithResult(addSdk addsdk, Throwable th, Context context, boolean z, Function0 function0, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlertOrToast");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return addsdk.onNavigationEvent(th, context, z, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function1);
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int asBinder = 1;
        private static int onExtraCallback;
        private static int onWarmupCompleted;
        static final /* synthetic */ onExtraCallback onNavigationEvent = new onExtraCallback();
        private static final Lazy<addSdk> onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.error.ErrorHandleHelper$Companion$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 113;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return addSdk.onExtraCallback.onNavigationEvent();
                }
                addSdk.onExtraCallback.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });

        public static /* synthetic */ addSdk onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            addSdk addsdkOnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return addsdkOnExtraCallback;
        }

        private onExtraCallback() {
        }

        static {
            int i = onExtraCallback + 49;
            asBinder = i % 128;
            if (i % 2 == 0) {
                int i2 = 85 / 0;
            }
        }

        public final addSdk onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            addSdk addsdk = (addSdk) onExtraCallbackWithResult.getValue();
            int i4 = IAuthTabCallback + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return addsdk;
        }

        private static final addSdk onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            addSdk addsdkNullable = ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).Nullable();
            int i4 = IAuthTabCallback + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return addsdkNullable;
        }

        public final addSdk IAuthTabCallback(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Response response = Response.onNavigationEvent;
            addSdk addsdkNullable = ((IAuthTabCallback) Response.onExtraCallback(context, IAuthTabCallback.class)).Nullable();
            int i4 = IAuthTabCallback + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return addsdkNullable;
        }
    }
}
