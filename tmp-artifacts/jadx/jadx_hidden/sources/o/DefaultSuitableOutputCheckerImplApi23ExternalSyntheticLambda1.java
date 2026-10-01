package o;

import java.util.Map;

/* loaded from: classes.dex */
public class DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    public final String IAuthTabCallback;
    protected final Map<String, DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6> onExtraCallback;
    public final String onExtraCallbackWithResult;
    public final String onNavigationEvent;
    public final String onWarmupCompleted;

    public DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1(String str, String str2, String str3, String str4, Map<String, DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6> map) {
        this.IAuthTabCallback = str;
        this.onNavigationEvent = str2;
        this.onWarmupCompleted = str3;
        this.onExtraCallbackWithResult = str4;
        this.onExtraCallback = map;
    }

    public DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6 onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6 defaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6 = this.onExtraCallback.get(str);
        int i4 = asInterface + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6;
        }
        throw new NullPointerException();
    }
}
