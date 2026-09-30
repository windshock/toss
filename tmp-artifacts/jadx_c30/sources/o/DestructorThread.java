package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DestructorThread {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DestructorThread[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("MANDATORY")
    public static final DestructorThread MANDATORY = new DestructorThread("MANDATORY", 0);

    @SerializedName("OPTIONAL")
    public static final DestructorThread OPTIONAL = new DestructorThread("OPTIONAL", 1);

    @SerializedName("INHERIT")
    public static final DestructorThread INHERIT = new DestructorThread("INHERIT", 2);

    private static final /* synthetic */ DestructorThread[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        DestructorThread[] destructorThreadArr = {MANDATORY, OPTIONAL, INHERIT};
        int i5 = i2 + 25;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return destructorThreadArr;
    }

    public static EnumEntries<DestructorThread> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<DestructorThread> enumEntries = $ENTRIES;
        int i5 = i2 + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static DestructorThread valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DestructorThread destructorThread = (DestructorThread) Enum.valueOf(DestructorThread.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return destructorThread;
    }

    public static DestructorThread[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DestructorThread[] destructorThreadArr = (DestructorThread[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return destructorThreadArr;
        }
        throw null;
    }

    private DestructorThread(String str, int i) {
    }

    static {
        DestructorThread[] destructorThreadArr$values = $values();
        $VALUES = destructorThreadArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(destructorThreadArr$values);
        int i = onExtraCallbackWithResult + 37;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
