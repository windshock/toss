package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.TombstoneProtosRegisterBuilder;
import o.access13100;
import o.access13200;
import o.access13400;
import o.getHasSender;
import o.getWrite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    public static final <T> List<T> flatten(@NotNull T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        long length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length > 2147483647L) {
            throw new IllegalArgumentException(("Sum of all arrays lengths (" + length + ") exceeds maximum list size (2147483647)").toString());
        }
        Object[] objArr = new Object[(int) length];
        int length2 = 0;
        for (T[] tArr3 : tArr) {
            ArraysKt___ArraysJvmKt.copyInto$default(tArr3, objArr, length2, 0, 0, 12, (Object) null);
            length2 += tArr3.length;
        }
        List<T> listAsList = ArraysKt___ArraysJvmKt.asList(objArr);
        Intrinsics.checkNotNull(listAsList, "");
        return listAsList;
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return getWrite.IAuthTabCallback(arrayList, arrayList2);
    }

    private static final boolean isNullOrEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final Object ifEmpty(Object[] objArr, Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return objArr.length == 0 ? function0.invoke() : objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean contentDeepEquals(@Nullable T[] tArr, @Nullable T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            Object[] objArr = tArr[i];
            Object[] objArr2 = tArr2[i];
            if (objArr != objArr2) {
                if (objArr != 0 && objArr2 != 0) {
                    if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                        if (!contentDeepEquals(objArr, objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                        if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                        if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                        if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                        if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                        if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                        if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof access13200) && (objArr2 instanceof access13200)) {
                        if (!getHasSender.IAuthTabCallback(((access13200) objArr).onWarmupCompleted(), ((access13200) objArr2).onWarmupCompleted())) {
                            return false;
                        }
                    } else if ((objArr instanceof TombstoneProtosRegisterBuilder) && (objArr2 instanceof TombstoneProtosRegisterBuilder)) {
                        if (!getHasSender.IAuthTabCallback(((TombstoneProtosRegisterBuilder) objArr).onWarmupCompleted(), ((TombstoneProtosRegisterBuilder) objArr2).onWarmupCompleted())) {
                            return false;
                        }
                    } else if ((objArr instanceof access13400) && (objArr2 instanceof access13400)) {
                        if (!getHasSender.onExtraCallbackWithResult(((access13400) objArr).IAuthTabCallback(), ((access13400) objArr2).IAuthTabCallback())) {
                            return false;
                        }
                    } else if ((objArr instanceof access13100) && (objArr2 instanceof access13100)) {
                        if (!getHasSender.onExtraCallback(((access13100) objArr).onWarmupCompleted(), ((access13100) objArr2).onWarmupCompleted())) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(objArr, objArr2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static <T> String contentDeepToString(@Nullable T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((RangesKt___RangesKt.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new ArrayList());
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb, list);
                Unit unit = Unit.INSTANCE;
            } else if (objArr instanceof byte[]) {
                String string = Arrays.toString((byte[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string, "");
                sb.append(string);
            } else if (objArr instanceof short[]) {
                String string2 = Arrays.toString((short[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                sb.append(string2);
            } else if (objArr instanceof int[]) {
                String string3 = Arrays.toString((int[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                sb.append(string3);
            } else if (objArr instanceof long[]) {
                String string4 = Arrays.toString((long[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                sb.append(string4);
            } else if (objArr instanceof float[]) {
                String string5 = Arrays.toString((float[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                sb.append(string5);
            } else if (objArr instanceof double[]) {
                String string6 = Arrays.toString((double[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                sb.append(string6);
            } else if (objArr instanceof char[]) {
                String string7 = Arrays.toString((char[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                sb.append(string7);
            } else if (objArr instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string8, "");
                sb.append(string8);
            } else if (objArr instanceof access13200) {
                sb.append(getHasSender.onExtraCallback(((access13200) objArr).onWarmupCompleted()));
            } else if (objArr instanceof TombstoneProtosRegisterBuilder) {
                sb.append(getHasSender.IAuthTabCallback(((TombstoneProtosRegisterBuilder) objArr).onWarmupCompleted()));
            } else if (objArr instanceof access13400) {
                sb.append(getHasSender.onNavigationEvent(((access13400) objArr).IAuthTabCallback()));
            } else if (objArr instanceof access13100) {
                sb.append(getHasSender.onNavigationEvent(((access13100) objArr).onWarmupCompleted()));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }
}
