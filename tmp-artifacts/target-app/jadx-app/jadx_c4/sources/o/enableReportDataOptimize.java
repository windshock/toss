package o;

import im.toss.features.credit.data.request.CreditConsultingReservationRequest;
import im.toss.features.credit.data.response.CreditConsultingCategory;
import im.toss.features.credit.data.response.CreditConsultingHistory;
import im.toss.features.credit.data.response.CreditConsultingReservationResponse;
import im.toss.features.credit.data.response.CreditConsultingTime;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableReportDataOptimize {
    private static int IAuthTabCallbackDefault = 0;
    private static int access100 = 1;
    private final List<CreditConsultingHistory> IAuthTabCallback;
    private final CreditConsultingTime IAuthTabCallbackStub;
    private final CreditConsultingReservationRequest asBinder;
    private final String asInterface;
    private final CreditConsultingHistory onExtraCallback;
    private final List<CreditConsultingCategory> onExtraCallbackWithResult;
    private final CreditConsultingReservationResponse onNavigationEvent;
    private final CreditConsultingCategory onTransact;
    private final runtimeInfoAdd onWarmupCompleted;

    public enableReportDataOptimize() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ enableReportDataOptimize onExtraCallback(enableReportDataOptimize enablereportdataoptimize, List list, List list2, CreditConsultingCategory creditConsultingCategory, CreditConsultingTime creditConsultingTime, String str, CreditConsultingHistory creditConsultingHistory, CreditConsultingReservationResponse creditConsultingReservationResponse, runtimeInfoAdd runtimeinfoadd, CreditConsultingReservationRequest creditConsultingReservationRequest, int i, Object obj) {
        String str2;
        CreditConsultingReservationResponse creditConsultingReservationResponse2;
        runtimeInfoAdd runtimeinfoadd2;
        int i2 = 2 % 2;
        List list3 = (i & 1) != 0 ? enablereportdataoptimize.onExtraCallbackWithResult : list;
        List list4 = (i & 2) != 0 ? enablereportdataoptimize.IAuthTabCallback : list2;
        CreditConsultingCategory creditConsultingCategory2 = (i & 4) != 0 ? enablereportdataoptimize.onTransact : creditConsultingCategory;
        CreditConsultingTime creditConsultingTime2 = (i & 8) != 0 ? enablereportdataoptimize.IAuthTabCallbackStub : creditConsultingTime;
        if ((i & 16) != 0) {
            int i3 = access100 + 25;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            str2 = enablereportdataoptimize.asInterface;
        } else {
            str2 = str;
        }
        CreditConsultingHistory creditConsultingHistory2 = (i & 32) != 0 ? enablereportdataoptimize.onExtraCallback : creditConsultingHistory;
        if ((i & 64) != 0) {
            int i5 = IAuthTabCallbackDefault;
            int i6 = i5 + 75;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            creditConsultingReservationResponse2 = enablereportdataoptimize.onNavigationEvent;
            int i8 = i5 + 13;
            access100 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            creditConsultingReservationResponse2 = creditConsultingReservationResponse;
        }
        if ((i & 128) != 0) {
            int i10 = access100 + 87;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            runtimeinfoadd2 = enablereportdataoptimize.onWarmupCompleted;
        } else {
            runtimeinfoadd2 = runtimeinfoadd;
        }
        return enablereportdataoptimize.IAuthTabCallback(list3, list4, creditConsultingCategory2, creditConsultingTime2, str2, creditConsultingHistory2, creditConsultingReservationResponse2, runtimeinfoadd2, (i & 256) != 0 ? enablereportdataoptimize.asBinder : creditConsultingReservationRequest);
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~i3) | i8;
        int i10 = i7 | (~i9);
        int i11 = i3 | i8;
        int i12 = ~(i9 | i6);
        int i13 = i4 + i6 + i2 + (1075552530 * i5) + ((-1519595880) * i);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i4) - 1639710720) + ((-2116975300) * i6) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i2) + ((-189792256) * i5) + (1111490560 * i) + (1415839744 * i14);
        int i16 = (i4 * 251836610) + 257048825 + (i6 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i2 * 251837547) + (i5 * 1710852742) + (i * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        return i17 != 1 ? i17 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    public final enableReportDataOptimize IAuthTabCallback(@NotNull List<CreditConsultingCategory> list, @NotNull List<CreditConsultingHistory> list2, @Nullable CreditConsultingCategory creditConsultingCategory, @Nullable CreditConsultingTime creditConsultingTime, @Nullable String str, @Nullable CreditConsultingHistory creditConsultingHistory, @Nullable CreditConsultingReservationResponse creditConsultingReservationResponse, @NotNull runtimeInfoAdd runtimeinfoadd, @Nullable CreditConsultingReservationRequest creditConsultingReservationRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(runtimeinfoadd, "");
        enableReportDataOptimize enablereportdataoptimize = new enableReportDataOptimize(list, list2, creditConsultingCategory, creditConsultingTime, str, creditConsultingHistory, creditConsultingReservationResponse, runtimeinfoadd, creditConsultingReservationRequest);
        int i2 = access100 + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return enablereportdataoptimize;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableReportDataOptimize)) {
            int i4 = i3 + 77;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
            }
            return false;
        }
        enableReportDataOptimize enablereportdataoptimize = (enableReportDataOptimize) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, enablereportdataoptimize.onExtraCallbackWithResult)) {
            int i6 = IAuthTabCallbackDefault + 115;
            access100 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, enablereportdataoptimize.IAuthTabCallback)) {
            int i7 = access100 + 47;
            IAuthTabCallbackDefault = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onTransact, enablereportdataoptimize.onTransact)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, enablereportdataoptimize.IAuthTabCallbackStub)) {
            int i8 = access100 + 71;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, enablereportdataoptimize.asInterface)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, enablereportdataoptimize.onExtraCallback)) {
            int i10 = access100 + 101;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, enablereportdataoptimize.onNavigationEvent)) {
            int i12 = access100 + 115;
            IAuthTabCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.onWarmupCompleted == enablereportdataoptimize.onWarmupCompleted) {
            if (Intrinsics.areEqual(this.asBinder, enablereportdataoptimize.asBinder)) {
                return true;
            }
            int i14 = IAuthTabCallbackDefault + 67;
            access100 = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        int i16 = IAuthTabCallbackDefault + 1;
        int i17 = i16 % 128;
        access100 = i17;
        int i18 = i16 % 2;
        int i19 = i17 + 37;
        IAuthTabCallbackDefault = i19 % 128;
        if (i19 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode5 = this.IAuthTabCallback.hashCode();
        CreditConsultingCategory creditConsultingCategory = this.onTransact;
        int iHashCode6 = 0;
        if (creditConsultingCategory == null) {
            int i2 = access100 + 59;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = creditConsultingCategory.hashCode();
        }
        CreditConsultingTime creditConsultingTime = this.IAuthTabCallbackStub;
        if (creditConsultingTime == null) {
            int i4 = IAuthTabCallbackDefault + 113;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = creditConsultingTime.hashCode();
        }
        String str = this.asInterface;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        CreditConsultingHistory creditConsultingHistory = this.onExtraCallback;
        int iHashCode8 = creditConsultingHistory == null ? 0 : creditConsultingHistory.hashCode();
        CreditConsultingReservationResponse creditConsultingReservationResponse = this.onNavigationEvent;
        if (creditConsultingReservationResponse == null) {
            int i6 = access100 + 97;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = creditConsultingReservationResponse.hashCode();
        }
        int iHashCode9 = this.onWarmupCompleted.hashCode();
        CreditConsultingReservationRequest creditConsultingReservationRequest = this.asBinder;
        if (creditConsultingReservationRequest != null) {
            int i8 = access100 + 1;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            iHashCode6 = creditConsultingReservationRequest.hashCode();
        }
        return (((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditConsultingFunnelData(categories=" + this.onExtraCallbackWithResult + ", histories=" + this.IAuthTabCallback + ", selectedCategory=" + this.onTransact + ", selectedTime=" + this.IAuthTabCallbackStub + ", selectedDate=" + this.asInterface + ", currentHistoryDetail=" + this.onExtraCallback + ", latestReservationData=" + this.onNavigationEvent + ", historyDetailType=" + this.onWarmupCompleted + ", request=" + this.asBinder + ")";
        int i2 = access100 + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
        return str;
    }

    public enableReportDataOptimize(@NotNull List<CreditConsultingCategory> list, @NotNull List<CreditConsultingHistory> list2, @Nullable CreditConsultingCategory creditConsultingCategory, @Nullable CreditConsultingTime creditConsultingTime, @Nullable String str, @Nullable CreditConsultingHistory creditConsultingHistory, @Nullable CreditConsultingReservationResponse creditConsultingReservationResponse, @NotNull runtimeInfoAdd runtimeinfoadd, @Nullable CreditConsultingReservationRequest creditConsultingReservationRequest) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(runtimeinfoadd, "");
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallback = list2;
        this.onTransact = creditConsultingCategory;
        this.IAuthTabCallbackStub = creditConsultingTime;
        this.asInterface = str;
        this.onExtraCallback = creditConsultingHistory;
        this.onNavigationEvent = creditConsultingReservationResponse;
        this.onWarmupCompleted = runtimeinfoadd;
        this.asBinder = creditConsultingReservationRequest;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ enableReportDataOptimize(List list, List list2, CreditConsultingCategory creditConsultingCategory, CreditConsultingTime creditConsultingTime, String str, CreditConsultingHistory creditConsultingHistory, CreditConsultingReservationResponse creditConsultingReservationResponse, runtimeInfoAdd runtimeinfoadd, CreditConsultingReservationRequest creditConsultingReservationRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        CreditConsultingCategory creditConsultingCategory2;
        CreditConsultingTime creditConsultingTime2;
        CreditConsultingHistory creditConsultingHistory2;
        CreditConsultingReservationResponse creditConsultingReservationResponse2;
        runtimeInfoAdd runtimeinfoadd2;
        List listEmptyList2 = (i & 1) != 0 ? CollectionsKt.emptyList() : list;
        CreditConsultingReservationRequest creditConsultingReservationRequest2 = null;
        if ((i & 2) != 0) {
            int i2 = access100 + 77;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list2;
        }
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallbackDefault + 43;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            creditConsultingCategory2 = null;
        } else {
            creditConsultingCategory2 = creditConsultingCategory;
        }
        if ((i & 8) != 0) {
            int i6 = IAuthTabCallbackDefault + 85;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            creditConsultingTime2 = null;
        } else {
            creditConsultingTime2 = creditConsultingTime;
        }
        String str2 = (i & 16) != 0 ? null : str;
        if ((i & 32) != 0) {
            int i8 = 2 % 2;
            creditConsultingHistory2 = null;
        } else {
            creditConsultingHistory2 = creditConsultingHistory;
        }
        if ((i & 64) != 0) {
            int i9 = access100 + 17;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            creditConsultingReservationResponse2 = null;
        } else {
            creditConsultingReservationResponse2 = creditConsultingReservationResponse;
        }
        if ((i & 128) != 0) {
            int i12 = access100 + 31;
            IAuthTabCallbackDefault = i12 % 128;
            if (i12 % 2 != 0) {
                runtimeInfoAdd runtimeinfoadd3 = runtimeInfoAdd.FINISHED_RESERVATION;
                throw null;
            }
            runtimeinfoadd2 = runtimeInfoAdd.FINISHED_RESERVATION;
        } else {
            runtimeinfoadd2 = runtimeinfoadd;
        }
        if ((i & 256) != 0) {
            int i13 = IAuthTabCallbackDefault + 11;
            access100 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 20 / 0;
            }
        } else {
            creditConsultingReservationRequest2 = creditConsultingReservationRequest;
        }
        this(listEmptyList2, listEmptyList, creditConsultingCategory2, creditConsultingTime2, str2, creditConsultingHistory2, creditConsultingReservationResponse2, runtimeinfoadd2, creditConsultingReservationRequest2);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        enableReportDataOptimize enablereportdataoptimize = (enableReportDataOptimize) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        List<CreditConsultingCategory> list = enablereportdataoptimize.onExtraCallbackWithResult;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 69;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<CreditConsultingHistory> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 47;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        List<CreditConsultingHistory> list = this.IAuthTabCallback;
        int i5 = i2 + 47;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final CreditConsultingCategory getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 3;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        CreditConsultingCategory creditConsultingCategory = this.onTransact;
        int i5 = i2 + 63;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return creditConsultingCategory;
    }

    public final CreditConsultingTime IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 27;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        CreditConsultingTime creditConsultingTime = this.IAuthTabCallbackStub;
        int i5 = i2 + 115;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return creditConsultingTime;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = access100 + 61;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.asInterface;
        int i5 = i3 + 13;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return str;
    }

    public final CreditConsultingHistory onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 59;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CreditConsultingHistory creditConsultingHistory = this.onExtraCallback;
        int i4 = i2 + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return creditConsultingHistory;
    }

    public final CreditConsultingReservationResponse IAuthTabCallbackStubProxy() {
        CreditConsultingReservationResponse creditConsultingReservationResponse;
        int i = 2 % 2;
        int i2 = access100 + 125;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            creditConsultingReservationResponse = this.onNavigationEvent;
            int i4 = 27 / 0;
        } else {
            creditConsultingReservationResponse = this.onNavigationEvent;
        }
        int i5 = i3 + 41;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return creditConsultingReservationResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        enableReportDataOptimize enablereportdataoptimize = (enableReportDataOptimize) objArr[0];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 7;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        CreditConsultingReservationRequest creditConsultingReservationRequest = enablereportdataoptimize.asBinder;
        if (i4 != 0) {
            int i5 = 4 / 0;
        }
        int i6 = i2 + 97;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return creditConsultingReservationRequest;
        }
        throw null;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        access100 = i2 % 128;
        boolean zIsEmpty = i2 % 2 == 0 ? this.IAuthTabCallback.isEmpty() : !this.IAuthTabCallback.isEmpty();
        int i3 = access100 + 115;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return zIsEmpty;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        if (this.onWarmupCompleted != runtimeInfoAdd.FINISHED_RESERVATION) {
            int i2 = IAuthTabCallbackDefault + 21;
            access100 = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = IAuthTabCallbackDefault + 57;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (this.onWarmupCompleted != runtimeInfoAdd.AFTER_CONFIRM) {
            return false;
        }
        int i4 = IAuthTabCallbackDefault + 49;
        access100 = i4 % 128;
        return i4 % 2 != 0;
    }

    public final String asBinder() {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 109;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        CreditConsultingReservationRequest creditConsultingReservationRequest = this.asBinder;
        if (creditConsultingReservationRequest != null) {
            int i5 = i2 + 83;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            strOnExtraCallback = creditConsultingReservationRequest.onExtraCallback();
        } else {
            strOnExtraCallback = null;
        }
        String strIAuthTabCallback = enableUCWebAROptimize.IAuthTabCallback(strOnExtraCallback, null, 1, null);
        if (strIAuthTabCallback != null) {
            return strIAuthTabCallback;
        }
        int i7 = IAuthTabCallbackDefault + 117;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return "";
    }

    public final String onExtraCallbackWithResult() {
        CreditConsultingHistory creditConsultingHistoryOnNavigationEvent;
        String strOnWarmupCompleted;
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = access100 + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (onTransact()) {
            CreditConsultingReservationResponse creditConsultingReservationResponse = this.onNavigationEvent;
            if (creditConsultingReservationResponse != null) {
                int i4 = IAuthTabCallbackDefault + 97;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                creditConsultingHistoryOnNavigationEvent = creditConsultingReservationResponse.onNavigationEvent();
            } else {
                creditConsultingHistoryOnNavigationEvent = null;
            }
        } else {
            creditConsultingHistoryOnNavigationEvent = this.onExtraCallback;
        }
        if (creditConsultingHistoryOnNavigationEvent == null || (strOnWarmupCompleted = creditConsultingHistoryOnNavigationEvent.onWarmupCompleted()) == null || (strIAuthTabCallback = enableUCWebAROptimize.IAuthTabCallback(strOnWarmupCompleted, null, 1, null)) == null) {
            return "";
        }
        int i6 = access100 + 59;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return strIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() throws NoWhenBranchMatchedException {
        String strOnNavigationEvent;
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CreditConsultingTime creditConsultingTime = this.IAuthTabCallbackStub;
        if (creditConsultingTime != null) {
            int iOnExtraCallbackWithResult = enableUCWebAROptimize.onExtraCallbackWithResult(creditConsultingTime.onExtraCallback());
            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.substringAfter$default(creditConsultingTime.onExtraCallback(), ":", (String) null, 2, (Object) null));
            int i4 = 0;
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            if (iOnExtraCallbackWithResult == 11 && iIntValue == 30) {
                strOnNavigationEvent = priorityUpload.onNavigationEvent(priorityUploadRate.PM);
            } else {
                int i5 = IAuthTabCallbackDefault + 15;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                strOnNavigationEvent = "";
            }
            String str = priorityUpload.onNavigationEvent(priorityUploadRate.Companion.onExtraCallbackWithResult(creditConsultingTime)) + " " + enableUCWebAROptimize.onExtraCallbackWithResult((Pair<Integer, Integer>) getWrite.IAuthTabCallback(Integer.valueOf(iOnExtraCallbackWithResult), Integer.valueOf(iIntValue)));
            if (iIntValue != 0) {
                iOnExtraCallbackWithResult++;
            }
            if (iIntValue == 0) {
                int i7 = IAuthTabCallbackDefault;
                int i8 = i7 + 11;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 125;
                access100 = i10 % 128;
                int i11 = i10 % 2;
                i4 = 30;
            }
            String str2 = str + " ~ " + (strOnNavigationEvent + " " + enableUCWebAROptimize.onExtraCallbackWithResult((Pair<Integer, Integer>) getWrite.IAuthTabCallback(Integer.valueOf(iOnExtraCallbackWithResult), Integer.valueOf(i4))));
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditConsultingHistory creditConsultingHistoryOnNavigationEvent;
        Pair<priorityUploadRate, String> pairIAuthTabCallback;
        Pair<priorityUploadRate, String> pairIAuthTabCallback2;
        priorityUploadRate priorityuploadrate;
        String str;
        priorityUploadRate priorityuploadrate2;
        priorityUploadRate priorityuploadrate3;
        enableReportDataOptimize enablereportdataoptimize = (enableReportDataOptimize) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
            if (enablereportdataoptimize.onTransact()) {
                CreditConsultingReservationResponse creditConsultingReservationResponse = enablereportdataoptimize.onNavigationEvent;
                creditConsultingHistoryOnNavigationEvent = creditConsultingReservationResponse != null ? creditConsultingReservationResponse.onNavigationEvent() : null;
            } else {
                creditConsultingHistoryOnNavigationEvent = enablereportdataoptimize.onExtraCallback;
            }
        } else if (enablereportdataoptimize.onTransact()) {
        }
        if (creditConsultingHistoryOnNavigationEvent != null) {
            int i4 = IAuthTabCallbackDefault + 31;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            String strOnExtraCallback = creditConsultingHistoryOnNavigationEvent.onExtraCallback();
            pairIAuthTabCallback = strOnExtraCallback != null ? enableUCWebAROptimize.IAuthTabCallback(strOnExtraCallback) : null;
        }
        if (creditConsultingHistoryOnNavigationEvent != null) {
            int i6 = access100 + 67;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                creditConsultingHistoryOnNavigationEvent.onExtraCallbackWithResult();
                throw null;
            }
            String strOnExtraCallbackWithResult = creditConsultingHistoryOnNavigationEvent.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                int i7 = access100 + 37;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                pairIAuthTabCallback2 = enableUCWebAROptimize.IAuthTabCallback(strOnExtraCallbackWithResult);
            } else {
                pairIAuthTabCallback2 = null;
            }
        }
        if (pairIAuthTabCallback != null) {
            int i9 = access100 + 85;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            priorityuploadrate = (priorityUploadRate) pairIAuthTabCallback.getFirst();
        } else {
            priorityuploadrate = null;
        }
        if (priorityuploadrate != (pairIAuthTabCallback2 != null ? (priorityUploadRate) pairIAuthTabCallback2.getFirst() : null)) {
            int i11 = access100 + 69;
            IAuthTabCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
            str = ((pairIAuthTabCallback2 == null || (priorityuploadrate3 = (priorityUploadRate) pairIAuthTabCallback2.getFirst()) == null) ? null : priorityUpload.onNavigationEvent(priorityuploadrate3)) + " ";
        } else {
            str = " ";
        }
        return ((pairIAuthTabCallback == null || (priorityuploadrate2 = (priorityUploadRate) pairIAuthTabCallback.getFirst()) == null) ? null : priorityUpload.onNavigationEvent(priorityuploadrate2)) + " " + (pairIAuthTabCallback != null ? (String) pairIAuthTabCallback.getSecond() : null) + " ~ " + str + (pairIAuthTabCallback2 != null ? (String) pairIAuthTabCallback2.getSecond() : null);
    }

    public final List<CreditConsultingCategory> onNavigationEvent() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (List) onWarmupCompleted(new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, -760994305, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 760994305);
    }

    public final String onWarmupCompleted() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (String) onWarmupCompleted(new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, 1819829352, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1819829350);
    }

    public final CreditConsultingReservationRequest access000() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (CreditConsultingReservationRequest) onWarmupCompleted(new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, 325556708, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -325556707);
    }
}
