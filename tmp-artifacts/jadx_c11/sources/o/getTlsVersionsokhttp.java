package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setCipherSuitesokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class getTlsVersionsokhttp implements setCipherSuitesokhttp {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 61;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final getTlsVersionsokhttp onExtraCallbackWithResult(@NotNull setCipherSuitesokhttp.onExtraCallback onextracallback, @NotNull setCipherSuitesokhttp.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            setTlsVersionsokhttp settlsversionsokhttp = new setTlsVersionsokhttp(onextracallback, onextracallbackwithresult);
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return settlsversionsokhttp;
            }
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            int i3 = onWarmupCompleted + 1;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            cls = obj.getClass();
            int i5 = IAuthTabCallback + 51;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            int i7 = IAuthTabCallback + 69;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        if (IAuthTabCallback() != ((getTlsVersionsokhttp) obj).IAuthTabCallback()) {
            return false;
        }
        int i9 = IAuthTabCallback + 109;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(IAuthTabCallback());
        int i4 = IAuthTabCallback + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
