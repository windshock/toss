package o;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setAccessibilityDelegateCompat {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public final setLayoutManager onExtraCallbackWithResult(@NotNull setOnFlingListener setonflinglistener, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(setonflinglistener, "");
        int[] iArrOnExtraCallback = onExtraCallback(i2, z);
        setLayoutManager[] setlayoutmanagerArr = new setLayoutManager[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(setonflinglistener.onExtraCallbackWithResult(), iArrOnExtraCallback, 0, eGLConfigArr, 0, 1, new int[1], 0);
        if (zEglChooseConfig) {
            IntIterator it = ArraysKt.getIndices(setlayoutmanagerArr).iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                EGLConfig eGLConfig = eGLConfigArr[iNextInt];
                setlayoutmanagerArr[iNextInt] = eGLConfig == null ? null : new setLayoutManager(eGLConfig);
            }
        }
        if (zEglChooseConfig) {
            return setlayoutmanagerArr[0];
        }
        return null;
    }

    public final int[] onExtraCallback(int i2, boolean z) {
        int iAccess000;
        if (i2 >= 3) {
            iAccess000 = setLayoutFrozen.access000() | setLayoutFrozen.IAuthTabCallbackStubProxy();
        } else {
            iAccess000 = setLayoutFrozen.access000();
        }
        int i3 = iAccess000;
        return new int[]{setLayoutFrozen.access100(), 8, setLayoutFrozen.onWarmupCompleted(), 8, setLayoutFrozen.onNavigationEvent(), 8, setLayoutFrozen.onExtraCallback(), 8, setLayoutFrozen.readTypedObject(), setLayoutFrozen.extraCallbackWithResult() | setLayoutFrozen.getInterfaceDescriptor(), setLayoutFrozen.IAuthTabCallback_Parcel(), i3, z ? 12610 : setLayoutFrozen.IAuthTabCallbackDefault(), z ? 1 : 0, setLayoutFrozen.IAuthTabCallbackDefault()};
    }
}
