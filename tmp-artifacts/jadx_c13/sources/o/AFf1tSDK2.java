package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
final class AFf1tSDK2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AFf1tSDK2[] $VALUES;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final AFf1tSDK2 Jump = new AFf1tSDK2("Jump", 0);
    public static final AFf1tSDK2 Continuous = new AFf1tSDK2("Continuous", 1);

    private static final /* synthetic */ AFf1tSDK2[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new AFf1tSDK2[]{Jump, Continuous};
        }
        AFf1tSDK2 aFf1tSDK2 = Jump;
        AFf1tSDK2 aFf1tSDK22 = Continuous;
        AFf1tSDK2[] aFf1tSDK2Arr = new AFf1tSDK2[2];
        aFf1tSDK2Arr[0] = aFf1tSDK2;
        aFf1tSDK2Arr[0] = aFf1tSDK22;
        return aFf1tSDK2Arr;
    }

    public static EnumEntries<AFf1tSDK2> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<AFf1tSDK2> enumEntries = $ENTRIES;
        int i5 = i2 + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AFf1tSDK2 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AFf1tSDK2 aFf1tSDK2 = (AFf1tSDK2) Enum.valueOf(AFf1tSDK2.class, str);
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        int i5 = IAuthTabCallback + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return aFf1tSDK2;
    }

    public static AFf1tSDK2[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AFf1tSDK2[] aFf1tSDK2Arr = (AFf1tSDK2[]) $VALUES.clone();
        int i4 = onExtraCallback + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return aFf1tSDK2Arr;
    }

    private AFf1tSDK2(String str, int i) {
    }

    static {
        AFf1tSDK2[] aFf1tSDK2Arr$values = $values();
        $VALUES = aFf1tSDK2Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aFf1tSDK2Arr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final AFf1tSDK2 onExtraCallbackWithResult(@NotNull getInternalId getinternalid) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(getinternalid, "");
            if (Math.abs(getinternalid.ICustomTabsCallback_Parcel() - getinternalid.mayLaunchUrl()) <= 1) {
                AFf1tSDK2 aFf1tSDK2 = AFf1tSDK2.Continuous;
                int i2 = IAuthTabCallback + 85;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return aFf1tSDK2;
            }
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            AFf1tSDK2 aFf1tSDK22 = AFf1tSDK2.Jump;
            int i6 = IAuthTabCallback + 43;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return aFf1tSDK22;
        }
    }
}
