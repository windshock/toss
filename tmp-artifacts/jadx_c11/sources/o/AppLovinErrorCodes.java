package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinErrorCodes implements getAdditionalConsentStatus {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private final onWarmupCompleted IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final GraphicDeviceInfo onNavigationEvent;
    private final IAuthTabCallback onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLovinErrorCodes)) {
            return false;
        }
        AppLovinErrorCodes appLovinErrorCodes = (AppLovinErrorCodes) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, appLovinErrorCodes.onExtraCallbackWithResult)) {
            int i3 = IAuthTabCallbackStub + 13;
            asBinder = i3 % 128;
            return i3 % 2 == 0;
        }
        if (this.IAuthTabCallback != appLovinErrorCodes.IAuthTabCallback) {
            int i4 = asBinder + 65;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onWarmupCompleted != appLovinErrorCodes.onWarmupCompleted) {
            int i6 = asBinder + 47;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, appLovinErrorCodes.onNavigationEvent)) {
            return true;
        }
        int i8 = IAuthTabCallbackStub + 1;
        asBinder = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 9;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallbackWithResult.hashCode();
            this.IAuthTabCallback.hashCode();
            this.onWarmupCompleted.hashCode();
            throw null;
        }
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        int iHashCode3 = this.onWarmupCompleted.hashCode();
        GraphicDeviceInfo graphicDeviceInfo = this.onNavigationEvent;
        if (graphicDeviceInfo == null) {
            i = 0;
        } else {
            int iHashCode4 = graphicDeviceInfo.hashCode();
            int i4 = asBinder + 29;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode4;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InlineBadge(text=" + this.onExtraCallbackWithResult + ", type=" + this.IAuthTabCallback + ", style=" + this.onWarmupCompleted + ", fontWeight=" + this.onNavigationEvent + ")";
        int i2 = asBinder + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public AppLovinErrorCodes(@NotNull String str, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable GraphicDeviceInfo graphicDeviceInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = onwarmupcompleted;
        this.onWarmupCompleted = iAuthTabCallback;
        this.onNavigationEvent = graphicDeviceInfo;
        this.onExtraCallback = str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 61;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 55;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback;
        int i5 = i2 + 113;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return onwarmupcompleted;
    }

    public final IAuthTabCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 9;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
        int i5 = i2 + 103;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return iAuthTabCallback;
    }

    public final GraphicDeviceInfo onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = this.onNavigationEvent;
        int i5 = i3 + 11;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return graphicDeviceInfo;
        }
        throw null;
    }

    @Override // o.getAdditionalConsentStatus
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 21;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 81;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onWarmupCompleted Blue = new onWarmupCompleted("Blue", 0);
        public static final onWarmupCompleted Elephant = new onWarmupCompleted("Elephant", 1);
        public static final onWarmupCompleted Yellow = new onWarmupCompleted("Yellow", 2);
        public static final onWarmupCompleted Red = new onWarmupCompleted("Red", 3);
        public static final onWarmupCompleted Green = new onWarmupCompleted("Green", 4);
        public static final onWarmupCompleted Teal = new onWarmupCompleted("Teal", 5);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {Blue, Elephant, Yellow, Red, Green, Teal};
            int i5 = i3 + 91;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 125;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onNavigationEvent + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 89;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedArr;
            }
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallback + 1;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallback Fill = new IAuthTabCallback("Fill", 0);
        public static final IAuthTabCallback Weak = new IAuthTabCallback("Weak", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                IAuthTabCallback iAuthTabCallback = Fill;
                IAuthTabCallback iAuthTabCallback2 = Weak;
                iAuthTabCallbackArr = new IAuthTabCallback[3];
                iAuthTabCallbackArr[1] = iAuthTabCallback;
                iAuthTabCallbackArr[0] = iAuthTabCallback2;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{Fill, Weak};
            }
            int i4 = i3 + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallback + 51;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onExtraCallback + 33;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 85 / 0;
            }
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }
}
