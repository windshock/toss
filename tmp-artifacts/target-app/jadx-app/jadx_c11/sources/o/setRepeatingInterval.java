package o;

import android.graphics.Paint;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class setRepeatingInterval implements setAdPositionBehavior {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Paint onExtraCallback;
    private SessionProcessorCaptureCallback onNavigationEvent;
    private final Exif1 onWarmupCompleted;

    public abstract void IAuthTabCallback_Parcel();

    public abstract rotate getInterfaceDescriptor();

    public abstract Paint onExtraCallbackWithResult();

    public setRepeatingInterval() {
        Exif1 exif1OnNavigationEvent = withType.onNavigationEvent();
        this.onWarmupCompleted = exif1OnNavigationEvent;
        this.onExtraCallback = exif1OnNavigationEvent.onExtraCallbackWithResult();
    }

    public final void onExtraCallback(@Nullable SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = sessionProcessorCaptureCallback;
        IAuthTabCallback_Parcel();
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        return r1.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r2 = r2 + 107;
        o.setRepeatingInterval.onExtraCallbackWithResult = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if ((r2 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        return 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float IAuthTabCallback() {
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            sessionProcessorCaptureCallback = this.onNavigationEvent;
            int i4 = 36 / 0;
        } else {
            sessionProcessorCaptureCallback = this.onNavigationEvent;
        }
    }

    public float onNavigationEvent() {
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            sessionProcessorCaptureCallback = this.onNavigationEvent;
            int i4 = 58 / 0;
            if (sessionProcessorCaptureCallback == null) {
                return 1.0f;
            }
        } else {
            sessionProcessorCaptureCallback = this.onNavigationEvent;
            if (sessionProcessorCaptureCallback == null) {
                return 1.0f;
            }
        }
        int i5 = i2 + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionProcessorCaptureCallback.onNavigationEvent();
        }
        sessionProcessorCaptureCallback.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long extraCallbackWithResult() {
        int i = 2 % 2;
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = this.onNavigationEvent;
        if (sessionProcessorCaptureCallback != null) {
            int i2 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return sessionProcessorCaptureCallback.onWarmupCompleted();
        }
        long jOnExtraCallback = setUseCaseDetached.Companion.onExtraCallback();
        int i4 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return jOnExtraCallback;
    }

    public final ExtensionsManagerExtensionsAvailability readTypedObject() {
        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailabilityOnExtraCallback;
        int i = 2 % 2;
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = this.onNavigationEvent;
        if (sessionProcessorCaptureCallback == null || (extensionsManagerExtensionsAvailabilityOnExtraCallback = sessionProcessorCaptureCallback.onExtraCallback()) == null) {
            return ExtensionsManagerExtensionsAvailability.Ltr;
        }
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return extensionsManagerExtensionsAvailabilityOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Exif1 ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Exif1 exif1 = this.onWarmupCompleted;
        int i5 = i3 + 85;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return exif1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Paint access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Paint paint = this.onExtraCallback;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return paint;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r1 = -access000();
        r2 = o.setRepeatingInterval.IAuthTabCallback + 1;
        o.setRepeatingInterval.onExtraCallbackWithResult = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        access000();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return access000();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (asBinder() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (asBinder() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r1 = o.setRepeatingInterval.IAuthTabCallback + 51;
        o.setRepeatingInterval.onExtraCallbackWithResult = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
    }

    public final boolean extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        boolean z = !(i2 % 2 != 0 ? access000() == 0.0f : access000() == 1.0f);
        int i3 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }
}
