package o;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.core.tracker.entry.TrackState;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.writeBinary;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CommonModule_setLeftEdgeTouchEnabled {
    public static final onExtraCallbackWithResult Companion;
    private static int extraCallback;
    private static char onActivityResized;
    private static int onPostMessage;
    private static long readTypedObject;
    private final writeBinary<onNavigationEvent> IAuthTabCallback;
    private CharSequence IAuthTabCallbackDefault;
    private onExtraCallback IAuthTabCallbackStub;
    private Function1<? super DialogInterface, Unit> IAuthTabCallbackStubProxy;
    private Long IAuthTabCallback_Parcel;
    private CharSequence ICustomTabsCallback;
    private onExtraCallback access000;
    private final initMiniApp access100;
    private Integer asBinder;
    private DialogInterface.OnCancelListener asInterface;
    private Integer extraCallbackWithResult;
    private DialogInterface.OnDismissListener getInterfaceDescriptor;
    private boolean onExtraCallback;
    private final TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onExtraCallbackWithResult;
    private final Context onNavigationEvent;
    private Function1<? super DialogInterface, Unit> onTransact;
    private boolean onWarmupCompleted;
    private final Map<String, Object> writeTypedObject;
    private static final byte[] $$a = {84, 79, 22, 41};
    private static final int $$b = 54;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onMessageChannelReady = 0;
    private static int onActivityLayout = 0;
    private static int onMinimized = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 109;
        int i4 = 3 - (s * 4);
        int i5 = b * 3;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i4;
            int i8 = i7;
            i3 = i4 + i6;
            i4 = i8;
            bArr2[i2] = (byte) i3;
            int i9 = i4 + 1;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i9];
            i2++;
            int i10 = i3;
            i7 = i9;
            i4 = i10;
            int i82 = i7;
            i3 = i4 + i6;
            i4 = i82;
            bArr2[i2] = (byte) i3;
            int i92 = i4 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i922 = i4 + 1;
            if (i2 == i5) {
            }
        }
    }

    static {
        onPostMessage = 1;
        onTransact();
        Companion = new onExtraCallbackWithResult(null);
        int i = onMessageChannelReady + 89;
        onPostMessage = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 7;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel(dialogInterface);
        }
        IAuthTabCallback_Parcel(dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 103;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(dialogInterface);
        int i4 = onActivityLayout + 81;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ void IAuthTabCallback(onExtraCallback onextracallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 37;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(onextracallback, commonModule_setLeftEdgeTouchEnabled, dialogInterface, i);
        int i5 = onMinimized + 11;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
    }

    public static /* synthetic */ Unit asBinder(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 39;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(dialogInterface);
        int i3 = onActivityLayout + 89;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i3)) | i5;
        int i9 = (~(i7 | (~i3))) | (~((~i5) | i7)) | (~(i5 | i2 | i3));
        int i10 = ~(i3 | i5);
        int i11 = i5 + i2 + i + ((-813770285) * i6) + (135932771 * i4);
        int i12 = i11 * i11;
        int i13 = (526900465 * i5) + 74317824 + ((-1745228167) * i2) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i) + (1331953664 * i6) + ((-366739456) * i4) + ((-1308753920) * i12);
        int i14 = (i5 * 1149714451) + 247108311 + (i2 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i * 1149713731) + (i6 * 1918847289) + (i4 * (-2006650391)) + (i12 * 460980224);
        switch (i13 + (i14 * i14 * (-1418592256))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
                Function1 function1 = (Function1) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                Object obj = objArr[3];
                int i15 = 2 % 2;
                int i16 = onMinimized + 109;
                onActivityLayout = i16 % 128;
                if (i16 % 2 == 0 && (1 & iIntValue) != 0) {
                    function1 = new Function1() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda7
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i17 = 2 % 2;
                            int i18 = IAuthTabCallback + 91;
                            onExtraCallback = i18 % 128;
                            DialogInterface dialogInterface = (DialogInterface) obj2;
                            if (i18 % 2 == 0) {
                                return CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(dialogInterface);
                            }
                            CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(dialogInterface);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                }
                int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                onExtraCallback onextracallback = (onExtraCallback) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 900372088, new Object[]{commonModule_setLeftEdgeTouchEnabled, function1}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -900372086, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                int i17 = onMinimized + 101;
                onActivityLayout = i17 % 128;
                int i18 = i17 % 2;
                return onextracallback;
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return asInterface(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 47;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return getInterfaceDescriptor(dialogInterface);
        }
        getInterfaceDescriptor(dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(commonModule_setLeftEdgeTouchEnabled, dialogInterface);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 101;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1825813637, new Object[]{commonModule_setLeftEdgeTouchEnabled, dialogInterface, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1825813643, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i5 = onActivityLayout + 25;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + Imgproc.COLOR_YUV2RGBA_YVYU;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(dialogInterface);
        int i4 = onActivityLayout + 17;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 1;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled, dialogInterface);
        int i4 = onActivityLayout + 119;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 97;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return access000(dialogInterface);
        }
        access000(dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 99;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(dialogInterface);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ void onWarmupCompleted(onExtraCallback onextracallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 79;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(onextracallback, commonModule_setLeftEdgeTouchEnabled, dialogInterface, i);
        if (i4 == 0) {
            throw null;
        }
    }

    public CommonModule_setLeftEdgeTouchEnabled(@NotNull Context context, @Nullable initMiniApp initminiapp, @Nullable writeBinary<onNavigationEvent> writebinary) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = context;
        this.access100 = initminiapp;
        this.IAuthTabCallback = writebinary;
        this.onExtraCallbackWithResult = TdsDialogV1.Companion.onExtraCallback(context);
        this.writeTypedObject = new LinkedHashMap();
        this.onWarmupCompleted = true;
        this.onExtraCallback = true;
    }

    public static final /* synthetic */ Triple IAuthTabCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 83;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Triple<TdsDialogV1, Long, Map<String, Object>> tripleIAuthTabCallbackDefault = commonModule_setLeftEdgeTouchEnabled.IAuthTabCallbackDefault();
        int i4 = onMinimized + 47;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return tripleIAuthTabCallbackDefault;
        }
        throw null;
    }

    public final Context onWarmupCompleted() {
        Context context;
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 21;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            context = this.onNavigationEvent;
            int i4 = 74 / 0;
        } else {
            context = this.onNavigationEvent;
        }
        int i5 = i2 + 119;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent OPEN_ERROR = new onNavigationEvent("OPEN_ERROR", 0);
        public static final onNavigationEvent POSITIVE_BUTTON_CLICK = new onNavigationEvent("POSITIVE_BUTTON_CLICK", 1);
        public static final onNavigationEvent NEGATIVE_BUTTON_CLICK = new onNavigationEvent("NEGATIVE_BUTTON_CLICK", 2);
        public static final onNavigationEvent CANCEL = new onNavigationEvent("CANCEL", 3);
        public static final onNavigationEvent DISMISS = new onNavigationEvent("DISMISS", 4);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 23;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {OPEN_ERROR, POSITIVE_BUTTON_CLICK, NEGATIVE_BUTTON_CLICK, CANCEL, DISMISS};
            int i5 = i2 + 93;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 41;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 45;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onNavigationEvent + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onNavigationEvent + 23;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallback + 75;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class onExtraCallback {
        private static int asBinder = 1;
        private static int asInterface;
        private final String IAuthTabCallback;
        private final Function1<DialogInterface, Unit> onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private final TdsButtonV1View.asInterface onNavigationEvent;
        private final Integer onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        private onExtraCallback(String str, Integer num, TdsButtonV1View.asInterface asinterface, Function1<? super DialogInterface, Unit> function1, boolean z) {
            this.IAuthTabCallback = str;
            this.onWarmupCompleted = num;
            this.onNavigationEvent = asinterface;
            this.onExtraCallback = function1;
            this.onExtraCallbackWithResult = z;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.IAuthTabCallback;
            int i4 = i3 + 69;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final Integer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 77;
            asBinder = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Integer num = this.onWarmupCompleted;
            int i4 = i2 + 43;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return num;
            }
            throw null;
        }

        public final TdsButtonV1View.asInterface IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 1;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            TdsButtonV1View.asInterface asinterface = this.onNavigationEvent;
            int i5 = i2 + 7;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return asinterface;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Function1<DialogInterface, Unit> onNavigationEvent() {
            Function1<DialogInterface, Unit> function1;
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 23;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                function1 = this.onExtraCallback;
                int i4 = 21 / 0;
            } else {
                function1 = this.onExtraCallback;
            }
            int i5 = i2 + 75;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            throw null;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 33;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onExtraCallbackWithResult;
            int i5 = i2 + 43;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(String str, TdsButtonV1View.asInterface asinterface, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = asBinder + 115;
                asInterface = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                asinterface = null;
            }
            if ((i & 4) != 0) {
                int i3 = asBinder + 123;
                int i4 = i3 % 128;
                asInterface = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 91;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
                z = false;
            }
            this(str, asinterface, z, (Function1<? super DialogInterface, Unit>) function1);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull String str, @Nullable TdsButtonV1View.asInterface asinterface, boolean z, @Nullable Function1<? super DialogInterface, Unit> function1) {
            this(str, null, asinterface, function1, z);
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(int i, TdsButtonV1View.asInterface asinterface, boolean z, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 2) != 0) {
                int i3 = asInterface + 77;
                int i4 = i3 % 128;
                asBinder = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 1;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
                asinterface = null;
            }
            if ((i2 & 4) != 0) {
                int i8 = asBinder;
                int i9 = i8 + 59;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i8 + 69;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
                z = false;
            }
            this(i, asinterface, z, (Function1<? super DialogInterface, Unit>) function1);
        }

        public onExtraCallback(int i, @Nullable TdsButtonV1View.asInterface asinterface, boolean z, @Nullable Function1<? super DialogInterface, Unit> function1) {
            this(null, Integer.valueOf(i), asinterface, function1, z);
        }
    }

    public final void onWarmupCompleted(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = onMinimized + 123;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback_Parcel = l;
        int i5 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Map<String, Object> onExtraCallback() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 49;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            map = this.writeTypedObject;
            int i4 = 3 / 0;
        } else {
            map = this.writeTypedObject;
        }
        int i5 = i2 + 53;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 115;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        CharSequence charSequence = commonModule_setLeftEdgeTouchEnabled.ICustomTabsCallback;
        int i5 = i3 + 27;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return charSequence;
    }

    public final void onExtraCallback(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 29;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallback = charSequence;
        int i5 = i2 + 119;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onMinimized + 59;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallbackWithResult = num;
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
    }

    public final void IAuthTabCallback(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 111;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = charSequence;
        int i5 = i2 + 123;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CharSequence onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onMinimized + 15;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = num;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        onExtraCallback onextracallback = (onExtraCallback) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 73;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        commonModule_setLeftEdgeTouchEnabled.access000 = onextracallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 119;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        onExtraCallback onextracallback = (onExtraCallback) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 75;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallbackStub = onextracallback;
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted = zBooleanValue;
        int i5 = i3 + 103;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final void asBinder(@Nullable Function1<? super DialogInterface, Unit> function1) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 61;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStubProxy = function1;
        int i5 = i3 + 3;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Function1<DialogInterface, Unit> onExtraCallbackWithResult() {
        Function1 function1;
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 51;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
            function1 = this.IAuthTabCallbackStubProxy;
        } else {
            function1 = this.IAuthTabCallbackStubProxy;
        }
        int i5 = i2 + 59;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return function1;
    }

    public final void onNavigationEvent(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 113;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.getInterfaceDescriptor = onDismissListener;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable Function1<? super DialogInterface, Unit> function1) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        this.onTransact = function1;
        int i5 = i3 + 103;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onNavigationEvent(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 125;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        this.asInterface = onCancelListener;
        if (i4 == 0) {
            int i5 = 42 / 0;
        }
        int i6 = i2 + 97;
        onMinimized = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onNavigationEvent(onExtraCallback onextracallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        Function1<DialogInterface, Unit> function1OnNavigationEvent = onextracallback.onNavigationEvent();
        if (function1OnNavigationEvent != null) {
            Intrinsics.checkNotNull(dialogInterface);
            function1OnNavigationEvent.invoke(dialogInterface);
            int i3 = onMinimized + 13;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
        }
        writeBinary<onNavigationEvent> writebinary = commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback;
        if (writebinary != null) {
            int i5 = onActivityLayout + 31;
            onMinimized = i5 % 128;
            if (i5 % 2 != 0) {
                writebinary.IAuthTabCallback(onNavigationEvent.NEGATIVE_BUTTON_CLICK);
                return;
            }
            writebinary.IAuthTabCallback(onNavigationEvent.NEGATIVE_BUTTON_CLICK);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $10 + 87;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 19;
            $11 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), 43 - View.MeasureSpec.makeMeasureSpec(0, 0), 1451 - View.MeasureSpec.getSize(0), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.alpha(0)), 44 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), 1494 - ExpandableListView.getPackedPositionType(0L), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 23972), 50 - (ViewConfiguration.getJumpTapTimeout() >> 16), 22939 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 30, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (extraCallback ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (readTypedObject ^ 7798559133331975163L))) ^ ((char) (onActivityResized ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final void onExtraCallback(onExtraCallback onextracallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 49;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            onextracallback.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function1<DialogInterface, Unit> function1OnNavigationEvent = onextracallback.onNavigationEvent();
        if (function1OnNavigationEvent != null) {
            Intrinsics.checkNotNull(dialogInterface);
            function1OnNavigationEvent.invoke(dialogInterface);
        }
        writeBinary<onNavigationEvent> writebinary = commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback;
        if (writebinary != null) {
            int i4 = onActivityLayout + 71;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            writebinary.IAuthTabCallback(onNavigationEvent.POSITIVE_BUTTON_CLICK);
            int i6 = onActivityLayout + 109;
            onMinimized = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onActivityLayout + 47;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            writeBinary<onNavigationEvent> writebinary = commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback;
            if (writebinary != null) {
                writebinary.IAuthTabCallback(onNavigationEvent.POSITIVE_BUTTON_CLICK);
            }
            dialogInterface.dismiss();
            int i3 = onActivityLayout + 83;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        writeBinary<onNavigationEvent> writebinary2 = commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Function1<? super DialogInterface, Unit> function1 = commonModule_setLeftEdgeTouchEnabled.IAuthTabCallbackStubProxy;
        if (function1 != null) {
            function1.invoke(dialogInterface);
        }
        DialogInterface.OnDismissListener onDismissListener = commonModule_setLeftEdgeTouchEnabled.getInterfaceDescriptor;
        Object obj = null;
        if (onDismissListener != null) {
            int i2 = onMinimized + 53;
            onActivityLayout = i2 % 128;
            if (i2 % 2 != 0) {
                onDismissListener.onDismiss(dialogInterface);
                obj.hashCode();
                throw null;
            }
            onDismissListener.onDismiss(dialogInterface);
        }
        writeBinary<onNavigationEvent> writebinary = commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback;
        if (writebinary != null) {
            int i3 = onMinimized + 71;
            onActivityLayout = i3 % 128;
            if (i3 % 2 != 0) {
                writebinary.IAuthTabCallback(onNavigationEvent.DISMISS);
                throw null;
            }
            writebinary.IAuthTabCallback(onNavigationEvent.DISMISS);
            int i4 = onMinimized + 23;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
        }
        writeBinary<onNavigationEvent> writebinary2 = commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback;
        if (writebinary2 != null) {
            writebinary2.onNavigationEvent();
        }
    }

    private static final void onWarmupCompleted(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Function1<? super DialogInterface, Unit> function1 = commonModule_setLeftEdgeTouchEnabled.onTransact;
        if (function1 != null) {
            function1.invoke(dialogInterface);
        }
        DialogInterface.OnCancelListener onCancelListener = commonModule_setLeftEdgeTouchEnabled.asInterface;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
            int i2 = onMinimized + 63;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
        }
        writeBinary<onNavigationEvent> writebinary = commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback;
        if (writebinary != null) {
            int i4 = onActivityLayout + 27;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            writebinary.IAuthTabCallback(onNavigationEvent.CANCEL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b7 A[PHI: r4
      0x01b7: PHI (r4v19 java.lang.Integer) = (r4v18 java.lang.Integer), (r4v23 java.lang.Integer) binds: [B:35:0x01b5, B:32:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Triple<TdsDialogV1, Long, Map<String, Object>> IAuthTabCallbackDefault() throws Throwable {
        int i;
        String screenName;
        int iIntValue;
        String strOnExtraCallback;
        Integer numOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult;
        onwarmupcompleted.onNavigationEvent(this.onWarmupCompleted);
        Long l = this.IAuthTabCallback_Parcel;
        if (l != null) {
            int i3 = onMinimized + 55;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            this.writeTypedObject.put("screen_schema_id", l);
        } else {
            initMiniApp initminiapp = this.access100;
            if (initminiapp != null) {
                onwarmupcompleted.onNavigationEvent(initminiapp);
                this.writeTypedObject.put("screen_schema_id", Long.valueOf(this.access100.access200()));
            }
        }
        CharSequence charSequence = this.ICustomTabsCallback;
        if (charSequence != null) {
            int i5 = onActivityLayout + 65;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
            onwarmupcompleted.onNavigationEvent(charSequence);
            Map<String, Object> map = this.writeTypedObject;
            Object[] objArr = new Object[1];
            a((char) (18792 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 713940263, new char[]{50865, 63984, 19148, 8888, 48630}, new char[]{0, 0, 0, 0}, new char[]{55559, 29218, 26581, 12873}, objArr);
            map.put(((String) objArr[0]).intern(), charSequence);
        }
        Integer num = this.extraCallbackWithResult;
        if (num != null) {
            int iIntValue2 = num.intValue();
            onwarmupcompleted.onNavigationEvent(iIntValue2);
            Map<String, Object> map2 = this.writeTypedObject;
            Object[] objArr2 = new Object[1];
            a((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 18791), ImageFormat.getBitsPerPixel(0) - 713940262, new char[]{50865, 63984, 19148, 8888, 48630}, new char[]{0, 0, 0, 0}, new char[]{55559, 29218, 26581, 12873}, objArr2);
            map2.put(((String) objArr2[0]).intern(), this.onNavigationEvent.getString(iIntValue2));
        }
        CharSequence charSequence2 = this.IAuthTabCallbackDefault;
        if (charSequence2 != null) {
            onwarmupcompleted.onExtraCallbackWithResult(charSequence2);
            Map<String, Object> map3 = this.writeTypedObject;
            Object[] objArr3 = new Object[1];
            a((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 211147754, new char[]{16888, 20339, 4390, 20663, 8596, 31440, 21941}, new char[]{0, 0, 0, 0}, new char[]{5816, 27172, 37875, 28735}, objArr3);
            map3.put(((String) objArr3[0]).intern(), charSequence2);
            int i7 = onMinimized + 59;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
        }
        Integer num2 = this.asBinder;
        if (num2 != null) {
            int iIntValue3 = num2.intValue();
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -868633265, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 868633269, new Object[]{onwarmupcompleted, Integer.valueOf(iIntValue3)}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
            Map<String, Object> map4 = this.writeTypedObject;
            Object[] objArr4 = new Object[1];
            a((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) - 211147754, new char[]{16888, 20339, 4390, 20663, 8596, 31440, 21941}, new char[]{0, 0, 0, 0}, new char[]{5816, 27172, 37875, 28735}, objArr4);
            map4.put(((String) objArr4[0]).intern(), this.onNavigationEvent.getString(iIntValue3));
        }
        final onExtraCallback onextracallback = this.IAuthTabCallbackStub;
        if (onextracallback != null) {
            int i9 = onMinimized + 103;
            onActivityLayout = i9 % 128;
            if (i9 % 2 != 0) {
                strOnExtraCallback = onextracallback.onExtraCallback();
                int i10 = 58 / 0;
                if (strOnExtraCallback == null) {
                    int i11 = onActivityLayout + 125;
                    onMinimized = i11 % 128;
                    if (i11 % 2 == 0) {
                        numOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
                        int i12 = 54 / 0;
                        strOnExtraCallback = numOnExtraCallbackWithResult != null ? this.onNavigationEvent.getString(numOnExtraCallbackWithResult.intValue()) : null;
                    } else {
                        numOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
                        if (numOnExtraCallbackWithResult != null) {
                        }
                    }
                }
                if (strOnExtraCallback == null) {
                    int i13 = onMinimized + 113;
                    onActivityLayout = i13 % 128;
                    if (i13 % 2 != 0) {
                        onextracallback.onNavigationEvent();
                        interfaceDescriptor.hashCode();
                        throw null;
                    }
                    if (onextracallback.onNavigationEvent() != null) {
                        int i14 = onActivityLayout + 31;
                        onMinimized = i14 % 128;
                        if (i14 % 2 == 0) {
                            strOnExtraCallback = this.onNavigationEvent.getString(R.string.cancel);
                            int i15 = 83 / 0;
                        } else {
                            strOnExtraCallback = this.onNavigationEvent.getString(R.string.cancel);
                        }
                    }
                }
                if (strOnExtraCallback == null) {
                    onwarmupcompleted.onNavigationEvent(strOnExtraCallback, new DialogInterface.OnClickListener() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i16) {
                            int i17 = 2 % 2;
                            int i18 = onExtraCallbackWithResult + 51;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                            CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(onextracallback, this, dialogInterface, i16);
                            int i20 = onExtraCallbackWithResult + 101;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                        }
                    }, onextracallback.IAuthTabCallback(), onextracallback.onWarmupCompleted());
                    this.writeTypedObject.put("negativeBtn", strOnExtraCallback);
                    i = 1;
                } else {
                    i = 0;
                }
            } else {
                strOnExtraCallback = onextracallback.onExtraCallback();
                if (strOnExtraCallback == null) {
                }
                if (strOnExtraCallback == null) {
                }
                if (strOnExtraCallback == null) {
                }
            }
        }
        final onExtraCallback onextracallback2 = this.access000;
        if (onextracallback2 != null) {
            String strOnExtraCallback2 = onextracallback2.onExtraCallback();
            if (strOnExtraCallback2 == null) {
                Integer numOnExtraCallbackWithResult2 = onextracallback2.onExtraCallbackWithResult();
                strOnExtraCallback2 = numOnExtraCallbackWithResult2 != null ? this.onNavigationEvent.getString(numOnExtraCallbackWithResult2.intValue()) : null;
            }
            if (strOnExtraCallback2 == null) {
                int i16 = onMinimized + 81;
                onActivityLayout = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 44 / 0;
                    if (onextracallback2.onNavigationEvent() != null) {
                        strOnExtraCallback2 = this.onNavigationEvent.getString(R.string.ok);
                    }
                } else if (onextracallback2.onNavigationEvent() != null) {
                }
            }
            if (strOnExtraCallback2 != null) {
                onwarmupcompleted.onWarmupCompleted(strOnExtraCallback2, new DialogInterface.OnClickListener() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i18) {
                        int i19 = 2 % 2;
                        int i20 = onWarmupCompleted + 27;
                        onExtraCallbackWithResult = i20 % 128;
                        int i21 = i20 % 2;
                        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback onextracallback3 = onextracallback2;
                        if (i21 != 0) {
                            CommonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(onextracallback3, this, dialogInterface, i18);
                        } else {
                            CommonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(onextracallback3, this, dialogInterface, i18);
                            throw null;
                        }
                    }
                }, onextracallback2.IAuthTabCallback(), onextracallback2.onWarmupCompleted());
                i++;
                this.writeTypedObject.put("positiveBtn", strOnExtraCallback2);
            }
        }
        if (i == 0 && this.onExtraCallback) {
            Integer numOnExtraCallbackWithResult3 = ((onExtraCallback) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{this, null, 1, null}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).onExtraCallbackWithResult();
            if (numOnExtraCallbackWithResult3 != null) {
                int i18 = onMinimized + 21;
                onActivityLayout = i18 % 128;
                int i19 = i18 % 2;
                iIntValue = numOnExtraCallbackWithResult3.intValue();
            } else {
                iIntValue = R.string.ok;
            }
            int i20 = iIntValue;
            this.writeTypedObject.put("positiveBtn", this.onNavigationEvent.getString(i20));
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(onwarmupcompleted, i20, new DialogInterface.OnClickListener() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i21) {
                    int i22 = 2 % 2;
                    int i23 = onExtraCallback + 15;
                    onWarmupCompleted = i23 % 128;
                    int i24 = i23 % 2;
                    CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(this.f$0, dialogInterface, i21);
                    int i25 = onWarmupCompleted + 83;
                    onExtraCallback = i25 % 128;
                    int i26 = i25 % 2;
                }
            }, (TdsButtonV1View.asInterface) null, false, 4, (Object) null);
        }
        onwarmupcompleted.IAuthTabCallback(new DialogInterface.OnDismissListener() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                int i21 = 2 % 2;
                int i22 = onNavigationEvent + 71;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(this.f$0, dialogInterface);
                if (i23 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        onwarmupcompleted.IAuthTabCallback(new DialogInterface.OnCancelListener() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                int i21 = 2 % 2;
                int i22 = onNavigationEvent + 83;
                IAuthTabCallback = i22 % 128;
                int i23 = i22 % 2;
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(this.f$0, dialogInterface);
                if (i23 == 0) {
                    int i24 = 80 / 0;
                }
            }
        });
        Object obj = this.onNavigationEvent;
        L_ l_ = obj instanceof L_ ? (L_) obj : null;
        if (l_ != null) {
            screenName = l_.getScreenName();
        } else {
            int i21 = onMinimized + 49;
            onActivityLayout = i21 % 128;
            int i22 = i21 % 2;
            screenName = null;
        }
        if (screenName == null || screenName.length() == 0) {
            TrackState trackStateOnExtraCallbackWithResult = TrackState.Companion.onExtraCallbackWithResult();
            interfaceDescriptor = trackStateOnExtraCallbackWithResult != null ? trackStateOnExtraCallbackWithResult.getInterfaceDescriptor() : null;
            if (!(interfaceDescriptor == null || interfaceDescriptor.length() == 0)) {
                this.writeTypedObject.put("parent_screen", interfaceDescriptor);
            }
        } else {
            this.writeTypedObject.put("parent_screen", screenName);
        }
        return new Triple<>(this.onExtraCallbackWithResult.onExtraCallback(), this.IAuthTabCallback_Parcel, this.writeTypedObject);
    }

    private static final Unit IAuthTabCallback_Parcel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 15;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ onExtraCallback onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + Imgproc.COLOR_YUV2RGB_YVYU;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 113;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                    Unit unit = (Unit) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1376691373, new Object[]{(DialogInterface) obj2}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1376691372, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                    int i8 = onNavigationEvent + 27;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        return unit;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
            int i5 = onActivityLayout + 69;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
        }
        return commonModule_setLeftEdgeTouchEnabled.onExtraCallback((Function1<? super DialogInterface, Unit>) function1);
    }

    public final onExtraCallback onExtraCallback(@Nullable Function1<? super DialogInterface, Unit> function1) {
        int i = 2 % 2;
        onExtraCallback onextracallback = new onExtraCallback(im.toss.uikit.R.string.uikit_ok, (TdsButtonV1View.asInterface) null, false, (Function1) function1, 6, (DefaultConstructorMarker) null);
        int i2 = onActivityLayout + Imgproc.COLOR_YUV2RGBA_YVYU;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    private static final Unit asInterface(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 19;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 115;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ onExtraCallback onWarmupCompleted(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 91;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda10
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 33;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitAsBinder = CommonModule_setLeftEdgeTouchEnabled.asBinder((DialogInterface) obj2);
                    int i7 = onExtraCallbackWithResult + 39;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return unitAsBinder;
                }
            };
            int i4 = onActivityLayout + 109;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
        }
        return commonModule_setLeftEdgeTouchEnabled.onNavigationEvent((Function1<? super DialogInterface, Unit>) function1);
    }

    public final onExtraCallback onNavigationEvent(@Nullable Function1<? super DialogInterface, Unit> function1) {
        int i = 2 % 2;
        onExtraCallback onextracallback = new onExtraCallback(im.toss.uikit.R.string.uikit_cancel, (TdsButtonV1View.asInterface) null, false, (Function1) function1, 6, (DefaultConstructorMarker) null);
        int i2 = onActivityLayout + 111;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return onextracallback;
        }
        throw null;
    }

    private static final Unit access000(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 3;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 73;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final onExtraCallback IAuthTabCallbackDefault(@Nullable Function1<? super DialogInterface, Unit> function1) {
        int i = 2 % 2;
        onExtraCallback onextracallback = new onExtraCallback(im.toss.uikit.R.string.uikit_yes, (TdsButtonV1View.asInterface) null, false, (Function1) function1, 6, (DefaultConstructorMarker) null);
        int i2 = onMinimized + 31;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    private static final Unit access100(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        onExtraCallback onextracallback = new onExtraCallback(im.toss.uikit.R.string.uikit_no, (TdsButtonV1View.asInterface) null, false, (Function1) objArr[1], 6, (DefaultConstructorMarker) null);
        int i2 = onActivityLayout + 57;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    private static final Unit getInterfaceDescriptor(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 39;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        Function1<? super DialogInterface, Unit> function1 = (Function1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = onMinimized + 69;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 105;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnExtraCallback = CommonModule_setLeftEdgeTouchEnabled.onExtraCallback((DialogInterface) obj2);
                    int i7 = onWarmupCompleted + 57;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return unitOnExtraCallback;
                }
            };
        }
        onExtraCallback onextracallbackOnExtraCallbackWithResult = commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(function1);
        int i4 = onActivityLayout + 125;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return onextracallbackOnExtraCallbackWithResult;
    }

    public final onExtraCallback onExtraCallbackWithResult(@Nullable Function1<? super DialogInterface, Unit> function1) {
        int i = 2 % 2;
        onExtraCallback onextracallback = new onExtraCallback(im.toss.uikit.R.string.uikit_confirm, (TdsButtonV1View.asInterface) null, false, (Function1) function1, 6, (DefaultConstructorMarker) null);
        int i2 = onMinimized + 23;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMinimized + 89;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[1];
        TdsButtonV1View.asInterface asinterface = (TdsButtonV1View.asInterface) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        Function1 function1 = (Function1) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback onextracallback = new onExtraCallback(str, asinterface, zBooleanValue, (Function1<? super DialogInterface, Unit>) function1);
        int i2 = onActivityLayout + 113;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ onExtraCallback onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, String str, TdsButtonV1View.asInterface asinterface, boolean z, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout;
        int i4 = i3 + 79;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            asinterface = null;
        }
        if ((i & 4) != 0) {
            int i6 = i3 + 45;
            int i7 = i6 % 128;
            onMinimized = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 99;
            onActivityLayout = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda11
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallbackWithResult + 85;
                    onNavigationEvent = i12 % 128;
                    DialogInterface dialogInterface = (DialogInterface) obj2;
                    if (i12 % 2 != 0) {
                        return CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(dialogInterface);
                    }
                    CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(dialogInterface);
                    throw null;
                }
            };
            int i11 = onMinimized + 49;
            onActivityLayout = i11 % 128;
            int i12 = i11 % 2;
        }
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, str, asinterface, Boolean.valueOf(z), function1};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback onextracallback = (onExtraCallback) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1428477735, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1428477731, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i13 = onActivityLayout + 75;
        onMinimized = i13 % 128;
        int i14 = i13 % 2;
        return onextracallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ onExtraCallback IAuthTabCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, int i, TdsButtonV1View.asInterface asinterface, boolean z, Function1 function1, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onMinimized;
        int i5 = i4 + 71;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 2) != 0) {
            asinterface = null;
        }
        if ((i2 & 4) != 0) {
            int i7 = i4 + 7;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1() { // from class: im.toss.uikit.utils.DialogBuilder$$ExternalSyntheticLambda9
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 3;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnWarmupCompleted = CommonModule_setLeftEdgeTouchEnabled.onWarmupCompleted((DialogInterface) obj2);
                    if (i11 == 0) {
                        int i12 = 42 / 0;
                    }
                    int i13 = onExtraCallback + 89;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            };
        }
        return commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(i, asinterface, z, (Function1<? super DialogInterface, Unit>) function1);
    }

    private static final Unit IAuthTabCallbackStub(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 47;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final onExtraCallback onExtraCallbackWithResult(int i, @Nullable TdsButtonV1View.asInterface asinterface, boolean z, @Nullable Function1<? super DialogInterface, Unit> function1) {
        int i2 = 2 % 2;
        onExtraCallback onextracallback = new onExtraCallback(i, asinterface, z, function1);
        int i3 = onMinimized + 43;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        return onextracallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 45;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult, (String[]) Arrays.copyOf(strArr, strArr.length)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 427718757, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -427718754, objArr2, iOnExtraCallback);
        int i4 = onMinimized + 123;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void onWarmupCompleted(Context context, Function1 function1, writeBinary writebinary) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(context, function1, writebinary);
            if (i3 == 0) {
                throw null;
            }
        }

        private onExtraCallbackWithResult() {
        }

        private final Triple<TdsDialogV1, Long, Map<String, Object>> IAuthTabCallback(Context context, initMiniApp initminiapp, Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1, writeBinary<onNavigationEvent> writebinary) throws Throwable {
            int i = 2 % 2;
            CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = new CommonModule_setLeftEdgeTouchEnabled(context, initminiapp, writebinary);
            function1.invoke(commonModule_setLeftEdgeTouchEnabled);
            Triple<TdsDialogV1, Long, Map<String, Object>> tripleIAuthTabCallback = CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled);
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return tripleIAuthTabCallback;
            }
            throw null;
        }

        public static /* synthetic */ TdsDialogV1 onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, Context context, initMiniApp initminiapp, Function1 function1, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            if ((i & 2) != 0) {
                int i3 = onWarmupCompleted + 109;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                initminiapp = null;
            }
            TdsDialogV1 tdsDialogV1OnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted(context, initminiapp, (Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit>) function1);
            int i4 = onWarmupCompleted + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return tdsDialogV1OnWarmupCompleted;
            }
            throw null;
        }

        @JvmStatic
        public final TdsDialogV1 onWarmupCompleted(@NotNull Context context, @Nullable initMiniApp initminiapp, @NotNull Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Object obj = null;
            Triple<TdsDialogV1, Long, Map<String, Object>> tripleOnExtraCallback = onExtraCallback(context, initminiapp, function1, null);
            TdsDialogV1 tdsDialogV1OnExtraCallbackWithResult = tripleOnExtraCallback.onExtraCallbackWithResult();
            Long lOnExtraCallback = tripleOnExtraCallback.onExtraCallback();
            Map<String, Object> mapIAuthTabCallback = tripleOnExtraCallback.IAuthTabCallback();
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (activityIAuthTabCallback != null && activityIAuthTabCallback.isFinishing()) {
                return tdsDialogV1OnExtraCallbackWithResult;
            }
            tdsDialogV1OnExtraCallbackWithResult.onWarmupCompleted(lOnExtraCallback);
            if (mapIAuthTabCallback != null) {
                for (Map.Entry<String, Object> entry : mapIAuthTabCallback.entrySet()) {
                    int i4 = onWarmupCompleted + 59;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Object value = entry.getValue();
                    if (value != null) {
                        int i6 = onExtraCallback + 23;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 == 0) {
                            tdsDialogV1OnExtraCallbackWithResult.writeTypedObject().put(entry.getKey(), value);
                            obj.hashCode();
                            throw null;
                        }
                        tdsDialogV1OnExtraCallbackWithResult.writeTypedObject().put(entry.getKey(), value);
                    }
                }
            }
            tdsDialogV1OnExtraCallbackWithResult.show();
            return tdsDialogV1OnExtraCallbackWithResult;
        }

        private static final void IAuthTabCallback(Context context, Function1 function1, writeBinary writebinary) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(writebinary, "");
            try {
                Triple<TdsDialogV1, Long, Map<String, Object>> tripleOnExtraCallback = CommonModule_setLeftEdgeTouchEnabled.Companion.onExtraCallback(context, null, function1, writebinary);
                TdsDialogV1 tdsDialogV1OnExtraCallbackWithResult = tripleOnExtraCallback.onExtraCallbackWithResult();
                Long lOnExtraCallback = tripleOnExtraCallback.onExtraCallback();
                Map<String, Object> mapIAuthTabCallback = tripleOnExtraCallback.IAuthTabCallback();
                tdsDialogV1OnExtraCallbackWithResult.show();
                if (lOnExtraCallback == null) {
                    ConvertByteArrayToFloatArray.onWarmupCompleted("dialog_open", false, (String) null, (List) null, mapIAuthTabCallback, (Function1) null, 46, (Object) null);
                    return;
                }
                long jLongValue = lOnExtraCallback.longValue();
                if (mapIAuthTabCallback == null) {
                    mapIAuthTabCallback = new LinkedHashMap<>();
                }
                Object[] objArr = {new TrackLog(jLongValue, mapIAuthTabCallback, (String) null, (String) null, 12, (DefaultConstructorMarker) null)};
                int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
            } catch (Throwable unused) {
                writebinary.IAuthTabCallback(onNavigationEvent.OPEN_ERROR);
                writebinary.onNavigationEvent();
            }
        }

        public final getByteBuffer<onNavigationEvent> IAuthTabCallback(@NotNull final Context context, @NotNull final Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (activityIAuthTabCallback != null) {
                int i4 = onExtraCallback + 37;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (activityIAuthTabCallback.isFinishing()) {
                    int i6 = onWarmupCompleted + 41;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    getByteBuffer<onNavigationEvent> getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(onNavigationEvent.OPEN_ERROR);
                    Intrinsics.checkNotNullExpressionValue(getbytebufferOnWarmupCompleted, "");
                    return getbytebufferOnWarmupCompleted;
                }
            }
            getByteBuffer<onNavigationEvent> getbytebufferOnNavigationEvent = getByteBuffer.IAuthTabCallback(new serializeObject() { // from class: im.toss.uikit.utils.DialogBuilder$Companion$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // o.serializeObject
                public final void subscribe(writeBinary writebinary) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 55;
                    onExtraCallbackWithResult = i9 % 128;
                    Object obj = null;
                    if (i9 % 2 != 0) {
                        CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult.onWarmupCompleted(context, function1, writebinary);
                        obj.hashCode();
                        throw null;
                    }
                    CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult.onWarmupCompleted(context, function1, writebinary);
                    int i10 = onExtraCallbackWithResult + 7;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                }
            }).onNavigationEvent(NetConverter3.onExtraCallback());
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnNavigationEvent, "");
            return getbytebufferOnNavigationEvent;
        }

        private final Triple<TdsDialogV1, Long, Map<String, Object>> onExtraCallback(Context context, initMiniApp initminiapp, Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1, writeBinary<onNavigationEvent> writebinary) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(context, initminiapp, function1, writebinary);
            }
            IAuthTabCallback(context, initminiapp, function1, writebinary);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1376691373, new Object[]{dialogInterface}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1376691372, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final void onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface, int i) {
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, dialogInterface, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1825813637, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1825813643, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ onExtraCallback IAuthTabCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, Function1 function1, int i, Object obj) {
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, function1, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (onExtraCallback) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ onExtraCallback onExtraCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, Function1 function1, int i, Object obj) {
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, function1, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (onExtraCallback) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2115179004, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -2115178997, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public final onExtraCallback onExtraCallback(@NotNull String str, @Nullable TdsButtonV1View.asInterface asinterface, boolean z, @Nullable Function1<? super DialogInterface, Unit> function1) {
        Object[] objArr = {this, str, asinterface, Boolean.valueOf(z), function1};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (onExtraCallback) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1428477735, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1428477731, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public final CharSequence IAuthTabCallback() {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (CharSequence) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1303993273, new Object[]{this}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1303993264, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public final onExtraCallback onWarmupCompleted(@Nullable Function1<? super DialogInterface, Unit> function1) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (onExtraCallback) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 900372088, new Object[]{this, function1}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -900372086, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public final void onExtraCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public final void IAuthTabCallback(@NotNull String... strArr) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -202238012, new Object[]{this, strArr}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 202238020, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public final void onWarmupCompleted(@Nullable onExtraCallback onextracallback) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{this, onextracallback}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public final void onExtraCallback(@Nullable onExtraCallback onextracallback) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{this, onextracallback}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    static void onTransact() {
        readTypedObject = 7798559133331975163L;
        extraCallback = -1776194565;
        onActivityResized = (char) 38163;
    }
}
