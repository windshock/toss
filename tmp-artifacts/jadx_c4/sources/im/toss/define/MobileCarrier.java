package im.toss.define;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import im.toss.core.R;
import java.lang.reflect.Constructor;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1rSDK;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access15300;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class MobileCarrier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MobileCarrier[] $VALUES;
    public static final Object Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String code;
    private final Integer fullNameResId;
    private final String id;
    private final String serverValue;

    @SerializedName("00")
    public static final MobileCarrier NONE = new MobileCarrier("NONE", 0, "00", "NONE", "NONE", null);

    @SerializedName("01")
    public static final MobileCarrier SKT = new MobileCarrier("SKT", 1, "01", "SKT", "SKT", Integer.valueOf(R.string.mobile_carrier_skt));

    @SerializedName("02")
    public static final MobileCarrier KT = new MobileCarrier("KT", 2, "02", "KT", "KT", Integer.valueOf(R.string.mobile_carrier_kt));

    @SerializedName("03")
    public static final MobileCarrier LGU = new MobileCarrier("LGU", 3, "03", "LGT", "LGU", Integer.valueOf(R.string.mobile_carrier_lgu));

    @SerializedName("04")
    public static final MobileCarrier SK_MVNO = new MobileCarrier("SK_MVNO", 4, "04", "SKM", "SK_MVNO", Integer.valueOf(R.string.mobile_carrier_sk_mvno));

    @SerializedName("05")
    public static final MobileCarrier KT_MVNO = new MobileCarrier("KT_MVNO", 5, "05", "KTM", "KT_MVNO", Integer.valueOf(R.string.mobile_carrier_kt_mvno));

    @SerializedName("06")
    public static final MobileCarrier LGU_MVNO = new MobileCarrier("LGU_MVNO", 6, "06", "LGM", "LG_MVNO", Integer.valueOf(R.string.mobile_carrier_lgu_mvno));

    private static final /* synthetic */ MobileCarrier[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        MobileCarrier[] mobileCarrierArr = {NONE, SKT, KT, LGU, SK_MVNO, KT_MVNO, LGU_MVNO};
        int i5 = i3 + 107;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return mobileCarrierArr;
    }

    public static EnumEntries<MobileCarrier> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<MobileCarrier> enumEntries = $ENTRIES;
        int i4 = i3 + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return enumEntries;
    }

    public static MobileCarrier valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MobileCarrier mobileCarrier = (MobileCarrier) Enum.valueOf(MobileCarrier.class, str);
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return mobileCarrier;
        }
        throw null;
    }

    public static MobileCarrier[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MobileCarrier[] mobileCarrierArr = (MobileCarrier[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return mobileCarrierArr;
    }

    private MobileCarrier(String str, int i, String str2, String str3, String str4, Integer num) {
        this.code = str2;
        this.id = str3;
        this.serverValue = str4;
        this.fullNameResId = num;
    }

    public static final /* synthetic */ String access$getServerValue$p(MobileCarrier mobileCarrier) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = mobileCarrier.serverValue;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        MobileCarrier[] mobileCarrierArr$values = $values();
        $VALUES = mobileCarrierArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(mobileCarrierArr$values);
        try {
            Object[] objArr = {null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-459919851);
            Companion = ((Constructor) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 47, Color.argb(0, 0, 0, 0) + 6951, -707342203, false, (String) null, new Class[]{DefaultConstructorMarker.class}) : objOnExtraCallback)).newInstance(objArr);
            int i = onExtraCallback + 43;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 48 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final String getAccountInfoId() {
        int i = 2 % 2;
        if (this == KT) {
            int i2 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 91 / 0;
            }
            return "KTF";
        }
        String str = this.id;
        int i4 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String code() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.code;
        int i4 = i2 + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String fullName() {
        int i = 2 % 2;
        Integer num = this.fullNameResId;
        if (num == null) {
            return "";
        }
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(num.intValue());
            throw null;
        }
        String strOnExtraCallbackWithResult = AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(num.intValue());
        if (strOnExtraCallbackWithResult == null) {
            return "";
        }
        int i3 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallbackWithResult;
    }

    public final String id() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.id;
        }
        throw null;
    }

    public final String id(@NotNull MobileCarrier mobileCarrier) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mobileCarrier, "");
        if (!Intrinsics.areEqual(this.id, NONE.id)) {
            return this.id;
        }
        String str = mobileCarrier.id;
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String serverValue() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.serverValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isNone() {
        int i = 2 % 2;
        if (this == NONE) {
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strFullName = fullName();
        int i4 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strFullName;
    }
}
