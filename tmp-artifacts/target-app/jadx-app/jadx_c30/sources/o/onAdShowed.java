package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class onAdShowed extends PAGConstant {
    private final List<IAuthTabCallback> IAuthTabCallbackStub;
    private final PAGLoadListener asBinder;
    private final List<IAuthTabCallback> onExtraCallback;
    private final List<IAuthTabCallback> onNavigationEvent;
    private final List<IAuthTabCallback> onTransact;
    private final List<IAuthTabCallback> onWarmupCompleted;

    public static class IAuthTabCallback {
        public onRenderSuccess IAuthTabCallback;
        public int onExtraCallback;
        public onRenderSuccess onExtraCallbackWithResult;
        public int onNavigationEvent;

        public IAuthTabCallback(int i, int i2, onRenderSuccess onrendersuccess, onRenderSuccess onrendersuccess2) {
            this.onNavigationEvent = i;
            this.onExtraCallback = i2;
            this.IAuthTabCallback = onrendersuccess;
            this.onExtraCallbackWithResult = onrendersuccess2;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(onAdShowed onadshowed, int[] iArr, int i, String str, String str2) {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(iArr[0], i, onadshowed.asBinder.IAuthTabCallback(str), onadshowed.asBinder.IAuthTabCallback(str2));
        onadshowed.onWarmupCompleted.add(iAuthTabCallback);
        if (i == 0) {
            onadshowed.onExtraCallback.add(iAuthTabCallback);
            return;
        }
        if (i == 1) {
            onadshowed.IAuthTabCallbackStub.add(iAuthTabCallback);
        } else if (i == 2) {
            onadshowed.onTransact.add(iAuthTabCallback);
        } else {
            if (i != 3) {
                return;
            }
            onadshowed.onNavigationEvent.add(iAuthTabCallback);
        }
    }
}
