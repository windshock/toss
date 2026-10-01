package o;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_immutable {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static final Number onWarmupCompleted(@NotNull Number number, @NotNull Number[] numberArr, @NotNull Number[] numberArr2) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(numberArr, "");
            Intrinsics.checkNotNullParameter(numberArr2, "");
            int length = numberArr.length;
            int length2 = numberArr2.length;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(numberArr, "");
        Intrinsics.checkNotNullParameter(numberArr2, "");
        if (numberArr.length != numberArr2.length) {
            throw new IllegalArgumentException("inputRange length should be same with outputRange");
        }
        if (numberArr.length < 2) {
            throw new IllegalArgumentException("inputRange length should be bigger than 1");
        }
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        double dDoubleValue = number.doubleValue();
        if (((Number) ArraysKt.first(numberArr)).doubleValue() >= dDoubleValue) {
            int i6 = IAuthTabCallback + 117;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return Double.valueOf(((Number) ArraysKt.first(numberArr2)).doubleValue());
            }
            Double.valueOf(((Number) ArraysKt.first(numberArr2)).doubleValue());
            obj.hashCode();
            throw null;
        }
        if (((Number) ArraysKt.last(numberArr)).doubleValue() <= dDoubleValue) {
            int i7 = onNavigationEvent + 125;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return Double.valueOf(((Number) ArraysKt.last(numberArr2)).doubleValue());
        }
        int length3 = numberArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = 1;
            if (i10 >= length3) {
                break;
            }
            Number number2 = numberArr[i10];
            if (i11 > 0 && number2.doubleValue() <= numberArr[i11 - 1].doubleValue()) {
                throw new IllegalArgumentException("inputRange should be sorted with ascending");
            }
            if (dDoubleValue < number2.doubleValue()) {
                if (i11 > 0) {
                    i9 = i11 - 1;
                } else {
                    i11 = 1;
                }
                i = i11;
            } else {
                i10++;
                i11++;
                int i12 = IAuthTabCallback + 9;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        double dDoubleValue2 = numberArr[i9].doubleValue();
        double dDoubleValue3 = (dDoubleValue - dDoubleValue2) / (numberArr[i].doubleValue() - dDoubleValue2);
        double dDoubleValue4 = numberArr2[i9].doubleValue();
        return Double.valueOf(((numberArr2[i].doubleValue() - dDoubleValue4) * dDoubleValue3) + dDoubleValue4);
    }
}
