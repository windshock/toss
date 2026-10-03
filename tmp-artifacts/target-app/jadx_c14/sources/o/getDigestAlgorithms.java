package o;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.uimanager.LayoutShadowNode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NativeAdViewAttributesApi;
import o.PullRefreshIndicatorKtExternalSyntheticLambda5;
import o.SetDetectableSize;
import o.TextFieldKtExternalSyntheticLambda4;
import o.createAdSizeApi;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.setPopupContentSizefhxjrPA;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDigestAlgorithms<T extends getEncryptedData> implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<getDigestAlgorithms<?>> CREATOR;
    private static int IAuthTabCallbackDefault = 0;
    private static int[] IAuthTabCallbackStub = null;
    private static int access000 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final boolean IAuthTabCallback;
    private final getDigestAlgorithms<getEncryptedData> asInterface;
    private final T onExtraCallback;
    private final getEncryptedData onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    public static final class IAuthTabCallback implements Parcelable.Creator<getDigestAlgorithms<?>> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getDigestAlgorithms<?>[] newArray(int i) {
            return new getDigestAlgorithms[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getDigestAlgorithms<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new getDigestAlgorithms<>((getEncryptedData) parcel.readParcelable(getDigestAlgorithms.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (getEncryptedData) parcel.readParcelable(getDigestAlgorithms.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : getDigestAlgorithms.CREATOR.createFromParcel(parcel));
        }
    }

    static {
        IAuthTabCallbackDefault();
        CREATOR = new IAuthTabCallback();
        int i = IAuthTabCallbackDefault + 115;
        access000 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i)) | (~(i7 | i5)) | (~(i | i5));
        int i9 = (~(i3 | i5)) | i;
        int i10 = (~(i5 | i3 | i)) | (~(i7 | (~i) | (~i5)));
        int i11 = i3 + i + i6 + (862446602 * i2) + (395103901 * i4);
        int i12 = i11 * i11;
        int i13 = (((-1892237052) * i3) - 438566912) + ((-683246085) * i) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i6) + ((-128450560) * i2) + ((-674496512) * i4) + ((-1108934656) * i12);
        int i14 = (i3 * 1384179468) + 550727958 + (i * 1384180977) + (i8 * 503) + (i9 * (-1006)) + (i10 * 503) + (i6 * 1384179971) + (i2 * 1640285726) + (i4 * 120803543) + (i12 * 2025127936);
        switch (i13 + (i14 * i14 * (-275709952))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return onTransact(objArr);
            default:
                PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5 = (PullRefreshIndicatorKtExternalSyntheticLambda5) objArr[0];
                int i15 = 2 % 2;
                int i16 = asBinder + 49;
                onTransact = i16 % 128;
                if (i16 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(pullRefreshIndicatorKtExternalSyntheticLambda5, "");
                } else {
                    Intrinsics.checkNotNullParameter(pullRefreshIndicatorKtExternalSyntheticLambda5, "");
                }
                pullRefreshIndicatorKtExternalSyntheticLambda5.IAuthTabCallback(true);
                Unit unit = Unit.INSTANCE;
                int i17 = asBinder + 69;
                onTransact = i17 % 128;
                int i18 = i17 % 2;
                return unit;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueOverviewViewModel cardIssueOverviewViewModel, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(cardIssueOverviewViewModel, th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueOverviewViewModel, th);
        int i3 = onTransact + 79;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(-473749659, new Object[]{pullRefreshIndicatorKtExternalSyntheticLambda5}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 473749659, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = asBinder + 75;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(TextFieldKtExternalSyntheticLambda4 textFieldKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(textFieldKtExternalSyntheticLambda4);
        int i4 = onTransact + 125;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueOverviewViewModel cardIssueOverviewViewModel, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueOverviewViewModel, th);
        int i4 = onTransact + 51;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueOverviewViewModel cardIssueOverviewViewModel, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, getDigestAlgorithms getdigestalgorithms, String str, String str2, Map map, NativeAdViewAttributesApi nativeAdViewAttributesApi) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardIssueOverviewViewModel, typographyKtExternalSyntheticLambda0, getdigestalgorithms, str, str2, map, nativeAdViewAttributesApi);
        int i4 = onTransact + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueOverviewViewModel cardIssueOverviewViewModel, getDigestAlgorithms getdigestalgorithms, String str, String str2, Map map, Map map2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(cardIssueOverviewViewModel, getdigestalgorithms, str, str2, map, map2, setDetectableSize);
        }
        onExtraCallbackWithResult(cardIssueOverviewViewModel, getdigestalgorithms, str, str2, map, map2, setDetectableSize);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ getDigestAlgorithms onExtraCallback(getDigestAlgorithms getdigestalgorithms, getEncryptedData getencrypteddata, int i, int i2, getEncryptedData getencrypteddata2, boolean z, getDigestAlgorithms getdigestalgorithms2, int i3, Object obj) {
        int i4;
        int i5 = 2 % 2;
        T t = getencrypteddata;
        if ((i3 & 1) != 0) {
            int i6 = asBinder + 91;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                T t2 = getdigestalgorithms.onExtraCallback;
                throw null;
            }
            t = getdigestalgorithms.onExtraCallback;
        }
        T t3 = t;
        if ((i3 & 2) != 0) {
            i = getdigestalgorithms.onWarmupCompleted;
        }
        int i7 = i;
        if ((i3 & 4) != 0) {
            int i8 = asBinder + 41;
            onTransact = i8 % 128;
            if (i8 % 2 == 0) {
                i4 = getdigestalgorithms.onNavigationEvent;
                int i9 = 91 / 0;
            } else {
                i4 = getdigestalgorithms.onNavigationEvent;
            }
            i2 = i4;
        }
        int i10 = i2;
        if ((i3 & 8) != 0) {
            getencrypteddata2 = getdigestalgorithms.onExtraCallbackWithResult;
            int i11 = asBinder + 37;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
        }
        getEncryptedData getencrypteddata3 = getencrypteddata2;
        if ((i3 & 16) != 0) {
            z = getdigestalgorithms.IAuthTabCallback;
        }
        boolean z2 = z;
        if ((i3 & 32) != 0) {
            getdigestalgorithms2 = getdigestalgorithms.asInterface;
        }
        getDigestAlgorithms<T> getdigestalgorithmsIAuthTabCallback = getdigestalgorithms.IAuthTabCallback((getDigestAlgorithms) t3, i7, i10, getencrypteddata3, z2, (getDigestAlgorithms<? extends getEncryptedData>) getdigestalgorithms2);
        int i13 = onTransact + 61;
        asBinder = i13 % 128;
        if (i13 % 2 == 0) {
            return getdigestalgorithmsIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getDigestAlgorithms getdigestalgorithms = (getDigestAlgorithms) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(getdigestalgorithms.onExtraCallback, iIntValue);
        parcel.writeInt(getdigestalgorithms.onWarmupCompleted);
        parcel.writeInt(getdigestalgorithms.onNavigationEvent);
        parcel.writeParcelable(getdigestalgorithms.onExtraCallbackWithResult, iIntValue);
        parcel.writeInt(getdigestalgorithms.IAuthTabCallback ? 1 : 0);
        getDigestAlgorithms<getEncryptedData> getdigestalgorithms2 = getdigestalgorithms.asInterface;
        if (getdigestalgorithms2 != null) {
            parcel.writeInt(1);
            IAuthTabCallback(161493128, new Object[]{getdigestalgorithms2, parcel, Integer.valueOf(iIntValue)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -161493122, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            return null;
        }
        int i2 = asBinder + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        parcel.writeInt(0);
        int i4 = asBinder + 21;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Integer num, setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(num, setpopupcontentsizefhxjrpa);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = onTransact + 13;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueOverviewViewModel cardIssueOverviewViewModel, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, getDigestAlgorithms getdigestalgorithms, String str, NativeAdViewAttributesApi nativeAdViewAttributesApi) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueOverviewViewModel, typographyKtExternalSyntheticLambda0, getdigestalgorithms, str, nativeAdViewAttributesApi);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueOverviewViewModel cardIssueOverviewViewModel, getEncryptedData getencrypteddata, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueOverviewViewModel, getencrypteddata, setDetectableSize);
        int i4 = onTransact + 79;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getDigestAlgorithms<T> IAuthTabCallback(@NotNull T t, int i, int i2, @Nullable getEncryptedData getencrypteddata, boolean z, @Nullable getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        getDigestAlgorithms<T> getdigestalgorithms2 = new getDigestAlgorithms<>(t, i, i2, getencrypteddata, z, getdigestalgorithms);
        int i4 = onTransact + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return getdigestalgorithms2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onTransact + 45;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 52 / 0;
            }
            return true;
        }
        if (!(obj instanceof getDigestAlgorithms)) {
            return false;
        }
        getDigestAlgorithms getdigestalgorithms = (getDigestAlgorithms) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, getdigestalgorithms.onExtraCallback)) {
            int i4 = asBinder + 53;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.onWarmupCompleted != getdigestalgorithms.onWarmupCompleted || this.onNavigationEvent != getdigestalgorithms.onNavigationEvent || !Intrinsics.areEqual(this.onExtraCallbackWithResult, getdigestalgorithms.onExtraCallbackWithResult) || this.IAuthTabCallback != getdigestalgorithms.IAuthTabCallback) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.asInterface, getdigestalgorithms.asInterface))) {
            return true;
        }
        int i5 = asBinder + 79;
        onTransact = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onExtraCallback.hashCode();
        int iHashCode3 = Integer.hashCode(this.onWarmupCompleted);
        int iHashCode4 = Integer.hashCode(this.onNavigationEvent);
        getEncryptedData getencrypteddata = this.onExtraCallbackWithResult;
        if (getencrypteddata == null) {
            iHashCode = 0;
        } else {
            iHashCode = getencrypteddata.hashCode();
            int i4 = onTransact + 117;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode5 = Boolean.hashCode(this.IAuthTabCallback);
        getDigestAlgorithms<getEncryptedData> getdigestalgorithms = this.asInterface;
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + (getdigestalgorithms != null ? getdigestalgorithms.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueNavigator(currentLayout=" + this.onExtraCallback + ", currentCursor=" + this.onWarmupCompleted + ", nextCursor=" + this.onNavigationEvent + ", nextLayout=" + this.onExtraCallbackWithResult + ", isPopLayout=" + this.IAuthTabCallback + ", nextNavigator=" + this.asInterface + ")";
        int i2 = asBinder + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getDigestAlgorithms(@NotNull T t, int i, int i2, @Nullable getEncryptedData getencrypteddata, boolean z, @Nullable getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms) {
        Intrinsics.checkNotNullParameter(t, "");
        this.onExtraCallback = t;
        this.onWarmupCompleted = i;
        this.onNavigationEvent = i2;
        this.onExtraCallbackWithResult = getencrypteddata;
        this.IAuthTabCallback = z;
        this.asInterface = getdigestalgorithms;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getDigestAlgorithms(getEncryptedData getencrypteddata, int i, int i2, getEncryptedData getencrypteddata2, boolean z, getDigestAlgorithms getdigestalgorithms, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        getDigestAlgorithms getdigestalgorithms2;
        if ((i3 & 16) != 0) {
            int i4 = asBinder + 49;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 3;
            } else {
                int i6 = 2 % 2;
            }
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i3 & 32) != 0) {
            int i7 = asBinder + 81;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            getdigestalgorithms2 = null;
        } else {
            getdigestalgorithms2 = getdigestalgorithms;
        }
        this(getencrypteddata, i, i2, getencrypteddata2, z2, getdigestalgorithms2);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getDigestAlgorithms getdigestalgorithms = (getDigestAlgorithms) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 83;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        T t = getdigestalgorithms.onExtraCallback;
        int i5 = i2 + 19;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 33;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i2 + 23;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i3 + 85;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final getEncryptedData onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        getEncryptedData getencrypteddata = this.onExtraCallbackWithResult;
        int i5 = i2 + 87;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return getencrypteddata;
    }

    public final getDigestAlgorithms<getEncryptedData> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getDigestAlgorithms<getEncryptedData> getdigestalgorithms = this.asInterface;
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return getdigestalgorithms;
    }

    public static /* synthetic */ void onWarmupCompleted(getDigestAlgorithms getdigestalgorithms, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, getEncryptedData getencrypteddata, CardIssueOverviewViewModel cardIssueOverviewViewModel, String str, String str2, Map map, int i, Object obj) {
        String str3;
        int i2 = 2 % 2;
        int i3 = asBinder + 77;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 != 0 ? (i & 8) == 0 : (i & 113) == 0) {
            str3 = str;
        } else {
            int i5 = i4 + 67;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            str3 = null;
        }
        getdigestalgorithms.onWarmupCompleted(typographyKtExternalSyntheticLambda0, getencrypteddata, cardIssueOverviewViewModel, str3, str2, (i & 32) != 0 ? null : map);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x026d A[Catch: all -> 0x02ac, PHI: r5 r6
      0x026d: PHI (r5v7 java.lang.Integer) = (r5v6 java.lang.Integer), (r5v8 java.lang.Integer) binds: [B:68:0x026b, B:65:0x025e] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r6v5 int) = (r6v4 int), (r6v7 int) binds: [B:68:0x026b, B:65:0x025e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x02ac, blocks: (B:47:0x0202, B:49:0x0211, B:52:0x021e, B:57:0x0238, B:59:0x0242, B:63:0x0251, B:69:0x026d, B:67:0x0261, B:72:0x027e, B:71:0x0273, B:56:0x0234), top: B:87:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0273 A[Catch: all -> 0x02ac, TryCatch #0 {all -> 0x02ac, blocks: (B:47:0x0202, B:49:0x0211, B:52:0x021e, B:57:0x0238, B:59:0x0242, B:63:0x0251, B:69:0x026d, B:67:0x0261, B:72:0x027e, B:71:0x0273, B:56:0x0234), top: B:87:0x0202 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWarmupCompleted(@org.jetbrains.annotations.NotNull o.TypographyKtExternalSyntheticLambda0 r24, @org.jetbrains.annotations.NotNull o.getEncryptedData r25, @org.jetbrains.annotations.NotNull viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel r26, @org.jetbrains.annotations.Nullable java.lang.String r27, @org.jetbrains.annotations.Nullable java.lang.String r28, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r29) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDigestAlgorithms.onWarmupCompleted(o.TypographyKtExternalSyntheticLambda0, o.getEncryptedData, viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static /* synthetic */ void onExtraCallback(getDigestAlgorithms getdigestalgorithms, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, CardIssueOverviewViewModel cardIssueOverviewViewModel, RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1, String str, String str2, Map map, int i, Object obj) {
        Map map2;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 65;
        asBinder = i4 % 128;
        String str3 = (i4 % 2 == 0 ? (i & 8) == 0 : (i & 10) == 0) ? str : null;
        if ((i & 32) != 0) {
            int i5 = i3 + 51;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            map2 = null;
        } else {
            map2 = map;
        }
        getdigestalgorithms.onExtraCallback(typographyKtExternalSyntheticLambda0, cardIssueOverviewViewModel, rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1, str3, str2, map2);
    }

    private static final Unit onWarmupCompleted(CardIssueOverviewViewModel cardIssueOverviewViewModel, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, getDigestAlgorithms getdigestalgorithms, String str, String str2, Map map, NativeAdViewAttributesApi nativeAdViewAttributesApi) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        cardIssueOverviewViewModel.asInterface(nativeAdViewAttributesApi.IAuthTabCallbackDefault());
        cardIssueOverviewViewModel.IAuthTabCallback(Long.valueOf(nativeAdViewAttributesApi.onNavigationEvent()));
        List<getEncryptedData> listOnExtraCallback = EncryptedPrivateKeyInfo.onExtraCallback(nativeAdViewAttributesApi.onExtraCallbackWithResult());
        getEncryptionAlgorithm.onWarmupCompleted(listOnExtraCallback, typographyKtExternalSyntheticLambda0, getdigestalgorithms.onNavigationEvent, nativeAdViewAttributesApi.onExtraCallback(), cardIssueOverviewViewModel, null, false, 48, null);
        if (!listOnExtraCallback.isEmpty()) {
            getdigestalgorithms.onWarmupCompleted(typographyKtExternalSyntheticLambda0, (getEncryptedData) CollectionsKt.first(listOnExtraCallback), cardIssueOverviewViewModel, str, str2, map);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 45;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(CardIssueOverviewViewModel cardIssueOverviewViewModel, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            cardIssueOverviewViewModel.mayLaunchUrl().setValue(th);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        cardIssueOverviewViewModel.mayLaunchUrl().setValue(th);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 77;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull final TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull final CardIssueOverviewViewModel cardIssueOverviewViewModel, @Nullable RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1, @Nullable final String str, @Nullable final String str2, @Nullable final Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        if (rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 != null) {
            cardIssueOverviewViewModel.access000().put(this.onExtraCallback.onExtraCallback(), rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1);
        }
        getEncryptedData getencrypteddata = this.onExtraCallbackWithResult;
        if (getencrypteddata == null) {
            access27600.onExtraCallback(setMessageBytes.onExtraCallbackWithResult(cardIssueOverviewViewModel.IAuthTabCallback(this.onNavigationEvent), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueNavigator$$ExternalSyntheticLambda6
                public final Object invoke(Object obj) {
                    return getDigestAlgorithms.onExtraCallback(cardIssueOverviewViewModel, (Throwable) obj);
                }
            }, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueNavigator$$ExternalSyntheticLambda7
                public final Object invoke(Object obj) {
                    return getDigestAlgorithms.onExtraCallback(cardIssueOverviewViewModel, typographyKtExternalSyntheticLambda0, this, str, str2, map, (NativeAdViewAttributesApi) obj);
                }
            }), cardIssueOverviewViewModel.access100());
            return;
        }
        onWarmupCompleted(typographyKtExternalSyntheticLambda0, getencrypteddata, cardIssueOverviewViewModel, str, str2, map);
        cardIssueOverviewViewModel.onExtraCallbackWithResult(this.onWarmupCompleted);
        int i3 = onTransact + 27;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallbackStub;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 73 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackStub;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = $11 + 87;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(i5), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 72, (ViewConfiguration.getWindowTouchSlop() >> 8) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $10 + 93;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $11 + 105;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getTouchSlop() >> 8) + 39, TextUtils.indexOf("", "") + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 4033), '~' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onNavigationEvent(CardIssueOverviewViewModel cardIssueOverviewViewModel, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, getDigestAlgorithms getdigestalgorithms, String str, NativeAdViewAttributesApi nativeAdViewAttributesApi) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdViewAttributesApi, "");
        cardIssueOverviewViewModel.asInterface(nativeAdViewAttributesApi.IAuthTabCallbackDefault());
        List<getEncryptedData> listOnExtraCallback = EncryptedPrivateKeyInfo.onExtraCallback(nativeAdViewAttributesApi.onExtraCallbackWithResult());
        getEncryptionAlgorithm.onWarmupCompleted(listOnExtraCallback, typographyKtExternalSyntheticLambda0, 0, nativeAdViewAttributesApi.onExtraCallback(), cardIssueOverviewViewModel, null, false, 48, null);
        if (!listOnExtraCallback.isEmpty()) {
            int i2 = onTransact + 1;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(getdigestalgorithms, typographyKtExternalSyntheticLambda0, (getEncryptedData) CollectionsKt.first(listOnExtraCallback), cardIssueOverviewViewModel, null, str, null, 40, null);
            int i4 = asBinder + 7;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 4;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueOverviewViewModel cardIssueOverviewViewModel, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        cardIssueOverviewViewModel.mayLaunchUrl().setValue(th);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 99;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(final TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, final CardIssueOverviewViewModel cardIssueOverviewViewModel, final String str) {
        int i = 2 % 2;
        access27600.onExtraCallback(setMessageBytes.onExtraCallbackWithResult(cardIssueOverviewViewModel.setEngagementSignalsCallback(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueNavigator$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return getDigestAlgorithms.IAuthTabCallback(cardIssueOverviewViewModel, (Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueNavigator$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return getDigestAlgorithms.onWarmupCompleted(cardIssueOverviewViewModel, typographyKtExternalSyntheticLambda0, this, str, (NativeAdViewAttributesApi) obj);
            }
        }), cardIssueOverviewViewModel.access100());
        int i2 = asBinder + 97;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull List<? extends createAdSizeApi> list, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel, @Nullable RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1, @Nullable String str, @Nullable String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i2 = onTransact + 37;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (obj instanceof createAdSizeApi.onWarmupCompleted) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((createAdSizeApi.onWarmupCompleted) it.next()).onExtraCallbackWithResult());
        }
        List<getEncryptedData> listOnExtraCallback = EncryptedPrivateKeyInfo.onExtraCallback(arrayList2);
        if (listOnExtraCallback.isEmpty()) {
            onExtraCallback(this, typographyKtExternalSyntheticLambda0, cardIssueOverviewViewModel, rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1, str2, str, (Map) null, 32, (Object) null);
            return;
        }
        int i4 = onTransact + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if (rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 != null) {
            cardIssueOverviewViewModel.access000().put(this.onExtraCallback.onExtraCallback(), rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1);
        }
        getEncryptionAlgorithm.onWarmupCompleted(listOnExtraCallback, typographyKtExternalSyntheticLambda0, this.onWarmupCompleted, this.onNavigationEvent, cardIssueOverviewViewModel, this.onExtraCallbackWithResult, false, 32, null);
        getEncryptedData getencrypteddata = (getEncryptedData) CollectionsKt.first(listOnExtraCallback);
        cardIssueOverviewViewModel.onExtraCallbackWithResult(this.onWarmupCompleted);
        onWarmupCompleted(this, typographyKtExternalSyntheticLambda0, getencrypteddata, cardIssueOverviewViewModel, str2, str, null, 32, null);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getDigestAlgorithms getdigestalgorithms, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, createAdSizeApi createadsizeapi, CardIssueOverviewViewModel cardIssueOverviewViewModel, String str, RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 117;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 16) != 0) {
            int i6 = i3 + 59;
            asBinder = i6 % 128;
            rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 = null;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
        getdigestalgorithms.onWarmupCompleted(typographyKtExternalSyntheticLambda0, createadsizeapi, cardIssueOverviewViewModel, str, rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1);
    }

    public final void onWarmupCompleted(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @Nullable createAdSizeApi createadsizeapi, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel, @Nullable String str, @Nullable RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        if (createadsizeapi instanceof createAdSizeApi.onWarmupCompleted) {
            createAdSizeApi.onWarmupCompleted onwarmupcompleted = (createAdSizeApi.onWarmupCompleted) createadsizeapi;
            List<getEncryptedData> listOnExtraCallback = EncryptedPrivateKeyInfo.onExtraCallback(onwarmupcompleted.onExtraCallbackWithResult());
            if (listOnExtraCallback.isEmpty()) {
                onExtraCallback(this, typographyKtExternalSyntheticLambda0, cardIssueOverviewViewModel, rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1, onwarmupcompleted.IAuthTabCallback(), str, (Map) null, 32, (Object) null);
                int i2 = onTransact + 99;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            getEncryptedData getencrypteddata = (getEncryptedData) CollectionsKt.first(listOnExtraCallback);
            if (rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 != null) {
                cardIssueOverviewViewModel.access000().put(this.onExtraCallback.onExtraCallback(), rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1);
            }
            getEncryptionAlgorithm.onWarmupCompleted(listOnExtraCallback, typographyKtExternalSyntheticLambda0, this.onWarmupCompleted, this.onNavigationEvent, cardIssueOverviewViewModel, this.onExtraCallbackWithResult, false, 32, null);
            cardIssueOverviewViewModel.onExtraCallbackWithResult(this.onWarmupCompleted);
            onWarmupCompleted(this, typographyKtExternalSyntheticLambda0, getencrypteddata, cardIssueOverviewViewModel, onwarmupcompleted.IAuthTabCallback(), str, null, 32, null);
            return;
        }
        if (createadsizeapi instanceof createAdSizeApi.onExtraCallbackWithResult) {
            IAuthTabCallback(660327130, new Object[]{this, cardIssueOverviewViewModel, ((createAdSizeApi.onExtraCallbackWithResult) createadsizeapi).IAuthTabCallback(), str, null, this.onExtraCallback.getInterfaceDescriptor(), 8, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -660327125, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            cardIssueOverviewViewModel.IAuthTabCallbackStubProxy().setValue(createadsizeapi);
            return;
        }
        if (createadsizeapi instanceof createAdSizeApi.onNavigationEvent) {
            int i4 = asBinder + 63;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback(660327130, new Object[]{this, cardIssueOverviewViewModel, ((createAdSizeApi.onNavigationEvent) createadsizeapi).IAuthTabCallback(), str, null, this.onExtraCallback.getInterfaceDescriptor(), 8, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -660327125, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            cardIssueOverviewViewModel.onMessageChannelReady().setValue(createadsizeapi);
            return;
        }
        if (!(!(createadsizeapi instanceof createAdSizeApi.onExtraCallback))) {
            IAuthTabCallback(660327130, new Object[]{this, cardIssueOverviewViewModel, ((createAdSizeApi.onExtraCallback) createadsizeapi).IAuthTabCallback(), str, null, this.onExtraCallback.getInterfaceDescriptor(), 8, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -660327125, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            onNavigationEvent(typographyKtExternalSyntheticLambda0, cardIssueOverviewViewModel, str);
        } else if (createadsizeapi == null) {
            onExtraCallback(this, typographyKtExternalSyntheticLambda0, cardIssueOverviewViewModel, rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1, createadsizeapi != null ? createadsizeapi.IAuthTabCallback() : null, str, (Map) null, 32, (Object) null);
        }
    }

    public static /* synthetic */ setPositionProvider onExtraCallback(getDigestAlgorithms getdigestalgorithms, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onTransact;
            int i4 = i3 + 3;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 75;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            num = null;
        }
        return (setPositionProvider) IAuthTabCallback(-1446293949, new Object[]{getdigestalgorithms, num}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1446293950, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        setPositionProvider setpositionproviderOnExtraCallbackWithResult = PopupLayoutExternalSyntheticLambda0.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueNavigator$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return getDigestAlgorithms.onWarmupCompleted(num, (setPopupContentSizefhxjrPA) obj);
            }
        });
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return setpositionproviderOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(TextFieldKtExternalSyntheticLambda4 textFieldKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldKtExternalSyntheticLambda4, "");
        textFieldKtExternalSyntheticLambda4.IAuthTabCallback(R.anim.anim_window_in_from_right);
        textFieldKtExternalSyntheticLambda4.onExtraCallbackWithResult(R.anim.anim_window_out_to_left);
        textFieldKtExternalSyntheticLambda4.onNavigationEvent(androidx.navigation.ui.R.anim.nav_default_pop_enter_anim);
        textFieldKtExternalSyntheticLambda4.onExtraCallback(androidx.navigation.ui.R.anim.nav_default_pop_exit_anim);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(Integer num, setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        setpopupcontentsizefhxjrpa.onExtraCallback(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueNavigator$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return getDigestAlgorithms.onExtraCallback((TextFieldKtExternalSyntheticLambda4) obj);
            }
        });
        if (num != null) {
            setpopupcontentsizefhxjrpa.onExtraCallback(num.intValue(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueNavigator$$ExternalSyntheticLambda5
                public final Object invoke(Object obj) {
                    return getDigestAlgorithms.onExtraCallback((PullRefreshIndicatorKtExternalSyntheticLambda5) obj);
                }
            });
            int i2 = onTransact + 81;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 115;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getDigestAlgorithms getdigestalgorithms = (getDigestAlgorithms) objArr[0];
        CardIssueOverviewViewModel cardIssueOverviewViewModel = (CardIssueOverviewViewModel) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        Map map = (Map) objArr[4];
        Map map2 = (Map) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        Object obj = objArr[7];
        int i = 2 % 2;
        int i2 = onTransact + 95;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 8) != 0) {
            int i5 = i3 + 111;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 42 / 0;
            }
            map = null;
        }
        if ((iIntValue & 16) != 0) {
            int i7 = i3 + 55;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            map2 = null;
        }
        IAuthTabCallback(587641491, new Object[]{getdigestalgorithms, cardIssueOverviewViewModel, str, str2, map, map2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -587641487, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final getDigestAlgorithms getdigestalgorithms = (getDigestAlgorithms) objArr[0];
        final CardIssueOverviewViewModel cardIssueOverviewViewModel = (CardIssueOverviewViewModel) objArr[1];
        final String str = (String) objArr[2];
        final String str2 = (String) objArr[3];
        final Map map = (Map) objArr[4];
        final Map map2 = (Map) objArr[5];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1009535L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueNavigator$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return getDigestAlgorithms.onExtraCallback(cardIssueOverviewViewModel, getdigestalgorithms, str, str2, map, map2, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onTransact + 59;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return null;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueOverviewViewModel cardIssueOverviewViewModel, getDigestAlgorithms getdigestalgorithms, String str, String str2, Map map, Map map2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueOverviewViewModel.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueOverviewViewModel.getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("session_id", cardIssueOverviewViewModel.ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("screen_type", getdigestalgorithms.onExtraCallback.onExtraCallback());
        setDetectableSize.onExtraCallback("click_type", str);
        setDetectableSize.onExtraCallback("button_text", str2);
        Object[] objArr = new Object[1];
        a(new int[]{1498658688, 425390388, -1698590114, 1065972178}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 8, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardIssueOverviewViewModel.onActivityResized());
        setDetectableSize.onExtraCallback("referrer_item_id", cardIssueOverviewViewModel.onPostMessage());
        setDetectableSize.onExtraCallback("service_referrer", cardIssueOverviewViewModel.ICustomTabsCallbackStub());
        if (map != null) {
            setDetectableSize.onExtraCallback(map);
            int i4 = asBinder + 57;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        if (map2 != null) {
            int i6 = onTransact + 97;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            setDetectableSize.onExtraCallback(map2);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        final CardIssueOverviewViewModel cardIssueOverviewViewModel = (CardIssueOverviewViewModel) objArr[1];
        final getEncryptedData getencrypteddata = (getEncryptedData) objArr[2];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1009533L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueNavigator$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return getDigestAlgorithms.onWarmupCompleted(cardIssueOverviewViewModel, getencrypteddata, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onTransact + 3;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(CardIssueOverviewViewModel cardIssueOverviewViewModel, getEncryptedData getencrypteddata, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueOverviewViewModel.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueOverviewViewModel.getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("session_id", cardIssueOverviewViewModel.ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("screen_type", getencrypteddata.onExtraCallback());
        Object[] objArr = new Object[1];
        a(new int[]{1498658688, 425390388, -1698590114, 1065972178}, 8 - View.resolveSize(0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardIssueOverviewViewModel.onActivityResized());
        setDetectableSize.onExtraCallback("referrer_item_id", cardIssueOverviewViewModel.onPostMessage());
        setDetectableSize.onExtraCallback("service_referrer", cardIssueOverviewViewModel.ICustomTabsCallbackStub());
        Map<String, Object> interfaceDescriptor = getencrypteddata.getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            int i2 = onTransact + 113;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                setDetectableSize.onExtraCallback(interfaceDescriptor);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setDetectableSize.onExtraCallback(interfaceDescriptor);
            int i3 = onTransact + 43;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 5;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        return (Unit) IAuthTabCallback(-473749659, new Object[]{pullRefreshIndicatorKtExternalSyntheticLambda5}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 473749659, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private final void onExtraCallback(CardIssueOverviewViewModel cardIssueOverviewViewModel, getEncryptedData getencrypteddata) {
        IAuthTabCallback(-921491573, new Object[]{this, cardIssueOverviewViewModel, getencrypteddata}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 921491575, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public final T onExtraCallbackWithResult() {
        return (T) IAuthTabCallback(1377327355, new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public final setPositionProvider onExtraCallbackWithResult(@Nullable Integer num) {
        return (setPositionProvider) IAuthTabCallback(-1446293949, new Object[]{this, num}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1446293950, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public final void onExtraCallbackWithResult(@NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel, @Nullable String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, @Nullable Map<String, ? extends Object> map2) {
        IAuthTabCallback(587641491, new Object[]{this, cardIssueOverviewViewModel, str, str2, map, map2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -587641487, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        IAuthTabCallback(161493128, new Object[]{this, parcel, Integer.valueOf(i)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -161493122, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    static void IAuthTabCallbackDefault() {
        IAuthTabCallbackStub = new int[]{1636930035, 1916482132, -1115791405, -1606845891, -620482143, -789519569, 744116860, -2027407246, 126340275, -1096773705, 341101960, 374380858, 1986228015, -1714336366, 1730737438, 1548132621, -1236210771, 1297937619};
    }
}
