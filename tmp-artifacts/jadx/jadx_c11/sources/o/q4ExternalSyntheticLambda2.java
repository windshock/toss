package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class q4ExternalSyntheticLambda2 {
    public /* synthetic */ q4ExternalSyntheticLambda2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onExtraCallback extends q4ExternalSyntheticLambda2 {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 41;
                onExtraCallbackWithResult = i5 % 128;
                return i5 % 2 == 0;
            }
            if (obj instanceof onExtraCallback) {
                return !(Intrinsics.areEqual(this.onNavigationEvent, ((onExtraCallback) obj).onNavigationEvent) ^ true);
            }
            int i6 = i3 + 83;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i3 + 55;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = onExtraCallbackWithResult + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(data=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks r8lambdan2uusxctu9sq10xffiic0tk0ks) {
            super(null);
            Intrinsics.checkNotNullParameter(r8lambdan2uusxctu9sq10xffiic0tk0ks, "");
            this.onNavigationEvent = r8lambdan2uusxctu9sq10xffiic0tk0ks;
        }

        public final r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks onWarmupCompleted() {
            r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks r8lambdan2uusxctu9sq10xffiic0tk0ks;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                r8lambdan2uusxctu9sq10xffiic0tk0ks = this.onNavigationEvent;
                int i4 = 67 / 0;
            } else {
                r8lambdan2uusxctu9sq10xffiic0tk0ks = this.onNavigationEvent;
            }
            int i5 = i3 + 77;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return r8lambdan2uusxctu9sq10xffiic0tk0ks;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private q4ExternalSyntheticLambda2() {
    }

    public static final class onExtraCallbackWithResult extends q4ExternalSyntheticLambda2 {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final List<IAuthTabCallback> IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 27;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                return Intrinsics.areEqual(this.IAuthTabCallback, ((onExtraCallbackWithResult) obj).IAuthTabCallback);
            }
            int i4 = onExtraCallback + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            List<IAuthTabCallback> list = this.IAuthTabCallback;
            if (i3 == 0) {
                return list.hashCode();
            }
            list.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Failure(violations=" + this.IAuthTabCallback + ")";
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 85 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull List<IAuthTabCallback> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.IAuthTabCallback = list;
        }

        public final List<IAuthTabCallback> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 69;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            List<IAuthTabCallback> list = this.IAuthTabCallback;
            int i5 = i2 + 19;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final String onNavigationEvent;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.q4ExternalSyntheticLambda2.IAuthTabCallback) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 87;
            o.q4ExternalSyntheticLambda2.IAuthTabCallback.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r6 = (o.q4ExternalSyntheticLambda2.IAuthTabCallback) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 49 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.onExtraCallback.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
            int i4 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Violation(code=" + this.onExtraCallback + ", field=" + this.onNavigationEvent + ", message=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.onExtraCallback = str;
            this.onNavigationEvent = str2;
            this.IAuthTabCallback = str3;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 125;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
