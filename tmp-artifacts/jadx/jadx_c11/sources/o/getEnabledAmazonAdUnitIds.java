package o;

import im.toss.uikit.R;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getEnabledAmazonAdUnitIds {
    public static final onExtraCallback Companion = onExtraCallback.onExtraCallback;

    public static final class onWarmupCompleted implements getEnabledAmazonAdUnitIds {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final int IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i2 = onWarmupCompleted + 81;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.IAuthTabCallback != ((onWarmupCompleted) obj).IAuthTabCallback) {
                return false;
            }
            int i4 = onWarmupCompleted + 105;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.IAuthTabCallback);
            int i4 = onWarmupCompleted + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Local(iconResId=" + this.IAuthTabCallback + ")";
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 55 / 0;
            }
            return str;
        }

        public onWarmupCompleted(int i) {
            this.IAuthTabCallback = i;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 97;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = this.IAuthTabCallback;
            int i5 = i2 + 77;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 11 / 0;
            }
            return i4;
        }
    }

    public static final class IAuthTabCallback implements getEnabledAmazonAdUnitIds {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (!(obj instanceof IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, ((IAuthTabCallback) obj).onWarmupCompleted)) {
                    return false;
                }
                int i2 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 105;
            IAuthTabCallback = i5 % 128;
            boolean z = i5 % 2 != 0;
            int i6 = i4 + 57;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Remote(iconUrl=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }

        public final String onExtraCallbackWithResult() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 107;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.onWarmupCompleted;
                int i4 = 64 / 0;
            } else {
                str = this.onWarmupCompleted;
            }
            int i5 = i2 + 31;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 1;
        private static int onTransact;
        static final /* synthetic */ onExtraCallback onExtraCallback = new onExtraCallback();
        private static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted(R.drawable.icn_success_color);
        private static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted(im.toss.core.R.drawable.icn_attention_color);
        private static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted(im.toss.core.R.drawable.icn_exclamation_circle);
        private static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted(0);

        private onExtraCallback() {
        }

        static {
            int i = onTransact + 105;
            asBinder = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 103;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted onwarmupcompleted = onWarmupCompleted;
            int i5 = i2 + 57;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        public final onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 13;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 69;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
