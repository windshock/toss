package o;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tuba.Trigger;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.R;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ImageRequestBuilderExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageRequestBuilderExternalSyntheticLambda0 extends getWriteEnabled {
    public static final onWarmupCompleted Companion;
    private static short[] IAuthTabCallbackDefault;
    private static byte[] IAuthTabCallbackStub;
    private static int access100;
    private static int onExtraCallback;
    private static int onTransact;
    private static int onWarmupCompleted;
    private final UtilsKtExternalSyntheticLambda9 IAuthTabCallback;
    private final OkHttpNetworkFetcherExternalSyntheticLambda3 onNavigationEvent;
    private static final byte[] $$a = {40, AbstractSmartcard.BYTE_RESPONSE_LENGTH, -113, 75};
    private static final int $$b = 62;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int asInterface = 0;
    private static int asBinder = 1;

    private static String $$c(short s, short s2, byte b) {
        int i = 3 - (b * 3);
        int i2 = (s2 * 4) + 115;
        byte[] bArr = $$a;
        int i3 = s * 4;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i2 += -i4;
        }
        while (true) {
            i5++;
            i++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i];
        }
    }

    static {
        access100 = 1;
        onNavigationEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = IAuthTabCallback_Parcel + 69;
        access100 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Map map, String str, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(map, str, dialogInterface);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Map map, String str, String str2, ImageRequestBuilderExternalSyntheticLambda0 imageRequestBuilderExternalSyntheticLambda0, DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 5;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(map, str, str2, imageRequestBuilderExternalSyntheticLambda0, dialogInterface, i);
        int i5 = asInterface + 83;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(String str, ImageRequestBuilderExternalSyntheticLambda0 imageRequestBuilderExternalSyntheticLambda0, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(str, imageRequestBuilderExternalSyntheticLambda0, dialogInterface, i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageRequestBuilderExternalSyntheticLambda0(@NotNull OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3, @NotNull UtilsKtExternalSyntheticLambda9 utilsKtExternalSyntheticLambda9) {
        super(okHttpNetworkFetcherExternalSyntheticLambda3, "DIALOG", 100L);
        Intrinsics.checkNotNullParameter(okHttpNetworkFetcherExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda9, "");
        this.onNavigationEvent = okHttpNetworkFetcherExternalSyntheticLambda3;
        this.IAuthTabCallback = utilsKtExternalSyntheticLambda9;
    }

    @Override // o.getWriteEnabled
    public void onWarmupCompleted(@NotNull Activity activity, @NotNull Trigger trigger, @NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(trigger, "");
        Intrinsics.checkNotNullParameter(str, "");
        onNavigationEvent(activity, trigger, str, access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("trigger_id", trigger.onNavigationEvent()), getWrite.IAuthTabCallback("trigger_name", trigger.onWarmupCompleted()), getWrite.IAuthTabCallback("trigger_type", "DIALOG"), getWrite.IAuthTabCallback("category", "tuba_trigger")}));
        int i4 = asBinder + 69;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void onExtraCallback(Map map, String str, String str2, ImageRequestBuilderExternalSyntheticLambda0 imageRequestBuilderExternalSyntheticLambda0, DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 2 % 2;
        new TrackEvent("tuba_trigger_dialog_accept", map, (List) null, str, 4, (DefaultConstructorMarker) null).onWarmupCompleted(true);
        dialogInterface.dismiss();
        if (str2 == null || !mergeParams.onExtraCallbackWithResult(str2)) {
            return;
        }
        int i3 = asBinder + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Activity activityOnWarmupCompleted = imageRequestBuilderExternalSyntheticLambda0.onWarmupCompleted(imageRequestBuilderExternalSyntheticLambda0.onNavigationEvent);
        if (activityOnWarmupCompleted != null) {
            int i5 = asBinder + 49;
            asInterface = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                if (activityOnWarmupCompleted.isFinishing()) {
                    return;
                }
                int i6 = asBinder + 115;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    imageRequestBuilderExternalSyntheticLambda0.IAuthTabCallback.start(activityOnWarmupCompleted, str2);
                    return;
                } else {
                    imageRequestBuilderExternalSyntheticLambda0.IAuthTabCallback.start(activityOnWarmupCompleted, str2);
                    obj.hashCode();
                    throw null;
                }
            }
            activityOnWarmupCompleted.isFinishing();
            obj.hashCode();
            throw null;
        }
    }

    private static final void IAuthTabCallback(String str, ImageRequestBuilderExternalSyntheticLambda0 imageRequestBuilderExternalSyntheticLambda0, DialogInterface dialogInterface, int i) {
        Activity activityOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = asBinder + 69;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        dialogInterface.cancel();
        if (str != null && mergeParams.onExtraCallbackWithResult(str) && (activityOnWarmupCompleted = imageRequestBuilderExternalSyntheticLambda0.onWarmupCompleted(imageRequestBuilderExternalSyntheticLambda0.onNavigationEvent)) != null && (!activityOnWarmupCompleted.isFinishing())) {
            int i5 = asInterface + 65;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            imageRequestBuilderExternalSyntheticLambda0.IAuthTabCallback.start(activityOnWarmupCompleted, str);
            if (i6 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i7 = asInterface + 43;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 14 / 0;
        }
    }

    private static final void onExtraCallback(Map map, String str, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        new TrackEvent("tuba_trigger_dialog_cancel", map, (List) null, str, 4, (DefaultConstructorMarker) null).onWarmupCompleted(true);
        int i2 = asInterface + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(Activity activity, Trigger trigger, final String str, final Map<String, Object> map) throws Throwable {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = asBinder + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAsInterface = trigger.asInterface();
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallback = TdsDialogV1.Companion.onExtraCallback(activity);
        Object[] objArr = new Object[1];
        a((short) (88 - Color.alpha(0)), (byte) ((-22) - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1742765845 - Color.red(0), 807284885 - KeyEvent.keyCodeFromString(""), (-106) - TextUtils.getTrimmedLength(""), objArr);
        String str2 = (String) mapAsInterface.get(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((short) ((-24) - (ViewConfiguration.getJumpTapTimeout() >> 16)), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 43), 1742765849 - TextUtils.getCapsMode("", 0, 0), 807284878 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-104) - View.resolveSize(0, 0), objArr2);
        String str3 = (String) mapAsInterface.get(((String) objArr2[0]).intern());
        String str4 = (String) mapAsInterface.get("acceptText");
        final String str5 = (String) mapAsInterface.get("acceptUrl");
        String str6 = (String) mapAsInterface.get("cancelText");
        final String str7 = (String) mapAsInterface.get("cancelUrl");
        Boolean bool = (Boolean) mapAsInterface.get("closeOnTouchBackground");
        if (bool != null) {
            int i4 = asBinder + 103;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                bool.booleanValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (str2 != null) {
            int i5 = asInterface + 59;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
                if (str2.length() != 0) {
                    onwarmupcompletedOnExtraCallback.onNavigationEvent(str2);
                }
            } else if (str2.length() != 0) {
            }
        }
        if (str3 != null && str3.length() != 0) {
            onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult(str3);
            int i7 = asBinder + 63;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: im.toss.components.tuba.trigger.internal.DialogTriggerExecutor$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) throws Throwable {
                int i10 = 2 % 2;
                int i11 = onExtraCallback + 77;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                ImageRequestBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(map, str, str5, this, dialogInterface, i9);
                int i13 = onExtraCallbackWithResult + 99;
                onExtraCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: im.toss.components.tuba.trigger.internal.DialogTriggerExecutor$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                int i10 = 2 % 2;
                int i11 = onWarmupCompleted + 91;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    ImageRequestBuilderExternalSyntheticLambda0.onNavigationEvent(str7, this, dialogInterface, i9);
                    int i12 = 25 / 0;
                } else {
                    ImageRequestBuilderExternalSyntheticLambda0.onNavigationEvent(str7, this, dialogInterface, i9);
                }
                int i13 = IAuthTabCallback + 3;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            }
        };
        onwarmupcompletedOnExtraCallback.IAuthTabCallback(new DialogInterface.OnCancelListener() { // from class: im.toss.components.tuba.trigger.internal.DialogTriggerExecutor$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) throws Throwable {
                int i9 = 2 % 2;
                int i10 = onExtraCallback + 77;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                ImageRequestBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(map, str, dialogInterface);
                int i12 = onExtraCallback + 47;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            }
        });
        onwarmupcompletedOnExtraCallback.onNavigationEvent(zBooleanValue);
        if (str4 == null || str4.length() == 0) {
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(onwarmupcompletedOnExtraCallback, R.string.uikit_confirm, onClickListener, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        } else {
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompletedOnExtraCallback, str4, onClickListener, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        }
        if (str6 != null && str6.length() != 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        }
        onwarmupcompletedOnExtraCallback.readTypedObject();
        ConvertByteArrayToFloatArray.onExtraCallback(1013851L, true, str, map, null, 16, null);
        int i9 = asInterface + 27;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
    }

    private final Activity onWarmupCompleted(OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3) {
        int i = 2 % 2;
        WeakReference weakReference = (WeakReference) okHttpNetworkFetcherExternalSyntheticLambda3.getCurrentActivityFlow().IAuthTabCallback();
        if (weakReference != null) {
            int i2 = asBinder + 77;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return (Activity) weakReference.get();
        }
        int i4 = asBinder + 99;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 43, 22438 - ExpandableListView.getPackedPositionChild(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if ((i7 ^ 1) == 0) {
                byte[] bArr = IAuthTabCallbackStub;
                if (bArr != null) {
                    int i8 = $11 + 63;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 1;
                        $11 = i11 % 128;
                        int i12 = i11 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 12844), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55, TextUtils.getCapsMode("", 0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i10++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i13 = $10 + 27;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        byte[] bArr3 = IAuthTabCallbackStub;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 42, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] - (-4629411779493505016L))) * ((int) (onExtraCallback ^ (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = IAuthTabCallbackStub;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.green(0)), 42 - View.combineMeasuredStates(0, 0), TextUtils.getCapsMode("", 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i4 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iIntValue = (byte) i4;
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallbackDefault[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))) + i7;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onTransact), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0') + 87, 9568 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = IAuthTabCallbackStub;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr6[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i15 = $11 + 69;
                    $10 = i15 % 128;
                    boolean z = i15 % 2 == 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr7 = IAuthTabCallbackStub;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = IAuthTabCallbackDefault;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onNavigationEvent() {
        onWarmupCompleted = 1012422883;
        onExtraCallback = -1538795417;
        onTransact = 1806047191;
        IAuthTabCallbackStub = new byte[]{-77, -78, -127, -49, 75, -29, 91, -27, -5, 77, 8, 8};
    }
}
