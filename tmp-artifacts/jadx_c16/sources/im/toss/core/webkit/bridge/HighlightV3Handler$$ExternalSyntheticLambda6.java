package im.toss.core.webkit.bridge;

import o.generateAppWithState;
import o.getAppDataMetadata;
import o.getFaceBitmapToByteArray;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HighlightV3Handler$$ExternalSyntheticLambda6 implements generateAppWithState.onExtraCallbackWithResult {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;

    public final void onDismiss(getAppDataMetadata getappdatametadata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            getFaceBitmapToByteArray.onExtraCallbackWithResult(this.f$0, getappdatametadata);
            throw null;
        }
        getFaceBitmapToByteArray.onExtraCallbackWithResult(this.f$0, getappdatametadata);
        int i3 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
