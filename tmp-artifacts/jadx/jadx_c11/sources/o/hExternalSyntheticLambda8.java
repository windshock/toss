package o;

import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class hExternalSyntheticLambda8 {
    public /* synthetic */ hExternalSyntheticLambda8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onExtraCallback extends hExternalSyntheticLambda8 {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final ReactBundle onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 35;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i5 = i2 + 103;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (obj instanceof onExtraCallback) {
                if (Intrinsics.areEqual(this.onNavigationEvent, ((onExtraCallback) obj).onNavigationEvent)) {
                    return true;
                }
                int i7 = onWarmupCompleted + 13;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = i4 + 121;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i4 + 113;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 7 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(bundle=" + this.onNavigationEvent + ")";
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull ReactBundle reactBundle) {
            super(null);
            Intrinsics.checkNotNullParameter(reactBundle, "");
            this.onNavigationEvent = reactBundle;
        }

        public final ReactBundle onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ReactBundle reactBundle = this.onNavigationEvent;
            int i5 = i2 + 7;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return reactBundle;
            }
            throw null;
        }
    }

    private hExternalSyntheticLambda8() {
    }

    public static final class IAuthTabCallback extends hExternalSyntheticLambda8 {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final Throwable onNavigationEvent;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r5 instanceof o.hExternalSyntheticLambda8.IAuthTabCallback) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4.onNavigationEvent, ((o.hExternalSyntheticLambda8.IAuthTabCallback) r5).onNavigationEvent) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        
            r5 = o.hExternalSyntheticLambda8.IAuthTabCallback.onWarmupCompleted + 33;
            o.hExternalSyntheticLambda8.IAuthTabCallback.IAuthTabCallback = r5 % 128;
            r5 = r5 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r4 == r5) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r4 == r5) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 97 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = onWarmupCompleted + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(throwable=" + this.onNavigationEvent + ")";
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 48 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onNavigationEvent = th;
        }

        public final Throwable onExtraCallback() {
            Throwable th;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                th = this.onNavigationEvent;
                int i4 = 55 / 0;
            } else {
                th = this.onNavigationEvent;
            }
            int i5 = i3 + 11;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return th;
            }
            throw null;
        }
    }
}
