package o;

import o.DependencyModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class trimValue extends DependencyModule implements DeviceIdStoreDeviceIds {
    private trimValue(tryFindBinder tryfindbinder, getCtx getctx, useKeyCache usekeycache) {
        super(tryfindbinder, getctx, usekeycache);
    }

    public static final class onExtraCallback extends DependencyModule.onExtraCallbackWithResult implements DeviceWithState {
        public static /* synthetic */ trimValue onNavigationEvent(tryFindBinder tryfindbinder, getCtx getctx, useKeyCache usekeycache) {
            return new trimValue(tryfindbinder, getctx, usekeycache);
        }
    }
}
