package o;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AttCertValidityPeriod {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onWarmupCompleted = 8;
    private final Context IAuthTabCallback;
    private final boolean onNavigationEvent;

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public AttCertValidityPeriod(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = context;
    }

    public final int onWarmupCompleted() {
        try {
            if (ContextCompat.checkSelfPermission(this.IAuthTabCallback, "android.permission.READ_PHONE_STATE") != 0) {
                return 0;
            }
            Object systemService = this.IAuthTabCallback.getSystemService("telephony_subscription_service");
            Intrinsics.checkNotNull(systemService, "");
            return ((SubscriptionManager) systemService).getActiveSubscriptionInfoCount();
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("DeviceNetworkInfo", e);
            if (this.onNavigationEvent) {
                e.toString();
            }
            return 0;
        }
    }

    public final alignTextProgressInsideProgress onExtraCallback() {
        Object[] objArr = {onTextViewSizeChanged.onExtraCallbackWithResult, this.IAuthTabCallback};
        return (alignTextProgressInsideProgress) onTextViewSizeChanged.IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1136607599, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1136607596);
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (ContextCompat.checkSelfPermission(this.IAuthTabCallback, "android.permission.READ_PHONE_STATE") != 0) {
                return false;
            }
            return IAuthTabCallback(str);
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("DeviceNetworkInfo", e);
            return false;
        }
    }

    private final boolean IAuthTabCallback(String str) {
        List listEmptyList;
        Object systemService = this.IAuthTabCallback.getSystemService("telephony_subscription_service");
        Intrinsics.checkNotNull(systemService, "");
        List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) systemService).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            List<SubscriptionInfo> list = activeSubscriptionInfoList;
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String number = ((SubscriptionInfo) it.next()).getNumber();
                Intrinsics.checkNotNullExpressionValue(number, "");
                listEmptyList.add(TinyBlurMenu3.onExtraCallback(StringsKt.replace$default(StringsKt.replace$default(number, " ", "", false, 4, (Object) null), "-", "", false, 4, (Object) null)));
            }
        }
        return listEmptyList.contains(str);
    }

    private final boolean onNavigationEvent(String str) throws Throwable {
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46480 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 14, 22731 - View.MeasureSpec.getMode(0), -1820028492, false, "IAuthTabCallback", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object[] objArr = {this.IAuthTabCallback};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1244859634);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 46481), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22730, 2071196258, false, "onWarmupCompleted", new Class[]{Context.class});
            }
            CharSequence charSequence = (CharSequence) ((Method) objOnExtraCallback2).invoke(obj, objArr);
            if (charSequence == null || charSequence.length() == 0) {
                return false;
            }
            return Intrinsics.areEqual(charSequence, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final clearTrackedAxonEvents onExtraCallback(@NotNull String str) {
        int iOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                iOnWarmupCompleted = asInterface(str);
            } else {
                iOnWarmupCompleted = onWarmupCompleted(str);
            }
            if (iOnWarmupCompleted == 0) {
                return clearTrackedAxonEvents.UNKNOWN;
            }
            if (iOnWarmupCompleted == 5) {
                return clearTrackedAxonEvents.READY;
            }
            return clearTrackedAxonEvents.NOT_READY;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("DeviceNetworkInfo", e);
            return clearTrackedAxonEvents.UNKNOWN;
        }
    }

    private final int asInterface(String str) {
        Integer num;
        if (ContextCompat.checkSelfPermission(this.IAuthTabCallback, "android.permission.READ_PHONE_STATE") != 0) {
            return 0;
        }
        Object systemService = this.IAuthTabCallback.getSystemService("telephony_subscription_service");
        Intrinsics.checkNotNull(systemService, "");
        List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) systemService).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : activeSubscriptionInfoList) {
                String number = ((SubscriptionInfo) obj).getNumber();
                Intrinsics.checkNotNullExpressionValue(number, "");
                if (Intrinsics.areEqual(TinyBlurMenu3.onExtraCallback(StringsKt.replace$default(StringsKt.replace$default(number, " ", "", false, 4, (Object) null), "-", "", false, 4, (Object) null)), str)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((SubscriptionInfo) it.next()).getSimSlotIndex()));
            }
            num = (Integer) CollectionsKt.firstOrNull(arrayList2);
        } else {
            num = null;
        }
        Object systemService2 = this.IAuthTabCallback.getSystemService("phone");
        Intrinsics.checkNotNull(systemService2, "");
        TelephonyManager telephonyManager = (TelephonyManager) systemService2;
        if (num != null) {
            return telephonyManager.getSimState(num.intValue());
        }
        return 0;
    }

    private final int onWarmupCompleted(String str) {
        if (!onNavigationEvent(str)) {
            return 0;
        }
        Object systemService = this.IAuthTabCallback.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "");
        return ((TelephonyManager) systemService).getSimState();
    }

    public final List<r8lambda005RFY1ST6U6pJu5OZ0sBz8LWM> onNavigationEvent() {
        clearTrackedAxonEvents cleartrackedaxoneventsOnExtraCallback;
        try {
            Object systemService = this.IAuthTabCallback.getSystemService("telephony_subscription_service");
            Intrinsics.checkNotNull(systemService, "");
            SubscriptionManager subscriptionManager = (SubscriptionManager) systemService;
            if (ContextCompat.checkSelfPermission(this.IAuthTabCallback, "android.permission.READ_PHONE_STATE") != 0) {
                return CollectionsKt.emptyList();
            }
            List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList == null) {
                return CollectionsKt.emptyList();
            }
            List<SubscriptionInfo> list = activeSubscriptionInfoList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (SubscriptionInfo subscriptionInfo : list) {
                String number = subscriptionInfo.getNumber();
                Intrinsics.checkNotNullExpressionValue(number, "");
                String strOnExtraCallback = TinyBlurMenu3.onExtraCallback(StringsKt.replace$default(StringsKt.replace$default(number, " ", "", false, 4, (Object) null), "-", "", false, 4, (Object) null));
                if (Build.VERSION.SDK_INT >= 26) {
                    cleartrackedaxoneventsOnExtraCallback = onExtraCallback(strOnExtraCallback);
                } else {
                    cleartrackedaxoneventsOnExtraCallback = clearTrackedAxonEvents.UNKNOWN;
                }
                arrayList.add(new r8lambda005RFY1ST6U6pJu5OZ0sBz8LWM(strOnExtraCallback, cleartrackedaxoneventsOnExtraCallback, subscriptionInfo.getSubscriptionId()));
            }
            return arrayList;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "DeviceNetworkInfo", "getSimStateInfos error", e, (Map) null, 8, (Object) null);
            return CollectionsKt.emptyList();
        }
    }

    public final boolean onExtraCallback(@NotNull String str, int i) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = onNavigationEvent().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            r8lambda005RFY1ST6U6pJu5OZ0sBz8LWM r8lambda005rfy1st6u6pju5oz0sbz8lwm = (r8lambda005RFY1ST6U6pJu5OZ0sBz8LWM) next;
            if (Intrinsics.areEqual(r8lambda005rfy1st6u6pju5oz0sbz8lwm.onExtraCallbackWithResult(), str) && r8lambda005rfy1st6u6pju5oz0sbz8lwm.onWarmupCompleted() == i) {
                break;
            }
        }
        return next != null;
    }
}
