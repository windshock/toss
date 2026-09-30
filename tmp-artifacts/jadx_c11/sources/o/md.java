package o;

import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.mExternalSyntheticApiModelOutline1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class md implements mExternalSyntheticApiModelOutline1.onTransact {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private WeakReference<List<SurfaceProcessorNodeOut>> IAuthTabCallback = new WeakReference<>(null);
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    @Override // o.mExternalSyntheticApiModelOutline1.onTransact
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent IAuthTabCallback(@NotNull List<SurfaceProcessorNodeOut> list, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (Intrinsics.areEqual(this.IAuthTabCallback.get(), list)) {
            return onExtraCallbackWithResult(i);
        }
        this.IAuthTabCallback = new WeakReference<>(list);
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = onExtraCallback + 25;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            SurfaceProcessorNodeOut surfaceProcessorNodeOut = list.get(i5);
            if (surfaceProcessorNodeOut != null) {
                int i8 = onExtraCallback + 21;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                long jAsBinder = surfaceProcessorNodeOut.asBinder();
                iMax = Math.max(iMax, (int) (jAsBinder >> 32));
                iMax2 = Math.max(iMax2, (int) (4294967295L & jAsBinder));
            }
        }
        if (iMax > 0) {
            int i10 = onExtraCallback;
            int i11 = i10 + 103;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 72 / 0;
                if (iMax2 > 0) {
                    int i13 = i10 + 7;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    onExtraCallbackWithResult(ExtensionsManager1.onWarmupCompleted((iMax << 32) | (iMax2 & 4294967295L)));
                } else {
                    this.IAuthTabCallback.clear();
                }
            } else if (iMax2 > 0) {
            }
        }
        Object obj = null;
        mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationevent = new mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent(onExtraCallback(), false, null);
        int i15 = onExtraCallback + 55;
        onWarmupCompleted = i15 % 128;
        if (i15 % 2 != 0) {
            return onnavigationevent;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onExtraCallbackWithResult(int i) {
        long jOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<SurfaceProcessorNodeOut> list = this.IAuthTabCallback.get();
        Object obj = null;
        if (list != null) {
            int i5 = onExtraCallback + 65;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) CollectionsKt.getOrNull(list, i);
            if (surfaceProcessorNodeOut != null) {
                int i7 = onWarmupCompleted + 115;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    surfaceProcessorNodeOut.asBinder();
                    obj.hashCode();
                    throw null;
                }
                jOnNavigationEvent = surfaceProcessorNodeOut.asBinder();
                int i8 = onWarmupCompleted + 89;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                jOnNavigationEvent = ExtensionsManager1.Companion.onNavigationEvent();
            }
        }
        return new mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent(jOnNavigationEvent, true, null);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            long jOnExtraCallbackWithResult = ((ExtensionsManager1) this.onNavigationEvent.onExtraCallbackWithResult()).onExtraCallbackWithResult();
            int i3 = onExtraCallback + 125;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return jOnExtraCallbackWithResult;
        }
        ((ExtensionsManager1) this.onNavigationEvent.onExtraCallbackWithResult()).onExtraCallbackWithResult();
        throw null;
    }

    public final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
            int i3 = onWarmupCompleted + 77;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.onNavigationEvent.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
        obj.hashCode();
        throw null;
    }
}
