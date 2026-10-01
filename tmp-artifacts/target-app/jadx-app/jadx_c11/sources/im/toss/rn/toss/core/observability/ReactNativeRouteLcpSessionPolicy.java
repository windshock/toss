package im.toss.rn.toss.core.observability;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactNativeRouteLcpSessionPolicy {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Set<String> onExtraCallback = new LinkedHashSet();
    private boolean onExtraCallbackWithResult;

    static {
        int i = onWarmupCompleted + 19;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public interface Decision {

        public static final class Start implements Decision {
            public static final Start IAuthTabCallback = new Start();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 117;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 115;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Start)) {
                    return false;
                }
                int i4 = i3 + 89;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 45;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i4 = i2 + 73;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return -1447291894;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 87;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return "Start";
                }
                int i3 = 53 / 0;
                return "Start";
            }

            private Start() {
            }
        }

        public static final class Skip implements Decision {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            private final String IAuthTabCallback;

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
            
                if ((r6 instanceof im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionPolicy.Decision.Skip) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, ((im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionPolicy.Decision.Skip) r6).IAuthTabCallback) != false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
            
                r6 = im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionPolicy.Decision.Skip.onWarmupCompleted + 21;
                im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionPolicy.Decision.Skip.onExtraCallbackWithResult = r6 % 128;
                r6 = r6 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r1 = r1 + 29;
                im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionPolicy.Decision.Skip.onExtraCallbackWithResult = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 57;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 93 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    this.IAuthTabCallback.hashCode();
                    obj.hashCode();
                    throw null;
                }
                int iHashCode = this.IAuthTabCallback.hashCode();
                int i3 = onExtraCallbackWithResult + 93;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return iHashCode;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Skip(reason=" + this.IAuthTabCallback + ")";
                int i2 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public Skip(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.IAuthTabCallback = str;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.IAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public final Decision onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = IAuthTabCallbackStub + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                int i4 = IAuthTabCallbackStub + 27;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (!this.onExtraCallback.add(str)) {
                    return new Decision.Skip("seen-route");
                }
                if (!this.onExtraCallbackWithResult) {
                    this.onExtraCallbackWithResult = true;
                    return new Decision.Skip("initial-route");
                }
                Decision.Start start = Decision.Start.IAuthTabCallback;
                int i6 = IAuthTabCallbackStub + 47;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return start;
            }
        }
        return new Decision.Skip("missing-route-key");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
