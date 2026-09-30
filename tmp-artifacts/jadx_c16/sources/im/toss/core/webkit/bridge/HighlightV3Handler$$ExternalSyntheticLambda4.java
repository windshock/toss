package im.toss.core.webkit.bridge;

import o.generateAppWithState;
import o.getAppDataMetadata;
import o.getFaceBitmapToByteArray;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HighlightV3Handler$$ExternalSyntheticLambda4 implements generateAppWithState.onExtraCallbackWithResult {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;

    public final void onDismiss(getAppDataMetadata getappdatametadata) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            getFaceBitmapToByteArray.onNavigationEvent(this.f$0, getappdatametadata);
            int i3 = 19 / 0;
        } else {
            getFaceBitmapToByteArray.onNavigationEvent(this.f$0, getappdatametadata);
        }
        int i4 = onExtraCallbackWithResult + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }
}
