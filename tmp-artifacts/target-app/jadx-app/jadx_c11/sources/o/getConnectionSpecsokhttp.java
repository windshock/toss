package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getConnectionSpecsokhttp implements connectTimeout {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final getSupportedHighSpeedResolutionsFor<setByteOrder> onNavigationEvent;

    public /* synthetic */ getConnectionSpecsokhttp(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private getConnectionSpecsokhttp(long j) {
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(j), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.getNetworkInterceptorsokhttp
    public /* bridge */ void onNavigationEvent(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onNavigationEvent(num);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getSupportedHighSpeedResolutionsFor<setByteOrder> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<setByteOrder> getsupportedhighspeedresolutionsfor = this.onNavigationEvent;
        int i5 = i3 + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    @Override // o.getNetworkInterceptorsokhttp
    public void onExtraCallbackWithResult(@Nullable setByteOrder setbyteorder) {
        long jOnTransact;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<setByteOrder> getsupportedhighspeedresolutionsforIAuthTabCallback = IAuthTabCallback();
        if (setbyteorder != null) {
            int i4 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                setbyteorder.access100();
                throw null;
            }
            jOnTransact = setbyteorder.access100();
        } else {
            jOnTransact = setByteOrder.Companion.onTransact();
        }
        getsupportedhighspeedresolutionsforIAuthTabCallback.IAuthTabCallback(setByteOrder.onNavigationEvent(jOnTransact));
    }
}
