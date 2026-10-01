package o;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.base.transition.ScaleTransitionExtensionKt$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.handleNativeAdClick;
import o.onStopped;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onStopped {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 7161217123316296017L;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ void IAuthTabCallback(Activity activity) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(activity);
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = onWarmupCompleted();
            int i3 = 29 / 0;
        } else {
            unitOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onExtraCallback + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i2)) | i4;
        int i9 = (~(i7 | (~i2))) | (~((~i4) | i7)) | (~(i4 | i6 | i2));
        int i10 = ~(i2 | i4);
        int i11 = i4 + i6 + i3 + ((-813770285) * i5) + (135932771 * i);
        int i12 = i11 * i11;
        int i13 = (526900465 * i4) + 74317824 + ((-1745228167) * i6) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i3) + (1331953664 * i5) + ((-366739456) * i) + ((-1308753920) * i12);
        int i14 = (i4 * 1149714451) + 247108311 + (i6 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i3 * 1149713731) + (i5 * 1918847289) + (i * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        if (i15 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i15 != 2) {
            return onWarmupCompleted(objArr);
        }
        int i16 = 2 % 2;
        int i17 = onWarmupCompleted + 5;
        onExtraCallback = i17 % 128;
        int i18 = i17 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent();
        int i19 = onExtraCallback + 25;
        onWarmupCompleted = i19 % 128;
        int i20 = i19 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        startWork startwork = (startWork) objArr[0];
        Activity activity = (Activity) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(startwork, activity);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(getNetwork getnetwork, Activity activity, Integer num, boolean z, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 49;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            num = null;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallback + 93;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: im.toss.base.transition.ScaleTransitionExtensionKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 29;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
                        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
                        return (Unit) onStopped.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[0], iOnWarmupCompleted, iOnWarmupCompleted2, -462364189, iOnWarmupCompleted3, 462364191);
                    }
                    int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
                    int iOnWarmupCompleted5 = zzgsa.onWarmupCompleted();
                    int iOnWarmupCompleted6 = zzgsa.onWarmupCompleted();
                    throw null;
                }
            };
        }
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{getnetwork, activity, num, Boolean.valueOf(z), function0}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -984546107, zzgsa.onWarmupCompleted(), 984546108);
    }

    private static final Unit onNavigationEvent() {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 57 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        Object obj;
        getNetwork getnetwork = (getNetwork) objArr[0];
        Activity activity = (Activity) objArr[1];
        Integer num = (Integer) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        Function0 function0 = (Function0) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getnetwork, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        setForeground setforeground = setForeground.onExtraCallback;
        if (!setforeground.asBinder()) {
            setForeground.onExtraCallback(setforeground, "visual_target_start_fallback", "not_available", null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())), 4, null);
            setforeground.onExtraCallback();
            function0.invoke();
            return null;
        }
        try {
            startWork startworkOnExtraCallbackWithResult = setforeground.onExtraCallbackWithResult();
            if (startworkOnExtraCallbackWithResult == null) {
                int i2 = onExtraCallback + 79;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    setForeground.onExtraCallback(setforeground, "visual_target_start_fallback", "entry_missing", null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())), 4, null);
                    function0.invoke();
                    return null;
                }
                setForeground.onExtraCallback(setforeground, "visual_target_start_fallback", "entry_missing", null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())), 4, null);
                function0.invoke();
                return null;
            }
            obj = "activity";
            try {
                if (!onExtraCallbackWithResult(getnetwork, startworkOnExtraCallbackWithResult, activity, num, zBooleanValue, function0)) {
                    int i3 = onExtraCallback + 9;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        setforeground.onExtraCallbackWithResult();
                        throw null;
                    }
                    if (setforeground.onExtraCallbackWithResult() == startworkOnExtraCallbackWithResult) {
                        int i4 = onExtraCallback + 99;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        startworkOnExtraCallbackWithResult.ICustomTabsCallback_Parcel();
                        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
                        setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startworkOnExtraCallbackWithResult, false, false, 6, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                        function0.invoke();
                    }
                }
                return null;
            } catch (Exception e) {
                e = e;
                setForeground setforeground2 = setForeground.onExtraCallback;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(obj, activity.getClass().getSimpleName());
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("exception", e.getClass().getSimpleName());
                Object[] objArr2 = new Object[1];
                a(new char[]{5862, 5771, 19530, 21842, 6132, 24178, 29083, 8336, 24563, 6140, 15129}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                setForeground.onExtraCallback(setforeground2, "visual_target_start_fallback", "exception", null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), e.getMessage())}), 4, null);
                setforeground2.onExtraCallback();
                function0.invoke();
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            obj = "activity";
        }
    }

    public static /* synthetic */ boolean onExtraCallback(getNetwork getnetwork, startWork startwork, Activity activity, Integer num, boolean z, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            int i6 = i3 + 33;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            function0 = new Function0() { // from class: im.toss.base.transition.ScaleTransitionExtensionKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 51;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnExtraCallback = onStopped.onExtraCallback();
                    int i11 = onNavigationEvent + 45;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            };
            int i8 = onExtraCallback + 105;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        return onExtraCallbackWithResult(getnetwork, startwork, activity, num2, z2, function0);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 5;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45812), 83 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 21233 - TextUtils.indexOf("", "", 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 14185), 19 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTouchSlop() >> 8) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 3;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static final Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onExtraCallbackWithResult(@NotNull getNetwork getnetwork, @NotNull startWork startwork, @NotNull Activity activity, @Nullable Integer num, boolean z, @NotNull Function0<Unit> function0) throws Throwable {
        CharSequence charSequence;
        String str;
        int i;
        int i2;
        int i3;
        Object obj;
        Throwable th;
        Pair pairIAuthTabCallback;
        Pair pairIAuthTabCallback2;
        Pair pairIAuthTabCallback3;
        Pair pairIAuthTabCallback4;
        Pair pairIAuthTabCallback5;
        Integer num2;
        boolean z2;
        Integer numIAuthTabCallbackStub;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 59;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getnetwork, "");
            Intrinsics.checkNotNullParameter(startwork, "");
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(function0, "");
            setForeground.onExtraCallback.asBinder();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(getnetwork, "");
        Intrinsics.checkNotNullParameter(startwork, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        setForeground setforeground = setForeground.onExtraCallback;
        if (!setforeground.asBinder()) {
            int i6 = onWarmupCompleted + 113;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            setforeground.onExtraCallback("visual_target_start_skipped", "not_available", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return false;
        }
        try {
            Result.Companion companion = kotlin.Result.Companion;
            pairIAuthTabCallback = getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName());
            charSequence = "";
            try {
                pairIAuthTabCallback2 = getWrite.IAuthTabCallback("position_x", Float.valueOf(Float.intBitsToFloat((int) (getnetwork.IAuthTabCallbackDefault() >> 32))));
                pairIAuthTabCallback3 = getWrite.IAuthTabCallback("position_y", Float.valueOf(Float.intBitsToFloat((int) getnetwork.IAuthTabCallbackDefault())));
                pairIAuthTabCallback4 = getWrite.IAuthTabCallback("target_width", Integer.valueOf(getnetwork.onTransact()));
                pairIAuthTabCallback5 = getWrite.IAuthTabCallback("target_height", Integer.valueOf(getnetwork.onWarmupCompleted()));
            } catch (Throwable th2) {
                th = th2;
                i3 = 1;
                str = "visual_target_start_skipped";
                i = 3;
            }
        } catch (Throwable th3) {
            th = th3;
            charSequence = "";
            str = "visual_target_start_skipped";
            i = 3;
            i2 = 0;
            i3 = 1;
        }
        try {
            Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("show_loading", Boolean.valueOf(z));
            if (getnetwork.onExtraCallbackWithResult() != null) {
                int i8 = onExtraCallback + 81;
                onWarmupCompleted = i8 % 128;
                boolean z3 = i8 % 2 != 0;
                try {
                    Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("has_fallback_bitmap", Boolean.valueOf(z3));
                    if (num == null) {
                        Integer numIAuthTabCallbackStub2 = getnetwork.IAuthTabCallbackStub();
                        int i9 = onExtraCallback + 39;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        num2 = numIAuthTabCallbackStub2;
                    } else {
                        num2 = num;
                    }
                    if (num2 != null) {
                        int i11 = onWarmupCompleted + 15;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("has_radius", Boolean.valueOf(z2));
                    Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback("squircle", getnetwork.asBinder() != null ? handleNativeAdClick.onExtraCallback.asInterface.class.getSimpleName() : null);
                    str = "visual_target_start_skipped";
                    try {
                        Pair[] pairArr = new Pair[9];
                        try {
                            pairArr[0] = pairIAuthTabCallback;
                            try {
                                pairArr[1] = pairIAuthTabCallback2;
                                pairArr[2] = pairIAuthTabCallback3;
                                i = 3;
                                try {
                                    pairArr[3] = pairIAuthTabCallback4;
                                    pairArr[4] = pairIAuthTabCallback5;
                                    pairArr[5] = pairIAuthTabCallback6;
                                    pairArr[6] = pairIAuthTabCallback7;
                                    pairArr[7] = pairIAuthTabCallback8;
                                    pairArr[8] = pairIAuthTabCallback9;
                                    Map mapOnWarmupCompleted = access8100.onWarmupCompleted(pairArr);
                                    i2 = 0;
                                    i3 = 1;
                                    try {
                                        setForeground.onExtraCallback(setforeground, "visual_target_start_requested", null, startwork, mapOnWarmupCompleted, 2, null);
                                        getTags gettags = getTags.IAuthTabCallback;
                                        getJobwork_runtime_ktx_release getjobwork_runtime_ktx_releaseIAuthTabCallback = getnetwork.IAuthTabCallback();
                                        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (getnetwork.IAuthTabCallbackDefault() >> 32));
                                        int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) getnetwork.IAuthTabCallbackDefault());
                                        int iOnTransact = getnetwork.onTransact();
                                        int iOnWarmupCompleted = getnetwork.onWarmupCompleted();
                                        if (num == null) {
                                            int i13 = onWarmupCompleted + 61;
                                            onExtraCallback = i13 % 128;
                                            if (i13 % 2 != 0) {
                                                getnetwork.IAuthTabCallbackStub();
                                                Object obj3 = null;
                                                obj3.hashCode();
                                                throw null;
                                            }
                                            numIAuthTabCallbackStub = getnetwork.IAuthTabCallbackStub();
                                        } else {
                                            numIAuthTabCallbackStub = num;
                                        }
                                        obj = kotlin.Result.constructor-impl(Boolean.valueOf(((Boolean) getTags.IAuthTabCallback(1231061167, new Object[]{gettags, startwork, activity, getjobwork_runtime_ktx_releaseIAuthTabCallback, Integer.valueOf(iIntBitsToFloat), Integer.valueOf(iIntBitsToFloat2), Integer.valueOf(iOnTransact), Integer.valueOf(iOnWarmupCompleted), numIAuthTabCallbackStub, 0, function0, getnetwork.asBinder(), Boolean.valueOf(z), getnetwork.onExtraCallback(), getnetwork.onNavigationEvent(), getnetwork.onExtraCallbackWithResult()}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1231061165, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue()));
                                    } catch (Throwable th4) {
                                        th = th4;
                                        Result.Companion companion2 = kotlin.Result.Companion;
                                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                                        th = kotlin.Result.exceptionOrNull-impl(obj);
                                        if (th != null) {
                                        }
                                        return ((Boolean) obj).booleanValue();
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    i3 = 1;
                                    i2 = 0;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                i3 = 1;
                                i2 = 0;
                                i = 3;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            i2 = 0;
                            i = 3;
                            i3 = 1;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        i = 3;
                        i3 = 1;
                        i2 = 0;
                        Result.Companion companion22 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                        th = kotlin.Result.exceptionOrNull-impl(obj);
                        if (th != null) {
                        }
                        return ((Boolean) obj).booleanValue();
                    }
                } catch (Throwable th9) {
                    th = th9;
                    str = "visual_target_start_skipped";
                }
            }
        } catch (Throwable th10) {
            th = th10;
            str = "visual_target_start_skipped";
            i = 3;
            i3 = 1;
            i2 = 0;
            Result.Companion companion222 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            th = kotlin.Result.exceptionOrNull-impl(obj);
            if (th != null) {
            }
            return ((Boolean) obj).booleanValue();
        }
        th = kotlin.Result.exceptionOrNull-impl(obj);
        if (th != null) {
            setForeground setforeground2 = setForeground.onExtraCallback;
            Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName());
            Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback("exception", th.getClass().getSimpleName());
            CharSequence charSequence2 = charSequence;
            int iIndexOf = 1 - TextUtils.indexOf(charSequence2, charSequence2, i2, i2);
            Object[] objArr = new Object[i3];
            a(new char[]{5862, 5771, 19530, 21842, 6132, 24178, 29083, 8336, 24563, 6140, 15129}, iIndexOf, objArr);
            Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback(((String) objArr[i2]).intern(), th.getMessage());
            Pair[] pairArr2 = new Pair[i];
            pairArr2[i2] = pairIAuthTabCallback10;
            pairArr2[i3] = pairIAuthTabCallback11;
            pairArr2[2] = pairIAuthTabCallback12;
            setforeground2.onExtraCallback(str, "exception", startwork, access8100.onWarmupCompleted(pairArr2));
            obj = Boolean.FALSE;
        }
        return ((Boolean) obj).booleanValue();
    }

    public static /* synthetic */ void IAuthTabCallback(Activity activity, String str, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            str = null;
        }
        onWarmupCompleted(activity, str);
        int i5 = onWarmupCompleted + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull Activity activity, @Nullable String str) {
        startWork startworkOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            int i3 = 0 / 0;
            if (str != null) {
                startworkOnExtraCallback = setForeground.onExtraCallback.onExtraCallback(str);
                int i4 = onWarmupCompleted + 31;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                startworkOnExtraCallback = setForeground.onExtraCallback.onExtraCallbackWithResult();
            }
        } else {
            Intrinsics.checkNotNullParameter(activity, "");
            if (str != null) {
            }
        }
        if (startworkOnExtraCallback == null) {
            int i6 = onExtraCallback + 43;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            setForeground.onExtraCallback(setForeground.onExtraCallback, "finish_with_transition_fallback", "entry_missing", null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName()), getWrite.IAuthTabCallback("session_id", str)}), 4, null);
            onWarmupCompleted(activity, false);
            return;
        }
        setForeground setforeground = setForeground.onExtraCallback;
        setForeground.onExtraCallback(setforeground, "finish_with_transition_requested", null, startworkOnExtraCallback, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName()), getWrite.IAuthTabCallback("session_id", str)}), 2, null);
        if (!startworkOnExtraCallback.ICustomTabsService()) {
            setforeground.onExtraCallback("finish_with_transition_fallback", "invalid_entry", startworkOnExtraCallback, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            startworkOnExtraCallback.ICustomTabsCallback_Parcel();
            Function0 function0 = (Function0) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new Object[]{startworkOnExtraCallback}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1666755789);
            if (function0 != null) {
                function0.invoke();
            }
            int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startworkOnExtraCallback, false, false, 4, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            onWarmupCompleted(activity, false);
            int i8 = onWarmupCompleted + 105;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        getTags.IAuthTabCallback.IAuthTabCallback(startworkOnExtraCallback);
        if (((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startworkOnExtraCallback}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue()) {
            setforeground.onExtraCallback("finish_close_already_requested", "already_pending_end", startworkOnExtraCallback, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            if (activity.isFinishing()) {
                return;
            }
            int i10 = onWarmupCompleted + 83;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                onWarmupCompleted(activity, false);
                return;
            } else {
                onWarmupCompleted(activity, true);
                return;
            }
        }
        if (setforeground.IAuthTabCallback(startworkOnExtraCallback)) {
            setForeground.onExtraCallback(setforeground, "finish_close_requested", null, startworkOnExtraCallback, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())), 2, null);
            onWarmupCompleted(activity, true);
            return;
        }
        setforeground.onExtraCallback("finish_with_transition_fallback", "request_close_failed", startworkOnExtraCallback, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
        startworkOnExtraCallback.ICustomTabsCallback_Parcel();
        Function0 function02 = (Function0) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new Object[]{startworkOnExtraCallback}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1666755789);
        if (function02 != null) {
            int i11 = onExtraCallback + 85;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            function02.invoke();
        }
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, iOnNavigationEvent2, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startworkOnExtraCallback, false, false, 4, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        onWarmupCompleted(activity, false);
    }

    private static final void onWarmupCompleted(Activity activity, boolean z) {
        int i = 2 % 2;
        activity.finish();
        if (z) {
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                activity.overridePendingTransition(0, 1);
            } else {
                activity.overridePendingTransition(0, 0);
            }
        }
        int i3 = onWarmupCompleted + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void onNavigationEvent(startWork startwork, Activity activity) throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        if (!(!setForeground.onExtraCallback.onNavigationEvent(startwork))) {
            int i2 = onExtraCallback + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                getTags.IAuthTabCallback(1820477681, new Object[]{getTags.IAuthTabCallback, activity, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1820477681, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
                obj.hashCode();
                throw null;
            }
            getTags.IAuthTabCallback(1820477681, new Object[]{getTags.IAuthTabCallback, activity, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1820477681, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        }
        int i3 = onExtraCallback + 107;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallbackWithResult(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        setForeground setforeground = setForeground.onExtraCallback;
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        startWork startwork = (startWork) setForeground.onWarmupCompleted(iOnNavigationEvent2, -1958547545, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1958547546, new Object[]{setforeground, activity}, iOnNavigationEvent3);
        if (startwork == null) {
            int iOnNavigationEvent4 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent5 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent6 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            setForeground.onWarmupCompleted(iOnNavigationEvent5, 1992638348, iOnNavigationEvent4, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1992638345, new Object[]{setforeground, activity}, iOnNavigationEvent6);
            return;
        }
        activity.getWindow().getDecorView().post(new ScaleTransitionExtensionKt$.ExternalSyntheticLambda2(startwork, activity));
        activity.getWindow().getDecorView().postDelayed(new ScaleTransitionExtensionKt$.ExternalSyntheticLambda3(activity), 1100L);
        int i4 = onExtraCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(Activity activity) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {setForeground.onExtraCallback, activity};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1992638348, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1992638345, objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = onWarmupCompleted + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[0], iOnWarmupCompleted, iOnWarmupCompleted2, -462364189, iOnWarmupCompleted3, 462364191);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(startWork startwork, Activity activity) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{startwork, activity}, iOnWarmupCompleted, iOnWarmupCompleted2, -2131545950, iOnWarmupCompleted3, 2131545950);
    }

    public static final void onExtraCallback(@NotNull getNetwork getnetwork, @NotNull Activity activity, @Nullable Integer num, boolean z, @NotNull Function0<Unit> function0) {
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{getnetwork, activity, num, Boolean.valueOf(z), function0}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -984546107, zzgsa.onWarmupCompleted(), 984546108);
    }
}
