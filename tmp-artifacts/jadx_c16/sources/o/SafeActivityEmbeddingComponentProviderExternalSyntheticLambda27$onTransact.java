package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onTransact extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onTransact onExtraCallback = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onTransact();
    public static final int onNavigationEvent = 8;

    static {
        int i = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 37;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 121;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onTransact) {
            return true;
        }
        int i8 = i2 + 73;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return 1454661448;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return "PostPurchaseGrantedError";
        }
        int i3 = 13 / 0;
        return "PostPurchaseGrantedError";
    }

    private SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onTransact() {
        super("PRODUCT_NOT_GRANTED_BY_PARTNER", "결제가 완료되었지만, 제휴사에서 상품 지급에 실패했습니다.", (DefaultConstructorMarker) null);
    }
}
