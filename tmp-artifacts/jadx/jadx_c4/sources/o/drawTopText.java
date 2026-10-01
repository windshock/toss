package o;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface drawTopText {
    public static final onExtraCallback Companion = onExtraCallback.onNavigationEvent;

    IconRoundCornerProgressBar1 IAuthTabCallback();

    ALCCameraOnOutOfMemeoryErrorCallback onExtraCallback();

    List<surfaceChanged> onExtraCallbackWithResult();

    public static final class onExtraCallback implements drawTopText {
        private static int IAuthTabCallback = 1;
        private static int asBinder = 1;
        private static int onExtraCallback;
        private static volatile drawTopText onExtraCallbackWithResult;
        static final /* synthetic */ onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallback + 83;
            asBinder = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ List onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            throw null;
        }

        private onExtraCallback() {
        }

        private static final List onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            List listEmptyList = CollectionsKt.emptyList();
            int i4 = IAuthTabCallback + 109;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return listEmptyList;
            }
            throw null;
        }

        public static final class onExtraCallbackWithResult implements drawTopText {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            private final Lazy onExtraCallback;
            private final Lazy onExtraCallbackWithResult;
            private final Lazy onNavigationEvent;

            onExtraCallbackWithResult(Function0<? extends IconRoundCornerProgressBar1> function0, Function0<? extends ALCCameraOnOutOfMemeoryErrorCallback> function02, Function0<? extends List<? extends surfaceChanged>> function03) {
                this.onExtraCallback = LazyKt.onExtraCallbackWithResult(function0);
                this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(function02);
                this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(function03);
            }

            @Override // o.drawTopText
            public IconRoundCornerProgressBar1 IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 123;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                IconRoundCornerProgressBar1 iconRoundCornerProgressBar1 = (IconRoundCornerProgressBar1) this.onExtraCallback.getValue();
                int i3 = onWarmupCompleted + 125;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 29 / 0;
                }
                return iconRoundCornerProgressBar1;
            }

            @Override // o.drawTopText
            public ALCCameraOnOutOfMemeoryErrorCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 75;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                ALCCameraOnOutOfMemeoryErrorCallback aLCCameraOnOutOfMemeoryErrorCallback = (ALCCameraOnOutOfMemeoryErrorCallback) this.onNavigationEvent.getValue();
                int i4 = onWarmupCompleted + 93;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return aLCCameraOnOutOfMemeoryErrorCallback;
            }

            @Override // o.drawTopText
            public List<surfaceChanged> onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                List<surfaceChanged> list = (List) this.onExtraCallbackWithResult.getValue();
                if (i3 != 0) {
                    int i4 = 91 / 0;
                }
                return list;
            }
        }

        public final void onNavigationEvent(@NotNull Function0<? extends IconRoundCornerProgressBar1> function0, @NotNull Function0<? extends ALCCameraOnOutOfMemeoryErrorCallback> function02, @NotNull Function0<? extends List<? extends surfaceChanged>> function03) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            onExtraCallbackWithResult = new onExtraCallbackWithResult(function0, function02, function03);
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final drawTopText asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            drawTopText drawtoptext = onExtraCallbackWithResult;
            if (drawtoptext == null) {
                throw new IllegalStateException("TossWebKit not initialized. Call TossWebKit.init(...) first.");
            }
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 64 / 0;
            }
            return drawtoptext;
        }

        @Override // o.drawTopText
        public IconRoundCornerProgressBar1 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                asInterface().IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            IconRoundCornerProgressBar1 iconRoundCornerProgressBar1IAuthTabCallback = asInterface().IAuthTabCallback();
            int i3 = onWarmupCompleted + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iconRoundCornerProgressBar1IAuthTabCallback;
        }

        @Override // o.drawTopText
        public ALCCameraOnOutOfMemeoryErrorCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                asInterface().onExtraCallback();
                obj.hashCode();
                throw null;
            }
            ALCCameraOnOutOfMemeoryErrorCallback aLCCameraOnOutOfMemeoryErrorCallbackOnExtraCallback = asInterface().onExtraCallback();
            int i3 = onWarmupCompleted + 35;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return aLCCameraOnOutOfMemeoryErrorCallbackOnExtraCallback;
            }
            throw null;
        }

        @Override // o.drawTopText
        public List<surfaceChanged> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            List<surfaceChanged> listOnExtraCallbackWithResult = asInterface().onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return listOnExtraCallbackWithResult;
        }
    }
}
