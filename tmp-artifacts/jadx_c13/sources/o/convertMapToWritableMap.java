package o;

import android.view.Choreographer;
import android.view.animation.Interpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class convertMapToWritableMap {
    public static final convertMapToWritableMap IAuthTabCallback = new convertMapToWritableMap();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 37;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
    }

    private convertMapToWritableMap() {
    }

    public static /* synthetic */ MiniAppBundleLoader_importLazy onExtraCallbackWithResult(convertMapToWritableMap convertmaptowritablemap, Choreographer choreographer, long j, Interpolator interpolator, long j2, float f, Function1 function1, Function0 function0, int i, Object obj) {
        long j3;
        float f2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 65;
            int i7 = i6 % 128;
            onWarmupCompleted = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 5;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            j3 = 0;
        } else {
            j3 = j2;
        }
        if ((i & 8) != 0) {
            int i11 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            f2 = 0.0f;
        } else {
            f2 = f;
        }
        return convertmaptowritablemap.onWarmupCompleted(choreographer, j, interpolator, j3, f2, function1, (i & 32) != 0 ? null : function0);
    }

    public static final class IAuthTabCallback implements MiniAppBundleLoader_importLazy {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallback_Parcel = 1;
        final /* synthetic */ Interpolator IAuthTabCallback;
        final /* synthetic */ Choreographer IAuthTabCallbackStub;
        final /* synthetic */ float asBinder;
        private boolean asInterface = true;
        final /* synthetic */ long onExtraCallback;
        final /* synthetic */ Function0<Unit> onExtraCallbackWithResult;
        final /* synthetic */ Function1<Float, Unit> onNavigationEvent;
        final /* synthetic */ long onTransact;
        final /* synthetic */ long onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(long j, long j2, Interpolator interpolator, float f, Function1<? super Float, Unit> function1, Choreographer choreographer, long j3, Function0<Unit> function0) {
            this.onTransact = j;
            this.onExtraCallback = j2;
            this.IAuthTabCallback = interpolator;
            this.asBinder = f;
            this.onNavigationEvent = function1;
            this.IAuthTabCallbackStub = choreographer;
            this.onWarmupCompleted = j3;
            this.onExtraCallbackWithResult = function0;
        }

        @Override // o.MiniAppBundleLoader_importLazy
        public boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 87;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.asInterface;
            int i5 = i2 + 69;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        @Override // o.MiniAppBundleLoader_importLazy
        public void onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 85;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            this.asInterface = z;
            if (i3 != 0) {
                throw null;
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 67;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            float interpolation = this.IAuthTabCallback.getInterpolation(Math.min(1.0f, ((System.nanoTime() - this.onTransact) / 1000000) / this.onExtraCallback));
            float f = this.asBinder;
            float f2 = f + ((1.0f - f) * interpolation);
            this.onNavigationEvent.invoke(Float.valueOf(f2));
            if (f2 < 1.0f) {
                this.IAuthTabCallbackStub.postFrameCallbackDelayed(this, this.onWarmupCompleted);
                onNavigationEvent(true);
                int i4 = IAuthTabCallbackDefault + 37;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            Function0<Unit> function0 = this.onExtraCallbackWithResult;
            if (function0 != null) {
                int i6 = IAuthTabCallbackDefault + 35;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    function0.invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                function0.invoke();
            }
            this.IAuthTabCallbackStub.removeFrameCallback(this);
            onNavigationEvent(false);
        }
    }

    public final MiniAppBundleLoader_importLazy onWarmupCompleted(@NotNull Choreographer choreographer, long j, @NotNull Interpolator interpolator, long j2, float f, @NotNull Function1<? super Float, Unit> function1, @Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(choreographer, "");
        Intrinsics.checkNotNullParameter(interpolator, "");
        Intrinsics.checkNotNullParameter(function1, "");
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(System.nanoTime(), j, interpolator, f, function1, choreographer, j2, function0);
        choreographer.postFrameCallback(iAuthTabCallback);
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    public final void IAuthTabCallback(@NotNull Choreographer choreographer, @NotNull MiniAppBundleLoader_importLazy miniAppBundleLoader_importLazy) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(choreographer, "");
        Intrinsics.checkNotNullParameter(miniAppBundleLoader_importLazy, "");
        miniAppBundleLoader_importLazy.onNavigationEvent(false);
        choreographer.removeFrameCallback(miniAppBundleLoader_importLazy);
        int i4 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
