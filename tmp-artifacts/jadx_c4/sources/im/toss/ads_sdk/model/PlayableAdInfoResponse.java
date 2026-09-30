package im.toss.ads_sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PlayableAdInfoResponse implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final AppInfo app;
    private final NativeAdsDto.Creative.EndCard endCard;
    private final String htmlUrl;
    private final IosAppInstallInfo iosAppInstall;
    private final String landingUrl;
    private final String mraidJsUrl;
    private final String shareLinkBaseUrl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PlayableAdInfoResponse> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<PlayableAdInfoResponse> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PlayableAdInfoResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            PlayableAdInfoResponse playableAdInfoResponseOnExtraCallback = onExtraCallback(parcel);
            int i4 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return playableAdInfoResponseOnExtraCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PlayableAdInfoResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onNavigationEvent(i);
            }
            onNavigationEvent(i);
            throw null;
        }

        public final PlayableAdInfoResponse onExtraCallback(Parcel parcel) {
            AppInfo appInfoCreateFromParcel;
            IosAppInstallInfo iosAppInstallInfoCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                appInfoCreateFromParcel = null;
            } else {
                appInfoCreateFromParcel = AppInfo.CREATOR.createFromParcel(parcel);
            }
            AppInfo appInfo = appInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                int i3 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                iosAppInstallInfoCreateFromParcel = null;
            } else {
                iosAppInstallInfoCreateFromParcel = IosAppInstallInfo.CREATOR.createFromParcel(parcel);
            }
            return new PlayableAdInfoResponse(string, string2, string3, string4, appInfo, iosAppInstallInfoCreateFromParcel, parcel.readInt() != 0 ? NativeAdsDto.Creative.EndCard.CREATOR.createFromParcel(parcel) : null);
        }

        public final PlayableAdInfoResponse[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            PlayableAdInfoResponse[] playableAdInfoResponseArr = new PlayableAdInfoResponse[i];
            int i6 = i3 + 3;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return playableAdInfoResponseArr;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 105;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public PlayableAdInfoResponse() {
        this((String) null, (String) null, (String) null, (String) null, (AppInfo) null, (IosAppInstallInfo) null, (NativeAdsDto.Creative.EndCard) null, 127, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayableAdInfoResponse)) {
            return false;
        }
        PlayableAdInfoResponse playableAdInfoResponse = (PlayableAdInfoResponse) obj;
        if (!Intrinsics.areEqual(this.htmlUrl, playableAdInfoResponse.htmlUrl)) {
            int i3 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.landingUrl, playableAdInfoResponse.landingUrl) || !Intrinsics.areEqual(this.mraidJsUrl, playableAdInfoResponse.mraidJsUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.shareLinkBaseUrl, playableAdInfoResponse.shareLinkBaseUrl)) {
            int i5 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.app, playableAdInfoResponse.app)) {
            return false;
        }
        if (Intrinsics.areEqual(this.iosAppInstall, playableAdInfoResponse.iosAppInstall)) {
            return Intrinsics.areEqual(this.endCard, playableAdInfoResponse.endCard);
        }
        int i7 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 65 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.htmlUrl.hashCode();
        int iHashCode3 = this.landingUrl.hashCode();
        String str = this.mraidJsUrl;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.shareLinkBaseUrl;
        if (str2 == null) {
            int i4 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        AppInfo appInfo = this.app;
        int iHashCode5 = appInfo == null ? 0 : appInfo.hashCode();
        IosAppInstallInfo iosAppInstallInfo = this.iosAppInstall;
        int iHashCode6 = iosAppInstallInfo == null ? 0 : iosAppInstallInfo.hashCode();
        NativeAdsDto.Creative.EndCard endCard = this.endCard;
        int iHashCode7 = (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (endCard != null ? endCard.hashCode() : 0);
        int i6 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return iHashCode7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlayableAdInfoResponse(htmlUrl=" + this.htmlUrl + ", landingUrl=" + this.landingUrl + ", mraidJsUrl=" + this.mraidJsUrl + ", shareLinkBaseUrl=" + this.shareLinkBaseUrl + ", app=" + this.app + ", iosAppInstall=" + this.iosAppInstall + ", endCard=" + this.endCard + ")";
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059 A[PHI: r1
      0x0059: PHI (r1v16 im.toss.ads_sdk.model.AppInfo) = (r1v8 im.toss.ads_sdk.model.AppInfo), (r1v21 im.toss.ads_sdk.model.AppInfo) binds: [B:8:0x004a, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        AppInfo appInfo;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.htmlUrl);
            parcel.writeString(this.landingUrl);
            parcel.writeString(this.mraidJsUrl);
            parcel.writeString(this.shareLinkBaseUrl);
            appInfo = this.app;
            int i4 = 97 / 0;
            if (appInfo == null) {
                int i5 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                appInfo.writeToParcel(parcel, i);
            }
        } else {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.htmlUrl);
            parcel.writeString(this.landingUrl);
            parcel.writeString(this.mraidJsUrl);
            parcel.writeString(this.shareLinkBaseUrl);
            appInfo = this.app;
            if (appInfo == null) {
            }
        }
        IosAppInstallInfo iosAppInstallInfo = this.iosAppInstall;
        if (iosAppInstallInfo == null) {
            int i7 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iosAppInstallInfo.writeToParcel(parcel, i);
        }
        NativeAdsDto.Creative.EndCard endCard = this.endCard;
        if (endCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            endCard.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlayableAdInfoResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            PlayableAdInfoResponse$$serializer playableAdInfoResponse$$serializer = PlayableAdInfoResponse$$serializer.INSTANCE;
            if (i3 == 0) {
                return playableAdInfoResponse$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ PlayableAdInfoResponse(int i, String str, String str2, String str3, String str4, AppInfo appInfo, IosAppInstallInfo iosAppInstallInfo, NativeAdsDto.Creative.EndCard endCard, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.htmlUrl = "";
            int i2 = 2 % 2;
        } else {
            this.htmlUrl = str;
        }
        if ((i & 2) == 0) {
            int i3 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.landingUrl = "";
        } else {
            this.landingUrl = str2;
            int i5 = 2 % 2;
        }
        Object obj = null;
        if ((i & 4) == 0) {
            int i6 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            this.mraidJsUrl = null;
        } else {
            this.mraidJsUrl = str3;
        }
        if ((i & 8) == 0) {
            int i8 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            this.shareLinkBaseUrl = null;
            if (i9 != 0) {
                throw null;
            }
            int i10 = 2 % 2;
        } else {
            this.shareLinkBaseUrl = str4;
        }
        if ((i & 16) == 0) {
            this.app = null;
        } else {
            this.app = appInfo;
        }
        if ((i & 32) == 0) {
            int i11 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            this.iosAppInstall = null;
            if (i12 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.iosAppInstall = iosAppInstallInfo;
            int i13 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 % 2;
            }
        }
        if ((i & 64) == 0) {
            this.endCard = null;
        } else {
            this.endCard = endCard;
        }
    }

    public PlayableAdInfoResponse(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable AppInfo appInfo, @Nullable IosAppInstallInfo iosAppInstallInfo, @Nullable NativeAdsDto.Creative.EndCard endCard) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.htmlUrl = str;
        this.landingUrl = str2;
        this.mraidJsUrl = str3;
        this.shareLinkBaseUrl = str4;
        this.app = appInfo;
        this.iosAppInstall = iosAppInstallInfo;
        this.endCard = endCard;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(PlayableAdInfoResponse playableAdInfoResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(playableAdInfoResponse.htmlUrl, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, playableAdInfoResponse.htmlUrl);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(playableAdInfoResponse.landingUrl, "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, playableAdInfoResponse.landingUrl);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 17 / 0;
                if (playableAdInfoResponse.mraidJsUrl != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, playableAdInfoResponse.mraidJsUrl);
                }
            } else if (playableAdInfoResponse.mraidJsUrl != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || playableAdInfoResponse.shareLinkBaseUrl != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, playableAdInfoResponse.shareLinkBaseUrl);
            int i6 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || playableAdInfoResponse.app != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, AppInfo$$serializer.INSTANCE, playableAdInfoResponse.app);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i8 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            IosAppInstallInfo iosAppInstallInfo = playableAdInfoResponse.iosAppInstall;
            if (i9 == 0) {
                int i10 = 24 / 0;
                if (iosAppInstallInfo != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, IosAppInstallInfo$$serializer.INSTANCE, playableAdInfoResponse.iosAppInstall);
                }
            } else if (iosAppInstallInfo != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || playableAdInfoResponse.endCard != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, NativeAdsDto$Creative$EndCard$$serializer.INSTANCE, playableAdInfoResponse.endCard);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PlayableAdInfoResponse(String str, String str2, String str3, String str4, AppInfo appInfo, IosAppInstallInfo iosAppInstallInfo, NativeAdsDto.Creative.EndCard endCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        IosAppInstallInfo iosAppInstallInfo2;
        String str7 = "";
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                endCard.hashCode();
                throw null;
            }
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            int i6 = 2 % 2;
            str6 = null;
        } else {
            str6 = str4;
        }
        AppInfo appInfo2 = (i & 16) != 0 ? null : appInfo;
        if ((i & 32) != 0) {
            int i7 = 2 % 2;
            iosAppInstallInfo2 = null;
        } else {
            iosAppInstallInfo2 = iosAppInstallInfo;
        }
        this(str, str7, str5, str6, appInfo2, iosAppInstallInfo2, (i & 64) == 0 ? endCard : null);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.htmlUrl;
        int i5 = i3 + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.landingUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            str = this.mraidJsUrl;
            int i4 = 85 / 0;
        } else {
            str = this.mraidJsUrl;
        }
        int i5 = i3 + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.shareLinkBaseUrl;
        int i5 = i3 + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final NativeAdsDto.Creative.EndCard onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        NativeAdsDto.Creative.EndCard endCard = this.endCard;
        int i5 = i2 + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return endCard;
    }
}
