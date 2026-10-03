package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class loadScriptFromPathToMemory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ loadScriptFromPathToMemory[] $VALUES;
    private static int IAuthTabCallback = 0;

    @SerializedName("STRONG")
    public static final loadScriptFromPathToMemory STRONG = new loadScriptFromPathToMemory("STRONG", 0);

    @SerializedName("WEAK")
    public static final loadScriptFromPathToMemory WEAK = new loadScriptFromPathToMemory("WEAK", 1);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ loadScriptFromPathToMemory[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        loadScriptFromPathToMemory[] loadscriptfrompathtomemoryArr = {STRONG, WEAK};
        int i5 = i3 + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return loadscriptfrompathtomemoryArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<loadScriptFromPathToMemory> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<loadScriptFromPathToMemory> enumEntries = $ENTRIES;
        int i5 = i3 + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static loadScriptFromPathToMemory valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        loadScriptFromPathToMemory loadscriptfrompathtomemory = (loadScriptFromPathToMemory) Enum.valueOf(loadScriptFromPathToMemory.class, str);
        int i4 = onWarmupCompleted + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return loadscriptfrompathtomemory;
    }

    public static loadScriptFromPathToMemory[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        loadScriptFromPathToMemory[] loadscriptfrompathtomemoryArr = (loadScriptFromPathToMemory[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return loadscriptfrompathtomemoryArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private loadScriptFromPathToMemory(String str, int i) {
    }

    static {
        loadScriptFromPathToMemory[] loadscriptfrompathtomemoryArr$values = $values();
        $VALUES = loadscriptfrompathtomemoryArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(loadscriptfrompathtomemoryArr$values);
        int i = onExtraCallback + 43;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
