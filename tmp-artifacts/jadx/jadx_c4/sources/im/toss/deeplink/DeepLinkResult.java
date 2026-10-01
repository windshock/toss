package im.toss.deeplink;

import android.content.Intent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class DeepLinkResult {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final boolean isSuccessful;

    public /* synthetic */ DeepLinkResult(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public abstract String getUriString();

    public abstract String getUriTemplate();

    private DeepLinkResult(boolean z) {
        this.isSuccessful = z;
    }

    public final boolean isSuccessful() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isSuccessful;
        int i5 = i2 + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return z;
    }

    public static final class Intercepted extends DeepLinkResult {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final String uriString;
        private final String uriTemplate;

        public static /* synthetic */ Intercepted copy$default(Intercepted intercepted, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 21;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
                int i5 = i4 + 25;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    String str3 = intercepted.uriString;
                    throw null;
                }
                str = intercepted.uriString;
            }
            if ((i & 2) != 0) {
                str2 = intercepted.uriTemplate;
            }
            Intercepted interceptedCopy = intercepted.copy(str, str2);
            int i6 = IAuthTabCallback + 61;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return interceptedCopy;
            }
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.uriString;
            int i4 = i2 + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.uriTemplate;
            int i5 = i3 + 125;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Intercepted copy(@Nullable String str, @Nullable String str2) {
            int i = 2 % 2;
            Intercepted intercepted = new Intercepted(str, str2);
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return intercepted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Intercepted)) {
                int i2 = onWarmupCompleted + 27;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            Intercepted intercepted = (Intercepted) obj;
            if (!Intrinsics.areEqual(this.uriString, intercepted.uriString)) {
                int i4 = onWarmupCompleted + 43;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual(this.uriTemplate, intercepted.uriTemplate)) {
                return true;
            }
            int i5 = IAuthTabCallback;
            int i6 = i5 + 41;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 11;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.uriString;
            int iHashCode2 = 0;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i2 = onWarmupCompleted + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
            }
            String str2 = this.uriTemplate;
            if (str2 != null) {
                int i4 = IAuthTabCallback + 87;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = str2.hashCode();
            }
            return (iHashCode * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Intercepted(uriString=" + this.uriString + ", uriTemplate=" + this.uriTemplate + ")";
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public Intercepted(@Nullable String str, @Nullable String str2) {
            super(true, null);
            this.uriString = str;
            this.uriTemplate = str2;
        }

        @Override // im.toss.deeplink.DeepLinkResult
        public String getUriString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.uriString;
            int i5 = i3 + 95;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 53 / 0;
            }
            return str;
        }

        @Override // im.toss.deeplink.DeepLinkResult
        public String getUriTemplate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.uriTemplate;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class Found extends DeepLinkResult {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final Class<?> activityClass;
        private final Intent intent;
        private final String uriString;
        private final String uriTemplate;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Found copy$default(Found found, String str, String str2, Class cls, Intent intent, int i, Object obj) {
            int i2 = 2 % 2;
            Object obj2 = null;
            if ((i & 1) != 0) {
                int i3 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    String str3 = found.uriString;
                    obj2.hashCode();
                    throw null;
                }
                str = found.uriString;
            }
            if ((i & 2) != 0) {
                int i4 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    String str4 = found.uriTemplate;
                    throw null;
                }
                str2 = found.uriTemplate;
            }
            if ((i & 4) != 0) {
                cls = found.activityClass;
            }
            if ((i & 8) != 0) {
                intent = found.intent;
            }
            return found.copy(str, str2, cls, intent);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.uriString;
            int i5 = i3 + 87;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = this.uriTemplate;
            if (i3 != 0) {
                int i4 = 35 / 0;
            }
            return str;
        }

        public final Class<?> component3() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Class<?> cls = this.activityClass;
            int i4 = i3 + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 70 / 0;
            }
            return cls;
        }

        public final Intent component4() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Intent intent = this.intent;
            int i4 = i3 + 117;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return intent;
            }
            throw null;
        }

        public final Found copy(@Nullable String str, @Nullable String str2, @NotNull Class<?> cls, @Nullable Intent intent) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(cls, "");
            Found found = new Found(str, str2, cls, intent);
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return found;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Found)) {
                int i2 = onExtraCallbackWithResult + 61;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 71;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            Found found = (Found) obj;
            if (!Intrinsics.areEqual(this.uriString, found.uriString)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.uriTemplate, found.uriTemplate)) {
                int i7 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.activityClass, found.activityClass))) {
                return Intrinsics.areEqual(this.intent, found.intent);
            }
            int i9 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i9 % 128;
            return i9 % 2 == 0;
        }

        public int hashCode() {
            String str;
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 41;
            onExtraCallbackWithResult = i3 % 128;
            int iHashCode2 = 1;
            if (i3 % 2 == 0 ? (str = this.uriString) != null : (str = this.uriString) != null) {
                iHashCode = str.hashCode();
            } else {
                int i4 = i2 + 29;
                onExtraCallbackWithResult = i4 % 128;
                iHashCode = i4 % 2 != 0 ? 1 : 0;
            }
            String str2 = this.uriTemplate;
            if (str2 == null) {
                int i5 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    iHashCode2 = 0;
                }
            } else {
                iHashCode2 = str2.hashCode();
            }
            int iHashCode3 = this.activityClass.hashCode();
            Intent intent = this.intent;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (intent != null ? intent.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Found(uriString=" + this.uriString + ", uriTemplate=" + this.uriTemplate + ", activityClass=" + this.activityClass + ", intent=" + this.intent + ")";
            int i2 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Found(@Nullable String str, @Nullable String str2, @NotNull Class<?> cls, @Nullable Intent intent) {
            super(true, null);
            Intrinsics.checkNotNullParameter(cls, "");
            this.uriString = str;
            this.uriTemplate = str2;
            this.activityClass = cls;
            this.intent = intent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Found(String str, String str2, Class cls, Intent intent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 8) != 0) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 13;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                intent = null;
            }
            this(str, str2, cls, intent);
        }

        @Override // im.toss.deeplink.DeepLinkResult
        public String getUriString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.uriString;
            int i4 = i3 + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // im.toss.deeplink.DeepLinkResult
        public String getUriTemplate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.uriTemplate;
            int i5 = i3 + 87;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final Class<?> getActivityClass() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Class<?> cls = this.activityClass;
            int i5 = i3 + 19;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return cls;
            }
            throw null;
        }

        public final Intent getIntent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Intent intent = this.intent;
            int i5 = i3 + 1;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return intent;
        }
    }

    public static final class InvalidRegion extends DeepLinkResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final List<String> deepLinkRegions;
        private final String uriString;
        private final String uriTemplate;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InvalidRegion copy$default(InvalidRegion invalidRegion, String str, String str2, List list, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 89;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                str = invalidRegion.uriString;
            }
            if ((i & 2) != 0) {
                int i8 = i3 + 87;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                str2 = invalidRegion.uriTemplate;
            }
            if ((i & 4) != 0) {
                list = invalidRegion.deepLinkRegions;
            }
            InvalidRegion invalidRegionCopy = invalidRegion.copy(str, str2, list);
            int i10 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return invalidRegionCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.uriString;
            }
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.uriTemplate;
            if (i3 != 0) {
                int i4 = 49 / 0;
            }
            return str;
        }

        public final List<String> component3() {
            List<String> list;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                list = this.deepLinkRegions;
                int i4 = 80 / 0;
            } else {
                list = this.deepLinkRegions;
            }
            int i5 = i3 + 109;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final InvalidRegion copy(@Nullable String str, @Nullable String str2, @Nullable List<String> list) {
            int i = 2 % 2;
            InvalidRegion invalidRegion = new InvalidRegion(str, str2, list);
            int i2 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 28 / 0;
            }
            return invalidRegion;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof im.toss.deeplink.DeepLinkResult.InvalidRegion) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        
            r6 = (im.toss.deeplink.DeepLinkResult.InvalidRegion) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.uriString, r6.uriString) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        
            r6 = im.toss.deeplink.DeepLinkResult.InvalidRegion.onWarmupCompleted + 83;
            r1 = r6 % 128;
            im.toss.deeplink.DeepLinkResult.InvalidRegion.onExtraCallbackWithResult = r1;
            r6 = r6 % 2;
            r1 = r1 + 67;
            im.toss.deeplink.DeepLinkResult.InvalidRegion.onWarmupCompleted = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if ((r1 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            r6 = 15 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.uriTemplate, r6.uriTemplate)) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.deepLinkRegions, r6.deepLinkRegions) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        
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
            int i2 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 31 / 0;
            }
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.uriString;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.uriTemplate;
            if (str2 == null) {
                int i4 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i4 % 128;
                iHashCode = (i4 % 2 != 0 ? 0 : 1) ^ 1;
            } else {
                iHashCode = str2.hashCode();
            }
            List<String> list = this.deepLinkRegions;
            if (list != null) {
                int i5 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                iHashCode2 = list.hashCode();
            } else {
                iHashCode2 = 0;
            }
            int i7 = (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
            int i8 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 29 / 0;
            }
            return i7;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "InvalidRegion(uriString=" + this.uriString + ", uriTemplate=" + this.uriTemplate + ", deepLinkRegions=" + this.deepLinkRegions + ")";
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public InvalidRegion(@Nullable String str, @Nullable String str2, @Nullable List<String> list) {
            super(false, null);
            this.uriString = str;
            this.uriTemplate = str2;
            this.deepLinkRegions = list;
        }

        @Override // im.toss.deeplink.DeepLinkResult
        public String getUriString() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.uriString;
                int i4 = 15 / 0;
            } else {
                str = this.uriString;
            }
            int i5 = i2 + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.deeplink.DeepLinkResult
        public String getUriTemplate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.uriTemplate;
            if (i3 != 0) {
                int i4 = 24 / 0;
            }
            return str;
        }

        public final List<String> getDeepLinkRegions() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 83;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            List<String> list = this.deepLinkRegions;
            int i5 = i2 + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }
    }

    public static final class NotFound extends DeepLinkResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final String uriString;
        private final String uriTemplate;

        public static /* synthetic */ NotFound copy$default(NotFound notFound, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                str = notFound.uriString;
            }
            if ((i & 2) != 0) {
                int i6 = i3 + 53;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    String str3 = notFound.uriTemplate;
                    throw null;
                }
                str2 = notFound.uriTemplate;
            }
            NotFound notFoundCopy = notFound.copy(str, str2);
            int i7 = onExtraCallback + 5;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return notFoundCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.uriString;
            int i5 = i3 + 13;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.uriTemplate;
            int i5 = i3 + 51;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final NotFound copy(@Nullable String str, @Nullable String str2) {
            int i = 2 % 2;
            NotFound notFound = new NotFound(str, str2);
            int i2 = onExtraCallback + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return notFound;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotFound)) {
                return false;
            }
            NotFound notFound = (NotFound) obj;
            if (!Intrinsics.areEqual(this.uriString, notFound.uriString)) {
                int i4 = IAuthTabCallback + 77;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.uriTemplate, notFound.uriTemplate)) {
                return true;
            }
            int i6 = onExtraCallback + 9;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.uriString;
            int iHashCode2 = 0;
            if (str == null) {
                int i2 = onExtraCallback + 55;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.uriTemplate;
            if (str2 != null) {
                iHashCode2 = str2.hashCode();
                int i4 = onExtraCallback + 85;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            return (iHashCode * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NotFound(uriString=" + this.uriString + ", uriTemplate=" + this.uriTemplate + ")";
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public NotFound(@Nullable String str, @Nullable String str2) {
            super(false, null);
            this.uriString = str;
            this.uriTemplate = str2;
        }

        @Override // im.toss.deeplink.DeepLinkResult
        public String getUriString() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 25;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.uriString;
            int i4 = i2 + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 42 / 0;
            }
            return str;
        }

        @Override // im.toss.deeplink.DeepLinkResult
        public String getUriTemplate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 125;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.uriTemplate;
            int i5 = i2 + 85;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
