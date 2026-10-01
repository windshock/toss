package o;

import android.os.Bundle;
import im.toss.activitydelegate.DelegateActivity;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IEngagementSignalsCallbackDefault;
import o.getVisibilityChangeInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getVisibilityChangeInfo {
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private final Function1<DelegateActivity, Boolean> IAuthTabCallback;
    private final Function1<DelegateActivity, Unit> IAuthTabCallbackDefault;
    private final Function1<DelegateActivity, Unit> asBinder;
    private final Function1<DelegateActivity, Unit> asInterface;
    private final Function1<DelegateActivity, Unit> onExtraCallback;
    private final Function1<DelegateActivity, Unit> onExtraCallbackWithResult;
    private final Function2<DelegateActivity, Bundle, Unit> onNavigationEvent;
    private final setTaggedAddrCtrl<DelegateActivity, Integer, String[], int[], Unit> onTransact;
    private final Function2<DelegateActivity, IEngagementSignalsCallbackDefault, Unit> onWarmupCompleted;

    public getVisibilityChangeInfo() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ Unit IAuthTabCallback(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -685103666, new Object[]{delegateActivity}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 685103668);
        int i4 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(delegateActivity);
        int i4 = IAuthTabCallbackStubProxy + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        int i4 = IAuthTabCallbackStubProxy + 61;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(delegateActivity);
        int i4 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(DelegateActivity delegateActivity, int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(delegateActivity, i, strArr, iArr);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(delegateActivity, i, strArr, iArr);
        int i4 = IAuthTabCallbackStubProxy + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(delegateActivity);
        int i4 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return unitAsInterface;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1<DelegateActivity, Unit> function1;
        Function2<DelegateActivity, IEngagementSignalsCallbackDefault, Unit> function2;
        Function1<DelegateActivity, Boolean> function12;
        getVisibilityChangeInfo getvisibilitychangeinfo = (getVisibilityChangeInfo) objArr[0];
        Function2<DelegateActivity, Bundle, Unit> function22 = (Function2) objArr[1];
        Function1<DelegateActivity, Unit> function13 = (Function1) objArr[2];
        Function1<DelegateActivity, Unit> function14 = (Function1) objArr[3];
        Function1<DelegateActivity, Unit> function15 = (Function1) objArr[4];
        Function1<DelegateActivity, Unit> function16 = (Function1) objArr[5];
        Function1<DelegateActivity, Unit> function17 = (Function1) objArr[6];
        Function2<DelegateActivity, IEngagementSignalsCallbackDefault, Unit> function23 = (Function2) objArr[7];
        setTaggedAddrCtrl<DelegateActivity, Integer, String[], int[], Unit> settaggedaddrctrl = (setTaggedAddrCtrl) objArr[8];
        Function1<DelegateActivity, Boolean> function18 = (Function1) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        Object obj = objArr[11];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 29;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if ((iIntValue & 1) != 0) {
            function22 = getvisibilitychangeinfo.onNavigationEvent;
        }
        if ((iIntValue & 2) != 0) {
            int i5 = i2 + 51;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            function13 = getvisibilitychangeinfo.asBinder;
        }
        Function1<DelegateActivity, Unit> function19 = function13;
        Function1<DelegateActivity, Unit> function110 = (iIntValue & 4) != 0 ? getvisibilitychangeinfo.IAuthTabCallbackDefault : function14;
        Function1<DelegateActivity, Unit> function111 = (iIntValue & 8) != 0 ? getvisibilitychangeinfo.onExtraCallback : function15;
        Function1<DelegateActivity, Unit> function112 = (iIntValue & 16) != 0 ? getvisibilitychangeinfo.asInterface : function16;
        if ((iIntValue & 32) != 0) {
            int i7 = i2 + 43;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                Function1<DelegateActivity, Unit> function113 = getvisibilitychangeinfo.onExtraCallbackWithResult;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            function1 = getvisibilitychangeinfo.onExtraCallbackWithResult;
        } else {
            function1 = function17;
        }
        if ((iIntValue & 64) != 0) {
            int i8 = IAuthTabCallbackStub + 31;
            IAuthTabCallbackStubProxy = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 62 / 0;
                function2 = getvisibilitychangeinfo.onWarmupCompleted;
            } else {
                function2 = getvisibilitychangeinfo.onWarmupCompleted;
            }
        } else {
            function2 = function23;
        }
        setTaggedAddrCtrl<DelegateActivity, Integer, String[], int[], Unit> settaggedaddrctrl2 = (iIntValue & 128) != 0 ? getvisibilitychangeinfo.onTransact : settaggedaddrctrl;
        if ((iIntValue & 256) != 0) {
            Function1<DelegateActivity, Boolean> function114 = getvisibilitychangeinfo.IAuthTabCallback;
            int i10 = IAuthTabCallbackStub + 101;
            IAuthTabCallbackStubProxy = i10 % 128;
            int i11 = i10 % 2;
            function12 = function114;
        } else {
            function12 = function18;
        }
        getVisibilityChangeInfo getvisibilitychangeinfo2 = (getVisibilityChangeInfo) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -488310655, new Object[]{getvisibilitychangeinfo, function22, function19, function110, function111, function112, function1, function2, settaggedaddrctrl2, function12}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 488310656);
        int i12 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackStubProxy = i12 % 128;
        int i13 = i12 % 2;
        return getvisibilitychangeinfo2;
    }

    public static /* synthetic */ Unit onNavigationEvent(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {delegateActivity};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(iOnExtraCallbackWithResult4, 344416714, objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -344416714);
        int i4 = IAuthTabCallbackStub + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(DelegateActivity delegateActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(delegateActivity, bundle);
        int i4 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i4) | i6 | i2);
        int i8 = i4 | i6 | i2;
        int i9 = (~((~i6) | (~i2))) | i7;
        int i10 = i6 + i2 + i5 + (1512347918 * i3) + (2033855975 * i);
        int i11 = i10 * i10;
        int i12 = ((i6 * 1295388527) - 26148864) + (1295388527 * i2) + (2139102940 * i7) + (i8 * 1077932178) + (1077932178 * i9) + ((-1921646592) * i5) + (1114898432 * i3) + (1668939776 * i) + (346619904 * i11);
        int i13 = ((i6 * 1848112433) - 751391395) + (i2 * 1848112433) + (i7 * (-92)) + (i8 * 46) + (i9 * 46) + (i5 * 1848112479) + (i3 * (-818859470)) + (i * (-357164103)) + (i11 * 1740046336);
        int i14 = i12 + (i13 * i13 * 1721171968);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function2 function2 = (Function2) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        Function1 function13 = (Function1) objArr[4];
        Function1 function14 = (Function1) objArr[5];
        Function1 function15 = (Function1) objArr[6];
        Function2 function22 = (Function2) objArr[7];
        setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) objArr[8];
        Function1 function16 = (Function1) objArr[9];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        Intrinsics.checkNotNullParameter(function15, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        Intrinsics.checkNotNullParameter(function16, "");
        getVisibilityChangeInfo getvisibilitychangeinfo = new getVisibilityChangeInfo(function2, function1, function12, function13, function14, function15, function22, settaggedaddrctrl, function16);
        int i2 = IAuthTabCallbackStubProxy + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return getvisibilitychangeinfo;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DelegateActivity delegateActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(delegateActivity, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            return ((Boolean) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1696736378, new Object[]{delegateActivity}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1696736375)).booleanValue();
        }
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int i3 = 78 / 0;
        return ((Boolean) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1696736378, new Object[]{delegateActivity}, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, -1696736375)).booleanValue();
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 65;
        IAuthTabCallbackStub = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 9;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 31;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof getVisibilityChangeInfo)) {
            int i7 = i2 + 99;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        getVisibilityChangeInfo getvisibilitychangeinfo = (getVisibilityChangeInfo) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, getvisibilitychangeinfo.onNavigationEvent) || (!Intrinsics.areEqual(this.asBinder, getvisibilitychangeinfo.asBinder)) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, getvisibilitychangeinfo.IAuthTabCallbackDefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, getvisibilitychangeinfo.onExtraCallback)) {
            int i9 = IAuthTabCallbackStubProxy + 65;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, getvisibilitychangeinfo.asInterface) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, getvisibilitychangeinfo.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onWarmupCompleted, getvisibilitychangeinfo.onWarmupCompleted) || !Intrinsics.areEqual(this.onTransact, getvisibilitychangeinfo.onTransact) || !Intrinsics.areEqual(this.IAuthTabCallback, getvisibilitychangeinfo.IAuthTabCallback)) {
            return false;
        }
        int i11 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackStubProxy = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((this.onNavigationEvent.hashCode() * 31) + this.asBinder.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BaseActivityDelegate(onCreate=" + this.onNavigationEvent + ", onStart=" + this.asBinder + ", onResume=" + this.IAuthTabCallbackDefault + ", onPause=" + this.onExtraCallback + ", onStop=" + this.asInterface + ", onDestroy=" + this.onExtraCallbackWithResult + ", onActivityResult=" + this.onWarmupCompleted + ", onRequestPermissionsResult=" + this.onTransact + ", onHandleBackPressed=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackStubProxy + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getVisibilityChangeInfo(@NotNull Function2<? super DelegateActivity, ? super Bundle, Unit> function2, @NotNull Function1<? super DelegateActivity, Unit> function1, @NotNull Function1<? super DelegateActivity, Unit> function12, @NotNull Function1<? super DelegateActivity, Unit> function13, @NotNull Function1<? super DelegateActivity, Unit> function14, @NotNull Function1<? super DelegateActivity, Unit> function15, @NotNull Function2<? super DelegateActivity, ? super IEngagementSignalsCallbackDefault, Unit> function22, @NotNull setTaggedAddrCtrl<? super DelegateActivity, ? super Integer, ? super String[], ? super int[], Unit> settaggedaddrctrl, @NotNull Function1<? super DelegateActivity, Boolean> function16) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        Intrinsics.checkNotNullParameter(function15, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        Intrinsics.checkNotNullParameter(function16, "");
        this.onNavigationEvent = function2;
        this.asBinder = function1;
        this.IAuthTabCallbackDefault = function12;
        this.onExtraCallback = function13;
        this.asInterface = function14;
        this.onExtraCallbackWithResult = function15;
        this.onWarmupCompleted = function22;
        this.onTransact = settaggedaddrctrl;
        this.IAuthTabCallback = function16;
    }

    public /* synthetic */ getVisibilityChangeInfo(Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function2 function22, setTaggedAddrCtrl settaggedaddrctrl, Function1 function16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Function1 function17;
        Function1 function18;
        Function1 function19;
        Function2 function23 = (i & 1) != 0 ? new Function2() { // from class: im.toss.activitydelegate.BaseActivityDelegate$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 125;
                onExtraCallback = i3 % 128;
                DelegateActivity delegateActivity = (DelegateActivity) obj;
                Bundle bundle = (Bundle) obj2;
                if (i3 % 2 == 0) {
                    getVisibilityChangeInfo.onNavigationEvent(delegateActivity, bundle);
                    throw null;
                }
                Unit unitOnNavigationEvent = getVisibilityChangeInfo.onNavigationEvent(delegateActivity, bundle);
                int i4 = onExtraCallback + 101;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        } : function2;
        Function1 function110 = (i & 2) != 0 ? new Function1() { // from class: im.toss.activitydelegate.BaseActivityDelegate$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 43;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = getVisibilityChangeInfo.onExtraCallbackWithResult((DelegateActivity) obj);
                if (i4 == 0) {
                    int i5 = 5 / 0;
                }
                int i6 = onExtraCallbackWithResult + 3;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 66 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        } : function1;
        if ((i & 4) != 0) {
            function17 = new Function1() { // from class: im.toss.activitydelegate.BaseActivityDelegate$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 47;
                    onWarmupCompleted = i3 % 128;
                    DelegateActivity delegateActivity = (DelegateActivity) obj;
                    if (i3 % 2 != 0) {
                        getVisibilityChangeInfo.IAuthTabCallbackStub(delegateActivity);
                        throw null;
                    }
                    Unit unitIAuthTabCallbackStub = getVisibilityChangeInfo.IAuthTabCallbackStub(delegateActivity);
                    int i4 = onWarmupCompleted + 83;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return unitIAuthTabCallbackStub;
                }
            };
            int i2 = IAuthTabCallbackStubProxy + 69;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            function17 = function12;
        }
        Function1 function111 = (i & 8) != 0 ? new Function1() { // from class: im.toss.activitydelegate.BaseActivityDelegate$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i5 = 2 % 2;
                int i6 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                Unit unitOnExtraCallback = getVisibilityChangeInfo.onExtraCallback((DelegateActivity) obj);
                int i8 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        } : function13;
        Function1 function112 = (i & 16) != 0 ? new Function1() { // from class: im.toss.activitydelegate.BaseActivityDelegate$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i5 = 2 % 2;
                int i6 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                Unit unitIAuthTabCallback = getVisibilityChangeInfo.IAuthTabCallback((DelegateActivity) obj);
                if (i7 != 0) {
                    int i8 = 46 / 0;
                }
                return unitIAuthTabCallback;
            }
        } : function14;
        if ((i & 32) != 0) {
            function18 = new Function1() { // from class: im.toss.activitydelegate.BaseActivityDelegate$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 33;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnNavigationEvent = getVisibilityChangeInfo.onNavigationEvent((DelegateActivity) obj);
                    int i8 = IAuthTabCallback + 41;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 89 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            };
            int i5 = IAuthTabCallbackStub + 105;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        } else {
            function18 = function15;
        }
        Function2 function24 = (i & 64) != 0 ? new Function2() { // from class: im.toss.activitydelegate.BaseActivityDelegate$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnWarmupCompleted = getVisibilityChangeInfo.onWarmupCompleted((DelegateActivity) obj, (IEngagementSignalsCallbackDefault) obj2);
                int i10 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        } : function22;
        setTaggedAddrCtrl settaggedaddrctrl2 = (i & 128) != 0 ? new setTaggedAddrCtrl() { // from class: im.toss.activitydelegate.BaseActivityDelegate$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnExtraCallback = getVisibilityChangeInfo.onExtraCallback((DelegateActivity) obj, ((Integer) obj2).intValue(), (String[]) obj3, (int[]) obj4);
                int i10 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 57 / 0;
                }
                return unitOnExtraCallback;
            }
        } : settaggedaddrctrl;
        if ((i & 256) != 0) {
            function19 = new Function1() { // from class: im.toss.activitydelegate.BaseActivityDelegate$$ExternalSyntheticLambda8
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 103;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    boolean zOnWarmupCompleted = getVisibilityChangeInfo.onWarmupCompleted((DelegateActivity) obj);
                    if (i9 == 0) {
                        Boolean.valueOf(zOnWarmupCompleted);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Boolean boolValueOf = Boolean.valueOf(zOnWarmupCompleted);
                    int i10 = onNavigationEvent + 51;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    return boolValueOf;
                }
            };
            int i7 = IAuthTabCallbackStub + 95;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } else {
            function19 = function16;
        }
        this(function23, function110, function17, function111, function112, function18, function24, settaggedaddrctrl2, function19);
    }

    private static final Unit onExtraCallbackWithResult(DelegateActivity delegateActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 121;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    public final Function2<DelegateActivity, Bundle, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 25;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Function2<DelegateActivity, Bundle, Unit> function2 = this.onNavigationEvent;
        int i5 = i2 + 15;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 83;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return unit2;
    }

    public final Function1<DelegateActivity, Unit> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Function1<DelegateActivity, Unit> function1 = this.asBinder;
        int i5 = i3 + 65;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return function1;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function1<DelegateActivity, Unit> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Function1<DelegateActivity, Unit> function1 = this.IAuthTabCallbackDefault;
        int i5 = i3 + 125;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    private static final Unit asBinder(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        int i3 = 23 / 0;
        return Unit.INSTANCE;
    }

    public final Function1<DelegateActivity, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        Function1<DelegateActivity, Unit> function1 = this.onExtraCallback;
        int i4 = i3 + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return function1;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        int i3 = 70 / 0;
        return Unit.INSTANCE;
    }

    public final Function1<DelegateActivity, Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 69;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Function1<DelegateActivity, Unit> function1 = this.asInterface;
        int i5 = i2 + 3;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Unit unit;
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            unit = Unit.INSTANCE;
            int i3 = 17 / 0;
        } else {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStubProxy + 77;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final Function1<DelegateActivity, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(DelegateActivity delegateActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final Function2<DelegateActivity, IEngagementSignalsCallbackDefault, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 23;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Function2<DelegateActivity, IEngagementSignalsCallbackDefault, Unit> function2 = this.onWarmupCompleted;
        int i5 = i2 + 35;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    private static final Unit onNavigationEvent(DelegateActivity delegateActivity, int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setTaggedAddrCtrl<DelegateActivity, Integer, String[], int[], Unit> asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        setTaggedAddrCtrl<DelegateActivity, Integer, String[], int[], Unit> settaggedaddrctrl = this.onTransact;
        int i5 = i3 + 43;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return settaggedaddrctrl;
    }

    public final Function1<DelegateActivity, Boolean> onExtraCallback() {
        Function1<DelegateActivity, Boolean> function1;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 93;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            function1 = this.IAuthTabCallback;
            int i4 = 23 / 0;
        } else {
            function1 = this.IAuthTabCallback;
        }
        int i5 = i2 + 77;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return function1;
        }
        throw null;
    }

    private static final Unit onTransact(DelegateActivity delegateActivity) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -685103666, new Object[]{delegateActivity}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 685103668);
    }

    private static final Unit access100(DelegateActivity delegateActivity) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 344416714, new Object[]{delegateActivity}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -344416714);
    }

    private static final boolean IAuthTabCallbackStubProxy(DelegateActivity delegateActivity) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1696736378, new Object[]{delegateActivity}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1696736375)).booleanValue();
    }

    public static /* synthetic */ getVisibilityChangeInfo IAuthTabCallback(getVisibilityChangeInfo getvisibilitychangeinfo, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function2 function22, setTaggedAddrCtrl settaggedaddrctrl, Function1 function16, int i, Object obj) {
        Object[] objArr = {getvisibilitychangeinfo, function2, function1, function12, function13, function14, function15, function22, settaggedaddrctrl, function16, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (getVisibilityChangeInfo) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 969013689, objArr, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -969013685);
    }

    public final getVisibilityChangeInfo onNavigationEvent(@NotNull Function2<? super DelegateActivity, ? super Bundle, Unit> function2, @NotNull Function1<? super DelegateActivity, Unit> function1, @NotNull Function1<? super DelegateActivity, Unit> function12, @NotNull Function1<? super DelegateActivity, Unit> function13, @NotNull Function1<? super DelegateActivity, Unit> function14, @NotNull Function1<? super DelegateActivity, Unit> function15, @NotNull Function2<? super DelegateActivity, ? super IEngagementSignalsCallbackDefault, Unit> function22, @NotNull setTaggedAddrCtrl<? super DelegateActivity, ? super Integer, ? super String[], ? super int[], Unit> settaggedaddrctrl, @NotNull Function1<? super DelegateActivity, Boolean> function16) {
        Object[] objArr = {this, function2, function1, function12, function13, function14, function15, function22, settaggedaddrctrl, function16};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (getVisibilityChangeInfo) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -488310655, objArr, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 488310656);
    }
}
