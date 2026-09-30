package o;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hcExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private final String onExtraCallback;
    private final hbExternalSyntheticLambda9 onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Map<String, String> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ hcExternalSyntheticLambda0 onNavigationEvent(hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, String str, String str2, Map map, hbExternalSyntheticLambda9 hbexternalsyntheticlambda9, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 107;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = hcexternalsyntheticlambda0.onExtraCallback;
            int i6 = i4 + 17;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            str2 = hcexternalsyntheticlambda0.onNavigationEvent;
            int i8 = i4 + 113;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 4) != 0) {
            int i10 = i4 + 39;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            map = hcexternalsyntheticlambda0.onWarmupCompleted;
        }
        if ((i & 8) != 0) {
            hbexternalsyntheticlambda9 = hcexternalsyntheticlambda0.onExtraCallbackWithResult;
            int i12 = i4 + 19;
            IAuthTabCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
        }
        return hcexternalsyntheticlambda0.onWarmupCompleted(str, str2, map, hbexternalsyntheticlambda9);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof hcExternalSyntheticLambda0)) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 95;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 89;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 22 / 0;
            }
            return false;
        }
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0 = (hcExternalSyntheticLambda0) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, hcexternalsyntheticlambda0.onExtraCallback)) {
            int i9 = IAuthTabCallbackDefault + 13;
            IAuthTabCallback = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, hcexternalsyntheticlambda0.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, hcexternalsyntheticlambda0.onWarmupCompleted)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, hcexternalsyntheticlambda0.onExtraCallbackWithResult);
        }
        int i10 = IAuthTabCallbackDefault + 9;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 78 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.onExtraCallback.hashCode();
        int iHashCode2 = this.onNavigationEvent.hashCode();
        int iHashCode3 = this.onWarmupCompleted.hashCode();
        hbExternalSyntheticLambda9 hbexternalsyntheticlambda9 = this.onExtraCallbackWithResult;
        if (hbexternalsyntheticlambda9 == null) {
            i = 0;
        } else {
            int iHashCode4 = hbexternalsyntheticlambda9.hashCode();
            int i5 = IAuthTabCallbackDefault + 99;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode4;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
    }

    public final hcExternalSyntheticLambda0 onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, @Nullable hbExternalSyntheticLambda9 hbexternalsyntheticlambda9) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0 = new hcExternalSyntheticLambda0(str, str2, map, hbexternalsyntheticlambda9);
        int i2 = IAuthTabCallbackDefault + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return hcexternalsyntheticlambda0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnServiceBundleImportLazyParams(serviceBundleName=" + this.onExtraCallback + ", fallbackRoute=" + this.onNavigationEvent + ", routeParameters=" + this.onWarmupCompleted + ", fallbackEvent=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 13;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public hcExternalSyntheticLambda0(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, @Nullable hbExternalSyntheticLambda9 hbexternalsyntheticlambda9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallback = str;
        this.onNavigationEvent = str2;
        this.onWarmupCompleted = map;
        this.onExtraCallbackWithResult = hbexternalsyntheticlambda9;
        if (!n3.Companion.onExtraCallbackWithResult(str)) {
            throw new IllegalArgumentException("serviceBundleName must not be blank");
        }
        if (StringsKt.isBlank(str2)) {
            throw new IllegalArgumentException("fallbackRoute must not be blank");
        }
        int i = IAuthTabCallbackDefault + 85;
        IAuthTabCallback = i % 128;
        Object obj = null;
        if (i % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (hbexternalsyntheticlambda9 != null) {
            if (!Intrinsics.areEqual(hbexternalsyntheticlambda9.IAuthTabCallback(), str2)) {
                throw new IllegalArgumentException("fallbackEvent route must match fallbackRoute");
            }
            if (!Intrinsics.areEqual(hbexternalsyntheticlambda9.onExtraCallbackWithResult(), str)) {
                throw new IllegalArgumentException("fallbackEvent serviceBundleName must match serviceBundleName");
            }
        }
        int i2 = IAuthTabCallback + 23;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hcExternalSyntheticLambda0(String str, String str2, Map map, hbExternalSyntheticLambda9 hbexternalsyntheticlambda9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallback + 49;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                map = access8100.onNavigationEvent();
                int i3 = 2 % 2;
            } else {
                access8100.onNavigationEvent();
                throw null;
            }
        }
        if ((i & 8) != 0) {
            int i4 = IAuthTabCallback + 9;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            hbexternalsyntheticlambda9 = null;
        }
        this(str, str2, map, hbexternalsyntheticlambda9);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 91;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.onWarmupCompleted;
        int i5 = i3 + 69;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final hbExternalSyntheticLambda9 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        hbExternalSyntheticLambda9 hbexternalsyntheticlambda9 = this.onExtraCallbackWithResult;
        int i5 = i2 + 115;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return hbexternalsyntheticlambda9;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        hbExternalSyntheticLambda9 hbexternalsyntheticlambda9 = this.onExtraCallbackWithResult;
        if (hbexternalsyntheticlambda9 != null) {
            int i5 = i3 + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            String strOnExtraCallback = hbexternalsyntheticlambda9.onExtraCallback();
            if (strOnExtraCallback != null) {
                int i7 = IAuthTabCallbackDefault;
                int i8 = i7 + 23;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 23;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    return strOnExtraCallback;
                }
                throw null;
            }
        }
        return this.onNavigationEvent;
    }

    public final hcExternalSyntheticLambda0 onExtraCallbackWithResult(@Nullable hbExternalSyntheticLambda9 hbexternalsyntheticlambda9) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (hbexternalsyntheticlambda9 != null) {
            return onNavigationEvent(this, null, null, null, hbexternalsyntheticlambda9, 7, null);
        }
        int i4 = i3 + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }
}
