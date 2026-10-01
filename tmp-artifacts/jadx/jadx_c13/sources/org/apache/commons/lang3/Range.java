package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Range<T> implements Serializable {
    private static final long serialVersionUID = 1;
    private final Comparator<T> comparator;
    private final T maximum;
    private final T minimum;
    private transient String onExtraCallback;
    private transient int onExtraCallbackWithResult;

    enum ComparableComparator implements Comparator {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    public static Range IAuthTabCallback(Comparable comparable, Comparable comparable2) {
        return onWarmupCompleted(comparable, comparable2, null);
    }

    public static <T> Range<T> onWarmupCompleted(T t, T t2, Comparator<T> comparator) {
        return new Range<>(t, t2, comparator);
    }

    private Range(T t, T t2, Comparator<T> comparator) {
        if (t == null || t2 == null) {
            throw new IllegalArgumentException("Elements in a range must not be null: element1=" + t + ", element2=" + t2);
        }
        if (comparator == null) {
            this.comparator = ComparableComparator.INSTANCE;
        } else {
            this.comparator = comparator;
        }
        if (this.comparator.compare(t, t2) <= 0) {
            this.minimum = t;
            this.maximum = t2;
        } else {
            this.minimum = t2;
            this.maximum = t;
        }
    }

    public boolean IAuthTabCallback(T t) {
        return t != null && this.comparator.compare(t, this.minimum) >= 0 && this.comparator.compare(t, this.maximum) <= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != Range.class) {
            return false;
        }
        Range range = (Range) obj;
        return this.minimum.equals(range.minimum) && this.maximum.equals(range.maximum);
    }

    public int hashCode() {
        int i = this.onExtraCallbackWithResult;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Range.class.hashCode() + 629) * 37) + this.minimum.hashCode()) * 37) + this.maximum.hashCode();
        this.onExtraCallbackWithResult = iHashCode;
        return iHashCode;
    }

    public String toString() {
        if (this.onExtraCallback == null) {
            this.onExtraCallback = "[" + this.minimum + ".." + this.maximum + "]";
        }
        return this.onExtraCallback;
    }
}
