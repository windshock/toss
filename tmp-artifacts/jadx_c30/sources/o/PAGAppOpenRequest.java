package o;

import java.util.Comparator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGAppOpenRequest {
    private int IAuthTabCallback = 0;

    public PAGAppOpenRequest onWarmupCompleted(Object obj, Object obj2) {
        return onNavigationEvent(obj, obj2, null);
    }

    public PAGAppOpenRequest onNavigationEvent(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.IAuthTabCallback == 0 && obj != obj2) {
            if (obj == null) {
                this.IAuthTabCallback = -1;
                return this;
            }
            if (obj2 == null) {
                this.IAuthTabCallback = 1;
                return this;
            }
            if (obj.getClass().isArray()) {
                onExtraCallback(obj, obj2, comparator);
                return this;
            }
            if (comparator == null) {
                this.IAuthTabCallback = ((Comparable) obj).compareTo(obj2);
                return this;
            }
            this.IAuthTabCallback = comparator.compare(obj, obj2);
        }
        return this;
    }

    private void onExtraCallback(Object obj, Object obj2, Comparator<?> comparator) {
        if (obj instanceof long[]) {
            onNavigationEvent((long[]) obj, (long[]) obj2);
            return;
        }
        if (obj instanceof int[]) {
            onWarmupCompleted((int[]) obj, (int[]) obj2);
            return;
        }
        if (obj instanceof short[]) {
            onNavigationEvent((short[]) obj, (short[]) obj2);
            return;
        }
        if (obj instanceof char[]) {
            onExtraCallbackWithResult((char[]) obj, (char[]) obj2);
            return;
        }
        if (obj instanceof byte[]) {
            onExtraCallbackWithResult((byte[]) obj, (byte[]) obj2);
            return;
        }
        if (obj instanceof double[]) {
            onExtraCallback((double[]) obj, (double[]) obj2);
            return;
        }
        if (obj instanceof float[]) {
            onExtraCallbackWithResult((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            onWarmupCompleted((boolean[]) obj, (boolean[]) obj2);
        } else {
            onExtraCallback((Object[]) obj, (Object[]) obj2, comparator);
        }
    }

    public PAGAppOpenRequest onWarmupCompleted(long j, long j2) {
        if (this.IAuthTabCallback != 0) {
            return this;
        }
        this.IAuthTabCallback = Long.compare(j, j2);
        return this;
    }

    public PAGAppOpenRequest onExtraCallback(int i, int i2) {
        if (this.IAuthTabCallback != 0) {
            return this;
        }
        this.IAuthTabCallback = Integer.compare(i, i2);
        return this;
    }

    public PAGAppOpenRequest onWarmupCompleted(short s, short s2) {
        if (this.IAuthTabCallback != 0) {
            return this;
        }
        this.IAuthTabCallback = Short.compare(s, s2);
        return this;
    }

    public PAGAppOpenRequest onExtraCallback(char c, char c2) {
        if (this.IAuthTabCallback != 0) {
            return this;
        }
        this.IAuthTabCallback = Character.compare(c, c2);
        return this;
    }

    public PAGAppOpenRequest onExtraCallbackWithResult(byte b, byte b2) {
        if (this.IAuthTabCallback != 0) {
            return this;
        }
        this.IAuthTabCallback = Byte.compare(b, b2);
        return this;
    }

    public PAGAppOpenRequest IAuthTabCallback(double d, double d2) {
        if (this.IAuthTabCallback != 0) {
            return this;
        }
        this.IAuthTabCallback = Double.compare(d, d2);
        return this;
    }

    public PAGAppOpenRequest onWarmupCompleted(float f, float f2) {
        if (this.IAuthTabCallback != 0) {
            return this;
        }
        this.IAuthTabCallback = Float.compare(f, f2);
        return this;
    }

    public PAGAppOpenRequest onNavigationEvent(boolean z, boolean z2) {
        if (this.IAuthTabCallback == 0 && z != z2) {
            if (z) {
                this.IAuthTabCallback = 1;
                return this;
            }
            this.IAuthTabCallback = -1;
        }
        return this;
    }

    public PAGAppOpenRequest onExtraCallback(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.IAuthTabCallback == 0 && objArr != objArr2) {
            if (objArr == null) {
                this.IAuthTabCallback = -1;
                return this;
            }
            if (objArr2 == null) {
                this.IAuthTabCallback = 1;
                return this;
            }
            if (objArr.length != objArr2.length) {
                this.IAuthTabCallback = objArr.length >= objArr2.length ? 1 : -1;
                return this;
            }
            for (int i = 0; i < objArr.length && this.IAuthTabCallback == 0; i++) {
                onNavigationEvent(objArr[i], objArr2[i], comparator);
            }
        }
        return this;
    }

    public PAGAppOpenRequest onNavigationEvent(long[] jArr, long[] jArr2) {
        if (this.IAuthTabCallback == 0 && jArr != jArr2) {
            if (jArr == null) {
                this.IAuthTabCallback = -1;
                return this;
            }
            if (jArr2 == null) {
                this.IAuthTabCallback = 1;
                return this;
            }
            if (jArr.length != jArr2.length) {
                this.IAuthTabCallback = jArr.length >= jArr2.length ? 1 : -1;
                return this;
            }
            for (int i = 0; i < jArr.length && this.IAuthTabCallback == 0; i++) {
                onWarmupCompleted(jArr[i], jArr2[i]);
            }
        }
        return this;
    }

    public PAGAppOpenRequest onWarmupCompleted(int[] iArr, int[] iArr2) {
        if (this.IAuthTabCallback == 0 && iArr != iArr2) {
            if (iArr == null) {
                this.IAuthTabCallback = -1;
                return this;
            }
            if (iArr2 == null) {
                this.IAuthTabCallback = 1;
                return this;
            }
            if (iArr.length != iArr2.length) {
                this.IAuthTabCallback = iArr.length >= iArr2.length ? 1 : -1;
                return this;
            }
            for (int i = 0; i < iArr.length && this.IAuthTabCallback == 0; i++) {
                onExtraCallback(iArr[i], iArr2[i]);
            }
        }
        return this;
    }

    public PAGAppOpenRequest onNavigationEvent(short[] sArr, short[] sArr2) {
        if (this.IAuthTabCallback == 0 && sArr != sArr2) {
            if (sArr == null) {
                this.IAuthTabCallback = -1;
                return this;
            }
            if (sArr2 == null) {
                this.IAuthTabCallback = 1;
                return this;
            }
            if (sArr.length != sArr2.length) {
                this.IAuthTabCallback = sArr.length >= sArr2.length ? 1 : -1;
                return this;
            }
            for (int i = 0; i < sArr.length && this.IAuthTabCallback == 0; i++) {
                onWarmupCompleted(sArr[i], sArr2[i]);
            }
        }
        return this;
    }

    public PAGAppOpenRequest onExtraCallbackWithResult(char[] cArr, char[] cArr2) {
        if (this.IAuthTabCallback == 0 && cArr != cArr2) {
            if (cArr == null) {
                this.IAuthTabCallback = -1;
                return this;
            }
            if (cArr2 == null) {
                this.IAuthTabCallback = 1;
                return this;
            }
            if (cArr.length != cArr2.length) {
                this.IAuthTabCallback = cArr.length >= cArr2.length ? 1 : -1;
                return this;
            }
            for (int i = 0; i < cArr.length && this.IAuthTabCallback == 0; i++) {
                onExtraCallback(cArr[i], cArr2[i]);
            }
        }
        return this;
    }

    public PAGAppOpenRequest onExtraCallbackWithResult(byte[] bArr, byte[] bArr2) {
        if (this.IAuthTabCallback == 0 && bArr != bArr2) {
            if (bArr == null) {
                this.IAuthTabCallback = -1;
                return this;
            }
            if (bArr2 == null) {
                this.IAuthTabCallback = 1;
                return this;
            }
            if (bArr.length != bArr2.length) {
                this.IAuthTabCallback = bArr.length >= bArr2.length ? 1 : -1;
                return this;
            }
            for (int i = 0; i < bArr.length && this.IAuthTabCallback == 0; i++) {
                onExtraCallbackWithResult(bArr[i], bArr2[i]);
            }
        }
        return this;
    }

    public PAGAppOpenRequest onExtraCallback(double[] dArr, double[] dArr2) {
        if (this.IAuthTabCallback == 0 && dArr != dArr2) {
            if (dArr == null) {
                this.IAuthTabCallback = -1;
                return this;
            }
            if (dArr2 == null) {
                this.IAuthTabCallback = 1;
                return this;
            }
            if (dArr.length != dArr2.length) {
                this.IAuthTabCallback = dArr.length >= dArr2.length ? 1 : -1;
                return this;
            }
            for (int i = 0; i < dArr.length && this.IAuthTabCallback == 0; i++) {
                IAuthTabCallback(dArr[i], dArr2[i]);
            }
        }
        return this;
    }

    public PAGAppOpenRequest onExtraCallbackWithResult(float[] fArr, float[] fArr2) {
        if (this.IAuthTabCallback == 0 && fArr != fArr2) {
            if (fArr == null) {
                this.IAuthTabCallback = -1;
                return this;
            }
            if (fArr2 == null) {
                this.IAuthTabCallback = 1;
                return this;
            }
            if (fArr.length != fArr2.length) {
                this.IAuthTabCallback = fArr.length >= fArr2.length ? 1 : -1;
                return this;
            }
            for (int i = 0; i < fArr.length && this.IAuthTabCallback == 0; i++) {
                onWarmupCompleted(fArr[i], fArr2[i]);
            }
        }
        return this;
    }

    public PAGAppOpenRequest onWarmupCompleted(boolean[] zArr, boolean[] zArr2) {
        if (this.IAuthTabCallback == 0 && zArr != zArr2) {
            if (zArr == null) {
                this.IAuthTabCallback = -1;
                return this;
            }
            if (zArr2 == null) {
                this.IAuthTabCallback = 1;
                return this;
            }
            if (zArr.length != zArr2.length) {
                this.IAuthTabCallback = zArr.length >= zArr2.length ? 1 : -1;
                return this;
            }
            for (int i = 0; i < zArr.length && this.IAuthTabCallback == 0; i++) {
                onNavigationEvent(zArr[i], zArr2[i]);
            }
        }
        return this;
    }

    public int onWarmupCompleted() {
        return this.IAuthTabCallback;
    }
}
