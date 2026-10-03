package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AdComponentViewParentApi;
import o.checkNavigationBarBySystemProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class AdComponentViewParentApi implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AdComponentViewParentApi> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("registerRequired")
    private final boolean _registerRequired;

    @SerializedName("accountCount")
    private final int accountCount;

    @SerializedName("bankCode")
    private int bankCode;
    private final Lazy bankInfo$delegate;

    @SerializedName("breakTime")
    private final onNavigationEvent breakTime;
    private final Lazy fillLogoUrl$delegate;
    private final Lazy fullName$delegate;

    @SerializedName("reason")
    private final String reason;

    @SerializedName("registered")
    private final boolean registered;

    @SerializedName("status")
    private onExtraCallback status;

    @SerializedName("success")
    private final boolean success;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<AdComponentViewParentApi> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final AdComponentViewParentApi IAuthTabCallback(Parcel parcel) {
            onExtraCallback onextracallbackValueOf;
            boolean z;
            boolean z2;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 63;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i5 = parcel.readInt();
            onNavigationEvent onnavigationeventCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i6 = onExtraCallback + 49;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                onextracallbackValueOf = null;
            } else {
                onextracallbackValueOf = onExtraCallback.valueOf(parcel.readString());
            }
            int i8 = parcel.readInt();
            boolean z3 = parcel.readInt() != 0;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                int i9 = onWarmupCompleted + 3;
                int i10 = i9 % 128;
                onExtraCallback = i10;
                int i11 = i9 % 2;
                int i12 = i10 + 105;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                z = false;
            } else {
                z = true;
            }
            if (parcel.readInt() != 0) {
                int i14 = onWarmupCompleted + 57;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() == 0) {
                i = onExtraCallback + 51;
            } else {
                onnavigationeventCreateFromParcel = onNavigationEvent.CREATOR.createFromParcel(parcel);
                i = onExtraCallback + 123;
            }
            onWarmupCompleted = i % 128;
            int i16 = i % 2;
            return new AdComponentViewParentApi(i5, onextracallbackValueOf, i8, z3, string, z, z2, onnavigationeventCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AdComponentViewParentApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AdComponentViewParentApi adComponentViewParentApiIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return adComponentViewParentApiIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AdComponentViewParentApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 107;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            AdComponentViewParentApi[] adComponentViewParentApiArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            if (i4 != 0) {
                int i5 = 91 / 0;
            }
            return adComponentViewParentApiArrOnExtraCallbackWithResult;
        }

        public final AdComponentViewParentApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 111;
            onWarmupCompleted = i3 % 128;
            AdComponentViewParentApi[] adComponentViewParentApiArr = new AdComponentViewParentApi[i];
            if (i3 % 2 != 0) {
                return adComponentViewParentApiArr;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 53;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AdComponentViewParentApi() {
        this(0, null, 0, false, null, false, false, null, 255, null);
    }

    public static /* synthetic */ checkNavigationBarBySystemProperties IAuthTabCallback(AdComponentViewParentApi adComponentViewParentApi) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = onExtraCallback(adComponentViewParentApi);
        int i4 = IAuthTabCallback + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return checknavigationbarbysystempropertiesOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i | i9;
        int i11 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i12 = ~((~i) | i5 | i6);
        int i13 = i5 + i6 + i2 + ((-2027816600) * i3) + ((-1234684791) * i4);
        int i14 = i13 * i13;
        int i15 = (i5 * (-132237830)) + 1711013888 + ((-132237830) * i6) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i2) + (811597824 * i3) + (1100742656 * i4) + (1751056384 * i14);
        int i16 = ((i5 * 572746074) - 905264446) + (i6 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i2 * 572745585) + (i3 * 982511336) + (i4 * (-774025351)) + (i14 * 1257177088);
        int i17 = i15 + (i16 * i16 * 1874919424);
        if (i17 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 != 2) {
            return onWarmupCompleted(objArr);
        }
        AdComponentViewParentApi adComponentViewParentApi = (AdComponentViewParentApi) objArr[0];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallback + 121;
        onNavigationEvent = i19 % 128;
        int i20 = i19 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnWarmupCompleted = adComponentViewParentApi.onWarmupCompleted();
        if (checknavigationbarbysystempropertiesOnWarmupCompleted == null) {
            return null;
        }
        int i21 = onNavigationEvent + 61;
        IAuthTabCallback = i21 % 128;
        int i22 = i21 % 2;
        return checknavigationbarbysystempropertiesOnWarmupCompleted.IAuthTabCallbackStubProxy();
    }

    public static /* synthetic */ String onExtraCallbackWithResult(AdComponentViewParentApi adComponentViewParentApi) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(adComponentViewParentApi);
        int i4 = onNavigationEvent + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return strOnWarmupCompleted;
    }

    public static /* synthetic */ String onNavigationEvent(AdComponentViewParentApi adComponentViewParentApi) {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {adComponentViewParentApi};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 != 0) {
            str = (String) onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 719902636, -719902634, objArr);
            int i4 = 82 / 0;
        } else {
            str = (String) onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 719902636, -719902634, objArr);
        }
        int i5 = IAuthTabCallback + 75;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.bankCode);
        onExtraCallback onextracallback = this.status;
        if (onextracallback == null) {
            int i3 = onNavigationEvent + 79;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeString(onextracallback.name());
        }
        parcel.writeInt(this.accountCount);
        parcel.writeInt(this.success ? 1 : 0);
        parcel.writeString(this.reason);
        parcel.writeInt(this._registerRequired ? 1 : 0);
        parcel.writeInt(this.registered ? 1 : 0);
        onNavigationEvent onnavigationevent = this.breakTime;
        if (onnavigationevent == null) {
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        onnavigationevent.writeToParcel(parcel, i);
        int i6 = onNavigationEvent + 7;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 12 / 0;
        }
    }

    public AdComponentViewParentApi(int i, @Nullable onExtraCallback onextracallback, int i2, boolean z, @Nullable String str, boolean z2, boolean z3, @Nullable onNavigationEvent onnavigationevent) {
        this.bankCode = i;
        this.status = onextracallback;
        this.accountCount = i2;
        this.success = z;
        this.reason = str;
        this._registerRequired = z2;
        this.registered = z3;
        this.breakTime = onnavigationevent;
        this.bankInfo$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.model.account.notification.BankNotificationSubscription$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 29;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesIAuthTabCallback = AdComponentViewParentApi.IAuthTabCallback(this.f$0);
                int i6 = onNavigationEvent + 75;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return checknavigationbarbysystempropertiesIAuthTabCallback;
            }
        });
        this.fillLogoUrl$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.model.account.notification.BankNotificationSubscription$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 101;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                String strOnExtraCallbackWithResult = AdComponentViewParentApi.onExtraCallbackWithResult(this.f$0);
                int i6 = onExtraCallbackWithResult + 5;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return strOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.fullName$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.model.account.notification.BankNotificationSubscription$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                String strOnNavigationEvent;
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    strOnNavigationEvent = AdComponentViewParentApi.onNavigationEvent(this.f$0);
                    int i5 = 36 / 0;
                } else {
                    strOnNavigationEvent = AdComponentViewParentApi.onNavigationEvent(this.f$0);
                }
                int i6 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return strOnNavigationEvent;
                }
                throw null;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdComponentViewParentApi(int i, onExtraCallback onextracallback, int i2, boolean z, String str, boolean z2, boolean z3, onNavigationEvent onnavigationevent, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        onExtraCallback onextracallback2;
        boolean z4;
        boolean z5;
        if ((i3 & 1) != 0) {
            int i5 = IAuthTabCallback + 97;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 55;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            i4 = 0;
        } else {
            i4 = i;
        }
        onNavigationEvent onnavigationevent2 = null;
        if ((i3 & 2) != 0) {
            int i11 = IAuthTabCallback + 25;
            int i12 = i11 % 128;
            onNavigationEvent = i12;
            if (i11 % 2 == 0) {
                onnavigationevent2.hashCode();
                throw null;
            }
            int i13 = i12 + 75;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 2;
            }
            onextracallback2 = null;
        } else {
            onextracallback2 = onextracallback;
        }
        int i15 = (i3 & 4) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            int i16 = onNavigationEvent + 37;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            z4 = false;
        } else {
            z4 = z;
        }
        String str2 = (i3 & 16) != 0 ? null : str;
        if ((i3 & 32) != 0) {
            int i18 = 2 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        boolean z6 = (i3 & 64) == 0 ? z3 : false;
        if ((i3 & 128) != 0) {
            int i19 = onNavigationEvent + 21;
            IAuthTabCallback = i19 % 128;
            if (i19 % 2 != 0) {
                onnavigationevent2.hashCode();
                throw null;
            }
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        this(i4, onextracallback2, i15, z4, str2, z5, z6, onnavigationevent2);
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.bankCode;
        int i6 = i3 + 25;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 62 / 0;
        }
        return i5;
    }

    public final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        this.bankCode = i;
        int i6 = i4 + 59;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 0;
        }
    }

    public final onExtraCallback access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        onExtraCallback onextracallback = this.status;
        int i4 = i2 + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return onextracallback;
        }
        throw null;
    }

    public final int IAuthTabCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.accountCount;
            int i5 = 53 / 0;
        } else {
            i = this.accountCount;
        }
        int i6 = i3 + 9;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.success;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return z;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.reason;
        int i5 = i3 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final onNavigationEvent onNavigationEvent() {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onnavigationevent = this.breakTime;
            int i4 = 5 / 0;
        } else {
            onnavigationevent = this.breakTime;
        }
        int i5 = i2 + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @SerializedName("SUBSCRIBE")
        public static final onExtraCallback SUBSCRIBE = new onExtraCallback("SUBSCRIBE", 0);

        @SerializedName("UNSUBSCRIBE")
        public static final onExtraCallback UNSUBSCRIBE = new onExtraCallback("UNSUBSCRIBE", 1);

        @SerializedName("NOT_SUPPORT")
        public static final onExtraCallback NOT_SUPPORT = new onExtraCallback("NOT_SUPPORT", 2);

        @SerializedName("BREAK_TIME")
        public static final onExtraCallback BREAK_TIME = new onExtraCallback("BREAK_TIME", 3);

        @SerializedName("PREPARING")
        public static final onExtraCallback PREPARING = new onExtraCallback("PREPARING", 4);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {SUBSCRIBE, UNSUBSCRIBE, NOT_SUPPORT, BREAK_TIME, PREPARING};
            int i5 = i3 + 9;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 62 / 0;
            }
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 35;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onNavigationEvent + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallback + 115;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 47 / 0;
            }
        }
    }

    public static final class onNavigationEvent implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<onNavigationEvent> CREATOR = new onExtraCallbackWithResult();
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @SerializedName("end")
        private final String end;

        @SerializedName("start")
        private final String start;

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<onNavigationEvent> {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final onNavigationEvent[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 109;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[i];
                int i6 = i4 + 73;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 11 / 0;
                }
                return onnavigationeventArr;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onNavigationEvent createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return onExtraCallback(parcel);
                }
                onExtraCallback(parcel);
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onNavigationEvent[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                onNavigationEvent[] onnavigationeventArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 0 / 0;
                }
                return onnavigationeventArrIAuthTabCallback;
            }

            public final onNavigationEvent onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onNavigationEvent onnavigationevent = new onNavigationEvent(parcel.readString(), parcel.readString());
                int i2 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 74 / 0;
                }
                return onnavigationevent;
            }
        }

        static {
            int i = IAuthTabCallback + 31;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public onNavigationEvent() {
            String str = null;
            this(str, str, 3, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 31;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeString(this.start);
                parcel.writeString(this.end);
                int i5 = 55 / 0;
            } else {
                parcel.writeString(this.start);
                parcel.writeString(this.end);
            }
            int i6 = onNavigationEvent + 33;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onNavigationEvent(@Nullable String str, @Nullable String str2) {
            this.start = str;
            this.end = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 25;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 29 / 0;
                }
                str = null;
            }
            if ((i & 2) != 0) {
                int i4 = onNavigationEvent + 47;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 22 / 0;
                }
                int i6 = 2 % 2;
                str2 = null;
            }
            this(str, str2);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.start;
            if (i3 != 0) {
                int i4 = 83 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.end;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r6) {
        /*
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r6 = r6[r0]
            o.AdComponentViewParentApi r6 = (o.AdComponentViewParentApi) r6
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.AdComponentViewParentApi.IAuthTabCallback
            int r4 = r3 + 85
            int r5 = r4 % 128
            o.AdComponentViewParentApi.onNavigationEvent = r5
            int r4 = r4 % r2
            if (r4 != 0) goto L1f
            boolean r4 = r6._registerRequired
            r5 = 55
            int r5 = r5 / r0
            if (r4 == 0) goto L38
            goto L23
        L1f:
            boolean r0 = r6._registerRequired
            if (r0 == 0) goto L38
        L23:
            boolean r6 = r6.registered
            if (r6 == 0) goto L28
            goto L38
        L28:
            int r3 = r3 + 105
            int r6 = r3 % 128
            o.AdComponentViewParentApi.onNavigationEvent = r6
            int r3 = r3 % r2
            if (r3 != 0) goto L32
            return r1
        L32:
            r6 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L38:
            int r3 = r3 + 23
            int r6 = r3 % 128
            o.AdComponentViewParentApi.onNavigationEvent = r6
            int r3 = r3 % r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AdComponentViewParentApi.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    private static final checkNavigationBarBySystemProperties onExtraCallback(AdComponentViewParentApi adComponentViewParentApi) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        send sendVarOnWarmupCompleted = send.Companion.onWarmupCompleted();
        String strValueOf = String.valueOf(adComponentViewParentApi.bankCode);
        if (i3 == 0) {
            return sendVarOnWarmupCompleted.onExtraCallback(strValueOf);
        }
        sendVarOnWarmupCompleted.onExtraCallback(strValueOf);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final checkNavigationBarBySystemProperties onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystemproperties = (checkNavigationBarBySystemProperties) this.bankInfo$delegate.getValue();
        int i4 = IAuthTabCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return checknavigationbarbysystemproperties;
    }

    private static final String onWarmupCompleted(AdComponentViewParentApi adComponentViewParentApi) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnWarmupCompleted = adComponentViewParentApi.onWarmupCompleted();
        if (checknavigationbarbysystempropertiesOnWarmupCompleted == null) {
            return null;
        }
        int i4 = IAuthTabCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return checknavigationbarbysystempropertiesOnWarmupCompleted.getInterfaceDescriptor();
        }
        checknavigationbarbysystempropertiesOnWarmupCompleted.getInterfaceDescriptor();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.fillLogoUrl$delegate.getValue();
        int i4 = IAuthTabCallback + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.fullName$delegate.getValue();
        int i4 = IAuthTabCallback + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AdComponentViewParentApi adComponentViewParentApi = (AdComponentViewParentApi) objArr[0];
        int i = 2 % 2;
        if (adComponentViewParentApi.bankCode > 0 && adComponentViewParentApi.status == onExtraCallback.UNSUBSCRIBE) {
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                ((Boolean) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1753314558, 1753314559, new Object[]{adComponentViewParentApi})).booleanValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!((Boolean) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1753314558, 1753314559, new Object[]{adComponentViewParentApi})).booleanValue()) {
                int i3 = onNavigationEvent + 83;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return true;
                }
                int i4 = 45 / 0;
                return true;
            }
        }
        return false;
    }

    private static final String asInterface(AdComponentViewParentApi adComponentViewParentApi) {
        return (String) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 719902636, -719902634, new Object[]{adComponentViewParentApi});
    }

    public final boolean asInterface() {
        return ((Boolean) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1147437524, 1147437524, new Object[]{this})).booleanValue();
    }

    public final boolean onTransact() {
        return ((Boolean) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1753314558, 1753314559, new Object[]{this})).booleanValue();
    }
}
