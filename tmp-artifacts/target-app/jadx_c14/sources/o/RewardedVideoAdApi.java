package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RewardedVideoAdApi {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardedVideoAdApi[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final RewardedVideoAdApi PROGRESS = new RewardedVideoAdApi("PROGRESS", 0);
    public static final RewardedVideoAdApi COMPLETE = new RewardedVideoAdApi("COMPLETE", 1);

    private static final /* synthetic */ RewardedVideoAdApi[] $values() {
        RewardedVideoAdApi[] rewardedVideoAdApiArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            RewardedVideoAdApi rewardedVideoAdApi = PROGRESS;
            RewardedVideoAdApi rewardedVideoAdApi2 = COMPLETE;
            rewardedVideoAdApiArr = new RewardedVideoAdApi[5];
            rewardedVideoAdApiArr[0] = rewardedVideoAdApi;
            rewardedVideoAdApiArr[1] = rewardedVideoAdApi2;
        } else {
            rewardedVideoAdApiArr = new RewardedVideoAdApi[]{PROGRESS, COMPLETE};
        }
        int i4 = i2 + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return rewardedVideoAdApiArr;
    }

    public static EnumEntries<RewardedVideoAdApi> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<RewardedVideoAdApi> enumEntries = $ENTRIES;
        int i5 = i3 + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return enumEntries;
    }

    public static RewardedVideoAdApi valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) Enum.valueOf(RewardedVideoAdApi.class, str);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return rewardedVideoAdApi;
    }

    public static RewardedVideoAdApi[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RewardedVideoAdApi[] rewardedVideoAdApiArr = $VALUES;
        if (i3 != 0) {
            return (RewardedVideoAdApi[]) rewardedVideoAdApiArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RewardedVideoAdApi(String str, int i) {
    }

    static {
        RewardedVideoAdApi[] rewardedVideoAdApiArr$values = $values();
        $VALUES = rewardedVideoAdApiArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(rewardedVideoAdApiArr$values);
        int i = onExtraCallbackWithResult + 59;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
