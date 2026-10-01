package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ImageViewUtilsExternalSyntheticLambda0 implements ImageViewUtilsExternalSyntheticLambda1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Object IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;

    public ImageViewUtilsExternalSyntheticLambda0(boolean z, @NotNull getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri> getmemorymappingsorbuilder, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
        this.IAuthTabCallback = obj;
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getmemorymappingsorbuilder, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.ImageViewUtilsExternalSyntheticLambda1
    public Object IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.IAuthTabCallback;
        int i5 = i2 + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    @Override // o.ImageViewUtilsExternalSyntheticLambda1
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    @Override // o.ImageViewUtilsExternalSyntheticLambda1
    public getMemoryMappingsOrBuilder<setAndDownscaleImageUri> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(z);
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onExtraCallback(@NotNull getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri> getmemorymappingsorbuilder) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
            IAuthTabCallback(getmemorymappingsorbuilder);
        } else {
            Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
            IAuthTabCallback(getmemorymappingsorbuilder);
            int i3 = 39 / 0;
        }
    }

    private final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(Boolean.valueOf(z));
        } else {
            this.onExtraCallbackWithResult.IAuthTabCallback(Boolean.valueOf(z));
            throw null;
        }
    }

    private final getMemoryMappingsOrBuilder<setAndDownscaleImageUri> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return (getMemoryMappingsOrBuilder) this.onNavigationEvent.onExtraCallbackWithResult();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri> getmemorymappingsorbuilder) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.IAuthTabCallback(getmemorymappingsorbuilder);
            int i3 = onWarmupCompleted + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onNavigationEvent.IAuthTabCallback(getmemorymappingsorbuilder);
        throw null;
    }
}
