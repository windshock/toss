package o;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getHasSender extends getCodeName {
    public static boolean onExtraCallbackWithResult(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean onExtraCallback(@Nullable long[] jArr, @Nullable long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static boolean IAuthTabCallback(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean IAuthTabCallback(@Nullable short[] sArr, @Nullable short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    public static String onNavigationEvent(@Nullable int[] iArr) {
        String strJoinToString$default;
        return (iArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(access13400.onExtraCallback(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    public static String onNavigationEvent(@Nullable long[] jArr) {
        String strJoinToString$default;
        return (jArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(access13100.onExtraCallbackWithResult(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    public static String onExtraCallback(@Nullable byte[] bArr) {
        String strJoinToString$default;
        return (bArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(access13200.onExtraCallback(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    public static String IAuthTabCallback(@Nullable short[] sArr) {
        String strJoinToString$default;
        return (sArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(TombstoneProtosRegisterBuilder.onWarmupCompleted(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator onExtraCallback(int[] iArr) {
        return access13400.asBinder(iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator IAuthTabCallback(long[] jArr) {
        return access13100.asInterface(jArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator IAuthTabCallback(byte[] bArr) {
        return access13200.IAuthTabCallbackStub(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator onExtraCallbackWithResult(short[] sArr) {
        return TombstoneProtosRegisterBuilder.onTransact(sArr);
    }
}
