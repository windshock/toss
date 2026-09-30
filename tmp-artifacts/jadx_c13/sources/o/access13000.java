package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access13000 implements Comparable<access13000> {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private final long IAuthTabCallback;

    public static boolean IAuthTabCallback(long j, Object obj) {
        return (obj instanceof access13000) && j == ((access13000) obj).onExtraCallback();
    }

    public static long onExtraCallback(long j) {
        return j;
    }

    public static final boolean onExtraCallbackWithResult(long j, long j2) {
        return j == j2;
    }

    public static final /* synthetic */ access13000 onNavigationEvent(long j) {
        return new access13000(j);
    }

    public static int onWarmupCompleted(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return IAuthTabCallback(this.IAuthTabCallback, obj);
    }

    public int hashCode() {
        return onWarmupCompleted(this.IAuthTabCallback);
    }

    public final /* synthetic */ long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(access13000 access13000Var) {
        return access6100.onNavigationEvent(onExtraCallback(), access13000Var.onExtraCallback());
    }

    private /* synthetic */ access13000(long j) {
        this.IAuthTabCallback = j;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static String onExtraCallbackWithResult(long j) {
        return access6100.onExtraCallbackWithResult(j, 10);
    }

    public String toString() {
        return onExtraCallbackWithResult(this.IAuthTabCallback);
    }
}
