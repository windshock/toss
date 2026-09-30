package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addLinks;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class createListItemDetailSpannedString implements defaultIfEmpty {
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent;
    private final getSupportedHighSpeedResolutions IAuthTabCallback;
    private final addLinks.IAuthTabCallback onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    public /* synthetic */ createListItemDetailSpannedString(float f, List list, long j, addLinks.IAuthTabCallback iAuthTabCallback, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, list, j, iAuthTabCallback);
    }

    private createListItemDetailSpannedString(float f, List<? extends appendQueryParameters> list, long j, addLinks.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onExtraCallback = iAuthTabCallback;
        this.IAuthTabCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(j), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(list, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ createListItemDetailSpannedString(float f, List list, long j, addLinks.IAuthTabCallback iAuthTabCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackDefault + 75;
            onNavigationEvent = i2 % 128;
            f = i2 % 2 != 0 ? 2.0f : 1.0f;
            int i3 = 2 % 2;
        }
        float f2 = f;
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 39;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                listEmptyList = CollectionsKt.emptyList();
                int i5 = 32 / 0;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            list = listEmptyList;
            int i6 = 2 % 2;
        }
        this(f2, list, j, iAuthTabCallback, null);
    }

    @Override // o.defaultIfEmpty
    public addLinks.IAuthTabCallback IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.defaultIfEmpty
    public float getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.defaultIfEmpty
    public long access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    public void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(f);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        int i5 = onNavigationEvent + 93;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.defaultIfEmpty
    public List<appendQueryParameters> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@NotNull List<? extends appendQueryParameters> list) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            onWarmupCompleted(list);
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            onWarmupCompleted(list);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(j);
        int i4 = IAuthTabCallbackDefault + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback.onNavigationEvent();
        }
        this.IAuthTabCallback.onNavigationEvent();
        throw null;
    }

    private final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onNavigationEvent(f);
        int i4 = onNavigationEvent + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) this.onWarmupCompleted.onExtraCallbackWithResult()).access100();
        int i4 = onNavigationEvent + 111;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return jAccess100;
    }

    private final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.IAuthTabCallback(setByteOrder.onNavigationEvent(j));
            return;
        }
        this.onWarmupCompleted.IAuthTabCallback(setByteOrder.onNavigationEvent(j));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final List<appendQueryParameters> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
            return (List) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        return (List) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    private final void onWarmupCompleted(List<? extends appendQueryParameters> list) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback(list);
        int i4 = onNavigationEvent + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
