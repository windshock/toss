package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.maxStaleSeconds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class minFreshSeconds implements noTransform {
    public /* synthetic */ minFreshSeconds(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onWarmupCompleted extends minFreshSeconds {
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        private static int onExtraCallback = 0;
        private static final float onNavigationEvent = 0.0f;
        private static int onTransact = 1;
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();
        private static final onlyIfCached IAuthTabCallback = onlyIfCached.NONE;
        private static final maxStaleSeconds onExtraCallbackWithResult = maxStaleSeconds.onWarmupCompleted.onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asInterface + 69;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                int i4 = asInterface + 87;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = asInterface + 121;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 123;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 67;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 13 / 0;
            }
            return -1125398457;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 77;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 125;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return "None";
            }
            throw null;
        }

        private onWarmupCompleted() {
            super(null);
        }

        @Override // o.noTransform
        public float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 119;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f = onNavigationEvent;
            int i4 = i3 + 21;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        static {
            int i = onExtraCallback + 11;
            onTransact = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // o.noTransform
        public onlyIfCached onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 61;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.noTransform
        public maxStaleSeconds onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface + 19;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            maxStaleSeconds maxstaleseconds = onExtraCallbackWithResult;
            int i5 = i3 + 9;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return maxstaleseconds;
        }
    }

    private minFreshSeconds() {
    }

    public static final class IAuthTabCallback extends minFreshSeconds {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final maxStaleSeconds onExtraCallback;
        private final float onNavigationEvent;
        private final onlyIfCached onWarmupCompleted;

        /* JADX WARN: Illegal instructions before constructor call */
        public IAuthTabCallback() {
            maxStaleSeconds maxstaleseconds = null;
            this(maxstaleseconds, 1, maxstaleseconds);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull maxStaleSeconds maxstaleseconds) {
            super(null);
            Intrinsics.checkNotNullParameter(maxstaleseconds, "");
            this.onExtraCallback = maxstaleseconds;
            this.onNavigationEvent = 0.33f;
            this.onWarmupCompleted = onlyIfCached.WEAK;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(maxStaleSeconds maxstaleseconds, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                maxstaleseconds = maxStaleSeconds.onWarmupCompleted.onExtraCallbackWithResult;
                int i4 = IAuthTabCallback + 71;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this(maxstaleseconds);
        }

        @Override // o.noTransform
        public maxStaleSeconds onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            maxStaleSeconds maxstaleseconds = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 62 / 0;
            }
            return maxstaleseconds;
        }

        @Override // o.noTransform
        public float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onNavigationEvent;
            int i5 = i2 + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        @Override // o.noTransform
        public onlyIfCached onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            onlyIfCached onlyifcached = this.onWarmupCompleted;
            int i4 = i3 + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onlyifcached;
        }
    }
}
