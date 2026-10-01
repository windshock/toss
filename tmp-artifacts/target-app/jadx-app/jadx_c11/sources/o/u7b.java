package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u7b<T> implements u7ExternalSyntheticLambda0<T> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Map<T, Float> onExtraCallback;

    public u7b(@NotNull Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallback = map;
    }

    @Override // o.u7ExternalSyntheticLambda0
    public float onExtraCallbackWithResult(T t) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.get(t);
            throw null;
        }
        Float f = this.onExtraCallback.get(t);
        if (f == null) {
            int i3 = onNavigationEvent + 33;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return Float.NaN;
        }
        int i5 = onNavigationEvent + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return f.floatValue();
        }
        f.floatValue();
        throw null;
    }

    @Override // o.u7ExternalSyntheticLambda0
    public boolean IAuthTabCallback(T t) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Map<T, Float> map = this.onExtraCallback;
        if (i3 == 0) {
            return map.containsKey(t);
        }
        map.containsKey(t);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.u7ExternalSyntheticLambda0
    public T onExtraCallback(float f) {
        T next;
        int i = 2 % 2;
        Iterator<T> it = this.onExtraCallback.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i2 = onWarmupCompleted + 61;
                onNavigationEvent = i2 % 128;
                float fAbs = Math.abs(i2 % 2 == 0 ? f / ((Number) ((Map.Entry) next).getValue()).floatValue() : f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            int i3 = onWarmupCompleted + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        T t = (T) entry.getKey();
        int i5 = onWarmupCompleted + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return t;
    }

    @Override // o.u7ExternalSyntheticLambda0
    public T onExtraCallbackWithResult(float f, boolean z) {
        T next;
        float f2;
        float f3;
        int i = 2 % 2;
        Iterator<T> it = this.onExtraCallback.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (!(!it.hasNext())) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                if (z) {
                    int i2 = onWarmupCompleted + 17;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    f2 = fFloatValue - f;
                } else {
                    f2 = f - fFloatValue;
                }
                if (f2 < 0.0f) {
                    int i4 = onWarmupCompleted + 103;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (z) {
                        f3 = fFloatValue2 - f;
                    } else {
                        f3 = f - fFloatValue2;
                        int i6 = onNavigationEvent + 25;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        int i8 = onNavigationEvent + 23;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return (T) entry.getKey();
        }
        entry.getKey();
        throw null;
    }

    @Override // o.u7ExternalSyntheticLambda0
    public float onWarmupCompleted() {
        int i = 2 % 2;
        Float fMaxOrNull = CollectionsKt.maxOrNull(this.onExtraCallback.values());
        if (fMaxOrNull == null) {
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 33 / 0;
            }
            return Float.NaN;
        }
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return fMaxOrNull.floatValue();
        }
        fMaxOrNull.floatValue();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if ((!(r6 instanceof o.u7b)) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r6 = kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, ((o.u7b) r6).onExtraCallback);
        r1 = o.u7b.onWarmupCompleted + 5;
        o.u7b.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2 = r2 + 41;
        o.u7b.onWarmupCompleted = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if ((r2 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 69;
        o.u7b.onWarmupCompleted = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r2 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            int i4 = 13 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? this.onExtraCallback.hashCode() >>> 54 : this.onExtraCallback.hashCode() * 31;
        int i3 = onNavigationEvent + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MapDraggableAnchors(" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return str;
    }
}
