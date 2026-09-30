package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg RECENT_WATCH = new r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg("RECENT_WATCH", 0);
    public static final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg USER_MADE = new r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg("USER_MADE", 1);
    public static final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg STOCK_DEFAULT = new r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg("STOCK_DEFAULT", 2);
    public static final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg BOND_DEFAULT = new r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg("BOND_DEFAULT", 3);
    public static final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg OPTION_DEFAULT = new r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg("OPTION_DEFAULT", 4);
    public static final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg INDEX = new r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg("INDEX", 5);
    public static final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg MY_ASSET = new r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg("MY_ASSET", 6);

    private static final /* synthetic */ r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg[] r8lambdabrizzqzhaizmdvstl2yymmz7zsgArr = {RECENT_WATCH, USER_MADE, STOCK_DEFAULT, BOND_DEFAULT, OPTION_DEFAULT, INDEX, MY_ASSET};
        int i5 = i2 + 95;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdabrizzqzhaizmdvstl2yymmz7zsgArr;
    }

    public static EnumEntries<r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg> enumEntries = $ENTRIES;
        int i5 = i3 + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = (r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg) Enum.valueOf(r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.class, str);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
    }

    public static r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg[] r8lambdabrizzqzhaizmdvstl2yymmz7zsgArr = (r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg[]) $VALUES.clone();
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdabrizzqzhaizmdvstl2yymmz7zsgArr;
    }

    private r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg(String str, int i) {
    }

    static {
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg[] r8lambdabrizzqzhaizmdvstl2yymmz7zsgArr$values = $values();
        $VALUES = r8lambdabrizzqzhaizmdvstl2yymmz7zsgArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdabrizzqzhaizmdvstl2yymmz7zsgArr$values);
        int i = onWarmupCompleted + 89;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
