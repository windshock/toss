package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access6100;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UInt implements Comparable<UInt> {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private final int onExtraCallback;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m35constructorimpl(int i) {
        return i;
    }

    public static boolean onExtraCallback(int i, Object obj) {
        return (obj instanceof UInt) && i == ((UInt) obj).IAuthTabCallback();
    }

    public static int onExtraCallbackWithResult(int i) {
        return Integer.hashCode(i);
    }

    public static final /* synthetic */ UInt onNavigationEvent(int i) {
        return new UInt(i);
    }

    public final /* synthetic */ int IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public boolean equals(Object obj) {
        return onExtraCallback(this.onExtraCallback, obj);
    }

    public int hashCode() {
        return onExtraCallbackWithResult(this.onExtraCallback);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(UInt uInt) {
        return access6100.onExtraCallback(IAuthTabCallback(), uInt.IAuthTabCallback());
    }

    private /* synthetic */ UInt(int i) {
        this.onExtraCallback = i;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public static String onWarmupCompleted(int i) {
        return String.valueOf(i & 4294967295L);
    }

    public String toString() {
        return onWarmupCompleted(this.onExtraCallback);
    }
}
