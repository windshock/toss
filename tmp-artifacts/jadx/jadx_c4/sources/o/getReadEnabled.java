package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.ui.platform.ComposeView;
import im.toss.components.tuba.trigger.R;
import im.toss.components.tuba.trigger.internal.BottomSheetV2TriggerExecutor$TubaTriggerDialog$;
import im.toss.core.tuba.Trigger;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ZslRingBuffer;
import o.getReadEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getReadEnabled extends getWriteEnabled {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static long IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    public static final int onNavigationEvent;
    private static int onTransact;
    private final UtilsKtExternalSyntheticLambda9 onExtraCallback;
    private final ALCFaceSDKExternalSyntheticLambda3 onWarmupCompleted;

    static {
        onWarmupCompleted();
        Companion = new onExtraCallback(null);
        onNavigationEvent = 8;
        int i = onTransact + 17;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        String str;
        boolean z;
        List list;
        Function1 function1;
        int i7;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = (~(i8 | i9 | (~i6))) | (~(i4 | i5 | i6));
        int i11 = (~(i9 | i6)) | (~(i9 | i4));
        int i12 = (~(i6 | i5)) | i4;
        int i13 = i4 + i5 + i + (1661237432 * i2) + (961048624 * i3);
        int i14 = i13 * i13;
        int i15 = ((119520104 * i4) - 281083904) + ((-1329838950) * i5) + (i10 * 724679527) + (724679527 * i11) + ((-724679527) * i12) + ((-605159424) * i) + ((-1559232512) * i2) + (1553989632 * i3) + (2020540416 * i14);
        int i16 = (i4 * (-2040814728)) + 92927091 + (i5 * (-2040813538)) + (i10 * (-595)) + (i11 * (-595)) + (i12 * 595) + (i * (-2040814133)) + (i2 * (-1614655000)) + (i3 * 500164112) + (i14 * 184877056);
        if (i15 + (i16 * i16 * 1800994816) != 1) {
            return onExtraCallback(objArr);
        }
        String str2 = (String) objArr[0];
        Map map = (Map) objArr[1];
        int i17 = 2 % 2;
        int i18 = IAuthTabCallbackStub + 103;
        asInterface = i18 % 128;
        if (i18 % 2 == 0) {
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            str = "tuba_trigger_bottomsheet_cancel";
            z = true;
            list = null;
            function1 = null;
            i7 = 9;
        } else {
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            str = "tuba_trigger_bottomsheet_cancel";
            z = false;
            list = null;
            function1 = null;
            i7 = 42;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, str, z, str2, list, map, function1, i7, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, Map map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            throw null;
        }
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{str, map}, 406084788, -406084787, iOnWarmupCompleted2);
        int i3 = asInterface + 107;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 69 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, getReadEnabled getreadenabled, Trigger trigger, TimeUnit timeUnit, Map map, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = asInterface + 19;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{Integer.valueOf(i), getreadenabled, trigger, timeUnit, map, str, str2}, 390486651, -390486651, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
        int i4 = IAuthTabCallbackStub + 123;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, getReadEnabled getreadenabled, Activity activity, Map map, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(str, getreadenabled, activity, map, str2, str3);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, getreadenabled, activity, map, str2, str3);
        int i3 = asInterface + 31;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(String str, Map map, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(str, map, dialogInterface);
        if (i3 != 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 29;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 45812), 84 - Color.red(0), 21232 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 14185), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 20, 8808 - (ViewConfiguration.getLongPressTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getReadEnabled(@NotNull OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3, @NotNull UtilsKtExternalSyntheticLambda9 utilsKtExternalSyntheticLambda9, @NotNull ALCFaceSDKExternalSyntheticLambda3 aLCFaceSDKExternalSyntheticLambda3) {
        super(okHttpNetworkFetcherExternalSyntheticLambda3, "BOTTOMSHEET_V2", 100L);
        Intrinsics.checkNotNullParameter(okHttpNetworkFetcherExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda9, "");
        Intrinsics.checkNotNullParameter(aLCFaceSDKExternalSyntheticLambda3, "");
        this.onExtraCallback = utilsKtExternalSyntheticLambda9;
        this.onWarmupCompleted = aLCFaceSDKExternalSyntheticLambda3;
    }

    private static final Unit onWarmupCompleted(String str, getReadEnabled getreadenabled, Activity activity, Map map, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str != null) {
            getreadenabled.onExtraCallback.start(activity, str);
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "tuba_trigger_bottomsheet_button1", true, str3, null, access8100.onWarmupCompleted(map, access8100.onNavigationEvent(getWrite.IAuthTabCallback("button_text", str2))), null, 40, null);
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 49;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        int iIntValue = ((Number) objArr[0]).intValue();
        getReadEnabled getreadenabled = (getReadEnabled) objArr[1];
        Trigger trigger = (Trigger) objArr[2];
        TimeUnit timeUnit = (TimeUnit) objArr[3];
        Map map = (Map) objArr[4];
        String str = (String) objArr[5];
        String str2 = (String) objArr[6];
        int i = 2 % 2;
        if (iIntValue > 0) {
            getreadenabled.onWarmupCompleted.onExtraCallback(trigger, iIntValue, timeUnit);
            int i2 = IAuthTabCallbackStub + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "tuba_trigger_bottomsheet_button2", true, str2, null, access8100.onWarmupCompleted(map, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("button_text", str), getWrite.IAuthTabCallback("trigger_group_id", (String) Trigger.onWarmupCompleted(new Object[]{trigger}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1524330962, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1524330962, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()))})), null, 40, null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 13;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(String str, Map map, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1014169L, false, str, map, null, 1, null);
        } else {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1014169L, true, str, map, null, 16, null);
        }
    }

    @Override // o.getWriteEnabled
    public void onWarmupCompleted(@NotNull final Activity activity, @NotNull final Trigger trigger, @NotNull final String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(trigger, "");
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mapAsInterface = trigger.asInterface();
        Object[] objArr = new Object[1];
        a(new char[]{16603, 52074, 25700, 30237, 16559, 55196, 23854, 9132, 12994}, (Process.myTid() >> 22) + 1, objArr);
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(mapAsInterface.get(((String) objArr[0]).intern()));
        if (strOnExtraCallbackWithResult != null) {
            int i2 = asInterface + 123;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = new Object[1];
            a(new char[]{43829, 42353, 19827, 42261, 43864, 47499, 29758, 61627, 55592, 10765, 59052}, 1 - TextUtils.getTrimmedLength(""), objArr2);
            String strOnExtraCallbackWithResult2 = onExtraCallbackWithResult(mapAsInterface.get(((String) objArr2[0]).intern()));
            Object[] objArr3 = new Object[1];
            a(new char[]{5441, 40435, 12747, 5656, 5416, 33025, 2196, 17314, 26456, 4797, 39427, 56877}, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
            String strOnExtraCallbackWithResult3 = onExtraCallbackWithResult(mapAsInterface.get(((String) objArr3[0]).intern()));
            Integer numOnNavigationEvent = onNavigationEvent(mapAsInterface.get("imagePlaceholderSize"));
            final String strOnExtraCallbackWithResult4 = onExtraCallbackWithResult(mapAsInterface.get("button1Text"));
            if (strOnExtraCallbackWithResult4 != null) {
                int i4 = asInterface + 75;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                final String strOnExtraCallbackWithResult5 = onExtraCallbackWithResult(mapAsInterface.get("button1Url"));
                final String strOnExtraCallbackWithResult6 = onExtraCallbackWithResult(mapAsInterface.get("hideButtonText"));
                if (strOnExtraCallbackWithResult6 != null) {
                    Integer numOnNavigationEvent2 = onNavigationEvent(mapAsInterface.get("hideInterval"));
                    int iIntValue = numOnNavigationEvent2 != null ? numOnNavigationEvent2.intValue() : 0;
                    final TimeUnit timeUnitOnWarmupCompleted = onWarmupCompleted(mapAsInterface.get("hideTimeUnit"));
                    if (timeUnitOnWarmupCompleted != null) {
                        final Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("trigger_id", trigger.onNavigationEvent()), getWrite.IAuthTabCallback("trigger_name", trigger.onWarmupCompleted())});
                        Function0 function0 = new Function0() { // from class: im.toss.components.tuba.trigger.internal.BottomSheetV2TriggerExecutor$$ExternalSyntheticLambda0
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() throws Throwable {
                                int i6 = 2 % 2;
                                int i7 = onWarmupCompleted + 113;
                                onExtraCallback = i7 % 128;
                                int i8 = i7 % 2;
                                Unit unitOnNavigationEvent = getReadEnabled.onNavigationEvent(strOnExtraCallbackWithResult5, this, activity, mapOnWarmupCompleted, strOnExtraCallbackWithResult4, str);
                                int i9 = onExtraCallback + 91;
                                onWarmupCompleted = i9 % 128;
                                if (i9 % 2 == 0) {
                                    int i10 = 77 / 0;
                                }
                                return unitOnNavigationEvent;
                            }
                        };
                        final int i6 = iIntValue;
                        AppCompatDialog onnavigationevent = new onNavigationEvent(activity, strOnExtraCallbackWithResult, strOnExtraCallbackWithResult2, strOnExtraCallbackWithResult3, numOnNavigationEvent, strOnExtraCallbackWithResult4, strOnExtraCallbackWithResult6, function0, new Function0() { // from class: im.toss.components.tuba.trigger.internal.BottomSheetV2TriggerExecutor$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke() {
                                int i7 = 2 % 2;
                                int i8 = IAuthTabCallback + 81;
                                onNavigationEvent = i8 % 128;
                                Object obj = null;
                                if (i8 % 2 == 0) {
                                    getReadEnabled.onExtraCallbackWithResult(i6, this, trigger, timeUnitOnWarmupCompleted, mapOnWarmupCompleted, strOnExtraCallbackWithResult6, str);
                                    throw null;
                                }
                                Unit unitOnExtraCallbackWithResult = getReadEnabled.onExtraCallbackWithResult(i6, this, trigger, timeUnitOnWarmupCompleted, mapOnWarmupCompleted, strOnExtraCallbackWithResult6, str);
                                int i9 = onNavigationEvent + 91;
                                IAuthTabCallback = i9 % 128;
                                if (i9 % 2 == 0) {
                                    return unitOnExtraCallbackWithResult;
                                }
                                obj.hashCode();
                                throw null;
                            }
                        }, new Function0() { // from class: im.toss.components.tuba.trigger.internal.BottomSheetV2TriggerExecutor$$ExternalSyntheticLambda2
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i7 = 2 % 2;
                                int i8 = onWarmupCompleted + 51;
                                onExtraCallback = i8 % 128;
                                int i9 = i8 % 2;
                                Unit unitIAuthTabCallback = getReadEnabled.IAuthTabCallback(str, mapOnWarmupCompleted);
                                int i10 = onWarmupCompleted + 21;
                                onExtraCallback = i10 % 128;
                                if (i10 % 2 == 0) {
                                    return unitIAuthTabCallback;
                                }
                                throw null;
                            }
                        });
                        onnavigationevent.setOnShowListener(new DialogInterface.OnShowListener() { // from class: im.toss.components.tuba.trigger.internal.BottomSheetV2TriggerExecutor$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) throws Throwable {
                                int i7 = 2 % 2;
                                int i8 = onExtraCallback + 123;
                                onNavigationEvent = i8 % 128;
                                if (i8 % 2 != 0) {
                                    getReadEnabled.onNavigationEvent(str, mapOnWarmupCompleted, dialogInterface);
                                    int i9 = 44 / 0;
                                } else {
                                    getReadEnabled.onNavigationEvent(str, mapOnWarmupCompleted, dialogInterface);
                                }
                                int i10 = onExtraCallback + 121;
                                onNavigationEvent = i10 % 128;
                                int i11 = i10 % 2;
                            }
                        });
                        onnavigationevent.setCancelable(false);
                        onnavigationevent.show();
                        return;
                    }
                }
            }
        }
        int i7 = asInterface + 93;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final class onNavigationEvent extends AppCompatDialog {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallback_Parcel = 1;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackStub;
        private final Function0<Unit> asBinder;
        private final Function0<Unit> asInterface;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final Integer onNavigationEvent;
        private final Function0<Unit> onTransact;
        private final String onWarmupCompleted;

        public static /* synthetic */ Unit IAuthTabCallback(onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback_Parcel + 17;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = IAuthTabCallback_Parcel + 97;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 51 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        public static /* synthetic */ Unit onExtraCallback(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 47;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(onnavigationevent);
            int i4 = IAuthTabCallbackDefault + 1;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }

        public static /* synthetic */ Unit onWarmupCompleted(onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 35;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallback(onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, i);
            }
            onExtraCallback(onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull Context context, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @NotNull String str4, @NotNull String str5, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
            super(context, R.style.TubaTrigger_FullScreenDialog);
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            this.IAuthTabCallbackStub = str;
            this.onWarmupCompleted = str2;
            this.IAuthTabCallback = str3;
            this.onNavigationEvent = num;
            this.onExtraCallbackWithResult = str4;
            this.onExtraCallback = str5;
            this.onTransact = function0;
            this.asInterface = function02;
            this.asBinder = function03;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r10
          0x002f: PHI (r10v2 android.view.Window) = (r10v1 android.view.Window), (r10v8 android.view.Window) binds: [B:8:0x002d, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onCreate(@Nullable Bundle bundle) {
            Window window;
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 15;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                super.onCreate(bundle);
                onWarmupCompleted();
                setCancelable(true);
                window = getWindow();
                if (window != null) {
                    RepeatableSpec.onExtraCallbackWithResult(window, false);
                    window.setDimAmount(0.0f);
                    int i3 = IAuthTabCallbackDefault + 49;
                    IAuthTabCallback_Parcel = i3 % 128;
                    int i4 = i3 % 2;
                }
            } else {
                super.onCreate(bundle);
                onWarmupCompleted();
                setCancelable(false);
                window = getWindow();
                if (window != null) {
                }
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
            composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-1036886015, true, new BottomSheetV2TriggerExecutor$TubaTriggerDialog$.ExternalSyntheticLambda0(this))));
            setContentView(composeView);
        }

        private static final Unit onWarmupCompleted(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 59;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            onnavigationevent.dismiss();
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback_Parcel + 117;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit onExtraCallback(onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 99;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
                int i5 = IAuthTabCallback_Parcel + 97;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-252826711, i, -1, "im.toss.components.tuba.trigger.internal.BottomSheetV2TriggerExecutor.TubaTriggerDialog.onCreate.<anonymous>.<anonymous>.<anonymous> (BottomSheetV2TriggerExecutor.kt:186)");
                }
                String str = onnavigationevent.IAuthTabCallbackStub;
                String str2 = onnavigationevent.onWarmupCompleted;
                String str3 = onnavigationevent.IAuthTabCallback;
                Integer num = onnavigationevent.onNavigationEvent;
                String str4 = onnavigationevent.onExtraCallbackWithResult;
                String str5 = onnavigationevent.onExtraCallback;
                Function0<Unit> function0 = onnavigationevent.onTransact;
                Function0<Unit> function02 = onnavigationevent.asInterface;
                Function0<Unit> function03 = onnavigationevent.asBinder;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onnavigationevent);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        BottomSheetV2TriggerExecutor$TubaTriggerDialog$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new BottomSheetV2TriggerExecutor$TubaTriggerDialog$.ExternalSyntheticLambda2(onnavigationevent);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                        obj = externalSyntheticLambda2;
                    }
                    OkHttpNetworkFetcherExternalSyntheticLambda6.onExtraCallbackWithResult(str, str2, str3, num, str4, str5, function0, function02, function03, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                int i7 = IAuthTabCallback_Parcel + 99;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
            }
            return Unit.INSTANCE;
        }

        private static final Unit onExtraCallbackWithResult(onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback_Parcel + 97;
            int i4 = i3 % 128;
            IAuthTabCallbackDefault = i4;
            int i5 = i3 % 2;
            if ((i & 3) != 2) {
                int i6 = i4 + 95;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1036886015, i, -1, "im.toss.components.tuba.trigger.internal.BottomSheetV2TriggerExecutor.TubaTriggerDialog.onCreate.<anonymous>.<anonymous> (BottomSheetV2TriggerExecutor.kt:185)");
                    int i8 = IAuthTabCallback_Parcel + 47;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-252826711, true, new BottomSheetV2TriggerExecutor$TubaTriggerDialog$.ExternalSyntheticLambda1(onnavigationevent), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = IAuthTabCallback_Parcel + 73;
                    IAuthTabCallbackDefault = i10 % 128;
                    if (i10 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i11 = 27 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a5 A[PHI: r2
          0x00a5: PHI (r2v9 o.NavigationBarKtExternalSyntheticLambda8) = (r2v8 o.NavigationBarKtExternalSyntheticLambda8), (r2v10 o.NavigationBarKtExternalSyntheticLambda8) binds: [B:38:0x00a3, B:35:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
          0x0022: PHI (r1v5 android.view.View) = (r1v4 android.view.View), (r1v9 android.view.View) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void onWarmupCompleted() {
            View viewFindViewById;
            Window window;
            View decorView;
            NavigationBarKtExternalSyntheticLambda8 navigationBarKtExternalSyntheticLambda8OnNavigationEvent;
            View decorView2;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 89;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                viewFindViewById = findViewById(android.R.id.content);
                int i3 = 79 / 0;
                if (viewFindViewById != null) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
                    Object obj = null;
                    if (activityIAuthTabCallback != null) {
                        int i4 = IAuthTabCallbackDefault + 17;
                        IAuthTabCallback_Parcel = i4 % 128;
                        if (i4 % 2 == 0) {
                            activityIAuthTabCallback.getWindow();
                            obj.hashCode();
                            throw null;
                        }
                        Window window2 = activityIAuthTabCallback.getWindow();
                        if (window2 != null && (decorView2 = window2.getDecorView()) != null) {
                            int i5 = IAuthTabCallbackDefault + 87;
                            IAuthTabCallback_Parcel = i5 % 128;
                            if (i5 % 2 == 0) {
                                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(decorView2);
                                throw null;
                            }
                            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(decorView2);
                            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                                int i6 = IAuthTabCallbackDefault + 15;
                                IAuthTabCallback_Parcel = i6 % 128;
                                int i7 = i6 % 2;
                                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.IAuthTabCallback(viewFindViewById, textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                            }
                        }
                    }
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    Activity activityIAuthTabCallback2 = hasVaryAll.IAuthTabCallback(context2);
                    if (activityIAuthTabCallback2 != null && (window = activityIAuthTabCallback2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        int i8 = IAuthTabCallbackDefault + 17;
                        IAuthTabCallback_Parcel = i8 % 128;
                        if (i8 % 2 == 0) {
                            navigationBarKtExternalSyntheticLambda8OnNavigationEvent = NavigationDrawerKtExternalSyntheticLambda1.onNavigationEvent(decorView);
                            int i9 = 17 / 0;
                            if (navigationBarKtExternalSyntheticLambda8OnNavigationEvent != null) {
                                int i10 = IAuthTabCallback_Parcel + 123;
                                IAuthTabCallbackDefault = i10 % 128;
                                int i11 = i10 % 2;
                                NavigationDrawerKtExternalSyntheticLambda1.onExtraCallbackWithResult(viewFindViewById, navigationBarKtExternalSyntheticLambda8OnNavigationEvent);
                                if (i11 != 0) {
                                    throw null;
                                }
                            }
                        } else {
                            navigationBarKtExternalSyntheticLambda8OnNavigationEvent = NavigationDrawerKtExternalSyntheticLambda1.onNavigationEvent(decorView);
                            if (navigationBarKtExternalSyntheticLambda8OnNavigationEvent != null) {
                            }
                        }
                    }
                }
            } else {
                viewFindViewById = findViewById(android.R.id.content);
                if (viewFindViewById != null) {
                }
            }
            int i12 = IAuthTabCallback_Parcel + 83;
            IAuthTabCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private final String onExtraCallbackWithResult(Object obj) {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (obj instanceof String) {
            str = (String) obj;
            int i5 = i3 + 17;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str = null;
        }
        if (str != null) {
            int i7 = IAuthTabCallbackStub + 123;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            if (str.length() > 0) {
                return str;
            }
        }
        return null;
    }

    private final Integer onNavigationEvent(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 39;
        asInterface = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof Number;
            obj2.hashCode();
            throw null;
        }
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number == null) {
            return null;
        }
        int i4 = i2 + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        int iIntValue = number.intValue();
        if (i5 != 0) {
            return Integer.valueOf(iIntValue);
        }
        Integer.valueOf(iIntValue);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, "HOURS") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return java.util.concurrent.TimeUnit.HOURS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, "DAYS") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        return java.util.concurrent.TimeUnit.DAYS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r4 = o.getReadEnabled.asInterface + 23;
        o.getReadEnabled.IAuthTabCallbackStub = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return java.util.concurrent.TimeUnit.MINUTES;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, "MINUTES") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r4, "MINUTES")) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final TimeUnit onWarmupCompleted(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private static final Unit onExtraCallback(int i, getReadEnabled getreadenabled, Trigger trigger, TimeUnit timeUnit, Map map, String str, String str2) {
        return (Unit) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{Integer.valueOf(i), getreadenabled, trigger, timeUnit, map, str, str2}, 390486651, -390486651, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(String str, Map map) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{str, map}, 406084788, -406084787, iOnWarmupCompleted);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -1129150362995562605L;
    }
}
