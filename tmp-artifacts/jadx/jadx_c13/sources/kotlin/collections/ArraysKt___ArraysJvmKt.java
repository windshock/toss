package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.access6500;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ArraysKt___ArraysJvmKt extends ArraysKt__ArraysKt {
    private static final <T> T elementAt(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return tArr[i];
    }

    private static final byte elementAt(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return bArr[i];
    }

    private static final short elementAt(short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return sArr[i];
    }

    private static final int elementAt(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return iArr[i];
    }

    private static final long elementAt(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return jArr[i];
    }

    private static final float elementAt(float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return fArr[i];
    }

    private static final double elementAt(double[] dArr, int i) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return dArr[i];
    }

    private static final boolean elementAt(boolean[] zArr, int i) {
        Intrinsics.checkNotNullParameter(zArr, "");
        return zArr[i];
    }

    private static final char elementAt(char[] cArr, int i) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return cArr[i];
    }

    public static <R> List<R> filterIsInstance(@NotNull Object[] objArr, @NotNull Class<R> cls) {
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(cls, "");
        return (List) filterIsInstanceTo(objArr, new ArrayList(), cls);
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Object[] objArr, @NotNull C c, @NotNull Class<R> cls) {
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(cls, "");
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    public static <T> List<T> asList(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        List<T> listIAuthTabCallback = access6500.IAuthTabCallback(tArr);
        Intrinsics.checkNotNullExpressionValue(listIAuthTabCallback, "");
        return listIAuthTabCallback;
    }

    public static final class IAuthTabCallback extends AbstractList<Byte> implements RandomAccess {
        final /* synthetic */ byte[] onNavigationEvent;

        IAuthTabCallback(byte[] bArr) {
            this.onNavigationEvent = bArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return onExtraCallbackWithResult(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return onNavigationEvent(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return onExtraCallback(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.onNavigationEvent.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.onNavigationEvent.length == 0;
        }

        public boolean onExtraCallbackWithResult(byte b) {
            return ArraysKt___ArraysKt.contains(this.onNavigationEvent, b);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Byte get(int i) {
            return Byte.valueOf(this.onNavigationEvent[i]);
        }

        public int onNavigationEvent(byte b) {
            return ArraysKt___ArraysKt.indexOf(this.onNavigationEvent, b);
        }

        public int onExtraCallback(byte b) {
            return ArraysKt___ArraysKt.lastIndexOf(this.onNavigationEvent, b);
        }
    }

    public static final List<Byte> asList(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new IAuthTabCallback(bArr);
    }

    public static final class onWarmupCompleted extends AbstractList<Short> implements RandomAccess {
        final /* synthetic */ short[] onExtraCallback;

        onWarmupCompleted(short[] sArr) {
            this.onExtraCallback = sArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Short) {
                return onExtraCallbackWithResult(((Number) obj).shortValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Short) {
                return onWarmupCompleted(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return IAuthTabCallback(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.onExtraCallback.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.onExtraCallback.length == 0;
        }

        public boolean onExtraCallbackWithResult(short s) {
            return ArraysKt___ArraysKt.contains(this.onExtraCallback, s);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public Short get(int i) {
            return Short.valueOf(this.onExtraCallback[i]);
        }

        public int onWarmupCompleted(short s) {
            return ArraysKt___ArraysKt.indexOf(this.onExtraCallback, s);
        }

        public int IAuthTabCallback(short s) {
            return ArraysKt___ArraysKt.lastIndexOf(this.onExtraCallback, s);
        }
    }

    public static final List<Short> asList(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return new onWarmupCompleted(sArr);
    }

    public static final class onExtraCallback extends AbstractList<Integer> implements RandomAccess {
        final /* synthetic */ int[] IAuthTabCallback;

        onExtraCallback(int[] iArr) {
            this.IAuthTabCallback = iArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return onExtraCallback(((Number) obj).intValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return IAuthTabCallback(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return onNavigationEvent(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.IAuthTabCallback.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.IAuthTabCallback.length == 0;
        }

        public boolean onExtraCallback(int i) {
            return ArraysKt___ArraysKt.contains(this.IAuthTabCallback, i);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            return Integer.valueOf(this.IAuthTabCallback[i]);
        }

        public int IAuthTabCallback(int i) {
            return ArraysKt___ArraysKt.indexOf(this.IAuthTabCallback, i);
        }

        public int onNavigationEvent(int i) {
            return ArraysKt___ArraysKt.lastIndexOf(this.IAuthTabCallback, i);
        }
    }

    public static List<Integer> asList(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return new onExtraCallback(iArr);
    }

    public static final class onExtraCallbackWithResult extends AbstractList<Long> implements RandomAccess {
        final /* synthetic */ long[] onWarmupCompleted;

        onExtraCallbackWithResult(long[] jArr) {
            this.onWarmupCompleted = jArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Long) {
                return onExtraCallbackWithResult(((Number) obj).longValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Long) {
                return onExtraCallback(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return IAuthTabCallback(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.onWarmupCompleted.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.onWarmupCompleted.length == 0;
        }

        public boolean onExtraCallbackWithResult(long j) {
            return ArraysKt___ArraysKt.contains(this.onWarmupCompleted, j);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Long get(int i) {
            return Long.valueOf(this.onWarmupCompleted[i]);
        }

        public int onExtraCallback(long j) {
            return ArraysKt___ArraysKt.indexOf(this.onWarmupCompleted, j);
        }

        public int IAuthTabCallback(long j) {
            return ArraysKt___ArraysKt.lastIndexOf(this.onWarmupCompleted, j);
        }
    }

    public static List<Long> asList(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return new onExtraCallbackWithResult(jArr);
    }

    public static final class onNavigationEvent extends AbstractList<Float> implements RandomAccess {
        final /* synthetic */ float[] onExtraCallbackWithResult;

        onNavigationEvent(float[] fArr) {
            this.onExtraCallbackWithResult = fArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Float) {
                return onExtraCallbackWithResult(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Float) {
                return onExtraCallback(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return onWarmupCompleted(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.onExtraCallbackWithResult.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.onExtraCallbackWithResult.length == 0;
        }

        public boolean onExtraCallbackWithResult(float f) {
            for (float f2 : this.onExtraCallbackWithResult) {
                if (Float.floatToIntBits(f2) == Float.floatToIntBits(f)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public Float get(int i) {
            return Float.valueOf(this.onExtraCallbackWithResult[i]);
        }

        public int onExtraCallback(float f) {
            float[] fArr = this.onExtraCallbackWithResult;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(f)) {
                    return i;
                }
            }
            return -1;
        }

        public int onWarmupCompleted(float f) {
            float[] fArr = this.onExtraCallbackWithResult;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    public static final List<Float> asList(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return new onNavigationEvent(fArr);
    }

    public static final class onTransact extends AbstractList<Double> implements RandomAccess {
        final /* synthetic */ double[] onExtraCallback;

        onTransact(double[] dArr) {
            this.onExtraCallback = dArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Double) {
                return onExtraCallbackWithResult(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Double) {
                return onNavigationEvent(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return onExtraCallback(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.onExtraCallback.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.onExtraCallback.length == 0;
        }

        public boolean onExtraCallbackWithResult(double d) {
            for (double d2 : this.onExtraCallback) {
                if (Double.doubleToLongBits(d2) == Double.doubleToLongBits(d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Double get(int i) {
            return Double.valueOf(this.onExtraCallback[i]);
        }

        public int onNavigationEvent(double d) {
            double[] dArr = this.onExtraCallback;
            int length = dArr.length;
            for (int i = 0; i < length; i++) {
                if (Double.doubleToLongBits(dArr[i]) == Double.doubleToLongBits(d)) {
                    return i;
                }
            }
            return -1;
        }

        public int onExtraCallback(double d) {
            double[] dArr = this.onExtraCallback;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    public static List<Double> asList(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return new onTransact(dArr);
    }

    public static final class asInterface extends AbstractList<Boolean> implements RandomAccess {
        final /* synthetic */ boolean[] IAuthTabCallback;

        asInterface(boolean[] zArr) {
            this.IAuthTabCallback = zArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return onExtraCallback(((Boolean) obj).booleanValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return IAuthTabCallback(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return onNavigationEvent(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.IAuthTabCallback.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.IAuthTabCallback.length == 0;
        }

        public boolean onExtraCallback(boolean z) {
            return ArraysKt___ArraysKt.contains(this.IAuthTabCallback, z);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public Boolean get(int i) {
            return Boolean.valueOf(this.IAuthTabCallback[i]);
        }

        public int IAuthTabCallback(boolean z) {
            return ArraysKt___ArraysKt.indexOf(this.IAuthTabCallback, z);
        }

        public int onNavigationEvent(boolean z) {
            return ArraysKt___ArraysKt.lastIndexOf(this.IAuthTabCallback, z);
        }
    }

    public static List<Boolean> asList(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "");
        return new asInterface(zArr);
    }

    public static final class IAuthTabCallbackDefault extends AbstractList<Character> implements RandomAccess {
        final /* synthetic */ char[] onWarmupCompleted;

        IAuthTabCallbackDefault(char[] cArr) {
            this.onWarmupCompleted = cArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Character) {
                return IAuthTabCallback(((Character) obj).charValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Character) {
                return onExtraCallback(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return onWarmupCompleted(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.onWarmupCompleted.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.onWarmupCompleted.length == 0;
        }

        public boolean IAuthTabCallback(char c) {
            return ArraysKt___ArraysKt.contains(this.onWarmupCompleted, c);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Character get(int i) {
            return Character.valueOf(this.onWarmupCompleted[i]);
        }

        public int onExtraCallback(char c) {
            return ArraysKt___ArraysKt.indexOf(this.onWarmupCompleted, c);
        }

        public int onWarmupCompleted(char c) {
            return ArraysKt___ArraysKt.lastIndexOf(this.onWarmupCompleted, c);
        }
    }

    public static final List<Character> asList(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return new IAuthTabCallbackDefault(cArr);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return binarySearch(objArr, obj, comparator, i, i2);
    }

    public static final <T> int binarySearch(@NotNull T[] tArr, T t, @NotNull Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return Arrays.binarySearch(tArr, i, i2, t, comparator);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        return binarySearch(objArr, obj, i, i2);
    }

    public static final <T> int binarySearch(@NotNull T[] tArr, T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return Arrays.binarySearch(tArr, i, i2, t);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return binarySearch(bArr, b, i, i2);
    }

    public static final int binarySearch(@NotNull byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return Arrays.binarySearch(bArr, i, i2, b);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return binarySearch(sArr, s, i, i2);
    }

    public static final int binarySearch(@NotNull short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return Arrays.binarySearch(sArr, i, i2, s);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return binarySearch(iArr, i, i2, i3);
    }

    public static final int binarySearch(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return Arrays.binarySearch(iArr, i2, i3, i);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return binarySearch(jArr, j, i, i2);
    }

    public static final int binarySearch(@NotNull long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return Arrays.binarySearch(jArr, i, i2, j);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        return binarySearch(fArr, f, i, i2);
    }

    public static final int binarySearch(@NotNull float[] fArr, float f, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return Arrays.binarySearch(fArr, i, i2, f);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        return binarySearch(dArr, d, i, i2);
    }

    public static final int binarySearch(@NotNull double[] dArr, double d, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return Arrays.binarySearch(dArr, i, i2, d);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return binarySearch(cArr, c, i, i2);
    }

    public static final int binarySearch(@NotNull char[] cArr, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return Arrays.binarySearch(cArr, i, i2, c);
    }

    private static final <T> boolean contentDeepEqualsInline(T[] tArr, T[] tArr2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(tArr2, "");
        return ArraysKt__ArraysKt.contentDeepEquals(tArr, tArr2);
    }

    private static final <T> boolean contentDeepEqualsNullable(T[] tArr, T[] tArr2) {
        return ArraysKt__ArraysKt.contentDeepEquals(tArr, tArr2);
    }

    private static final <T> int contentDeepHashCodeInline(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return ArraysKt__ArraysJVMKt.contentDeepHashCode(tArr);
    }

    private static final <T> int contentDeepHashCodeNullable(T[] tArr) {
        return ArraysKt__ArraysJVMKt.contentDeepHashCode(tArr);
    }

    private static final <T> String contentDeepToStringInline(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return ArraysKt__ArraysKt.contentDeepToString(tArr);
    }

    private static final <T> String contentDeepToStringNullable(T[] tArr) {
        return ArraysKt__ArraysKt.contentDeepToString(tArr);
    }

    private static final <T> boolean contentEquals(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    private static final boolean contentEquals(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private static final boolean contentEquals(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    private static final boolean contentEquals(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    private static final boolean contentEquals(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    private static final boolean contentEquals(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    private static final boolean contentEquals(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    private static final boolean contentEquals(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    private static final boolean contentEquals(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    private static final <T> int contentHashCode(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    private static final int contentHashCode(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    private static final int contentHashCode(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    private static final int contentHashCode(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    private static final int contentHashCode(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    private static final int contentHashCode(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    private static final int contentHashCode(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    private static final int contentHashCode(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    private static final int contentHashCode(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    private static final <T> String contentToString(T[] tArr) {
        String string = Arrays.toString(tArr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String contentToString(byte[] bArr) {
        String string = Arrays.toString(bArr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String contentToString(short[] sArr) {
        String string = Arrays.toString(sArr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String contentToString(int[] iArr) {
        String string = Arrays.toString(iArr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String contentToString(long[] jArr) {
        String string = Arrays.toString(jArr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String contentToString(float[] fArr) {
        String string = Arrays.toString(fArr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String contentToString(double[] dArr) {
        String string = Arrays.toString(dArr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String contentToString(boolean[] zArr) {
        String string = Arrays.toString(zArr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String contentToString(char[] cArr) {
        String string = Arrays.toString(cArr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return copyInto(objArr, objArr2, i, i2, i3);
    }

    public static <T> T[] copyInto(@NotNull T[] tArr, @NotNull T[] tArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(tArr2, "");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return copyInto(bArr, bArr2, i, i2, i3);
    }

    public static byte[] copyInto(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length;
        }
        return copyInto(sArr, sArr2, i, i2, i3);
    }

    public static short[] copyInto(@NotNull short[] sArr, @NotNull short[] sArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(sArr2, "");
        System.arraycopy(sArr, i2, sArr2, i, i3 - i2);
        return sArr2;
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return copyInto(iArr, iArr2, i, i2, i3);
    }

    public static int[] copyInto(@NotNull int[] iArr, @NotNull int[] iArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return copyInto(jArr, jArr2, i, i2, i3);
    }

    public static long[] copyInto(@NotNull long[] jArr, @NotNull long[] jArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return copyInto(fArr, fArr2, i, i2, i3);
    }

    public static float[] copyInto(@NotNull float[] fArr, @NotNull float[] fArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(fArr2, "");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length;
        }
        return copyInto(dArr, dArr2, i, i2, i3);
    }

    public static double[] copyInto(@NotNull double[] dArr, @NotNull double[] dArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(dArr2, "");
        System.arraycopy(dArr, i2, dArr2, i, i3 - i2);
        return dArr2;
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = zArr.length;
        }
        return copyInto(zArr, zArr2, i, i2, i3);
    }

    public static final boolean[] copyInto(@NotNull boolean[] zArr, @NotNull boolean[] zArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(zArr2, "");
        System.arraycopy(zArr, i2, zArr2, i, i3 - i2);
        return zArr2;
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = cArr.length;
        }
        return copyInto(cArr, cArr2, i, i2, i3);
    }

    public static char[] copyInto(@NotNull char[] cArr, @NotNull char[] cArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(cArr2, "");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    private static final <T> T[] copyOf(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "");
        return tArr2;
    }

    private static final byte[] copyOf(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }

    private static final short[] copyOf(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "");
        return sArrCopyOf;
    }

    private static final int[] copyOf(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
        return iArrCopyOf;
    }

    private static final long[] copyOf(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
        return jArrCopyOf;
    }

    private static final float[] copyOf(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
        return fArrCopyOf;
    }

    private static final double[] copyOf(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "");
        return dArrCopyOf;
    }

    private static final boolean[] copyOf(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, zArr.length);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "");
        return zArrCopyOf;
    }

    private static final char[] copyOf(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "");
        return cArrCopyOf;
    }

    private static final byte[] copyOf(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }

    private static final short[] copyOf(short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(sArr, "");
        short[] sArrCopyOf = Arrays.copyOf(sArr, i);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "");
        return sArrCopyOf;
    }

    private static final int[] copyOf(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
        return iArrCopyOf;
    }

    private static final long[] copyOf(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
        return jArrCopyOf;
    }

    private static final float[] copyOf(float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(fArr, "");
        float[] fArrCopyOf = Arrays.copyOf(fArr, i);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
        return fArrCopyOf;
    }

    private static final double[] copyOf(double[] dArr, int i) {
        Intrinsics.checkNotNullParameter(dArr, "");
        double[] dArrCopyOf = Arrays.copyOf(dArr, i);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "");
        return dArrCopyOf;
    }

    private static final boolean[] copyOf(boolean[] zArr, int i) {
        Intrinsics.checkNotNullParameter(zArr, "");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "");
        return zArrCopyOf;
    }

    private static final char[] copyOf(char[] cArr, int i) {
        Intrinsics.checkNotNullParameter(cArr, "");
        char[] cArrCopyOf = Arrays.copyOf(cArr, i);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "");
        return cArrCopyOf;
    }

    private static final <T> T[] copyOf(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        Intrinsics.checkNotNullExpressionValue(tArr2, "");
        return tArr2;
    }

    private static final <T> T[] copyOfRangeInline(T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) copyOfRange(tArr, i, i2);
    }

    private static final byte[] copyOfRangeInline(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return copyOfRange(bArr, i, i2);
    }

    private static final short[] copyOfRangeInline(short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return copyOfRange(sArr, i, i2);
    }

    private static final int[] copyOfRangeInline(int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return copyOfRange(iArr, i, i2);
    }

    private static final long[] copyOfRangeInline(long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return copyOfRange(jArr, i, i2);
    }

    private static final float[] copyOfRangeInline(float[] fArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return copyOfRange(fArr, i, i2);
    }

    private static final double[] copyOfRangeInline(double[] dArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return copyOfRange(dArr, i, i2);
    }

    private static final boolean[] copyOfRangeInline(boolean[] zArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(zArr, "");
        return copyOfRange(zArr, i, i2);
    }

    private static final char[] copyOfRangeInline(char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return copyOfRange(cArr, i, i2);
    }

    public static <T> T[] copyOfRange(@NotNull T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(tArr2, "");
        return tArr2;
    }

    public static byte[] copyOfRange(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "");
        return bArrCopyOfRange;
    }

    public static short[] copyOfRange(@NotNull short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOfRange, "");
        return sArrCopyOfRange;
    }

    public static int[] copyOfRange(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOfRange, "");
        return iArrCopyOfRange;
    }

    public static long[] copyOfRange(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOfRange, "");
        return jArrCopyOfRange;
    }

    public static float[] copyOfRange(@NotNull float[] fArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOfRange, "");
        return fArrCopyOfRange;
    }

    public static final double[] copyOfRange(@NotNull double[] dArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOfRange, "");
        return dArrCopyOfRange;
    }

    public static final boolean[] copyOfRange(@NotNull boolean[] zArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(zArr, "");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOfRange, "");
        return zArrCopyOfRange;
    }

    public static final char[] copyOfRange(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOfRange, "");
        return cArrCopyOfRange;
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        fill(objArr, obj, i, i2);
    }

    public static <T> void fill(@NotNull T[] tArr, T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Arrays.fill(tArr, i, i2, t);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        fill(bArr, b, i, i2);
    }

    public static void fill(@NotNull byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Arrays.fill(bArr, i, i2, b);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        fill(sArr, s, i, i2);
    }

    public static void fill(@NotNull short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Arrays.fill(sArr, i, i2, s);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        fill(iArr, i, i2, i3);
    }

    public static void fill(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Arrays.fill(iArr, i2, i3, i);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        fill(jArr, j, i, i2);
    }

    public static void fill(@NotNull long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Arrays.fill(jArr, i, i2, j);
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        fill(fArr, f, i, i2);
    }

    public static final void fill(@NotNull float[] fArr, float f, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Arrays.fill(fArr, i, i2, f);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        fill(dArr, d, i, i2);
    }

    public static final void fill(@NotNull double[] dArr, double d, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Arrays.fill(dArr, i, i2, d);
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        fill(zArr, z, i, i2);
    }

    public static final void fill(@NotNull boolean[] zArr, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Arrays.fill(zArr, i, i2, z);
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        fill(cArr, c, i, i2);
    }

    public static void fill(@NotNull char[] cArr, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Arrays.fill(cArr, i, i2, c);
    }

    public static <T> T[] plus(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    public static byte[] plus(@NotNull byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b;
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static short[] plus(@NotNull short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + 1);
        sArrCopyOf[length] = s;
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static int[] plus(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i;
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static long[] plus(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        jArrCopyOf[length] = j;
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final float[] plus(@NotNull float[] fArr, float f) {
        Intrinsics.checkNotNullParameter(fArr, "");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f;
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final double[] plus(@NotNull double[] dArr, double d) {
        Intrinsics.checkNotNullParameter(dArr, "");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        dArrCopyOf[length] = d;
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    public static final boolean[] plus(@NotNull boolean[] zArr, boolean z) {
        Intrinsics.checkNotNullParameter(zArr, "");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        zArrCopyOf[length] = z;
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    public static char[] plus(@NotNull char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + 1);
        cArrCopyOf[length] = c;
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    public static <T> T[] plus(@NotNull T[] tArr, @NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(collection, "");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, collection.size() + length);
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    public static final byte[] plus(@NotNull byte[] bArr, @NotNull Collection<Byte> collection) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(collection, "");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, collection.size() + length);
        Iterator<Byte> it = collection.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = it.next().byteValue();
            length++;
        }
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final short[] plus(@NotNull short[] sArr, @NotNull Collection<Short> collection) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(collection, "");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, collection.size() + length);
        Iterator<Short> it = collection.iterator();
        while (it.hasNext()) {
            sArrCopyOf[length] = it.next().shortValue();
            length++;
        }
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static final int[] plus(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(collection, "");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, collection.size() + length);
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArrCopyOf[length] = it.next().intValue();
            length++;
        }
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final long[] plus(@NotNull long[] jArr, @NotNull Collection<Long> collection) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(collection, "");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, collection.size() + length);
        Iterator<Long> it = collection.iterator();
        while (it.hasNext()) {
            jArrCopyOf[length] = it.next().longValue();
            length++;
        }
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final float[] plus(@NotNull float[] fArr, @NotNull Collection<Float> collection) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(collection, "");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, collection.size() + length);
        Iterator<Float> it = collection.iterator();
        while (it.hasNext()) {
            fArrCopyOf[length] = it.next().floatValue();
            length++;
        }
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final double[] plus(@NotNull double[] dArr, @NotNull Collection<Double> collection) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(collection, "");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, collection.size() + length);
        Iterator<Double> it = collection.iterator();
        while (it.hasNext()) {
            dArrCopyOf[length] = it.next().doubleValue();
            length++;
        }
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    public static final boolean[] plus(@NotNull boolean[] zArr, @NotNull Collection<Boolean> collection) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(collection, "");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, collection.size() + length);
        Iterator<Boolean> it = collection.iterator();
        while (it.hasNext()) {
            zArrCopyOf[length] = it.next().booleanValue();
            length++;
        }
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    public static final char[] plus(@NotNull char[] cArr, @NotNull Collection<Character> collection) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(collection, "");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, collection.size() + length);
        Iterator<Character> it = collection.iterator();
        while (it.hasNext()) {
            cArrCopyOf[length] = it.next().charValue();
            length++;
        }
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    public static <T> T[] plus(@NotNull T[] tArr, @NotNull T[] tArr2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(tArr2, "");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        Intrinsics.checkNotNull(tArr3);
        return tArr3;
    }

    public static byte[] plus(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static short[] plus(@NotNull short[] sArr, @NotNull short[] sArr2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(sArr2, "");
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static int[] plus(@NotNull int[] iArr, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static long[] plus(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static float[] plus(@NotNull float[] fArr, @NotNull float[] fArr2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(fArr2, "");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static double[] plus(@NotNull double[] dArr, @NotNull double[] dArr2) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(dArr2, "");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    public static boolean[] plus(@NotNull boolean[] zArr, @NotNull boolean[] zArr2) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(zArr2, "");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    public static char[] plus(@NotNull char[] cArr, @NotNull char[] cArr2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(cArr2, "");
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    private static final <T> T[] plusElement(T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) plus(tArr, t);
    }

    public static void sort(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static void sort(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static final void sort(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    public static final void sort(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static final void sort(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    public static final void sort(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    public static final void sort(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    private static final <T extends Comparable<? super T>> void sort(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        sort((Object[]) tArr);
    }

    public static <T> void sort(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static /* synthetic */ void sort$default(Comparable[] comparableArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = comparableArr.length;
        }
        sort(comparableArr, i, i2);
    }

    public static final <T extends Comparable<? super T>> void sort(@NotNull T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Arrays.sort(tArr, i, i2);
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        sort(bArr, i, i2);
    }

    public static final void sort(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Arrays.sort(bArr, i, i2);
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = sArr.length;
        }
        sort(sArr, i, i2);
    }

    public static final void sort(@NotNull short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Arrays.sort(sArr, i, i2);
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iArr.length;
        }
        sort(iArr, i, i2);
    }

    public static void sort(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Arrays.sort(iArr, i, i2);
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jArr.length;
        }
        sort(jArr, i, i2);
    }

    public static void sort(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Arrays.sort(jArr, i, i2);
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fArr.length;
        }
        sort(fArr, i, i2);
    }

    public static void sort(@NotNull float[] fArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Arrays.sort(fArr, i, i2);
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dArr.length;
        }
        sort(dArr, i, i2);
    }

    public static void sort(@NotNull double[] dArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Arrays.sort(dArr, i, i2);
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        sort(cArr, i, i2);
    }

    public static final void sort(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Arrays.sort(cArr, i, i2);
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = objArr.length;
        }
        sort(objArr, i, i2);
    }

    public static final <T> void sort(@NotNull T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Arrays.sort(tArr, i, i2);
    }

    public static <T> void sortWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        sortWith(objArr, comparator, i, i2);
    }

    public static <T> void sortWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Arrays.sort(tArr, i, i2, comparator);
    }

    public static final Byte[] toTypedArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    public static final Short[] toTypedArray(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            shArr[i] = Short.valueOf(sArr[i]);
        }
        return shArr;
    }

    public static Integer[] toTypedArray(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static Long[] toTypedArray(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    public static Float[] toTypedArray(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    public static Double[] toTypedArray(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    public static Boolean[] toTypedArray(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    public static final Character[] toTypedArray(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet());
    }

    public static final SortedSet<Byte> toSortedSet(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(bArr, new TreeSet());
    }

    public static final SortedSet<Short> toSortedSet(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(sArr, new TreeSet());
    }

    public static final SortedSet<Integer> toSortedSet(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(iArr, new TreeSet());
    }

    public static final SortedSet<Long> toSortedSet(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(jArr, new TreeSet());
    }

    public static final SortedSet<Float> toSortedSet(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(fArr, new TreeSet());
    }

    public static final SortedSet<Double> toSortedSet(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(dArr, new TreeSet());
    }

    public static final SortedSet<Boolean> toSortedSet(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(zArr, new TreeSet());
    }

    public static final SortedSet<Character> toSortedSet(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(cArr, new TreeSet());
    }

    public static final <T> SortedSet<T> toSortedSet(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet(comparator));
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Double max(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return ArraysKt___ArraysKt.maxOrNull(dArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Float max(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return ArraysKt___ArraysKt.maxOrNull(fArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Comparable max(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "");
        return ArraysKt___ArraysKt.maxOrNull(comparableArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Byte max(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return ArraysKt___ArraysKt.maxOrNull(bArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Short max(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return ArraysKt___ArraysKt.maxOrNull(sArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Integer max(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return ArraysKt___ArraysKt.maxOrNull(iArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Long max(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return ArraysKt___ArraysKt.maxOrNull(jArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Float max(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return ArraysKt___ArraysKt.maxOrNull(fArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Double max(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return ArraysKt___ArraysKt.maxOrNull(dArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Character max(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return ArraysKt___ArraysKt.maxOrNull(cArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Object maxWith(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.maxWithOrNull(objArr, comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Byte maxWith(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.maxWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Short maxWith(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.maxWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Integer maxWith(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.maxWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Long maxWith(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.maxWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Float maxWith(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.maxWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Double maxWith(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.maxWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Boolean maxWith(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.maxWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Character maxWith(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.maxWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Double min(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return ArraysKt___ArraysKt.minOrNull(dArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Float min(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return ArraysKt___ArraysKt.minOrNull(fArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Comparable min(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "");
        return ArraysKt___ArraysKt.minOrNull(comparableArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Byte min(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return ArraysKt___ArraysKt.minOrNull(bArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Short min(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return ArraysKt___ArraysKt.minOrNull(sArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Integer min(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return ArraysKt___ArraysKt.minOrNull(iArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Long min(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return ArraysKt___ArraysKt.minOrNull(jArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Float min(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return ArraysKt___ArraysKt.minOrNull(fArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Double min(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return ArraysKt___ArraysKt.minOrNull(dArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Character min(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return ArraysKt___ArraysKt.minOrNull(cArr);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Object minWith(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.minWithOrNull(objArr, comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Byte minWith(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.minWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Short minWith(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.minWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Integer minWith(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.minWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Long minWith(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.minWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Float minWith(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.minWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Double minWith(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.minWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Boolean minWith(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.minWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Character minWith(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return ArraysKt___ArraysKt.minWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    private static final <T> BigDecimal sumOfBigDecimal(T[] tArr, Function1<? super T, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        for (T t : tArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(t));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(byte[] bArr, Function1<? super Byte, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        for (byte b : bArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Byte.valueOf(b)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(short[] sArr, Function1<? super Short, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        for (short s : sArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Short.valueOf(s)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(int[] iArr, Function1<? super Integer, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        for (int i : iArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Integer.valueOf(i)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(long[] jArr, Function1<? super Long, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        for (long j : jArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Long.valueOf(j)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(float[] fArr, Function1<? super Float, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        for (float f : fArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Float.valueOf(f)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(double[] dArr, Function1<? super Double, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        for (double d : dArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Double.valueOf(d)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(boolean[] zArr, Function1<? super Boolean, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        for (boolean z : zArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Boolean.valueOf(z)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(char[] cArr, Function1<? super Character, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        for (char c : cArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Character.valueOf(c)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final <T> BigInteger sumOfBigInteger(T[] tArr, Function1<? super T, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        for (T t : tArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(t));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(byte[] bArr, Function1<? super Byte, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        for (byte b : bArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Byte.valueOf(b)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(short[] sArr, Function1<? super Short, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        for (short s : sArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Short.valueOf(s)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(int[] iArr, Function1<? super Integer, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        for (int i : iArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Integer.valueOf(i)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(long[] jArr, Function1<? super Long, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        for (long j : jArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Long.valueOf(j)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(float[] fArr, Function1<? super Float, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        for (float f : fArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Float.valueOf(f)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(double[] dArr, Function1<? super Double, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        for (double d : dArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Double.valueOf(d)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(boolean[] zArr, Function1<? super Boolean, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        for (boolean z : zArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Boolean.valueOf(z)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(char[] cArr, Function1<? super Character, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        for (char c : cArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Character.valueOf(c)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(T[] tArr, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(t);
            if (lastIndex > 0) {
                int i = 1;
                while (true) {
                    T t2 = tArr[i];
                    R rInvoke2 = function1.invoke(t2);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        t = t2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return t;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte maxBy(byte[] bArr, Function1<? super Byte, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b);
        }
        R rInvoke = function1.invoke(Byte.valueOf(b));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                byte b2 = bArr[i];
                R rInvoke2 = function1.invoke(Byte.valueOf(b2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b = b2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Short maxBy(short[] sArr, Function1<? super Short, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = function1.invoke(Short.valueOf(s));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                short s2 = sArr[i];
                R rInvoke2 = function1.invoke(Short.valueOf(s2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s = s2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer maxBy(int[] iArr, Function1<? super Integer, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i);
        }
        R rInvoke = function1.invoke(Integer.valueOf(i));
        if (lastIndex > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                R rInvoke2 = function1.invoke(Integer.valueOf(i3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i = i3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Long maxBy(long[] jArr, Function1<? super Long, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = function1.invoke(Long.valueOf(j));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                long j2 = jArr[i];
                R rInvoke2 = function1.invoke(Long.valueOf(j2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j = j2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Float maxBy(float[] fArr, Function1<? super Float, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f);
        }
        R rInvoke = function1.invoke(Float.valueOf(f));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                float f2 = fArr[i];
                R rInvoke2 = function1.invoke(Float.valueOf(f2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f = f2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Double maxBy(double[] dArr, Function1<? super Double, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d);
        }
        R rInvoke = function1.invoke(Double.valueOf(d));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                double d2 = dArr[i];
                R rInvoke2 = function1.invoke(Double.valueOf(d2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d = d2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean maxBy(boolean[] zArr, Function1<? super Boolean, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = function1.invoke(Boolean.valueOf(z));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                boolean z2 = zArr[i];
                R rInvoke2 = function1.invoke(Boolean.valueOf(z2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z = z2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(char[] cArr, Function1<? super Character, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c);
        }
        R rInvoke = function1.invoke(Character.valueOf(c));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                char c2 = cArr[i];
                R rInvoke2 = function1.invoke(Character.valueOf(c2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c = c2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(T[] tArr, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(t);
            if (lastIndex > 0) {
                int i = 1;
                while (true) {
                    T t2 = tArr[i];
                    R rInvoke2 = function1.invoke(t2);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        t = t2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return t;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte minBy(byte[] bArr, Function1<? super Byte, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b);
        }
        R rInvoke = function1.invoke(Byte.valueOf(b));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                byte b2 = bArr[i];
                R rInvoke2 = function1.invoke(Byte.valueOf(b2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b = b2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Short minBy(short[] sArr, Function1<? super Short, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = function1.invoke(Short.valueOf(s));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                short s2 = sArr[i];
                R rInvoke2 = function1.invoke(Short.valueOf(s2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s = s2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer minBy(int[] iArr, Function1<? super Integer, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i);
        }
        R rInvoke = function1.invoke(Integer.valueOf(i));
        if (lastIndex > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                R rInvoke2 = function1.invoke(Integer.valueOf(i3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i = i3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Long minBy(long[] jArr, Function1<? super Long, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = function1.invoke(Long.valueOf(j));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                long j2 = jArr[i];
                R rInvoke2 = function1.invoke(Long.valueOf(j2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j = j2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Float minBy(float[] fArr, Function1<? super Float, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f);
        }
        R rInvoke = function1.invoke(Float.valueOf(f));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                float f2 = fArr[i];
                R rInvoke2 = function1.invoke(Float.valueOf(f2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f = f2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Double minBy(double[] dArr, Function1<? super Double, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d);
        }
        R rInvoke = function1.invoke(Double.valueOf(d));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                double d2 = dArr[i];
                R rInvoke2 = function1.invoke(Double.valueOf(d2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d = d2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean minBy(boolean[] zArr, Function1<? super Boolean, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = function1.invoke(Boolean.valueOf(z));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                boolean z2 = zArr[i];
                R rInvoke2 = function1.invoke(Boolean.valueOf(z2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z = z2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(char[] cArr, Function1<? super Character, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c);
        }
        R rInvoke = function1.invoke(Character.valueOf(c));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                char c2 = cArr[i];
                R rInvoke2 = function1.invoke(Character.valueOf(c2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c = c2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c);
    }
}
