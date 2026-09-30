package com.bytedance.adsdk.zb;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ycx<E> implements Collection<E>, Set<E> {
    private static int fby;
    private static int lt;
    private static Object[] lud;
    private static Object[] ul;
    private syc<E, E> jc;
    private int[] jw;
    Object[] ycx;
    int zb;
    private static final int[] sya = new int[0];
    private static final Object[] dj = new Object[0];

    private int ycx(Object obj, int i2) {
        int i3 = this.zb;
        if (i3 == 0) {
            return -1;
        }
        int iYcx = zb.ycx(this.jw, i3, i2);
        if (iYcx < 0 || obj.equals(this.ycx[iYcx])) {
            return iYcx;
        }
        int i4 = iYcx + 1;
        while (i4 < i3 && this.jw[i4] == i2) {
            if (obj.equals(this.ycx[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iYcx - 1; i5 >= 0 && this.jw[i5] == i2; i5--) {
            if (obj.equals(this.ycx[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    private int ycx() {
        int i2 = this.zb;
        if (i2 == 0) {
            return -1;
        }
        int iYcx = zb.ycx(this.jw, i2, 0);
        if (iYcx < 0 || this.ycx[iYcx] == null) {
            return iYcx;
        }
        int i3 = iYcx + 1;
        while (i3 < i2 && this.jw[i3] == 0) {
            if (this.ycx[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iYcx - 1; i4 >= 0 && this.jw[i4] == 0; i4--) {
            if (this.ycx[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    private void dj(int i2) {
        if (i2 == 8) {
            synchronized (ycx.class) {
                Object[] objArr = ul;
                if (objArr != null) {
                    this.ycx = objArr;
                    ul = (Object[]) objArr[0];
                    this.jw = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    fby--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (ycx.class) {
                Object[] objArr2 = lud;
                if (objArr2 != null) {
                    this.ycx = objArr2;
                    lud = (Object[]) objArr2[0];
                    this.jw = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    lt--;
                    return;
                }
            }
        }
        this.jw = new int[i2];
        this.ycx = new Object[i2];
    }

    private static void ycx(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (ycx.class) {
                if (fby < 10) {
                    objArr[0] = ul;
                    objArr[1] = iArr;
                    while (true) {
                        i2--;
                        if (i2 < 2) {
                            break;
                        } else {
                            objArr[i2] = null;
                        }
                    }
                    ul = objArr;
                    fby++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ycx.class) {
                if (lt < 10) {
                    objArr[0] = lud;
                    objArr[1] = iArr;
                    while (true) {
                        i2--;
                        if (i2 < 2) {
                            break;
                        } else {
                            objArr[i2] = null;
                        }
                    }
                    lud = objArr;
                    lt++;
                }
            }
        }
    }

    public ycx() {
        this(0);
    }

    public ycx(int i2) {
        if (i2 == 0) {
            this.jw = sya;
            this.ycx = dj;
        } else {
            dj(i2);
        }
        this.zb = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.zb;
        if (i2 != 0) {
            ycx(this.jw, this.ycx, i2);
            this.jw = sya;
            this.ycx = dj;
            this.zb = 0;
        }
    }

    public void ycx(int i2) {
        int[] iArr = this.jw;
        if (iArr.length < i2) {
            Object[] objArr = this.ycx;
            dj(i2);
            int i3 = this.zb;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.jw, 0, i3);
                System.arraycopy(objArr, 0, this.ycx, 0, this.zb);
            }
            ycx(iArr, objArr, this.zb);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return ycx(obj) >= 0;
    }

    public int ycx(Object obj) {
        return obj == null ? ycx() : ycx(obj, obj.hashCode());
    }

    public E zb(int i2) {
        return (E) this.ycx[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.zb <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i2;
        int iYcx;
        if (e == null) {
            iYcx = ycx();
            i2 = 0;
        } else {
            int iHashCode = e.hashCode();
            i2 = iHashCode;
            iYcx = ycx(e, iHashCode);
        }
        if (iYcx >= 0) {
            return false;
        }
        int i3 = ~iYcx;
        int i4 = this.zb;
        int[] iArr = this.jw;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.ycx;
            dj(i5);
            int[] iArr2 = this.jw;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.ycx, 0, objArr.length);
            }
            ycx(iArr, objArr, this.zb);
        }
        int i6 = this.zb;
        if (i3 < i6) {
            int[] iArr3 = this.jw;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.ycx;
            System.arraycopy(objArr2, i3, objArr2, i7, this.zb - i3);
        }
        this.jw[i3] = i2;
        this.ycx[i3] = e;
        this.zb++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iYcx = ycx(obj);
        if (iYcx < 0) {
            return false;
        }
        sya(iYcx);
        return true;
    }

    public E sya(int i2) {
        Object[] objArr = this.ycx;
        E e = (E) objArr[i2];
        int i3 = this.zb;
        if (i3 <= 1) {
            ycx(this.jw, objArr, i3);
            this.jw = sya;
            this.ycx = dj;
            this.zb = 0;
            return e;
        }
        int[] iArr = this.jw;
        if (iArr.length > 8 && i3 < iArr.length / 3) {
            dj(i3 > 8 ? i3 + (i3 >> 1) : 8);
            this.zb--;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.jw, 0, i2);
                System.arraycopy(objArr, 0, this.ycx, 0, i2);
            }
            int i4 = this.zb;
            if (i2 < i4) {
                int i5 = i2 + 1;
                System.arraycopy(iArr, i5, this.jw, i2, i4 - i2);
                System.arraycopy(objArr, i5, this.ycx, i2, this.zb - i2);
            }
            return e;
        }
        int i6 = i3 - 1;
        this.zb = i6;
        if (i2 < i6) {
            int i7 = i2 + 1;
            System.arraycopy(iArr, i7, iArr, i2, i6 - i2);
            Object[] objArr2 = this.ycx;
            System.arraycopy(objArr2, i7, objArr2, i2, this.zb - i2);
        }
        this.ycx[this.zb] = null;
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.zb;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.zb;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.ycx, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.zb) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.zb));
        }
        System.arraycopy(this.ycx, 0, tArr, 0, this.zb);
        int length = tArr.length;
        int i2 = this.zb;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.zb; i2++) {
                try {
                    if (!set.contains(zb(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.jw;
        int i2 = this.zb;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.zb * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.zb; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eZb = zb(i2);
            if (eZb != this) {
                sb.append(eZb);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    private syc<E, E> zb() {
        if (this.jc == null) {
            this.jc = new syc<E, E>() { // from class: com.bytedance.adsdk.zb.ycx.1
                @Override // com.bytedance.adsdk.zb.syc
                protected int ycx() {
                    return ycx.this.zb;
                }

                @Override // com.bytedance.adsdk.zb.syc
                protected Object ycx(int i2, int i3) {
                    return ycx.this.ycx[i2];
                }

                @Override // com.bytedance.adsdk.zb.syc
                protected int ycx(Object obj) {
                    return ycx.this.ycx(obj);
                }

                @Override // com.bytedance.adsdk.zb.syc
                protected Map<E, E> zb() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.zb.syc
                protected void ycx(int i2) {
                    ycx.this.sya(i2);
                }

                @Override // com.bytedance.adsdk.zb.syc
                protected void sya() {
                    ycx.this.clear();
                }
            };
        }
        return this.jc;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return zb().dj().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        ycx(this.zb + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.zb - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.ycx[i2])) {
                sya(i2);
                z = true;
            }
        }
        return z;
    }
}
