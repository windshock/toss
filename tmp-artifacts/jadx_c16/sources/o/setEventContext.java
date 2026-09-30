package o;

import im.toss.features.main.ui.di.MainTabModule;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setEventContext implements captureStartValues<BigDataAIDLMainService> {
    private static int asBinder = 0;
    private static int asInterface = 1;
    private final createAnimators<int2Bytes> IAuthTabCallback;
    private final createAnimators<bytes2Int> onExtraCallback;
    private final createAnimators<getBillingPeriod> onExtraCallbackWithResult;
    private final createAnimators<startLiteProcessService> onNavigationEvent;
    private final createAnimators<generatorFDId> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BigDataAIDLMainService bigDataAIDLMainServiceOnNavigationEvent = onNavigationEvent();
        int i4 = asBinder + 5;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return bigDataAIDLMainServiceOnNavigationEvent;
    }

    public BigDataAIDLMainService onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BigDataAIDLMainService bigDataAIDLMainServiceOnNavigationEvent = onNavigationEvent((getBillingPeriod) this.onExtraCallbackWithResult.get(), (generatorFDId) this.onWarmupCompleted.get(), (startLiteProcessService) this.onNavigationEvent.get(), (bytes2Int) this.onExtraCallback.get(), (int2Bytes) this.IAuthTabCallback.get());
        int i4 = asBinder + 71;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return bigDataAIDLMainServiceOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BigDataAIDLMainService onNavigationEvent(getBillingPeriod getbillingperiod, generatorFDId generatorfdid, startLiteProcessService startliteprocessservice, bytes2Int bytes2int, int2Bytes int2bytes) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BigDataAIDLMainService bigDataAIDLMainService = (BigDataAIDLMainService) createAnimator.onNavigationEvent(MainTabModule.onNavigationEvent.onWarmupCompleted(getbillingperiod, generatorfdid, startliteprocessservice, bytes2int, int2bytes));
        int i4 = asBinder + 107;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return bigDataAIDLMainService;
    }
}
