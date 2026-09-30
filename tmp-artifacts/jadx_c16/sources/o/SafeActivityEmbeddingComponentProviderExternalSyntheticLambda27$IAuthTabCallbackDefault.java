package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallbackDefault extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 0;
    private static int onWarmupCompleted = 1;
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallbackDefault onExtraCallback = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallbackDefault();
    public static final int onNavigationEvent = 8;

    static {
        int i = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if ((r6 instanceof o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallbackDefault) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 25;
        o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallbackDefault.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 123;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 17;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return -589220051;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return "PostPurchaseError";
        }
        int i3 = 68 / 0;
        return "PostPurchaseError";
    }

    private SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallbackDefault() {
        super("TOSS_SERVER_VERIFICATION_FAILED", "결제가 완료되었지만, 서버 전송에 실패했습니다.", (DefaultConstructorMarker) null);
    }
}
