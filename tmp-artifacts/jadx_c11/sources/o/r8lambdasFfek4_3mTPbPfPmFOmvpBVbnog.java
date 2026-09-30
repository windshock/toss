package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog Digit = new r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog("Digit", 0);
    public static final r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog Comma = new r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog("Comma", 1);
    public static final r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog Dash = new r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog("Dash", 2);
    public static final r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog Dot = new r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog("Dot", 3);

    private static final /* synthetic */ r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog = Digit;
        if (i3 == 0) {
            return new r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog[]{r8lambdasffek4_3mtpbpfpmfomvpbvbnog, Comma, Dash, Dot};
        }
        r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog2 = Comma;
        r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog3 = Dash;
        r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog4 = Dot;
        r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog[] r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr = new r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog[3];
        r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr[1] = r8lambdasffek4_3mtpbpfpmfomvpbvbnog;
        r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr[0] = r8lambdasffek4_3mtpbpfpmfomvpbvbnog2;
        r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr[5] = r8lambdasffek4_3mtpbpfpmfomvpbvbnog3;
        r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr[5] = r8lambdasffek4_3mtpbpfpmfomvpbvbnog4;
        return r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr;
    }

    public static EnumEntries<r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog> enumEntries = $ENTRIES;
        int i5 = i3 + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog = (r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog) Enum.valueOf(r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.class, str);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return r8lambdasffek4_3mtpbpfpmfomvpbvbnog;
    }

    public static r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog[] r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr = (r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr;
    }

    private r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog(String str, int i) {
    }

    static {
        r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog[] r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr$values = $values();
        $VALUES = r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdasffek4_3mtpbpfpmfomvpbvbnogArr$values);
        int i = onExtraCallback + 73;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
