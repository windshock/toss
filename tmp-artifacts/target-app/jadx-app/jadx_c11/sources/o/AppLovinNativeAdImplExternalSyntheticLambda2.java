package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplExternalSyntheticLambda2 {
    private static int onExtraCallbackWithResult = 0;
    public static final AppLovinNativeAdImplExternalSyntheticLambda2 onNavigationEvent = new AppLovinNativeAdImplExternalSyntheticLambda2();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private AppLovinNativeAdImplExternalSyntheticLambda2() {
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final onWarmupCompleted onExtraCallback;
        private final onNavigationEvent onExtraCallbackWithResult;
        private final onExtraCallbackWithResult onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i2 = onNavigationEvent + 39;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.onExtraCallbackWithResult == iAuthTabCallback.onExtraCallbackWithResult) {
                return this.onExtraCallback == iAuthTabCallback.onExtraCallback && this.onWarmupCompleted == iAuthTabCallback.onWarmupCompleted;
            }
            int i3 = onNavigationEvent + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onNavigationEvent = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (((this.onExtraCallbackWithResult.hashCode() >>> 10) + this.onExtraCallback.hashCode()) / 13) * this.onWarmupCompleted.hashCode() : (((this.onExtraCallbackWithResult.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
            int i3 = IAuthTabCallback + 51;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Theme(size=" + this.onExtraCallbackWithResult + ", style=" + this.onExtraCallback + ", type=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 84 / 0;
            }
            return str;
        }

        public IAuthTabCallback(@NotNull onNavigationEvent onnavigationevent, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull onExtraCallbackWithResult onextracallbackwithresult) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            this.onExtraCallbackWithResult = onnavigationevent;
            this.onExtraCallback = onwarmupcompleted;
            this.onWarmupCompleted = onextracallbackwithresult;
        }

        public final onNavigationEvent onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 33;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            onNavigationEvent onnavigationevent = this.onExtraCallbackWithResult;
            int i4 = i2 + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationevent;
            }
            obj.hashCode();
            throw null;
        }

        public final onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onExtraCallbackWithResult onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 55;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
            int i5 = i2 + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallbackWithResult Blue = new onExtraCallbackWithResult("Blue", 0);
        public static final onExtraCallbackWithResult Elephant = new onExtraCallbackWithResult("Elephant", 1);
        public static final onExtraCallbackWithResult Yellow = new onExtraCallbackWithResult("Yellow", 2);
        public static final onExtraCallbackWithResult Red = new onExtraCallbackWithResult("Red", 3);
        public static final onExtraCallbackWithResult Green = new onExtraCallbackWithResult("Green", 4);
        public static final onExtraCallbackWithResult Teal = new onExtraCallbackWithResult("Teal", 5);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {Blue, Elephant, Yellow, Red, Green, Teal};
            int i5 = i2 + 11;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 86 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                int i4 = 94 / 0;
            }
            int i5 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 67 / 0;
            }
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 67 / 0;
            }
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallback + 7;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onWarmupCompleted Fill = new onWarmupCompleted("Fill", 0);
        public static final onWarmupCompleted Weak = new onWarmupCompleted("Weak", 1);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {Fill, Weak};
            int i5 = i3 + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 89;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                return onwarmupcompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted[] values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                int i3 = 82 / 0;
            } else {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            }
            int i4 = onWarmupCompleted + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 115;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent Large = new onNavigationEvent("Large", 0, accessgetTlsVersionsAsStringp.Typography1);
        public static final onNavigationEvent Medium = new onNavigationEvent("Medium", 1, accessgetTlsVersionsAsStringp.Typography2);
        public static final onNavigationEvent Small = new onNavigationEvent("Small", 2, accessgetTlsVersionsAsStringp.Typography3);
        public static final onNavigationEvent Tiny = new onNavigationEvent("Tiny", 3, accessgetTlsVersionsAsStringp.Typography4);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final accessgetTlsVersionsAsStringp typography;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {Large, Medium, Small, Tiny};
            int i5 = i3 + 53;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 23;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onExtraCallback + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 64 / 0;
            }
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onWarmupCompleted + 9;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onnavigationeventArr;
            }
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent(String str, int i, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp) {
            this.typography = accessgettlsversionsasstringp;
        }

        public final accessgetTlsVersionsAsStringp getTypography() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.typography;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + 83;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
