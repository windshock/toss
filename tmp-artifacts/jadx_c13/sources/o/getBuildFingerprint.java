package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import o.setMemoryMappings;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getBuildFingerprint {
    public static final onNavigationEvent Companion = onNavigationEvent.onWarmupCompleted;

    public interface onExtraCallback extends getBuildFingerprint {
        setMemoryMappings IAuthTabCallback();
    }

    TimeMark onExtraCallbackWithResult();

    public static final class onWarmupCompleted implements onExtraCallback {
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        private onWarmupCompleted() {
        }

        @Override // o.getBuildFingerprint.onExtraCallback
        public /* bridge */ /* synthetic */ setMemoryMappings IAuthTabCallback() {
            return C0031onWarmupCompleted.IAuthTabCallback(onExtraCallback());
        }

        @Override // o.getBuildFingerprint
        public /* synthetic */ TimeMark onExtraCallbackWithResult() {
            return C0031onWarmupCompleted.IAuthTabCallback(onExtraCallback());
        }

        public long onExtraCallback() {
            return getCauses.onNavigationEvent.onNavigationEvent();
        }

        public String toString() {
            return getCauses.onNavigationEvent.toString();
        }

        @JvmInline
        /* renamed from: o.getBuildFingerprint$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0031onWarmupCompleted implements setMemoryMappings {
            private final long IAuthTabCallback;

            public static final /* synthetic */ C0031onWarmupCompleted IAuthTabCallback(long j) {
                return new C0031onWarmupCompleted(j);
            }

            public static String IAuthTabCallbackDefault(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            public static long onExtraCallbackWithResult(long j) {
                return j;
            }

            public static int onNavigationEvent(long j) {
                return Long.hashCode(j);
            }

            public static boolean onWarmupCompleted(long j, Object obj) {
                return (obj instanceof C0031onWarmupCompleted) && j == ((C0031onWarmupCompleted) obj).onExtraCallback();
            }

            public boolean equals(Object obj) {
                return onWarmupCompleted(this.IAuthTabCallback, obj);
            }

            public int hashCode() {
                return onNavigationEvent(this.IAuthTabCallback);
            }

            public final /* synthetic */ long onExtraCallback() {
                return this.IAuthTabCallback;
            }

            public String toString() {
                return IAuthTabCallbackDefault(this.IAuthTabCallback);
            }

            @Override // java.lang.Comparable
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public /* bridge */ int compareTo(@NotNull setMemoryMappings setmemorymappings) {
                return setMemoryMappings.IAuthTabCallback.IAuthTabCallback(this, setmemorymappings);
            }

            private /* synthetic */ C0031onWarmupCompleted(long j) {
                this.IAuthTabCallback = j;
            }

            public static long onExtraCallback(long j) {
                return getCauses.onNavigationEvent.onExtraCallbackWithResult(j);
            }

            @Override // kotlin.time.TimeMark
            public long onNavigationEvent() {
                return onExtraCallback(this.IAuthTabCallback);
            }

            public static long IAuthTabCallback(long j, long j2) {
                return getCauses.onNavigationEvent.onWarmupCompleted(j, j2);
            }

            public static boolean onWarmupCompleted(long j) {
                return !setLogBuffers.writeTypedObject(onExtraCallback(j));
            }

            @Override // o.setMemoryMappings
            public long onNavigationEvent(@NotNull setMemoryMappings setmemorymappings) {
                Intrinsics.checkNotNullParameter(setmemorymappings, "");
                return onExtraCallbackWithResult(this.IAuthTabCallback, setmemorymappings);
            }

            public static long onExtraCallbackWithResult(long j, @NotNull setMemoryMappings setmemorymappings) {
                Intrinsics.checkNotNullParameter(setmemorymappings, "");
                if (!(setmemorymappings instanceof C0031onWarmupCompleted)) {
                    throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) IAuthTabCallbackDefault(j)) + " and " + setmemorymappings);
                }
                return onExtraCallback(j, ((C0031onWarmupCompleted) setmemorymappings).onExtraCallback());
            }

            public static final long onExtraCallback(long j, long j2) {
                return getCauses.onNavigationEvent.onNavigationEvent(j, j2);
            }
        }
    }

    public static final class onNavigationEvent {
        static final /* synthetic */ onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        private onNavigationEvent() {
        }
    }
}
