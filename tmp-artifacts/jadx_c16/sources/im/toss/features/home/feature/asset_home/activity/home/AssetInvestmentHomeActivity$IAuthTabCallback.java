package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class AssetInvestmentHomeActivity$IAuthTabCallback {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetInvestmentHomeActivity$IAuthTabCallback[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final AssetInvestmentHomeActivity$IAuthTabCallback CATEGORY_HOME = new onWarmupCompleted("CATEGORY_HOME", 0);
    public static final AssetInvestmentHomeActivity$IAuthTabCallback MINI_HOME = new onExtraCallbackWithResult("MINI_HOME", 1);

    private static final /* synthetic */ AssetInvestmentHomeActivity$IAuthTabCallback[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetInvestmentHomeActivity$IAuthTabCallback assetInvestmentHomeActivity$IAuthTabCallback = CATEGORY_HOME;
        if (i3 == 0) {
            return new AssetInvestmentHomeActivity$IAuthTabCallback[]{assetInvestmentHomeActivity$IAuthTabCallback, MINI_HOME};
        }
        AssetInvestmentHomeActivity$IAuthTabCallback assetInvestmentHomeActivity$IAuthTabCallback2 = MINI_HOME;
        AssetInvestmentHomeActivity$IAuthTabCallback[] assetInvestmentHomeActivity$IAuthTabCallbackArr = new AssetInvestmentHomeActivity$IAuthTabCallback[3];
        assetInvestmentHomeActivity$IAuthTabCallbackArr[0] = assetInvestmentHomeActivity$IAuthTabCallback;
        assetInvestmentHomeActivity$IAuthTabCallbackArr[0] = assetInvestmentHomeActivity$IAuthTabCallback2;
        return assetInvestmentHomeActivity$IAuthTabCallbackArr;
    }

    public /* synthetic */ AssetInvestmentHomeActivity$IAuthTabCallback(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<AssetInvestmentHomeActivity$IAuthTabCallback> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        EnumEntries<AssetInvestmentHomeActivity$IAuthTabCallback> enumEntries = $ENTRIES;
        int i4 = i3 + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static AssetInvestmentHomeActivity$IAuthTabCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AssetInvestmentHomeActivity$IAuthTabCallback assetInvestmentHomeActivity$IAuthTabCallback = (AssetInvestmentHomeActivity$IAuthTabCallback) Enum.valueOf(AssetInvestmentHomeActivity$IAuthTabCallback.class, str);
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return assetInvestmentHomeActivity$IAuthTabCallback;
    }

    public static AssetInvestmentHomeActivity$IAuthTabCallback[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetInvestmentHomeActivity$IAuthTabCallback[] assetInvestmentHomeActivity$IAuthTabCallbackArr = (AssetInvestmentHomeActivity$IAuthTabCallback[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return assetInvestmentHomeActivity$IAuthTabCallbackArr;
    }

    public abstract int getTabNameStringRes();

    private AssetInvestmentHomeActivity$IAuthTabCallback(String str, int i) {
    }

    static {
        AssetInvestmentHomeActivity$IAuthTabCallback[] assetInvestmentHomeActivity$IAuthTabCallbackArr$values = $values();
        $VALUES = assetInvestmentHomeActivity$IAuthTabCallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(assetInvestmentHomeActivity$IAuthTabCallbackArr$values);
        int i = onExtraCallback + 85;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 93 / 0;
        }
    }
}
