package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetORDER_BY_NAMEcp {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final accessgetORDER_BY_NAMEcp onNavigationEvent = new accessgetORDER_BY_NAMEcp(0.0f, 0.0f, 0.0f, 0.0f, new deprecated_javaName(0));
    private static int onTransact;
    private final float IAuthTabCallback;
    private final float IAuthTabCallbackDefault;
    private final float onExtraCallback;
    private final CipherSuiteCompanion onExtraCallbackWithResult;
    private final float onWarmupCompleted;

    public accessgetORDER_BY_NAMEcp(float f, float f2, float f3, float f4, @NotNull CipherSuiteCompanion cipherSuiteCompanion) {
        Intrinsics.checkNotNullParameter(cipherSuiteCompanion, "");
        this.IAuthTabCallback = f;
        this.IAuthTabCallbackDefault = f2;
        this.onWarmupCompleted = f3;
        this.onExtraCallback = f4;
        this.onExtraCallbackWithResult = cipherSuiteCompanion;
    }

    public static final /* synthetic */ accessgetORDER_BY_NAMEcp IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = onNavigationEvent;
        int i5 = i3 + 117;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return accessgetorder_by_namecp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        float f = this.IAuthTabCallback;
        int i5 = i3 + 59;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float asBinder() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 55;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallbackDefault;
        int i5 = i2 + 67;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onWarmupCompleted() {
        float f;
        int i = 2 % 2;
        int i2 = asInterface + 27;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            f = this.onWarmupCompleted;
            int i4 = 88 / 0;
        } else {
            f = this.onWarmupCompleted;
        }
        int i5 = i3 + 3;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        float f = this.onExtraCallback;
        int i5 = i3 + 51;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final CipherSuiteCompanion onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        CipherSuiteCompanion cipherSuiteCompanion = this.onExtraCallbackWithResult;
        int i5 = i2 + 61;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return cipherSuiteCompanion;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i2 = IAuthTabCallbackStub + 81;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(accessgetORDER_BY_NAMEcp.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = (accessgetORDER_BY_NAMEcp) obj;
        if (this.IAuthTabCallback == accessgetorder_by_namecp.IAuthTabCallback && this.IAuthTabCallbackDefault == accessgetorder_by_namecp.IAuthTabCallbackDefault) {
            int i4 = asInterface + 123;
            int i5 = i4 % 128;
            IAuthTabCallbackStub = i5;
            int i6 = i4 % 2;
            if (this.onWarmupCompleted == accessgetorder_by_namecp.onWarmupCompleted) {
                int i7 = i5 + 13;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    return this.onExtraCallback == accessgetorder_by_namecp.onExtraCallback && Intrinsics.areEqual(this.onExtraCallbackWithResult, accessgetorder_by_namecp.onExtraCallbackWithResult);
                }
                float f = accessgetorder_by_namecp.onExtraCallback;
                throw null;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.IAuthTabCallback);
        int iHashCode2 = Float.hashCode(this.IAuthTabCallbackDefault);
        int iHashCode3 = (((((((iHashCode * 31) + iHashCode2) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = asInterface + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final accessgetORDER_BY_NAMEcp onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                accessgetORDER_BY_NAMEcp.IAuthTabCallback();
                throw null;
            }
            accessgetORDER_BY_NAMEcp accessgetorder_by_namecpIAuthTabCallback = accessgetORDER_BY_NAMEcp.IAuthTabCallback();
            int i3 = IAuthTabCallback + 25;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return accessgetorder_by_namecpIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = asBinder + 91;
        onTransact = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
