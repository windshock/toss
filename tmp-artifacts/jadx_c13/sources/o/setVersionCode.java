package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import o.setVersionCode;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class setVersionCode {
    private static int asBinder = 0;
    private static setVersionCode onExtraCallbackWithResult = null;
    private static int onTransact = 1;
    private onExtraCallback IAuthTabCallback;
    private onExtraCallback onNavigationEvent;
    private final Object onExtraCallback = new Object();
    private final Handler onWarmupCompleted = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: im.toss.uikit.widget.snackbar.SnackbarManager$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallback = setVersionCode.onExtraCallback(this.f$0, message);
            int i4 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return zOnExtraCallback;
            }
            throw null;
        }
    });

    public interface IAuthTabCallback {
        void onExtraCallback(int i);

        void onNavigationEvent();
    }

    public static /* synthetic */ boolean onExtraCallback(setVersionCode setversioncode, Message message) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return setversioncode.onWarmupCompleted(message);
        }
        setversioncode.onWarmupCompleted(message);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static setVersionCode onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
            if (onExtraCallbackWithResult == null) {
                onExtraCallbackWithResult = new setVersionCode();
                int i4 = asBinder + 41;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (onExtraCallbackWithResult == null) {
        }
        setVersionCode setversioncode = onExtraCallbackWithResult;
        int i6 = asBinder + 101;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return setversioncode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private setVersionCode() {
    }

    private /* synthetic */ boolean onWarmupCompleted(Message message) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (message.what == 0) {
            onNavigationEvent((onExtraCallback) message.obj);
            return true;
        }
        int i4 = onTransact + 7;
        asBinder = i4 % 128;
        return i4 % 2 != 0;
    }

    public void onExtraCallback(int i, IAuthTabCallback iAuthTabCallback) {
        synchronized (this.onExtraCallback) {
            if (asBinder(iAuthTabCallback)) {
                onExtraCallback onextracallback = this.IAuthTabCallback;
                onextracallback.IAuthTabCallback = i;
                this.onWarmupCompleted.removeCallbacksAndMessages(onextracallback);
                IAuthTabCallback(this.IAuthTabCallback);
                return;
            }
            if (asInterface(iAuthTabCallback)) {
                this.onNavigationEvent.IAuthTabCallback = i;
            } else {
                this.onNavigationEvent = new onExtraCallback(i, iAuthTabCallback);
            }
            onExtraCallback onextracallback2 = this.IAuthTabCallback;
            if (onextracallback2 == null || !onWarmupCompleted(onextracallback2, 4)) {
                this.IAuthTabCallback = null;
                onNavigationEvent();
            }
        }
    }

    public void onWarmupCompleted(IAuthTabCallback iAuthTabCallback, int i) {
        synchronized (this.onExtraCallback) {
            if (asBinder(iAuthTabCallback)) {
                onWarmupCompleted(this.IAuthTabCallback, i);
            } else if (asInterface(iAuthTabCallback)) {
                onWarmupCompleted(this.onNavigationEvent, i);
            }
        }
    }

    public void onWarmupCompleted(IAuthTabCallback iAuthTabCallback) {
        synchronized (this.onExtraCallback) {
            if (asBinder(iAuthTabCallback)) {
                this.IAuthTabCallback = null;
                if (this.onNavigationEvent != null) {
                    onNavigationEvent();
                }
            }
        }
    }

    public void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) {
        synchronized (this.onExtraCallback) {
            if (asBinder(iAuthTabCallback)) {
                IAuthTabCallback(this.IAuthTabCallback);
            }
        }
    }

    public void IAuthTabCallback(IAuthTabCallback iAuthTabCallback) {
        synchronized (this.onExtraCallback) {
            if (asBinder(iAuthTabCallback)) {
                onExtraCallback onextracallback = this.IAuthTabCallback;
                if (!onextracallback.onNavigationEvent) {
                    onextracallback.onNavigationEvent = true;
                    this.onWarmupCompleted.removeCallbacksAndMessages(onextracallback);
                }
            }
        }
    }

    public void IAuthTabCallbackStub(IAuthTabCallback iAuthTabCallback) {
        synchronized (this.onExtraCallback) {
            if (asBinder(iAuthTabCallback)) {
                onExtraCallback onextracallback = this.IAuthTabCallback;
                if (onextracallback.onNavigationEvent) {
                    onextracallback.onNavigationEvent = false;
                    IAuthTabCallback(onextracallback);
                }
            }
        }
    }

    public boolean onExtraCallback(IAuthTabCallback iAuthTabCallback) {
        boolean zAsBinder;
        synchronized (this.onExtraCallback) {
            zAsBinder = asBinder(iAuthTabCallback);
        }
        return zAsBinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNavigationEvent(IAuthTabCallback iAuthTabCallback) {
        boolean z;
        synchronized (this.onExtraCallback) {
            if (!asBinder(iAuthTabCallback)) {
                z = asInterface(iAuthTabCallback);
            }
        }
        return z;
    }

    static class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int IAuthTabCallback;
        final WeakReference<IAuthTabCallback> onExtraCallbackWithResult;
        boolean onNavigationEvent;

        onExtraCallback(int i, IAuthTabCallback iAuthTabCallback) {
            this.onExtraCallbackWithResult = new WeakReference<>(iAuthTabCallback);
            this.IAuthTabCallback = i;
        }

        boolean IAuthTabCallback(@Nullable IAuthTabCallback iAuthTabCallback) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (iAuthTabCallback == null) {
                return false;
            }
            int i5 = i2 + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (this.onExtraCallbackWithResult.get() != iAuthTabCallback) {
                return false;
            }
            int i7 = onExtraCallback;
            int i8 = i7 + 29;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 103;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        onExtraCallback onextracallback = this.onNavigationEvent;
        if (onextracallback != null) {
            int i2 = asBinder + 73;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback = onextracallback;
            this.onNavigationEvent = null;
            IAuthTabCallback iAuthTabCallback = onextracallback.onExtraCallbackWithResult.get();
            if (iAuthTabCallback != null) {
                iAuthTabCallback.onNavigationEvent();
                return;
            }
            this.IAuthTabCallback = null;
            int i4 = asBinder + 43;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private boolean onWarmupCompleted(@NonNull onExtraCallback onextracallback, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 71;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback iAuthTabCallback = onextracallback.onExtraCallbackWithResult.get();
        if (iAuthTabCallback == null) {
            return false;
        }
        int i5 = asBinder + 115;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        this.onWarmupCompleted.removeCallbacksAndMessages(onextracallback);
        iAuthTabCallback.onExtraCallback(i);
        return true;
    }

    private boolean asBinder(IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        onExtraCallback onextracallback = this.IAuthTabCallback;
        if (onextracallback == null || !onextracallback.IAuthTabCallback(iAuthTabCallback)) {
            return false;
        }
        int i3 = asBinder + 111;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.setVersionCode$onExtraCallback) = (r1v4 o.setVersionCode$onExtraCallback), (r1v8 o.setVersionCode$onExtraCallback) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean asInterface(IAuthTabCallback iAuthTabCallback) {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onextracallback = this.onNavigationEvent;
            int i3 = 58 / 0;
            if (onextracallback != null) {
                if (onextracallback.IAuthTabCallback(iAuthTabCallback)) {
                    int i4 = asBinder + 73;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else {
            onextracallback = this.onNavigationEvent;
            if (onextracallback != null) {
            }
        }
        int i6 = onTransact + 89;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    private void IAuthTabCallback(@NonNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onextracallback.IAuthTabCallback;
        if (i2 != -2) {
            if (i2 <= 0) {
                int i3 = onTransact;
                int i4 = i3 + 49;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                if (i2 == -1) {
                    int i6 = i3 + 55;
                    asBinder = i6 % 128;
                    i2 = i6 % 2 != 0 ? 6420 : 1500;
                } else {
                    i2 = 2750;
                }
            }
            this.onWarmupCompleted.removeCallbacksAndMessages(onextracallback);
            Handler handler = this.onWarmupCompleted;
            handler.sendMessageDelayed(Message.obtain(handler, 0, onextracallback), i2);
            return;
        }
        int i7 = asBinder + 59;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    void onNavigationEvent(@NonNull onExtraCallback onextracallback) {
        synchronized (this.onExtraCallback) {
            if (this.IAuthTabCallback == onextracallback || this.onNavigationEvent == onextracallback) {
                onWarmupCompleted(onextracallback, 2);
            }
        }
    }
}
