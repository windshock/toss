package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getProcessImportance {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final getProcessImportance onNavigationEvent = new getProcessImportance();
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private getProcessImportance() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] onExtraCallback(@NotNull char[] cArr, @NotNull char[] cArr2, @NotNull Set<Character> set) {
        int iOnExtraCallback;
        int iOnExtraCallback2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(cArr2, "");
        Intrinsics.checkNotNullParameter(set, "");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = i2 == cArr.length;
            boolean z2 = i3 == cArr2.length;
            if (z) {
                int i4 = onExtraCallbackWithResult + 53;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (!(!z2)) {
                    break;
                }
                if (z) {
                    IAuthTabCallback(arrayList, cArr2.length - i3, 1);
                    break;
                }
                if (z2) {
                    int i6 = onExtraCallbackWithResult + 103;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    IAuthTabCallback(arrayList, cArr.length - i2, 2);
                    break;
                }
                boolean zContains = set.contains(Character.valueOf(cArr[i2]));
                boolean zContains2 = set.contains(Character.valueOf(cArr2[i3]));
                if (zContains && zContains2) {
                    int i8 = onExtraCallback + 49;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        iOnExtraCallback = onExtraCallback(cArr, i2, set);
                        iOnExtraCallback2 = onExtraCallback(cArr2, i3, set);
                        onNavigationEvent(arrayList, cArr, cArr2, i2, iOnExtraCallback, i3, iOnExtraCallback2);
                    } else {
                        iOnExtraCallback = onExtraCallback(cArr, i2 + 1, set);
                        iOnExtraCallback2 = onExtraCallback(cArr2, i3 + 1, set);
                        onNavigationEvent(arrayList, cArr, cArr2, i2, iOnExtraCallback, i3, iOnExtraCallback2);
                    }
                    i2 = iOnExtraCallback;
                    i3 = iOnExtraCallback2;
                    int i9 = onExtraCallbackWithResult + 49;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 3 % 5;
                    }
                } else {
                    if (zContains) {
                        arrayList.add(1);
                    } else if (zContains2) {
                        arrayList.add(2);
                        i2++;
                    } else {
                        arrayList.add(0);
                        i2++;
                    }
                    i3++;
                }
            }
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            iArr[i11] = ((Number) obj).intValue();
        }
        return iArr;
    }

    private final int onExtraCallback(char[] cArr, int i, Set<Character> set) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 77;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            int length = cArr.length;
            while (i < length) {
                int i4 = onExtraCallbackWithResult + 39;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (!set.contains(Character.valueOf(cArr[i]))) {
                    int i6 = onExtraCallback + 7;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        return i;
                    }
                    throw null;
                }
                i++;
            }
            return cArr.length;
        }
        int length2 = cArr.length;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(List<Integer> list, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 = 0; i6 < i; i6++) {
            list.add(Integer.valueOf(i2));
        }
        int i7 = onExtraCallback + 107;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(List<Integer> list, char[] cArr, char[] cArr2, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        int i8 = 1;
        int i9 = i2 - i;
        int i10 = i4 - i3;
        int iMax = Math.max(i9, i10);
        if (i9 == i10) {
            IAuthTabCallback(list, iMax, 0);
            return;
        }
        int i11 = i9 + 1;
        int i12 = i10 + 1;
        int[][] iArr = new int[i11][];
        for (int i13 = 0; i13 < i11; i13++) {
            iArr[i13] = new int[i12];
        }
        int i14 = 0;
        while (i14 < i11) {
            int i15 = onExtraCallback + 91;
            onExtraCallbackWithResult = i15 % 128;
            if (i15 % 2 == 0) {
                iArr[i14][0] = i14;
                i14 += 24;
            } else {
                iArr[i14][0] = i14;
                i14++;
            }
        }
        int i16 = 0;
        while (i16 < i12) {
            int i17 = onExtraCallbackWithResult + 99;
            onExtraCallback = i17 % 128;
            if (i17 % 2 != 0) {
                iArr[0][i16] = i16;
                i16 += 86;
            } else {
                iArr[0][i16] = i16;
                i16++;
            }
        }
        int i18 = 1;
        while (i18 < i11) {
            int i19 = i8;
            while (i19 < i12) {
                int i20 = i18 - 1;
                int i21 = i19 - 1;
                if (cArr[i20 + i] == cArr2[i21 + i3]) {
                    int i22 = onExtraCallback + 123;
                    onExtraCallbackWithResult = i22 % 128;
                    i5 = i22 % i6 == 0 ? 1 : 0;
                }
                int[] iArr2 = iArr[i18];
                int[] iArr3 = iArr[i20];
                iArr2[i19] = onExtraCallbackWithResult(iArr3[i19] + 1, iArr2[i21] + 1, iArr3[i21] + i5);
                i19++;
                i8 = 1;
                i9 = i9;
                i6 = 2;
            }
            i18++;
            i6 = 2;
        }
        ArrayList arrayList = new ArrayList(iMax << 1);
        int i23 = onExtraCallback + 51;
        onExtraCallbackWithResult = i23 % 128;
        int i24 = i23 % 2;
        int i25 = i9;
        while (true) {
            if (i25 <= 0 && i10 <= 0) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Object obj = arrayList.get(size);
                    Intrinsics.checkNotNullExpressionValue(obj, "");
                    list.add(obj);
                }
                return;
            }
            if (i25 == 0) {
                arrayList.add(1);
            } else {
                if (i10 == 0) {
                    int i26 = onExtraCallback + 7;
                    onExtraCallbackWithResult = i26 % 128;
                    if (i26 % 2 == 0) {
                        arrayList.add(2);
                        int i27 = 23 / 0;
                    } else {
                        arrayList.add(2);
                    }
                } else {
                    int i28 = i10 - 1;
                    int i29 = iArr[i25][i28];
                    int[] iArr4 = iArr[i25 - 1];
                    int i30 = iArr4[i10];
                    int i31 = iArr4[i28];
                    if (i29 < i30) {
                        int i32 = onExtraCallback + 73;
                        onExtraCallbackWithResult = i32 % 128;
                        if (i32 % 2 == 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (i29 < i31) {
                            arrayList.add(1);
                        }
                    }
                    if (i30 < i31) {
                        int i33 = onExtraCallback + 13;
                        onExtraCallbackWithResult = i33 % 128;
                        if (i33 % 2 == 0) {
                            arrayList.add(2);
                            int i34 = 82 / 0;
                        } else {
                            arrayList.add(2);
                        }
                    } else {
                        arrayList.add(0);
                        i25--;
                        i10--;
                    }
                }
                i25--;
            }
            i10--;
        }
    }

    private final int onExtraCallbackWithResult(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 77;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        int iMin = Math.min(i2, i3);
        if (i6 == 0) {
            return Math.min(i, iMin);
        }
        Math.min(i, iMin);
        throw null;
    }
}
