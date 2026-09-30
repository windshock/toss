package im.toss.features.cardrecommend.home.model.data.rank;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RankBoardColor$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[RankBoardColor.values().length];
        try {
            iArr[RankBoardColor.RED.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RankBoardColor.YELLOW.ordinal()] = 2;
            int i2 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RankBoardColor.GREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RankBoardColor.TEAL.ordinal()] = 4;
            int i3 = onWarmupCompleted + 113;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 2;
            } else {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RankBoardColor.BLUE.ordinal()] = 5;
            int i6 = onExtraCallback + 109;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RankBoardColor.PURPLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RankBoardColor.GRAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
