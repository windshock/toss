package o;

import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemoteMediatorAccessImpllaunchRefresh1 {
    public final MediaSessionStubExternalSyntheticLambda41 IAuthTabCallbackStubProxy;
    public MediaSessionStubExternalSyntheticLambda18 IAuthTabCallback_Parcel;
    public final Handler access000;
    public static final String onTransact = StringFog.decrypt("+nLJ+xrKT3vbYd4=\n", "vwSslW6ZKhU=\n");
    public static final String IAuthTabCallbackDefault = StringFog.decrypt("wPWO3ZXBolHE8g==\n", "oZb6guWg1yI=\n");
    public static final String asInterface = StringFog.decrypt("d5OVsUD+H4N7lYU=\n", "FvDh7jKbbPY=\n");
    public static final String onExtraCallbackWithResult = StringFog.decrypt("h34MHTcDSG2SeBw=\n", "5h14QlRxLQw=\n");
    public static final String onExtraCallback = StringFog.decrypt("WHAtmq8KoHdNdj0=\n", "ORNZxdx+wQU=\n");
    public static final String IAuthTabCallback = StringFog.decrypt("kpJpDu/lyLiDlHk=\n", "8/EdUZyRp8g=\n");
    public static final String onNavigationEvent = StringFog.decrypt("312FzSMnFHjMUYj3Iw==\n", "vj7xkkdCZww=\n");
    public static final String onWarmupCompleted = StringFog.decrypt("BM1/8wqdlnEB8XjYGIiF\n", "Za4LrHn84BQ=\n");
    public final HashSet IAuthTabCallbackStub = new HashSet();
    public final HashSet asBinder = new HashSet();

    public RemoteMediatorAccessImpllaunchRefresh1(Handler handler, MediaSessionStubExternalSyntheticLambda41 mediaSessionStubExternalSyntheticLambda41) {
        this.IAuthTabCallbackStubProxy = mediaSessionStubExternalSyntheticLambda41;
        this.access000 = handler;
    }

    public final void onNavigationEvent(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) throws JSONException {
        synchronized (this.asBinder) {
            String str5 = str3 + StringFog.decrypt("Wg==\n", "YF/AxDN2nPI=\n") + str2;
            if (!this.asBinder.contains(str5) || z || DataSourceFactoryExternalSyntheticLambda0.onNavigationEvent().onTransact()) {
                this.asBinder.add(str5);
                if (Math.random() * 100.0d >= onExtraCallbackWithResult()) {
                    VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onWarmupCompleted(onTransact, StringFog.decrypt("CfiunZdVzaYj9v2KhnjMvT/+r96TUcyhObHw3pJOzaFq5f2Ol1Ta7zn5r5uFT8ajKQ==\n", "TZHd/vYnqc8=\n"));
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(StringFog.decrypt("XDCdPTc=\n", "OULpXFBRKig=\n"), str);
                    jSONObject2.put(StringFog.decrypt("oGZ5Gi0=\n", "xRQUaUo+yls=\n"), str2);
                    jSONObject2.put(StringFog.decrypt("MDBqPztW\n", "VUIJUF8zSwM=\n"), str3);
                    if (!TextUtils.isEmpty(str4)) {
                        jSONObject2.put(StringFog.decrypt("LllES9Q=\n", "Sys3P7+6pUk=\n"), str4);
                    }
                    if (jSONObject != null) {
                        PreloadMediaSourcePreloadMediaPeriodCallbackExternalSyntheticLambda1.onExtraCallback(jSONObject2, jSONObject, false);
                    }
                } catch (JSONException e) {
                    String str6 = MediaSessionStubExternalSyntheticLambda41.onExtraCallback;
                    VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onExtraCallback(str6, str6, StringFog.decrypt("oOEO0C7vra2B+hLYfKq+u4rhXNI5vL+ogvY=\n", "5ZN8v1zPzMk=\n"), e, null, false);
                }
                String strDecrypt = StringFog.decrypt("YPgYsmPQaWg=\n", "FIhH1xGiBho=\n");
                Iterator it = new HashSet(this.IAuthTabCallbackStub).iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectOnExtraCallback = ((MediaSessionImplExternalSyntheticLambda32) it.next()).onExtraCallback(strDecrypt, jSONObject2);
                    if (jSONObjectOnExtraCallback != null) {
                        PreloadMediaSourcePreloadMediaPeriodCallbackExternalSyntheticLambda1.onExtraCallback(jSONObject2, jSONObjectOnExtraCallback, false);
                    }
                }
                this.IAuthTabCallbackStubProxy.onWarmupCompleted(StringFog.decrypt("l8TpwseKHxQ=\n", "47S2p7X4cGY=\n"), jSONObject2);
            }
        }
    }

    public static double onExtraCallbackWithResult() {
        JSONObject jSONObject;
        if (DataSourceFactoryExternalSyntheticLambda0.onNavigationEvent().access000) {
            return 100.0d;
        }
        RemoteMediatorAccessImpllaunchBoundary113 remoteMediatorAccessImpllaunchBoundary113OnNavigationEvent = DataSourceFactoryExternalSyntheticLambda0.onNavigationEvent();
        synchronized (remoteMediatorAccessImpllaunchBoundary113OnNavigationEvent) {
            jSONObject = ((MediaSessionStubExternalSyntheticLambda34) remoteMediatorAccessImpllaunchBoundary113OnNavigationEvent).IAuthTabCallbackStub;
        }
        return jSONObject.optDouble(StringFog.decrypt("LcOC\n", "Wabyfwmcpqs=\n"), 5.0d);
    }
}
