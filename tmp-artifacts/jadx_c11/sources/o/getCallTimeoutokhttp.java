package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getCallTimeoutokhttp implements getConnectionPoolokhttp {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor<hasProvider> IAuthTabCallback;

    /* JADX WARN: Illegal instructions before constructor call */
    public getCallTimeoutokhttp() {
        hasProvider hasprovider = null;
        this(hasprovider, 1, hasprovider);
    }

    public getCallTimeoutokhttp(@Nullable hasProvider hasprovider) {
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(hasprovider, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getCallTimeoutokhttp(hasProvider hasprovider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            hasprovider = null;
        }
        this(hasprovider);
    }

    @Override // o.getFollowSslRedirectsokhttp
    public /* bridge */ void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onNavigationEvent(str);
        int i4 = onExtraCallback + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getSupportedHighSpeedResolutionsFor<hasProvider> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<hasProvider> getsupportedhighspeedresolutionsfor = this.IAuthTabCallback;
        int i5 = i3 + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    @Override // o.getFollowSslRedirectsokhttp
    public void onNavigationEvent(@Nullable hasProvider hasprovider) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted().IAuthTabCallback(hasprovider);
        int i4 = onExtraCallback + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
