package o;

import o.ContextModule;
import o.registerReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ulongToHex extends ContextModule implements DeviceIdFilePersistenceloadDeviceIdInternal1 {
    private ulongToHex(tryFindBinder tryfindbinder, getCtx getctx, useKeyCache usekeycache) {
        super(tryfindbinder, getctx, usekeycache);
    }

    public static final class onNavigationEvent extends ContextModule.onNavigationEvent implements persistNewDeviceUuid {
        public onNavigationEvent(getCtx getctx, String str, String str2, String str3, registerReader.onExtraCallbackWithResult onextracallbackwithresult) {
            super(getctx, str, str2, str3, onextracallbackwithresult);
        }

        public static /* synthetic */ ulongToHex IAuthTabCallback(tryFindBinder tryfindbinder, getCtx getctx, useKeyCache usekeycache) {
            return new ulongToHex(tryfindbinder, getctx, usekeycache);
        }
    }
}
