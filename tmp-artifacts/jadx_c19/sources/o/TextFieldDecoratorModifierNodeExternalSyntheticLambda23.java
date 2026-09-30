package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.google.android.material.button.MaterialButton;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda23;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda23 {
    private static TextFieldDecoratorModifierNodeExternalSyntheticLambda23 onExtraCallback;
    private final Executor IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private final CopyOnWriteArrayList<onExtraCallbackWithResult> onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final Object onWarmupCompleted;

    public interface onExtraCallback {
        void onNetworkTypeChanged(int i2);
    }

    public static TextFieldDecoratorModifierNodeExternalSyntheticLambda23 onNavigationEvent(Context context) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda23 textFieldDecoratorModifierNodeExternalSyntheticLambda23;
        synchronized (TextFieldDecoratorModifierNodeExternalSyntheticLambda23.class) {
            if (onExtraCallback == null) {
                onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda23(context);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda23 = onExtraCallback;
        }
        return textFieldDecoratorModifierNodeExternalSyntheticLambda23;
    }

    private TextFieldDecoratorModifierNodeExternalSyntheticLambda23(final Context context) {
        Executor executorIAuthTabCallback = RecordingInputConnectionExternalSyntheticLambda0.IAuthTabCallback();
        this.IAuthTabCallback = executorIAuthTabCallback;
        this.onExtraCallbackWithResult = new CopyOnWriteArrayList<>();
        this.onWarmupCompleted = new Object();
        this.IAuthTabCallbackDefault = 0;
        executorIAuthTabCallback.execute(new Runnable() { // from class: androidx.media3.common.util.NetworkTypeObserver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onExtraCallback(context);
            }
        });
    }

    public void onNavigationEvent(onExtraCallback onextracallback, Executor executor) {
        boolean z;
        onWarmupCompleted();
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(onextracallback, executor);
        synchronized (this.onWarmupCompleted) {
            this.onExtraCallbackWithResult.add(onextracallbackwithresult);
            z = this.onNavigationEvent;
        }
        if (z) {
            onextracallbackwithresult.onExtraCallback();
        }
    }

    public int IAuthTabCallback() {
        int i2;
        synchronized (this.onWarmupCompleted) {
            i2 = this.IAuthTabCallbackDefault;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallback(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new onNavigationEvent(), intentFilter);
    }

    private void onWarmupCompleted() {
        Iterator<onExtraCallbackWithResult> it = this.onExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            onExtraCallbackWithResult next = it.next();
            if (next.IAuthTabCallback()) {
                this.onExtraCallbackWithResult.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(Context context) {
        int iOnWarmupCompleted = onWarmupCompleted(context);
        if (Build.VERSION.SDK_INT >= 31 && iOnWarmupCompleted == 5) {
            IAuthTabCallback.onExtraCallback(context, this);
        } else {
            IAuthTabCallback(iOnWarmupCompleted);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback(int i2) {
        onWarmupCompleted();
        synchronized (this.onWarmupCompleted) {
            if (this.onNavigationEvent && this.IAuthTabCallbackDefault == i2) {
                return;
            }
            this.onNavigationEvent = true;
            this.IAuthTabCallbackDefault = i2;
            Iterator<onExtraCallbackWithResult> it = this.onExtraCallbackWithResult.iterator();
            while (it.hasNext()) {
                it.next().onExtraCallback();
            }
        }
    }

    private static int onWarmupCompleted(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i2 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i2 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return IAuthTabCallback(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i2;
    }

    private static int IAuthTabCallback(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return Build.VERSION.SDK_INT >= 29 ? 9 : 0;
        }
    }

    public final class onNavigationEvent extends BroadcastReceiver {
        private onNavigationEvent() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda23.this.IAuthTabCallback.execute(new Runnable() { // from class: androidx.media3.common.util.NetworkTypeObserver$Receiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda23.this.onExtraCallbackWithResult(context);
                }
            });
        }
    }

    static final class IAuthTabCallback {
        public static void onExtraCallback(Context context, TextFieldDecoratorModifierNodeExternalSyntheticLambda23 textFieldDecoratorModifierNodeExternalSyntheticLambda23) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) RecordingInputConnection_androidKt.onExtraCallbackWithResult((TelephonyManager) context.getSystemService("phone"));
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda23);
                telephonyManager.registerTelephonyCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda23.IAuthTabCallback, onextracallbackwithresult);
                telephonyManager.unregisterTelephonyCallback(onextracallbackwithresult);
            } catch (RuntimeException unused) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda23.IAuthTabCallback(5);
            }
        }

        static final class onExtraCallbackWithResult extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            private final TextFieldDecoratorModifierNodeExternalSyntheticLambda23 onNavigationEvent;

            public onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda23 textFieldDecoratorModifierNodeExternalSyntheticLambda23) {
                this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda23;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.onNavigationEvent.IAuthTabCallback(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }
    }

    public final class onExtraCallbackWithResult {
        private final WeakReference<onExtraCallback> onExtraCallbackWithResult;
        private final Executor onWarmupCompleted;

        public onExtraCallbackWithResult(onExtraCallback onextracallback, Executor executor) {
            this.onExtraCallbackWithResult = new WeakReference<>(onextracallback);
            this.onWarmupCompleted = executor;
        }

        public boolean IAuthTabCallback() {
            return this.onExtraCallbackWithResult.get() == null;
        }

        public void onExtraCallback() {
            this.onWarmupCompleted.execute(new Runnable() { // from class: androidx.media3.common.util.NetworkTypeObserver$ListenerHolder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda23.onExtraCallbackWithResult.onExtraCallback(this.f$0);
                }
            });
        }

        public static /* synthetic */ void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) {
            onExtraCallback onextracallback = onextracallbackwithresult.onExtraCallbackWithResult.get();
            if (onextracallback != null) {
                onextracallback.onNetworkTypeChanged(TextFieldDecoratorModifierNodeExternalSyntheticLambda23.this.IAuthTabCallback());
            }
        }
    }
}
