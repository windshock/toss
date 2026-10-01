package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addLinks;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class toList extends createListItemDetailSpannedString implements optList {
    private static int asBinder = 1;
    private static int asInterface;
    private final getSupportedHighSpeedResolutions IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    public /* synthetic */ toList(setOnQueryTextListener setonquerytextlistener, float f, long j, long j2, List list, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(setonquerytextlistener, f, j, j2, list, z, z2);
    }

    @Override // o.optList
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i3 + 59;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private toList(setOnQueryTextListener setonquerytextlistener, float f, long j, long j2, List<? extends appendQueryParameters> list, boolean z, boolean z2) {
        super(0.0f, list, j2, addLinks.IAuthTabCallback.C0010IAuthTabCallback.onExtraCallbackWithResult, 1, null);
        Intrinsics.checkNotNullParameter(setonquerytextlistener, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = z2;
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setonquerytextlistener, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f);
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(j), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.optList
    public boolean IAuthTabCallback() {
        boolean zOnTransact;
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            zOnTransact = onTransact();
            int i3 = 16 / 0;
        } else {
            zOnTransact = onTransact();
        }
        int i4 = asInterface + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    @Override // o.optList
    public setOnQueryTextListener onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setOnQueryTextListener setonquerytextlistenerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = asBinder + 13;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return setonquerytextlistenerIAuthTabCallbackStub;
    }

    @Override // o.optList
    public float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder();
        }
        asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.optList
    public long onExtraCallback() {
        long jAsInterface;
        int i = 2 % 2;
        int i2 = asInterface + 41;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            jAsInterface = asInterface();
            int i3 = 8 / 0;
        } else {
            jAsInterface = asInterface();
        }
        int i4 = asBinder + 59;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return jAsInterface;
        }
        throw null;
    }

    public void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(z);
        int i4 = asBinder + 31;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean zBooleanValue = ((Boolean) this.onNavigationEvent.onExtraCallbackWithResult()).booleanValue();
            int i3 = asInterface + 97;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                return zBooleanValue;
            }
            obj.hashCode();
            throw null;
        }
        ((Boolean) this.onNavigationEvent.onExtraCallbackWithResult()).booleanValue();
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = asInterface + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private final setOnQueryTextListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return (setOnQueryTextListener) this.onWarmupCompleted.onExtraCallbackWithResult();
        }
        throw null;
    }

    private final float asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
        int i4 = asBinder + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final long asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) this.onExtraCallback.onExtraCallbackWithResult()).access100();
        int i4 = asBinder + 109;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return jAccess100;
    }
}
