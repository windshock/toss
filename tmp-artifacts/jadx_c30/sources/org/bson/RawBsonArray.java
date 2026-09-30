package org.bson;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import o.initViewsDefault;
import o.jc2;
import o.jc5;
import o.okzb1;
import o.pmi10;
import o.setDownloadButtonData;
import o.sya21;
import o.t_;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RawBsonArray extends initViewsDefault implements Serializable {
    private static final long serialVersionUID = 2;
    private final transient RawBsonArrayList IAuthTabCallback;

    public RawBsonArray(byte[] bArr) {
        this((byte[]) pmi10.onExtraCallbackWithResult("bytes", bArr), 0, bArr.length);
    }

    public RawBsonArray(byte[] bArr, int i, int i2) {
        this(new RawBsonArrayList(bArr, i, i2));
    }

    private RawBsonArray(RawBsonArrayList rawBsonArrayList) {
        super(rawBsonArrayList, false);
        this.IAuthTabCallback = rawBsonArrayList;
    }

    @Override // o.initViewsDefault, java.util.List, java.util.Collection
    /* renamed from: onExtraCallback */
    public boolean add(jc2 jc2Var) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override // o.initViewsDefault, java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override // o.initViewsDefault, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends jc2> collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override // o.initViewsDefault, java.util.List
    public boolean addAll(int i, Collection<? extends jc2> collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override // o.initViewsDefault, java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override // o.initViewsDefault, java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override // o.initViewsDefault, java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override // o.initViewsDefault, java.util.List
    /* renamed from: onNavigationEvent */
    public jc2 set(int i, jc2 jc2Var) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override // o.initViewsDefault, java.util.List
    /* renamed from: onExtraCallbackWithResult */
    public void add(int i, jc2 jc2Var) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override // o.initViewsDefault, java.util.List
    /* renamed from: onExtraCallbackWithResult */
    public jc2 remove(int i) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override // o.initViewsDefault
    /* renamed from: onExtraCallbackWithResult */
    public initViewsDefault clone() {
        return new RawBsonArray((byte[]) this.IAuthTabCallback.IAuthTabCallback.clone(), this.IAuthTabCallback.onExtraCallbackWithResult, this.IAuthTabCallback.onWarmupCompleted);
    }

    @Override // o.initViewsDefault, java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // o.initViewsDefault, java.util.List, java.util.Collection
    public int hashCode() {
        return super.hashCode();
    }

    private Object writeReplace() {
        return new SerializationProxy(this.IAuthTabCallback.IAuthTabCallback, this.IAuthTabCallback.onExtraCallbackWithResult, this.IAuthTabCallback.onWarmupCompleted);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    static class SerializationProxy implements Serializable {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        SerializationProxy(byte[] bArr, int i, int i2) {
            if (bArr.length == i2) {
                this.bytes = bArr;
                return;
            }
            byte[] bArr2 = new byte[i2];
            this.bytes = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i2);
        }

        private Object readResolve() {
            return new RawBsonArray(this.bytes);
        }
    }

    static class RawBsonArrayList extends AbstractList<jc2> {
        private final byte[] IAuthTabCallback;
        private final int onExtraCallbackWithResult;
        private Integer onNavigationEvent;
        private final int onWarmupCompleted;

        RawBsonArrayList(byte[] bArr, int i, int i2) {
            pmi10.onExtraCallbackWithResult("bytes", bArr);
            pmi10.onExtraCallbackWithResult("offset >= 0", i >= 0);
            pmi10.onExtraCallbackWithResult("offset < bytes.length", i < bArr.length);
            pmi10.onExtraCallbackWithResult("length <= bytes.length - offset", i2 <= bArr.length - i);
            pmi10.onExtraCallbackWithResult("length >= 5", i2 >= 5);
            this.IAuthTabCallback = bArr;
            this.onExtraCallbackWithResult = i;
            this.onWarmupCompleted = i2;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public jc2 get(int i) {
            if (i < 0) {
                throw new IndexOutOfBoundsException();
            }
            setDownloadButtonData setdownloadbuttondataOnExtraCallback = onExtraCallback();
            try {
                setdownloadbuttondataOnExtraCallback.warmup();
                int i2 = 0;
                while (setdownloadbuttondataOnExtraCallback.ICustomTabsCallbackStub() != t_.END_OF_DOCUMENT) {
                    setdownloadbuttondataOnExtraCallback.IEngagementSignalsCallback();
                    if (i2 == i) {
                        return RawBsonValueHelper.onExtraCallback(this.IAuthTabCallback, setdownloadbuttondataOnExtraCallback);
                    }
                    setdownloadbuttondataOnExtraCallback.ICustomTabsService_Parcel();
                    i2++;
                }
                setdownloadbuttondataOnExtraCallback.extraCommand();
                setdownloadbuttondataOnExtraCallback.close();
                throw new IndexOutOfBoundsException();
            } finally {
                setdownloadbuttondataOnExtraCallback.close();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Integer num = this.onNavigationEvent;
            if (num != null) {
                return num.intValue();
            }
            setDownloadButtonData setdownloadbuttondataOnExtraCallback = onExtraCallback();
            try {
                setdownloadbuttondataOnExtraCallback.warmup();
                int i = 0;
                while (setdownloadbuttondataOnExtraCallback.ICustomTabsCallbackStub() != t_.END_OF_DOCUMENT) {
                    i++;
                    setdownloadbuttondataOnExtraCallback.requestPostMessageChannelWithExtras();
                    setdownloadbuttondataOnExtraCallback.ICustomTabsService_Parcel();
                }
                setdownloadbuttondataOnExtraCallback.extraCommand();
                setdownloadbuttondataOnExtraCallback.close();
                Integer numValueOf = Integer.valueOf(i);
                this.onNavigationEvent = numValueOf;
                return numValueOf.intValue();
            } catch (Throwable th) {
                setdownloadbuttondataOnExtraCallback.close();
                throw th;
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<jc2> iterator() {
            return new Itr(this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<jc2> listIterator() {
            return new ListItr(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<jc2> listIterator(int i) {
            return new ListItr(i);
        }

        class Itr implements Iterator<jc2> {
            private int onExtraCallbackWithResult;
            private setDownloadButtonData onNavigationEvent;
            private int onWarmupCompleted;

            Itr(RawBsonArrayList rawBsonArrayList) {
                this(0);
            }

            Itr(int i) {
                this.onWarmupCompleted = 0;
                this.onExtraCallbackWithResult = 0;
                onExtraCallbackWithResult(i);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                boolean z = this.onWarmupCompleted != RawBsonArrayList.this.size();
                if (!z) {
                    this.onNavigationEvent.close();
                }
                return z;
            }

            @Override // java.util.Iterator
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public jc2 next() {
                while (this.onWarmupCompleted > this.onExtraCallbackWithResult && this.onNavigationEvent.ICustomTabsCallbackStub() != t_.END_OF_DOCUMENT) {
                    this.onNavigationEvent.IEngagementSignalsCallback();
                    this.onNavigationEvent.ICustomTabsService_Parcel();
                    this.onExtraCallbackWithResult++;
                }
                if (this.onNavigationEvent.ICustomTabsCallbackStub() != t_.END_OF_DOCUMENT) {
                    this.onNavigationEvent.IEngagementSignalsCallback();
                    int i = this.onWarmupCompleted + 1;
                    this.onWarmupCompleted = i;
                    this.onExtraCallbackWithResult = i;
                    return RawBsonValueHelper.onExtraCallback(RawBsonArrayList.this.IAuthTabCallback, this.onNavigationEvent);
                }
                this.onNavigationEvent.close();
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }

            public int IAuthTabCallback() {
                return this.onWarmupCompleted;
            }

            void onExtraCallbackWithResult(int i) {
                this.onWarmupCompleted = i;
                this.onExtraCallbackWithResult = 0;
                setDownloadButtonData setdownloadbuttondata = this.onNavigationEvent;
                if (setdownloadbuttondata != null) {
                    setdownloadbuttondata.close();
                }
                setDownloadButtonData setdownloadbuttondataOnExtraCallback = RawBsonArrayList.this.onExtraCallback();
                this.onNavigationEvent = setdownloadbuttondataOnExtraCallback;
                setdownloadbuttondataOnExtraCallback.warmup();
            }
        }

        class ListItr extends Itr implements ListIterator<jc2> {
            ListItr(int i) {
                super(i);
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return IAuthTabCallback() != 0;
            }

            @Override // java.util.ListIterator
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public jc2 previous() {
                try {
                    jc2 jc2Var = RawBsonArrayList.this.get(previousIndex());
                    onExtraCallbackWithResult(previousIndex());
                    return jc2Var;
                } catch (IndexOutOfBoundsException unused) {
                    throw new NoSuchElementException();
                }
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return IAuthTabCallback();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return IAuthTabCallback() - 1;
            }

            @Override // java.util.ListIterator
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public void set(jc2 jc2Var) {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }

            @Override // java.util.ListIterator
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public void add(jc2 jc2Var) {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public setDownloadButtonData onExtraCallback() {
            return new setDownloadButtonData(new sya21(IAuthTabCallback()));
        }

        okzb1 IAuthTabCallback() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onWarmupCompleted);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            return new jc5(byteBufferWrap);
        }
    }
}
