package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getRepeatingInterval {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final forJavaName onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 103;
            onWarmupCompleted = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof getRepeatingInterval)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, ((getRepeatingInterval) obj).onNavigationEvent)) {
            return true;
        }
        int i6 = onWarmupCompleted + 15;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        forJavaName forjavaname = this.onNavigationEvent;
        if (i3 != 0) {
            return forjavaname.hashCode();
        }
        forjavaname.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsStaticTonalColor(delegate=" + this.onNavigationEvent + ")";
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getRepeatingInterval(@NotNull forJavaName forjavaname) {
        Intrinsics.checkNotNullParameter(forjavaname, "");
        this.onNavigationEvent = forjavaname;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getRepeatingInterval(@NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, @NotNull withCharset withcharset) {
        this(new forJavaName(getspecialfeatureoptinstatus, withcharset));
        Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
        Intrinsics.checkNotNullParameter(withcharset, "");
    }

    public final Set<setByteOrder> onExtraCallbackWithResult() {
        int i = 2 % 2;
        Set<Integer> setOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setOnExtraCallbackWithResult, 10));
        Iterator<T> it = setOnExtraCallbackWithResult.iterator();
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            arrayList.add(setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback(((Number) it.next()).intValue())));
            int i4 = onWarmupCompleted + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return CollectionsKt.toSet(arrayList);
    }

    public final long IAuthTabCallback(long j, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onNavigationEvent(j), i);
        if (i4 != 0) {
            return ByteOrderedDataOutputStream.onExtraCallback(iOnExtraCallbackWithResult);
        }
        ByteOrderedDataOutputStream.onExtraCallback(iOnExtraCallbackWithResult);
        throw null;
    }
}
