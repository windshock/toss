package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class forJavaName {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private final withCharset IAuthTabCallback;
    private final getSpecialFeatureOptInStatus onExtraCallback;
    private final Set<Integer> onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 43;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof forJavaName) {
            forJavaName forjavaname = (forJavaName) obj;
            return this.onExtraCallback == forjavaname.onExtraCallback && this.IAuthTabCallback == forjavaname.IAuthTabCallback;
        }
        int i4 = i2 + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        asInterface = i2 % 128;
        int iHashCode = (i2 % 2 != 0 ? this.onExtraCallback.hashCode() / 118 : this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode();
        int i3 = asInterface + 91;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsStaticTonalColor(theme=" + this.onExtraCallback + ", token=" + this.IAuthTabCallback + ")";
        int i2 = asInterface + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public forJavaName(@NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, @NotNull withCharset withcharset) {
        Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
        Intrinsics.checkNotNullParameter(withcharset, "");
        this.onExtraCallback = getspecialfeatureoptinstatus;
        this.IAuthTabCallback = withcharset;
        Collection<CipherSuiteCompanion> collectionValues = withcharset.getColors().values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((CipherSuiteCompanion) it.next()).onNavigationEvent(this.onExtraCallback)));
            int i = asInterface + 49;
            IAuthTabCallbackDefault = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.onExtraCallbackWithResult = CollectionsKt.toSet(arrayList);
        this.onWarmupCompleted = ((Number) CollectionsKt.first(this.IAuthTabCallback.getColors().keySet())).intValue();
        this.onNavigationEvent = ((Number) CollectionsKt.last(this.IAuthTabCallback.getColors().keySet())).intValue();
        int i4 = asInterface + 103;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final Set<Integer> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Set<Integer> set = this.onExtraCallbackWithResult;
        int i5 = i3 + 115;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    public final Integer onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 49;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.IAuthTabCallback.getColors().get(Integer.valueOf(i));
            obj.hashCode();
            throw null;
        }
        CipherSuiteCompanion cipherSuiteCompanion = this.IAuthTabCallback.getColors().get(Integer.valueOf(i));
        if (cipherSuiteCompanion == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(cipherSuiteCompanion.onNavigationEvent(this.onExtraCallback));
        int i4 = asInterface + 79;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return numValueOf;
    }

    public static /* synthetic */ int onNavigationEvent(forJavaName forjavaname, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = asInterface + 115;
        int i6 = i5 % 128;
        IAuthTabCallbackDefault = i6;
        if (i5 % 2 != 0 ? (i3 & 2) != 0 : (i3 & 5) != 0) {
            int i7 = i6 + 31;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            i2 = 100;
        }
        int iOnExtraCallbackWithResult = forjavaname.onExtraCallbackWithResult(i, i2);
        int i9 = asInterface + 5;
        IAuthTabCallbackDefault = i9 % 128;
        if (i9 % 2 != 0) {
            return iOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[PHI: r2 r3
      0x0058: PHI (r2v12 java.lang.Object) = (r2v11 java.lang.Object), (r2v13 java.lang.Object) binds: [B:11:0x0056, B:8:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r3v4 java.util.Map$Entry) = (r3v3 java.util.Map$Entry), (r3v10 java.util.Map$Entry) binds: [B:11:0x0056, B:8:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onExtraCallbackWithResult(int i, int i2) {
        Object next;
        Integer numOnWarmupCompleted;
        Map.Entry entry;
        int i3 = 2 % 2;
        Iterator<T> it = this.IAuthTabCallback.getColors().entrySet().iterator();
        int i4 = IAuthTabCallbackDefault + 121;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i6 = IAuthTabCallbackDefault + 103;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                next = it.next();
                entry = (Map.Entry) next;
                if (((CipherSuiteCompanion) entry.getValue()).IAuthTabCallback() == i) {
                    break;
                }
            } else {
                next = it.next();
                entry = (Map.Entry) next;
                int i7 = 84 / 0;
                if (((CipherSuiteCompanion) entry.getValue()).IAuthTabCallback() == i) {
                    break;
                }
                if (((CipherSuiteCompanion) entry.getValue()).onExtraCallbackWithResult() == i) {
                    int i8 = asInterface + 83;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                    break;
                }
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null && (numOnWarmupCompleted = onWarmupCompleted(RangesKt.coerceIn(((Number) entry2.getKey()).intValue() + i2, this.onWarmupCompleted, this.onNavigationEvent))) != null) {
            i = numOnWarmupCompleted.intValue();
        }
        int i10 = IAuthTabCallbackDefault + 45;
        asInterface = i10 % 128;
        int i11 = i10 % 2;
        return i;
    }
}
