package o;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetAttributeExtension {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final boolean IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final Map<String, Object> onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final AFj1nSDK4 onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAttributeExtension)) {
            int i2 = asBinder + 33;
            IAuthTabCallbackDefault = i2 % 128;
            return i2 % 2 != 0;
        }
        GetAttributeExtension getAttributeExtension = (GetAttributeExtension) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, getAttributeExtension.IAuthTabCallbackStub) || this.onWarmupCompleted != getAttributeExtension.onWarmupCompleted || this.onExtraCallbackWithResult != getAttributeExtension.onExtraCallbackWithResult) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, getAttributeExtension.onExtraCallback)) {
            int i3 = IAuthTabCallbackDefault + 71;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = IAuthTabCallbackDefault + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asBinder = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (str = this.IAuthTabCallbackStub) != null : (str = this.IAuthTabCallbackStub) != null) ? str.hashCode() : 0;
        int iHashCode3 = this.onWarmupCompleted.hashCode();
        int iHashCode4 = Boolean.hashCode(this.onExtraCallbackWithResult);
        Map<String, Object> map = this.onExtraCallback;
        if (map != null) {
            int i3 = IAuthTabCallbackDefault + 123;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int iHashCode5 = map.hashCode();
                int i4 = 86 / 0;
                iHashCode = iHashCode5;
            } else {
                iHashCode = map.hashCode();
            }
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverlayLogItem(screenId=" + this.IAuthTabCallbackStub + ", logVersion=" + this.onWarmupCompleted + ", isScreenLog=" + this.onExtraCallbackWithResult + ", params=" + this.onExtraCallback + ")";
        int i2 = asBinder + 97;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GetAttributeExtension(@Nullable String str, @NotNull AFj1nSDK4 aFj1nSDK4, boolean z, @Nullable Map<String, ? extends Object> map) {
        Object obj;
        Boolean bool;
        Object obj2;
        Intrinsics.checkNotNullParameter(aFj1nSDK4, "");
        this.IAuthTabCallbackStub = str;
        this.onWarmupCompleted = aFj1nSDK4;
        this.onExtraCallbackWithResult = z;
        this.onExtraCallback = map;
        if (map != null) {
            obj = map.get("from_web");
            int i = 2 % 2;
        } else {
            int i2 = 2 % 2;
            obj = null;
        }
        if (!(!(obj instanceof Boolean))) {
            int i3 = asBinder + 45;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                bool.hashCode();
                throw null;
            }
            bool = (Boolean) obj;
        } else {
            int i4 = 2 % 2;
            bool = null;
        }
        boolean zBooleanValue = false;
        this.IAuthTabCallback = bool != null ? bool.booleanValue() : false;
        if (map != null) {
            obj2 = map.get("from_rn");
        } else {
            int i5 = asBinder + 9;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            obj2 = null;
        }
        bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool != null) {
            int i8 = asBinder + 1;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            zBooleanValue = bool.booleanValue();
        }
        this.onNavigationEvent = zBooleanValue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetAttributeExtension(String str, AFj1nSDK4 aFj1nSDK4, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 31;
            asBinder = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 17;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            map = null;
        }
        this(str, aFj1nSDK4, z, map);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 53;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i2 + 15;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Map<String, Object> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.onExtraCallback;
        int i5 = i2 + 57;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        String str = this.IAuthTabCallbackStub + " (" + this.onWarmupCompleted.name() + " " + IAuthTabCallbackStub() + ")";
        int i2 = asBinder + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r1
      0x001c: PHI (r1v5 java.util.Map<java.lang.String, java.lang.Object>) = (r1v4 java.util.Map<java.lang.String, java.lang.Object>), (r1v10 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onWarmupCompleted() {
        Map<String, Object> map;
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            map = this.onExtraCallback;
            int i3 = 28 / 0;
            if (map != null) {
                obj = map.get("company");
                int i4 = IAuthTabCallbackDefault + 7;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 5;
                }
            } else {
                obj = null;
            }
        } else {
            map = this.onExtraCallback;
            if (map != null) {
            }
        }
        if (!(obj instanceof String)) {
            return null;
        }
        int i6 = asBinder + 95;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return (String) obj;
    }

    private final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        if (this.IAuthTabCallback) {
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 25;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 23;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 72 / 0;
            }
            return "웹";
        }
        if (!this.onNavigationEvent) {
            int i6 = asBinder + 111;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return "네이티브";
        }
        int i8 = asBinder + 61;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 == 0) {
            return "RN";
        }
        throw null;
    }
}
