package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPageTitle {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int IAuthTabCallback;
    private final unregisterDataSetObserver onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 119;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof getPageTitle) {
            getPageTitle getpagetitle = (getPageTitle) obj;
            return Intrinsics.areEqual(this.onNavigationEvent, getpagetitle.onNavigationEvent) && this.IAuthTabCallback == getpagetitle.IAuthTabCallback;
        }
        int i7 = i2 + 13;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onNavigationEvent.hashCode() * 31) + Integer.hashCode(this.IAuthTabCallback);
        int i4 = onExtraCallback + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FireAttemptResult(result=" + this.onNavigationEvent + ", attempt=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getPageTitle(@NotNull unregisterDataSetObserver unregisterdatasetobserver, int i) {
        Intrinsics.checkNotNullParameter(unregisterdatasetobserver, "");
        this.onNavigationEvent = unregisterdatasetobserver;
        this.IAuthTabCallback = i;
    }

    public final unregisterDataSetObserver onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        unregisterDataSetObserver unregisterdatasetobserver = this.onNavigationEvent;
        int i4 = i2 + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unregisterdatasetobserver;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
