package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sdk.openadsdk.wwx.lt;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxSingleKt;
import o.TypeUtils7;
import o.deserializeIp;
import o.getColorInteger;
import o.isJSONTypeIgnore;
import o.shortValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getColorInteger implements shortValue {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStubProxy;
    private static short[] IAuthTabCallback_Parcel;
    private static int access000;
    private static byte[] access100;
    private static long asBinder;
    public static final int onExtraCallback;
    private static final String onNavigationEvent;
    private static int readTypedObject;
    private final resolveThemeAttribute IAuthTabCallback;
    private WeakReference<Activity> IAuthTabCallbackStub;
    private final AtomicReference<getTimestampBytes<Result<isJSONTypeIgnore>>> asInterface;
    private final Context onExtraCallbackWithResult;
    private final r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58 onTransact;
    private final resolveResourcePath onWarmupCompleted;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 1;
    private static int getInterfaceDescriptor = 0;
    private static int extraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            byte[] r0 = o.getColorInteger.$$a
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 115
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getColorInteger.$$c(int, byte, short):java.lang.String");
    }

    static {
        readTypedObject = 0;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{25707, 39213, 51019, 58331, 25657, 2298, 58452, 22179, 8867, 16686, 44340, 6268, 59751, 34403, 30718, 41279, 45099, 64683}, 1 - TextUtils.getCapsMode("", 0, 0), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        onExtraCallback = 8;
        int i = writeTypedObject + 121;
        readTypedObject = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getTimestampBytes gettimestampbytes, getColorInteger getcolorinteger, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(new Object[]{gettimestampbytes, getcolorinteger, isjsontypeignore}, lt.40.onExtraCallbackWithResult(), -1694234468, iOnExtraCallbackWithResult, 1694234472, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(getColorInteger getcolorinteger, getHostnameVerifierokhttp gethostnameverifierokhttp, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(getcolorinteger, gethostnameverifierokhttp, isjsontypeignore);
        }
        onExtraCallback(getcolorinteger, gethostnameverifierokhttp, isjsontypeignore);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ serializeRaw IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return access100(function1, obj);
        }
        access100(function1, obj);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TypeUtils1 typeUtils1 = (TypeUtils1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        getColorInteger getcolorinteger = (getColorInteger) objArr[3];
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[4];
        UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        String str = (String) objArr[7];
        boolean zBooleanValue3 = ((Boolean) objArr[8]).booleanValue();
        boolean zBooleanValue4 = ((Boolean) objArr[9]).booleanValue();
        shortValue.onNavigationEvent onnavigationevent = (shortValue.onNavigationEvent) objArr[10];
        Function1 function1 = (Function1) objArr[11];
        Function0 function0 = (Function0) objArr[12];
        boolean zBooleanValue5 = ((Boolean) objArr[13]).booleanValue();
        boolean zBooleanValue6 = ((Boolean) objArr[14]).booleanValue();
        String str2 = (String) objArr[15];
        Result result = (Result) objArr[16];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(typeUtils1, zBooleanValue, zBooleanValue2, getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, jLongValue, str, zBooleanValue3, zBooleanValue4, onnavigationevent, function1, function0, zBooleanValue5, zBooleanValue6, str2, result);
        }
        onExtraCallback(typeUtils1, zBooleanValue, zBooleanValue2, getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, jLongValue, str, zBooleanValue3, zBooleanValue4, onnavigationevent, function1, function0, zBooleanValue5, zBooleanValue6, str2, result);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ serializeRaw IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        serializeRaw serializerawOnTransact = onTransact(function1, obj);
        int i3 = extraCallbackWithResult + 61;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return serializerawOnTransact;
    }

    public static /* synthetic */ TypeUtils2 IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TypeUtils2 typedObject = readTypedObject(function1, obj);
        int i4 = getInterfaceDescriptor + 63;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return typedObject;
        }
        throw null;
    }

    public static /* synthetic */ serializeRaw asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawExtraCallbackWithResult = extraCallbackWithResult(function1, obj);
        int i4 = extraCallbackWithResult + 9;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return serializerawExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TypeUtils7 typeUtils7 = (TypeUtils7) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(new Object[]{typeUtils7}, lt.40.onExtraCallbackWithResult(), -1701048578, iOnExtraCallbackWithResult, 1701048580, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
        int i4 = extraCallbackWithResult + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        boolean z;
        int i7 = ~((~i3) | i4 | i2);
        int i8 = i3 | i4 | i2;
        int i9 = (~((~i4) | (~i2))) | i7;
        int i10 = i4 + i2 + i + (1512347918 * i6) + (2033855975 * i5);
        int i11 = i10 * i10;
        int i12 = ((i4 * 1848112433) - 751391395) + (i2 * 1848112433) + (i7 * (-92)) + (i8 * 46) + (i9 * 46) + (1848112479 * i) + ((-818859470) * i6) + ((-357164103) * i5) + (i11 * 1740046336);
        switch (((i4 * 1295388527) - 26148864) + (1295388527 * i2) + (2139102940 * i7) + (i8 * 1077932178) + (1077932178 * i9) + ((-1921646592) * i) + (1114898432 * i6) + (1668939776 * i5) + (346619904 * i11) + (i12 * i12 * 1721171968)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                getColorInteger getcolorinteger = (getColorInteger) objArr[0];
                RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[1];
                UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[2];
                long jLongValue = ((Number) objArr[3]).longValue();
                boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
                boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
                boolean zBooleanValue3 = ((Boolean) objArr[6]).booleanValue();
                boolean zBooleanValue4 = ((Boolean) objArr[7]).booleanValue();
                shortValue.onNavigationEvent onnavigationevent = (shortValue.onNavigationEvent) objArr[8];
                boolean zBooleanValue5 = ((Boolean) objArr[9]).booleanValue();
                Function0<Unit> function0 = (Function0) objArr[10];
                boolean zBooleanValue6 = ((Boolean) objArr[11]).booleanValue();
                TypeUtils1 typeUtils1 = (TypeUtils1) objArr[12];
                boolean zBooleanValue7 = ((Boolean) objArr[13]).booleanValue();
                String str = (String) objArr[14];
                Function1<? super TypeUtils7, Unit> function1 = (Function1) objArr[15];
                String str2 = (String) objArr[16];
                boolean zBooleanValue8 = ((Boolean) objArr[17]).booleanValue();
                int iIntValue = ((Number) objArr[18]).intValue();
                Object obj = objArr[19];
                int i13 = 2 % 2;
                int i14 = extraCallbackWithResult;
                int i15 = i14 + 69;
                getInterfaceDescriptor = i15 % 128;
                int i16 = i15 % 2;
                if ((iIntValue & 65536) != 0) {
                    int i17 = i14 + 29;
                    getInterfaceDescriptor = i17 % 128;
                    int i18 = i17 % 2;
                    z = false;
                } else {
                    z = zBooleanValue8;
                }
                return getcolorinteger.onWarmupCompleted(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, jLongValue, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, onnavigationevent, zBooleanValue5, function0, zBooleanValue6, typeUtils1, zBooleanValue7, str, function1, str2, z);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                boolean zBooleanValue9 = ((Boolean) objArr[0]).booleanValue();
                TypeUtils1 typeUtils12 = (TypeUtils1) objArr[1];
                boolean zBooleanValue10 = ((Boolean) objArr[2]).booleanValue();
                boolean zBooleanValue11 = ((Boolean) objArr[3]).booleanValue();
                getColorInteger getcolorinteger2 = (getColorInteger) objArr[4];
                RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition12 = (RememberLottieCompositionKtlottieComposition1) objArr[5];
                UTF8Decoder uTF8Decoder2 = (UTF8Decoder) objArr[6];
                long jLongValue2 = ((Number) objArr[7]).longValue();
                String str3 = (String) objArr[8];
                boolean zBooleanValue12 = ((Boolean) objArr[9]).booleanValue();
                boolean zBooleanValue13 = ((Boolean) objArr[10]).booleanValue();
                shortValue.onNavigationEvent onnavigationevent2 = (shortValue.onNavigationEvent) objArr[11];
                Function1 function12 = (Function1) objArr[12];
                Function0 function02 = (Function0) objArr[13];
                boolean zBooleanValue14 = ((Boolean) objArr[14]).booleanValue();
                boolean zBooleanValue15 = ((Boolean) objArr[15]).booleanValue();
                String str4 = (String) objArr[16];
                int i19 = 2 % 2;
                int i20 = getInterfaceDescriptor + 125;
                extraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                getByteBuffer<isJSONTypeIgnore> getbytebufferOnNavigationEvent = onNavigationEvent(typeUtils12, zBooleanValue10, zBooleanValue11, getcolorinteger2, rememberLottieCompositionKtlottieComposition12, uTF8Decoder2, jLongValue2, str3, zBooleanValue12, zBooleanValue13, onnavigationevent2, function12, function02, zBooleanValue14, zBooleanValue15, str4, zBooleanValue9);
                int i22 = getInterfaceDescriptor + 117;
                extraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                return getbytebufferOnNavigationEvent;
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return onTransact(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ writeRaw onExtraCallback(getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, boolean z, boolean z2, shortValue.onNavigationEvent onnavigationevent, Function1 function1, Function0 function0, long j, boolean z3, String str, boolean z4, String str2, boolean z5, boolean z6, boolean z7) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        writeRaw writerawIAuthTabCallback = IAuthTabCallback(getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, z, z2, onnavigationevent, function1, function0, j, z3, str, z4, str2, z5, z6, z7);
        int i4 = extraCallbackWithResult + 49;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return writerawIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallback(getTimestampBytes gettimestampbytes, getColorInteger getcolorinteger) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(gettimestampbytes, getcolorinteger);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = extraCallbackWithResult + 125;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(getColorInteger getcolorinteger, getHostnameVerifierokhttp gethostnameverifierokhttp, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        deserializeIp deserializeip = (deserializeIp) onExtraCallback(new Object[]{getcolorinteger, gethostnameverifierokhttp, isjsontypeignore}, lt.40.onExtraCallbackWithResult(), 644952919, iOnExtraCallbackWithResult, -644952910, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
        int i4 = getInterfaceDescriptor + 61;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public static /* synthetic */ serializeRaw onExtraCallbackWithResult(getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, boolean z, shortValue.onNavigationEvent onnavigationevent, boolean z2, boolean z3, String str, Function1 function1, boolean z4, Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 103;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawOnWarmupCompleted = onWarmupCompleted(getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, z, onnavigationevent, z2, z3, str, function1, z4, bool);
        int i4 = getInterfaceDescriptor + 19;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return serializerawOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = extraCallbackWithResult + 53;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        extraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            getInterfaceDescriptor(function1, obj);
            obj2.hashCode();
            throw null;
        }
        deserializeIp interfaceDescriptor = getInterfaceDescriptor(function1, obj);
        int i3 = getInterfaceDescriptor + 5;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return interfaceDescriptor;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, obj);
        int i4 = getInterfaceDescriptor + 79;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ serializeRaw onNavigationEvent(getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, boolean z, shortValue.onNavigationEvent onnavigationevent, boolean z2, boolean z3, String str, Function1 function1, boolean z4, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, z, onnavigationevent, z2, z3, str, function1, z4, isjsontypeignore);
        }
        onExtraCallback(getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, z, onnavigationevent, z2, z3, str, function1, z4, isjsontypeignore);
        throw null;
    }

    public static /* synthetic */ serializeRaw onNavigationEvent(boolean z, TypeUtils1 typeUtils1, boolean z2, boolean z3, getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, String str, boolean z4, boolean z5, shortValue.onNavigationEvent onnavigationevent, Function1 function1, Function0 function0, boolean z6, boolean z7, String str2, Result result) {
        serializeRaw serializeraw;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {Boolean.valueOf(z), typeUtils1, Boolean.valueOf(z2), Boolean.valueOf(z3), getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, Long.valueOf(j), str, Boolean.valueOf(z4), Boolean.valueOf(z5), onnavigationevent, function1, function0, Boolean.valueOf(z6), Boolean.valueOf(z7), str2, result};
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            serializeraw = (serializeRaw) onExtraCallback(objArr, lt.40.onExtraCallbackWithResult(), -70616043, iOnExtraCallbackWithResult, 70616049, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
            int i3 = 52 / 0;
        } else {
            Object[] objArr2 = {Boolean.valueOf(z), typeUtils1, Boolean.valueOf(z2), Boolean.valueOf(z3), getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, Long.valueOf(j), str, Boolean.valueOf(z4), Boolean.valueOf(z5), onnavigationevent, function1, function0, Boolean.valueOf(z6), Boolean.valueOf(z7), str2, result};
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            serializeraw = (serializeRaw) onExtraCallback(objArr2, lt.40.onExtraCallbackWithResult(), -70616043, iOnExtraCallbackWithResult2, 70616049, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
        }
        int i4 = getInterfaceDescriptor + 45;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return serializeraw;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getTimestampBytes gettimestampbytes = (getTimestampBytes) objArr[0];
        getColorInteger getcolorinteger = (getColorInteger) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(gettimestampbytes, getcolorinteger, th);
        int i4 = extraCallbackWithResult + 39;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ TypeUtils2 onWarmupCompleted(getColorInteger getcolorinteger, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TypeUtils2 typeUtils2OnExtraCallbackWithResult = onExtraCallbackWithResult(getcolorinteger, isjsontypeignore);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return typeUtils2OnExtraCallbackWithResult;
    }

    public static /* synthetic */ serializeRaw onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return writeTypedObject(function1, obj);
        }
        writeTypedObject(function1, obj);
        throw null;
    }

    @Inject
    public getColorInteger(@NotNull Context context, @NotNull r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58 r8lambdaj8wxkoyvtumu6wceutecw9ckl58, @NotNull resolveResourcePath resolveresourcepath, @NotNull resolveThemeAttribute resolvethemeattribute) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(r8lambdaj8wxkoyvtumu6wceutecw9ckl58, "");
        Intrinsics.checkNotNullParameter(resolveresourcepath, "");
        Intrinsics.checkNotNullParameter(resolvethemeattribute, "");
        this.onExtraCallbackWithResult = context;
        this.onTransact = r8lambdaj8wxkoyvtumu6wceutecw9ckl58;
        this.onWarmupCompleted = resolveresourcepath;
        this.IAuthTabCallback = resolvethemeattribute;
        this.asInterface = new AtomicReference<>();
        this.IAuthTabCallbackStub = new WeakReference<>(null);
    }

    private final boolean onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            accessMapSafely.onNavigationEvent.onExtraCallbackWithResult();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = accessMapSafely.onNavigationEvent.onExtraCallbackWithResult();
        int i3 = extraCallbackWithResult + 53;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super isJSONTypeIgnore>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = -4066844247111809852L;
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ FragmentActivity $context;
        final /* synthetic */ TypeUtils1 $faceAuthServiceType;
        final /* synthetic */ long $funnelId;
        final /* synthetic */ getBacktraceNote<Boolean, Boolean, Boolean, writeRaw<? extends isJSONTypeIgnore>> $normalAuth;
        final /* synthetic */ UTF8Decoder $passwordType;
        final /* synthetic */ boolean $skipBiometric;
        final /* synthetic */ String $uuid;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        static final class onExtraCallbackWithResult extends ContinuationImpl {
            Object L$0;
            Object L$1;
            boolean Z$0;
            boolean Z$1;
            int label;
            /* synthetic */ Object result;

            onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(access13800Var);
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return onExtraCallback.onExtraCallbackWithResult(null, null, false, false, this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(FragmentActivity fragmentActivity, TypeUtils1 typeUtils1, UTF8Decoder uTF8Decoder, long j, String str, getBacktraceNote<? super Boolean, ? super Boolean, ? super Boolean, ? extends writeRaw<? extends isJSONTypeIgnore>> getbacktracenote, boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = fragmentActivity;
            this.$faceAuthServiceType = typeUtils1;
            this.$passwordType = uTF8Decoder;
            this.$funnelId = j;
            this.$uuid = str;
            this.$normalAuth = getbacktracenote;
            this.$skipBiometric = z;
        }

        public static final /* synthetic */ Object onExtraCallbackWithResult(Object obj, getBacktraceNote getbacktracenote, boolean z, boolean z2, access13800 access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(obj, getbacktracenote, z, z2, access13800Var);
            int i4 = onExtraCallback + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
            return objOnNavigationEvent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$context, this.$faceAuthServiceType, this.$passwordType, this.$funnelId, this.$uuid, this.$normalAuth, this.$skipBiometric, access13800Var);
            int i2 = onExtraCallback + 3;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super isJSONTypeIgnore> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 44 / 0;
            return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $10 + 47;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45812), 84 - KeyEvent.getDeadChar(0, 0), 21233 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 19 - ((Process.getThreadPriority(0) + 20) >> 6), (-16768408) - Color.rgb(0, 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $10 + 13;
                    $11 = i6 % 128;
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

        /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final java.lang.Object onNavigationEvent(java.lang.Object r7, o.getBacktraceNote<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.Boolean, ? extends o.writeRaw<? extends o.isJSONTypeIgnore>> r8, boolean r9, boolean r10, o.access13800<? super o.isJSONTypeIgnore> r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getColorInteger.onExtraCallback.onNavigationEvent(java.lang.Object, o.getBacktraceNote, boolean, boolean, o.access13800):java.lang.Object");
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
        
            if (r15 == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0130, code lost:
        
            if (r15 == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x01c6, code lost:
        
            if (r15 == r1) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0176  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 553
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getColorInteger.onExtraCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asBinder ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 41;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 29;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 45812), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 83, View.resolveSizeAndState(0, 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - Process.getGidForName("")), ImageFormat.getBitsPerPixel(0) + 20, 8809 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public getByteBuffer<isJSONTypeIgnore> onWarmupCompleted(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull UTF8Decoder uTF8Decoder, long j, boolean z, boolean z2, boolean z3, boolean z4, @Nullable shortValue.onNavigationEvent onnavigationevent, boolean z5, @Nullable Function0<Unit> function0, boolean z6, @Nullable TypeUtils1 typeUtils1, boolean z7, @Nullable String str, @NotNull Function1<? super TypeUtils7, Unit> function1) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {this, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), onnavigationevent, Boolean.valueOf(z5), function0, Boolean.valueOf(z6), typeUtils1, Boolean.valueOf(z7), str, function1, string, false, 65536, null};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        getByteBuffer<isJSONTypeIgnore> getbytebuffer = (getByteBuffer) onExtraCallback(objArr, lt.40.onExtraCallbackWithResult(), -312395825, iOnExtraCallbackWithResult, 312395828, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
        int i4 = extraCallbackWithResult + 55;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return getbytebuffer;
        }
        throw null;
    }

    private static final getByteBuffer<isJSONTypeIgnore> onNavigationEvent(getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, boolean z, boolean z2, shortValue.onNavigationEvent onnavigationevent, Function1<? super TypeUtils7, Unit> function1, Function0<Unit> function0, long j, boolean z3, String str, boolean z4, String str2, boolean z5, boolean z6, boolean z7) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getByteBuffer<isJSONTypeIgnore> getbytebufferOnExtraCallback = getcolorinteger.onExtraCallback(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, z6, z, z2, onnavigationevent, function1, function0, j, z3, str, z5, z4, str2, z7);
        int i4 = extraCallbackWithResult + 99;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return getbytebufferOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getByteBuffer<isJSONTypeIgnore> onNavigationEvent(TypeUtils1 typeUtils1, boolean z, boolean z2, final getColorInteger getcolorinteger, final RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, final UTF8Decoder uTF8Decoder, final long j, final String str, final boolean z3, final boolean z4, final shortValue.onNavigationEvent onnavigationevent, final Function1<? super TypeUtils7, Unit> function1, final Function0<Unit> function0, final boolean z5, final boolean z6, final String str2, boolean z7) throws Throwable {
        int i = 2 % 2;
        if (typeUtils1 == null) {
            int i2 = extraCallbackWithResult + 125;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            getByteBuffer<isJSONTypeIgnore> getbytebufferOnNavigationEvent = onNavigationEvent(getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, z3, z4, onnavigationevent, function1, function0, j, z5, str, z6, str2, z, z7, z2);
            int i4 = extraCallbackWithResult + 117;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                return getbytebufferOnNavigationEvent;
            }
            throw null;
        }
        Object[] objArr = {getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, typeUtils1, Boolean.valueOf(z7), Long.valueOf(j), str, new getBacktraceNote() { // from class: viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda17
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return getColorInteger.onExtraCallback(this.f$0, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, z3, z4, onnavigationevent, function1, function0, j, z5, str, z6, str2, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
            }
        }};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        getByteBuffer<isJSONTypeIgnore> getbytebufferIAuthTabCallbackStub = ((writeRaw) onExtraCallback(objArr, lt.40.onExtraCallbackWithResult(), 153202412, iOnExtraCallbackWithResult, -153202405, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())).IAuthTabCallbackStub();
        Intrinsics.checkNotNull(getbytebufferIAuthTabCallbackStub);
        return getbytebufferIAuthTabCallbackStub;
    }

    private static final writeRaw IAuthTabCallback(getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, boolean z, boolean z2, shortValue.onNavigationEvent onnavigationevent, Function1 function1, Function0 function0, long j, boolean z3, String str, boolean z4, String str2, boolean z5, boolean z6, boolean z7) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        writeRaw writerawAccess100 = onNavigationEvent(getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, z, z2, onnavigationevent, function1, function0, j, z3, str, z4, str2, z5, z6, z7).access100();
        Intrinsics.checkNotNullExpressionValue(writerawAccess100, "");
        int i4 = getInterfaceDescriptor + 3;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return writerawAccess100;
    }

    private static final serializeRaw onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 49;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (serializeRaw) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final serializeRaw onExtraCallback(TypeUtils1 typeUtils1, boolean z, boolean z2, getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, String str, boolean z3, boolean z4, shortValue.onNavigationEvent onnavigationevent, Function1 function1, Function0 function0, boolean z5, boolean z6, String str2, Result result) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(result);
        if (!Result.onNavigationEvent(result.onNavigationEvent())) {
            return onNavigationEvent(typeUtils1, z, z2, getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, str, z3, z4, onnavigationevent, function1, function0, z5, z6, str2, false);
        }
        Object objOnNavigationEvent = result.onNavigationEvent();
        ResultKt.onNavigationEvent(objOnNavigationEvent);
        getByteBuffer getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(objOnNavigationEvent);
        Intrinsics.checkNotNull(getbytebufferOnWarmupCompleted);
        int i4 = getInterfaceDescriptor + 27;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return getbytebufferOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final serializeRaw access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (serializeRaw) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 15;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getTimestampBytes gettimestampbytes = (getTimestampBytes) objArr[0];
        getColorInteger getcolorinteger = (getColorInteger) objArr[1];
        isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Result.Companion companion = Result.Companion;
            gettimestampbytes.onExtraCallback(Result.IAuthTabCallback(Result.constructor-impl(isjsontypeignore)));
            gettimestampbytes.onExtraCallback();
            setSupportImageTintList.onNavigationEvent(getcolorinteger.asInterface, gettimestampbytes, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i3 = getInterfaceDescriptor + 121;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        Result.Companion companion2 = Result.Companion;
        gettimestampbytes.onExtraCallback(Result.IAuthTabCallback(Result.constructor-impl(isjsontypeignore)));
        gettimestampbytes.onExtraCallback();
        setSupportImageTintList.onNavigationEvent(getcolorinteger.asInterface, gettimestampbytes, (Object) null);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final o.getByteBuffer<o.isJSONTypeIgnore> onWarmupCompleted(final o.RememberLottieCompositionKtlottieComposition1 r38, final o.UTF8Decoder r39, final long r40, final boolean r42, final boolean r43, boolean r44, final boolean r45, final o.shortValue.onNavigationEvent r46, final boolean r47, final kotlin.jvm.functions.Function0<kotlin.Unit> r48, final boolean r49, final o.TypeUtils1 r50, final boolean r51, final java.lang.String r52, final kotlin.jvm.functions.Function1<? super o.TypeUtils7, kotlin.Unit> r53, final java.lang.String r54, final boolean r55) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getColorInteger.onWarmupCompleted(o.RememberLottieCompositionKtlottieComposition1, o.UTF8Decoder, long, boolean, boolean, boolean, boolean, o.shortValue$onNavigationEvent, boolean, kotlin.jvm.functions.Function0, boolean, o.TypeUtils1, boolean, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, boolean):o.getByteBuffer");
    }

    private static final Unit onWarmupCompleted(getTimestampBytes gettimestampbytes, getColorInteger getcolorinteger, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Result.Companion companion = Result.Companion;
        Intrinsics.checkNotNull(th);
        gettimestampbytes.onExtraCallback(Result.IAuthTabCallback(Result.constructor-impl(ResultKt.createFailure(th))));
        gettimestampbytes.onExtraCallback();
        setSupportImageTintList.onNavigationEvent(getcolorinteger.asInterface, gettimestampbytes, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 31;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(getTimestampBytes gettimestampbytes, getColorInteger getcolorinteger) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (gettimestampbytes.onNavigationEvent()) {
            return;
        }
        Result.Companion companion = Result.Companion;
        Object[] objArr = new Object[1];
        b((byte) ((-16777216) - Color.rgb(0, 0, 0)), (short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-1443103259) - ImageFormat.getBitsPerPixel(0), (-86) - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.resolveSize(0, 0) + 453459073, objArr);
        gettimestampbytes.onExtraCallback(Result.IAuthTabCallback(Result.constructor-impl(ResultKt.createFailure(new DimensionPropConverter(((String) objArr[0]).intern())))));
        gettimestampbytes.onExtraCallback();
        setSupportImageTintList.onNavigationEvent(getcolorinteger.asInterface, gettimestampbytes, (Object) null);
        int i4 = getInterfaceDescriptor + 49;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        byte b2;
        long j2;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackStubProxy)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Gravity.getAbsoluteGravity(0, 0)), 43 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 22439 - View.MeasureSpec.getSize(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = access100;
                long j3 = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 103;
                        $11 = i8 % 128;
                        int i9 = i8 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.green(0)), (ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1)) + 54, 2167 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -299036574, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i7++;
                        i5 = 2;
                        j3 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $10 + 111;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte[] bArr3 = access100;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallbackDefault)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43423), 41 - TextUtils.indexOf((CharSequence) "", '0', 0), 22439 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b2 = (byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L));
                        j2 = IAuthTabCallbackStubProxy / (-4629411779493505016L);
                    } else {
                        byte[] bArr4 = access100;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallbackDefault)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 43424), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41, 22439 - (ViewConfiguration.getPressedStateDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            b2 = (byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L));
                            j2 = IAuthTabCallbackStubProxy ^ (-4629411779493505016L);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iIntValue = (byte) (b2 + ((int) j2));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallback_Parcel[i + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallbackDefault ^ j));
                if (z) {
                    int i12 = $11 + 83;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i4;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(access000), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 86, 9567 - View.getDefaultSize(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = access100;
                if (bArr5 != null) {
                    int i14 = $11 + 55;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr6[i16] = (byte) (bArr5[i16] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i17 = $10 + 71;
                    int i18 = i17 % 128;
                    $11 = i18;
                    int i19 = i17 % 2;
                    if (z2) {
                        int i20 = i18 + 55;
                        $10 = i20 % 128;
                        int i21 = i20 % 2;
                        byte[] bArr7 = access100;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback_Parcel;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[1];
        UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[2];
        TypeUtils1 typeUtils1 = (TypeUtils1) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        long jLongValue = ((Number) objArr[5]).longValue();
        String str = (String) objArr[6];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[7];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = rememberLottieCompositionKtlottieComposition1.getActivity();
        if (activity == null) {
            Object[] objArr2 = new Object[1];
            a(new char[]{49547, 22419, 64801, 523, 1079, 27464, 56927, 28798, 20138, 18616, 38683, 63875, 19600, 18624, 19870, 16632, 5590, 12804, 2762, 35690, 56088, 64355, 49921, 52610, 41026, 42160, 30815, 5266, 50659, 28068, 58275, 39402, 64454, 25992, 23879}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
            writeRaw writerawOnExtraCallbackWithResult = writeRaw.onExtraCallbackWithResult(new IllegalStateException(((String) objArr2[0]).intern()));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            return writerawOnExtraCallbackWithResult;
        }
        writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback(putChannelInfo.onExtraCallback(), new onExtraCallback(activity, typeUtils1, uTF8Decoder, jLongValue, str, getbacktracenote, zBooleanValue, null));
        int i4 = extraCallbackWithResult + 7;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return writerawIAuthTabCallback;
    }

    public getByteBuffer<isJSONTypeIgnore> onExtraCallback(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull UTF8Decoder uTF8Decoder, long j, @Nullable shortValue.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        getByteBuffer<isJSONTypeIgnore> getbytebufferOnNavigationEvent = onNavigationEvent(this, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, false, false, false, onnavigationevent, (Function1) null, (Function0) null, j, false, string, false, false, (String) null, false, 31452, (Object) null);
        int i4 = getInterfaceDescriptor + 123;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return getbytebufferOnNavigationEvent;
    }

    static /* synthetic */ getByteBuffer onNavigationEvent(getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, boolean z, boolean z2, boolean z3, shortValue.onNavigationEvent onnavigationevent, Function1 function1, Function0 function0, long j, boolean z4, String str, boolean z5, boolean z6, String str2, boolean z7, int i, Object obj) {
        boolean z8;
        shortValue.onNavigationEvent onnavigationevent2;
        Function0 function02;
        long j2;
        boolean z9;
        boolean z10;
        String str3;
        int i2 = 2 % 2;
        boolean z11 = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            int i3 = extraCallbackWithResult + 85;
            getInterfaceDescriptor = i3 % 128;
            z8 = i3 % 2 != 0;
        } else {
            z8 = z2;
        }
        boolean z12 = (i & 16) != 0 ? false : z3;
        if ((i & 32) != 0) {
            int i4 = getInterfaceDescriptor + 63;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            onnavigationevent2 = null;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        Function1 function12 = (i & 64) != 0 ? new Function1() { // from class: viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda18
            public final Object invoke(Object obj2) {
                int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                return (Unit) getColorInteger.onExtraCallback(new Object[]{(TypeUtils7) obj2}, lt.40.onExtraCallbackWithResult(), 1640522212, iOnExtraCallbackWithResult, -1640522212, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
            }
        } : function1;
        if ((i & 128) != 0) {
            int i5 = getInterfaceDescriptor + 109;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            function02 = null;
        } else {
            function02 = function0;
        }
        if ((i & 256) != 0) {
            int i7 = extraCallbackWithResult + 115;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i & 512) != 0) {
            int i9 = getInterfaceDescriptor + 33;
            extraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            z9 = false;
        } else {
            z9 = z4;
        }
        boolean z13 = (i & 2048) != 0 ? false : z5;
        if ((i & 4096) != 0) {
            int i11 = extraCallbackWithResult + 89;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % 2;
            z10 = false;
        } else {
            z10 = z6;
        }
        if ((i & 8192) != 0) {
            int i13 = getInterfaceDescriptor + 117;
            extraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            str3 = null;
        } else {
            str3 = str2;
        }
        return getcolorinteger.onExtraCallback(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, z11, z8, z12, onnavigationevent2, function12, function02, j2, z9, str, z13, z10, str3, (i & 16384) != 0 ? false : z7);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TypeUtils7 typeUtils7 = (TypeUtils7) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(typeUtils7, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(typeUtils7, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 79;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final serializeRaw extraCallbackWithResult(Function1 function1, Object obj) {
        serializeRaw serializeraw;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            serializeraw = (serializeRaw) function1.invoke(obj);
            int i3 = 97 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            serializeraw = (serializeRaw) function1.invoke(obj);
        }
        int i4 = extraCallbackWithResult + 31;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return serializeraw;
    }

    private static final serializeRaw writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        serializeRaw serializeraw = (serializeRaw) function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 85;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serializeraw;
    }

    private static final serializeRaw onWarmupCompleted(getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, boolean z, shortValue.onNavigationEvent onnavigationevent, boolean z2, boolean z3, String str, Function1 function1, boolean z4, Boolean bool) {
        getByteBuffer getbytebufferOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bool, "");
            getbytebufferOnExtraCallbackWithResult = r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.onExtraCallbackWithResult(getcolorinteger.onTransact, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, false, z, null, null, onnavigationevent, z2, false, z3, str, function1, z4, 21845, null);
        } else {
            Intrinsics.checkNotNullParameter(bool, "");
            getbytebufferOnExtraCallbackWithResult = r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.onExtraCallbackWithResult(getcolorinteger.onTransact, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, false, z, null, null, onnavigationevent, z2, false, z3, str, function1, z4, 616, null);
        }
        int i3 = getInterfaceDescriptor + 107;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return getbytebufferOnExtraCallbackWithResult;
    }

    private static final serializeRaw onExtraCallback(final getColorInteger getcolorinteger, final RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, final UTF8Decoder uTF8Decoder, final long j, final boolean z, final shortValue.onNavigationEvent onnavigationevent, final boolean z2, final boolean z3, final String str, final Function1 function1, final boolean z4, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isjsontypeignore, "");
        if (!isKotlin.IAuthTabCallback(isjsontypeignore)) {
            return getByteBuffer.onWarmupCompleted(isjsontypeignore);
        }
        minFresh.onNavigationEvent(getcolorinteger.onExtraCallbackWithResult, noStore.Companion.onWarmupCompleted());
        setTid<Boolean> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        getcolorinteger.onTransact.onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1, settidOnNavigationEvent);
        getByteBuffer getbytebufferOnExtraCallback = settidOnNavigationEvent.onExtraCallback(1L);
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return getColorInteger.onExtraCallbackWithResult(this.f$0, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, z, onnavigationevent, z2, z3, str, function1, z4, (Boolean) obj);
            }
        };
        getByteBuffer getbytebufferIAuthTabCallback = getbytebufferOnExtraCallback.IAuthTabCallback(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda20
            public final Object apply(Object obj) {
                return getColorInteger.onWarmupCompleted(function12, obj);
            }
        });
        int i4 = getInterfaceDescriptor + 49;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return getbytebufferIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final o.getByteBuffer<o.isJSONTypeIgnore> onExtraCallback(final o.RememberLottieCompositionKtlottieComposition1 r33, final o.UTF8Decoder r34, boolean r35, boolean r36, final boolean r37, final o.shortValue.onNavigationEvent r38, final kotlin.jvm.functions.Function1<? super o.TypeUtils7, kotlin.Unit> r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, final long r41, final boolean r43, final java.lang.String r44, final boolean r45, boolean r46, java.lang.String r47, final boolean r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getColorInteger.onExtraCallback(o.RememberLottieCompositionKtlottieComposition1, o.UTF8Decoder, boolean, boolean, boolean, o.shortValue$onNavigationEvent, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, long, boolean, java.lang.String, boolean, boolean, java.lang.String, boolean):o.getByteBuffer");
    }

    private static final deserializeIp getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 59;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = getInterfaceDescriptor + 45;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return deserializeip;
    }

    private static final deserializeIp onExtraCallback(getColorInteger getcolorinteger, getHostnameVerifierokhttp gethostnameverifierokhttp, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isjsontypeignore, "");
        writeRaw writeraw = (writeRaw) resolveThemeAttribute.onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{getcolorinteger.IAuthTabCallback, isjsontypeignore, gethostnameverifierokhttp}, PushInfo.Companion.onExtraCallback(), -1009254412, PushInfo.Companion.onExtraCallback(), 1009254415);
        int i4 = getInterfaceDescriptor + 41;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return writeraw;
    }

    public writeRaw<TypeUtils2> IAuthTabCallback(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull UTF8Decoder uTF8Decoder, long j, @Nullable final getHostnameVerifierokhttp gethostnameverifierokhttp, boolean z, boolean z2, @Nullable shortValue.onNavigationEvent onnavigationevent, boolean z3, boolean z4, @Nullable String str, @NotNull Function1<? super TypeUtils7, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        writeRaw writerawAccess100 = shortValue.IAuthTabCallback(this, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, z, z2, false, false, onnavigationevent, false, (Function0) null, z3, (TypeUtils1) null, z4, str, function1, 2912, (Object) null).access100();
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return getColorInteger.IAuthTabCallback(this.f$0, gethostnameverifierokhttp, (isJSONTypeIgnore) obj);
            }
        };
        writeRaw<TypeUtils2> writerawOnExtraCallbackWithResult = writerawAccess100.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda1
            public final Object apply(Object obj) {
                Object[] objArr = {function12, obj};
                int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                return (deserializeIp) getColorInteger.onExtraCallback(objArr, lt.40.onExtraCallbackWithResult(), 1525908171, iOnExtraCallbackWithResult, -1525908166, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
        int i2 = extraCallbackWithResult + 55;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return writerawOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final deserializeIp IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 73;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getColorInteger getcolorinteger = (getColorInteger) objArr[0];
        getHostnameVerifierokhttp gethostnameverifierokhttp = (getHostnameVerifierokhttp) objArr[1];
        isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isjsontypeignore, "");
        writeRaw<TypeUtils2> writerawOnWarmupCompleted = getcolorinteger.IAuthTabCallback.onWarmupCompleted(isjsontypeignore, gethostnameverifierokhttp);
        int i4 = getInterfaceDescriptor + 5;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return writerawOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.writeRaw<o.TypeUtils2> onNavigationEvent(@org.jetbrains.annotations.NotNull o.RememberLottieCompositionKtlottieComposition1 r22, @org.jetbrains.annotations.NotNull o.UTF8Decoder r23, long r24, @org.jetbrains.annotations.Nullable final o.getHostnameVerifierokhttp r26, boolean r27, boolean r28, boolean r29, boolean r30, @org.jetbrains.annotations.Nullable java.lang.String r31, @org.jetbrains.annotations.Nullable o.decodeArrayLoop r32, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super o.TypeUtils7, kotlin.Unit> r33) {
        /*
            r21 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getColorInteger.getInterfaceDescriptor
            int r1 = r1 + 81
            int r2 = r1 % 128
            o.getColorInteger.extraCallbackWithResult = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            r3 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            r4 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            r14 = r33
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            if (r32 == 0) goto L23
            r2 = 1
        L20:
            r20 = r2
            goto L25
        L23:
            r2 = 0
            goto L20
        L25:
            if (r32 == 0) goto L36
            int r2 = o.getColorInteger.getInterfaceDescriptor
            int r2 = r2 + 79
            int r5 = r2 % 128
            o.getColorInteger.extraCallbackWithResult = r5
            int r2 = r2 % r0
            java.lang.String r0 = r32.onExtraCallback()
            if (r0 != 0) goto L41
        L36:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L41:
            r19 = r0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r27
            r8 = r28
            r14 = r29
            r16 = r30
            r17 = r31
            r18 = r33
            o.getByteBuffer r0 = r2.onWarmupCompleted(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            o.writeRaw r0 = r0.access100()
            viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda16 r2 = new viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda16
            viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda15 r3 = new viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda15
            r4 = r21
            r5 = r26
            r3.<init>()
            r2.<init>()
            o.writeRaw r0 = r0.onExtraCallbackWithResult(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getColorInteger.onNavigationEvent(o.RememberLottieCompositionKtlottieComposition1, o.UTF8Decoder, long, o.getHostnameVerifierokhttp, boolean, boolean, boolean, boolean, java.lang.String, o.decodeArrayLoop, kotlin.jvm.functions.Function1):o.writeRaw");
    }

    private static final TypeUtils2 onExtraCallbackWithResult(getColorInteger getcolorinteger, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isjsontypeignore, "");
        TypeUtils2 typeUtils2IAuthTabCallback = getcolorinteger.IAuthTabCallback.IAuthTabCallback(isjsontypeignore);
        int i4 = extraCallbackWithResult + 111;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return typeUtils2IAuthTabCallback;
    }

    private static final TypeUtils2 readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        TypeUtils2 typeUtils2 = (TypeUtils2) function1.invoke(obj);
        int i4 = extraCallbackWithResult + 5;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return typeUtils2;
    }

    public writeRaw<TypeUtils2> onWarmupCompleted(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull UTF8Decoder uTF8Decoder, long j, boolean z, boolean z2, @Nullable shortValue.onNavigationEvent onnavigationevent, @NotNull Function1<? super TypeUtils7, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        getByteBuffer getbytebufferIAuthTabCallback = shortValue.IAuthTabCallback(this, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, z, z2, false, false, onnavigationevent, false, (Function0) null, false, (TypeUtils1) null, false, (String) null, function1, 16224, (Object) null);
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return getColorInteger.onWarmupCompleted(this.f$0, (isJSONTypeIgnore) obj);
            }
        };
        writeRaw<TypeUtils2> writerawExtraCallback = getbytebufferIAuthTabCallback.asInterface(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.AuthenticatorImpl$$ExternalSyntheticLambda3
            public final Object apply(Object obj) {
                return getColorInteger.IAuthTabCallbackStub(function12, obj);
            }
        }).extraCallback();
        Intrinsics.checkNotNullExpressionValue(writerawExtraCallback, "");
        int i2 = extraCallbackWithResult + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return writerawExtraCallback;
    }

    public writeRaw<TypeUtils2> onExtraCallbackWithResult(@NotNull isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isjsontypeignore, "");
        Object obj = null;
        writeRaw<TypeUtils2> writerawOnWarmupCompleted = resolveThemeAttribute.onWarmupCompleted(this.IAuthTabCallback, isjsontypeignore, null, 2, null);
        int i4 = getInterfaceDescriptor + 121;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return writerawOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getTimestampBytes gettimestampbytes, getColorInteger getcolorinteger, Throwable th) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(new Object[]{gettimestampbytes, getcolorinteger, th}, lt.40.onExtraCallbackWithResult(), -560330888, iOnExtraCallbackWithResult, 560330889, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }

    public static /* synthetic */ deserializeIp onExtraCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (deserializeIp) onExtraCallback(new Object[]{function1, obj}, lt.40.onExtraCallbackWithResult(), 1525908171, iOnExtraCallbackWithResult, -1525908166, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }

    public static /* synthetic */ serializeRaw IAuthTabCallback(TypeUtils1 typeUtils1, boolean z, boolean z2, getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, String str, boolean z3, boolean z4, shortValue.onNavigationEvent onnavigationevent, Function1 function1, Function0 function0, boolean z5, boolean z6, String str2, Result result) {
        Object[] objArr = {typeUtils1, Boolean.valueOf(z), Boolean.valueOf(z2), getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, Long.valueOf(j), str, Boolean.valueOf(z3), Boolean.valueOf(z4), onnavigationevent, function1, function0, Boolean.valueOf(z5), Boolean.valueOf(z6), str2, result};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (serializeRaw) onExtraCallback(objArr, lt.40.onExtraCallbackWithResult(), -138698563, iOnExtraCallbackWithResult, 138698571, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onNavigationEvent(TypeUtils7 typeUtils7) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(new Object[]{typeUtils7}, lt.40.onExtraCallbackWithResult(), 1640522212, iOnExtraCallbackWithResult, -1640522212, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }

    static /* synthetic */ getByteBuffer onWarmupCompleted(getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, boolean z, boolean z2, boolean z3, boolean z4, shortValue.onNavigationEvent onnavigationevent, boolean z5, Function0 function0, boolean z6, TypeUtils1 typeUtils1, boolean z7, String str, Function1 function1, String str2, boolean z8, int i, Object obj) {
        Object[] objArr = {getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), onnavigationevent, Boolean.valueOf(z5), function0, Boolean.valueOf(z6), typeUtils1, Boolean.valueOf(z7), str, function1, str2, Boolean.valueOf(z8), Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (getByteBuffer) onExtraCallback(objArr, lt.40.onExtraCallbackWithResult(), -312395825, iOnExtraCallbackWithResult, 312395828, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }

    private static final serializeRaw onWarmupCompleted(boolean z, TypeUtils1 typeUtils1, boolean z2, boolean z3, getColorInteger getcolorinteger, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, String str, boolean z4, boolean z5, shortValue.onNavigationEvent onnavigationevent, Function1 function1, Function0 function0, boolean z6, boolean z7, String str2, Result result) {
        Object[] objArr = {Boolean.valueOf(z), typeUtils1, Boolean.valueOf(z2), Boolean.valueOf(z3), getcolorinteger, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, Long.valueOf(j), str, Boolean.valueOf(z4), Boolean.valueOf(z5), onnavigationevent, function1, function0, Boolean.valueOf(z6), Boolean.valueOf(z7), str2, result};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (serializeRaw) onExtraCallback(objArr, lt.40.onExtraCallbackWithResult(), -70616043, iOnExtraCallbackWithResult, 70616049, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(getTimestampBytes gettimestampbytes, getColorInteger getcolorinteger, isJSONTypeIgnore isjsontypeignore) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(new Object[]{gettimestampbytes, getcolorinteger, isjsontypeignore}, lt.40.onExtraCallbackWithResult(), -1694234468, iOnExtraCallbackWithResult, 1694234472, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }

    private final writeRaw<isJSONTypeIgnore> onExtraCallbackWithResult(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, TypeUtils1 typeUtils1, boolean z, long j, String str, getBacktraceNote<? super Boolean, ? super Boolean, ? super Boolean, ? extends writeRaw<? extends isJSONTypeIgnore>> getbacktracenote) {
        Object[] objArr = {this, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, typeUtils1, Boolean.valueOf(z), Long.valueOf(j), str, getbacktracenote};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (writeRaw) onExtraCallback(objArr, lt.40.onExtraCallbackWithResult(), 153202412, iOnExtraCallbackWithResult, -153202405, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }

    private static final deserializeIp onNavigationEvent(getColorInteger getcolorinteger, getHostnameVerifierokhttp gethostnameverifierokhttp, isJSONTypeIgnore isjsontypeignore) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (deserializeIp) onExtraCallback(new Object[]{getcolorinteger, gethostnameverifierokhttp, isjsontypeignore}, lt.40.onExtraCallbackWithResult(), 644952919, iOnExtraCallbackWithResult, -644952910, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }

    private static final Unit asInterface(TypeUtils7 typeUtils7) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(new Object[]{typeUtils7}, lt.40.onExtraCallbackWithResult(), -1701048578, iOnExtraCallbackWithResult, 1701048580, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }

    static void IAuthTabCallback() {
        asBinder = -8176210145632851293L;
        IAuthTabCallbackDefault = -230434165;
        IAuthTabCallbackStubProxy = -1538795434;
        access000 = 1086266347;
        access100 = new byte[]{14, 1, -16, 14, 14, -25, 36, -21, -14, -1, -10, 7, -16, -10, 14, 47, -18, -50, 25, -10, -13, 0, -27, 42, -29, -4, -9, 28, 73, -6, -63, -7, 27, -10, -14, -3, 14, 1, -11, -4, -9, 28, 54, -74, -7, 27, -10, -14, -3, 14, 1, -11, -4, -9, 60, -63, 46, 58, -18, -49, 15, 8, 3, -10, 75, -77, -7, 27, -10, -14, -11, -12, -13, 57, -18, -33, -14, -1, -10, 7, -16, -10, 14, 47, -38, 15, -10, -16, 91, -4, -18, 18, -80, -3, 26, 17, -57, 13, 3, -5, 5, -3, 25, 10, 73, -9, -6, 12, -9, -11, 2, 13, 8, 8, 8, 8, 8};
    }
}
