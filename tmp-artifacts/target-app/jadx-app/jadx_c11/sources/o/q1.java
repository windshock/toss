package o;

import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class q1 extends SupportedOutputSizesSorterLegacy<setListAdapter> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI IAuthTabCallback;
    private final qa onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            int i2 = onNavigationEvent + 115;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        q1 q1Var = (q1) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, q1Var.IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, q1Var.onWarmupCompleted)) {
            return false;
        }
        int i3 = onNavigationEvent + 39;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.IAuthTabCallback.hashCode() << 50) * this.onWarmupCompleted.hashCode() : (this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode();
        int i3 = onNavigationEvent + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PerformanceTrackElement(tracker=" + this.IAuthTabCallback + ", stamper=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public q1(@NotNull r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, @NotNull qa qaVar) {
        Intrinsics.checkNotNullParameter(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, "");
        Intrinsics.checkNotNullParameter(qaVar, "");
        this.IAuthTabCallback = r8lambdavvxsp2uzrjb9nt4ewemuyygvi;
        this.onWarmupCompleted = qaVar;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setListAdapter setlistadapterOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onExtraCallback + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return setlistadapterOnExtraCallbackWithResult;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback((setListAdapter) onwarmupcompleted);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public setListAdapter onExtraCallbackWithResult() {
        int i = 2 % 2;
        setListAdapter setlistadapter = new setListAdapter(this.onWarmupCompleted);
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return setlistadapter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@NotNull setListAdapter setlistadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setlistadapter, "");
        setlistadapter.onWarmupCompleted(this.onWarmupCompleted);
        int i4 = onExtraCallback + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
