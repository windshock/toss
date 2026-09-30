package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class mExternalSyntheticApiModelOutline0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final getSupportedHighSpeedResolutionsFor<setByteOrder> onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor<Float> onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor<Float> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 57;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof mExternalSyntheticApiModelOutline0)) {
            return false;
        }
        mExternalSyntheticApiModelOutline0 mexternalsyntheticapimodeloutline0 = (mExternalSyntheticApiModelOutline0) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, mexternalsyntheticapimodeloutline0.onNavigationEvent)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onWarmupCompleted, mexternalsyntheticapimodeloutline0.onWarmupCompleted))) {
            return Intrinsics.areEqual(this.onExtraCallback, mexternalsyntheticapimodeloutline0.onExtraCallback);
        }
        int i6 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode();
        int i4 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ComplexScriptResult(complexInAlpha=" + this.onNavigationEvent + ", complexOutAlpha=" + this.onWarmupCompleted + ", color=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public mExternalSyntheticApiModelOutline0(@NotNull getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor, @NotNull getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor2, @NotNull getSupportedHighSpeedResolutionsFor<setByteOrder> getsupportedhighspeedresolutionsfor3) {
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor2, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor3, "");
        this.onNavigationEvent = getsupportedhighspeedresolutionsfor;
        this.onWarmupCompleted = getsupportedhighspeedresolutionsfor2;
        this.onExtraCallback = getsupportedhighspeedresolutionsfor3;
    }

    public final getSupportedHighSpeedResolutionsFor<Float> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getSupportedHighSpeedResolutionsFor<Float> IAuthTabCallback() {
        getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            getsupportedhighspeedresolutionsfor = this.onWarmupCompleted;
            int i4 = 85 / 0;
        } else {
            getsupportedhighspeedresolutionsfor = this.onWarmupCompleted;
        }
        int i5 = i3 + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    public final getSupportedHighSpeedResolutionsFor<setByteOrder> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<setByteOrder> getsupportedhighspeedresolutionsfor = this.onExtraCallback;
        int i5 = i3 + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }
}
