package org.bson;

import o.dv11;
import o.dv17;
import o.dv18;
import o.dv2;
import o.dv7;
import o.jc2;
import o.setDownloadButtonData;
import o.t_;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RawBsonValueHelper {
    private static final dv18 onExtraCallback = dv2.onWarmupCompleted(new dv11());

    /* JADX WARN: Multi-variable type inference failed */
    static jc2 onExtraCallback(byte[] bArr, setDownloadButtonData setdownloadbuttondata) {
        t_ t_VarOnActivityLayout = setdownloadbuttondata.onActivityLayout();
        t_ t_Var = t_.DOCUMENT;
        if (t_VarOnActivityLayout == t_Var || setdownloadbuttondata.onActivityLayout() == t_.ARRAY) {
            int iOnExtraCallbackWithResult = setdownloadbuttondata.access200().onExtraCallbackWithResult();
            dv7 dv7VarIAuthTabCallback = setdownloadbuttondata.access200().IAuthTabCallback(4);
            int iOnNavigationEvent = setdownloadbuttondata.access200().onNavigationEvent();
            dv7VarIAuthTabCallback.IAuthTabCallback();
            setdownloadbuttondata.ICustomTabsService_Parcel();
            if (setdownloadbuttondata.onActivityLayout() == t_Var) {
                return new RawBsonDocument(bArr, iOnExtraCallbackWithResult, iOnNavigationEvent);
            }
            return new RawBsonArray(bArr, iOnExtraCallbackWithResult, iOnNavigationEvent);
        }
        return (jc2) onExtraCallback.onNavigationEvent(dv11.onExtraCallback(setdownloadbuttondata.onActivityLayout())).onNavigationEvent(setdownloadbuttondata, dv17.onExtraCallback().onExtraCallbackWithResult());
    }

    private RawBsonValueHelper() {
    }
}
