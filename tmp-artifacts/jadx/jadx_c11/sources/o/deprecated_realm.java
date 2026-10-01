package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_realm {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ deprecated_realm[] $VALUES;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final int weight;
    public static final deprecated_realm Light = new deprecated_realm("Light", 0, 300);
    public static final deprecated_realm Regular = new deprecated_realm("Regular", 1, 400);
    public static final deprecated_realm Medium = new deprecated_realm("Medium", 2, 500);
    public static final deprecated_realm SemiBold = new deprecated_realm("SemiBold", 3, 600);
    public static final deprecated_realm Bold = new deprecated_realm("Bold", 4, 700);
    public static final deprecated_realm ExtraBold = new deprecated_realm("ExtraBold", 5, 800);
    public static final deprecated_realm Heavy = new deprecated_realm("Heavy", 6, 900);
    public static final deprecated_realm Black = new deprecated_realm("Black", 7, 950);

    private static final /* synthetic */ deprecated_realm[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        deprecated_realm[] deprecated_realmVarArr = {Light, Regular, Medium, SemiBold, Bold, ExtraBold, Heavy, Black};
        int i5 = i3 + 103;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return deprecated_realmVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<deprecated_realm> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<deprecated_realm> enumEntries = $ENTRIES;
        int i5 = i3 + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static deprecated_realm valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deprecated_realm deprecated_realmVar = (deprecated_realm) Enum.valueOf(deprecated_realm.class, str);
        int i4 = onExtraCallback + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return deprecated_realmVar;
    }

    public static deprecated_realm[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deprecated_realm[] deprecated_realmVarArr = $VALUES;
        if (i3 == 0) {
            return (deprecated_realm[]) deprecated_realmVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private deprecated_realm(String str, int i, int i2) {
        this.weight = i2;
    }

    public final int getWeight() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.weight;
        int i6 = i3 + 41;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        deprecated_realm[] deprecated_realmVarArr$values = $values();
        $VALUES = deprecated_realmVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(deprecated_realmVarArr$values);
        Companion = new IAuthTabCallback(null);
        int i = IAuthTabCallback + 7;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
