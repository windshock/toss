package o;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class releaseWaiters {
    public static final boolean IAuthTabCallback;
    private static final File onExtraCallback;
    public static final boolean onExtraCallbackWithResult;
    private static volatile releaseWaiters onNavigationEvent;
    private static volatile int onWarmupCompleted;
    private int IAuthTabCallbackStub;
    private final int getInterfaceDescriptor;
    private final int onTransact;
    private boolean asBinder = true;
    private final AtomicBoolean asInterface = new AtomicBoolean(false);
    private final boolean IAuthTabCallbackDefault = onExtraCallbackWithResult();

    static {
        int i2 = Build.VERSION.SDK_INT;
        IAuthTabCallback = i2 < 29;
        onExtraCallbackWithResult = i2 >= 26;
        onExtraCallback = new File("/proc/self/fd");
        onWarmupCompleted = -1;
    }

    public static releaseWaiters onNavigationEvent() {
        if (onNavigationEvent == null) {
            synchronized (releaseWaiters.class) {
                if (onNavigationEvent == null) {
                    onNavigationEvent = new releaseWaiters();
                }
            }
        }
        return onNavigationEvent;
    }

    releaseWaiters() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.getInterfaceDescriptor = 20000;
            this.onTransact = 0;
        } else {
            this.getInterfaceDescriptor = 700;
            this.onTransact = 128;
        }
    }

    public boolean IAuthTabCallback(int i2, int i3, boolean z, boolean z2) {
        int i4;
        return z && this.IAuthTabCallbackDefault && onExtraCallbackWithResult && !onExtraCallback() && !z2 && i2 >= (i4 = this.onTransact) && i3 >= i4 && IAuthTabCallback();
    }

    private boolean onExtraCallback() {
        return IAuthTabCallback && !this.asInterface.get();
    }

    boolean onExtraCallback(int i2, int i3, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zIAuthTabCallback = IAuthTabCallback(i2, i3, z, z2);
        if (zIAuthTabCallback) {
            options.inPreferredConfig = EncoderProfilesProxyCompatBaseImpl.onExtraCallback();
            options.inMutable = false;
        }
        return zIAuthTabCallback;
    }

    private static boolean onExtraCallbackWithResult() {
        return (onTransact() || IAuthTabCallbackStub()) ? false : true;
    }

    private static boolean IAuthTabCallbackStub() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    private static boolean onTransact() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private int onWarmupCompleted() {
        if (onWarmupCompleted != -1) {
            return onWarmupCompleted;
        }
        return this.getInterfaceDescriptor;
    }

    private boolean IAuthTabCallback() {
        boolean z;
        synchronized (this) {
            int i2 = this.IAuthTabCallbackStub + 1;
            this.IAuthTabCallbackStub = i2;
            if (i2 >= 50) {
                this.IAuthTabCallbackStub = 0;
                boolean z2 = ((long) onExtraCallback.list().length) < ((long) onWarmupCompleted());
                this.asBinder = z2;
                if (!z2) {
                    Log.isLoggable("Downsampler", 5);
                }
            }
            z = this.asBinder;
        }
        return z;
    }
}
