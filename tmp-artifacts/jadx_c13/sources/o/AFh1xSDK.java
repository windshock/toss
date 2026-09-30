package o;

import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1xSDK {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static final Set<Character> onWarmupCompleted = clearNumber.asBinder('0', '1', '3', '6', '7', '8');
    private static final Set<Character> onNavigationEvent = clearNumber.asBinder('l', 'm', 'n');

    public static final /* synthetic */ Set onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Set<Character> set = onNavigationEvent;
        int i5 = i3 + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    public static final /* synthetic */ Set onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Set<Character> set = onWarmupCompleted;
        int i4 = i3 + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return set;
    }

    static {
        int i = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
