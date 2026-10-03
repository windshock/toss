package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.home.RevisedType;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSkeleonSymbol24 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private List<NativeLogBoxSpec> additionalProperties;
    private double amount;
    private final IAuthTabCallback bottomCta;
    private String brandName;
    private final boolean canReviseAmount;
    private String categoryName;
    private long categoryNo;
    private String description;
    private String discountReason;
    private transient CharSequence displayDiscountReason;
    private getSkeleonSymbol displayStatus;
    private transient CharSequence displayValue;
    private boolean hidden;
    private String imageUrl;
    private final boolean isFailure;
    private final boolean isForeignPayment;
    private String lottieUrl;
    private String memo;
    private String memoPlaceholder;
    private final String mergedId;
    private String message;
    private String methodType;
    private String originValue;
    private double paidAmount;
    private final ArrayList<NoOpAndroidFlipperClient> properties;
    private Long revisedAmount;
    private final ArrayList<String> sourceIds;
    private final String sourceLocators;
    private getSkeleonSymbol status;
    private String time;
    private String timelineItemType;
    private String title;
    private final onWarmupCompleted titleContent;
    private getFormatWidth transactionType;
    private String useStore;
    private String value;
    private String vendorCode;
    private final boolean withBanner;
    private static char[] onWarmupCompleted = {64899};
    private static char onNavigationEvent = 51240;

    public getSkeleonSymbol24() {
        this(null, null, null, 0L, null, false, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, false, null, null, -1, 15, null);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = (~(i5 | i4)) | i;
        int i8 = i4 | i5 | i;
        int i9 = ~i5;
        int i10 = i5 + i + i6 + ((-421447895) * i3) + ((-859425246) * i2);
        int i11 = i10 * i10;
        int i12 = (i5 * (-629045104)) + 1817116672 + ((-629045104) * i) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i6) + ((-2125594624) * i3) + (888930304 * i2) + (441384960 * i11);
        int i13 = (i5 * 1303038832) + 2077918271 + (i * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i6 * 1303038783) + (i3 * 1583617559) + (i2 * (-1102559138)) + (i11 * 510722048);
        switch (i12 + (i13 * i13 * 607191040)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                getSkeleonSymbol24 getskeleonsymbol24 = (getSkeleonSymbol24) objArr[0];
                int i14 = 2 % 2;
                int i15 = onExtraCallbackWithResult;
                int i16 = i15 + 79;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                double d = getskeleonsymbol24.amount;
                int i18 = i15 + 45;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                return Double.valueOf(d);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return asInterface(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSkeleonSymbol24)) {
            return false;
        }
        getSkeleonSymbol24 getskeleonsymbol24 = (getSkeleonSymbol24) obj;
        if (!Intrinsics.areEqual(this.brandName, getskeleonsymbol24.brandName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.imageUrl, getskeleonsymbol24.imageUrl)) {
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.lottieUrl, getskeleonsymbol24.lottieUrl)) {
            return false;
        }
        if (this.categoryNo != getskeleonsymbol24.categoryNo) {
            int i4 = onExtraCallbackWithResult + 97;
            onExtraCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.categoryName, getskeleonsymbol24.categoryName) || this.isForeignPayment != getskeleonsymbol24.isForeignPayment || Double.compare(this.amount, getskeleonsymbol24.amount) != 0 || Double.compare(this.paidAmount, getskeleonsymbol24.paidAmount) != 0 || !Intrinsics.areEqual(this.revisedAmount, getskeleonsymbol24.revisedAmount) || !Intrinsics.areEqual(this.value, getskeleonsymbol24.value)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.originValue, getskeleonsymbol24.originValue)) {
            int i5 = onExtraCallbackWithResult + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, getskeleonsymbol24.title)) {
            int i7 = onExtraCallbackWithResult + 81;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, getskeleonsymbol24.description)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.message, getskeleonsymbol24.message)) {
            int i9 = onExtraCallbackWithResult + 49;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.additionalProperties, getskeleonsymbol24.additionalProperties)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.properties, getskeleonsymbol24.properties)) {
            int i11 = onExtraCallbackWithResult + 57;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.time, getskeleonsymbol24.time)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.sourceIds, getskeleonsymbol24.sourceIds)) {
            int i13 = onExtraCallbackWithResult + 15;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sourceLocators, getskeleonsymbol24.sourceLocators) || !Intrinsics.areEqual(this.vendorCode, getskeleonsymbol24.vendorCode) || !Intrinsics.areEqual(this.timelineItemType, getskeleonsymbol24.timelineItemType)) {
            return false;
        }
        if (this.status != getskeleonsymbol24.status) {
            int i15 = onExtraCallbackWithResult + 47;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.memo, getskeleonsymbol24.memo) || (!Intrinsics.areEqual(this.memoPlaceholder, getskeleonsymbol24.memoPlaceholder)) || this.hidden != getskeleonsymbol24.hidden || !Intrinsics.areEqual(this.useStore, getskeleonsymbol24.useStore)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.methodType, getskeleonsymbol24.methodType)) {
            int i17 = onExtraCallback + 13;
            onExtraCallbackWithResult = i17 % 128;
            return i17 % 2 == 0;
        }
        if (this.transactionType != getskeleonsymbol24.transactionType || !Intrinsics.areEqual(this.discountReason, getskeleonsymbol24.discountReason) || this.displayStatus != getskeleonsymbol24.displayStatus) {
            return false;
        }
        if (this.withBanner == getskeleonsymbol24.withBanner) {
            return this.canReviseAmount == getskeleonsymbol24.canReviseAmount && !(Intrinsics.areEqual(this.titleContent, getskeleonsymbol24.titleContent) ^ true) && this.isFailure == getskeleonsymbol24.isFailure && Intrinsics.areEqual(this.mergedId, getskeleonsymbol24.mergedId) && Intrinsics.areEqual(this.bottomCta, getskeleonsymbol24.bottomCta);
        }
        int i18 = onExtraCallbackWithResult + 13;
        onExtraCallback = i18 % 128;
        int i19 = i18 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int iHashCode = this.brandName.hashCode();
        int iHashCode2 = this.imageUrl.hashCode();
        int iHashCode3 = this.lottieUrl.hashCode();
        int iHashCode4 = Long.hashCode(this.categoryNo);
        int iHashCode5 = this.categoryName.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isForeignPayment);
        int iHashCode7 = Double.hashCode(this.amount);
        int iHashCode8 = Double.hashCode(this.paidAmount);
        Long l = this.revisedAmount;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        int iHashCode10 = this.value.hashCode();
        int iHashCode11 = this.originValue.hashCode();
        int iHashCode12 = this.title.hashCode();
        int iHashCode13 = this.description.hashCode();
        int iHashCode14 = this.message.hashCode();
        int iHashCode15 = this.additionalProperties.hashCode();
        int iHashCode16 = this.properties.hashCode();
        int iHashCode17 = this.time.hashCode();
        int iHashCode18 = this.sourceIds.hashCode();
        int iHashCode19 = this.sourceLocators.hashCode();
        int iHashCode20 = this.vendorCode.hashCode();
        int iHashCode21 = this.timelineItemType.hashCode();
        getSkeleonSymbol getskeleonsymbol = this.status;
        int iHashCode22 = getskeleonsymbol == null ? 0 : getskeleonsymbol.hashCode();
        int iHashCode23 = this.memo.hashCode();
        int iHashCode24 = this.memoPlaceholder.hashCode();
        int iHashCode25 = Boolean.hashCode(this.hidden);
        int iHashCode26 = this.useStore.hashCode();
        int iHashCode27 = this.methodType.hashCode();
        getFormatWidth getformatwidth = this.transactionType;
        int iHashCode28 = getformatwidth == null ? 0 : getformatwidth.hashCode();
        String str = this.discountReason;
        if (str == null) {
            int i4 = onExtraCallbackWithResult + 21;
            i = iHashCode14;
            onExtraCallback = i4 % 128;
            i2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            i = iHashCode14;
            int iHashCode29 = str.hashCode();
            int i5 = onExtraCallback + 45;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i2 = iHashCode29;
        }
        int iHashCode30 = this.displayStatus.hashCode();
        int iHashCode31 = Boolean.hashCode(this.withBanner);
        int iHashCode32 = Boolean.hashCode(this.canReviseAmount);
        onWarmupCompleted onwarmupcompleted = this.titleContent;
        int iHashCode33 = onwarmupcompleted == null ? 0 : onwarmupcompleted.hashCode();
        int iHashCode34 = Boolean.hashCode(this.isFailure);
        int iHashCode35 = this.mergedId.hashCode();
        IAuthTabCallback iAuthTabCallback = this.bottomCta;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + i2) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + (iAuthTabCallback != null ? iAuthTabCallback.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionDetail(brandName=" + this.brandName + ", imageUrl=" + this.imageUrl + ", lottieUrl=" + this.lottieUrl + ", categoryNo=" + this.categoryNo + ", categoryName=" + this.categoryName + ", isForeignPayment=" + this.isForeignPayment + ", amount=" + this.amount + ", paidAmount=" + this.paidAmount + ", revisedAmount=" + this.revisedAmount + ", value=" + this.value + ", originValue=" + this.originValue + ", title=" + this.title + ", description=" + this.description + ", message=" + this.message + ", additionalProperties=" + this.additionalProperties + ", properties=" + this.properties + ", time=" + this.time + ", sourceIds=" + this.sourceIds + ", sourceLocators=" + this.sourceLocators + ", vendorCode=" + this.vendorCode + ", timelineItemType=" + this.timelineItemType + ", status=" + this.status + ", memo=" + this.memo + ", memoPlaceholder=" + this.memoPlaceholder + ", hidden=" + this.hidden + ", useStore=" + this.useStore + ", methodType=" + this.methodType + ", transactionType=" + this.transactionType + ", discountReason=" + this.discountReason + ", displayStatus=" + this.displayStatus + ", withBanner=" + this.withBanner + ", canReviseAmount=" + this.canReviseAmount + ", titleContent=" + this.titleContent + ", isFailure=" + this.isFailure + ", mergedId=" + this.mergedId + ", bottomCta=" + this.bottomCta + ")";
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 26 - Color.alpha(0), ExpandableListView.getPackedPositionChild(j) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $10 + 71;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 26 - (Process.myTid() >> 22), MotionEvent.axisFromString("") + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 63;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i9 = $10 + 105;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - ImageFormat.getBitsPerPixel(0)), 74 - (Process.myPid() >> 22), 8089 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 30, 19487 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            int i17 = $10 + 75;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr4[i16] = (char) (cArr4[i16] ^ 6604);
                i16 += 51;
            } else {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public getSkeleonSymbol24(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, boolean z, double d, double d2, @Nullable Long l, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<NativeLogBoxSpec> list, @NotNull ArrayList<NoOpAndroidFlipperClient> arrayList, @NotNull String str10, @NotNull ArrayList<String> arrayList2, @NotNull String str11, @NotNull String str12, @NotNull String str13, @Nullable getSkeleonSymbol getskeleonsymbol, @NotNull String str14, @NotNull String str15, boolean z2, @NotNull String str16, @NotNull String str17, @Nullable getFormatWidth getformatwidth, @Nullable String str18, @NotNull getSkeleonSymbol getskeleonsymbol2, boolean z3, boolean z4, @Nullable onWarmupCompleted onwarmupcompleted, boolean z5, @NotNull String str19, @Nullable IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(getskeleonsymbol2, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.brandName = str;
        this.imageUrl = str2;
        this.lottieUrl = str3;
        this.categoryNo = j;
        this.categoryName = str4;
        this.isForeignPayment = z;
        this.amount = d;
        this.paidAmount = d2;
        this.revisedAmount = l;
        this.value = str5;
        this.originValue = str6;
        this.title = str7;
        this.description = str8;
        this.message = str9;
        this.additionalProperties = list;
        this.properties = arrayList;
        this.time = str10;
        this.sourceIds = arrayList2;
        this.sourceLocators = str11;
        this.vendorCode = str12;
        this.timelineItemType = str13;
        this.status = getskeleonsymbol;
        this.memo = str14;
        this.memoPlaceholder = str15;
        this.hidden = z2;
        this.useStore = str16;
        this.methodType = str17;
        this.transactionType = getformatwidth;
        this.discountReason = str18;
        this.displayStatus = getskeleonsymbol2;
        this.withBanner = z3;
        this.canReviseAmount = z4;
        this.titleContent = onwarmupcompleted;
        this.isFailure = z5;
        this.mergedId = str19;
        this.bottomCta = iAuthTabCallback;
        this.displayValue = "";
        this.displayDiscountReason = "";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getSkeleonSymbol24(String str, String str2, String str3, long j, String str4, boolean z, double d, double d2, Long l, String str5, String str6, String str7, String str8, String str9, List list, ArrayList arrayList, String str10, ArrayList arrayList2, String str11, String str12, String str13, getSkeleonSymbol getskeleonsymbol, String str14, String str15, boolean z2, String str16, String str17, getFormatWidth getformatwidth, String str18, getSkeleonSymbol getskeleonsymbol2, boolean z3, boolean z4, onWarmupCompleted onwarmupcompleted, boolean z5, String str19, IAuthTabCallback iAuthTabCallback, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        List list2;
        String str27;
        String str28;
        ArrayList arrayList3;
        String str29;
        String str30;
        String str31;
        String str32;
        boolean z6;
        String strIntern;
        String str33;
        getSkeleonSymbol getskeleonsymbol3;
        String str34;
        boolean z7;
        boolean z8;
        String str35;
        if ((i & 1) != 0) {
            int i3 = 2 % 2;
            str20 = "";
        } else {
            str20 = str;
        }
        String str36 = (i & 2) != 0 ? "" : str2;
        String str37 = (i & 4) != 0 ? "" : str3;
        long j2 = (i & 8) != 0 ? 0L : j;
        if ((i & 16) != 0) {
            int i4 = onExtraCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str21 = "";
        } else {
            str21 = str4;
        }
        boolean z9 = (i & 32) != 0 ? false : z;
        double d3 = (i & 64) != 0 ? 0.0d : d;
        double d4 = (i & 128) == 0 ? d2 : 0.0d;
        Long l2 = (i & 256) != 0 ? null : l;
        if ((i & 512) != 0) {
            int i7 = onExtraCallback + 93;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            str22 = "";
        } else {
            str22 = str5;
        }
        if ((i & 1024) != 0) {
            int i8 = 2 % 2;
            str23 = "";
        } else {
            str23 = str6;
        }
        String str38 = (i & 2048) != 0 ? "" : str7;
        String str39 = (i & 4096) != 0 ? "" : str8;
        if ((i & 8192) != 0) {
            int i9 = onExtraCallbackWithResult + 9;
            str24 = str38;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            str25 = "";
        } else {
            str24 = str38;
            str25 = str9;
        }
        List listEmptyList = (i & 16384) != 0 ? CollectionsKt.emptyList() : list;
        ArrayList arrayList4 = (i & 32768) != 0 ? new ArrayList() : arrayList;
        if ((i & 65536) != 0) {
            list2 = listEmptyList;
            int i10 = onExtraCallbackWithResult + 61;
            str26 = str25;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                iAuthTabCallback.hashCode();
                throw null;
            }
            str27 = "";
        } else {
            str26 = str25;
            list2 = listEmptyList;
            str27 = str10;
        }
        ArrayList arrayList5 = (131072 & i) != 0 ? new ArrayList() : arrayList2;
        if ((i & 262144) != 0) {
            arrayList3 = arrayList5;
            int i11 = onExtraCallback + 111;
            str28 = str27;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            str29 = "";
        } else {
            str28 = str27;
            arrayList3 = arrayList5;
            str29 = str11;
        }
        String str40 = str29;
        if ((524288 & i) != 0) {
            z6 = false;
            str30 = "";
            str32 = str23;
            str31 = str22;
            Object[] objArr = new Object[1];
            a(new char[]{13809}, (byte) (70 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.getTrimmedLength("") + 1, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            str30 = "";
            str31 = str22;
            str32 = str23;
            z6 = false;
            strIntern = str12;
        }
        if ((1048576 & i) != 0) {
            int i13 = onExtraCallback;
            int i14 = i13 + 125;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 111;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
            str33 = "UNREGISTERED_BANK_ACCOUNT";
        } else {
            str33 = str13;
        }
        getSkeleonSymbol getskeleonsymbol4 = (2097152 & i) != 0 ? getSkeleonSymbol.NORMAL : getskeleonsymbol;
        String str41 = (4194304 & i) != 0 ? str30 : str14;
        String str42 = (i & 8388608) != 0 ? str30 : str15;
        if ((i & 16777216) != 0) {
            int i19 = onExtraCallback;
            int i20 = i19 + 73;
            str34 = str41;
            onExtraCallbackWithResult = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i19 + 5;
            getskeleonsymbol3 = getskeleonsymbol4;
            onExtraCallbackWithResult = i22 % 128;
            int i23 = i22 % 2;
            int i24 = 2 % 2;
            z7 = z6;
        } else {
            getskeleonsymbol3 = getskeleonsymbol4;
            str34 = str41;
            z7 = z2;
        }
        String str43 = (33554432 & i) != 0 ? str30 : str16;
        String str44 = (67108864 & i) != 0 ? str30 : str17;
        getFormatWidth getformatwidth2 = (i & 134217728) != 0 ? getFormatWidth.NONE : getformatwidth;
        String str45 = (i & 268435456) != 0 ? str30 : str18;
        getSkeleonSymbol getskeleonsymbol5 = (i & 536870912) != 0 ? getSkeleonSymbol.NORMAL : getskeleonsymbol2;
        boolean z10 = (i & 1073741824) != 0 ? true : z3;
        boolean z11 = (i & Integer.MIN_VALUE) != 0 ? z6 : z4;
        onWarmupCompleted onwarmupcompleted2 = (i2 & 1) != 0 ? null : onwarmupcompleted;
        if ((i2 & 2) != 0) {
            z8 = z11;
            int i25 = onExtraCallbackWithResult + 3;
            str35 = str44;
            onExtraCallback = i25 % 128;
            int i26 = i25 % 2;
        } else {
            z8 = z11;
            str35 = str44;
            z6 = z5;
        }
        this(str20, str36, str37, j2, str21, z9, d3, d4, l2, str31, str32, str24, str39, str26, list2, arrayList4, str28, arrayList3, str40, strIntern, str33, getskeleonsymbol3, str34, str42, z7, str43, str35, getformatwidth2, str45, getskeleonsymbol5, z10, z8, onwarmupcompleted2, z6, (i2 & 4) == 0 ? str19 : str30, (i2 & 8) == 0 ? iAuthTabCallback : null);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSkeleonSymbol24 getskeleonsymbol24 = (getSkeleonSymbol24) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 67;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = getskeleonsymbol24.brandName;
        if (i4 == 0) {
            int i5 = 67 / 0;
        }
        int i6 = i2 + 69;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSkeleonSymbol24 getskeleonsymbol24 = (getSkeleonSymbol24) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = getskeleonsymbol24.imageUrl;
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.lottieUrl;
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSkeleonSymbol24 getskeleonsymbol24 = (getSkeleonSymbol24) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = getskeleonsymbol24.categoryName;
        int i5 = i2 + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean extraCommand() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isForeignPayment;
        int i5 = i2 + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getSkeleonSymbol24 getskeleonsymbol24 = (getSkeleonSymbol24) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        double d = getskeleonsymbol24.paidAmount;
        int i5 = i2 + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return Double.valueOf(d);
        }
        throw null;
    }

    public final Long readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Long l = this.revisedAmount;
        int i5 = i3 + 71;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return l;
    }

    public final String onUnminimized() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSkeleonSymbol24 getskeleonsymbol24 = (getSkeleonSymbol24) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<NativeLogBoxSpec> list = getskeleonsymbol24.additionalProperties;
        int i5 = i3 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return list;
    }

    public final ArrayList<NoOpAndroidFlipperClient> extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        ArrayList<NoOpAndroidFlipperClient> arrayList = this.properties;
        int i5 = i3 + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    public final String onActivityLayout() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.time;
        int i5 = i3 + 7;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ArrayList<String> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<String> arrayList = this.sourceIds;
        int i5 = i2 + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public final String onMessageChannelReady() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.sourceLocators;
            int i4 = 37 / 0;
        } else {
            str = this.sourceLocators;
        }
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.memo;
        int i5 = i2 + 1;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.memoPlaceholder;
        int i5 = i2 + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.hidden;
        int i4 = i3 + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String onMinimized() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.useStore;
        int i5 = i3 + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.methodType;
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final getFormatWidth onActivityResized() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        getFormatWidth getformatwidth = this.transactionType;
        int i4 = i2 + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return getformatwidth;
    }

    public final void IAuthTabCallback(@NotNull getSkeleonSymbol getskeleonsymbol) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getskeleonsymbol, "");
        this.displayStatus = getskeleonsymbol;
        int i4 = onExtraCallbackWithResult + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.withBanner;
        int i4 = i3 + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final onWarmupCompleted onPostMessage() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        onWarmupCompleted onwarmupcompleted = this.titleContent;
        int i4 = i3 + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return onwarmupcompleted;
    }

    public final boolean ICustomTabsService() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isFailure;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return z;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mergedId;
        int i5 = i2 + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final IAuthTabCallback onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = this.bottomCta;
        int i5 = i3 + 95;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iAuthTabCallback;
    }

    public final CharSequence IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.displayValue.length() == 0) {
                SpannableString spannableString = new SpannableString(this.value);
                if (ICustomTabsCallbackStub()) {
                    spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
                }
                this.displayValue = spannableString;
                int i3 = onExtraCallback + 67;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
            return this.displayValue;
        }
        this.displayValue.length();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence asBinder() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.CharSequence r1 = r5.displayDiscountReason
            int r1 = r1.length()
            if (r1 != 0) goto L8e
            java.lang.String r1 = r5.originValue
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            int r1 = o.getSkeleonSymbol24.onExtraCallbackWithResult
            int r1 = r1 + 49
            int r2 = r1 % 128
            o.getSkeleonSymbol24.onExtraCallback = r2
            int r1 = r1 % r0
            java.lang.String r1 = r5.discountReason
            if (r1 == 0) goto L3f
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            java.lang.String r0 = r5.originValue
            java.lang.String r1 = r5.discountReason
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " | "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L6e
        L3f:
            java.lang.String r1 = r5.originValue
            int r1 = r1.length()
            if (r1 <= 0) goto L4a
            java.lang.String r0 = r5.originValue
            goto L6e
        L4a:
            java.lang.String r1 = r5.discountReason
            if (r1 == 0) goto L6c
            int r1 = r1.length()
            if (r1 <= 0) goto L6c
            int r1 = o.getSkeleonSymbol24.onExtraCallback
            int r1 = r1 + 79
            int r2 = r1 % 128
            o.getSkeleonSymbol24.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L65
            java.lang.String r0 = r5.discountReason
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            goto L6e
        L65:
            java.lang.String r0 = r5.discountReason
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0 = 0
            throw r0
        L6c:
            java.lang.String r0 = ""
        L6e:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            java.lang.String r0 = r5.originValue
            int r0 = r0.length()
            if (r0 <= 0) goto L8c
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            java.lang.String r2 = r5.originValue
            int r2 = r2.length()
            r3 = 33
            r4 = 0
            r1.setSpan(r0, r4, r2, r3)
        L8c:
            r5.displayDiscountReason = r1
        L8e:
            java.lang.CharSequence r0 = r5.displayDiscountReason
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSkeleonSymbol24.asBinder():java.lang.CharSequence");
    }

    public final String onWarmupCompleted(@NotNull Context context) {
        String string;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (ICustomTabsCallbackStub()) {
            int i4 = onExtraCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            string = i4 % 2 == 0 ? context.getString(R.string.app_home_transaction_detail_title_content_description_canceled, this.value) : context.getString(R.string.app_home_transaction_detail_title_content_description_canceled, this.value);
        } else if (this.originValue.length() > 0) {
            string = context.getString(R.string.app_home_transaction_detail_title_content_description_has_origin_value, this.originValue, this.value);
            int i5 = onExtraCallback + 67;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        } else {
            string = IAuthTabCallbackStub().toString();
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void newSession() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        getSkeleonSymbol getskeleonsymbol = this.status;
        if (getskeleonsymbol == null) {
            int i5 = i3 + 33;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            getSkeleonSymbol getskeleonsymbol2 = getSkeleonSymbol.NORMAL;
            if (i6 == 0) {
                int i7 = 46 / 0;
            }
            getskeleonsymbol = getskeleonsymbol2;
        }
        this.displayStatus = getskeleonsymbol;
    }

    public final boolean onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsExcluded = this.displayStatus.isExcluded();
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsExcluded;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean ICustomTabsCallbackDefault() {
        boolean zIsExcludedForce;
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            zIsExcludedForce = this.displayStatus.isExcludedForce();
            int i3 = 83 / 0;
        } else {
            zIsExcludedForce = this.displayStatus.isExcludedForce();
        }
        int i4 = onExtraCallbackWithResult + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zIsExcludedForce;
    }

    public final boolean ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsCanceled = this.displayStatus.isCanceled();
        int i4 = onExtraCallbackWithResult + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return zIsCanceled;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        long j = ((getSkeleonSymbol24) objArr[0]).categoryNo;
        if (1 <= j) {
            int i2 = onExtraCallback;
            int i3 = i2 + 89;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (j < 101) {
                int i4 = i2 + 21;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = onExtraCallback + 103;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final boolean ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        if (this.transactionType == getFormatWidth.INCOME) {
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onExtraCallbackWithResult + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final boolean isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            getFormatWidth getformatwidth = getFormatWidth.EXPENSE;
            throw null;
        }
        if (this.transactionType != getFormatWidth.EXPENSE) {
            int i3 = onExtraCallback + 107;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 74 / 0;
            }
            return false;
        }
        int i5 = onExtraCallback;
        int i6 = i5 + 33;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 15;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public final RevisedType ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            if (!this.canReviseAmount) {
                return RevisedType.NONE;
            }
            Long l = this.revisedAmount;
            if (l == null) {
                return RevisedType.CAN_REVISE;
            }
            if (l != null) {
                return RevisedType.IS_REVISED;
            }
            RevisedType revisedType = RevisedType.NONE;
            int i3 = onExtraCallbackWithResult + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return revisedType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        public static final int $stable = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @SerializedName("descriptions")
        private final List<IAuthTabCallback> descriptions;

        @SerializedName("title")
        private final String title;

        @SerializedName("titleAlt")
        private final String titleAlt;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.title, onwarmupcompleted.title)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.titleAlt, onwarmupcompleted.titleAlt)) {
                int i3 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i3 % 128;
                return i3 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.descriptions, onwarmupcompleted.descriptions)) {
                int i4 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.title.hashCode();
            return i3 != 0 ? (((iHashCode >>> 91) >>> this.titleAlt.hashCode()) / 125) >>> this.descriptions.hashCode() : (((iHashCode * 31) + this.titleAlt.hashCode()) * 31) + this.descriptions.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TitleContent(title=" + this.title + ", titleAlt=" + this.titleAlt + ", descriptions=" + this.descriptions + ")";
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 115;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.title;
            int i5 = i2 + 21;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallback() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                str = this.titleAlt;
                int i4 = 98 / 0;
            } else {
                str = this.titleAlt;
            }
            int i5 = i3 + 93;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final List<IAuthTabCallback> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            List<IAuthTabCallback> list = this.descriptions;
            int i5 = i3 + 11;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public static final class IAuthTabCallback {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @SerializedName("text")
            private final String text;

            @SerializedName("textAlt")
            private final String textAlt;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 101;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof IAuthTabCallback)) {
                    int i4 = IAuthTabCallback + 81;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
                if (!Intrinsics.areEqual(this.text, iAuthTabCallback.text) || !Intrinsics.areEqual(this.textAlt, iAuthTabCallback.textAlt)) {
                    return false;
                }
                int i6 = onWarmupCompleted + 93;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.text.hashCode();
                return i3 == 0 ? (iHashCode - 1) << this.textAlt.hashCode() : (iHashCode * 31) + this.textAlt.hashCode();
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Description(text=" + this.text + ", textAlt=" + this.textAlt + ")";
                int i2 = IAuthTabCallback + 23;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String onWarmupCompleted() {
                String str;
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 87;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    str = this.text;
                    int i4 = 0 / 0;
                } else {
                    str = this.text;
                }
                int i5 = i2 + 53;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.textAlt;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final class IAuthTabCallback {
        public static final int $stable = 8;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @SerializedName("clickEventLog")
        private final onNavigationEvent clickEventLog;

        @SerializedName("impressionEventLog")
        private final onNavigationEvent impressionEventLog;

        @SerializedName("schemeUrl")
        private final String schemeUrl;

        @SerializedName("title")
        private final String title;

        public IAuthTabCallback() {
            this(null, null, null, null, 15, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 59;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.title, iAuthTabCallback.title)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.schemeUrl, iAuthTabCallback.schemeUrl)) {
                int i7 = onWarmupCompleted + 23;
                IAuthTabCallback = i7 % 128;
                return i7 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.clickEventLog, iAuthTabCallback.clickEventLog)) {
                return false;
            }
            if (Intrinsics.areEqual(this.impressionEventLog, iAuthTabCallback.impressionEventLog)) {
                return true;
            }
            int i8 = IAuthTabCallback + 15;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.title.hashCode();
            int iHashCode3 = this.schemeUrl.hashCode();
            onNavigationEvent onnavigationevent = this.clickEventLog;
            int i4 = 0;
            if (onnavigationevent == null) {
                int i5 = onWarmupCompleted + 3;
                IAuthTabCallback = i5 % 128;
                iHashCode = i5 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode = onnavigationevent.hashCode();
                int i6 = IAuthTabCallback + 9;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            onNavigationEvent onnavigationevent2 = this.impressionEventLog;
            if (onnavigationevent2 != null) {
                int i8 = onWarmupCompleted + 71;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                int iHashCode4 = onnavigationevent2.hashCode();
                if (i9 != 0) {
                    int i10 = 85 / 0;
                }
                i4 = iHashCode4;
            }
            return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + i4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BottomCta(title=" + this.title + ", schemeUrl=" + this.schemeUrl + ", clickEventLog=" + this.clickEventLog + ", impressionEventLog=" + this.impressionEventLog + ")";
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public IAuthTabCallback(@NotNull String str, @NotNull String str2, @Nullable onNavigationEvent onnavigationevent, @Nullable onNavigationEvent onnavigationevent2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.title = str;
            this.schemeUrl = str2;
            this.clickEventLog = onnavigationevent;
            this.impressionEventLog = onnavigationevent2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(String str, String str2, onNavigationEvent onnavigationevent, onNavigationEvent onnavigationevent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 61;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i3 = 2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i4 = onWarmupCompleted + 121;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = 2 % 2;
                str2 = "";
            }
            if ((i & 4) != 0) {
                int i6 = IAuthTabCallback + 93;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                onnavigationevent = null;
            }
            if ((i & 8) != 0) {
                int i8 = onWarmupCompleted + 55;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                onnavigationevent2 = null;
            }
            this(str, str2, onnavigationevent, onnavigationevent2);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.title;
            int i5 = i3 + 75;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.schemeUrl;
            int i5 = i2 + 15;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final onNavigationEvent onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.clickEventLog;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onNavigationEvent onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onNavigationEvent onnavigationevent = this.impressionEventLog;
            int i5 = i3 + 83;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent {
        public static final int $stable = 8;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @SerializedName("params")
        private final Map<String, Object> params;

        @SerializedName("schemaId")
        private final long schemaId;

        public onNavigationEvent() {
            this(0L, null, 3, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = onExtraCallback + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (this.schemaId != onnavigationevent.schemaId || !Intrinsics.areEqual(this.params, onnavigationevent.params)) {
                return false;
            }
            int i4 = onExtraCallback + 63;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            return i2 % 2 == 0 ? (Long.hashCode(this.schemaId) >> 65) - this.params.hashCode() : (Long.hashCode(this.schemaId) * 31) + this.params.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EventLog(schemaId=" + this.schemaId + ", params=" + this.params + ")";
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(long j, @NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.schemaId = j;
            this.params = map;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 31;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                j = 0;
            }
            if ((i & 2) != 0) {
                int i5 = onExtraCallback + 45;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    access8100.onNavigationEvent();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                map = access8100.onNavigationEvent();
            }
            this(j, map);
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 105;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            long j = this.schemaId;
            int i5 = i2 + 37;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Map<String, Object> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Map<String, Object> map = this.params;
            int i5 = i3 + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return map;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final List<NativeLogBoxSpec> onExtraCallback() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (List) onWarmupCompleted(-1384507854, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 1384507854, new Object[]{this}, iOnExtraCallback2);
    }

    public final double onWarmupCompleted() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return ((Double) onWarmupCompleted(1986936817, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, -1986936814, new Object[]{this}, iOnExtraCallback2)).doubleValue();
    }

    public final String IAuthTabCallback() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (String) onWarmupCompleted(1041678400, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, -1041678399, new Object[]{this}, iOnExtraCallback2);
    }

    public final String onNavigationEvent() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (String) onWarmupCompleted(-505461358, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 505461362, new Object[]{this}, iOnExtraCallback2);
    }

    public final String IAuthTabCallbackDefault() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (String) onWarmupCompleted(1420171118, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, -1420171116, new Object[]{this}, iOnExtraCallback2);
    }

    public final double writeTypedObject() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return ((Double) onWarmupCompleted(723505224, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, -723505218, new Object[]{this}, iOnExtraCallback2)).doubleValue();
    }

    public final boolean mayLaunchUrl() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return ((Boolean) onWarmupCompleted(579186232, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, -579186227, new Object[]{this}, iOnExtraCallback2)).booleanValue();
    }
}
