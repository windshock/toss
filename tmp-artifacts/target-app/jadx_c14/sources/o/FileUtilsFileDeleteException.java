package o;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class FileUtilsFileDeleteException extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<FileUtilsFileDeleteException> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final boolean autoConfirm;
    private final boolean autoFocusing;
    private final Boolean clearPreviousLayouts;
    private final reportDexLoadingIssue cta;
    private final String ctaTextRemainingScroll;
    private final List<BenchmarkLimitsMs> disclaimers;
    private final List<createNativeAdRatingApi> fields;
    private final String headerSubTitle;
    private final String headerTitle;
    private final String headerTopTitle;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final boolean requiresScrollToBottom;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<FileUtilsFileDeleteException> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FileUtilsFileDeleteException createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FileUtilsFileDeleteException[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            FileUtilsFileDeleteException[] fileUtilsFileDeleteExceptionArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallback + 87;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return fileUtilsFileDeleteExceptionArrOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.FileUtilsFileDeleteException onExtraCallbackWithResult(android.os.Parcel r24) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FileUtilsFileDeleteException.IAuthTabCallback.onExtraCallbackWithResult(android.os.Parcel):o.FileUtilsFileDeleteException");
        }

        public final FileUtilsFileDeleteException[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 117;
            onExtraCallback = i3 % 128;
            FileUtilsFileDeleteException[] fileUtilsFileDeleteExceptionArr = new FileUtilsFileDeleteException[i];
            if (i3 % 2 != 0) {
                int i4 = 9 / 0;
            }
            return fileUtilsFileDeleteExceptionArr;
        }
    }

    static {
        int i = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 96 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i5);
        int i9 = ~i4;
        int i10 = ~i5;
        int i11 = i8 | (~(i9 | i10 | i3));
        int i12 = (~(i5 | i9 | i3)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i4 + i3 + i2 + (762713021 * i6) + (1579510587 * i);
        int i15 = i14 * i14;
        int i16 = ((i4 * (-1846875272)) - 1480523776) + ((-1846875272) * i3) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i2) + ((-750387200) * i6) + ((-523632640) * i) + ((-1971257344) * i15);
        int i17 = ((i4 * (-1364308824)) - 1074288667) + (i3 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i2 * (-1364308165)) + (i6 * (-893132913)) + (i * 986770329) + (i15 * (-1162149888));
        return i16 + ((i17 * i17) * (-1529413632)) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i5 = onExtraCallback + 21;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i6 = onExtraCallback + 65;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.headerTitle);
        parcel.writeString(this.headerSubTitle);
        parcel.writeString(this.headerTopTitle);
        List<createNativeAdRatingApi> list = this.fields;
        parcel.writeInt(list.size());
        Iterator<createNativeAdRatingApi> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.autoConfirm ? 1 : 0);
        parcel.writeInt(this.autoFocusing ? 1 : 0);
        this.cta.writeToParcel(parcel, i);
        List<BenchmarkLimitsMs> list2 = this.disclaimers;
        if (list2 == null) {
            int i8 = IAuthTabCallback + 17;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<BenchmarkLimitsMs> it2 = list2.iterator();
            while (it2.hasNext()) {
                int i10 = onExtraCallback + 19;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    it2.next().writeToParcel(parcel, i);
                    throw null;
                }
                it2.next().writeToParcel(parcel, i);
                int i11 = IAuthTabCallback + 83;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        parcel.writeInt(this.requiresScrollToBottom ? 1 : 0);
        parcel.writeString(this.ctaTextRemainingScroll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FileUtilsFileDeleteException(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @Nullable String str5, @NotNull List<? extends createNativeAdRatingApi> list, boolean z, boolean z2, @NotNull reportDexLoadingIssue reportdexloadingissue, @Nullable List<BenchmarkLimitsMs> list2, boolean z3, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.headerTitle = str3;
        this.headerSubTitle = str4;
        this.headerTopTitle = str5;
        this.fields = list;
        this.autoConfirm = z;
        this.autoFocusing = z2;
        this.cta = reportdexloadingissue;
        this.disclaimers = list2;
        this.requiresScrollToBottom = z3;
        this.ctaTextRemainingScroll = str6;
    }

    public String access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.key;
        int i4 = i2 + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public String readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 37;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return rCTCodelessLoggingEventListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Boolean onWarmupCompleted() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            bool = this.clearPreviousLayouts;
            int i4 = 78 / 0;
        } else {
            bool = this.clearPreviousLayouts;
        }
        int i5 = i3 + 87;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.navigationRightButton;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> access100() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i2 + 83;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.headerTitle;
        }
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.headerSubTitle;
        int i4 = i2 + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.headerTopTitle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<createNativeAdRatingApi> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List<createNativeAdRatingApi> list = this.fields;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return list;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        FileUtilsFileDeleteException fileUtilsFileDeleteException = (FileUtilsFileDeleteException) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = fileUtilsFileDeleteException.autoConfirm;
        int i5 = i3 + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(z);
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.autoFocusing;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final reportDexLoadingIssue onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        int i4 = i2 + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return reportdexloadingissue;
        }
        obj.hashCode();
        throw null;
    }

    public final List<BenchmarkLimitsMs> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List<BenchmarkLimitsMs> list = this.disclaimers;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return list;
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.requiresScrollToBottom;
        int i4 = i2 + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        FileUtilsFileDeleteException fileUtilsFileDeleteException = (FileUtilsFileDeleteException) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = fileUtilsFileDeleteException.ctaTextRemainingScroll;
        int i5 = i3 + 49;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1753955293, -1753955293, iOnExtraCallbackWithResult, new Object[]{this}, iOnExtraCallbackWithResult3)).booleanValue();
    }

    public final String IAuthTabCallback() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (String) onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 755506143, -755506142, iOnExtraCallbackWithResult, new Object[]{this}, iOnExtraCallbackWithResult3);
    }
}
