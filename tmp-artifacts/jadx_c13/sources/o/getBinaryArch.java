package o;

import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getBinaryArch {
    private static int newSession = 0;
    private static int newSessionWithExtras = 1;
    private final String IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private final String IAuthTabCallback_Parcel;
    private final String ICustomTabsCallback;
    private final int ICustomTabsCallbackDefault;
    private final int ICustomTabsCallbackStub;
    private final String ICustomTabsCallbackStubProxy;
    private final int ICustomTabsCallback_Parcel;
    private final String ICustomTabsService;
    private final String access000;
    private final int access100;
    private final String asBinder;
    private final String asInterface;
    private final String extraCallback;
    private final String extraCallbackWithResult;
    private final String extraCommand;
    private final int getInterfaceDescriptor;
    private final String isEngagementSignalsApiAvailable;
    private final String mayLaunchUrl;
    private final String newAuthTabSession;
    private final String onActivityLayout;
    private final String onActivityResized;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final String onMessageChannelReady;
    private final List<Pair<String, Float>> onMinimized;
    private final int onNavigationEvent;
    private final int onPostMessage;
    private final int onRelationshipValidationResult;
    private final int onTransact;
    private final int onUnminimized;
    private final List<Pair<String, Float>> onWarmupCompleted;
    private final String postMessage;
    private final String readTypedObject;
    private final String writeTypedObject;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = i5 | i9;
        int i11 = ~i5;
        int i12 = i9 | (~(i11 | i2));
        int i13 = (~(i3 | i7 | i5)) | (~(i8 | i11 | i7));
        int i14 = i2 + i5 + i4 + ((-619979367) * i) + (68302741 * i6);
        int i15 = i14 * i14;
        int i16 = (i2 * 561304900) + 382271488 + (561304900 * i5) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i4) + (1615200256 * i) + ((-1821507584) * i6) + (428933120 * i15);
        int i17 = ((i2 * (-96142684)) - 56799437) + (i5 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i4 * (-96141863)) + (i * (-1380774991)) + (i6 * (-1175232947)) + (i15 * (-118947840));
        switch (i16 + (i17 * i17 * (-1369505792))) {
            case 1:
                getBinaryArch getbinaryarch = (getBinaryArch) objArr[0];
                int i18 = 2 % 2;
                int i19 = newSessionWithExtras + 23;
                int i20 = i19 % 128;
                newSession = i20;
                int i21 = i19 % 2;
                List<Pair<String, Float>> list = getbinaryarch.onMinimized;
                int i22 = i20 + 33;
                newSessionWithExtras = i22 % 128;
                int i23 = i22 % 2;
                return list;
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 115;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBinaryArch)) {
            return false;
        }
        getBinaryArch getbinaryarch = (getBinaryArch) obj;
        if (!Intrinsics.areEqual(this.ICustomTabsCallbackStubProxy, getbinaryarch.ICustomTabsCallbackStubProxy) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, getbinaryarch.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.onActivityResized, getbinaryarch.onActivityResized) || !Intrinsics.areEqual(this.asBinder, getbinaryarch.asBinder) || !Intrinsics.areEqual(this.ICustomTabsService, getbinaryarch.ICustomTabsService)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.extraCommand, getbinaryarch.extraCommand)) {
            int i4 = newSessionWithExtras + 9;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.postMessage, getbinaryarch.postMessage)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.newAuthTabSession, getbinaryarch.newAuthTabSession)) {
            int i6 = newSession + 55;
            newSessionWithExtras = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ICustomTabsCallback, getbinaryarch.ICustomTabsCallback) || (!Intrinsics.areEqual(this.onMessageChannelReady, getbinaryarch.onMessageChannelReady)) || !Intrinsics.areEqual(this.asInterface, getbinaryarch.asInterface) || !Intrinsics.areEqual(this.isEngagementSignalsApiAvailable, getbinaryarch.isEngagementSignalsApiAvailable) || !Intrinsics.areEqual(this.access000, getbinaryarch.access000) || !Intrinsics.areEqual(this.mayLaunchUrl, getbinaryarch.mayLaunchUrl) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, getbinaryarch.IAuthTabCallback_Parcel) || !Intrinsics.areEqual(this.onActivityLayout, getbinaryarch.onActivityLayout) || !Intrinsics.areEqual(this.IAuthTabCallback, getbinaryarch.IAuthTabCallback) || !Intrinsics.areEqual(this.extraCallback, getbinaryarch.extraCallback) || !Intrinsics.areEqual(this.extraCallbackWithResult, getbinaryarch.extraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.writeTypedObject, getbinaryarch.writeTypedObject)) {
            int i8 = newSession + 111;
            newSessionWithExtras = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.readTypedObject, getbinaryarch.readTypedObject) || this.onPostMessage != getbinaryarch.onPostMessage || this.onNavigationEvent != getbinaryarch.onNavigationEvent) {
            return false;
        }
        if (this.ICustomTabsCallbackStub != getbinaryarch.ICustomTabsCallbackStub) {
            int i9 = newSession + 113;
            newSessionWithExtras = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.access100 != getbinaryarch.access100) {
            return false;
        }
        if (this.IAuthTabCallbackStubProxy != getbinaryarch.IAuthTabCallbackStubProxy) {
            int i11 = newSessionWithExtras + 9;
            newSession = i11 % 128;
            return i11 % 2 != 0;
        }
        if (this.onRelationshipValidationResult != getbinaryarch.onRelationshipValidationResult) {
            int i12 = newSession + 17;
            newSessionWithExtras = i12 % 128;
            return i12 % 2 == 0;
        }
        if (this.onUnminimized != getbinaryarch.onUnminimized || this.IAuthTabCallbackDefault != getbinaryarch.IAuthTabCallbackDefault || this.ICustomTabsCallbackDefault != getbinaryarch.ICustomTabsCallbackDefault || this.onTransact != getbinaryarch.onTransact || this.ICustomTabsCallback_Parcel != getbinaryarch.ICustomTabsCallback_Parcel || this.getInterfaceDescriptor != getbinaryarch.getInterfaceDescriptor || this.onExtraCallback != getbinaryarch.onExtraCallback) {
            return false;
        }
        if (this.onExtraCallbackWithResult == getbinaryarch.onExtraCallbackWithResult) {
            return Intrinsics.areEqual(this.onMinimized, getbinaryarch.onMinimized) && Intrinsics.areEqual(this.onWarmupCompleted, getbinaryarch.onWarmupCompleted);
        }
        int i13 = newSession + 109;
        newSessionWithExtras = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 31;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.ICustomTabsCallbackStubProxy.hashCode() * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.onActivityResized.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.ICustomTabsService.hashCode()) * 31) + this.extraCommand.hashCode()) * 31) + this.postMessage.hashCode()) * 31) + this.newAuthTabSession.hashCode()) * 31) + this.ICustomTabsCallback.hashCode()) * 31) + this.onMessageChannelReady.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.isEngagementSignalsApiAvailable.hashCode()) * 31) + this.access000.hashCode()) * 31) + this.mayLaunchUrl.hashCode()) * 31) + this.IAuthTabCallback_Parcel.hashCode()) * 31) + this.onActivityLayout.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.extraCallback.hashCode()) * 31) + this.extraCallbackWithResult.hashCode()) * 31) + this.writeTypedObject.hashCode()) * 31) + this.readTypedObject.hashCode()) * 31) + Integer.hashCode(this.onPostMessage)) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Integer.hashCode(this.ICustomTabsCallbackStub)) * 31) + Integer.hashCode(this.access100)) * 31) + Integer.hashCode(this.IAuthTabCallbackStubProxy)) * 31) + Integer.hashCode(this.onRelationshipValidationResult)) * 31) + Integer.hashCode(this.onUnminimized)) * 31) + Integer.hashCode(this.IAuthTabCallbackDefault)) * 31) + Integer.hashCode(this.ICustomTabsCallbackDefault)) * 31) + Integer.hashCode(this.onTransact)) * 31) + Integer.hashCode(this.ICustomTabsCallback_Parcel)) * 31) + Integer.hashCode(this.getInterfaceDescriptor)) * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + this.onMinimized.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
        int i4 = newSessionWithExtras + 33;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MobileIdRes(lightLoadingBackgroundUrl=" + this.ICustomTabsCallbackStubProxy + ", darkLoadingBackgroundUrl=" + this.IAuthTabCallbackStub + ", lightListBackgroundUrl=" + this.onActivityResized + ", darkListBackgroundUrl=" + this.asBinder + ", loadingHologramFillUrl=" + this.ICustomTabsService + ", loadingHologramStrokeUrl=" + this.extraCommand + ", realHologramFillUrl=" + this.postMessage + ", realHologramStrokeUrl=" + this.newAuthTabSession + ", illustrateUrl=" + this.ICustomTabsCallback + ", lightFixedBorderUrl=" + this.onMessageChannelReady + ", darkFixedBorderUrl=" + this.asInterface + ", lightMotionBorderUrl=" + this.isEngagementSignalsApiAvailable + ", darkMotionBorderUrl=" + this.access000 + ", lightRadarUrl=" + this.mayLaunchUrl + ", darkRadarUrl=" + this.IAuthTabCallback_Parcel + ", lightDotUrl=" + this.onActivityLayout + ", darkDotUrl=" + this.IAuthTabCallback + ", expandBackgroundUrl=" + this.extraCallback + ", expandHologramUrl=" + this.extraCallbackWithResult + ", expandLightUrl=" + this.writeTypedObject + ", expandBackgroundFallbackUrl=" + this.readTypedObject + ", lightCardShadowColor=" + this.onPostMessage + ", darkCardShadowColor=" + this.onNavigationEvent + ", lightLoadingCtaCtaBackgroundColor=" + this.ICustomTabsCallbackStub + ", darkLoadingCtaCtaBackgroundColor=" + this.access100 + ", darkLoadingCtaGradientColor=" + this.IAuthTabCallbackStubProxy + ", lightLoadingCtaGradientColor=" + this.onRelationshipValidationResult + ", lightListCtaBackgroundColor=" + this.onUnminimized + ", darkListCtaBackgroundColor=" + this.IAuthTabCallbackDefault + ", lightListCtaBorderColor=" + this.ICustomTabsCallbackDefault + ", darkListCtaBorderColor=" + this.onTransact + ", lightTimeStampColor=" + this.ICustomTabsCallback_Parcel + ", darkTimeStampColor=" + this.getInterfaceDescriptor + ", blurBackgroundColor=" + this.onExtraCallback + ", blurStrokeColor=" + this.onExtraCallbackWithResult + ", lightAngularGradientColors=" + this.onMinimized + ", darkAngularGradientColors=" + this.onWarmupCompleted + ")";
        int i2 = newSession + 125;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getBinaryArch(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, @NotNull List<Pair<String, Float>> list, @NotNull List<Pair<String, Float>> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.ICustomTabsCallbackStubProxy = str;
        this.IAuthTabCallbackStub = str2;
        this.onActivityResized = str3;
        this.asBinder = str4;
        this.ICustomTabsService = str5;
        this.extraCommand = str6;
        this.postMessage = str7;
        this.newAuthTabSession = str8;
        this.ICustomTabsCallback = str9;
        this.onMessageChannelReady = str10;
        this.asInterface = str11;
        this.isEngagementSignalsApiAvailable = str12;
        this.access000 = str13;
        this.mayLaunchUrl = str14;
        this.IAuthTabCallback_Parcel = str15;
        this.onActivityLayout = str16;
        this.IAuthTabCallback = str17;
        this.extraCallback = str18;
        this.extraCallbackWithResult = str19;
        this.writeTypedObject = str20;
        this.readTypedObject = str21;
        this.onPostMessage = i;
        this.onNavigationEvent = i2;
        this.ICustomTabsCallbackStub = i3;
        this.access100 = i4;
        this.IAuthTabCallbackStubProxy = i5;
        this.onRelationshipValidationResult = i6;
        this.onUnminimized = i7;
        this.IAuthTabCallbackDefault = i8;
        this.ICustomTabsCallbackDefault = i9;
        this.onTransact = i10;
        this.ICustomTabsCallback_Parcel = i11;
        this.getInterfaceDescriptor = i12;
        this.onExtraCallback = i13;
        this.onExtraCallbackWithResult = i14;
        this.onMinimized = list;
        this.onWarmupCompleted = list2;
    }

    public final String ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 13;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        String str = this.ICustomTabsCallbackStubProxy;
        int i5 = i3 + 57;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getBinaryArch getbinaryarch = (getBinaryArch) objArr[0];
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 63;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        String str = getbinaryarch.IAuthTabCallbackStub;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 59;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final String onPostMessage() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 35;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onActivityResized;
        int i5 = i2 + 63;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = newSession + Imgproc.COLOR_YUV2RGB_YVYU;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        String str = this.asBinder;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return str;
    }

    public final String ICustomTabsService() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 87;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ICustomTabsService;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    public final String extraCommand() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 83;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        String str = this.extraCommand;
        int i5 = i2 + 113;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String newAuthTabSession() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 43;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        String str = this.postMessage;
        int i5 = i3 + 119;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String prefetch() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 91;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        String str = this.newAuthTabSession;
        int i5 = i2 + 79;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = newSession + 75;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallback;
        }
        throw null;
    }

    public final String onMinimized() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 105;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onMessageChannelReady;
        int i5 = i2 + 51;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 1;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asInterface;
        int i5 = i2 + 101;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = newSession + 83;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.isEngagementSignalsApiAvailable;
        int i4 = i3 + 29;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 125;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            return this.access000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = newSession + 89;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            return this.mayLaunchUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 33;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onActivityLayout() {
        int i = 2 % 2;
        int i2 = newSession + 23;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        int i4 = i2 % 2;
        String str = this.onActivityLayout;
        int i5 = i3 + 57;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 5;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 37;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getBinaryArch getbinaryarch = (getBinaryArch) objArr[0];
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 59;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        String str = getbinaryarch.extraCallback;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 123;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String writeTypedObject() {
        int i = 2 % 2;
        int i2 = newSession + 95;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.extraCallbackWithResult;
        int i4 = i3 + 67;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = newSession + 19;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        String str = this.writeTypedObject;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getBinaryArch getbinaryarch = (getBinaryArch) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 43;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        String str = getbinaryarch.readTypedObject;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getBinaryArch getbinaryarch = (getBinaryArch) objArr[0];
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 45;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        int i5 = getbinaryarch.onPostMessage;
        int i6 = i3 + 37;
        newSessionWithExtras = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getBinaryArch getbinaryarch = (getBinaryArch) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 69;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        int i4 = i2 % 2;
        int i5 = getbinaryarch.onNavigationEvent;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 65;
        newSession = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    public final int ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 77;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.ICustomTabsCallbackStub;
        int i6 = i2 + 53;
        newSessionWithExtras = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 75;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        int i5 = this.access100;
        int i6 = i3 + 31;
        newSessionWithExtras = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 125;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallbackStubProxy;
        int i6 = i2 + 115;
        newSessionWithExtras = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = newSession + 25;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.onRelationshipValidationResult;
        int i5 = i3 + 79;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int onUnminimized() {
        int i;
        int i2 = 2 % 2;
        int i3 = newSession + 29;
        int i4 = i3 % 128;
        newSessionWithExtras = i4;
        if (i3 % 2 == 0) {
            i = this.onUnminimized;
            int i5 = 61 / 0;
        } else {
            i = this.onUnminimized;
        }
        int i6 = i4 + 109;
        newSession = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = newSession + 95;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i5 = 47 / 0;
        }
        return i4;
    }

    public final int onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = newSession + 93;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.ICustomTabsCallbackDefault;
        if (i3 == 0) {
            int i5 = 33 / 0;
        }
        return i4;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 43;
        newSessionWithExtras = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.onTransact;
        int i5 = i2 + 35;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = newSession + 59;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.ICustomTabsCallback_Parcel;
        if (i3 == 0) {
            int i5 = 58 / 0;
        }
        return i4;
    }

    public final int IAuthTabCallback_Parcel() {
        int i;
        int i2 = 2 % 2;
        int i3 = newSessionWithExtras;
        int i4 = i3 + 93;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.getInterfaceDescriptor;
            int i5 = 40 / 0;
        } else {
            i = this.getInterfaceDescriptor;
        }
        int i6 = i3 + 1;
        newSession = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
        return i;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = newSession + 35;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getBinaryArch getbinaryarch = (getBinaryArch) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 113;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        int i4 = i2 % 2;
        int i5 = getbinaryarch.onExtraCallbackWithResult;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 47;
        newSession = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        int i7 = 84 / 0;
        return Integer.valueOf(i5);
    }

    public final List<Pair<String, Float>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = newSession + 61;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Pair<String, Float>> list = this.onWarmupCompleted;
        int i4 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final int onExtraCallbackWithResult() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return ((Integer) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1987803790, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, 1987803794, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).intValue();
    }

    public final int IAuthTabCallback() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return ((Integer) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1105429891, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, -1105429888, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).intValue();
    }

    public final String asBinder() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (String) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1735633579, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, -1735633579, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public final String extraCallback() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (String) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -2048547360, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, 2048547362, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public final String extraCallbackWithResult() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (String) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1867603830, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, 1867603835, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public final List<Pair<String, Float>> onActivityResized() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (List) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1483023251, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, -1483023250, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public final int onMessageChannelReady() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return ((Integer) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1241426201, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, -1241426195, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).intValue();
    }
}
