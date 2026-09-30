package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.core.NativeRealmAny;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import o.TombstoneProtosLogMessageOrBuilder;
import o.access23600;
import o.clearRegisterName;
import o.clearType;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmMapEntrySet<K, V> implements Set<Map.Entry<K, V>> {
    private final IteratorType IAuthTabCallback;
    private final clearRegisterName<K, V> onExtraCallback;
    private final TombstoneProtosLogMessageOrBuilder onExtraCallbackWithResult;
    private final OsMap onNavigationEvent;
    private final clearType<K, V> onWarmupCompleted;

    public enum IteratorType {
        LONG,
        BYTE,
        SHORT,
        INTEGER,
        FLOAT,
        DOUBLE,
        STRING,
        BOOLEAN,
        DATE,
        DECIMAL128,
        BINARY,
        OBJECT_ID,
        UUID,
        MIXED,
        OBJECT
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        long jOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted();
        if (jOnWarmupCompleted < 2147483647L) {
            return (int) jOnWarmupCompleted;
        }
        return Integer.MAX_VALUE;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.onNavigationEvent.onWarmupCompleted() == 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@Nullable Object obj) {
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (next == null && obj == null) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            if (next != null && this.onExtraCallback.onExtraCallbackWithResult(next, (Map.Entry) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return IAuthTabCallback(this.IAuthTabCallback, this.onNavigationEvent, this.onExtraCallbackWithResult, this.onWarmupCompleted);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[(int) this.onNavigationEvent.onWarmupCompleted()];
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        long jOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted();
        Object[] objArr = (((long) tArr.length) == jOnWarmupCompleted || ((long) tArr.length) > jOnWarmupCompleted) ? tArr : (T[]) ((Object[]) Array.newInstance((Class<?>) Map.Entry.class, (int) jOnWarmupCompleted));
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        if (tArr.length > jOnWarmupCompleted) {
            objArr[i] = null;
        }
        return (T[]) objArr;
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(@Nullable Object obj) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return isEmpty();
        }
        for (Object obj : collection) {
            if (!(obj instanceof Map.Entry) || !contains((Map.Entry) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    /* renamed from: io.realm.RealmMapEntrySet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[IteratorType.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[IteratorType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[IteratorType.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onWarmupCompleted[IteratorType.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onWarmupCompleted[IteratorType.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onWarmupCompleted[IteratorType.FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onWarmupCompleted[IteratorType.DOUBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onWarmupCompleted[IteratorType.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onWarmupCompleted[IteratorType.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onWarmupCompleted[IteratorType.DATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onWarmupCompleted[IteratorType.DECIMAL128.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onWarmupCompleted[IteratorType.BINARY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onWarmupCompleted[IteratorType.OBJECT_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onWarmupCompleted[IteratorType.UUID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onWarmupCompleted[IteratorType.MIXED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                onWarmupCompleted[IteratorType.OBJECT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    private static <K, V> EntrySetIterator<K, V> IAuthTabCallback(IteratorType iteratorType, OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, @Nullable clearType cleartype) {
        switch (AnonymousClass1.onWarmupCompleted[iteratorType.ordinal()]) {
            case 1:
                return new LongValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 2:
                return new ByteValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 3:
                return new ShortValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 4:
                return new IntegerValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 5:
                return new FloatValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 6:
                return new DoubleValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 7:
                return new StringValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 8:
                return new BooleanValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 9:
                return new DateValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 10:
                return new Decimal128ValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 11:
                return new BinaryValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 12:
                return new ObjectIdValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 13:
                return new UUIDValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 14:
                return new RealmAnyValueIterator(osMap, tombstoneProtosLogMessageOrBuilder);
            case 15:
                if (cleartype == null) {
                    throw new IllegalArgumentException("Missing class container when creating RealmModelValueIterator.");
                }
                return new RealmModelValueIterator(osMap, tombstoneProtosLogMessageOrBuilder, cleartype);
            default:
                throw new IllegalArgumentException("Invalid iterator type.");
        }
    }

    static abstract class EntrySetIterator<K, V> implements Iterator<Map.Entry<K, V>> {
        protected final OsMap onExtraCallback;
        private int onNavigationEvent = -1;
        protected final TombstoneProtosLogMessageOrBuilder onWarmupCompleted;

        protected abstract Map.Entry<K, V> onExtraCallback(int i);

        EntrySetIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            this.onExtraCallback = osMap;
            this.onWarmupCompleted = tombstoneProtosLogMessageOrBuilder;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ((long) (this.onNavigationEvent + 1)) < this.onExtraCallback.onWarmupCompleted();
        }

        @Override // java.util.Iterator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.onNavigationEvent++;
            long jOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted();
            int i = this.onNavigationEvent;
            if (i >= jOnWarmupCompleted) {
                throw new NoSuchElementException("Cannot access index " + this.onNavigationEvent + " when size is " + jOnWarmupCompleted + ". Remember to check hasNext() before using next().");
            }
            return onExtraCallback(i);
        }
    }

    static class LongValueIterator<K> extends EntrySetIterator<K, Long> {
        LongValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Long> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            Object obj = access23600VarOnNavigationEvent.onWarmupCompleted;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, (Long) obj);
        }
    }

    static class ByteValueIterator<K> extends EntrySetIterator<K, Byte> {
        ByteValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Byte> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            Object obj = access23600VarOnNavigationEvent.onWarmupCompleted;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, Byte.valueOf(((Long) obj).byteValue()));
        }
    }

    static class ShortValueIterator<K> extends EntrySetIterator<K, Short> {
        ShortValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Short> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            Object obj = access23600VarOnNavigationEvent.onWarmupCompleted;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, Short.valueOf(((Long) obj).shortValue()));
        }
    }

    static class IntegerValueIterator<K> extends EntrySetIterator<K, Integer> {
        IntegerValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Integer> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            Object obj = access23600VarOnNavigationEvent.onWarmupCompleted;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, Integer.valueOf(((Long) obj).intValue()));
        }
    }

    static class FloatValueIterator<K> extends EntrySetIterator<K, Float> {
        FloatValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Float> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            if (access23600VarOnNavigationEvent.onWarmupCompleted == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, (Float) access23600VarOnNavigationEvent.onWarmupCompleted);
        }
    }

    static class DoubleValueIterator<K> extends EntrySetIterator<K, Double> {
        DoubleValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Double> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            if (access23600VarOnNavigationEvent.onWarmupCompleted == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, (Double) access23600VarOnNavigationEvent.onWarmupCompleted);
        }
    }

    static class StringValueIterator<K> extends EntrySetIterator<K, String> {
        StringValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, String> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            if (access23600VarOnNavigationEvent.onWarmupCompleted == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, (String) access23600VarOnNavigationEvent.onWarmupCompleted);
        }
    }

    static class BooleanValueIterator<K> extends EntrySetIterator<K, Boolean> {
        BooleanValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Boolean> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            if (access23600VarOnNavigationEvent.onWarmupCompleted == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, (Boolean) access23600VarOnNavigationEvent.onWarmupCompleted);
        }
    }

    static class DateValueIterator<K> extends EntrySetIterator<K, Date> {
        DateValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Date> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            if (access23600VarOnNavigationEvent.onWarmupCompleted == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, (Date) access23600VarOnNavigationEvent.onWarmupCompleted);
        }
    }

    static class Decimal128ValueIterator<K> extends EntrySetIterator<K, Decimal128> {
        Decimal128ValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Decimal128> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            if (access23600VarOnNavigationEvent.onWarmupCompleted == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, (Decimal128) access23600VarOnNavigationEvent.onWarmupCompleted);
        }
    }

    static class BinaryValueIterator<K> extends EntrySetIterator<K, byte[]> {
        BinaryValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, byte[]> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            if (access23600VarOnNavigationEvent.onWarmupCompleted == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, (byte[]) access23600VarOnNavigationEvent.onWarmupCompleted);
        }
    }

    static class ObjectIdValueIterator<K> extends EntrySetIterator<K, ObjectId> {
        ObjectIdValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, ObjectId> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            if (access23600VarOnNavigationEvent.onWarmupCompleted == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, (ObjectId) access23600VarOnNavigationEvent.onWarmupCompleted);
        }
    }

    static class UUIDValueIterator<K> extends EntrySetIterator<K, UUID> {
        UUIDValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, UUID> onExtraCallback(int i) {
            access23600 access23600VarOnNavigationEvent = this.onExtraCallback.onNavigationEvent(i);
            if (access23600VarOnNavigationEvent.onWarmupCompleted == null) {
                return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, null);
            }
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnNavigationEvent.onNavigationEvent, (UUID) access23600VarOnNavigationEvent.onWarmupCompleted);
        }
    }

    static class RealmModelValueIterator<K, V> extends EntrySetIterator<K, V> {
        private final clearType<K, V> IAuthTabCallback;

        RealmModelValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, clearType<K, V> cleartype) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
            this.IAuthTabCallback = cleartype;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, V> onExtraCallback(int i) {
            access23600 access23600VarOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(i);
            Object obj = access23600VarOnExtraCallbackWithResult.onNavigationEvent;
            long jLongValue = ((Long) access23600VarOnExtraCallbackWithResult.onWarmupCompleted).longValue();
            if (jLongValue == -1) {
                return new AbstractMap.SimpleImmutableEntry(obj, null);
            }
            return this.IAuthTabCallback.onNavigationEvent(this.onWarmupCompleted, jLongValue, obj);
        }
    }

    static class RealmAnyValueIterator<K> extends EntrySetIterator<K, RealmAny> {
        RealmAnyValueIterator(OsMap osMap, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            super(osMap, tombstoneProtosLogMessageOrBuilder);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, RealmAny> onExtraCallback(int i) {
            access23600 access23600VarOnExtraCallback = this.onExtraCallback.onExtraCallback(i);
            return new AbstractMap.SimpleImmutableEntry(access23600VarOnExtraCallback.onNavigationEvent, new RealmAny(RealmAnyOperator.onExtraCallbackWithResult(this.onWarmupCompleted, (NativeRealmAny) access23600VarOnExtraCallback.onWarmupCompleted)));
        }
    }
}
