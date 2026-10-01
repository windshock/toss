package o;

import android.opengl.EGL14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class scrollTo {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private setOnFlingListener IAuthTabCallback;
    private int onExtraCallback;
    private setLayoutManager onNavigationEvent;
    private setOnScrollListener onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public scrollTo() {
        setOnScrollListener setonscrolllistener = null;
        this(setonscrolllistener, 0, 3, setonscrolllistener);
    }

    public scrollTo(@NotNull setOnScrollListener setonscrolllistener, int i2) {
        setLayoutManager setlayoutmanagerOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(setonscrolllistener, "");
        this.IAuthTabCallback = setLayoutFrozen.asBinder();
        this.onWarmupCompleted = setLayoutFrozen.IAuthTabCallbackStub();
        this.onExtraCallback = -1;
        setOnFlingListener setonflinglistener = new setOnFlingListener(EGL14.eglGetDisplay(0));
        this.IAuthTabCallback = setonflinglistener;
        if (setonflinglistener == setLayoutFrozen.asBinder()) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        if (!EGL14.eglInitialize(this.IAuthTabCallback.onExtraCallbackWithResult(), new int[1], 0, new int[1], 0)) {
            throw new RuntimeException("unable to initialize EGL14");
        }
        setAccessibilityDelegateCompat setaccessibilitydelegatecompat = new setAccessibilityDelegateCompat();
        boolean z = (i2 & 1) != 0;
        if ((i2 & 2) != 0 && (setlayoutmanagerOnExtraCallbackWithResult = setaccessibilitydelegatecompat.onExtraCallbackWithResult(this.IAuthTabCallback, 3, z)) != null) {
            setOnScrollListener setonscrolllistener2 = new setOnScrollListener(EGL14.eglCreateContext(this.IAuthTabCallback.onExtraCallbackWithResult(), setlayoutmanagerOnExtraCallbackWithResult.onExtraCallbackWithResult(), setonscrolllistener.IAuthTabCallback(), new int[]{setLayoutFrozen.IAuthTabCallback(), 3, setLayoutFrozen.IAuthTabCallbackDefault()}, 0));
            try {
                scrollByInternal.onExtraCallback("eglCreateContext (3)");
                this.onNavigationEvent = setlayoutmanagerOnExtraCallbackWithResult;
                this.onWarmupCompleted = setonscrolllistener2;
                this.onExtraCallback = 3;
            } catch (Exception unused) {
            }
        }
        if (this.onWarmupCompleted == setLayoutFrozen.IAuthTabCallbackStub()) {
            setLayoutManager setlayoutmanagerOnExtraCallbackWithResult2 = setaccessibilitydelegatecompat.onExtraCallbackWithResult(this.IAuthTabCallback, 2, z);
            if (setlayoutmanagerOnExtraCallbackWithResult2 == null) {
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
            setOnScrollListener setonscrolllistener3 = new setOnScrollListener(EGL14.eglCreateContext(this.IAuthTabCallback.onExtraCallbackWithResult(), setlayoutmanagerOnExtraCallbackWithResult2.onExtraCallbackWithResult(), setonscrolllistener.IAuthTabCallback(), new int[]{setLayoutFrozen.IAuthTabCallback(), 2, setLayoutFrozen.IAuthTabCallbackDefault()}, 0));
            scrollByInternal.onExtraCallback("eglCreateContext (2)");
            this.onNavigationEvent = setlayoutmanagerOnExtraCallbackWithResult2;
            this.onWarmupCompleted = setonscrolllistener3;
            this.onExtraCallback = 2;
        }
    }

    public /* synthetic */ scrollTo(setOnScrollListener setonscrolllistener, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? setLayoutFrozen.IAuthTabCallbackStub() : setonscrolllistener, (i3 & 2) != 0 ? 0 : i2);
    }

    public void onExtraCallback() {
        if (this.IAuthTabCallback != setLayoutFrozen.asBinder()) {
            EGL14.eglMakeCurrent(this.IAuthTabCallback.onExtraCallbackWithResult(), setLayoutFrozen.asInterface().onNavigationEvent(), setLayoutFrozen.asInterface().onNavigationEvent(), setLayoutFrozen.IAuthTabCallbackStub().IAuthTabCallback());
            EGL14.eglDestroyContext(this.IAuthTabCallback.onExtraCallbackWithResult(), this.onWarmupCompleted.IAuthTabCallback());
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.IAuthTabCallback.onExtraCallbackWithResult());
        }
        this.IAuthTabCallback = setLayoutFrozen.asBinder();
        this.onWarmupCompleted = setLayoutFrozen.IAuthTabCallbackStub();
        this.onNavigationEvent = null;
    }

    public final void IAuthTabCallback(@NotNull setItemViewCacheSize setitemviewcachesize) {
        Intrinsics.checkNotNullParameter(setitemviewcachesize, "");
        EGL14.eglDestroySurface(this.IAuthTabCallback.onExtraCallbackWithResult(), setitemviewcachesize.onNavigationEvent());
    }

    public final setItemViewCacheSize onNavigationEvent(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        int[] iArr = {setLayoutFrozen.IAuthTabCallbackDefault()};
        setOnFlingListener setonflinglistener = this.IAuthTabCallback;
        setLayoutManager setlayoutmanager = this.onNavigationEvent;
        Intrinsics.checkNotNull(setlayoutmanager);
        setItemViewCacheSize setitemviewcachesize = new setItemViewCacheSize(EGL14.eglCreateWindowSurface(setonflinglistener.onExtraCallbackWithResult(), setlayoutmanager.onExtraCallbackWithResult(), obj, iArr, 0));
        scrollByInternal.onExtraCallback("eglCreateWindowSurface");
        if (setitemviewcachesize != setLayoutFrozen.asInterface()) {
            return setitemviewcachesize;
        }
        throw new RuntimeException("surface was null");
    }

    public final void onWarmupCompleted(@NotNull setItemViewCacheSize setitemviewcachesize) {
        Intrinsics.checkNotNullParameter(setitemviewcachesize, "");
        setLayoutFrozen.asBinder();
        if (!EGL14.eglMakeCurrent(this.IAuthTabCallback.onExtraCallbackWithResult(), setitemviewcachesize.onNavigationEvent(), setitemviewcachesize.onNavigationEvent(), this.onWarmupCompleted.IAuthTabCallback())) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final boolean onExtraCallback(@NotNull setItemViewCacheSize setitemviewcachesize) {
        Intrinsics.checkNotNullParameter(setitemviewcachesize, "");
        return Intrinsics.areEqual(this.onWarmupCompleted, new setOnScrollListener(EGL14.eglGetCurrentContext())) && Intrinsics.areEqual(setitemviewcachesize, new setItemViewCacheSize(EGL14.eglGetCurrentSurface(setLayoutFrozen.onExtraCallbackWithResult())));
    }

    public final int onNavigationEvent(@NotNull setItemViewCacheSize setitemviewcachesize, int i2) {
        Intrinsics.checkNotNullParameter(setitemviewcachesize, "");
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.IAuthTabCallback.onExtraCallbackWithResult(), setitemviewcachesize.onNavigationEvent(), i2, iArr, 0);
        return iArr[0];
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
