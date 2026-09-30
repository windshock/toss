package o;

import o.mapbugsnag_android_core_release;
import o.registerReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class StateObserver extends mapbugsnag_android_core_release implements DeviceIdPersistence {
    private StateObserver(tryFindBinder tryfindbinder, getCtx getctx, useKeyCache usekeycache) {
        super(tryfindbinder, getctx, usekeycache);
    }

    public static final class IAuthTabCallback extends mapbugsnag_android_core_release.onExtraCallback implements DeviceIdStore1 {
        public IAuthTabCallback(getCtx getctx, String str, String str2, String str3, registerReader.onExtraCallbackWithResult onextracallbackwithresult) {
            super(getctx, str, str2, str3, onextracallbackwithresult);
        }

        public static /* synthetic */ StateObserver onExtraCallback(tryFindBinder tryfindbinder, getCtx getctx, useKeyCache usekeycache) {
            return new StateObserver(tryfindbinder, getctx, usekeycache);
        }
    }
}
