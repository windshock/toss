package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4 implements loadNextAdForAdToken {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String label;
    public static final r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4 EMAIL = new r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4("EMAIL", 0, "EMAIL");
    public static final r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4 CARD_NUMBER = new r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4("CARD_NUMBER", 1, "CARD_NUMBER");

    private static final /* synthetic */ r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4[] r8lambdalfscfjiyypbsofgw6debt6z4b4Arr = {EMAIL, CARD_NUMBER};
        int i5 = i2 + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return r8lambdalfscfjiyypbsofgw6debt6z4b4Arr;
        }
        throw null;
    }

    public static EnumEntries<r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4> enumEntries = $ENTRIES;
        int i5 = i2 + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4 r8lambdalfscfjiyypbsofgw6debt6z4b4 = (r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4) Enum.valueOf(r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4.class, str);
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdalfscfjiyypbsofgw6debt6z4b4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4[] r8lambdalfscfjiyypbsofgw6debt6z4b4Arr = (r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return r8lambdalfscfjiyypbsofgw6debt6z4b4Arr;
    }

    private r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4(String str, int i, String str2) {
        this.label = str2;
    }

    @Override // o.loadNextAdForAdToken
    public String getLabel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.label;
        }
        throw null;
    }

    static {
        r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4[] r8lambdalfscfjiyypbsofgw6debt6z4b4Arr$values = $values();
        $VALUES = r8lambdalfscfjiyypbsofgw6debt6z4b4Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4Arr$values);
        int i = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
        }
    }
}
