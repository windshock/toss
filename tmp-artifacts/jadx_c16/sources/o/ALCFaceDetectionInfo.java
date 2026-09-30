package o;

import android.util.SparseArray;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ALCFaceDetectionInfo {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> SparseArray<T> onWarmupCompleted(@NotNull Pair<Integer, ? extends T>... pairArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pairArr, "");
        SparseArray<T> sparseArray = (SparseArray<T>) new SparseArray();
        int length = pairArr.length;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = IAuthTabCallback + 19;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                Pair<Integer, ? extends T> pair = pairArr[i4];
                sparseArray.put(((Number) pair.onExtraCallbackWithResult()).intValue(), pair.IAuthTabCallback());
                i4 += 74;
            } else {
                Pair<Integer, ? extends T> pair2 = pairArr[i4];
                sparseArray.put(((Number) pair2.onExtraCallbackWithResult()).intValue(), pair2.IAuthTabCallback());
                i4++;
            }
        }
        return sparseArray;
    }
}
