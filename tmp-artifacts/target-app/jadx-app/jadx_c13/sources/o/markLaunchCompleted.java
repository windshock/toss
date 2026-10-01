package o;

import kotlin.enums.EnumEntries;
import org.opencv.imgproc.Imgproc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class markLaunchCompleted {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ markLaunchCompleted[] $VALUES;
    public static final markLaunchCompleted Connected = new markLaunchCompleted("Connected", 0, "connected");
    public static final markLaunchCompleted Disconnected = new markLaunchCompleted("Disconnected", 1, "disconnected");
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final String logName;

    private static final /* synthetic */ markLaunchCompleted[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        markLaunchCompleted[] marklaunchcompletedArr = {Connected, Disconnected};
        int i5 = i3 + 25;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return marklaunchcompletedArr;
    }

    public static EnumEntries<markLaunchCompleted> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<markLaunchCompleted> enumEntries = $ENTRIES;
        int i5 = i2 + 75;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static markLaunchCompleted valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        markLaunchCompleted marklaunchcompleted = (markLaunchCompleted) Enum.valueOf(markLaunchCompleted.class, str);
        if (i3 == 0) {
            return marklaunchcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static markLaunchCompleted[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        markLaunchCompleted[] marklaunchcompletedArr = $VALUES;
        if (i3 != 0) {
            return (markLaunchCompleted[]) marklaunchcompletedArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private markLaunchCompleted(String str, int i, String str2) {
        this.logName = str2;
    }

    public final String getLogName() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.logName;
        int i4 = i3 + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        markLaunchCompleted[] marklaunchcompletedArr$values = $values();
        $VALUES = marklaunchcompletedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(marklaunchcompletedArr$values);
        int i = IAuthTabCallback + 97;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
