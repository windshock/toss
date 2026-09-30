package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4ExternalSyntheticLambda7 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Set<String> IAuthTabCallback;
    private static boolean IAuthTabCallbackDefault = false;
    private static int IAuthTabCallbackStub = 0;
    private static int access000 = 1;
    private static int access100 = 0;
    private static int asBinder = 0;
    private static boolean asInterface = false;
    private static int getInterfaceDescriptor = 1;
    public static final q4ExternalSyntheticLambda7 onExtraCallback;
    private static final Set<String> onExtraCallbackWithResult;
    private static final Set<String> onNavigationEvent;
    private static char[] onTransact;
    private static final Set<String> onWarmupCompleted;

    private q4ExternalSyntheticLambda7() {
    }

    static {
        asBinder();
        onExtraCallback = new q4ExternalSyntheticLambda7();
        Set<String> setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"schema_version", "privacy_schema_version", "pii_allowed", "raw_url_allowed", "metric_contract_version", "sample_policy_id", "release_track", "running_type", "app_version_bucket", "metric_owner", "slo_id", "journey", "env", "telemetry_source_version", "cardinality_policy_id"});
        onNavigationEvent = setOnExtraCallback;
        onWarmupCompleted = setOnExtraCallback;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, objArr);
        onExtraCallbackWithResult = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"native", "web", "widget", "background", "hybrid", ((String) objArr[0]).intern()});
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-121, -122, -127}, (ViewConfiguration.getTapTimeout() >> 16) + 127, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-122, -120, -122, -122, -120, -119, -120, -122}, TextUtils.indexOf("", "", 0) + 127, objArr3);
        IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"userid", "user_id", "memberid", "member_id", "deviceid", "device_id", "advertisingid", "advertising_id", "accountkey", "account_key", "temporaryaccountkey", "temporary_account_key", "accountno", "account_no", "usertoken", "user_token", "accesstoken", "access_token", "refreshtoken", "refresh_token", "sessionkey", "session_key", "stockcode", "stock_code", "productcode", "product_code", "isin", "symbol", "appwidgetid", "app_widget_id", "topickey", "topic_key", "channelkey", "channel_key", "subscriptionid", "subscription_id", strIntern, "rawurl", "raw_url", "landingurl", "landing_url", "nextlandingurl", "next_landing_url", ((String) objArr3[0]).intern(), "path", "rawpathid", "raw_path_id", "query", "queryvalue", "query_value", "eventid", "event_id", "sequenceid", "sequence_id", "payloadsession", "payload_session", "deviceidhash", "device_id_hash", "sessionidhash", "session_id_hash", "useridhash", "user_id_hash"});
        int i = access000 + 63;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final Set<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 19;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = onWarmupCompleted;
        int i5 = i2 + 17;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return set;
        }
        throw null;
    }

    public final Set<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 9;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Set<String> set = onExtraCallbackWithResult;
        int i4 = i2 + 21;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return set;
        }
        obj.hashCode();
        throw null;
    }

    public final Set<String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            q5.onExtraCallback.onExtraCallbackWithResult().keySet();
            throw null;
        }
        Set<String> setKeySet = q5.onExtraCallback.onExtraCallbackWithResult().keySet();
        int i3 = getInterfaceDescriptor + 17;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
        }
        return setKeySet;
    }

    public final Set<String> onNavigationEvent() {
        int i = 2 % 2;
        List<q5ExternalSyntheticLambda0> listOnNavigationEvent = q5.onExtraCallback.onNavigationEvent();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOnNavigationEvent.iterator();
        int i2 = access100 + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((q5ExternalSyntheticLambda0) it.next()).onNavigationEvent());
        }
        Set<String> set = CollectionsKt.toSet(arrayList);
        int i4 = access100 + 69;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return set;
    }

    public final Set<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Set<String> set = IAuthTabCallback;
        int i5 = i3 + 95;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return set;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onTransact;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myPid() >> 22) + 77, 20952 - Color.argb(0, 0, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStub)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 75 - (ViewConfiguration.getPressedStateDuration() >> 16), 16036 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i4 = 1052772399;
        if (asInterface) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                try {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 62 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 12214 - TextUtils.indexOf("", "", 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 1052772399;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            String str = new String(cArr4);
            int i5 = $11 + 75;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            objArr[0] = str;
            return;
        }
        if (IAuthTabCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), MotionEvent.axisFromString("") + 64, View.resolveSizeAndState(0, 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i7 = $11 + 9;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        String str2 = new String(cArr6);
        int i9 = $10 + 5;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static void asBinder() {
        onTransact = new char[]{32578, 32585, 32596, 32584, 32576, 32589, 32587, 32594, 32593};
        IAuthTabCallbackStub = -1184333825;
        IAuthTabCallbackDefault = true;
        asInterface = true;
    }
}
