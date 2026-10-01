package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.QuirkSettingsLoader;
import o.r8lambda3ItRKs506ZA10acMn5vNx6LxE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk {
    public static final r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk IAuthTabCallback = new r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk();
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    static {
        int i = onNavigationEvent + 71;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk() {
    }

    public static final class onExtraCallbackWithResult implements r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final int onExtraCallback;
        private final QuirkSettingsLoader.onNavigationEvent onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i2 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 == 0;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                if (this.onExtraCallback == onextracallbackwithresult.onExtraCallback) {
                    return true;
                }
                int i3 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = onExtraCallbackWithResult;
            int i6 = i5 + 3;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 13;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + Integer.hashCode(this.onExtraCallback);
            int i4 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Horizontal(alignment=" + this.onWarmupCompleted + ", margin=" + this.onExtraCallback + ")";
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 48 / 0;
            }
            return str;
        }

        public onExtraCallbackWithResult(@NotNull QuirkSettingsLoader.onNavigationEvent onnavigationevent, int i) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.onWarmupCompleted = onnavigationevent;
            this.onExtraCallback = i;
        }

        @Override // o.r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback
        public int IAuthTabCallback(@NotNull ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda1, long j, int i, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(extensionsInfoExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
            int i3 = (int) (j >> 32);
            if (i < i3 - (this.onExtraCallback << 1)) {
                int iOnExtraCallback = this.onWarmupCompleted.onExtraCallback(i, i3, extensionsManagerExtensionsAvailability);
                int i4 = this.onExtraCallback;
                return RangesKt.coerceIn(iOnExtraCallback, i4, (i3 - i4) - i);
            }
            int i5 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int iOnExtraCallback2 = QuirkSettingsLoader.Companion.onTransact().onExtraCallback(i, i3, extensionsManagerExtensionsAvailability);
            int i7 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return iOnExtraCallback2;
        }
    }

    public static final class onExtraCallback implements r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final int onExtraCallback;
        private final QuirkSettingsLoader.onWarmupCompleted onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 125;
                onNavigationEvent = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i3 = IAuthTabCallback + 41;
                onNavigationEvent = i3 % 128;
                return i3 % 2 != 0;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted)) {
                return this.onExtraCallback == onextracallback.onExtraCallback;
            }
            int i4 = IAuthTabCallback + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            IAuthTabCallback = i2 % 128;
            int iHashCode = (i2 % 2 == 0 ? this.onWarmupCompleted.hashCode() - 123 : this.onWarmupCompleted.hashCode() * 31) + Integer.hashCode(this.onExtraCallback);
            int i3 = onNavigationEvent + 95;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 40 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Vertical(alignment=" + this.onWarmupCompleted + ", margin=" + this.onExtraCallback + ")";
            int i2 = onNavigationEvent + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@NotNull QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, int i) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.onWarmupCompleted = onwarmupcompleted;
            this.onExtraCallback = i;
        }

        @Override // o.r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult
        public int onWarmupCompleted(@NotNull ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda1, long j, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 121;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(extensionsInfoExternalSyntheticLambda1, "");
            int i5 = (int) j;
            if (i < i5 - (this.onExtraCallback << 1)) {
                int iOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult(i, i5);
                int i6 = this.onExtraCallback;
                return RangesKt.coerceIn(iOnExtraCallbackWithResult, i6, (i5 - i6) - i);
            }
            int i7 = onNavigationEvent + 21;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                QuirkSettingsLoader.Companion.IAuthTabCallbackDefault().onExtraCallbackWithResult(i, i5);
                throw null;
            }
            int iOnExtraCallbackWithResult2 = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault().onExtraCallbackWithResult(i, i5);
            int i8 = IAuthTabCallback + 13;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return iOnExtraCallbackWithResult2;
        }
    }
}
