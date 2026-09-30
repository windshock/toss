package o;

import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class showLoading implements AppMsgReceiver1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ showLoading[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 0;
    private static final showLoading[] all;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String domainName;
    private final String simplifiedHost = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{getDomainName()}, 850240680, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -850240678);
    public static final showLoading SUHYUP_BANK = new showLoading("SUHYUP_BANK", 0, "suhyup-bank.com");
    public static final showLoading HANA_BANK = new showLoading("HANA_BANK", 1, "kebhana.com");
    public static final showLoading PEOPLEFUND = new showLoading("PEOPLEFUND", 2, "toss.peoplefund.co.kr");
    public static final showLoading EDUCAR = new showLoading("EDUCAR", 3, "educar.co.kr");
    public static final showLoading CARROT = new showLoading("CARROT", 4, "carrotins.com");
    public static final showLoading KBDIRECT = new showLoading("KBDIRECT", 5, "mdirect.kbinsure.co.kr");
    public static final showLoading SAMSUNGDIRECT = new showLoading("SAMSUNGDIRECT", 6, "direct.samsungfire.com");
    public static final showLoading DBDIRECT = new showLoading("DBDIRECT", 7, "m.directdb.co.kr");
    public static final showLoading HYUNDAIDIRECT = new showLoading("HYUNDAIDIRECT", 8, "mdirect.hi.co.kr");
    public static final showLoading KBLI = new showLoading("KBLI", 9, "m.kbli.co.kr");
    public static final showLoading SHINHANINVEST = new showLoading("SHINHANINVEST", 10, "shinhaninvest.com");
    public static final showLoading ALLCREDIT = new showLoading("ALLCREDIT", 11, "allcredit.co.kr");
    public static final showLoading TOSS_GITHUB = new showLoading("TOSS_GITHUB", 12, "toss.github.io");
    public static final showLoading APTI = new showLoading("APTI", 13, "toss.apti.co.kr");
    public static final showLoading EIGHTPERCENT = new showLoading("EIGHTPERCENT", 14, "toss.8percent.kr");
    public static final showLoading HONESTFUND = new showLoading("HONESTFUND", 15, "toss.honestfund.kr");
    public static final showLoading TERAFUND = new showLoading("TERAFUND", 16, "api-toss.terafunding.com");
    public static final showLoading TOGETHERFUND = new showLoading("TOGETHERFUND", 17, "toss.together.co.kr");
    public static final showLoading SC = new showLoading("SC", 18, "sc.co.kr");
    public static final showLoading SC_OLD = new showLoading("SC_OLD", 19, "standardchartered.co.kr");
    public static final showLoading NH_BANK = new showLoading("NH_BANK", 20, "nonghyup.com");
    public static final showLoading GLN = new showLoading("GLN", 21, "glninternational.com");

    private static final /* synthetic */ showLoading[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        showLoading[] showloadingArr = {SUHYUP_BANK, HANA_BANK, PEOPLEFUND, EDUCAR, CARROT, KBDIRECT, SAMSUNGDIRECT, DBDIRECT, HYUNDAIDIRECT, KBLI, SHINHANINVEST, ALLCREDIT, TOSS_GITHUB, APTI, EIGHTPERCENT, HONESTFUND, TERAFUND, TOGETHERFUND, SC, SC_OLD, NH_BANK, GLN};
        int i5 = i2 + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return showloadingArr;
    }

    public static EnumEntries<showLoading> getEntries() {
        EnumEntries<showLoading> enumEntries;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 60 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static showLoading valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        showLoading showloading = (showLoading) Enum.valueOf(showLoading.class, str);
        int i4 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return showloading;
        }
        throw null;
    }

    public static showLoading[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        showLoading[] showloadingArr = (showLoading[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return showloadingArr;
    }

    private showLoading(String str, int i, String str2) {
        this.domainName = str2;
    }

    public static final /* synthetic */ showLoading[] access$getAll$cp() {
        showLoading[] showloadingArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            showloadingArr = all;
            int i4 = 41 / 0;
        } else {
            showloadingArr = all;
        }
        int i5 = i2 + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return showloadingArr;
        }
        throw null;
    }

    @Override // o.AppMsgReceiver1
    public String getDomainName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 19;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.domainName;
        int i4 = i2 + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        showLoading[] showloadingArr$values = $values();
        $VALUES = showloadingArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(showloadingArr$values);
        Companion = new onExtraCallbackWithResult(null);
        all = (showLoading[]) getEntries().toArray(new showLoading[0]);
        int i = onExtraCallback + 25;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public String getSimplifiedHost() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.simplifiedHost;
            int i4 = 2 / 0;
        } else {
            str = this.simplifiedHost;
        }
        int i5 = i2 + 67;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final showLoading[] onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            showLoading[] showloadingArrAccess$getAll$cp = showLoading.access$getAll$cp();
            int i4 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return showloadingArrAccess$getAll$cp;
        }
    }
}
