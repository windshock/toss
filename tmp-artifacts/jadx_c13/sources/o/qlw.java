package o;

import o.oq;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class qlw {
    qlw() {
    }

    static oq.onExtraCallback onExtraCallback(qq qqVar) {
        oq engagementSignalsCallback = qqVar.setEngagementSignalsCallback();
        return engagementSignalsCallback != null ? engagementSignalsCallback.IAuthTabCallbackStub() : new oq(_UrlKt.FRAGMENT_ENCODE_SET).IAuthTabCallbackStub();
    }

    static tz onExtraCallbackWithResult(qq qqVar) {
        oq engagementSignalsCallback = qqVar.setEngagementSignalsCallback();
        return (engagementSignalsCallback == null || engagementSignalsCallback.IAuthTabCallbackDefault() == null) ? new tz(new rc()) : engagementSignalsCallback.IAuthTabCallbackDefault();
    }
}
