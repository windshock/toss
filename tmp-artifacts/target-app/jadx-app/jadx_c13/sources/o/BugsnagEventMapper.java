package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class BugsnagEventMapper<T> {
    public /* synthetic */ BugsnagEventMapper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onExtraCallback<T> extends BugsnagEventMapper<T> {
        public onExtraCallback() {
            super(null);
        }
    }

    private BugsnagEventMapper() {
    }

    public static final class onWarmupCompleted<T> extends BugsnagEventMapper<T> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final String onWarmupCompleted;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        
            if ((!(r6 instanceof o.BugsnagEventMapper.onWarmupCompleted)) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        
            r2 = r2 + org.opencv.imgproc.Imgproc.COLOR_YUV2RGB_YVYU;
            o.BugsnagEventMapper.onWarmupCompleted.IAuthTabCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if ((r2 % 2) == 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, ((o.BugsnagEventMapper.onWarmupCompleted) r6).onWarmupCompleted)) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            r6 = o.BugsnagEventMapper.onWarmupCompleted.IAuthTabCallback + 51;
            o.BugsnagEventMapper.onWarmupCompleted.onExtraCallback = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        
            if ((r6 % 2) != 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        
            r6 = 42 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r2 = r2 + 37;
            o.BugsnagEventMapper.onWarmupCompleted.IAuthTabCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                int i4 = 24 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = IAuthTabCallback + 113;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 1 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Closing(code=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 29 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }
    }

    public static final class onExtraCallbackWithResult<T> extends BugsnagEventMapper<T> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final Throwable onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this != obj) {
                return (obj instanceof onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onExtraCallbackWithResult) obj).onExtraCallbackWithResult);
            }
            int i5 = i3 + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 81;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallbackWithResult.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            int i3 = onNavigationEvent + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Failure(throwable=" + this.onExtraCallbackWithResult + ")";
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onExtraCallbackWithResult = th;
        }
    }

    public static final class onNavigationEvent<T> extends BugsnagEventMapper<T> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final parseUnsignedLong<T> IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 87;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 49;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.IAuthTabCallback, ((onNavigationEvent) obj).IAuthTabCallback))) {
                return true;
            }
            int i7 = onWarmupCompleted + 93;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.IAuthTabCallback.hashCode();
            int i4 = onNavigationEvent + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Message(message=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull parseUnsignedLong<T> parseunsignedlong) {
            super(null);
            Intrinsics.checkNotNullParameter(parseunsignedlong, "");
            this.IAuthTabCallback = parseunsignedlong;
        }

        public final parseUnsignedLong<T> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            parseUnsignedLong<T> parseunsignedlong = this.IAuthTabCallback;
            int i5 = i3 + 79;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return parseunsignedlong;
        }
    }
}
