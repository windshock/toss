package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.network.model.transfer.TransferBalance;
import viva.republica.toss.network.model.transfer.TransferBalanceStatus;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class issueCertV3 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static int[] onExtraCallbackWithResult = {-91177219, 1574721223, 537674633, 1860706902, 833501161, 1445448338, -861290099, -1008666550, 599011096, 1385675170, 639919830, -492621596, -1336383913, 884244728, -494416764, 2026046043, -1240781714, -532839920};

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onKeyboardVisible.values().length];
            try {
                iArr[onKeyboardVisible.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onKeyboardVisible.ReadOnly.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onKeyboardVisible.Prepared.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onKeyboardVisible.Preparing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[onKeyboardVisible.AuthRequired.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[onKeyboardVisible.NotAvailable.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            onWarmupCompleted = iArr;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i4 | i6)) | (~(i | i6));
        int i10 = ~i;
        int i11 = (~(i10 | i6)) | i4;
        int i12 = (~(i6 | i4 | i)) | (~(i8 | i10));
        int i13 = i4 + i + i3 + ((-373584967) * i2) + ((-1711780345) * i5);
        int i14 = i13 * i13;
        int i15 = (i4 * 1075882953) + 1902575616 + (1075882953 * i) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i3) + ((-375259136) * i2) + ((-1109524480) * i5) + (585564160 * i14);
        int i16 = ((i4 * 235012993) - 778813113) + (i * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i3 * 235013625) + (i2 * 915899377) + (i5 * (-1709701169)) + (i14 * 1974403072);
        int i17 = i15 + (i16 * i16 * (-848756736));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    private static final String onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {followRedirects.onExtraCallbackWithResult};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        String string = ((Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i5 = IAuthTabCallback + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallback(List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 83;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            str = ", ";
        }
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (String) onExtraCallback(-1214243382, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1214243385, new Object[]{list, str}, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        List list = (List) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (hashSet.add(((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj).asInterface())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i4 = IAuthTabCallback + 65;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                arrayList2.add(((TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next()).IAuthTabCallbackStub());
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            arrayList2.add(((TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next()).IAuthTabCallbackStub());
        }
        int size = arrayList2.size();
        if (size == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int i5 = IAuthTabCallback + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0 ? size == 1 : size == 1) {
            return ((checkNavigationBarBySystemProperties) CollectionsKt___CollectionsKt.first((List) arrayList2)).IAuthTabCallbackStubProxy();
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (!(!it2.hasNext())) {
            int i6 = onExtraCallback + 87;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            arrayList3.add(((checkNavigationBarBySystemProperties) it2.next()).bU_());
            int i8 = IAuthTabCallback + 119;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.distinct(arrayList3), str, null, null, 0, null, null, 62, null);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        onDisclaimerClick ondisclaimerclick = (KeyBoardVisiblePoint) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(ondisclaimerclick, "");
        if (ondisclaimerclick instanceof onDisclaimerClick) {
            onDisclaimerClick ondisclaimerclick2 = ondisclaimerclick;
            String string = UserChoiceBillingListener.onExtraCallback.onExtraCallback().getString((ondisclaimerclick2.ICustomTabsCallbackDefault() || !(ondisclaimerclick2.ICustomTabsCallbackStubProxy() ^ true)) ? R.string.toss_savingbox_account : ondisclaimerclick2.onUnminimized() ? R.string.toss_joint_account : R.string.toss_money);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (!(ondisclaimerclick instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) ondisclaimerclick;
        String strExtraCallbackWithResult = tabBarInfoQueryPointOnTabBarInfoQueryListener.extraCallbackWithResult();
        if (strExtraCallbackWithResult != null) {
            return strExtraCallbackWithResult;
        }
        int i4 = IAuthTabCallback + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallback(" ");
    }

    public static final String onNavigationEvent(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        if (keyBoardVisiblePoint instanceof onDisclaimerClick) {
            String strOnActivityResized = ((onDisclaimerClick) keyBoardVisiblePoint).onActivityResized();
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 29 / 0;
            }
            return strOnActivityResized;
        }
        if (!(keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = IAuthTabCallback + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return keyBoardVisiblePoint.asBinder();
        }
        keyBoardVisiblePoint.asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ RecomposerawaitIdle2.onNavigationEvent onNavigationEvent(KeyBoardVisiblePoint keyBoardVisiblePoint, Context context, float f, float f2, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallback + 107;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            f = 40.0f;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback + 29;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            f2 = 8.0f;
        }
        if ((i2 & 8) != 0) {
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Object[] objArr = {new getUrlokhttp(new onExtraCallback(configuration))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            i = ((Integer) getUrlokhttp.onNavigationEvent(objArr, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        return onExtraCallbackWithResult(keyBoardVisiblePoint, context, f, f2, i);
    }

    public static final RecomposerawaitIdle2.onNavigationEvent onExtraCallbackWithResult(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull Context context, float f, float f2, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Intrinsics.checkNotNullParameter(context, "");
        SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 pluginInfo = new PluginInfo(f, f2, 0.0f, null, i, null, 44, null);
        if (!(!(keyBoardVisiblePoint instanceof onDisclaimerClick))) {
            int i3 = IAuthTabCallback + 79;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) keyBoardVisiblePoint;
            return ondisclaimerclick.onUnminimized() ? RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onNavigationEvent(77)), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{pluginInfo}) : ondisclaimerclick.ICustomTabsCallbackDefault() ? RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onNavigationEvent(69)), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{pluginInfo}) : RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(Integer.valueOf(R.drawable.banklogo_28_toss)), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{pluginInfo});
        }
        if (!(keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = onExtraCallback + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = send.Companion.onWarmupCompleted().onExtraCallback(keyBoardVisiblePoint.asInterface());
        if (checknavigationbarbysystempropertiesOnExtraCallback == null) {
            return null;
        }
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventIAuthTabCallback = RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(checknavigationbarbysystempropertiesOnExtraCallback.IAuthTabCallback_Parcel()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{pluginInfo});
        int i7 = IAuthTabCallback + 37;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return onnavigationeventIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ RecomposerawaitIdle2.onNavigationEvent IAuthTabCallback(KeyBoardVisiblePoint keyBoardVisiblePoint, Context context, float f, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onExtraCallback;
            int i4 = i3 + 23;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i5 = i3 + 25;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            f = 40.0f;
        }
        return IAuthTabCallback(keyBoardVisiblePoint, context, f);
    }

    public static final RecomposerawaitIdle2.onNavigationEvent IAuthTabCallback(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull Context context, float f) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
            Intrinsics.checkNotNullParameter(context, "");
            boolean z = keyBoardVisiblePoint instanceof onDisclaimerClick;
            throw null;
        }
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (!(keyBoardVisiblePoint instanceof onDisclaimerClick)) {
            if (!(keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
                throw new NoWhenBranchMatchedException();
            }
            checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = send.Companion.onWarmupCompleted().onExtraCallback(keyBoardVisiblePoint.asInterface());
            if (checknavigationbarbysystempropertiesOnExtraCallback == null) {
                return null;
            }
            if (checknavigationbarbysystempropertiesOnExtraCallback.getInterfaceDescriptor().length() != 0) {
                return RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(checknavigationbarbysystempropertiesOnExtraCallback.getInterfaceDescriptor()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(f, f), new Plugin(f, 0.0f, 0.0f, 0, 0, 30, null)});
            }
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventIAuthTabCallback = RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(checknavigationbarbysystempropertiesOnExtraCallback.IAuthTabCallback_Parcel()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(f, 0.0f, 0.0f, null, 0, null, 62, null)});
            int i3 = onExtraCallback + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventIAuthTabCallback;
        }
        int i5 = IAuthTabCallback + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            ((onDisclaimerClick) keyBoardVisiblePoint).onUnminimized();
            obj.hashCode();
            throw null;
        }
        onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) keyBoardVisiblePoint;
        if (ondisclaimerclick.onUnminimized()) {
            return RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onWarmupCompleted(77)), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(f, f), new Plugin(f, 0.0f, 0.0f, 0, 0, 30, null)});
        }
        if (ondisclaimerclick.ICustomTabsCallbackDefault()) {
            return RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onWarmupCompleted(69)), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(f, f), new Plugin(f, 0.0f, 0.0f, 0, 0, 30, null)});
        }
        RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(context);
        Object[] objArr = new Object[1];
        a(new int[]{1327203057, 1579156138, -1923144638, 1057607026, -562787306, 580649926, 448863662, 410555972, -2019184422, -316521632, -1645703139, 123171711, 422185055, -245293490, -1162832642, -553361294, 1855258539, -822883820, 556465052, -462730265, -1412571783, -1198505603, 1618073978, 322828699, -28155745, -465807982, 248152781, -264429415, -2113230276, 1280865174, -1790576622, -446929568}, 61 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        return RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationevent.onExtraCallback(((String) objArr[0]).intern()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(f, f), new Plugin(f, 0.0f, 0.0f, 0, 0, 30, null)});
    }

    public static final String onWarmupCompleted(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        if (!(keyBoardVisiblePoint instanceof onDisclaimerClick)) {
            if (!(keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return bindApp.onExtraCallbackWithResult(send.Companion.onWarmupCompleted(), keyBoardVisiblePoint.asInterface()).getInterfaceDescriptor();
            }
            bindApp.onExtraCallbackWithResult(send.Companion.onWarmupCompleted(), keyBoardVisiblePoint.asInterface()).getInterfaceDescriptor();
            throw null;
        }
        onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) keyBoardVisiblePoint;
        if (ondisclaimerclick.onUnminimized()) {
            Object[] objArr = new Object[1];
            a(new int[]{1327203057, 1579156138, -1923144638, 1057607026, -562787306, 580649926, 448863662, 410555972, -2019184422, -316521632, -1645703139, 123171711, 422185055, -245293490, -1162832642, -553361294, 1855258539, -822883820, 556465052, -462730265, -663259768, -2022191109, 1078264331, 2065774251, -905651610, -2025946103, 654983715, -1733614297, 1971015223, 237980150, -1195808368, 1024315822}, View.resolveSizeAndState(0, 0, 0) + 62, objArr);
            return ((String) objArr[0]).intern();
        }
        if (!ondisclaimerclick.ICustomTabsCallbackDefault()) {
            return bindApp.onExtraCallbackWithResult(send.Companion.onWarmupCompleted(), checkNavigationBarByWindowManagerService.TOSS.getCode()).getInterfaceDescriptor();
        }
        int i3 = onExtraCallback + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            a(new int[]{1327203057, 1579156138, -1923144638, 1057607026, -562787306, 580649926, 448863662, 410555972, -2019184422, -316521632, -1645703139, 123171711, 422185055, -245293490, -1162832642, -553361294, 1855258539, -822883820, 556465052, -462730265, -663259768, -2022191109, 1078264331, 2065774251, -905651610, -2025946103, 654983715, -1733614297, 182238134, 612759192, -1195808368, 1024315822}, (ViewConfiguration.getWindowTouchSlop() % 53) * 4, objArr2);
            return ((String) objArr2[0]).intern();
        }
        Object[] objArr3 = new Object[1];
        a(new int[]{1327203057, 1579156138, -1923144638, 1057607026, -562787306, 580649926, 448863662, 410555972, -2019184422, -316521632, -1645703139, 123171711, 422185055, -245293490, -1162832642, -553361294, 1855258539, -822883820, 556465052, -462730265, -663259768, -2022191109, 1078264331, 2065774251, -905651610, -2025946103, 654983715, -1733614297, 182238134, 612759192, -1195808368, 1024315822}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 62, objArr3);
        return ((String) objArr3[0]).intern();
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i3 = -1469660336;
        long j = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 1), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 72, View.MeasureSpec.makeMeasureSpec(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i4] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i4++;
                    i3 = -1469660336;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i5 = $10 + 41;
            $11 = i5 % 128;
            int i6 = 2;
            int i7 = i5 % 2;
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 79;
                $10 = i9 % 128;
                int i10 = i9 % i6;
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), Color.alpha(0) + 72, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i8++;
                i6 = 2;
            }
            int i11 = $11 + 103;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22251), 39 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 4033), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 78, 7398 - View.MeasureSpec.makeMeasureSpec(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static /* synthetic */ RecomposerawaitIdle2.onNavigationEvent onNavigationEvent(KeyBoardVisiblePoint keyBoardVisiblePoint, Context context, float f, boolean z, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            f = 42.0f;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(keyBoardVisiblePoint, context, f, z, bool);
        int i5 = IAuthTabCallback + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationeventOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RecomposerawaitIdle2.onNavigationEvent onExtraCallbackWithResult(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull Context context, float f, boolean z, @Nullable Boolean bool) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Intrinsics.checkNotNullParameter(context, "");
        boolean z2 = true;
        if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
            if (bool == null) {
                int i2 = onExtraCallback + 111;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 68 / 0;
                    if (!asInterface(keyBoardVisiblePoint)) {
                        int i4 = IAuthTabCallback + 111;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 3 % 5;
                        }
                        z2 = false;
                    }
                } else if (!asInterface(keyBoardVisiblePoint)) {
                }
            }
        }
        return onWarmupCompleted(context, onWarmupCompleted(keyBoardVisiblePoint), z2, f, z);
    }

    public static final RecomposerawaitIdle2.onNavigationEvent onWarmupCompleted(@NotNull Context context, @Nullable String str, boolean z, float f, boolean z2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(str);
        if (!z2) {
            RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(f, f), new Plugin(f, 0.0f, 0.0f, 0, 0, 30, null)});
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationeventOnExtraCallback;
        }
        float f2 = (40.0f * f) / 42.0f;
        float f3 = f / 42.0f;
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new logCrossPromoteImpression(f2, f2), new Plugin(f2, 0.0f, 0.0f, 0, 0, 30, null), new UST_PKCS12_MakePFX_WINS(0.0f, f3, (f * 2.0f) / 42.0f, f3));
        if (z) {
            listMutableListOf.add(new UST_TSA_RequestTimeStampWithHash());
            int i4 = IAuthTabCallback + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        RecomposerrecompositionRunner2.onWarmupCompleted(onnavigationeventOnExtraCallback, listMutableListOf);
        return onnavigationeventOnExtraCallback;
    }

    public static final RecomposerawaitIdle2.onNavigationEvent onNavigationEvent(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
            Intrinsics.checkNotNullParameter(context, "");
            boolean z = keyBoardVisiblePoint instanceof onDisclaimerClick;
            throw null;
        }
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (keyBoardVisiblePoint instanceof onDisclaimerClick) {
            int i3 = onExtraCallback + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) keyBoardVisiblePoint;
            return ondisclaimerclick.onUnminimized() ? new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onNavigationEvent(77)) : ondisclaimerclick.ICustomTabsCallbackDefault() ? new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onNavigationEvent(69)) : new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(Integer.valueOf(R.drawable.banklogo_28_toss));
        }
        if (!(keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
            throw new NoWhenBranchMatchedException();
        }
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = send.Companion.onWarmupCompleted().onExtraCallback(keyBoardVisiblePoint.asInterface());
        if (checknavigationbarbysystempropertiesOnExtraCallback != null) {
            return new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(checknavigationbarbysystempropertiesOnExtraCallback.IAuthTabCallback_Parcel());
        }
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        long jLongValue = ((Number) objArr[2]).longValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            zBooleanValue = keyBoardVisiblePoint.getInterfaceDescriptor();
        }
        if ((iIntValue & 2) != 0) {
            int i2 = onExtraCallback + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            jLongValue = KeyBoardVisiblePoint.IAuthTabCallback(keyBoardVisiblePoint, 0L, 1, (Object) null);
        }
        if ((iIntValue & 4) != 0) {
            jLongValue2 = KeyBoardVisiblePoint.onExtraCallback(keyBoardVisiblePoint, 0L, 1, (Object) null);
        }
        Object[] objArr2 = {keyBoardVisiblePoint, Boolean.valueOf(zBooleanValue), Long.valueOf(jLongValue), Long.valueOf(jLongValue2)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        String str = (String) onExtraCallback(-274250284, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 274250288, objArr2, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = onExtraCallback + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if ((!r3) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r5 != r7) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r13 = onExtraCallbackWithResult(viva.republica.toss.R.string.transfer_my_account_balance);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r13 = onExtraCallbackWithResult(viva.republica.toss.R.string.transfer_my_account_available_balance);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        return r13 + " " + o.getLongName.onNavigationEvent(r5, (o.ParamImpl) null, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        r11 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult();
        r13 = (java.lang.String) onExtraCallback(-212427217, com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult(), com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult(), 212427218, new java.lang.Object[]{r1}, com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult(), r11);
        r0 = o.issueCertV3.IAuthTabCallback + 43;
        o.issueCertV3.onExtraCallback = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        if ((r1 instanceof o.TabBarInfoQueryPointOnTabBarInfoQueryListener) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        r13 = o.issueCertV3.IAuthTabCallback + 105;
        o.issueCertV3.onExtraCallback = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if ((r13 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r13 = o.followRedirects.onExtraCallbackWithResult.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r13 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        r0 = o.issueCertV3.IAuthTabCallback + 79;
        o.issueCertV3.onExtraCallback = r0 % 128;
        r0 = r0 % 2;
        r13 = r13.getResources().getConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if (o.readIntokhttp.IAuthTabCallback(r13) != true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        r10 = r1.onPostMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        r13 = r1.extraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        if (r13 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        if ((!r3) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (r5 != r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        r13 = onExtraCallbackWithResult(viva.republica.toss.R.string.transfer_my_account_balance);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        r13 = onExtraCallbackWithResult(viva.republica.toss.R.string.transfer_my_account_available_balance);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0108, code lost:
    
        return r13 + " " + o.getLongName.onNavigationEvent(r5, (o.ParamImpl) null, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0109, code lost:
    
        o.followRedirects.onExtraCallbackWithResult.onNavigationEvent();
        r11.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0117, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if ((r1 instanceof o.onDisclaimerClick) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if ((r1 instanceof o.onDisclaimerClick) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (KeyBoardVisiblePoint) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        long jLongValue = ((Number) objArr[2]).longValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnPostMessage = _UrlKt.FRAGMENT_ENCODE_SET;
        Object obj = null;
        if (i3 == 0) {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            int i4 = 68 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
            keyBoardVisiblePoint.getInterfaceDescriptor();
            throw null;
        }
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        if (!keyBoardVisiblePoint.getInterfaceDescriptor()) {
            return -1L;
        }
        long jIAuthTabCallback = KeyBoardVisiblePoint.IAuthTabCallback(keyBoardVisiblePoint, 0L, 1, (Object) null);
        int i3 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return Long.valueOf(jIAuthTabCallback);
    }

    public static /* synthetic */ String onExtraCallback(KeyBoardVisiblePoint keyBoardVisiblePoint, Context context, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 83;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            int i5 = i4 + 59;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        String strOnNavigationEvent = onNavigationEvent(keyBoardVisiblePoint, context, z);
        int i7 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return strOnNavigationEvent;
    }

    public static final String onNavigationEvent(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull Context context, boolean z) {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Intrinsics.checkNotNullParameter(context, "");
        Object obj = null;
        if (keyBoardVisiblePoint instanceof onDisclaimerClick) {
            if (!z) {
                return enableBridgelessArchitecture.IAuthTabCallback.IAuthTabCallback(keyBoardVisiblePoint.onTransact(), "?");
            }
            String string2 = context.getString(R.string.app_balance_view);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            int i4 = onExtraCallback + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return string2;
            }
            obj.hashCode();
            throw null;
        }
        if (!(keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = IAuthTabCallback + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = onNavigationEvent.onWarmupCompleted[((TabBarInfoQueryPointOnTabBarInfoQueryListener) keyBoardVisiblePoint).ICustomTabsCallbackStub().ordinal()];
            throw null;
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) keyBoardVisiblePoint;
        switch (onNavigationEvent.onWarmupCompleted[tabBarInfoQueryPointOnTabBarInfoQueryListener.ICustomTabsCallbackStub().ordinal()]) {
            case 1:
            case 2:
                if (z || !onNavigationEvent(tabBarInfoQueryPointOnTabBarInfoQueryListener)) {
                    String string3 = context.getString(R.string.app_balance_view);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    return string3;
                }
                int i7 = IAuthTabCallback + 77;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Long lOnTransact = keyBoardVisiblePoint.onTransact();
                if (lOnTransact == null || lOnTransact.longValue() != 0 || tabBarInfoQueryPointOnTabBarInfoQueryListener.mayLaunchUrl() > 0) {
                    return enableBridgelessArchitecture.IAuthTabCallback.IAuthTabCallback(keyBoardVisiblePoint.onTransact(), "?");
                }
                String string4 = context.getString(R.string.app_balance_unknown);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                return string4;
            case 3:
                if (TinyAppLifecyclePoint.onWarmupCompleted(tabBarInfoQueryPointOnTabBarInfoQueryListener)) {
                    int i9 = IAuthTabCallback + 91;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    string = context.getString(R.string.app_balance_view);
                } else {
                    string = context.getString(R.string.app_balance_query_not_supported);
                }
                Intrinsics.checkNotNull(string);
                return string;
            case 4:
                String string5 = context.getString(R.string.app_account_continue_register);
                Intrinsics.checkNotNull(string5);
                return string5;
            case 5:
                String string6 = context.getString(R.string.app_account_auth_required);
                Intrinsics.checkNotNull(string6);
                return string6;
            case 6:
                String string7 = context.getString(R.string.app_account_not_available);
                Intrinsics.checkNotNull(string7);
                return string7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean IAuthTabCallbackStub(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        if (keyBoardVisiblePoint instanceof onDisclaimerClick) {
            int i4 = IAuthTabCallback + 45;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 57;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (!(keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
            throw new NoWhenBranchMatchedException();
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) keyBoardVisiblePoint;
        if (!onNavigationEvent(tabBarInfoQueryPointOnTabBarInfoQueryListener)) {
            return false;
        }
        int i9 = IAuthTabCallback + 11;
        onExtraCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return tabBarInfoQueryPointOnTabBarInfoQueryListener.setEngagementSignalsCallback();
        }
        tabBarInfoQueryPointOnTabBarInfoQueryListener.setEngagementSignalsCallback();
        throw null;
    }

    public static final boolean asInterface(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Object[] objArr = {setTestMode.onExtraCallback, keyBoardVisiblePoint.onWarmupCompleted().getName(), keyBoardVisiblePoint.onExtraCallbackWithResult()};
        boolean zBooleanValue = ((Boolean) setTestMode.onExtraCallback(-1651830061, 1651830066, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).booleanValue();
        int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static final Intent onExtraCallbackWithResult(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intent intentOnWarmupCompleted = resumeForClick.asBinder.onWarmupCompleted(context, keyBoardVisiblePoint.access100());
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return intentOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r4 = o.issueCertV3.IAuthTabCallback + 53;
        o.issueCertV3.onExtraCallback = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        return o.r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A.Companion.onExtraCallback().onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r4.asInterface(), o.checkNavigationBarByWindowManagerService.TOSS_SECURITIES.getCode())) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r4.asInterface(), o.checkNavigationBarByWindowManagerService.TOSS_SECURITIES.getCode())) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onNavigationEvent(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            int i3 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (onNavigationEvent(r1) != true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String IAuthTabCallback(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Object obj = null;
        if (keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener) {
            int i2 = onExtraCallback + 27;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                keyBoardVisiblePoint.onTransact();
                obj.hashCode();
                throw null;
            }
            if (keyBoardVisiblePoint.onTransact() != null) {
                int i3 = IAuthTabCallback + 15;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) keyBoardVisiblePoint;
                if (tabBarInfoQueryPointOnTabBarInfoQueryListener.setEngagementSignalsCallback()) {
                    int i5 = onExtraCallback + 125;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        onNavigationEvent(tabBarInfoQueryPointOnTabBarInfoQueryListener);
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            return (String) onExtraCallback(-212427217, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 212427218, new Object[]{keyBoardVisiblePoint}, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        }
        return getLongName.onNavigationEvent(KeyBoardVisiblePoint.onExtraCallback(keyBoardVisiblePoint, 0L, 1, (Object) null), (ParamImpl) null, 1, (Object) null);
    }

    public static final boolean asBinder(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        if (!(!(keyBoardVisiblePoint instanceof onDisclaimerClick))) {
            return false;
        }
        if (!(keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean zOnExtraCallback = hasCurrentActivity.IAuthTabCallback.onExtraCallback(keyBoardVisiblePoint.asInterface(), checkNavigationBarByWindowManagerService.TOSS_BANK.getCode());
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if ((r4 instanceof o.TabBarInfoQueryPointOnTabBarInfoQueryListener) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r1 = o.issueCertV3.IAuthTabCallback + 9;
        o.issueCertV3.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        return o.hasCurrentActivity.IAuthTabCallback.onExtraCallback(r4.asInterface(), o.checkNavigationBarByWindowManagerService.TOSS_SECURITIES.getCode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        r4 = o.issueCertV3.IAuthTabCallback + 115;
        o.issueCertV3.onExtraCallback = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((r4 instanceof o.onDisclaimerClick) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((!(r4 instanceof o.onDisclaimerClick)) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onTransact(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
            int i3 = 54 / 0;
        } else {
            Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        }
    }

    public static final MyAccountInfo IAuthTabCallbackDefault(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        if (keyBoardVisiblePoint instanceof onDisclaimerClick) {
            onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) keyBoardVisiblePoint;
            MyAccountInfo.WithDrawalStatus withDrawalStatus = ondisclaimerclick.onRelationshipValidationResult() ? MyAccountInfo.WithDrawalStatus.REGISTERED : MyAccountInfo.WithDrawalStatus.UN_REGISTRABLE;
            return new MyAccountInfo(keyBoardVisiblePoint.onNavigationEvent(":"), keyBoardVisiblePoint.IAuthTabCallbackStub().IAuthTabCallbackStub(), keyBoardVisiblePoint.onExtraCallbackWithResult(), ondisclaimerclick.onActivityResized(), ondisclaimerclick.extraCallbackWithResult(), (String) onExtraCallback(-1624867189, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1624867189, new Object[]{keyBoardVisiblePoint, false, 0L, 0L, 7, null}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult()), onWarmupCompleted(keyBoardVisiblePoint), asInterface(keyBoardVisiblePoint), withDrawalStatus, new TransferBalance(KeyBoardVisiblePoint.onExtraCallback(keyBoardVisiblePoint, 0L, 1, (Object) null), ((Long) onExtraCallback(691946766, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -691946764, new Object[]{keyBoardVisiblePoint}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).longValue(), false, (String) null, (TransferBalanceStatus) null, 28, (DefaultConstructorMarker) null), (String) null, (Boolean) null, 3072, (DefaultConstructorMarker) null);
        }
        if (!(keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ((TabBarInfoQueryPointOnTabBarInfoQueryListener) keyBoardVisiblePoint).requestPostMessageChannelWithExtras();
            throw null;
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) keyBoardVisiblePoint;
        MyAccountInfo.WithDrawalStatus withDrawalStatus2 = tabBarInfoQueryPointOnTabBarInfoQueryListener.requestPostMessageChannelWithExtras() ? MyAccountInfo.WithDrawalStatus.REGISTERED : tabBarInfoQueryPointOnTabBarInfoQueryListener.receiveFile() ? MyAccountInfo.WithDrawalStatus.NEED_TO_REGISTER : MyAccountInfo.WithDrawalStatus.UN_REGISTRABLE;
        String strOnNavigationEvent = keyBoardVisiblePoint.onNavigationEvent(":");
        int iIAuthTabCallbackStub = keyBoardVisiblePoint.IAuthTabCallbackStub().IAuthTabCallbackStub();
        String strBP_ = keyBoardVisiblePoint.bP_();
        String strIsEngagementSignalsApiAvailable = tabBarInfoQueryPointOnTabBarInfoQueryListener.isEngagementSignalsApiAvailable();
        String str = strIsEngagementSignalsApiAvailable == null ? _UrlKt.FRAGMENT_ENCODE_SET : strIsEngagementSignalsApiAvailable;
        MyAccountInfo myAccountInfo = new MyAccountInfo(strOnNavigationEvent, iIAuthTabCallbackStub, strBP_, str, tabBarInfoQueryPointOnTabBarInfoQueryListener.extraCallbackWithResult(), (String) onExtraCallback(-1624867189, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1624867189, new Object[]{keyBoardVisiblePoint, false, 0L, 0L, 7, null}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult()), onWarmupCompleted(keyBoardVisiblePoint), asInterface(keyBoardVisiblePoint), withDrawalStatus2, new TransferBalance(KeyBoardVisiblePoint.onExtraCallback(keyBoardVisiblePoint, 0L, 1, (Object) null), ((Long) onExtraCallback(691946766, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -691946764, new Object[]{keyBoardVisiblePoint}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).longValue(), false, (String) null, (TransferBalanceStatus) null, 28, (DefaultConstructorMarker) null), (String) null, (Boolean) null, 3072, (DefaultConstructorMarker) null);
        int i3 = IAuthTabCallback + 3;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return myAccountInfo;
        }
        throw null;
    }

    public static final List<KeyBoardVisiblePoint> onExtraCallback(@NotNull List<? extends KeyBoardVisiblePoint> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) obj;
            if (keyBoardVisiblePoint instanceof onDisclaimerClick) {
                int i4 = onExtraCallback + 85;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    boolean zAccess000 = keyBoardVisiblePoint.access000();
                    int i5 = 56 / 0;
                    if (!zAccess000) {
                    }
                } else if (!keyBoardVisiblePoint.access000()) {
                }
            }
            arrayList.add(obj);
        }
        int i6 = IAuthTabCallback + 93;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public static final List<KeyBoardVisiblePoint> onWarmupCompleted(@NotNull List<? extends KeyBoardVisiblePoint> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = onExtraCallback + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                asInterface((KeyBoardVisiblePoint) it.next());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (!asInterface((KeyBoardVisiblePoint) next)) {
                int i3 = IAuthTabCallback + 75;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                arrayList.add(next);
            }
        }
        int i5 = IAuthTabCallback + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public static final String onExtraCallbackWithResult(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (String) onExtraCallback(-212427217, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 212427218, new Object[]{keyBoardVisiblePoint}, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static final String onWarmupCompleted(@NotNull List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list, @NotNull String str) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (String) onExtraCallback(-1214243382, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1214243385, new Object[]{list, str}, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static final long onExtraCallback(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(691946766, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -691946764, new Object[]{keyBoardVisiblePoint}, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).longValue();
    }

    public static final String onExtraCallbackWithResult(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, boolean z, long j, long j2) {
        Object[] objArr = {keyBoardVisiblePoint, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (String) onExtraCallback(-274250284, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 274250288, objArr, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ String onNavigationEvent(KeyBoardVisiblePoint keyBoardVisiblePoint, boolean z, long j, long j2, int i, Object obj) {
        Object[] objArr = {keyBoardVisiblePoint, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (String) onExtraCallback(-1624867189, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1624867189, objArr, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }
}
