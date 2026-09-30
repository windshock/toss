package com.tnkfactory.ad.rwd.data;

import com.tnkfactory.ad.a.a0;
import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SessionInfo {
    private String adid;
    private boolean adidLimited;
    private String appVersion;
    private String applicationId;
    private String cnYn;
    private int coppa;
    private String deviceCountryCode;
    private String deviceId;
    private String deviceLanguage;
    private String deviceModel;
    private String deviceOsVersion;
    private int deviceTimezone;
    private boolean doTracking;
    private String errorMessage;
    private float fontScale;
    private int gdpr;
    private String getAllExtraMarkets;
    private boolean hasMediaActivity;
    private boolean hasOlleh;
    private boolean hasOzStore;
    private boolean hasTStore;
    private String id1;
    private String installMarket;
    private boolean isTablet;
    private String mediaUserName;
    private String networkOperator;
    private String osVersionCode;
    private String packageName;
    private long prevAppId;
    private String rootYn;
    private int screenResolution;
    private float screenScale;
    private float sizeFactor;
    private String subAppId;
    private String udid;
    private boolean useSsl;
    private int userAge;
    private String userCat;
    private String userCatExt;
    private String userSex;
    private String vmYn;
    private String widevineIdL1;
    private String widevineIdL3;

    public SessionInfo() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, 0L, false, null, null, null, 0, null, null, 0, 0, false, false, false, false, false, false, false, null, null, null, null, 0, 0.0f, 0.0f, 0.0f, null, -1, 1023, null);
    }

    public final String component1() {
        return this.applicationId;
    }

    public final int component10() {
        return this.deviceTimezone;
    }

    public final String component11() {
        return this.deviceId;
    }

    public final String component12() {
        return this.udid;
    }

    public final String component13() {
        return this.adid;
    }

    public final String component14() {
        return this.widevineIdL1;
    }

    public final String component15() {
        return this.widevineIdL3;
    }

    public final String component16() {
        return this.id1;
    }

    public final long component17() {
        return this.prevAppId;
    }

    public final boolean component18() {
        return this.isTablet;
    }

    public final String component19() {
        return this.networkOperator;
    }

    public final String component2() {
        return this.subAppId;
    }

    public final String component20() {
        return this.mediaUserName;
    }

    public final String component21() {
        return this.userSex;
    }

    public final int component22() {
        return this.userAge;
    }

    public final String component23() {
        return this.userCat;
    }

    public final String component24() {
        return this.userCatExt;
    }

    public final int component25() {
        return this.coppa;
    }

    public final int component26() {
        return this.gdpr;
    }

    public final boolean component27() {
        return this.hasTStore;
    }

    public final boolean component28() {
        return this.hasOlleh;
    }

    public final boolean component29() {
        return this.hasOzStore;
    }

    public final String component3() {
        return this.packageName;
    }

    public final boolean component30() {
        return this.doTracking;
    }

    public final boolean component31() {
        return this.adidLimited;
    }

    public final boolean component32() {
        return this.useSsl;
    }

    public final boolean component33() {
        return this.hasMediaActivity;
    }

    public final String component34() {
        return this.installMarket;
    }

    public final String component35() {
        return this.rootYn;
    }

    public final String component36() {
        return this.vmYn;
    }

    public final String component37() {
        return this.cnYn;
    }

    public final int component38() {
        return this.screenResolution;
    }

    public final float component39() {
        return this.screenScale;
    }

    public final String component4() {
        return this.appVersion;
    }

    public final float component40() {
        return this.fontScale;
    }

    public final float component41() {
        return this.sizeFactor;
    }

    public final String component42() {
        return this.errorMessage;
    }

    public final String component5() {
        return this.osVersionCode;
    }

    public final String component6() {
        return this.deviceModel;
    }

    public final String component7() {
        return this.deviceOsVersion;
    }

    public final String component8() {
        return this.deviceCountryCode;
    }

    public final String component9() {
        return this.deviceLanguage;
    }

    public final SessionInfo copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, int i2, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, long j, boolean z, @Nullable String str16, @Nullable String str17, @Nullable String str18, int i3, @Nullable String str19, @Nullable String str20, int i4, int i5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @Nullable String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, int i6, float f, float f2, float f3, @Nullable String str25) {
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        return new SessionInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, i2, str10, str11, str12, str13, str14, str15, j, z, str16, str17, str18, i3, str19, str20, i4, i5, z2, z3, z4, z5, z6, z7, z8, str21, str22, str23, str24, i6, f, f2, f3, str25);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return Intrinsics.areEqual(this.applicationId, sessionInfo.applicationId) && Intrinsics.areEqual(this.subAppId, sessionInfo.subAppId) && Intrinsics.areEqual(this.packageName, sessionInfo.packageName) && Intrinsics.areEqual(this.appVersion, sessionInfo.appVersion) && Intrinsics.areEqual(this.osVersionCode, sessionInfo.osVersionCode) && Intrinsics.areEqual(this.deviceModel, sessionInfo.deviceModel) && Intrinsics.areEqual(this.deviceOsVersion, sessionInfo.deviceOsVersion) && Intrinsics.areEqual(this.deviceCountryCode, sessionInfo.deviceCountryCode) && Intrinsics.areEqual(this.deviceLanguage, sessionInfo.deviceLanguage) && this.deviceTimezone == sessionInfo.deviceTimezone && Intrinsics.areEqual(this.deviceId, sessionInfo.deviceId) && Intrinsics.areEqual(this.udid, sessionInfo.udid) && Intrinsics.areEqual(this.adid, sessionInfo.adid) && Intrinsics.areEqual(this.widevineIdL1, sessionInfo.widevineIdL1) && Intrinsics.areEqual(this.widevineIdL3, sessionInfo.widevineIdL3) && Intrinsics.areEqual(this.id1, sessionInfo.id1) && this.prevAppId == sessionInfo.prevAppId && this.isTablet == sessionInfo.isTablet && Intrinsics.areEqual(this.networkOperator, sessionInfo.networkOperator) && Intrinsics.areEqual(this.mediaUserName, sessionInfo.mediaUserName) && Intrinsics.areEqual(this.userSex, sessionInfo.userSex) && this.userAge == sessionInfo.userAge && Intrinsics.areEqual(this.userCat, sessionInfo.userCat) && Intrinsics.areEqual(this.userCatExt, sessionInfo.userCatExt) && this.coppa == sessionInfo.coppa && this.gdpr == sessionInfo.gdpr && this.hasTStore == sessionInfo.hasTStore && this.hasOlleh == sessionInfo.hasOlleh && this.hasOzStore == sessionInfo.hasOzStore && this.doTracking == sessionInfo.doTracking && this.adidLimited == sessionInfo.adidLimited && this.useSsl == sessionInfo.useSsl && this.hasMediaActivity == sessionInfo.hasMediaActivity && Intrinsics.areEqual(this.installMarket, sessionInfo.installMarket) && Intrinsics.areEqual(this.rootYn, sessionInfo.rootYn) && Intrinsics.areEqual(this.vmYn, sessionInfo.vmYn) && Intrinsics.areEqual(this.cnYn, sessionInfo.cnYn) && this.screenResolution == sessionInfo.screenResolution && Float.compare(this.screenScale, sessionInfo.screenScale) == 0 && Float.compare(this.fontScale, sessionInfo.fontScale) == 0 && Float.compare(this.sizeFactor, sessionInfo.sizeFactor) == 0 && Intrinsics.areEqual(this.errorMessage, sessionInfo.errorMessage);
    }

    public final String getAdid() {
        return this.adid;
    }

    public final boolean getAdidLimited() {
        return this.adidLimited;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getCnYn() {
        return this.cnYn;
    }

    public final int getCoppa() {
        return this.coppa;
    }

    public final String getDeviceCountryCode() {
        return this.deviceCountryCode;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceLanguage() {
        return this.deviceLanguage;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOsVersion() {
        return this.deviceOsVersion;
    }

    public final int getDeviceTimezone() {
        return this.deviceTimezone;
    }

    public final boolean getDoTracking() {
        return this.doTracking;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final float getFontScale() {
        return this.fontScale;
    }

    public final int getGdpr() {
        return this.gdpr;
    }

    public final String getGetAllExtraMarkets() {
        StringBuilder sb = new StringBuilder();
        if (this.hasTStore) {
            sb.append("|T");
        }
        if (this.hasOlleh) {
            sb.append("|K");
        }
        if (this.hasOzStore) {
            sb.append("|O");
        }
        String string = sb.toString();
        Intrinsics.checkNotNull(string);
        if (string.length() <= 0) {
            return null;
        }
        String strSubstring = string.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final boolean getHasMediaActivity() {
        return this.hasMediaActivity;
    }

    public final boolean getHasOlleh() {
        return this.hasOlleh;
    }

    public final boolean getHasOzStore() {
        return this.hasOzStore;
    }

    public final boolean getHasTStore() {
        return this.hasTStore;
    }

    public final String getId1() {
        return this.id1;
    }

    public final String getInstallMarket() {
        return this.installMarket;
    }

    public final String getMediaUserName() {
        return this.mediaUserName;
    }

    public final String getNetworkOperator() {
        return this.networkOperator;
    }

    public final String getOsVersionCode() {
        return this.osVersionCode;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getPrevAppId() {
        return this.prevAppId;
    }

    public final String getRootYn() {
        return this.rootYn;
    }

    public final int getScreenResolution() {
        return this.screenResolution;
    }

    public final float getScreenScale() {
        return this.screenScale;
    }

    public final float getSizeFactor() {
        return this.sizeFactor;
    }

    public final String getSubAppId() {
        return this.subAppId;
    }

    public final String getUdid() {
        return this.udid;
    }

    public final boolean getUseSsl() {
        return this.useSsl;
    }

    public final int getUserAge() {
        return this.userAge;
    }

    public final String getUserCat() {
        return this.userCat;
    }

    public final String getUserCatExt() {
        return this.userCatExt;
    }

    public final String getUserSex() {
        return this.userSex;
    }

    public final String getVmYn() {
        return this.vmYn;
    }

    public final String getWidevineIdL1() {
        return this.widevineIdL1;
    }

    public final String getWidevineIdL3() {
        return this.widevineIdL3;
    }

    public int hashCode() {
        String str = this.applicationId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.subAppId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.packageName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.appVersion;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.osVersionCode;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.deviceModel;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.deviceOsVersion;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.deviceCountryCode;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.deviceLanguage;
        int iA = z.a(this.deviceTimezone, ((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 == null ? 0 : str9.hashCode())) * 31, 31);
        String str10 = this.deviceId;
        int iHashCode9 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.udid;
        int iHashCode10 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.adid;
        int iHashCode11 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.widevineIdL1;
        int iHashCode12 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.widevineIdL3;
        int iHashCode13 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.id1;
        int iA2 = a0.a(this.prevAppId, (((((((((((iA + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str15 == null ? 0 : str15.hashCode())) * 31, 31);
        int iHashCode14 = Boolean.hashCode(this.isTablet);
        String str16 = this.networkOperator;
        int iHashCode15 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.mediaUserName;
        int iHashCode16 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.userSex;
        int iA3 = z.a(this.userAge, (((((((iHashCode14 + iA2) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str18 == null ? 0 : str18.hashCode())) * 31, 31);
        String str19 = this.userCat;
        int iHashCode17 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.userCatExt;
        int iA4 = z.a(this.gdpr, z.a(this.coppa, (((iA3 + iHashCode17) * 31) + (str20 == null ? 0 : str20.hashCode())) * 31, 31), 31);
        int iHashCode18 = Boolean.hashCode(this.hasTStore);
        int iHashCode19 = Boolean.hashCode(this.hasOlleh);
        int iHashCode20 = Boolean.hashCode(this.hasOzStore);
        int iHashCode21 = Boolean.hashCode(this.doTracking);
        int iHashCode22 = Boolean.hashCode(this.adidLimited);
        int iHashCode23 = Boolean.hashCode(this.useSsl);
        int iHashCode24 = Boolean.hashCode(this.hasMediaActivity);
        String str21 = this.installMarket;
        int iA5 = z.a(this.screenResolution, b0.a(this.cnYn, b0.a(this.vmYn, b0.a(this.rootYn, (((iHashCode24 + ((iHashCode23 + ((iHashCode22 + ((iHashCode21 + ((iHashCode20 + ((iHashCode19 + ((iHashCode18 + iA4) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (str21 == null ? 0 : str21.hashCode())) * 31, 31), 31), 31), 31);
        int iHashCode25 = Float.hashCode(this.screenScale);
        int iHashCode26 = Float.hashCode(this.fontScale);
        int iHashCode27 = Float.hashCode(this.sizeFactor);
        String str22 = this.errorMessage;
        return ((iHashCode27 + ((iHashCode26 + ((iHashCode25 + iA5) * 31)) * 31)) * 31) + (str22 != null ? str22.hashCode() : 0);
    }

    public final boolean isTablet() {
        return this.isTablet;
    }

    public final void setAdid(@Nullable String str) {
        this.adid = str;
    }

    public final void setAdidLimited(boolean z) {
        this.adidLimited = z;
    }

    public final void setAppVersion(@Nullable String str) {
        this.appVersion = str;
    }

    public final void setApplicationId(@Nullable String str) {
        this.applicationId = str;
    }

    public final void setCnYn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cnYn = str;
    }

    public final void setCoppa(int i2) {
        this.coppa = i2;
    }

    public final void setDeviceCountryCode(@Nullable String str) {
        this.deviceCountryCode = str;
    }

    public final void setDeviceId(@Nullable String str) {
        this.deviceId = str;
    }

    public final void setDeviceLanguage(@Nullable String str) {
        this.deviceLanguage = str;
    }

    public final void setDeviceModel(@Nullable String str) {
        this.deviceModel = str;
    }

    public final void setDeviceOsVersion(@Nullable String str) {
        this.deviceOsVersion = str;
    }

    public final void setDeviceTimezone(int i2) {
        this.deviceTimezone = i2;
    }

    public final void setDoTracking(boolean z) {
        this.doTracking = z;
    }

    public final void setErrorMessage(@Nullable String str) {
        this.errorMessage = str;
    }

    public final void setFontScale(float f) {
        this.fontScale = f;
    }

    public final void setGdpr(int i2) {
        this.gdpr = i2;
    }

    public final void setGetAllExtraMarkets(@Nullable String str) {
        this.getAllExtraMarkets = str;
    }

    public final void setHasMediaActivity(boolean z) {
        this.hasMediaActivity = z;
    }

    public final void setHasOlleh(boolean z) {
        this.hasOlleh = z;
    }

    public final void setHasOzStore(boolean z) {
        this.hasOzStore = z;
    }

    public final void setHasTStore(boolean z) {
        this.hasTStore = z;
    }

    public final void setId1(@Nullable String str) {
        this.id1 = str;
    }

    public final void setInstallMarket(@Nullable String str) {
        this.installMarket = str;
    }

    public final void setMediaUserName(@Nullable String str) {
        this.mediaUserName = str;
    }

    public final void setNetworkOperator(@Nullable String str) {
        this.networkOperator = str;
    }

    public final void setOsVersionCode(@Nullable String str) {
        this.osVersionCode = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setPrevAppId(long j) {
        this.prevAppId = j;
    }

    public final void setRootYn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rootYn = str;
    }

    public final void setScreenResolution(int i2) {
        this.screenResolution = i2;
    }

    public final void setScreenScale(float f) {
        this.screenScale = f;
    }

    public final void setSizeFactor(float f) {
        this.sizeFactor = f;
    }

    public final void setSubAppId(@Nullable String str) {
        this.subAppId = str;
    }

    public final void setTablet(boolean z) {
        this.isTablet = z;
    }

    public final void setUdid(@Nullable String str) {
        this.udid = str;
    }

    public final void setUseSsl(boolean z) {
        this.useSsl = z;
    }

    public final void setUserAge(int i2) {
        this.userAge = i2;
    }

    public final void setUserCat(@Nullable String str) {
        this.userCat = str;
    }

    public final void setUserCatExt(@Nullable String str) {
        this.userCatExt = str;
    }

    public final void setUserSex(@Nullable String str) {
        this.userSex = str;
    }

    public final void setVmYn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.vmYn = str;
    }

    public final void setWidevineIdL1(@Nullable String str) {
        this.widevineIdL1 = str;
    }

    public final void setWidevineIdL3(@Nullable String str) {
        this.widevineIdL3 = str;
    }

    public String toString() {
        return "SessionInfo(applicationId=" + this.applicationId + ", subAppId=" + this.subAppId + ", packageName=" + this.packageName + ", appVersion=" + this.appVersion + ", osVersionCode=" + this.osVersionCode + ", deviceModel=" + this.deviceModel + ", deviceOsVersion=" + this.deviceOsVersion + ", deviceCountryCode=" + this.deviceCountryCode + ", deviceLanguage=" + this.deviceLanguage + ", deviceTimezone=" + this.deviceTimezone + ", deviceId=" + this.deviceId + ", udid=" + this.udid + ", adid=" + this.adid + ", widevineIdL1=" + this.widevineIdL1 + ", widevineIdL3=" + this.widevineIdL3 + ", id1=" + this.id1 + ", prevAppId=" + this.prevAppId + ", isTablet=" + this.isTablet + ", networkOperator=" + this.networkOperator + ", mediaUserName=" + this.mediaUserName + ", userSex=" + this.userSex + ", userAge=" + this.userAge + ", userCat=" + this.userCat + ", userCatExt=" + this.userCatExt + ", coppa=" + this.coppa + ", gdpr=" + this.gdpr + ", hasTStore=" + this.hasTStore + ", hasOlleh=" + this.hasOlleh + ", hasOzStore=" + this.hasOzStore + ", doTracking=" + this.doTracking + ", adidLimited=" + this.adidLimited + ", useSsl=" + this.useSsl + ", hasMediaActivity=" + this.hasMediaActivity + ", installMarket=" + this.installMarket + ", rootYn=" + this.rootYn + ", vmYn=" + this.vmYn + ", cnYn=" + this.cnYn + ", screenResolution=" + this.screenResolution + ", screenScale=" + this.screenScale + ", fontScale=" + this.fontScale + ", sizeFactor=" + this.sizeFactor + ", errorMessage=" + this.errorMessage + ")";
    }

    public SessionInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, int i2, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, long j, boolean z, @Nullable String str16, @Nullable String str17, @Nullable String str18, int i3, @Nullable String str19, @Nullable String str20, int i4, int i5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @Nullable String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, int i6, float f, float f2, float f3, @Nullable String str25) {
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        this.applicationId = str;
        this.subAppId = str2;
        this.packageName = str3;
        this.appVersion = str4;
        this.osVersionCode = str5;
        this.deviceModel = str6;
        this.deviceOsVersion = str7;
        this.deviceCountryCode = str8;
        this.deviceLanguage = str9;
        this.deviceTimezone = i2;
        this.deviceId = str10;
        this.udid = str11;
        this.adid = str12;
        this.widevineIdL1 = str13;
        this.widevineIdL3 = str14;
        this.id1 = str15;
        this.prevAppId = j;
        this.isTablet = z;
        this.networkOperator = str16;
        this.mediaUserName = str17;
        this.userSex = str18;
        this.userAge = i3;
        this.userCat = str19;
        this.userCatExt = str20;
        this.coppa = i4;
        this.gdpr = i5;
        this.hasTStore = z2;
        this.hasOlleh = z3;
        this.hasOzStore = z4;
        this.doTracking = z5;
        this.adidLimited = z6;
        this.useSsl = z7;
        this.hasMediaActivity = z8;
        this.installMarket = str21;
        this.rootYn = str22;
        this.vmYn = str23;
        this.cnYn = str24;
        this.screenResolution = i6;
        this.screenScale = f;
        this.fontScale = f2;
        this.sizeFactor = f3;
        this.errorMessage = str25;
    }

    public /* synthetic */ SessionInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, String str10, String str11, String str12, String str13, String str14, String str15, long j, boolean z, String str16, String str17, String str18, int i3, String str19, String str20, int i4, int i5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str21, String str22, String str23, String str24, int i6, float f, float f2, float f3, String str25, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : str6, (i7 & 64) != 0 ? null : str7, (i7 & 128) != 0 ? null : str8, (i7 & 256) != 0 ? null : str9, (i7 & 512) != 0 ? 0 : i2, (i7 & 1024) != 0 ? null : str10, (i7 & 2048) != 0 ? null : str11, (i7 & 4096) != 0 ? "" : str12, (i7 & 8192) != 0 ? null : str13, (i7 & 16384) != 0 ? null : str14, (i7 & 32768) != 0 ? null : str15, (i7 & 65536) != 0 ? 0L : j, (i7 & 131072) != 0 ? false : z, (i7 & 262144) != 0 ? null : str16, (i7 & 524288) != 0 ? null : str17, (i7 & 1048576) != 0 ? null : str18, (i7 & 2097152) != 0 ? -1 : i3, (i7 & 4194304) != 0 ? null : str19, (i7 & 8388608) != 0 ? null : str20, (i7 & 16777216) != 0 ? 0 : i4, (i7 & 33554432) == 0 ? i5 : -1, (i7 & 67108864) != 0 ? false : z2, (i7 & 134217728) != 0 ? false : z3, (i7 & 268435456) != 0 ? false : z4, (i7 & 536870912) != 0 ? false : z5, (i7 & 1073741824) != 0 ? false : z6, (i7 & Integer.MIN_VALUE) != 0 ? true : z7, (i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? null : str21, (i8 & 4) != 0 ? "N" : str22, (i8 & 8) != 0 ? "N" : str23, (i8 & 16) == 0 ? str24 : "N", (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 1.0f : f, (i8 & 128) == 0 ? f2 : 1.0f, (i8 & 256) != 0 ? 320.0f : f3, (i8 & 512) != 0 ? null : str25);
    }
}
