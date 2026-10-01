package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class readMap {
    public static final readBase64<List<String>> onNavigationEvent = readBase64.onExtraCallbackWithResult("http.request.header");
    public static final getLocationStatus<String> onExtraCallback = getLocationStatus.IAuthTabCallbackDefault("http.request.method");
    public static final getLocationStatus<String> onWarmupCompleted = getLocationStatus.IAuthTabCallbackDefault("http.request.method_original");
    public static final getLocationStatus<Long> onExtraCallbackWithResult = getLocationStatus.asInterface("http.request.resend_count");
    public static final readBase64<List<String>> IAuthTabCallback = readBase64.onExtraCallbackWithResult("http.response.header");
    public static final getLocationStatus<Long> IAuthTabCallbackStub = getLocationStatus.asInterface("http.response.status_code");
    public static final getLocationStatus<String> IAuthTabCallbackDefault = getLocationStatus.IAuthTabCallbackDefault("http.route");
}
