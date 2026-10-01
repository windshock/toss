package o;

import android.os.Bundle;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setOnPageChangeListener {
    private static int IAuthTabCallback = 0;
    public static final setOnPageChangeListener onExtraCallback = new setOnPageChangeListener();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 99;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private setOnPageChangeListener() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onNavigationEvent(@NotNull NativeAd nativeAd) throws JSONException {
        String responseId;
        String adSourceName;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeAd, "");
        JSONObject jSONObject = new JSONObject();
        setOnPageChangeListener setonpagechangelistener = onExtraCallback;
        setonpagechangelistener.onExtraCallback(jSONObject, "headline", nativeAd.getHeadline());
        setonpagechangelistener.onExtraCallback(jSONObject, "body", nativeAd.getBody());
        setonpagechangelistener.onExtraCallback(jSONObject, "callToAction", nativeAd.getCallToAction());
        setonpagechangelistener.onExtraCallback(jSONObject, "advertiser", nativeAd.getAdvertiser());
        setonpagechangelistener.onExtraCallback(jSONObject, "store", nativeAd.getStore());
        setonpagechangelistener.onExtraCallback(jSONObject, "price", nativeAd.getPrice());
        setonpagechangelistener.onExtraCallback(jSONObject, "starRating", nativeAd.getStarRating());
        ResponseInfo responseInfo = nativeAd.getResponseInfo();
        if (responseInfo != null) {
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                responseInfo.getResponseId();
                throw null;
            }
            responseId = responseInfo.getResponseId();
            int i3 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        } else {
            responseId = null;
        }
        setonpagechangelistener.onExtraCallback(jSONObject, "responseId", responseId);
        ResponseInfo responseInfo2 = nativeAd.getResponseInfo();
        if (responseInfo2 != null) {
            int i5 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                responseInfo2.getLoadedAdapterResponseInfo();
                throw null;
            }
            AdapterResponseInfo loadedAdapterResponseInfo = responseInfo2.getLoadedAdapterResponseInfo();
            adSourceName = loadedAdapterResponseInfo != null ? loadedAdapterResponseInfo.getAdSourceName() : null;
        }
        setonpagechangelistener.onExtraCallback(jSONObject, "adSourceName", adSourceName);
        ResponseInfo responseInfo3 = nativeAd.getResponseInfo();
        setonpagechangelistener.onExtraCallback(jSONObject, "mediationAdapterClassName", responseInfo3 != null ? responseInfo3.getMediationAdapterClassName() : null);
        setonpagechangelistener.onExtraCallback(jSONObject, "extras", setonpagechangelistener.onWarmupCompleted(nativeAd.getExtras()));
        NativeAd.AdChoicesInfo adChoicesInfo = nativeAd.getAdChoicesInfo();
        setonpagechangelistener.onExtraCallback(jSONObject, "adChoicesText", adChoicesInfo != null ? adChoicesInfo.getText() : null);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i6 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private final JSONObject onWarmupCompleted(Bundle bundle) throws JSONException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (bundle != null) {
            int i5 = i3 + 43;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                if (!bundle.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    Set<String> setKeySet = bundle.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "");
                    for (String str : setKeySet) {
                        setOnPageChangeListener setonpagechangelistener = onExtraCallback;
                        Intrinsics.checkNotNull(str);
                        setonpagechangelistener.onExtraCallback(jSONObject, str, bundle.get(str));
                    }
                    return jSONObject;
                }
            } else {
                bundle.isEmpty();
                throw null;
            }
        }
        int i6 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(JSONObject jSONObject, String str, Object obj) throws JSONException {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (obj != null) {
            int i5 = i2 + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            jSONObject.put(str, obj);
            if (i6 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }
}
