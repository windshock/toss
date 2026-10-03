package viva.republica.toss.common.web.message.handlers;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleEventObserver;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.gson.JsonObject;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.ALCFaceBox;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IconRoundCornerProgressBarSavedState;
import o.PageAnimStore;
import o.PangleEncryptManager;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.deserializeUriNullableCollection;
import o.dynamicTrack;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestCalendarWritablePermissionHandler implements ALCFaceQuality {
    public static final Companion Companion;
    private static final WeakHashMap<r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, Boolean> IAuthTabCallback;
    private static char IAuthTabCallbackDefault;
    private static char IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static int asBinder;
    private static long asInterface;
    private static final WeakHashMap<r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, Companion.PendingSettingsPermissionResult> onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onTransact;
    private static final String onWarmupCompleted;
    private static final byte[] $$a = {114, 69, -115, -114};
    private static final int $$b = 60;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, int r8) {
        /*
            byte[] r0 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.$$a
            int r7 = r7 + 4
            int r8 = 110 - r8
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.$$c(short, short, int):java.lang.String");
    }

    public static /* synthetic */ Unit IAuthTabCallback(FragmentActivity fragmentActivity, setText settext, RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, shouldBeKeptAsChild shouldbekeptaschild) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            unit = (Unit) onExtraCallbackWithResult(iOnWarmupCompleted, zzgsa.onWarmupCompleted(), 877263832, new Object[]{fragmentActivity, settext, requestCalendarWritablePermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, shouldbekeptaschild}, -877263832, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2);
            int i3 = 40 / 0;
        } else {
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
            unit = (Unit) onExtraCallbackWithResult(iOnWarmupCompleted3, zzgsa.onWarmupCompleted(), 877263832, new Object[]{fragmentActivity, settext, requestCalendarWritablePermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, shouldbekeptaschild}, -877263832, zzgsa.onWarmupCompleted(), iOnWarmupCompleted4);
        }
        int i4 = access100 + 57;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Ref.BooleanRef booleanRef, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(booleanRef, setonoutofmemeryerrorcallback, requestCalendarWritablePermissionHandler, dialogInterface);
        }
        onWarmupCompleted(booleanRef, setonoutofmemeryerrorcallback, requestCalendarWritablePermissionHandler, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(setText settext, FragmentActivity fragmentActivity, Ref.BooleanRef booleanRef, RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(settext, fragmentActivity, booleanRef, requestCalendarWritablePermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, commonModule_setLeftEdgeTouchEnabled);
        int i4 = access100 + 85;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        String str;
        String strIntern;
        Map map;
        int i7;
        int i8 = i4 | i;
        int i9 = ~i3;
        int i10 = ~i;
        int i11 = ~(i9 | i10);
        int i12 = (~(i | i9)) | (~(i10 | i4));
        int i13 = i4 + i3 + i6 + (1389894630 * i2) + ((-1243605516) * i5);
        int i14 = i13 * i13;
        int i15 = ((-345998475) * i4) + 1335230464 + (862422157 * i3) + ((-1543273332) * i8) + (i11 * 1543273332) + (1543273332 * i12) + ((-1889271808) * i6) + (1607991296 * i2) + ((-548405248) * i5) + ((-1553596416) * i14);
        int i16 = ((i4 * (-88671125)) - 261777699) + (i3 * (-88671149)) + (i8 * (-12)) + (i11 * 12) + (i12 * 12) + (i6 * (-88671137)) + (i2 * (-349388198)) + (i5 * (-147040884)) + (i14 * 182059008);
        int i17 = i15 + (i16 * i16 * (-132513792));
        if (i17 == 1) {
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
            int i18 = 2 % 2;
            int i19 = IAuthTabCallback_Parcel + 111;
            access100 = i19 % 128;
            if (i19 % 2 == 0) {
                str = null;
                Object[] objArr2 = new Object[1];
                a(new char[]{17878, 20471, 44025, 2503, 63364, 54507, 57320, 5214, 59539, 56683, 21417, 14274, 15786, 38078, 13897, 27139, 49474, 62937, 22149, 31220, 47691, 29313, 39111, 28818, 17719, 31385, 31659, 9532, 55174, 29063, 49487, 19126, 44398, 37812}, (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)) + 123, objArr2);
                strIntern = ((String) objArr2[0]).intern();
                map = null;
                i7 = 3;
            } else {
                str = null;
                Object[] objArr3 = new Object[1];
                a(new char[]{17878, 20471, 44025, 2503, 63364, 54507, 57320, 5214, 59539, 56683, 21417, 14274, 15786, 38078, 13897, 27139, 49474, 62937, 22149, 31220, 47691, 29313, 39111, 28818, 17719, 31385, 31659, 9532, 55174, 29063, 49487, 19126, 44398, 37812}, 34 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                map = null;
                i7 = 5;
            }
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, str, strIntern, map, i7, (Object) null);
            return Unit.INSTANCE;
        }
        if (i17 != 2) {
            return i17 != 3 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }
        Context context = (Context) objArr[1];
        int i20 = 2 % 2;
        int i21 = IAuthTabCallback_Parcel + 9;
        access100 = i21 % 128;
        int i22 = i21 % 2;
        Object[] objArr4 = new Object[1];
        b(TextUtils.indexOf("", "") - 1090070073, (char) (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{17941, 10370, 10403, 22001, 49785, 42436, 20582, 50490, 27625, 7095, 20760, 10333, 52541, 35850, 65281, 3872, 42981, 7671, 26749, 25364, 7339, 57255, 28941, 1895, 44185, 49327, 41921, 13225, 6805, 65323, 39966, 35748, 51888}, new char[]{51146, 1753, 61631, 21281}, new char[]{0, 0, 0, 0}, objArr4);
        if (ContextCompat.checkSelfPermission(context, ((String) objArr4[0]).intern()) == 0) {
            int i23 = IAuthTabCallback_Parcel + 29;
            access100 = i23 % 128;
            int i24 = i23 % 2;
            Object[] objArr5 = new Object[1];
            b(ViewConfiguration.getTouchSlop() >> 8, (char) (MotionEvent.axisFromString("") + 12826), new char[]{51177, 34723, 29867, 27201, 15310, 45868, 28720, 30978, 41391, 6699, 33676, 15022, 56284, 6281, 4633, 36897, 13582, 4202, 23407, 19004, 24770, 2116, 22951, 58429, 52123, 38157, 3356, 37241, 43583, 28055, 21365, 51421}, new char[]{63749, 4098, 6427, 9266}, new char[]{0, 0, 0, 0}, objArr5);
            if (ContextCompat.checkSelfPermission(context, ((String) objArr5[0]).intern()) == 0) {
                int i25 = access100 + 47;
                IAuthTabCallback_Parcel = i25 % 128;
                int i26 = i25 % 2;
                return true;
            }
        }
        int i27 = IAuthTabCallback_Parcel + 35;
        access100 = i27 % 128;
        int i28 = i27 % 2;
        return false;
    }

    public static /* synthetic */ Unit onNavigationEvent(Ref.BooleanRef booleanRef, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(booleanRef, setonoutofmemeryerrorcallback, requestCalendarWritablePermissionHandler, dialogInterface);
        int i4 = access100 + 35;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Ref.BooleanRef booleanRef, RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, FragmentActivity fragmentActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(booleanRef, requestCalendarWritablePermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, fragmentActivity, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 35;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        int i4 = access100 + 123;
        IAuthTabCallback_Parcel = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnWarmupCompleted, zzgsa.onWarmupCompleted(), 1506631426, new Object[]{setonoutofmemeryerrorcallback, th}, -1506631425, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2);
        int i4 = IAuthTabCallback_Parcel + 3;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 27;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, requestCalendarWritablePermissionHandler, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        int i4 = IAuthTabCallback_Parcel + 87;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        access100 = i2 % 128;
        return i2 % 2 != 0;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = access100 + 99;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = access100 + 125;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = access100 + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            int i6 = 69 / 0;
        }
        int i7 = access100 + 73;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 123;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        static final class PendingSettingsPermissionResult {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int asBinder = 1;
            private static long onExtraCallbackWithResult = 4358247005786123518L;
            private static int onWarmupCompleted;
            private final LifecycleEventObserver IAuthTabCallback;
            private final setOnOutOfMemeryErrorCallback onExtraCallback;
            private boolean onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PendingSettingsPermissionResult)) {
                    int i2 = onWarmupCompleted + 87;
                    asBinder = i2 % 128;
                    return i2 % 2 == 0;
                }
                PendingSettingsPermissionResult pendingSettingsPermissionResult = (PendingSettingsPermissionResult) obj;
                if (!Intrinsics.areEqual(this.onExtraCallback, pendingSettingsPermissionResult.onExtraCallback)) {
                    int i3 = asBinder + 3;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.IAuthTabCallback, pendingSettingsPermissionResult.IAuthTabCallback)) {
                    return false;
                }
                if (this.onNavigationEvent == pendingSettingsPermissionResult.onNavigationEvent) {
                    return true;
                }
                int i5 = asBinder + 77;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 != 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = asBinder + 95;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + Boolean.hashCode(this.onNavigationEvent);
                int i4 = asBinder + 109;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() throws Throwable {
                int i = 2 % 2;
                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
                LifecycleEventObserver lifecycleEventObserver = this.IAuthTabCallback;
                boolean z = this.onNavigationEvent;
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a(new char[]{10649, 62471, 37617, 45228, 24332, 32240, 7084, 9783, 50420, 58046, 33043, 45049, 19875, 26625, 14048, 54428, 62236, 37344, 49058, 23057, 30950, 1725, 9490, 50171, 57775, 35880, 43762, 18611, 5896, 13818, 54199, 65108, 40138, 47779, 22803, 26564, 1447, 8223, 52936, 60591, 35617, 43480, 30632, 4616, 12500, 57083}, (KeyEvent.getMaxKeyCode() >> 16) + 56747, objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(setonoutofmemeryerrorcallback);
                Object[] objArr2 = new Object[1];
                a(new char[]{10725, 2314, 26720, 19202, 43574, 36291, 60649, 53130, 11956, 3648, 24874}, 8419 - View.MeasureSpec.getSize(0), objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(lifecycleEventObserver);
                Object[] objArr3 = new Object[1];
                a(new char[]{10725, 19218, 60507, 337, 41537, 51070, 30794, 40289, 15970, 21375, 62522}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25338, objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(z);
                Object[] objArr4 = new Object[1];
                a(new char[]{10720}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10638, objArr4);
                sb.append(((String) objArr4[0]).intern());
                String string = sb.toString();
                int i2 = onWarmupCompleted + 121;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    return string;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    int i3 = $10 + 71;
                    $11 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, (Process.myPid() >> 22) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (onExtraCallbackWithResult % 5407414049857832247L);
                            Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.myTid() >> 22) + 59, 6384 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                        Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 24 - KeyEvent.keyCodeFromString(""), 19627 - Color.blue(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                        Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 60, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                }
                char[] cArr2 = new char[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    int i6 = $11 + 35;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), View.MeasureSpec.getMode(0) + 59, 6383 - KeyEvent.keyCodeFromString(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr2);
            }

            public PendingSettingsPermissionResult(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @NotNull LifecycleEventObserver lifecycleEventObserver, boolean z) {
                Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
                Intrinsics.checkNotNullParameter(lifecycleEventObserver, "");
                this.onExtraCallback = setonoutofmemeryerrorcallback;
                this.IAuthTabCallback = lifecycleEventObserver;
                this.onNavigationEvent = z;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ PendingSettingsPermissionResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, LifecycleEventObserver lifecycleEventObserver, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 4) != 0) {
                    int i2 = onWarmupCompleted + 103;
                    int i3 = i2 % 128;
                    asBinder = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 31;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 % 2;
                    }
                    z = false;
                }
                this(setonoutofmemeryerrorcallback, lifecycleEventObserver, z);
            }

            public final setOnOutOfMemeryErrorCallback onNavigationEvent() {
                int i = 2 % 2;
                int i2 = asBinder;
                int i3 = i2 + 113;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
                int i5 = i2 + 85;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return setonoutofmemeryerrorcallback;
            }

            public final LifecycleEventObserver onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 67;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.IAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final void onExtraCallbackWithResult(boolean z) {
                int i = 2 % 2;
                int i2 = asBinder + 89;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                this.onNavigationEvent = z;
                if (i4 != 0) {
                    int i5 = 2 / 0;
                }
                int i6 = i3 + 81;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }

            public final boolean onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onNavigationEvent;
                }
                throw null;
            }
        }

        private Companion() {
        }
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity == null) {
            Object[] objArr = new Object[1];
            a(new char[]{17878, 20471, 44025, 2503, 63364, 54507, 57320, 5214, 59539, 56683, 21417, 14274, 15786, 38078, 13897, 27139, 49474, 62937, 22149, 31220, 47691, 29313, 39111, 28818, 17719, 31385, 31659, 9532, 55174, 29063, 49487, 19126, 44398, 37812}, 33 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, (String) null, ((String) objArr[0]).intern(), (Map) null, 5, (Object) null);
            return;
        }
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            Object[] objArr2 = new Object[1];
            a(new char[]{17878, 20471, 44025, 2503, 63364, 54507, 57320, 5214, 59539, 56683, 21417, 14274, 15786, 38078, 13897, 27139, 49474, 62937, 22149, 31220, 47691, 29313, 39111, 28818, 17719, 31385, 31659, 9532, 55174, 29063, 49487, 19126, 44398, 37812}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 34, objArr2);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, (String) null, ((String) objArr2[0]).intern(), (Map) null, 5, (Object) null);
            return;
        }
        setText settext = new setText(jsonObject);
        if (!((Boolean) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -117684864, new Object[]{this, context}, 117684866, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())).booleanValue()) {
            RxPermissions rxPermissions = new RxPermissions(activity);
            Object[] objArr3 = new Object[1];
            b(TextUtils.getOffsetAfter("", 0) - 1090070073, (char) View.getDefaultSize(0, 0), new char[]{17941, 10370, 10403, 22001, 49785, 42436, 20582, 50490, 27625, 7095, 20760, 10333, 52541, 35850, 65281, 3872, 42981, 7671, 26749, 25364, 7339, 57255, 28941, 1895, 44185, 49327, 41921, 13225, 6805, 65323, 39966, 35748, 51888}, new char[]{51146, 1753, 61631, 21281}, new char[]{0, 0, 0, 0}, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (12825 - View.resolveSize(0, 0)), new char[]{51177, 34723, 29867, 27201, 15310, 45868, 28720, 30978, 41391, 6699, 33676, 15022, 56284, 6281, 4633, 36897, 13582, 4202, 23407, 19004, 24770, 2116, 22951, 58429, 52123, 38157, 3356, 37241, 43583, 28055, 21365, 51421}, new char[]{63749, 4098, 6427, 9266}, new char[]{0, 0, 0, 0}, objArr4);
            deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = rxPermissions.onTransact(new String[]{strIntern, ((String) objArr4[0]).intern()}).onExtraCallbackWithResult(new RequestCalendarWritablePermissionHandler$.ExternalSyntheticLambda1(new RequestCalendarWritablePermissionHandler$.ExternalSyntheticLambda0(activity, settext, this, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback)), new RequestCalendarWritablePermissionHandler$.ExternalSyntheticLambda3(new RequestCalendarWritablePermissionHandler$.ExternalSyntheticLambda2(setonoutofmemeryerrorcallback)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            return;
        }
        int i4 = IAuthTabCallback_Parcel + 87;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            Object[] objArr5 = {setonoutofmemeryerrorcallback, onExtraCallback(false)};
            ALCFaceBox.onWarmupCompleted(291820722, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr5, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -291820715);
        } else {
            Object[] objArr6 = {setonoutofmemeryerrorcallback, onExtraCallback(true)};
            ALCFaceBox.onWarmupCompleted(291820722, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr6, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -291820715);
        }
        int i5 = access100 + 125;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i == 1001 && (!Intrinsics.areEqual(IAuthTabCallback.remove(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), Boolean.TRUE))) {
            int i4 = access100 + 111;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            if (context != null) {
                int i6 = access100 + 75;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                if (!onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, ((Boolean) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -117684864, new Object[]{this, context}, 117684866, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())).booleanValue())) {
                    Object[] objArr = {setonoutofmemeryerrorcallback, onExtraCallback(((Boolean) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -117684864, new Object[]{this, context}, 117684866, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())).booleanValue())};
                    ALCFaceBox.onWarmupCompleted(291820722, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -291820715);
                }
            }
        }
        int i8 = access100 + 71;
        IAuthTabCallback_Parcel = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 27;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onTransact);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iAlpha = Color.alpha(i3) + 10;
                        int packedPositionType = 12434 - ExpandableListView.getPackedPositionType(0L);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollDefaultDelay, iAlpha, packedPositionType, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, 12434 - (ViewConfiguration.getTapTimeout() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $11 + 9;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 14 - ((Process.getThreadPriority(0) + 20) >> 6), (-16757315) - Color.rgb(0, 0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void onExtraCallback(final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, final setText settext) {
        FragmentActivity activity;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            int i3 = 26 / 0;
            if (activity == null) {
                return;
            }
        } else {
            activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            if (activity == null) {
                return;
            }
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        final FragmentActivity fragmentActivity = activity;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(activity, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return RequestCalendarWritablePermissionHandler.onExtraCallback(settext, fragmentActivity, booleanRef, this, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        int i4 = access100 + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $11 + 101;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 44 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Color.red(0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTouchSlop() >> 8)), 43 - ImageFormat.getBitsPerPixel(0), KeyEvent.keyCodeFromString("") + 1494, 1533236389, false, $$c(b3, b4, (byte) (-b4)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 23972), 50 - TextUtils.indexOf("", "", 0), Color.red(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 45848), View.getDefaultSize(0, 0) + 29, 12577 - View.MeasureSpec.getMode(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asInterface ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackDefault ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $11 + 103;
        $10 = i5 % 128;
        if (i5 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(Ref.BooleanRef booleanRef, RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, FragmentActivity fragmentActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        booleanRef.element = false;
        requestCalendarWritablePermissionHandler.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback);
        Object[] objArr = new Object[1];
        b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1416871276, (char) (1692 - (Process.myTid() >> 22)), new char[]{64445, 19469, 955, 5217, 23615, 3434, 32071, 57092, 6941, 37176, 30553, 1680, 61536, 39013, 21556, 33796, 21409, 58355, 59046, 51789, 34321, 59609, 38650, 45750, 22366, 35470, 17156, 4080, 59113, 48716, 2276, 60423, 32075, 43671, 58524, 61404, 22904, 26963, 52651, 18454, 48296, 8837, 60805, 50837, 20003}, new char[]{38037, 35906, 40107, 41478}, new char[]{0, 0, 0, 0}, objArr);
        Intent intent = new Intent(((String) objArr[0]).intern());
        String packageName = fragmentActivity.getApplicationContext().getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) Color.blue(0), new char[]{3285, 5881, 23826, 61981, 52614, 36432, 24884, 42419}, new char[]{53688, 31205, 360, 63002}, new char[]{0, 0, 0, 0}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(packageName);
        intent.setData(Uri.parse(sb.toString()));
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intent, 1001, (Bundle) null, 4, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(Ref.BooleanRef booleanRef, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 11;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            booleanRef.element = false;
            Object[] objArr = {setonoutofmemeryerrorcallback, requestCalendarWritablePermissionHandler.onExtraCallback(false)};
            int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            ALCFaceBox.onWarmupCompleted(291820722, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, iIAuthTabCallback2, -291820715);
        } else {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            booleanRef.element = false;
            Object[] objArr2 = {setonoutofmemeryerrorcallback, requestCalendarWritablePermissionHandler.onExtraCallback(false)};
            int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback4 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            ALCFaceBox.onWarmupCompleted(291820722, iIAuthTabCallback3, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr2, iIAuthTabCallback4, -291820715);
        }
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 21;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Ref.BooleanRef booleanRef, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            if (booleanRef.element) {
                Object[] objArr = {setonoutofmemeryerrorcallback, requestCalendarWritablePermissionHandler.onExtraCallback(false)};
                int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                ALCFaceBox.onWarmupCompleted(291820722, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, iIAuthTabCallback2, -291820715);
            }
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback_Parcel + 47;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        boolean z = booleanRef.element;
        throw null;
    }

    private static final Unit onWarmupCompleted(setText settext, final FragmentActivity fragmentActivity, final Ref.BooleanRef booleanRef, final RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        String string = fragmentActivity.getString(R.string.app_request_calendar_permission_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = new Object[1];
        b(1139621576 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (9562 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), new char[]{12261, 22379, 64671, 25365, 21041}, new char[]{51416, 60734, 23107, 4645}, new char[]{0, 0, 0, 0}, objArr);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(settext.onNavigationEvent(((String) objArr[0]).intern(), string));
        String string2 = fragmentActivity.getString(R.string.app_request_calendar_permission_message);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = new Object[1];
        b(Color.green(0) - 929807286, (char) (Process.myPid() >> 22), new char[]{40724, 49374, 11334, 15438, 33371, 31561, 29862}, new char[]{19048, 37956, 51400, 54418}, new char[]{0, 0, 0, 0}, objArr2);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(settext.onNavigationEvent(((String) objArr2[0]).intern(), string2));
        String string3 = fragmentActivity.getString(R.string.set_permission);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        Object[] objArr3 = new Object[1];
        b(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), new char[]{22486, 47714, 51035, 2258, 6008, 17249, 7073, 2544}, new char[]{58699, 6773, 51929, 50295}, new char[]{0, 0, 0, 0}, objArr3);
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, settext.onNavigationEvent(((String) objArr3[0]).intern(), string3), (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return RequestCalendarWritablePermissionHandler.onNavigationEvent(booleanRef, requestCalendarWritablePermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, fragmentActivity, (DialogInterface) obj);
            }
        }, 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string4 = fragmentActivity.getString(im.toss.uikit.R.string.uikit_cancel);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        Object[] objArr4 = new Object[1];
        b(2116354656 - MotionEvent.axisFromString(""), (char) TextUtils.getTrimmedLength(""), new char[]{50576, 18507, 50068, 13059, 64003, 52701, 18513, 42624, 40492, 17341, 34804}, new char[]{24859, 9474, 1918, 48309}, new char[]{0, 0, 0, 0}, objArr4);
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, settext.onNavigationEvent(((String) objArr4[0]).intern(), string4), (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return RequestCalendarWritablePermissionHandler.onNavigationEvent(booleanRef, setonoutofmemeryerrorcallback, requestCalendarWritablePermissionHandler, (DialogInterface) obj);
            }
        }, 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return RequestCalendarWritablePermissionHandler.IAuthTabCallback(booleanRef, setonoutofmemeryerrorcallback, requestCalendarWritablePermissionHandler, (DialogInterface) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 21;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r10
      0x0035: PHI (r10v4 viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult) = 
      (r10v3 viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult)
      (r10v12 viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult)
     binds: [B:8:0x0033, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onExtraCallback(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8, viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler r9, o.TextFieldScrollKtExternalSyntheticLambda0 r10, o.TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.IAuthTabCallback_Parcel
            int r1 = r1 + 107
            int r2 = r1 % 128
            viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.access100 = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            java.util.WeakHashMap<o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult> r10 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.onExtraCallback
            java.lang.Object r10 = r10.get(r8)
            viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult r10 = (viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.Companion.PendingSettingsPermissionResult) r10
            r1 = 53
            int r1 = r1 / 0
            if (r10 == 0) goto L9d
            goto L35
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            java.util.WeakHashMap<o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult> r10 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.onExtraCallback
            java.lang.Object r10 = r10.get(r8)
            viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult r10 = (viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.Companion.PendingSettingsPermissionResult) r10
            if (r10 == 0) goto L9d
        L35:
            int[] r1 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.WhenMappings.onExtraCallbackWithResult
            int r11 = r11.ordinal()
            r11 = r1[r11]
            r1 = 1
            if (r11 == r1) goto L99
            if (r11 == r0) goto L57
            int r10 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.IAuthTabCallback_Parcel
            int r10 = r10 + 37
            int r1 = r10 % 128
            viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.access100 = r1
            int r10 = r10 % r0
            if (r10 != 0) goto L50
            if (r11 != r0) goto L9d
            goto L53
        L50:
            r10 = 3
            if (r11 != r10) goto L9d
        L53:
            r9.onExtraCallback(r8)
            return
        L57:
            boolean r11 = r10.onWarmupCompleted()
            r11 = r11 ^ r1
            if (r11 == r1) goto L9d
            android.content.Context r11 = r8.getContext()
            if (r11 == 0) goto L9d
            int r1 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.access100
            int r1 = r1 + 99
            int r2 = r1 % 128
            viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            o.setOnOutOfMemeryErrorCallback r10 = r10.onNavigationEvent()
            java.lang.Object[] r4 = new java.lang.Object[]{r9, r11}
            int r1 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r7 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r2 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r6 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            r5 = 117684866(0x703ba82, float:9.910154E-35)
            r3 = -117684864(0xfffffffff8fc4580, float:-4.0933389E34)
            java.lang.Object r11 = onExtraCallbackWithResult(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r9.onWarmupCompleted(r8, r10, r11)
            goto L9d
        L99:
            r10.onExtraCallbackWithResult(r1)
            return
        L9d:
            int r8 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.access100
            int r8 = r8 + 37
            int r9 = r8 % 128
            viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.IAuthTabCallback_Parcel = r9
            int r8 = r8 % r0
            if (r8 != 0) goto La9
            return
        La9:
            r8 = 0
            r8.hashCode()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.onExtraCallback(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler, o.TextFieldScrollKtExternalSyntheticLambda0, o.TextFieldKeyInputExternalSyntheticLambda9$onExtraCallbackWithResult):void");
    }

    private final void IAuthTabCallback(final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        IAuthTabCallback.remove(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$$ExternalSyntheticLambda8
            public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                RequestCalendarWritablePermissionHandler.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, this, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
            }
        };
        onExtraCallback.put(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, new Companion.PendingSettingsPermissionResult(setonoutofmemeryerrorcallback, lifecycleEventObserver, false, 4, null));
        r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getLifecycle().IAuthTabCallback(lifecycleEventObserver);
        int i2 = access100 + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private final boolean onWarmupCompleted(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, boolean z) {
        int i = 2 % 2;
        Companion.PendingSettingsPermissionResult pendingSettingsPermissionResultRemove = onExtraCallback.remove(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        Object obj = null;
        if (pendingSettingsPermissionResultRemove != null) {
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getLifecycle().onExtraCallbackWithResult(pendingSettingsPermissionResultRemove.onExtraCallback());
            IAuthTabCallback.put(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Boolean.TRUE);
            Object[] objArr = {setonoutofmemeryerrorcallback, onExtraCallback(z)};
            int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            ALCFaceBox.onWarmupCompleted(291820722, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, iIAuthTabCallback2, -291820715);
            int i2 = IAuthTabCallback_Parcel + 75;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i3 = IAuthTabCallback_Parcel + 33;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if ((r4 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r4 = 87 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r4.getLifecycle().onExtraCallbackWithResult(r1.onExtraCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r4 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.access100 + 41;
        viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.IAuthTabCallback_Parcel = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallback(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.access100
            int r1 = r1 + 119
            int r2 = r1 % 128
            viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            java.util.WeakHashMap<o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult> r1 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.onExtraCallback
            java.lang.Object r1 = r1.remove(r4)
            viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult r1 = (viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.Companion.PendingSettingsPermissionResult) r1
            r2 = 70
            int r2 = r2 / 0
            if (r1 != 0) goto L37
            goto L27
        L1d:
            java.util.WeakHashMap<o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult> r1 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.onExtraCallback
            java.lang.Object r1 = r1.remove(r4)
            viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler$Companion$PendingSettingsPermissionResult r1 = (viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.Companion.PendingSettingsPermissionResult) r1
            if (r1 != 0) goto L37
        L27:
            int r4 = viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.access100
            int r4 = r4 + 41
            int r1 = r4 % 128
            viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.IAuthTabCallback_Parcel = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L36
            r4 = 87
            int r4 = r4 / 0
        L36:
            return
        L37:
            o.TextFieldKeyInputExternalSyntheticLambda9 r4 = r4.getLifecycle()
            androidx.lifecycle.LifecycleEventObserver r0 = r1.onExtraCallback()
            r4.onExtraCallbackWithResult(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler.onExtraCallback(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ):void");
    }

    static {
        IAuthTabCallbackStubProxy = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{17878, 20471, 44025, 2503, 63364, 54507, 57320, 5214, 59539, 56683, 21417, 14274, 15786, 38078, 13897, 27139, 49474, 62937, 22149, 31220, 47691, 29313, 39111, 28818, 17719, 31385, 31659, 9532, 55174, 29063, 49487, 19126, 44398, 37812}, 34 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        onExtraCallback = new WeakHashMap<>();
        IAuthTabCallback = new WeakHashMap<>();
        int i = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private final kotlinx.serialization.json.JsonObject onExtraCallback(boolean z) throws Throwable {
        int i = 2 % 2;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Object[] objArr = new Object[1];
        b((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (char) ('0' - AndroidCharacter.getMirror('0')), new char[]{54712, 42879, 57475, 56624, 4512, 55019, 7982, 51238, 22277, 37049, 26503, 16136}, new char[]{41478, 44689, 62485, 13634}, new char[]{0, 0, 0, 0}, objArr);
        dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager, ((String) objArr[0]).intern(), Boolean.valueOf(z));
        kotlinx.serialization.json.JsonObject jsonObjectOnExtraCallbackWithResult = pangleEncryptManager.onExtraCallbackWithResult();
        int i2 = access100 + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return jsonObjectOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) throws Throwable {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        onExtraCallbackWithResult(iOnWarmupCompleted, zzgsa.onWarmupCompleted(), -1348983709, new Object[]{function1, obj}, 1348983712, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    private final boolean onExtraCallback(Context context) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(iOnWarmupCompleted, zzgsa.onWarmupCompleted(), -117684864, new Object[]{this, context}, 117684866, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2)).booleanValue();
    }

    private static final Unit onExtraCallbackWithResult(FragmentActivity fragmentActivity, setText settext, RequestCalendarWritablePermissionHandler requestCalendarWritablePermissionHandler, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, shouldBeKeptAsChild shouldbekeptaschild) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted, zzgsa.onWarmupCompleted(), 877263832, new Object[]{fragmentActivity, settext, requestCalendarWritablePermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, shouldbekeptaschild}, -877263832, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    private static final Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted, zzgsa.onWarmupCompleted(), 1506631426, new Object[]{setonoutofmemeryerrorcallback, th}, -1506631425, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = (char) 17941;
        onNavigationEvent = (char) 49502;
        IAuthTabCallbackStub = (char) 61091;
        onTransact = (char) 33812;
        asInterface = 7798559133331975163L;
        asBinder = -1776194565;
        IAuthTabCallbackDefault = (char) 5533;
    }
}
