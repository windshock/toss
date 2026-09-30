package im.toss.core.utils;

import java.security.SecureRandom;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RandomKeyGenerator {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public static final RandomKeyGenerator onExtraCallbackWithResult = new RandomKeyGenerator();
    private static final SecureRandom onWarmupCompleted = new SecureRandom();

    private RandomKeyGenerator() {
    }

    static {
        int i = onExtraCallback + 45;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public final String IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String strIAuthTabCallback = IAuthTabCallback("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", i);
        int i5 = IAuthTabCallbackStub + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return strIAuthTabCallback;
    }

    private final String IAuthTabCallback(String str, int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder(i);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = IAuthTabCallbackStub + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            sb.append(str.charAt(onWarmupCompleted.nextInt(str.length())));
        }
        String string = sb.toString();
        int i6 = IAuthTabCallbackStub + 71;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }
}
