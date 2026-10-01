package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getU64 implements Comparable<getU64> {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private final short onExtraCallback;

    public static final /* synthetic */ getU64 onExtraCallback(short s) {
        return new getU64(s);
    }

    public static boolean onExtraCallbackWithResult(short s, Object obj) {
        return (obj instanceof getU64) && s == ((getU64) obj).onExtraCallbackWithResult();
    }

    public static short onNavigationEvent(short s) {
        return s;
    }

    public static int onWarmupCompleted(short s) {
        return Short.hashCode(s);
    }

    public boolean equals(Object obj) {
        return onExtraCallbackWithResult(this.onExtraCallback, obj);
    }

    public int hashCode() {
        return onWarmupCompleted(this.onExtraCallback);
    }

    public final /* synthetic */ short onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(getU64 getu64) {
        return Intrinsics.compare(onExtraCallbackWithResult() & 65535, getu64.onExtraCallbackWithResult() & 65535);
    }

    private /* synthetic */ getU64(short s) {
        this.onExtraCallback = s;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public static String IAuthTabCallback(short s) {
        return String.valueOf(s & 65535);
    }

    public String toString() {
        return IAuthTabCallback(this.onExtraCallback);
    }
}
