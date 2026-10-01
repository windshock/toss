package o;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class dateCharacterOffset<T> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private int onExtraCallback;
    private final ArrayList<T> onWarmupCompleted = new ArrayList<>();

    public final ArrayList<T> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ArrayList<T> arrayList = this.onWarmupCompleted;
        int i4 = i2 + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return arrayList;
    }

    public final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.onExtraCallback = i;
        int i6 = i3 + 77;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.onExtraCallback = 0;
        int i5 = i3 + 39;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted(@NotNull Function1<? super T, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<T> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
            int i2 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
