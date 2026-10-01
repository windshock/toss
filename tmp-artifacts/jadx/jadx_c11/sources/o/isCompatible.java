package o;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isCompatible implements Iterable<cipherSuites>, KMappedMarker {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private int onExtraCallback;
    private final List<cipherSuites> onExtraCallbackWithResult;

    @Override // java.lang.Iterable
    public Iterator<cipherSuites> iterator() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.iterator();
            obj.hashCode();
            throw null;
        }
        Iterator<cipherSuites> it = this.onExtraCallbackWithResult.iterator();
        int i3 = onWarmupCompleted + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return it;
        }
        throw null;
    }

    public isCompatible(@NotNull List<cipherSuites> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = list;
        onExtraCallback();
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i2 + 67;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public isCompatible(@NotNull Function1<? super List<cipherSuites>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        function1.invoke(listCreateListBuilder);
        this((List<cipherSuites>) CollectionsKt.build(listCreateListBuilder));
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onWarmupCompleted + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        int iOnExtraCallbackWithResult = 0;
        for (cipherSuites ciphersuites : this.onExtraCallbackWithResult) {
            int i6 = onWarmupCompleted + 125;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            ciphersuites.onNavigationEvent(iOnExtraCallbackWithResult);
            iOnExtraCallbackWithResult += ciphersuites.onExtraCallbackWithResult();
            this.onExtraCallback += ciphersuites.onExtraCallbackWithResult();
        }
    }
}
