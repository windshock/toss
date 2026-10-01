package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UByte implements Comparable<UByte> {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private final byte onExtraCallbackWithResult;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m33boximpl(byte b) {
        return new UByte(b);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m34constructorimpl(byte b) {
        return b;
    }

    public static int onNavigationEvent(byte b) {
        return Byte.hashCode(b);
    }

    public static boolean onNavigationEvent(byte b, Object obj) {
        return (obj instanceof UByte) && b == ((UByte) obj).onWarmupCompleted();
    }

    public boolean equals(Object obj) {
        return onNavigationEvent(this.onExtraCallbackWithResult, obj);
    }

    public int hashCode() {
        return onNavigationEvent(this.onExtraCallbackWithResult);
    }

    public final /* synthetic */ byte onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(onWarmupCompleted() & 255, uByte.onWarmupCompleted() & 255);
    }

    private /* synthetic */ UByte(byte b) {
        this.onExtraCallbackWithResult = b;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public static String IAuthTabCallback(byte b) {
        return String.valueOf(b & 255);
    }

    public String toString() {
        return IAuthTabCallback(this.onExtraCallbackWithResult);
    }
}
