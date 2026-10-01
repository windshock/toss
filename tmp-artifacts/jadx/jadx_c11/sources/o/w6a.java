package o;

import kotlin.jvm.internal.Intrinsics;
import o.QuirkSettingsLoader;
import o.r8lambda3ItRKs506ZA10acMn5vNx6LxE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w6a {
    public static final w6a IAuthTabCallback = new w6a();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 85;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private w6a() {
    }

    public static final class onNavigationEvent implements r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final QuirkSettingsLoader.onNavigationEvent IAuthTabCallback;
        private final int onExtraCallbackWithResult;
        private final QuirkSettingsLoader.onNavigationEvent onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 107;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 21;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i6 = i2 + 81;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 != 0;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback)) {
                return this.onExtraCallbackWithResult == onnavigationevent.onExtraCallbackWithResult;
            }
            int i7 = onWarmupCompleted + 37;
            onExtraCallback = i7 % 128;
            return i7 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            return i3 == 0 ? (((iHashCode % 52) + this.IAuthTabCallback.hashCode()) >> 104) << Integer.hashCode(this.onExtraCallbackWithResult) : (((iHashCode * 31) + this.IAuthTabCallback.hashCode()) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Horizontal(menuAlignment=" + this.onNavigationEvent + ", anchorAlignment=" + this.IAuthTabCallback + ", offset=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 47 / 0;
            }
            return str;
        }

        public onNavigationEvent(@NotNull QuirkSettingsLoader.onNavigationEvent onnavigationevent, @NotNull QuirkSettingsLoader.onNavigationEvent onnavigationevent2, int i) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(onnavigationevent2, "");
            this.onNavigationEvent = onnavigationevent;
            this.IAuthTabCallback = onnavigationevent2;
            this.onExtraCallbackWithResult = i;
        }

        @Override // o.r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback
        public int IAuthTabCallback(@NotNull ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda1, long j, int i, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
            int i2;
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(extensionsInfoExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
            int iOnExtraCallback = this.IAuthTabCallback.onExtraCallback(0, extensionsInfoExternalSyntheticLambda1.IAuthTabCallbackStub(), extensionsManagerExtensionsAvailability);
            int i6 = -this.onNavigationEvent.onExtraCallback(0, i, extensionsManagerExtensionsAvailability);
            if (extensionsManagerExtensionsAvailability == ExtensionsManagerExtensionsAvailability.Ltr) {
                int i7 = onExtraCallback + 41;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                i2 = this.onExtraCallbackWithResult;
            } else {
                i2 = -this.onExtraCallbackWithResult;
            }
            return extensionsInfoExternalSyntheticLambda1.onWarmupCompleted() + iOnExtraCallback + i6 + i2;
        }
    }

    public static final class onExtraCallback implements r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final QuirkSettingsLoader.onWarmupCompleted IAuthTabCallback;
        private final int onExtraCallbackWithResult;
        private final QuirkSettingsLoader.onWarmupCompleted onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 63;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i7 = i3 + 27;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted)) {
                int i9 = onExtraCallback + 39;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback)) {
                return this.onExtraCallbackWithResult == onextracallback.onExtraCallbackWithResult;
            }
            int i11 = onNavigationEvent + 111;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.onWarmupCompleted.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
            int i4 = onExtraCallback + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Vertical(menuAlignment=" + this.onWarmupCompleted + ", anchorAlignment=" + this.IAuthTabCallback + ", offset=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 93 / 0;
            }
            return str;
        }

        public onExtraCallback(@NotNull QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, @NotNull QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted2, int i) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted2, "");
            this.onWarmupCompleted = onwarmupcompleted;
            this.IAuthTabCallback = onwarmupcompleted2;
            this.onExtraCallbackWithResult = i;
        }

        @Override // o.r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult
        public int onWarmupCompleted(@NotNull ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda1, long j, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(extensionsInfoExternalSyntheticLambda1, "");
            int iOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(0, extensionsInfoExternalSyntheticLambda1.IAuthTabCallback());
            int iAsInterface = extensionsInfoExternalSyntheticLambda1.asInterface() + iOnExtraCallbackWithResult + (-this.onWarmupCompleted.onExtraCallbackWithResult(0, i)) + this.onExtraCallbackWithResult;
            int i5 = onNavigationEvent + 37;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return iAsInterface;
        }
    }
}
