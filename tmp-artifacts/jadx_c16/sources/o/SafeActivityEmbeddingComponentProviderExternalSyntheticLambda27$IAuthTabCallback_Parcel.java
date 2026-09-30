package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 1;
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel onExtraCallbackWithResult = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel();
    public static final int onNavigationEvent = 8;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 49;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 97;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel))) {
            return true;
        }
        int i7 = i3 + 119;
        asInterface = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return -1043453597;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            int i4 = 29 / 0;
        }
        int i5 = i3 + 81;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return "UserError";
    }

    private SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel() {
        super("INVALID_USER_ENVIRONMENT", "이 상품은 현재 기기 또는 설정 환경에서는 구매가 지원되지 않습니다.", (DefaultConstructorMarker) null);
    }
}
