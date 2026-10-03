package viva.republica.toss.network.model.transfer;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.EncryptedContentInfoParser;
import o.KeyBoardVisiblePoint;
import o.PageShowPoint;
import o.ParamImpl;
import o.Plugin;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UST_PKCS12_MakePFX_WINS;
import o.UST_TSA_RequestTimeStampWithHash;
import o.access15300;
import o.checkNavigationBarBySystemProperties;
import o.checkNavigationBarByWindowManagerService;
import o.followRedirects;
import o.getLongName;
import o.getSignForPKCS7V2;
import o.hasCurrentActivity;
import o.htf31;
import o.liq;
import o.logCrossPromoteImpression;
import o.mergeParams;
import o.nSetPosition;
import o.okycx;
import o.onCollectWhenDestroy;
import o.onDisclaimerClick;
import o.readIntokhttp;
import o.send;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.MyAccountInfo;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MyAccountInfo implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String accountDescription;
    private final String accountNo;
    private TransferBalance balanceInfo;
    private final int bankCode;
    private final String iconUrl;
    private final String invalidMessage;
    private final boolean isPrimaryAccount;
    private boolean isRecommendedAccount;
    private final String key;
    private final String name;
    private final Boolean selected;
    private final String withdrawDescription;
    private final WithDrawalStatus withdrawalStatus;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MyAccountInfo> CREATOR = new onNavigationEvent();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.MyAccountInfo$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = MyAccountInfo.onNavigationEvent();
            int i4 = onExtraCallback + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnNavigationEvent;
            }
            throw null;
        }
    }), null, null, null, null};

    public static final class onNavigationEvent implements Parcelable.Creator<MyAccountInfo> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ MyAccountInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            MyAccountInfo myAccountInfoOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return myAccountInfoOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ MyAccountInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback(i);
                throw null;
            }
            MyAccountInfo[] myAccountInfoArrOnExtraCallback = onExtraCallback(i);
            int i4 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return myAccountInfoArrOnExtraCallback;
        }

        public final MyAccountInfo[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i3 % 128;
            MyAccountInfo[] myAccountInfoArr = new MyAccountInfo[i];
            if (i3 % 2 != 0) {
                return myAccountInfoArr;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final viva.republica.toss.network.model.transfer.MyAccountInfo onNavigationEvent(android.os.Parcel r17) {
            /*
                r16 = this;
                r0 = r17
                r1 = 2
                int r2 = r1 % r1
                int r2 = viva.republica.toss.network.model.transfer.MyAccountInfo.onNavigationEvent.onWarmupCompleted
                int r2 = r2 + 73
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.MyAccountInfo.onNavigationEvent.onExtraCallbackWithResult = r3
                int r2 = r2 % r1
                java.lang.String r2 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
                java.lang.String r4 = r17.readString()
                int r5 = r17.readInt()
                java.lang.String r6 = r17.readString()
                java.lang.String r7 = r17.readString()
                java.lang.String r8 = r17.readString()
                java.lang.String r9 = r17.readString()
                java.lang.String r10 = r17.readString()
                int r2 = r17.readInt()
                r11 = 0
                if (r2 == 0) goto L38
                r2 = 1
                goto L39
            L38:
                r2 = r11
            L39:
                java.lang.String r12 = r17.readString()
                viva.republica.toss.network.model.transfer.MyAccountInfo$WithDrawalStatus r12 = viva.republica.toss.network.model.transfer.MyAccountInfo.WithDrawalStatus.valueOf(r12)
                int r13 = r17.readInt()
                r14 = 0
                if (r13 != 0) goto L4a
                r13 = r14
                goto L59
            L4a:
                android.os.Parcelable$Creator<viva.republica.toss.network.model.transfer.TransferBalance> r13 = viva.republica.toss.network.model.transfer.TransferBalance.CREATOR
                java.lang.Object r13 = r13.createFromParcel(r0)
                int r15 = viva.republica.toss.network.model.transfer.MyAccountInfo.onNavigationEvent.onWarmupCompleted
                int r15 = r15 + 125
                int r3 = r15 % 128
                viva.republica.toss.network.model.transfer.MyAccountInfo.onNavigationEvent.onExtraCallbackWithResult = r3
                int r15 = r15 % r1
            L59:
                viva.republica.toss.network.model.transfer.TransferBalance r13 = (viva.republica.toss.network.model.transfer.TransferBalance) r13
                java.lang.String r15 = r17.readString()
                int r3 = r17.readInt()
                if (r3 != 0) goto L75
                int r0 = viva.republica.toss.network.model.transfer.MyAccountInfo.onNavigationEvent.onExtraCallbackWithResult
                int r0 = r0 + 69
                int r3 = r0 % 128
                viva.republica.toss.network.model.transfer.MyAccountInfo.onNavigationEvent.onWarmupCompleted = r3
                int r0 = r0 % r1
                if (r0 == 0) goto L73
                r0 = 72
                int r0 = r0 / r11
            L73:
                r0 = r14
                goto L8e
            L75:
                int r0 = r17.readInt()
                if (r0 != 0) goto L89
                int r0 = viva.republica.toss.network.model.transfer.MyAccountInfo.onNavigationEvent.onWarmupCompleted
                int r0 = r0 + 95
                int r3 = r0 % 128
                viva.republica.toss.network.model.transfer.MyAccountInfo.onNavigationEvent.onExtraCallbackWithResult = r3
                int r0 = r0 % r1
                if (r0 != 0) goto L87
                goto L89
            L87:
                r3 = r11
                goto L8a
            L89:
                r3 = 1
            L8a:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            L8e:
                viva.republica.toss.network.model.transfer.MyAccountInfo r1 = new viva.republica.toss.network.model.transfer.MyAccountInfo
                r3 = r1
                r11 = r2
                r14 = r15
                r15 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.MyAccountInfo.onNavigationEvent.onNavigationEvent(android.os.Parcel):viva.republica.toss.network.model.transfer.MyAccountInfo");
        }
    }

    private static final /* synthetic */ KSerializer onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        WithDrawalStatus.Companion companion = WithDrawalStatus.Companion;
        if (i3 != 0) {
            return companion.serializer();
        }
        companion.serializer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnMessageChannelReady = onMessageChannelReady();
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnMessageChannelReady;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i2)) | (~(i6 | i2));
        int i9 = i6 | i5;
        int i10 = (~(i5 | (~i2))) | (~(i7 | (~i6))) | (~i9);
        int i11 = i6 + i2 + i3 + (1350191703 * i) + ((-44904237) * i4);
        int i12 = i11 * i11;
        int i13 = ((i6 * (-560584373)) - 948043776) + ((-560584373) * i2) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i3) + ((-71041024) * i) + ((-766246912) * i4) + (1339949056 * i12);
        int i14 = (i6 * 1657715387) + 2046152777 + (i2 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i3 * 1657716305) + (i * 1507858311) + (i4 * 1845144771) + (i12 * 155058176);
        switch (i13 + (i14 * i14 * 417464320)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                boolean z = false;
                MyAccountInfo myAccountInfo = (MyAccountInfo) objArr[0];
                int i15 = 2 % 2;
                TransferBalance transferBalance = myAccountInfo.balanceInfo;
                if (transferBalance == null) {
                    int i16 = IAuthTabCallback + 25;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    return false;
                }
                Intrinsics.checkNotNull(transferBalance);
                if (transferBalance.IAuthTabCallback() >= 0) {
                    TransferBalance transferBalance2 = myAccountInfo.balanceInfo;
                    Intrinsics.checkNotNull(transferBalance2);
                    int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                    int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                    if (((Long) TransferBalance.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1585013849, iIAuthTabCallback2, new Object[]{transferBalance2}, -1585013849, iIAuthTabCallback)).longValue() >= 0) {
                        int i18 = IAuthTabCallback + 89;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = this.key.hashCode();
        int iHashCode6 = Integer.hashCode(this.bankCode);
        int iHashCode7 = this.accountNo.hashCode();
        int iHashCode8 = this.name.hashCode();
        String str = this.accountDescription;
        if (str == null) {
            int i2 = IAuthTabCallback + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.withdrawDescription;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconUrl;
        if (str3 == null) {
            int i4 = IAuthTabCallback + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        int iHashCode10 = Boolean.hashCode(this.isPrimaryAccount);
        int iHashCode11 = this.withdrawalStatus.hashCode();
        TransferBalance transferBalance = this.balanceInfo;
        if (transferBalance == null) {
            int i6 = onExtraCallback + 123;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = transferBalance.hashCode();
        }
        String str4 = this.invalidMessage;
        if (str4 == null) {
            int i8 = IAuthTabCallback + 79;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        Boolean bool = this.selected;
        return (((((((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MyAccountInfo(key=" + this.key + ", bankCode=" + this.bankCode + ", accountNo=" + this.accountNo + ", name=" + this.name + ", accountDescription=" + this.accountDescription + ", withdrawDescription=" + this.withdrawDescription + ", iconUrl=" + this.iconUrl + ", isPrimaryAccount=" + this.isPrimaryAccount + ", withdrawalStatus=" + this.withdrawalStatus + ", balanceInfo=" + this.balanceInfo + ", invalidMessage=" + this.invalidMessage + ", selected=" + this.selected + ")";
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeInt(this.bankCode);
        parcel.writeString(this.accountNo);
        parcel.writeString(this.name);
        parcel.writeString(this.accountDescription);
        parcel.writeString(this.withdrawDescription);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.isPrimaryAccount ? 1 : 0);
        parcel.writeString(this.withdrawalStatus.name());
        TransferBalance transferBalance = this.balanceInfo;
        if (transferBalance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferBalance.writeToParcel(parcel, i);
        }
        parcel.writeString(this.invalidMessage);
        Boolean bool = this.selected;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            return;
        }
        int i5 = IAuthTabCallback + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MyAccountInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            MyAccountInfo$$serializer myAccountInfo$$serializer = MyAccountInfo$$serializer.INSTANCE;
            int i4 = onExtraCallback + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 91 / 0;
            }
            return myAccountInfo$$serializer;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 14 / 0;
        }
    }

    public /* synthetic */ MyAccountInfo(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, boolean z, WithDrawalStatus withDrawalStatus, TransferBalance transferBalance, String str7, Boolean bool, boolean z2, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i3 = onExtraCallback + 35;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 0, MyAccountInfo$$serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 1, MyAccountInfo$$serializer.INSTANCE.getDescriptor());
            }
        }
        this.key = str;
        if ((i & 2) == 0) {
            this.bankCode = 0;
        } else {
            this.bankCode = i2;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.accountNo = "";
        } else {
            this.accountNo = str2;
        }
        if ((i & 8) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        Object obj = null;
        if ((i & 16) == 0) {
            this.accountDescription = null;
        } else {
            this.accountDescription = str4;
        }
        if ((i & 32) == 0) {
            this.withdrawDescription = null;
        } else {
            this.withdrawDescription = str5;
        }
        if ((i & 64) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str6;
            int i5 = 2 % 2;
        }
        if ((i & 128) == 0) {
            int i6 = onExtraCallback + 121;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            this.isPrimaryAccount = false;
        } else {
            this.isPrimaryAccount = z;
        }
        if ((i & 256) == 0) {
            int i8 = onExtraCallback + 71;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                this.withdrawalStatus = WithDrawalStatus.REGISTERED;
                int i9 = 2 % 2;
            } else {
                this.withdrawalStatus = WithDrawalStatus.REGISTERED;
                obj.hashCode();
                throw null;
            }
        } else {
            this.withdrawalStatus = withDrawalStatus;
        }
        if ((i & 512) == 0) {
            this.balanceInfo = null;
        } else {
            this.balanceInfo = transferBalance;
            int i10 = 2 % 2;
        }
        if ((i & 1024) == 0) {
            int i11 = onExtraCallback + 121;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            this.invalidMessage = null;
        } else {
            this.invalidMessage = str7;
        }
        if ((i & 2048) == 0) {
            this.selected = null;
        } else {
            this.selected = bool;
        }
        if ((i & 4096) == 0) {
            this.isRecommendedAccount = false;
        } else {
            this.isRecommendedAccount = z2;
        }
    }

    public MyAccountInfo(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z, @NotNull WithDrawalStatus withDrawalStatus, @Nullable TransferBalance transferBalance, @Nullable String str7, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(withDrawalStatus, "");
        this.key = str;
        this.bankCode = i;
        this.accountNo = str2;
        this.name = str3;
        this.accountDescription = str4;
        this.withdrawDescription = str5;
        this.iconUrl = str6;
        this.isPrimaryAccount = z;
        this.withdrawalStatus = withDrawalStatus;
        this.balanceInfo = transferBalance;
        this.invalidMessage = str7;
        this.selected = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallbackStub(java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.MyAccountInfo.IAuthTabCallbackStub(java.lang.Object[]):java.lang.Object");
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 125;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MyAccountInfo(String str, int i, String str2, String str3, String str4, String str5, String str6, boolean z, WithDrawalStatus withDrawalStatus, TransferBalance transferBalance, String str7, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        String str8;
        String str9;
        WithDrawalStatus withDrawalStatus2;
        TransferBalance transferBalance2;
        String str10;
        if ((i2 & 2) != 0) {
            int i4 = 2 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        String str11 = "";
        String str12 = (i2 & 4) != 0 ? "" : str2;
        if ((i2 & 8) != 0) {
            int i5 = onExtraCallback + 5;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } else {
            str11 = str3;
        }
        String str13 = (i2 & 16) != 0 ? null : str4;
        if ((i2 & 32) != 0) {
            int i6 = onExtraCallback + 85;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str8 = null;
        } else {
            str8 = str5;
        }
        if ((i2 & 64) != 0) {
            int i9 = onExtraCallback + 77;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 2;
            }
            str9 = null;
        } else {
            str9 = str6;
        }
        boolean z2 = (i2 & 128) == 0 ? z : false;
        if ((i2 & 256) != 0) {
            int i11 = onExtraCallback + 117;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                WithDrawalStatus withDrawalStatus3 = WithDrawalStatus.REGISTERED;
                bool.hashCode();
                throw null;
            }
            withDrawalStatus2 = WithDrawalStatus.REGISTERED;
            int i12 = 2 % 2;
        } else {
            withDrawalStatus2 = withDrawalStatus;
        }
        if ((i2 & 512) != 0) {
            int i13 = onExtraCallback + 1;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            transferBalance2 = null;
        } else {
            transferBalance2 = transferBalance;
        }
        if ((i2 & 1024) != 0) {
            int i15 = onExtraCallback + 101;
            int i16 = i15 % 128;
            IAuthTabCallback = i16;
            int i17 = i15 % 2;
            int i18 = i16 + 49;
            onExtraCallback = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 2 % 2;
            }
            str10 = null;
        } else {
            str10 = str7;
        }
        this(str, i3, str12, str11, str13, str8, str9, z2, withDrawalStatus2, transferBalance2, str10, (i2 & 2048) == 0 ? bool : null);
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.bankCode;
        int i5 = i3 + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountNo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MyAccountInfo myAccountInfo = (MyAccountInfo) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = myAccountInfo.name;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.accountDescription;
        int i5 = i3 + 85;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String ICustomTabsCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            str = this.withdrawDescription;
            int i4 = 79 / 0;
        } else {
            str = this.withdrawDescription;
        }
        int i5 = i3 + 37;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iconUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isPrimaryAccount;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return z;
    }

    public final WithDrawalStatus extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 27;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        WithDrawalStatus withDrawalStatus = this.withdrawalStatus;
        int i5 = i2 + 3;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return withDrawalStatus;
    }

    public final void IAuthTabCallback(@Nullable TransferBalance transferBalance) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.balanceInfo = transferBalance;
        int i5 = i2 + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransferBalance asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.balanceInfo;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.invalidMessage;
        int i5 = i3 + 5;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Boolean access100() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.selected;
        int i4 = i3 + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Object[] objArr2 = {followRedirects.onExtraCallbackWithResult};
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            throw null;
        }
        Object[] objArr3 = {followRedirects.onExtraCallbackWithResult};
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Context context = (Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr3, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i3 = IAuthTabCallback + 111;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return context;
        }
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.isRecommendedAccount = z;
        if (i4 != 0) {
            int i5 = 20 / 0;
        }
        int i6 = i2 + 121;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isRecommendedAccount;
        int i5 = i2 + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (obj instanceof MyAccountInfo) {
            return IAuthTabCallback(this, (MyAccountInfo) obj);
        }
        boolean zEquals = super.equals(obj);
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zEquals;
    }

    public final onCollectWhenDestroy asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!onMinimized()) {
            return onCollectWhenDestroy.BANK_ACCOUNT;
        }
        onCollectWhenDestroy oncollectwhendestroy = onCollectWhenDestroy.TOSS_ACCOUNT;
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return oncollectwhendestroy;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MyAccountInfo myAccountInfo = (MyAccountInfo) objArr[0];
        int i = 2 % 2;
        if (myAccountInfo.onMinimized()) {
            int i2 = onExtraCallback + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return PageShowPoint.Companion.onNavigationEvent(myAccountInfo.accountNo);
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback = PageShowPoint.Companion.onExtraCallback(String.valueOf(myAccountInfo.bankCode), myAccountInfo.accountNo);
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback;
    }

    public final boolean onMinimized() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(checkNavigationBarByWindowManagerService.TOSS);
        int i4 = IAuthTabCallback + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public final boolean onActivityLayout() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(checkNavigationBarByWindowManagerService.TOSS_BANK);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(checkNavigationBarByWindowManagerService.TOSS_BANK);
        int i3 = IAuthTabCallback + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnWarmupCompleted;
    }

    private final boolean onWarmupCompleted(checkNavigationBarByWindowManagerService checknavigationbarbywindowmanagerservice) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.areEqual(String.valueOf(this.bankCode), checknavigationbarbywindowmanagerservice.getCode());
            obj.hashCode();
            throw null;
        }
        boolean zAreEqual = Intrinsics.areEqual(String.valueOf(this.bankCode), checknavigationbarbywindowmanagerservice.getCode());
        int i3 = IAuthTabCallback + 27;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return zAreEqual;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.name.length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        if (str.length() != 0) {
            return str;
        }
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        String string = ((Context) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1147407457, iOnNavigationEvent2, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, 1147407460)).getString(R.string.app_transfer_my_account_info_dto_default_name);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = onExtraCallback + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static /* synthetic */ String onNavigationEvent(MyAccountInfo myAccountInfo, boolean z, long j, Long l, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (onExtraCallbackWithResult(myAccountInfo, 0L, 1, (Object) null) >= 0) {
                z = true;
            } else {
                int i7 = onExtraCallback + 7;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                z = false;
            }
        }
        if ((i & 2) != 0) {
            int i9 = onExtraCallback + 35;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            j = onExtraCallbackWithResult(myAccountInfo, 0L, 1, (Object) null);
        }
        if ((i & 4) != 0) {
            TransferBalance transferBalance = myAccountInfo.balanceInfo;
            l = transferBalance != null ? Long.valueOf(transferBalance.IAuthTabCallback()) : null;
        }
        return myAccountInfo.IAuthTabCallback(z, j, l);
    }

    public final String IAuthTabCallback(boolean z, long j, @Nullable Long l) {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (z) {
            int i5 = i2 + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (l == null || j != l.longValue()) {
                int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                string = ((Context) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1147407457, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, 1147407460)).getString(R.string.transfer_my_account_available_balance);
            } else {
                int i7 = onExtraCallback + 111;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                string = ((Context) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1147407457, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, 1147407460)).getString(R.string.transfer_my_account_balance);
            }
            Intrinsics.checkNotNull(string);
            return string + " " + getLongName.onNavigationEvent(j, (ParamImpl) null, 1, (Object) null);
        }
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        Configuration configuration = ((Context) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1147407457, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3, 1147407460)).getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (!readIntokhttp.IAuthTabCallback(configuration)) {
            return onWarmupCompleted();
        }
        String str = this.accountNo;
        int i9 = onExtraCallback + 55;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        String str = this.accountDescription;
        if (str != null) {
            int i2 = IAuthTabCallback + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                return this.accountDescription;
            }
        }
        if (!Intrinsics.areEqual(String.valueOf(this.bankCode), checkNavigationBarByWindowManagerService.TOSS.getCode())) {
            return getSignForPKCS7V2.onWarmupCompleted.asBinder(String.valueOf(this.bankCode)) + " " + this.accountNo;
        }
        int i4 = IAuthTabCallback + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            getSignForPKCS7V2.onWarmupCompleted.asBinder(String.valueOf(this.bankCode));
            boolean z = ((KeyBoardVisiblePoint) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1346435167, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1346435165)) instanceof onDisclaimerClick;
            ondisclaimerclick.hashCode();
            throw null;
        }
        String strAsBinder = getSignForPKCS7V2.onWarmupCompleted.asBinder(String.valueOf(this.bankCode));
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1346435167, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1346435165);
        ondisclaimerclick = keyBoardVisiblePoint instanceof onDisclaimerClick ? (onDisclaimerClick) keyBoardVisiblePoint : null;
        if (ondisclaimerclick == null) {
            return strAsBinder;
        }
        if (ondisclaimerclick.ICustomTabsCallbackDefault() || !(true ^ ondisclaimerclick.ICustomTabsCallbackStubProxy())) {
            strAsBinder = ((Context) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1147407457, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1147407460)).getString(R.string.toss_savingbox_account);
            Intrinsics.checkNotNullExpressionValue(strAsBinder, "");
        }
        if (!ondisclaimerclick.onUnminimized()) {
            return strAsBinder;
        }
        String string = ((Context) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1147407457, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1147407460)).getString(R.string.toss_joint_account);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ long onExtraCallbackWithResult(MyAccountInfo myAccountInfo, long j, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            TransferBalance transferBalance = myAccountInfo.balanceInfo;
            if (transferBalance != null) {
                int i3 = IAuthTabCallback + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                j = transferBalance.IAuthTabCallback();
                int i5 = onExtraCallback + 11;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                j = 0;
            }
        }
        Object[] objArr = {myAccountInfo, Long.valueOf(j)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return ((Long) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1445720812, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, iOnNavigationEvent, -1445720808)).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r13) {
        /*
            r0 = 0
            r1 = r13[r0]
            viva.republica.toss.network.model.transfer.MyAccountInfo r1 = (viva.republica.toss.network.model.transfer.MyAccountInfo) r1
            r2 = 1
            r13 = r13[r2]
            java.lang.Number r13 = (java.lang.Number) r13
            long r2 = r13.longValue()
            r13 = 2
            int r4 = r13 % r13
            int r4 = viva.republica.toss.network.model.transfer.MyAccountInfo.IAuthTabCallback
            int r4 = r4 + 21
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfo.onExtraCallback = r5
            int r4 = r4 % r13
            viva.republica.toss.network.model.transfer.TransferBalance r1 = r1.balanceInfo
            if (r4 != 0) goto L24
            r4 = 60
            int r4 = r4 / r0
            if (r1 == 0) goto L51
            goto L26
        L24:
            if (r1 == 0) goto L51
        L26:
            int r5 = r5 + 115
            int r0 = r5 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfo.IAuthTabCallback = r0
            int r5 = r5 % r13
            java.lang.Object[] r10 = new java.lang.Object[]{r1}
            int r12 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
            int r9 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
            int r7 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
            int r6 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
            r11 = -1707573645(0xffffffff9a387e73, float:-3.8152453E-23)
            r8 = 1707573646(0x65c7818e, float:1.177676E23)
            java.lang.Object r0 = viva.republica.toss.network.model.transfer.TransferBalance.onWarmupCompleted(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
        L51:
            int r0 = viva.republica.toss.network.model.transfer.MyAccountInfo.onExtraCallback
            int r0 = r0 + 67
            int r1 = r0 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfo.IAuthTabCallback = r1
            int r0 = r0 % r13
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.MyAccountInfo.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class WithDrawalStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WithDrawalStatus[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final WithDrawalStatus REGISTERED = new WithDrawalStatus("REGISTERED", 0);
        public static final WithDrawalStatus NEED_TO_REGISTER = new WithDrawalStatus("NEED_TO_REGISTER", 1);
        public static final WithDrawalStatus UN_REGISTRABLE = new WithDrawalStatus("UN_REGISTRABLE", 2);

        public static /* synthetic */ KSerializer $r8$lambda$7UaJUKIbmcM4sXAHxCQFSXm880k() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i4 = onWarmupCompleted + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializer_init_$_anonymous_;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ WithDrawalStatus[] $values() {
            WithDrawalStatus[] withDrawalStatusArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                WithDrawalStatus withDrawalStatus = REGISTERED;
                WithDrawalStatus withDrawalStatus2 = NEED_TO_REGISTER;
                WithDrawalStatus withDrawalStatus3 = UN_REGISTRABLE;
                withDrawalStatusArr = new WithDrawalStatus[5];
                withDrawalStatusArr[0] = withDrawalStatus;
                withDrawalStatusArr[0] = withDrawalStatus2;
                withDrawalStatusArr[3] = withDrawalStatus3;
            } else {
                withDrawalStatusArr = new WithDrawalStatus[]{REGISTERED, NEED_TO_REGISTER, UN_REGISTRABLE};
            }
            int i4 = i3 + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return withDrawalStatusArr;
        }

        public static EnumEntries<WithDrawalStatus> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            EnumEntries<WithDrawalStatus> enumEntries = $ENTRIES;
            int i5 = i3 + 121;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static WithDrawalStatus valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            WithDrawalStatus withDrawalStatus = (WithDrawalStatus) Enum.valueOf(WithDrawalStatus.class, str);
            if (i3 != 0) {
                int i4 = 95 / 0;
            }
            return withDrawalStatus;
        }

        public static WithDrawalStatus[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            WithDrawalStatus[] withDrawalStatusArr = (WithDrawalStatus[]) $VALUES.clone();
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return withDrawalStatusArr;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 15;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object value = WithDrawalStatus.access$get$cachedSerializer$delegate$cp().getValue();
                if (i3 == 0) {
                    return (KSerializer) value;
                }
                throw null;
            }

            public final KSerializer<WithDrawalStatus> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<WithDrawalStatus> kSerializerIAuthTabCallback = IAuthTabCallback();
                int i4 = onExtraCallback + 69;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private WithDrawalStatus(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.MyAccountInfo.WithDrawalStatus", values());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.MyAccountInfo.WithDrawalStatus", values());
            int i3 = onExtraCallback + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
            int i5 = i3 + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return lazy;
        }

        static {
            WithDrawalStatus[] withDrawalStatusArr$values = $values();
            $VALUES = withDrawalStatusArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(withDrawalStatusArr$values);
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.MyAccountInfo$WithDrawalStatus$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 97;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer$r8$lambda$7UaJUKIbmcM4sXAHxCQFSXm880k = MyAccountInfo.WithDrawalStatus.$r8$lambda$7UaJUKIbmcM4sXAHxCQFSXm880k();
                    int i4 = onWarmupCompleted + 57;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return kSerializer$r8$lambda$7UaJUKIbmcM4sXAHxCQFSXm880k;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            int i = onNavigationEvent + 33;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ RecomposerawaitIdle2.onNavigationEvent onExtraCallback(MyAccountInfo myAccountInfo, Context context, float f, boolean z, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallback + 61;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            f = 42.0f;
        }
        if ((i & 8) != 0) {
            int i5 = onExtraCallback + 41;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 73 / 0;
            }
            bool = null;
        }
        Object[] objArr = {myAccountInfo, context, Float.valueOf(f), Boolean.valueOf(z), bool};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (RecomposerawaitIdle2.onNavigationEvent) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -11437875, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, iOnNavigationEvent, 11437881);
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        boolean z = false;
        MyAccountInfo myAccountInfo = (MyAccountInfo) objArr[0];
        Context context = (Context) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        Boolean bool = (Boolean) objArr[4];
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.areEqual(bool, Boolean.TRUE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (Intrinsics.areEqual(bool, Boolean.TRUE) || (bool == null && myAccountInfo.isPrimaryAccount)) {
            int i3 = onExtraCallback + 17;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        }
        return (RecomposerawaitIdle2.onNavigationEvent) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1882831510, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{myAccountInfo, context, myAccountInfo.iconUrl, Boolean.valueOf(z), Float.valueOf(fFloatValue), Boolean.valueOf(zBooleanValue)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1882831510);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        float fFloatValue = ((Number) objArr[4]).floatValue();
        boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(str);
        if (!zBooleanValue2) {
            RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(fFloatValue, fFloatValue), new Plugin(fFloatValue, 0.0f, 0.0f, 0, 0, 30, (DefaultConstructorMarker) null)});
            return onnavigationeventOnExtraCallback;
        }
        float f = (40.0f * fFloatValue) / 42.0f;
        float f2 = fFloatValue / 42.0f;
        List listMutableListOf = CollectionsKt.mutableListOf(new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(f, f), new Plugin(f, 0.0f, 0.0f, 0, 0, 30, (DefaultConstructorMarker) null), new UST_PKCS12_MakePFX_WINS(0.0f, f2, (fFloatValue * 2.0f) / 42.0f, f2)});
        if (zBooleanValue) {
            listMutableListOf.add(new UST_TSA_RequestTimeStampWithHash());
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        RecomposerrecompositionRunner2.onWarmupCompleted(onnavigationeventOnExtraCallback, listMutableListOf);
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final checkNavigationBarBySystemProperties IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = send.Companion.onWarmupCompleted().onExtraCallback(String.valueOf(this.bankCode));
        int i4 = IAuthTabCallback + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return checknavigationbarbysystempropertiesOnExtraCallback;
        }
        throw null;
    }

    private final boolean onExtraCallback(String str, String str2, String str3, String str4) {
        String str5;
        int i = 2 % 2;
        hasCurrentActivity hascurrentactivity = hasCurrentActivity.IAuthTabCallback;
        if (str == null) {
            int i2 = IAuthTabCallback + 53;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 81;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            str = "";
        }
        if (str3 == null) {
            int i7 = IAuthTabCallback + 59;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 84 / 0;
            }
            str3 = "";
        }
        if (!hascurrentactivity.onExtraCallback(str, str3)) {
            return false;
        }
        String str6 = null;
        if (str2 != null) {
            str5 = (String) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1129674746, nSetPosition.onExtraCallbackWithResult(), -1129674745, new Object[]{str2});
        } else {
            int i9 = onExtraCallback + 71;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            str5 = null;
        }
        if (str4 != null) {
            int i11 = IAuthTabCallback + 27;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            Object[] objArr = {str4};
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
            if (i12 == 0) {
                throw null;
            }
            str6 = (String) mergeParams.onWarmupCompleted(iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, 1129674746, iOnExtraCallbackWithResult2, -1129674745, objArr);
        }
        return Intrinsics.areEqual(str5, str6);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean IAuthTabCallback(viva.republica.toss.network.model.transfer.MyAccountInfo r7, viva.republica.toss.network.model.transfer.MyAccountInfo r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.MyAccountInfo.IAuthTabCallback
            int r1 = r1 + 97
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfo.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L16
            r1 = 64
            int r1 = r1 / 0
            if (r7 == 0) goto L1f
            goto L18
        L16:
            if (r7 == 0) goto L1f
        L18:
            int r1 = r7.bankCode
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L20
        L1f:
            r1 = r2
        L20:
            if (r7 == 0) goto L3a
            int r3 = viva.republica.toss.network.model.transfer.MyAccountInfo.IAuthTabCallback
            int r4 = r3 + 39
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfo.onExtraCallback = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L37
            java.lang.String r7 = r7.accountNo
            int r3 = r3 + 29
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfo.onExtraCallback = r4
            int r3 = r3 % r0
            goto L3b
        L37:
            java.lang.String r7 = r7.accountNo
            throw r2
        L3a:
            r7 = r2
        L3b:
            if (r8 == 0) goto L4d
            int r3 = r8.bankCode
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = viva.republica.toss.network.model.transfer.MyAccountInfo.onExtraCallback
            int r4 = r4 + 73
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfo.IAuthTabCallback = r5
            int r4 = r4 % r0
            goto L4e
        L4d:
            r3 = r2
        L4e:
            if (r8 == 0) goto L63
            int r2 = viva.republica.toss.network.model.transfer.MyAccountInfo.onExtraCallback
            int r4 = r2 + 55
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfo.IAuthTabCallback = r5
            int r4 = r4 % r0
            java.lang.String r8 = r8.accountNo
            int r2 = r2 + 43
            int r4 = r2 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfo.IAuthTabCallback = r4
            int r2 = r2 % r0
            r2 = r8
        L63:
            boolean r7 = r6.onExtraCallback(r1, r7, r3, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.MyAccountInfo.IAuthTabCallback(viva.republica.toss.network.model.transfer.MyAccountInfo, viva.republica.toss.network.model.transfer.MyAccountInfo):boolean");
    }

    private final Context onActivityResized() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Context) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1147407457, iOnNavigationEvent2, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, 1147407460);
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(MyAccountInfo myAccountInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1317490221, iOnNavigationEvent2, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{myAccountInfo, vylVar, serialDescriptor}, iOnNavigationEvent, -1317490214);
    }

    public final long IAuthTabCallback(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return ((Long) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1445720812, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, iOnNavigationEvent, -1445720808)).longValue();
    }

    public final RecomposerawaitIdle2.onNavigationEvent onExtraCallbackWithResult(@NotNull Context context, float f, boolean z, @Nullable Boolean bool) {
        Object[] objArr = {this, context, Float.valueOf(f), Boolean.valueOf(z), bool};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (RecomposerawaitIdle2.onNavigationEvent) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -11437875, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, iOnNavigationEvent, 11437881);
    }

    public final RecomposerawaitIdle2.onNavigationEvent onWarmupCompleted(@NotNull Context context, @Nullable String str, boolean z, float f, boolean z2) {
        Object[] objArr = {this, context, str, Boolean.valueOf(z), Float.valueOf(f), Boolean.valueOf(z2)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (RecomposerawaitIdle2.onNavigationEvent) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1882831510, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, iOnNavigationEvent, -1882831510);
    }

    public final String access000() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (String) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2129117636, iOnNavigationEvent2, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, 2129117641);
    }

    public final boolean readTypedObject() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -583201524, iOnNavigationEvent2, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, 583201525)).booleanValue();
    }

    public final KeyBoardVisiblePoint onPostMessage() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (KeyBoardVisiblePoint) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1346435167, iOnNavigationEvent2, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, -1346435165);
    }
}
