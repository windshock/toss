package viva.republica.toss.main.more.push;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.tosscert.ui.R;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda1;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.trackCheckout;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.more.push.SystemNotificationBottomSheetDialog$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SystemNotificationBottomSheetDialog extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private static char[] IAuthTabCallbackDefault;
    private static long IAuthTabCallbackStubProxy;
    private static int access100;
    public static final int onExtraCallback;
    private final Function0<Unit> IAuthTabCallback;
    private final String asBinder;
    private final Function0<Unit> asInterface;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private static final byte[] $$a = {29, -26, 91, 68};
    private static final int $$b = 192;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 0;
    private static int IAuthTabCallback_Parcel = 1;

    private static String $$c(byte b, int i, short s) {
        int i2 = (i * 3) + 4;
        int i3 = (b * 3) + 97;
        byte[] bArr = $$a;
        int i4 = s * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 += i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i6 = bArr[i2];
            i2++;
            i3 += i6;
        }
    }

    static {
        access100 = 1;
        writeTypedObject();
        onExtraCallback = r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI.onWarmupCompleted;
        int i = access000 + 87;
        access100 = i % 128;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(systemNotificationBottomSheetDialog, setDetectableSize);
        int i4 = IAuthTabCallback_Parcel + 1;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | (~i3) | i2)) | (~(i2 | i | i3));
        int i10 = ~i2;
        int i11 = (~(i3 | i)) | (~(i10 | i3)) | (~(i10 | i));
        int i12 = i2 + i + i6 + (1698977638 * i5) + (1466394737 * i4);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i2) - 490274816) + ((-1116082190) * i) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i6) + (1553727488 * i5) + (1859780608 * i4) + (925827072 * i13);
        int i15 = ((i2 * (-1787956080)) - 1478154965) + (i * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i6 * (-1787955639)) + (i5 * 552005654) + (i4 * (-2013897159)) + (i13 * (-429457408));
        int i16 = i14 + (i15 * i15 * (-402587648));
        if (i16 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 2) {
            return onExtraCallback(objArr);
        }
        SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog = (SystemNotificationBottomSheetDialog) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i17 = 2 % 2;
        int i18 = getInterfaceDescriptor + 103;
        IAuthTabCallback_Parcel = i18 % 128;
        int i19 = i18 % 2;
        onExtraCallbackWithResult(systemNotificationBottomSheetDialog, dialogInterface);
        int i20 = IAuthTabCallback_Parcel + 25;
        getInterfaceDescriptor = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(systemNotificationBottomSheetDialog, view);
        int i4 = getInterfaceDescriptor + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject();
        int i4 = getInterfaceDescriptor + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(systemNotificationBottomSheetDialog, setDetectableSize);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult();
        int i4 = getInterfaceDescriptor + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ void onNavigationEvent(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(-472320216, 472320218, new Object[]{systemNotificationBottomSheetDialog, dialogInterface}, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2);
        int i4 = getInterfaceDescriptor + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(systemNotificationBottomSheetDialog, setDetectableSize);
        int i4 = getInterfaceDescriptor + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemNotificationBottomSheetDialog(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.asBinder = str;
        this.onTransact = str2;
        this.onExtraCallbackWithResult = str3;
        this.onNavigationEvent = str4;
        this.IAuthTabCallback = function0;
        this.asInterface = function02;
    }

    public /* synthetic */ SystemNotificationBottomSheetDialog(Context context, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        Function0 function03;
        String str6 = "";
        String str7 = (i & 2) != 0 ? "" : str;
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallback_Parcel + 99;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            str5 = "";
        } else {
            str5 = str2;
        }
        String str8 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            int i4 = IAuthTabCallback_Parcel + 25;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            str6 = str4;
        }
        if ((i & 32) != 0) {
            function03 = new Function0() { // from class: viva.republica.toss.main.more.push.SystemNotificationBottomSheetDialog$$ExternalSyntheticLambda0
                public final Object invoke() {
                    int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                    int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                    return (Unit) SystemNotificationBottomSheetDialog.onExtraCallback(-1347712255, 1347712256, new Object[0], iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2);
                }
            };
            int i7 = IAuthTabCallback_Parcel + 93;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        } else {
            function03 = function0;
        }
        this(context, str7, str5, str8, str6, function03, (i & 64) != 0 ? new Function0() { // from class: viva.republica.toss.main.more.push.SystemNotificationBottomSheetDialog$$ExternalSyntheticLambda1
            public final Object invoke() {
                return SystemNotificationBottomSheetDialog.onExtraCallbackWithResult();
            }
        } : function02);
    }

    private static final Unit extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 63;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }

    private static final Unit readTypedObject() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(KeyEvent.getDeadChar(0, 0), 8 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (47745 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), systemNotificationBottomSheetDialog.asBinder);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 99;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 47745), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), systemNotificationBottomSheetDialog.asBinder);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 63;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (systemNotificationBottomSheetDialog.asBinder.length() > 0) {
            ConvertByteArrayToFloatArray.onExtraCallback(1012613L, false, (String) null, (Map) null, new SystemNotificationBottomSheetDialog$.ExternalSyntheticLambda7(systemNotificationBottomSheetDialog), 14, (Object) null);
        }
        systemNotificationBottomSheetDialog.IAuthTabCallback.invoke();
        trackCheckout trackcheckoutOnNavigationEvent = trackCheckout.Companion.onNavigationEvent();
        Context context = systemNotificationBottomSheetDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        trackcheckoutOnNavigationEvent.asBinder(context);
        systemNotificationBottomSheetDialog.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 35;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        final SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog = (SystemNotificationBottomSheetDialog) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (systemNotificationBottomSheetDialog.asBinder.length() <= 0) {
            return null;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1012615L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.main.more.push.SystemNotificationBottomSheetDialog$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return SystemNotificationBottomSheetDialog.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i4 = IAuthTabCallback_Parcel + 67;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit asInterface(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 8 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (47745 - Color.alpha(0)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), systemNotificationBottomSheetDialog.asBinder);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 15;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        systemNotificationBottomSheetDialog.asInterface.invoke();
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 63;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.push.SystemNotificationBottomSheetDialog.onCreate(android.os.Bundle):void");
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return "push_token__bottom_sheet";
        }
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 65;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 3;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ExpandableListView.getPackedPositionChild(0L) + 18, 10973 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallbackStubProxy), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 46134), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, 20220 - TextUtils.indexOf("", "", 0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1494 - Color.red(0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = $10 + 33;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i9 = $10 + 71;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 3 / 4;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTapTimeout() >> 16)), View.MeasureSpec.getMode(0) + 44, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1495, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(-1347712255, 1347712256, new Object[0], iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2);
    }

    public static /* synthetic */ void IAuthTabCallback(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, DialogInterface dialogInterface) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(240730318, -240730318, new Object[]{systemNotificationBottomSheetDialog, dialogInterface}, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2);
    }

    private static final void onExtraCallback(SystemNotificationBottomSheetDialog systemNotificationBottomSheetDialog, DialogInterface dialogInterface) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(-472320216, 472320218, new Object[]{systemNotificationBottomSheetDialog, dialogInterface}, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2);
    }

    static void writeTypedObject() {
        IAuthTabCallbackDefault = new char[]{22311, 45987, 40469, 64137, 50539, 8696, 3138, 5922};
        IAuthTabCallbackStubProxy = -8698488503004886713L;
    }
}
