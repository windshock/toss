package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface addFeatureFlag {
    boolean onWarmupCompleted(@NotNull Map<String, String> map);

    public static final class IAuthTabCallback implements addFeatureFlag {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final String onExtraCallback;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i2 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, iAuthTabCallback.onExtraCallback)) {
                int i4 = IAuthTabCallback + 39;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted)) {
                return true;
            }
            int i6 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallback.hashCode();
            return i3 != 0 ? (iHashCode / 75) / this.onWarmupCompleted.hashCode() : (iHashCode * 31) + this.onWarmupCompleted.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Exact(key=" + this.onExtraCallback + ", value=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallback = str;
            this.onWarmupCompleted = str2;
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 28 / 0;
            }
            return str;
        }

        @Override // o.addFeatureFlag
        public boolean onWarmupCompleted(@NotNull Map<String, String> map) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                return Intrinsics.areEqual(map.get(IAuthTabCallback()), this.onWarmupCompleted);
            }
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.areEqual(map.get(IAuthTabCallback()), this.onWarmupCompleted);
            throw null;
        }
    }

    public static final class onExtraCallback implements addFeatureFlag {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final Regex onExtraCallback;
        private final String onNavigationEvent;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        
            if ((r6 instanceof o.addFeatureFlag.onExtraCallback) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        
            r6 = (o.addFeatureFlag.onExtraCallback) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            r6 = o.addFeatureFlag.onExtraCallback.IAuthTabCallback + 15;
            o.addFeatureFlag.onExtraCallback.onWarmupCompleted = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            r6 = o.addFeatureFlag.onExtraCallback.onWarmupCompleted + 21;
            o.addFeatureFlag.onExtraCallback.IAuthTabCallback = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            r1 = r1 + 27;
            o.addFeatureFlag.onExtraCallback.IAuthTabCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            r1 = r1 + 47;
            o.addFeatureFlag.onExtraCallback.IAuthTabCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 7;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.onNavigationEvent.hashCode() << 119) % this.onExtraCallback.hashCode() : (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallback.hashCode();
            int i3 = onWarmupCompleted + 113;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Regex(key=" + this.onNavigationEvent + ", regex=" + this.onExtraCallback + ")";
            int i2 = onWarmupCompleted + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@NotNull String str, @NotNull Regex regex) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(regex, "");
            this.onNavigationEvent = str;
            this.onExtraCallback = regex;
        }

        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onNavigationEvent;
            if (i3 != 0) {
                int i4 = 60 / 0;
            }
            return str;
        }

        @Override // o.addFeatureFlag
        public boolean onWarmupCompleted(@NotNull Map<String, String> map) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            String str = map.get(onWarmupCompleted());
            if (str == null) {
                int i2 = IAuthTabCallback + 21;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.onExtraCallback.onNavigationEvent(str) == null) {
                return false;
            }
            int i4 = onWarmupCompleted + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
    }

    public static final class onNavigationEvent implements addFeatureFlag {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final String IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 83;
            onNavigationEvent = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof onNavigationEvent) {
                return Intrinsics.areEqual(this.IAuthTabCallback, ((onNavigationEvent) obj).IAuthTabCallback);
            }
            int i4 = i2 + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 123;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.IAuthTabCallback.hashCode();
                int i3 = 75 / 0;
            } else {
                iHashCode = this.IAuthTabCallback.hashCode();
            }
            int i4 = onExtraCallback + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Exists(key=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 77;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.addFeatureFlag
        public boolean onWarmupCompleted(@NotNull Map<String, String> map) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            boolean zContainsKey = map.containsKey(onExtraCallbackWithResult());
            int i4 = onExtraCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return zContainsKey;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements addFeatureFlag {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 107;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, ((onWarmupCompleted) obj).onNavigationEvent)) {
                return true;
            }
            int i7 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Absent(key=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
        }

        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.onNavigationEvent;
            int i5 = i3 + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 1 / 0;
            }
            return str;
        }

        @Override // o.addFeatureFlag
        public boolean onWarmupCompleted(@NotNull Map<String, String> map) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
            } else {
                Intrinsics.checkNotNullParameter(map, "");
            }
            boolean z = !map.containsKey(onWarmupCompleted());
            int i3 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
