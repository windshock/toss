package o;

import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NumberFormat implements nativeFree {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @Override // o.nativeFree
    public nativeReadByte onExtraCallbackWithResult() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        nativeReadByte nativereadbyteOnExtraCallback = accesssetIndexp.onExtraCallback(setTestMode.onExtraCallback.onTransact());
        int i4 = onNavigationEvent + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return nativereadbyteOnExtraCallback;
    }

    @Override // o.nativeFree
    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            setTestMode.onExtraCallback.writeTypedObject();
            throw null;
        }
        String strWriteTypedObject = setTestMode.onExtraCallback.writeTypedObject();
        int i3 = onNavigationEvent + 41;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return strWriteTypedObject;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.nativeFree
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        String str = (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        int i4 = onNavigationEvent + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return str;
    }
}
