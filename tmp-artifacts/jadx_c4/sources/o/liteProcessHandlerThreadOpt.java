package o;

import im.toss.feature.credit.overview.network.response.CreditOverview;
import im.toss.features.credit.data.response.CreditHomeHeaderResponse;
import im.toss.features.credit.data.response.CreditHomeLargeBannerResponse;
import im.toss.features.credit.data.response.MyQuizDetailsResponse;
import im.toss.features.credit.data.response.membership.CreditPlusCheckRegisterResponse;
import im.toss.inventory_sdk.model.InventoryAdDto;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class liteProcessHandlerThreadOpt {
    private static int onMessageChannelReady = 0;
    private static int onPostMessage = 1;
    private final List<liteProcessServerManagerOpt> IAuthTabCallback;
    private final CreditPlusCheckRegisterResponse IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final enableAppModelOpt IAuthTabCallbackStubProxy;
    private final onUnavailable IAuthTabCallback_Parcel;
    private final CreditOverview ICustomTabsCallback;
    private final boolean access000;
    private final CreditHomeLargeBannerResponse access100;
    private final CreditHomeHeaderResponse asBinder;
    private final onUnavailable asInterface;
    private final String extraCallback;
    private final enableOverridePendingTransitionNew extraCallbackWithResult;
    private final getTime getInterfaceDescriptor;
    private final boolean onActivityLayout;
    private final String onActivityResized;
    private final InventoryAdDto.Normal onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final onUnavailable onMinimized;
    private final liteProcessClientManagerOpt onNavigationEvent;
    private final boolean onTransact;
    private final String onWarmupCompleted;
    private final getTime readTypedObject;
    private final MyQuizDetailsResponse writeTypedObject;

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getTime gettime = (getTime) objArr[1];
        getTime gettime2 = (getTime) objArr[2];
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
        List list = (List) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        String str = (String) objArr[8];
        InventoryAdDto.Normal normal = (InventoryAdDto.Normal) objArr[9];
        String str2 = (String) objArr[10];
        MyQuizDetailsResponse myQuizDetailsResponse = (MyQuizDetailsResponse) objArr[11];
        onUnavailable onunavailable = (onUnavailable) objArr[12];
        liteProcessClientManagerOpt liteprocessclientmanageropt = (liteProcessClientManagerOpt) objArr[13];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[14];
        CreditPlusCheckRegisterResponse creditPlusCheckRegisterResponse = (CreditPlusCheckRegisterResponse) objArr[15];
        CreditOverview creditOverview = (CreditOverview) objArr[16];
        enableAppModelOpt enableappmodelopt = (enableAppModelOpt) objArr[17];
        CreditHomeHeaderResponse creditHomeHeaderResponse = (CreditHomeHeaderResponse) objArr[18];
        String str3 = (String) objArr[19];
        String str4 = (String) objArr[20];
        onUnavailable onunavailable2 = (onUnavailable) objArr[21];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(gettime, "");
        Intrinsics.checkNotNullParameter(gettime2, "");
        Intrinsics.checkNotNullParameter(enableoverridependingtransitionnew, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(creditOverview, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = new liteProcessHandlerThreadOpt(gettime, gettime2, enableoverridependingtransitionnew, zBooleanValue, zBooleanValue2, list, iIntValue, str, normal, str2, myQuizDetailsResponse, onunavailable, liteprocessclientmanageropt, creditHomeLargeBannerResponse, creditPlusCheckRegisterResponse, creditOverview, enableappmodelopt, creditHomeHeaderResponse, str3, str4, onunavailable2);
        int i2 = onMessageChannelReady + 49;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        return liteprocesshandlerthreadopt;
    }

    public static /* synthetic */ liteProcessHandlerThreadOpt onExtraCallbackWithResult(liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, getTime gettime, getTime gettime2, enableOverridePendingTransitionNew enableoverridependingtransitionnew, boolean z, boolean z2, List list, int i, String str, InventoryAdDto.Normal normal, String str2, MyQuizDetailsResponse myQuizDetailsResponse, onUnavailable onunavailable, liteProcessClientManagerOpt liteprocessclientmanageropt, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, CreditPlusCheckRegisterResponse creditPlusCheckRegisterResponse, CreditOverview creditOverview, enableAppModelOpt enableappmodelopt, CreditHomeHeaderResponse creditHomeHeaderResponse, String str3, String str4, onUnavailable onunavailable2, int i2, Object obj) {
        getTime gettime3;
        boolean z3;
        String str5;
        MyQuizDetailsResponse myQuizDetailsResponse2;
        liteProcessClientManagerOpt liteprocessclientmanageropt2;
        CreditPlusCheckRegisterResponse creditPlusCheckRegisterResponse2;
        CreditOverview creditOverview2;
        enableAppModelOpt enableappmodelopt2;
        CreditPlusCheckRegisterResponse creditPlusCheckRegisterResponse3;
        enableAppModelOpt enableappmodelopt3;
        CreditHomeHeaderResponse creditHomeHeaderResponse2;
        CreditHomeHeaderResponse creditHomeHeaderResponse3;
        String str6;
        int i3 = 2 % 2;
        getTime gettime4 = (i2 & 1) != 0 ? liteprocesshandlerthreadopt.getInterfaceDescriptor : gettime;
        Object obj2 = null;
        if ((i2 & 2) != 0) {
            int i4 = onPostMessage + 63;
            onMessageChannelReady = i4 % 128;
            if (i4 % 2 != 0) {
                getTime gettime5 = liteprocesshandlerthreadopt.readTypedObject;
                obj2.hashCode();
                throw null;
            }
            gettime3 = liteprocesshandlerthreadopt.readTypedObject;
        } else {
            gettime3 = gettime2;
        }
        enableOverridePendingTransitionNew enableoverridependingtransitionnew2 = (i2 & 4) != 0 ? liteprocesshandlerthreadopt.extraCallbackWithResult : enableoverridependingtransitionnew;
        if ((i2 & 8) != 0) {
            int i5 = onPostMessage + 97;
            onMessageChannelReady = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z4 = liteprocesshandlerthreadopt.access000;
                throw null;
            }
            z3 = liteprocesshandlerthreadopt.access000;
        } else {
            z3 = z;
        }
        boolean z5 = (i2 & 16) != 0 ? liteprocesshandlerthreadopt.onActivityLayout : z2;
        List list2 = (i2 & 32) != 0 ? liteprocesshandlerthreadopt.IAuthTabCallback : list;
        int i6 = (i2 & 64) != 0 ? liteprocesshandlerthreadopt.IAuthTabCallbackStub : i;
        String str7 = (i2 & 128) != 0 ? liteprocesshandlerthreadopt.onWarmupCompleted : str;
        InventoryAdDto.Normal normal2 = (i2 & 256) != 0 ? liteprocesshandlerthreadopt.onExtraCallback : normal;
        if ((i2 & 512) != 0) {
            int i7 = onMessageChannelReady + 21;
            onPostMessage = i7 % 128;
            int i8 = i7 % 2;
            str5 = liteprocesshandlerthreadopt.onExtraCallbackWithResult;
        } else {
            str5 = str2;
        }
        if ((i2 & 1024) != 0) {
            int i9 = onMessageChannelReady + 13;
            onPostMessage = i9 % 128;
            int i10 = i9 % 2;
            myQuizDetailsResponse2 = liteprocesshandlerthreadopt.writeTypedObject;
            if (i10 == 0) {
                int i11 = 83 / 0;
            }
        } else {
            myQuizDetailsResponse2 = myQuizDetailsResponse;
        }
        onUnavailable onunavailable3 = (i2 & 2048) != 0 ? liteprocesshandlerthreadopt.asInterface : onunavailable;
        liteProcessClientManagerOpt liteprocessclientmanageropt3 = (i2 & 4096) != 0 ? liteprocesshandlerthreadopt.onNavigationEvent : liteprocessclientmanageropt;
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse2 = (i2 & 8192) != 0 ? liteprocesshandlerthreadopt.access100 : creditHomeLargeBannerResponse;
        if ((i2 & 16384) != 0) {
            int i12 = onPostMessage + 83;
            liteprocessclientmanageropt2 = liteprocessclientmanageropt3;
            onMessageChannelReady = i12 % 128;
            if (i12 % 2 != 0) {
                CreditPlusCheckRegisterResponse creditPlusCheckRegisterResponse4 = liteprocesshandlerthreadopt.IAuthTabCallbackDefault;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            creditPlusCheckRegisterResponse2 = liteprocesshandlerthreadopt.IAuthTabCallbackDefault;
        } else {
            liteprocessclientmanageropt2 = liteprocessclientmanageropt3;
            creditPlusCheckRegisterResponse2 = creditPlusCheckRegisterResponse;
        }
        CreditOverview creditOverview3 = (32768 & i2) != 0 ? liteprocesshandlerthreadopt.ICustomTabsCallback : creditOverview;
        if ((i2 & 65536) != 0) {
            creditOverview2 = creditOverview3;
            enableappmodelopt2 = liteprocesshandlerthreadopt.IAuthTabCallbackStubProxy;
        } else {
            creditOverview2 = creditOverview3;
            enableappmodelopt2 = enableappmodelopt;
        }
        if ((i2 & 131072) != 0) {
            enableappmodelopt3 = enableappmodelopt2;
            int i13 = onPostMessage + 47;
            creditPlusCheckRegisterResponse3 = creditPlusCheckRegisterResponse2;
            onMessageChannelReady = i13 % 128;
            int i14 = i13 % 2;
            creditHomeHeaderResponse2 = liteprocesshandlerthreadopt.asBinder;
        } else {
            creditPlusCheckRegisterResponse3 = creditPlusCheckRegisterResponse2;
            enableappmodelopt3 = enableappmodelopt2;
            creditHomeHeaderResponse2 = creditHomeHeaderResponse;
        }
        if ((262144 & i2) != 0) {
            String str8 = liteprocesshandlerthreadopt.onActivityResized;
            int i15 = onPostMessage + 117;
            creditHomeHeaderResponse3 = creditHomeHeaderResponse2;
            onMessageChannelReady = i15 % 128;
            int i16 = i15 % 2;
            str6 = str8;
        } else {
            creditHomeHeaderResponse3 = creditHomeHeaderResponse2;
            str6 = str3;
        }
        return (liteProcessHandlerThreadOpt) onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1415054892, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1415054892, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadopt, gettime4, gettime3, enableoverridependingtransitionnew2, Boolean.valueOf(z3), Boolean.valueOf(z5), list2, Integer.valueOf(i6), str7, normal2, str5, myQuizDetailsResponse2, onunavailable3, liteprocessclientmanageropt2, creditHomeLargeBannerResponse2, creditPlusCheckRegisterResponse3, creditOverview2, enableappmodelopt3, creditHomeHeaderResponse3, str6, (524288 & i2) != 0 ? liteprocesshandlerthreadopt.extraCallback : str4, (i2 & 1048576) != 0 ? liteprocesshandlerthreadopt.onMinimized : onunavailable2});
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = (~(i7 | i3)) | (~(i7 | i8));
        int i10 = ~i3;
        int i11 = (~(i2 | i10 | i5)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i3 + i5 + i6 + ((-1228711472) * i) + ((-141981132) * i4);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i3) - 2072313856) + (1118068377 * i5) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i6) + ((-287309824) * i) + ((-1573388288) * i4) + ((-2138374144) * i14);
        int i16 = ((i3 * (-646461497)) - 273503129) + (i5 * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i6 * (-646461009)) + (i * 1623110960) + (i4 * (-2035004020)) + (i14 * 33882112);
        int i17 = i15 + (i16 * i16 * (-1051394048));
        return i17 != 1 ? i17 != 2 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liteProcessHandlerThreadOpt)) {
            return false;
        }
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) obj;
        if (!Intrinsics.areEqual(this.getInterfaceDescriptor, liteprocesshandlerthreadopt.getInterfaceDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.readTypedObject, liteprocesshandlerthreadopt.readTypedObject)) {
            int i2 = onPostMessage + 109;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.extraCallbackWithResult, liteprocesshandlerthreadopt.extraCallbackWithResult) || this.access000 != liteprocesshandlerthreadopt.access000 || this.onActivityLayout != liteprocesshandlerthreadopt.onActivityLayout || !Intrinsics.areEqual(this.IAuthTabCallback, liteprocesshandlerthreadopt.IAuthTabCallback) || this.IAuthTabCallbackStub != liteprocesshandlerthreadopt.IAuthTabCallbackStub || !Intrinsics.areEqual(this.onWarmupCompleted, liteprocesshandlerthreadopt.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, liteprocesshandlerthreadopt.onExtraCallback)) {
            int i4 = onMessageChannelReady + 95;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, liteprocesshandlerthreadopt.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.writeTypedObject, liteprocesshandlerthreadopt.writeTypedObject)) {
            int i6 = onPostMessage + 15;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, liteprocesshandlerthreadopt.asInterface)) {
            int i8 = onMessageChannelReady + 97;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, liteprocesshandlerthreadopt.onNavigationEvent)) {
            int i10 = onPostMessage + 81;
            onMessageChannelReady = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 40 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.access100, liteprocesshandlerthreadopt.access100)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, liteprocesshandlerthreadopt.IAuthTabCallbackDefault)) {
            int i12 = onMessageChannelReady + 117;
            onPostMessage = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ICustomTabsCallback, liteprocesshandlerthreadopt.ICustomTabsCallback)) {
            int i14 = onMessageChannelReady + 39;
            onPostMessage = i14 % 128;
            if (i14 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if ((!Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, liteprocesshandlerthreadopt.IAuthTabCallbackStubProxy)) || !Intrinsics.areEqual(this.asBinder, liteprocesshandlerthreadopt.asBinder) || !Intrinsics.areEqual(this.onActivityResized, liteprocesshandlerthreadopt.onActivityResized)) {
            return false;
        }
        if (Intrinsics.areEqual(this.extraCallback, liteprocesshandlerthreadopt.extraCallback)) {
            return Intrinsics.areEqual(this.onMinimized, liteprocesshandlerthreadopt.onMinimized);
        }
        int i15 = onPostMessage;
        int i16 = i15 + 11;
        onMessageChannelReady = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i15 + 73;
        onMessageChannelReady = i18 % 128;
        int i19 = i18 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i;
        int iHashCode3;
        int i2;
        int iHashCode4;
        int i3;
        int iHashCode5;
        int i4 = 2 % 2;
        int iHashCode6 = this.getInterfaceDescriptor.hashCode();
        int iHashCode7 = this.readTypedObject.hashCode();
        int iHashCode8 = this.extraCallbackWithResult.hashCode();
        int iHashCode9 = Boolean.hashCode(this.access000);
        int iHashCode10 = Boolean.hashCode(this.onActivityLayout);
        int iHashCode11 = this.IAuthTabCallback.hashCode();
        int iHashCode12 = Integer.hashCode(this.IAuthTabCallbackStub);
        int iHashCode13 = this.onWarmupCompleted.hashCode();
        InventoryAdDto.Normal normal = this.onExtraCallback;
        if (normal == null) {
            int i5 = onPostMessage + 29;
            onMessageChannelReady = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = normal.hashCode();
        }
        int iHashCode14 = this.onExtraCallbackWithResult.hashCode();
        MyQuizDetailsResponse myQuizDetailsResponse = this.writeTypedObject;
        int iHashCode15 = myQuizDetailsResponse == null ? 0 : myQuizDetailsResponse.hashCode();
        onUnavailable onunavailable = this.asInterface;
        if (onunavailable == null) {
            int i6 = onMessageChannelReady + 105;
            onPostMessage = i6 % 128;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = onunavailable.hashCode();
        }
        liteProcessClientManagerOpt liteprocessclientmanageropt = this.onNavigationEvent;
        int iHashCode16 = liteprocessclientmanageropt == null ? 0 : liteprocessclientmanageropt.hashCode();
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = this.access100;
        int iHashCode17 = creditHomeLargeBannerResponse == null ? 0 : creditHomeLargeBannerResponse.hashCode();
        CreditPlusCheckRegisterResponse creditPlusCheckRegisterResponse = this.IAuthTabCallbackDefault;
        if (creditPlusCheckRegisterResponse == null) {
            int i7 = onMessageChannelReady + 81;
            i = iHashCode17;
            onPostMessage = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            i = iHashCode17;
            iHashCode3 = creditPlusCheckRegisterResponse.hashCode();
        }
        int iHashCode18 = this.ICustomTabsCallback.hashCode();
        enableAppModelOpt enableappmodelopt = this.IAuthTabCallbackStubProxy;
        if (enableappmodelopt == null) {
            int i9 = onPostMessage + 81;
            i2 = iHashCode3;
            onMessageChannelReady = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            i2 = iHashCode3;
            iHashCode4 = enableappmodelopt.hashCode();
        }
        CreditHomeHeaderResponse creditHomeHeaderResponse = this.asBinder;
        int iHashCode19 = creditHomeHeaderResponse == null ? 0 : creditHomeHeaderResponse.hashCode();
        int iHashCode20 = this.onActivityResized.hashCode();
        int iHashCode21 = this.extraCallback.hashCode();
        onUnavailable onunavailable2 = this.onMinimized;
        if (onunavailable2 != null) {
            int i11 = onMessageChannelReady + 47;
            i3 = iHashCode4;
            onPostMessage = i11 % 128;
            int i12 = i11 % 2;
            iHashCode5 = onunavailable2.hashCode();
        } else {
            i3 = iHashCode4;
            iHashCode5 = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((iHashCode6 * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode2) * 31) + iHashCode16) * 31) + i) * 31) + i2) * 31) + iHashCode18) * 31) + i3) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditHomeScreenData(kcbScoreData=" + this.getInterfaceDescriptor + ", niceScoreData=" + this.readTypedObject + ", scoreDiff=" + this.extraCallbackWithResult + ", isScoreRaiseAvailable=" + this.access000 + ", showRefreshBanner=" + this.onActivityLayout + ", bannerSection=" + this.IAuthTabCallback + ", creditLevel=" + this.IAuthTabCallbackStub + ", creditGradeTitle=" + this.onWarmupCompleted + ", cptBanner=" + this.onExtraCallback + ", creditId=" + this.onExtraCallbackWithResult + ", quizDetailsResponse=" + this.writeTypedObject + ", intelliBanner=" + this.asInterface + ", creditChangeTopBanner=" + this.onNavigationEvent + ", largeBanner=" + this.access100 + ", creditPlusRegisterInfo=" + this.IAuthTabCallbackDefault + ", overview=" + this.ICustomTabsCallback + ", loanManagementBanner=" + this.IAuthTabCallbackStubProxy + ", headerSection=" + this.asBinder + ", scoreRaiseButtonType=" + this.onActivityResized + ", myLoanEntryType=" + this.extraCallback + ", scoreReportTopBanner=" + this.onMinimized + ")";
        int i2 = onMessageChannelReady + 47;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public liteProcessHandlerThreadOpt(@NotNull getTime gettime, @NotNull getTime gettime2, @NotNull enableOverridePendingTransitionNew enableoverridependingtransitionnew, boolean z, boolean z2, @NotNull List<liteProcessServerManagerOpt> list, int i, @NotNull String str, @Nullable InventoryAdDto.Normal normal, @NotNull String str2, @Nullable MyQuizDetailsResponse myQuizDetailsResponse, @Nullable onUnavailable onunavailable, @Nullable liteProcessClientManagerOpt liteprocessclientmanageropt, @Nullable CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, @Nullable CreditPlusCheckRegisterResponse creditPlusCheckRegisterResponse, @NotNull CreditOverview creditOverview, @Nullable enableAppModelOpt enableappmodelopt, @Nullable CreditHomeHeaderResponse creditHomeHeaderResponse, @NotNull String str3, @NotNull String str4, @Nullable onUnavailable onunavailable2) {
        Object next;
        boolean z3;
        Intrinsics.checkNotNullParameter(gettime, "");
        Intrinsics.checkNotNullParameter(gettime2, "");
        Intrinsics.checkNotNullParameter(enableoverridependingtransitionnew, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(creditOverview, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.getInterfaceDescriptor = gettime;
        this.readTypedObject = gettime2;
        this.extraCallbackWithResult = enableoverridependingtransitionnew;
        this.access000 = z;
        this.onActivityLayout = z2;
        this.IAuthTabCallback = list;
        this.IAuthTabCallbackStub = i;
        this.onWarmupCompleted = str;
        this.onExtraCallback = normal;
        this.onExtraCallbackWithResult = str2;
        this.writeTypedObject = myQuizDetailsResponse;
        this.asInterface = onunavailable;
        this.onNavigationEvent = liteprocessclientmanageropt;
        this.access100 = creditHomeLargeBannerResponse;
        this.IAuthTabCallbackDefault = creditPlusCheckRegisterResponse;
        this.ICustomTabsCallback = creditOverview;
        this.IAuthTabCallbackStubProxy = enableappmodelopt;
        this.asBinder = creditHomeHeaderResponse;
        this.onActivityResized = str3;
        this.extraCallback = str4;
        this.onMinimized = onunavailable2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = onMessageChannelReady + 89;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            CollectionsKt.addAll(arrayList, ((liteProcessServerManagerOpt) it.next()).IAuthTabCallback());
        }
        Iterator it2 = arrayList.iterator();
        int i4 = 2 % 2;
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.areEqual(((onUnavailable) next).asBinder(), "mission")) {
                    break;
                }
            }
        }
        onUnavailable onunavailable3 = (onUnavailable) next;
        this.IAuthTabCallback_Parcel = onunavailable3;
        if (onunavailable3 == null) {
            int i5 = onPostMessage + 63;
            onMessageChannelReady = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            z3 = this.IAuthTabCallbackStubProxy != null;
        }
        this.onTransact = z3;
    }

    public final getTime asBinder() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 123;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        getTime gettime = this.getInterfaceDescriptor;
        int i5 = i3 + 97;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return gettime;
    }

    public final getTime IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 17;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return this.readTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final enableOverridePendingTransitionNew access000() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 87;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = this.extraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return enableoverridependingtransitionnew;
    }

    public final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 89;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onActivityLayout;
        int i5 = i2 + 39;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<liteProcessServerManagerOpt> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 99;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        List<liteProcessServerManagerOpt> list = this.IAuthTabCallback;
        int i5 = i2 + 7;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final InventoryAdDto.Normal onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 29;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 89;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        MyQuizDetailsResponse myQuizDetailsResponse = liteprocesshandlerthreadopt.writeTypedObject;
        int i5 = i2 + 115;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return myQuizDetailsResponse;
    }

    public final onUnavailable IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onPostMessage + 111;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onUnavailable onunavailable = this.asInterface;
        int i4 = i3 + 117;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return onunavailable;
    }

    public final liteProcessClientManagerOpt onExtraCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 31;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        liteProcessClientManagerOpt liteprocessclientmanageropt = this.onNavigationEvent;
        int i5 = i2 + 109;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return liteprocessclientmanageropt;
    }

    public final CreditHomeLargeBannerResponse asInterface() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 15;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = this.access100;
        int i5 = i3 + 5;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return creditHomeLargeBannerResponse;
    }

    public final CreditPlusCheckRegisterResponse IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 57;
        onMessageChannelReady = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        CreditPlusCheckRegisterResponse creditPlusCheckRegisterResponse = this.IAuthTabCallbackDefault;
        int i4 = i2 + 21;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return creditPlusCheckRegisterResponse;
        }
        obj.hashCode();
        throw null;
    }

    public final enableAppModelOpt IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 119;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        enableAppModelOpt enableappmodelopt = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 31;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return enableappmodelopt;
        }
        throw null;
    }

    public final CreditHomeHeaderResponse onTransact() {
        int i = 2 % 2;
        int i2 = onPostMessage + 59;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        CreditHomeHeaderResponse creditHomeHeaderResponse = this.asBinder;
        int i5 = i3 + 57;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return creditHomeHeaderResponse;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 31;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        String str = liteprocesshandlerthreadopt.onActivityResized;
        int i5 = i3 + 71;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onPostMessage + 31;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        String str = this.extraCallback;
        int i5 = i3 + 51;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onUnavailable ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        onUnavailable onunavailable = this.onMinimized;
        int i5 = i3 + 83;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return onunavailable;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onPostMessage + 81;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        boolean z = this.onTransact;
        int i5 = i3 + 99;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final liteProcessHandlerThreadOpt onExtraCallbackWithResult(@NotNull getTime gettime, @NotNull getTime gettime2, @NotNull enableOverridePendingTransitionNew enableoverridependingtransitionnew, boolean z, boolean z2, @NotNull List<liteProcessServerManagerOpt> list, int i, @NotNull String str, @Nullable InventoryAdDto.Normal normal, @NotNull String str2, @Nullable MyQuizDetailsResponse myQuizDetailsResponse, @Nullable onUnavailable onunavailable, @Nullable liteProcessClientManagerOpt liteprocessclientmanageropt, @Nullable CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, @Nullable CreditPlusCheckRegisterResponse creditPlusCheckRegisterResponse, @NotNull CreditOverview creditOverview, @Nullable enableAppModelOpt enableappmodelopt, @Nullable CreditHomeHeaderResponse creditHomeHeaderResponse, @NotNull String str3, @NotNull String str4, @Nullable onUnavailable onunavailable2) {
        Object[] objArr = {this, gettime, gettime2, enableoverridependingtransitionnew, Boolean.valueOf(z), Boolean.valueOf(z2), list, Integer.valueOf(i), str, normal, str2, myQuizDetailsResponse, onunavailable, liteprocessclientmanageropt, creditHomeLargeBannerResponse, creditPlusCheckRegisterResponse, creditOverview, enableappmodelopt, creditHomeHeaderResponse, str3, str4, onunavailable2};
        return (liteProcessHandlerThreadOpt) onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1415054892, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1415054892, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr);
    }

    public final MyQuizDetailsResponse access100() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (MyQuizDetailsResponse) onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 615749290, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -615749289, iOnNavigationEvent2, new Object[]{this});
    }

    public final String IAuthTabCallback_Parcel() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (String) onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 46942577, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -46942575, iOnNavigationEvent2, new Object[]{this});
    }
}
