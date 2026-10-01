package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getChildPreviewOutConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinPostbackService {
    private static final getHumanReadableName IAuthTabCallback;
    private static final getHumanReadableName IAuthTabCallbackDefault;
    private static final getHumanReadableName IAuthTabCallbackStub;
    private static final getHumanReadableName IAuthTabCallbackStubProxy;
    private static final getHumanReadableName IAuthTabCallback_Parcel;
    private static final getHumanReadableName ICustomTabsCallback;
    private static int ICustomTabsCallbackDefault = 1;
    private static int ICustomTabsCallbackStubProxy = 0;
    private static final getHumanReadableName access000;
    private static final getHumanReadableName access100;
    private static final getHumanReadableName asBinder;
    private static final getHumanReadableName asInterface;
    private static final getHumanReadableName extraCallback;
    private static final getHumanReadableName extraCallbackWithResult;
    private static final getHumanReadableName getInterfaceDescriptor;
    private static final getHumanReadableName onActivityLayout;
    private static int onActivityResized = 1;
    private static final getChildPreviewOutConfig onExtraCallback;
    public static final AppLovinPostbackService onExtraCallbackWithResult;
    private static int onMessageChannelReady;
    private static final getHumanReadableName onMinimized;
    private static final getHumanReadableName onNavigationEvent;
    private static final getHumanReadableName onPostMessage;
    private static final getHumanReadableName onTransact;
    private static final Map<accessgetTlsVersionsAsStringp, getHumanReadableName> onWarmupCompleted;
    private static final getHumanReadableName readTypedObject;
    private static final getHumanReadableName writeTypedObject;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = (~(i4 | i)) | i3;
        int i8 = i | i4 | i3;
        int i9 = ~i4;
        int i10 = i4 + i3 + i2 + ((-421447895) * i6) + ((-859425246) * i5);
        int i11 = i10 * i10;
        int i12 = (i4 * (-629045104)) + 1817116672 + ((-629045104) * i3) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i2) + ((-2125594624) * i6) + (888930304 * i5) + (441384960 * i11);
        int i13 = (i4 * 1303038832) + 2077918271 + (i3 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i2 * 1303038783) + (i6 * 1583617559) + (i5 * (-1102559138)) + (i11 * 510722048);
        int i14 = i12 + (i13 * i13 * 607191040);
        if (i14 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i14 == 2) {
            return onWarmupCompleted(objArr);
        }
        int i15 = 2 % 2;
        int i16 = ICustomTabsCallbackDefault + 5;
        int i17 = i16 % 128;
        ICustomTabsCallbackStubProxy = i17;
        int i18 = i16 % 2;
        getHumanReadableName gethumanreadablename = onActivityLayout;
        int i19 = i17 + 115;
        ICustomTabsCallbackDefault = i19 % 128;
        int i20 = i19 % 2;
        return gethumanreadablename;
    }

    private AppLovinPostbackService() {
    }

    static {
        AppLovinPostbackService appLovinPostbackService = new AppLovinPostbackService();
        onExtraCallbackWithResult = appLovinPostbackService;
        onWarmupCompleted = new LinkedHashMap();
        ICustomTabsCallback = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.Typography1);
        onNavigationEvent = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography1);
        IAuthTabCallbackStub = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography2);
        asInterface = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography3);
        extraCallbackWithResult = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.Typography2);
        getInterfaceDescriptor = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography4);
        access100 = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography5);
        access000 = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography6);
        writeTypedObject = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.Typography3);
        IAuthTabCallback_Parcel = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography7);
        extraCallback = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.Typography4);
        IAuthTabCallbackStubProxy = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography8);
        readTypedObject = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography9);
        onPostMessage = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.Typography5);
        IAuthTabCallback = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography10);
        onActivityLayout = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.Typography6);
        onTransact = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography11);
        onMinimized = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.Typography7);
        IAuthTabCallbackDefault = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography12);
        asBinder = appLovinPostbackService.onWarmupCompleted(accessgetTlsVersionsAsStringp.SubTypography13);
        onExtraCallback = new getChildPreviewOutConfig(getChildPreviewOutConfig.onExtraCallback.Companion.onExtraCallback(), getChildPreviewOutConfig.onExtraCallbackWithResult.Companion.onWarmupCompleted(), (DefaultConstructorMarker) null);
        int i = onMessageChannelReady + 87;
        onActivityResized = i % 128;
        int i2 = i % 2;
    }

    public final getHumanReadableName IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 73;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getHumanReadableName gethumanreadablename = ICustomTabsCallback;
        int i5 = i2 + 19;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return gethumanreadablename;
    }

    public final getHumanReadableName asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 67;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getHumanReadableName gethumanreadablename = IAuthTabCallbackStub;
        int i4 = i2 + 39;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return gethumanreadablename;
    }

    public final getHumanReadableName onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 83;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallbackWithResult;
        }
        throw null;
    }

    public final getHumanReadableName asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 105;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        getHumanReadableName gethumanreadablename = access100;
        int i5 = i3 + 89;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return gethumanreadablename;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 75;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getHumanReadableName gethumanreadablename = writeTypedObject;
        int i4 = i2 + 3;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return gethumanreadablename;
    }

    public final getHumanReadableName access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 111;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback;
        }
        throw null;
    }

    public final getHumanReadableName IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 95;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getHumanReadableName gethumanreadablename = IAuthTabCallbackStubProxy;
        int i4 = i3 + 17;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return gethumanreadablename;
    }

    public final getHumanReadableName getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 83;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getHumanReadableName IAuthTabCallback() {
        getHumanReadableName gethumanreadablename;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 119;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            gethumanreadablename = IAuthTabCallback;
            int i4 = 61 / 0;
        } else {
            gethumanreadablename = IAuthTabCallback;
        }
        int i5 = i2 + 111;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return gethumanreadablename;
    }

    public final getHumanReadableName onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 19;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getHumanReadableName gethumanreadablename = onTransact;
        int i4 = i3 + 43;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return gethumanreadablename;
        }
        throw null;
    }

    public final getHumanReadableName IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 85;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onMinimized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getHumanReadableName onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 59;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        getHumanReadableName gethumanreadablename = IAuthTabCallbackDefault;
        int i5 = i3 + 89;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return gethumanreadablename;
    }

    public final getHumanReadableName onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 91;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AppLovinPostbackService appLovinPostbackService = (AppLovinPostbackService) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 81;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            appLovinPostbackService.onWarmupCompleted(idleConnectionCount.onExtraCallbackWithResult().get(Integer.valueOf(iIntValue)));
            throw null;
        }
        getHumanReadableName gethumanreadablenameOnWarmupCompleted = appLovinPostbackService.onWarmupCompleted(idleConnectionCount.onExtraCallbackWithResult().get(Integer.valueOf(iIntValue)));
        int i3 = ICustomTabsCallbackStubProxy + 47;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return gethumanreadablenameOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public final getChildPreviewOutConfig onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 75;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final getHumanReadableName onWarmupCompleted(@NotNull accessgetTlsVersionsAsStringp accessgettlsversionsasstringp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accessgettlsversionsasstringp, "");
        Map<accessgetTlsVersionsAsStringp, getHumanReadableName> map = onWarmupCompleted;
        getHumanReadableName gethumanreadablenameOnExtraCallback = map.get(accessgettlsversionsasstringp);
        if (gethumanreadablenameOnExtraCallback == null) {
            int i2 = ICustomTabsCallbackStubProxy + 119;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            gethumanreadablenameOnExtraCallback = AppLovinMediationProvider.onExtraCallback(accessgettlsversionsasstringp, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, null, 1048575, null);
            map.put(accessgettlsversionsasstringp, gethumanreadablenameOnExtraCallback);
        }
        getHumanReadableName gethumanreadablename = gethumanreadablenameOnExtraCallback;
        int i4 = ICustomTabsCallbackDefault + 27;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return gethumanreadablename;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getHumanReadableName onNavigationEvent(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        return (getHumanReadableName) onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -441669580, 441669582, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public final getHumanReadableName access000() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (getHumanReadableName) onExtraCallback(iOnNavigationEvent, iOnNavigationEvent2, -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3);
    }

    public final getHumanReadableName IAuthTabCallbackStubProxy() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (getHumanReadableName) onExtraCallback(iOnNavigationEvent, iOnNavigationEvent2, 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3);
    }
}
