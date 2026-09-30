package o;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.uikit.widget.tooltip.BlankHighlightV3;
import im.toss.uikit.widget.tooltip.CircleHighlightV3;
import im.toss.uikit.widget.tooltip.RectHighlightV3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getInstallerPackageName {
    public /* synthetic */ getInstallerPackageName(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract <T extends generateAppWithState> T onWarmupCompleted(@NotNull Context context, @Nullable AttributeSet attributeSet, int i);

    private getInstallerPackageName() {
    }

    public static final class onExtraCallback extends getInstallerPackageName {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        static {
            int i = onExtraCallbackWithResult + 65;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 61;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i4 = IAuthTabCallback + 23;
                onNavigationEvent = i4 % 128;
                return i4 % 2 == 0;
            }
            int i5 = IAuthTabCallback + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return -1228548900;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 79;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return "Rect";
        }

        private onExtraCallback() {
            super(null);
        }

        @Override // o.getInstallerPackageName
        public <T extends generateAppWithState> T onWarmupCompleted(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            RectHighlightV3 rectHighlightV3 = new RectHighlightV3(context, attributeSet, i);
            int i3 = onNavigationEvent + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return rectHighlightV3;
        }
    }

    public static final class IAuthTabCallback extends getInstallerPackageName {
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 15;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj || (obj instanceof IAuthTabCallback)) {
                return true;
            }
            int i4 = i3 + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return 55204296;
            }
            int i3 = 6 / 0;
            return 55204296;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 79;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 33 / 0;
            }
            int i5 = i2 + 97;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return "Circle";
        }

        private IAuthTabCallback() {
            super(null);
        }

        @Override // o.getInstallerPackageName
        public <T extends generateAppWithState> T onWarmupCompleted(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            CircleHighlightV3 circleHighlightV3 = new CircleHighlightV3(context, attributeSet, i);
            int i3 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return circleHighlightV3;
        }
    }

    public static final class onExtraCallbackWithResult extends getInstallerPackageName {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        static {
            int i = onExtraCallbackWithResult + 29;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this != obj) {
                return obj instanceof onExtraCallbackWithResult;
            }
            int i4 = i3 + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return 555119964;
            }
            int i3 = 0 / 0;
            return 555119964;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return "Blank";
        }

        private onExtraCallbackWithResult() {
            super(null);
        }

        @Override // o.getInstallerPackageName
        public <T extends generateAppWithState> T onWarmupCompleted(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            BlankHighlightV3 blankHighlightV3 = new BlankHighlightV3(context, attributeSet, i);
            int i3 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return blankHighlightV3;
            }
            throw null;
        }
    }
}
