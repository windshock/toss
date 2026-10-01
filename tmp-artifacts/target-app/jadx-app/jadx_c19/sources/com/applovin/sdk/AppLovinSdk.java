package com.applovin.sdk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.applovin.impl.a4;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.SdkConfigurationImpl;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxSegmentCollection;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppLovinSdk {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION;
    public static final int VERSION_CODE;
    private static AppLovinSdk instance = null;
    private static final Object instanceLock;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final l coreSdk;

    static {
        onExtraCallbackWithResult();
        VERSION = getVersion();
        VERSION_CODE = getVersionCode();
        instanceLock = new Object();
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private AppLovinSdk(l lVar) {
        this.coreSdk = lVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        AppLovinSdk appLovinSdk;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        synchronized (instanceLock) {
            if (instance == null) {
                l lVar = new l(new AppLovinSdkSettings(context), context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(lVar);
                lVar.a(appLovinSdk2);
                instance = appLovinSdk2;
            }
            appLovinSdk = instance;
        }
        return appLovinSdk;
    }

    private static String getVersion() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 117;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return "13.6.3";
    }

    private static int getVersionCode() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0) {
            int i5 = 5 / 0;
        }
        int i6 = i4 + 25;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return 13060399;
    }

    public l a() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        l lVar = this.coreSdk;
        int i5 = i3 + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lVar;
    }

    public AppLovinAdService getAdService() {
        AppLovinAdServiceImpl appLovinAdServiceImplL;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 65;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            appLovinAdServiceImplL = this.coreSdk.l();
            int i4 = 0 / 0;
        } else {
            appLovinAdServiceImplL = this.coreSdk.l();
        }
        int i5 = IAuthTabCallback + 109;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return appLovinAdServiceImplL;
    }

    public AppLovinCmpService getCmpService() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        CmpServiceImpl cmpServiceImplT = this.coreSdk.t();
        int i5 = onNavigationEvent + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return cmpServiceImplT;
    }

    public AppLovinSdkConfiguration getConfiguration() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SdkConfigurationImpl sdkConfigurationImplW = this.coreSdk.w();
        int i5 = onNavigationEvent + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return sdkConfigurationImplW;
    }

    public AppLovinEventService getEventService() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EventServiceImpl eventServiceImplG = this.coreSdk.G();
        int i5 = IAuthTabCallback + 55;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return eventServiceImplG;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getSdkKey() {
        String strK0;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            strK0 = this.coreSdk.k0();
            int i4 = 79 / 0;
        } else {
            strK0 = this.coreSdk.k0();
        }
        int i5 = IAuthTabCallback + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return strK0;
    }

    public MaxSegmentCollection getSegmentCollection() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        MaxSegmentCollectionImpl maxSegmentCollectionImplL0 = this.coreSdk.l0();
        int i5 = IAuthTabCallback + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return maxSegmentCollectionImplL0;
        }
        throw null;
    }

    public AppLovinSdkSettings getSettings() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        AppLovinSdkSettings appLovinSdkSettingsP0 = this.coreSdk.p0();
        int i5 = IAuthTabCallback + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return appLovinSdkSettingsP0;
        }
        throw null;
    }

    public void initialize(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, @Nullable SdkInitializationListener sdkInitializationListener) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.coreSdk.a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
        int i5 = onNavigationEvent + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isInitialized() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            this.coreSdk.D0();
            throw null;
        }
        boolean zD0 = this.coreSdk.D0();
        int i4 = IAuthTabCallback + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zD0;
    }

    public void processDeepLink(Uri uri) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.coreSdk.a(uri);
        if (i4 == 0) {
            throw null;
        }
    }

    public void showCreativeDebugger() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            this.coreSdk.X0();
            throw null;
        }
        this.coreSdk.X0();
        int i4 = onNavigationEvent + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void showMediationDebugger() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.coreSdk.Y0();
        int i5 = onNavigationEvent + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public void showMediationDebugger(@Nullable Map<String, List<?>> map) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            this.coreSdk.a(map);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.coreSdk.a(map);
        int i4 = onNavigationEvent + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.E0() + '}';
        int i3 = onNavigationEvent + 113;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        int i2 = 2 % 2;
        JSONArray jSONArrayB = a4.b(this.coreSdk);
        ArrayList arrayList = new ArrayList(jSONArrayB.length());
        int i3 = onNavigationEvent + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < jSONArrayB.length(); i5++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(jSONArrayB, i5, (JSONObject) null)));
        }
        int i6 = onNavigationEvent + 13;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    protected void reinitialize(Boolean bool, Boolean bool2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this.coreSdk.F0()) {
            int i5 = IAuthTabCallback + 119;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            this.coreSdk.T0();
        }
        this.coreSdk.S0();
        if (bool != null) {
            this.coreSdk.Q();
            if (p.a()) {
                this.coreSdk.Q().d(TAG, "Toggled 'huc' to " + bool);
            }
            Object[] objArr = new Object[1];
            b(new int[]{0, 5, 0, 3}, true, new byte[]{0, 1, 1, 1, 0}, objArr);
            getEventService().trackEvent("huc", CollectionUtils.map(((String) objArr[0]).intern(), bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.Q();
            if (p.a()) {
                this.coreSdk.Q().d(TAG, "Toggled 'dns' to " + bool2);
            }
            Object[] objArr2 = new Object[1];
            b(new int[]{0, 5, 0, 3}, true, new byte[]{0, 1, 1, 1, 0}, objArr2);
            getEventService().trackEvent("dns", CollectionUtils.map(((String) objArr2[0]).intern(), bool2.toString()));
            int i7 = onNavigationEvent + 103;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        Throwable th = null;
        if (cArr != null) {
            int i8 = $11 + 95;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 35283), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, 14239 - (ViewConfiguration.getFadingEdgeLength() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i11 = $11 + 75;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = $11 + 31;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 10935), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65, (ViewConfiguration.getJumpTapTimeout() >> 16) + 16718, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objOnExtraCallback2).invoke(th, objArr3)).charValue();
                        th.hashCode();
                        throw th;
                    }
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 64, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16717, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 == null) {
                            throw th3;
                        }
                        throw cause2;
                    }
                } else {
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 29 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17656 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 == null) {
                            throw th4;
                        }
                        throw cause3;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                try {
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 70, 12486 - TextUtils.getOffsetAfter("", 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    th = null;
                } catch (Throwable th5) {
                    Throwable cause4 = th5.getCause();
                    if (cause4 == null) {
                        throw th5;
                    }
                    throw cause4;
                }
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i17 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i17, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i18 = $10 + 103;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i19 = $11 + 63;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] / iArr[2]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent >>> 1;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = new char[]{27256, 27176, 27173, 27171, 27171};
    }
}
