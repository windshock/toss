package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getListenerWrappers implements getTitleMarginEnd {
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private final DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final getCachingExecutorService asBinder;
    private final getConfiguration<Float> asInterface;
    private final boolean onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final skipBytes onNavigationEvent;
    private final toMetersPerSecond onTransact;
    private final DeviceQuirksExternalSyntheticLambda0 onWarmupCompleted;

    public /* synthetic */ getListenerWrappers(boolean z, boolean z2, toMetersPerSecond tometerspersecond, skipBytes skipbytes, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, tometerspersecond, skipbytes, j, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, getconfiguration, getcachingexecutorservice);
    }

    private getListenerWrappers(boolean z, boolean z2, toMetersPerSecond tometerspersecond, skipBytes skipbytes, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, getConfiguration<Float> getconfiguration, getCachingExecutorService getcachingexecutorservice) {
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda02, "");
        this.onExtraCallback = z;
        this.IAuthTabCallbackDefault = z2;
        this.onTransact = tometerspersecond;
        this.onNavigationEvent = skipbytes;
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = deviceQuirksExternalSyntheticLambda0;
        this.onWarmupCompleted = deviceQuirksExternalSyntheticLambda02;
        this.asInterface = getconfiguration;
        this.asBinder = getcachingexecutorservice;
    }

    public static final /* synthetic */ long onWarmupCompleted(getListenerWrappers getlistenerwrappers) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            long j = getlistenerwrappers.onExtraCallbackWithResult;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = getlistenerwrappers.onExtraCallbackWithResult;
        int i4 = i3 + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r1 r2
      0x002a: PHI (r1v5 boolean) = (r1v4 boolean), (r1v7 boolean) binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r2v3 boolean) = (r2v2 boolean), (r2v5 boolean) binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public modifyFpsForPreviewOnlyRepeating onWarmupCompleted(@NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda1 camera2CapturePipelineTorchTaskExternalSyntheticLambda1) {
        boolean z;
        boolean z2;
        skipBytes iAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, "");
            z = this.onExtraCallback;
            z2 = this.IAuthTabCallbackDefault;
            iAuthTabCallback = this.onNavigationEvent;
            int i3 = 4 / 0;
            if (iAuthTabCallback == null) {
                iAuthTabCallback = new IAuthTabCallback();
                int i4 = IAuthTabCallbackStub + 97;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, "");
            z = this.onExtraCallback;
            z2 = this.IAuthTabCallbackDefault;
            iAuthTabCallback = this.onNavigationEvent;
            if (iAuthTabCallback == null) {
            }
        }
        return new getLoadingListenerWrappers(z, z2, camera2CapturePipelineTorchTaskExternalSyntheticLambda1, iAuthTabCallback, this.onTransact, this.IAuthTabCallback, this.onWarmupCompleted, this.asInterface, this.asBinder);
    }

    static final class IAuthTabCallback implements skipBytes {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallback() {
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getListenerWrappers getlistenerwrappers = getListenerWrappers.this;
            if (i3 == 0) {
                return getListenerWrappers.onWarmupCompleted(getlistenerwrappers);
            }
            int i4 = 14 / 0;
            return getListenerWrappers.onWarmupCompleted(getlistenerwrappers);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r2 = r2 + 101;
        o.getListenerWrappers.IAuthTabCallbackStubProxy = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 87;
        o.getListenerWrappers.IAuthTabCallbackStubProxy = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        getConfiguration<Float> getconfiguration;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            getconfiguration = this.asInterface;
            int i4 = 35 / 0;
        } else {
            getconfiguration = this.asInterface;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getListenerWrappers)) {
            int i2 = IAuthTabCallbackStub + 77;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getListenerWrappers getlistenerwrappers = (getListenerWrappers) obj;
        if (!Intrinsics.areEqual(this.onTransact, getlistenerwrappers.onTransact)) {
            int i4 = IAuthTabCallbackStub + 101;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, getlistenerwrappers.onNavigationEvent)) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onExtraCallbackWithResult, getlistenerwrappers.onExtraCallbackWithResult)) {
            int i6 = IAuthTabCallbackStubProxy;
            int i7 = i6 + 75;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 95;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, getlistenerwrappers.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, getlistenerwrappers.onWarmupCompleted)) {
            int i11 = IAuthTabCallbackStubProxy + 9;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, getlistenerwrappers.asInterface)) {
            return false;
        }
        if (Intrinsics.areEqual(this.asBinder, getlistenerwrappers.asBinder)) {
            return true;
        }
        int i13 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackStubProxy = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }
}
