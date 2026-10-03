package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class getCompressionAlgorithmIdentifier implements KEKIdentifier, getOther {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 0;
    private static final Pattern TAG_PATTERN;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("approveNo")
    private String approveNo;

    @SerializedName("approveStatus")
    private String approveStatus;

    @SerializedName("cardCode")
    private int cardCode;

    @SerializedName("cardID")
    private Long cardID;

    @SerializedName("cardName")
    private String cardName;

    @SerializedName("cashbackAmount")
    private Long cashbackAmount;

    @SerializedName("discAmt")
    private String discAmt;

    @SerializedName("discountAmount")
    private long discountAmount;

    @SerializedName("divideMonth")
    private int divideMonth;

    @SerializedName("foreignCurCd")
    private String foreignCurCd;

    @SerializedName("foreignUseAmount")
    private String foreignUseAmount;

    @SerializedName("foreignUseYn")
    private String foreignUseYn;

    @SerializedName("id")
    private long id;

    @SerializedName("instMon")
    private String instMon;

    @SerializedName("paymentDt")
    private String paymentDt;

    @SerializedName("savePoint")
    private String savePoint;

    @SerializedName("storeAddr")
    private String storeAddr;

    @SerializedName("storeBizNo")
    private String storeBizNo;

    @SerializedName("storeBizNo2")
    private String storeBizNo2;

    @SerializedName("storeCeo")
    private String storeCeo;

    @SerializedName("storeTel")
    private String storeTel;

    @SerializedName("storeTelNo")
    private String storeTelNo;

    @SerializedName("storeType")
    private String storeType;

    @SerializedName("tip")
    private String tip;

    @SerializedName("useAmount")
    private long useAmount;

    @SerializedName("useCard")
    private String useCard;

    @SerializedName("useDiv")
    private String useDiv;

    @SerializedName("useDt")
    private String useDt;

    @SerializedName("useMonth")
    private int useMonth;

    @SerializedName("useStore")
    private String useStore;

    @SerializedName("useStoreNo")
    private Long useStoreNo;

    @SerializedName("useTs")
    private long useTs;

    public getCompressionAlgorithmIdentifier() {
        this(0L, 0, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 0L, null, 0L, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, -1, null);
    }

    public getCompressionAlgorithmIdentifier(long j, int i, @Nullable String str, @NotNull String str2, @NotNull String str3, int i2, @Nullable String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Long l, long j2, @Nullable Long l2, long j3, int i3, @NotNull String str13, @NotNull String str14, long j4, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @Nullable String str22, @Nullable Long l3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        this.id = j;
        this.cardCode = i;
        this.useDt = str;
        this.useCard = str2;
        this.useStore = str3;
        this.useMonth = i2;
        this.useDiv = str4;
        this.instMon = str5;
        this.discAmt = str6;
        this.savePoint = str7;
        this.cardName = str8;
        this.storeBizNo = str9;
        this.storeAddr = str10;
        this.storeTel = str11;
        this.storeType = str12;
        this.cardID = l;
        this.useTs = j2;
        this.useStoreNo = l2;
        this.useAmount = j3;
        this.divideMonth = i3;
        this.approveNo = str13;
        this.approveStatus = str14;
        this.discountAmount = j4;
        this.paymentDt = str15;
        this.storeCeo = str16;
        this.storeTelNo = str17;
        this.foreignUseYn = str18;
        this.foreignCurCd = str19;
        this.foreignUseAmount = str20;
        this.tip = str21;
        this.storeBizNo2 = str22;
        this.cashbackAmount = l3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getCompressionAlgorithmIdentifier(long j, int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l, long j2, Long l2, long j3, int i3, String str13, String str14, long j4, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Long l3, int i4, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        String strIntern;
        String str23;
        String strIntern2;
        String strIntern3;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        Long l4;
        String str32;
        long j5;
        String str33;
        long j6;
        String str34;
        String str35;
        int i5;
        String str36;
        String str37;
        String str38;
        Object obj;
        long j7 = (i4 & 1) != 0 ? 0L : j;
        int i6 = 0;
        int i7 = (i4 & 2) != 0 ? 0 : i;
        String str39 = (i4 & 4) != 0 ? "" : str;
        String str40 = (i4 & 8) != 0 ? "" : str2;
        String str41 = (i4 & 16) != 0 ? "" : str3;
        int i8 = (i4 & 32) != 0 ? 0 : i2;
        Object[] objArr = new Object[1];
        a(new char[]{25379, 25363, 8141, 64775, 7663}, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        String strIntern4 = ((String) objArr[0]).intern();
        if ((i4 & 64) != 0) {
            int i9 = IAuthTabCallback + 23;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                a(new char[]{25379, 25363, 8141, 64775, 7663}, (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1)), objArr2);
                i6 = 0;
                strIntern = ((String) objArr2[0]).intern();
            } else {
                i6 = 0;
                Object[] objArr3 = new Object[1];
                a(new char[]{25379, 25363, 8141, 64775, 7663}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
                strIntern = ((String) objArr3[0]).intern();
            }
        } else {
            strIntern = str4;
        }
        if ((i4 & 128) != 0) {
            str23 = strIntern4;
            Object[] objArr4 = new Object[1];
            a(new char[]{25379, 25363, 8141, 64775, 7663}, TextUtils.getOffsetBefore("", i6) + 1, objArr4);
            strIntern2 = ((String) objArr4[i6]).intern();
        } else {
            str23 = strIntern4;
            strIntern2 = str5;
        }
        if ((i4 & 256) != 0) {
            int i10 = IAuthTabCallback + 79;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                ViewConfiguration.getMaximumFlingVelocity();
                Object[] objArr5 = new Object[1];
                a(new char[]{25379, 25363, 8141, 64775, 7663}, 0, objArr5);
                obj = objArr5[0];
            } else {
                Object[] objArr6 = new Object[1];
                a(new char[]{25379, 25363, 8141, 64775, 7663}, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr6);
                obj = objArr6[0];
            }
            strIntern3 = ((String) obj).intern();
        } else {
            strIntern3 = str6;
        }
        if ((i4 & 512) != 0) {
            int i11 = 2 % 2;
            str24 = str23;
        } else {
            str24 = str7;
        }
        String str42 = (i4 & 1024) != 0 ? "" : str8;
        String str43 = (i4 & 2048) != 0 ? "" : str9;
        if ((i4 & 4096) != 0) {
            int i12 = IAuthTabCallback + 83;
            str25 = "";
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 % 2;
            }
            str26 = str25;
        } else {
            str25 = "";
            str26 = str10;
        }
        if ((i4 & 8192) != 0) {
            int i14 = onExtraCallback + 125;
            str27 = str26;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            str28 = str25;
        } else {
            str27 = str26;
            str28 = str11;
        }
        Long l5 = null;
        if ((i4 & 16384) != 0) {
            int i16 = onExtraCallback + 69;
            str29 = str28;
            IAuthTabCallback = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            str30 = str25;
        } else {
            str29 = str28;
            str30 = str12;
        }
        Long l6 = (32768 & i4) != 0 ? 0L : l;
        long j8 = (i4 & 65536) != 0 ? 0L : j2;
        Long l7 = (i4 & 131072) == 0 ? l2 : 0L;
        if ((i4 & 262144) != 0) {
            int i17 = onExtraCallback;
            l4 = l6;
            int i18 = i17 + 95;
            str31 = str30;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i17 + 65;
            str32 = str43;
            IAuthTabCallback = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 2 % 2;
            j5 = 0;
        } else {
            str31 = str30;
            l4 = l6;
            str32 = str43;
            j5 = j3;
        }
        int i23 = (524288 & i4) != 0 ? 0 : i3;
        if ((1048576 & i4) != 0) {
            int i24 = IAuthTabCallback + 85;
            onExtraCallback = i24 % 128;
            if (i24 % 2 == 0) {
                throw null;
            }
            str33 = str25;
        } else {
            str33 = str13;
        }
        String str44 = (2097152 & i4) != 0 ? str25 : str14;
        if ((i4 & 4194304) != 0) {
            int i25 = 2 % 2;
            j6 = 0;
        } else {
            j6 = j4;
        }
        String str45 = (i4 & 8388608) != 0 ? str25 : str15;
        String str46 = (i4 & 16777216) != 0 ? str25 : str16;
        String str47 = (i4 & 33554432) != 0 ? str25 : str17;
        String str48 = (i4 & 67108864) != 0 ? str25 : str18;
        String str49 = (i4 & 134217728) != 0 ? str25 : str19;
        String str50 = (i4 & 268435456) != 0 ? str25 : str20;
        if ((i4 & 536870912) != 0) {
            str35 = str44;
            int i26 = IAuthTabCallback + 117;
            str34 = str33;
            onExtraCallback = i26 % 128;
            i5 = 2;
            if (i26 % 2 == 0) {
                l5.hashCode();
                throw null;
            }
            str36 = str25;
        } else {
            str34 = str33;
            str35 = str44;
            i5 = 2;
            str36 = str21;
        }
        if ((i4 & 1073741824) != 0) {
            int i27 = i5 % i5;
            str37 = str25;
        } else {
            str37 = str22;
        }
        if ((i4 & Integer.MIN_VALUE) != 0) {
            int i28 = onExtraCallback + 97;
            str38 = str37;
            IAuthTabCallback = i28 % 128;
            int i29 = i28 % 2;
        } else {
            str38 = str37;
            l5 = l3;
        }
        this(j7, i7, str39, str40, str41, i8, strIntern, strIntern2, strIntern3, str24, str42, str32, str27, str29, str31, l4, j8, l7, j5, i23, str34, str35, j6, str45, str46, str47, str48, str49, str50, str36, str38, l5);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 107;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 45812), Gravity.getAbsoluteGravity(0, 0) + 84, TextUtils.getCapsMode("", 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14185), Process.getGidForName("") + 20, TextUtils.lastIndexOf("", '0', 0, 0) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 1;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            StringsKt.isBlank(this.foreignCurCd);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!StringsKt.isBlank(this.foreignCurCd)) {
            String lowerCase = this.foreignCurCd.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (!Intrinsics.areEqual(lowerCase, "krw")) {
                int i3 = IAuthTabCallback + 65;
                onExtraCallback = i3 % 128;
                return i3 % 2 != 0;
            }
        }
        return false;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        toASN1EncodableVector toasn1encodablevector = toASN1EncodableVector.TRANSACTION;
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return toasn1encodablevector;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        try {
            String str = new IdGeneratorExternalSyntheticLambda1("d").format(zzaj.onWarmupCompleted().onNavigationEvent(this.useTs).getTime()) + ". " + UserChoiceBillingListener.onExtraCallback.onExtraCallback().getResources().getStringArray(R.array.week_days_short)[r1.get(7) - 1];
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (ParseException unused) {
            return "";
        }
    }

    public CharSequence onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(!TAG_PATTERN.matcher(this.useStore).find())) {
                return GraniteModule_onEventListenerRemoved.onExtraCallback(this.useStore, new Object[0]);
            }
            String str = this.useStore;
            int i3 = onExtraCallback + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        TAG_PATTERN.matcher(this.useStore).find();
        throw null;
    }

    public String asInterface() {
        long j;
        int i = 2 % 2;
        DecimalFormat decimalFormat = new DecimalFormat("###,##0.0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        decimalFormat.setNegativePrefix("-");
        double dDoubleValue = enableBridgelessArchitecture.IAuthTabCallback.onExtraCallback(this.foreignUseAmount, 0L).doubleValue();
        if (!IAuthTabCallbackDefault()) {
            if (asBinder()) {
                j = -Math.abs(this.useAmount);
            } else {
                long j2 = this.useAmount;
                int i2 = onExtraCallback + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                j = j2;
            }
            return (String) getLongName.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -640286283, ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{Long.valueOf(j), ParamImpl.SPACE_WON}, 640286283);
        }
        String str = this.foreignCurCd;
        if (asBinder()) {
            int i4 = onExtraCallback + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                dDoubleValue = -Math.abs(dDoubleValue);
                int i5 = 51 / 0;
            } else {
                dDoubleValue = -Math.abs(dDoubleValue);
            }
        }
        String str2 = str + " " + decimalFormat.format(dDoubleValue);
        int i6 = IAuthTabCallback + 111;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String IAuthTabCallback() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r5.asBinder()
            if (r1 != 0) goto L73
            int r1 = o.getCompressionAlgorithmIdentifier.IAuthTabCallback
            int r1 = r1 + 11
            int r2 = r1 % 128
            o.getCompressionAlgorithmIdentifier.onExtraCallback = r2
            int r1 = r1 % r0
            boolean r1 = r5.IAuthTabCallbackStubProxy()
            r2 = 1
            if (r1 == r2) goto L73
            int r1 = o.getCompressionAlgorithmIdentifier.onExtraCallback
            int r1 = r1 + 19
            int r3 = r1 % 128
            o.getCompressionAlgorithmIdentifier.IAuthTabCallback = r3
            int r1 = r1 % r0
            java.lang.String r4 = ""
            if (r1 == 0) goto L2b
            int r1 = r5.divideMonth
            if (r1 <= r2) goto L59
            goto L2f
        L2b:
            int r1 = r5.divideMonth
            if (r1 <= r2) goto L59
        L2f:
            int r3 = r3 + 125
            int r1 = r3 % 128
            o.getCompressionAlgorithmIdentifier.onExtraCallback = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L48
            o.UserChoiceBillingListener r0 = o.UserChoiceBillingListener.onExtraCallback
            android.content.Context r0 = r0.onExtraCallback()
            int r1 = viva.republica.toss.R.string.app_payment_installment
            java.lang.String r0 = r0.getString(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            goto L77
        L48:
            o.UserChoiceBillingListener r0 = o.UserChoiceBillingListener.onExtraCallback
            android.content.Context r0 = r0.onExtraCallback()
            int r1 = viva.republica.toss.R.string.app_payment_installment
            java.lang.String r0 = r0.getString(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r0 = 0
            throw r0
        L59:
            o.UserChoiceBillingListener r1 = o.UserChoiceBillingListener.onExtraCallback
            android.content.Context r1 = r1.onExtraCallback()
            int r2 = viva.republica.toss.R.string.app_payment_one_time
            java.lang.String r1 = r1.getString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            int r2 = o.getCompressionAlgorithmIdentifier.IAuthTabCallback
            int r2 = r2 + 5
            int r3 = r2 % 128
            o.getCompressionAlgorithmIdentifier.onExtraCallback = r3
            int r2 = r2 % r0
            r0 = r1
            goto L77
        L73:
            java.lang.String r0 = r5.onExtraCallback()
        L77:
            java.lang.String r1 = r5.IAuthTabCallback_Parcel()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " | "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCompressionAlgorithmIdentifier.IAuthTabCallback():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r1 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String onExtraCallbackWithResult() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Long r1 = r7.cashbackAmount
            r2 = 0
            if (r1 == 0) goto L41
            int r3 = o.getCompressionAlgorithmIdentifier.onExtraCallback
            int r3 = r3 + 115
            int r4 = r3 % 128
            o.getCompressionAlgorithmIdentifier.IAuthTabCallback = r4
            int r3 = r3 % r0
            r4 = 1
            long r5 = r1.longValue()
            o.UserChoiceBillingListener r1 = o.UserChoiceBillingListener.onExtraCallback
            android.content.Context r1 = r1.onExtraCallback()
            if (r3 == 0) goto L30
            int r3 = viva.republica.toss.R.string.app_cashback_with_amount
            java.lang.String r5 = o.getLongName.onNavigationEvent(r5, r2, r4, r2)
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r5
            java.lang.String r1 = r1.getString(r3, r6)
            if (r1 == 0) goto L41
            goto L40
        L30:
            int r3 = viva.republica.toss.R.string.app_cashback_with_amount
            java.lang.String r4 = o.getLongName.onNavigationEvent(r5, r2, r4, r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = r1.getString(r3, r4)
            if (r1 == 0) goto L41
        L40:
            return r1
        L41:
            java.lang.String r1 = " "
            int r3 = o.getCompressionAlgorithmIdentifier.IAuthTabCallback
            int r3 = r3 + 105
            int r4 = r3 % 128
            o.getCompressionAlgorithmIdentifier.onExtraCallback = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L4f
            return r1
        L4f:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCompressionAlgorithmIdentifier.onExtraCallbackWithResult():java.lang.String");
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        if (!Intrinsics.areEqual(this.approveStatus, "부분 취소")) {
            String str = this.approveStatus;
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 0;
            }
            return str;
        }
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return "부분취소 반영";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        String str = new IdGeneratorExternalSyntheticLambda1("HH:mm").format(new Date(this.useTs));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // o.KEKIdentifier
    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            String str = this.useDt;
            int i4 = 27 / 0;
            if (str != null) {
                return str;
            }
        } else {
            String str2 = this.useDt;
            if (str2 != null) {
                return str2;
            }
        }
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        if (!Intrinsics.areEqual(this.approveStatus, "취소")) {
            int i2 = IAuthTabCallback + 45;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this.useAmount >= 0) {
                int i5 = i3 + 35;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        }
        return true;
    }

    public final boolean IAuthTabCallbackStubProxy() {
        boolean zAreEqual;
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            zAreEqual = Intrinsics.areEqual(this.approveStatus, "부분 취소");
            int i3 = 25 / 0;
        } else {
            zAreEqual = Intrinsics.areEqual(this.approveStatus, "부분 취소");
        }
        int i4 = IAuthTabCallback + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardTransaction(id=" + this.id + ", cardCode=" + this.cardCode + ", useDt=" + this.useDt + ", useCard='" + this.useCard + "', useStore='" + this.useStore + "', useMonth=" + this.useMonth + ", useDiv=" + this.useDiv + ", storeBizNo=" + this.storeBizNo + ", storeAddr=" + this.storeAddr + ", cardID=" + this.cardID + ", useTs=" + this.useTs + ", useAmount=" + this.useAmount + ", approveNo='" + this.approveNo + "', approveStatus='" + this.approveStatus + "', paymentDt='" + this.paymentDt + "')";
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
        return str;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    static {
        access100();
        Companion = new onWarmupCompleted(null);
        $stable = 8;
        TAG_PATTERN = Pattern.compile("<?[a-z][\\s\\S]*>");
        int i = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    static void access100() {
        onNavigationEvent = 6133862942111306277L;
    }
}
