package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import im.toss.core.biometric.data.ResultStatus;
import im.toss.network.throwable.TossApiCallException;
import im.toss.splittarget.spec.fsm.AppState;
import im.toss.state.spec.SessionState;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RememberLottieCompositionKtlottieComposition1;
import o.SetDetectableSize;
import o.UTF8Decoder;
import o.deserializeUriNullableCollection;
import o.drawIconBackgroundColor;
import o.isJSONTypeIgnore;
import o.resolveResourcePath;
import o.serializeRaw;
import o.shortValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.user.PasswordMatchLogRes;
import viva.republica.toss.password.PasswordFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class resolveResourcePath {
    public static final IAuthTabCallback Companion;
    private static char IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStubProxy;
    private static long access000;
    private static char access100;
    private static char asInterface;
    private static int extraCallbackWithResult;
    private static char getInterfaceDescriptor;
    private static final String onNavigationEvent;
    private static char onTransact;
    public static final int onWarmupCompleted;
    private final Context IAuthTabCallback;
    private final SessionState IAuthTabCallbackStub;
    private final r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58 asBinder;
    private final isJacksonCreator onExtraCallback;
    private final AppState onExtraCallbackWithResult;
    private static final byte[] $$a = {2, 105, -126, -86};
    private static final int $$b = 179;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int writeTypedObject = 1;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[ResultStatus.values().length];
            try {
                iArr[ResultStatus.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResultStatus.SELECTED_INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResultStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ResultStatus.USER_CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, short r7) {
        /*
            byte[] r0 = o.resolveResourcePath.$$a
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r7 = r7 + 109
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r5
            r7 = r6
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolveResourcePath.$$c(byte, int, short):java.lang.String");
    }

    static {
        extraCallbackWithResult = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{48523, 4498, 4235, 24868, 46929, 19828, 51559, 26524, 49262, 5806, 21674, 14153, 14610, 22557}, (ViewConfiguration.getScrollBarSize() >> 8) + 14, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new IAuthTabCallback(null);
        onWarmupCompleted = 8;
        int i = extraCallback + 27;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, String str, Lazy lazy, isJSONTypeIgnore isjsontypeignore) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, onnavigationevent, str, lazy, isjsontypeignore);
        int i4 = writeTypedObject + 123;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ serializeRaw IAuthTabCallback(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        serializeRaw serializerawOnExtraCallbackWithResult = onExtraCallbackWithResult(th);
        int i3 = IAuthTabCallback_Parcel + 23;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return serializerawOnExtraCallbackWithResult;
    }

    public static /* synthetic */ serializeRaw IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw interfaceDescriptor = getInterfaceDescriptor(function1, obj);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ serializeRaw IAuthTabCallback(resolveResourcePath resolveresourcepath, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, boolean z, boolean z2, String str, Function1 function1, PasswordMatchLogRes passwordMatchLogRes) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializeraw = (serializeRaw) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{resolveresourcepath, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, Long.valueOf(j), onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), str, function1, passwordMatchLogRes}, 2116887383, -2116887379, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i4 = writeTypedObject + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return serializeraw;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleOnExtraCallbackWithResult = onExtraCallbackWithResult(function1);
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return bundleOnExtraCallbackWithResult;
    }

    public static /* synthetic */ serializeRaw IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, obj);
        int i4 = writeTypedObject + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return serializerawIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{function1, obj}, -982185268, 982185276, iIAuthTabCallback, iIAuthTabCallback2);
        int i4 = writeTypedObject + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ serializeRaw asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawICustomTabsCallback = ICustomTabsCallback(function1, obj);
        int i4 = writeTypedObject + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return serializerawICustomTabsCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ serializeRaw onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawAccess100 = access100(function1, obj);
        int i4 = writeTypedObject + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return serializerawAccess100;
    }

    public static /* synthetic */ serializeRaw onExtraCallback(PasswordMatchLogRes passwordMatchLogRes) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordMatchLogRes);
        int i4 = writeTypedObject + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return serializerawOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Lazy lazy) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(lazy);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 1;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return strOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, String str, boolean z, Lazy lazy, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, resolveResourcePath resolveresourcepath, Lazy lazy2, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{Long.valueOf(j), str, Boolean.valueOf(z), lazy, rememberLottieCompositionKtlottieComposition1, resolveresourcepath, lazy2, deserializeurinullablecollection}, -864489898, 864489904, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i3 = IAuthTabCallback_Parcel + 105;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ serializeRaw onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return access000(function1, obj);
        }
        access000(function1, obj);
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, String str, resolveResourcePath resolveresourcepath, Lazy lazy, drawIconBackgroundColor drawiconbackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, onnavigationevent, str, resolveresourcepath, lazy, drawiconbackgroundcolor);
        int i4 = writeTypedObject + 49;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ serializeRaw onNavigationEvent(resolveResourcePath resolveresourcepath, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, boolean z, boolean z2, String str, Function1 function1, boolean z3, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawOnWarmupCompleted = onWarmupCompleted(resolveresourcepath, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, onnavigationevent, z, z2, str, function1, z3, th);
        int i4 = writeTypedObject + 23;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return serializerawOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 51;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[0];
        resolveResourcePath resolveresourcepath = (resolveResourcePath) objArr[1];
        Lazy lazy = (Lazy) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(rememberLottieCompositionKtlottieComposition1, resolveresourcepath, lazy, setDetectableSize);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ boolean onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = extraCallback(function1, obj);
        int i4 = writeTypedObject + 101;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return zExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        String logValue;
        String loginYN;
        int i7 = (~((~i3) | i4)) | (~(i3 | i5));
        int i8 = ~i4;
        int i9 = (~(i8 | i5)) | i3;
        int i10 = (~(i5 | i4)) | (~(i8 | (~i5))) | i3;
        int i11 = i4 + i3 + i6 + ((-737137436) * i) + ((-1840598144) * i2);
        int i12 = i11 * i11;
        int i13 = (i4 * 1252406331) + 1981669868 + (i3 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (1252407325 * i6) + ((-1820396076) * i) + (1320834432 * i2) + (i12 * (-447283200));
        switch ((((-699670985) * i4) - 818937856) + (24099949 * i3) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i6) + (1335885824 * i) + ((-1946157056) * i2) + ((-1593638912) * i12) + (i13 * i13 * 1511325696)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                long jLongValue = ((Number) objArr[0]).longValue();
                String str = (String) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                Lazy lazy = (Lazy) objArr[3];
                final RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[4];
                final resolveResourcePath resolveresourcepath = (resolveResourcePath) objArr[5];
                final Lazy lazy2 = (Lazy) objArr[6];
                int i14 = 2 % 2;
                int i15 = writeTypedObject + 23;
                IAuthTabCallback_Parcel = i15 % 128;
                int i16 = i15 % 2;
                asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
                Set setOnExtraCallbackWithResult = clearFaultAdjacentMetadata.onExtraCallbackWithResult();
                if (zBooleanValue) {
                    setOnExtraCallbackWithResult.add(isNumber.TOSS_FACE);
                }
                setOnExtraCallbackWithResult.add(isNumber.BIOMETRIC);
                setOnExtraCallbackWithResult.add(isNumber.PASSWORD);
                Set<? extends isNumber> setOnExtraCallbackWithResult2 = clearFaultAdjacentMetadata.onExtraCallbackWithResult(setOnExtraCallbackWithResult);
                createPaints createpaints = createPaints.IAuthTabCallback;
                IndicatorView indicatorViewAccess100 = createpaints.access100();
                if (indicatorViewAccess100 != null) {
                    int i17 = writeTypedObject + 19;
                    IAuthTabCallback_Parcel = i17 % 128;
                    int i18 = i17 % 2;
                    logValue = indicatorViewAccess100.getLogValue();
                } else {
                    logValue = null;
                }
                String strValueOf = String.valueOf(logValue);
                IndicatorView indicatorViewAccess1002 = createpaints.access100();
                if (indicatorViewAccess1002 != null) {
                    int i19 = writeTypedObject + 93;
                    IAuthTabCallback_Parcel = i19 % 128;
                    int i20 = i19 % 2;
                    loginYN = indicatorViewAccess1002.getLoginYN();
                } else {
                    loginYN = null;
                }
                String str2 = (String) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lazy}, -1593382375, 1593382378, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
                Object[] objArr2 = new Object[1];
                b(1943291991 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), new char[]{'\n', 50107, 25929, 31306, 31356, 16016, 8384, 61146, 29034}, new char[]{22453, 54344, 5235, 15162}, new char[]{0, 0, 0, 0}, objArr2);
                asmaplambda6.onNavigationEvent(setOnExtraCallbackWithResult2, strValueOf, ((String) objArr2[0]).intern(), jLongValue, str, (String) null, (String) null, loginYN, str2, new Function1() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        return (Unit) resolveResourcePath.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{rememberLottieCompositionKtlottieComposition1, resolveresourcepath, lazy2, (SetDetectableSize) obj}, -960490277, 960490282, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
                    }
                });
                return Unit.INSTANCE;
            case 7:
                resolveResourcePath resolveresourcepath2 = (resolveResourcePath) objArr[0];
                UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[1];
                RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition12 = (RememberLottieCompositionKtlottieComposition1) objArr[2];
                long jLongValue2 = ((Number) objArr[3]).longValue();
                shortValue.onNavigationEvent onnavigationevent = (shortValue.onNavigationEvent) objArr[4];
                String str3 = (String) objArr[5];
                boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
                Function0 function0 = (Function0) objArr[7];
                boolean zBooleanValue3 = ((Boolean) objArr[8]).booleanValue();
                boolean zBooleanValue4 = ((Boolean) objArr[9]).booleanValue();
                Function1 function1 = (Function1) objArr[10];
                Lazy lazy3 = (Lazy) objArr[11];
                drawIconBackgroundColor drawiconbackgroundcolor = (drawIconBackgroundColor) objArr[12];
                int i21 = 2 % 2;
                int i22 = IAuthTabCallback_Parcel + 55;
                writeTypedObject = i22 % 128;
                int i23 = i22 % 2;
                serializeRaw serializerawOnExtraCallback = onExtraCallback(resolveresourcepath2, uTF8Decoder, rememberLottieCompositionKtlottieComposition12, jLongValue2, onnavigationevent, str3, zBooleanValue2, function0, zBooleanValue3, zBooleanValue4, function1, lazy3, drawiconbackgroundcolor);
                int i24 = IAuthTabCallback_Parcel + 33;
                writeTypedObject = i24 % 128;
                int i25 = i24 % 2;
                return serializerawOnExtraCallback;
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(function1, obj);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return serializerawIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, String str, Lazy lazy, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, onnavigationevent, str, lazy, th);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, onnavigationevent, str, lazy, th);
        int i3 = IAuthTabCallback_Parcel + 87;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ serializeRaw onWarmupCompleted(resolveResourcePath resolveresourcepath, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, boolean z, boolean z2, String str, Function1 function1, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawOnExtraCallbackWithResult = onExtraCallbackWithResult(resolveresourcepath, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, onnavigationevent, z, z2, str, function1, th);
        int i4 = IAuthTabCallback_Parcel + 65;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return serializerawOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        int i4 = writeTypedObject + 65;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public resolveResourcePath(@NotNull Context context, @NotNull AppState appState, @NotNull SessionState sessionState, @NotNull isJacksonCreator isjacksoncreator, @NotNull r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58 r8lambdaj8wxkoyvtumu6wceutecw9ckl58) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appState, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        Intrinsics.checkNotNullParameter(isjacksoncreator, "");
        Intrinsics.checkNotNullParameter(r8lambdaj8wxkoyvtumu6wceutecw9ckl58, "");
        this.IAuthTabCallback = context;
        this.onExtraCallbackWithResult = appState;
        this.IAuthTabCallbackStub = sessionState;
        this.onExtraCallback = isjacksoncreator;
        this.asBinder = r8lambdaj8wxkoyvtumu6wceutecw9ckl58;
    }

    private static final Bundle onExtraCallback(Lazy<Bundle> lazy) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundle = (Bundle) lazy.getValue();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 111;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return bundle;
    }

    private static final Bundle onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleIAuthTabCallback = getColorInstance.IAuthTabCallback(function1);
        int i4 = writeTypedObject + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return bundleIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Lazy lazy = (Lazy) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) lazy.getValue();
        int i4 = IAuthTabCallback_Parcel + 97;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String onNavigationEvent(Lazy lazy) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleOnExtraCallback = onExtraCallback((Lazy<Bundle>) lazy);
        Object[] objArr = new Object[1];
        a(new char[]{42952, 45541, 2793, 9876, 38494, 59149, 40461, 8366, 29611, 21615}, 10 - Gravity.getAbsoluteGravity(0, 0), objArr);
        String string = bundleOnExtraCallback.getString(((String) objArr[0]).intern());
        int i4 = IAuthTabCallback_Parcel + 83;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return string;
    }

    private static final boolean extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ((Boolean) function1.invoke(obj)).booleanValue();
        throw null;
    }

    private static final boolean IAuthTabCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, String str, resolveResourcePath resolveresourcepath, Lazy lazy, drawIconBackgroundColor drawiconbackgroundcolor) throws Throwable {
        String logValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(drawiconbackgroundcolor, "");
        if (drawiconbackgroundcolor.onExtraCallbackWithResult() != ResultStatus.FAILED) {
            return true;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 29 - ((byte) KeyEvent.getModifierMetaStateMask()), 24888 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        String loginYN = null;
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1266598351);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, 24887 - View.combineMeasuredStates(0, 0), -2050899807, false, "asInterface", new Class[0]);
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue() + 1;
            if (iIntValue < 5) {
                asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
                createPaints createpaints = createPaints.IAuthTabCallback;
                IndicatorView indicatorViewAccess100 = createpaints.access100();
                if (indicatorViewAccess100 != null) {
                    int i2 = IAuthTabCallback_Parcel + 81;
                    writeTypedObject = i2 % 128;
                    int i3 = i2 % 2;
                    logValue = indicatorViewAccess100.getLogValue();
                } else {
                    logValue = null;
                }
                String strValueOf = String.valueOf(logValue);
                PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
                String strOnNavigationEvent = getColorInstance.onNavigationEvent(rememberLottieCompositionKtlottieComposition1, onextracallbackwithresult.onExtraCallbackWithResult(uTF8Decoder));
                String strOnNavigationEvent2 = getColorInstance.onNavigationEvent(rememberLottieCompositionKtlottieComposition1, onextracallbackwithresult.IAuthTabCallback(uTF8Decoder));
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24886, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback3).invoke(obj, null)).intValue();
                IndicatorView indicatorViewAccess1002 = createpaints.access100();
                if (indicatorViewAccess1002 != null) {
                    int i4 = IAuthTabCallback_Parcel + 117;
                    writeTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                    loginYN = indicatorViewAccess1002.getLoginYN();
                    int i6 = IAuthTabCallback_Parcel + 57;
                    writeTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                }
                String str2 = loginYN;
                String eventValue = uTF8Decoder.getEventValue();
                String str3 = (String) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lazy}, -1593382375, 1593382378, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
                Object[] objArr = new Object[1];
                b(TextUtils.lastIndexOf("", '0', 0, 0) + 1943291992, (char) (Process.myTid() >> 22), new char[]{'\n', 50107, 25929, 31306, 31356, 16016, 8384, 61146, 29034}, new char[]{22453, 54344, 5235, 15162}, new char[]{0, 0, 0, 0}, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(new char[]{36695, 18915, 43637, 23900}, View.getDefaultSize(0, 0) + 4, objArr2);
                asMaplambda6.onNavigationEvent(asmaplambda6, strValueOf, strIntern, ((String) objArr2[0]).intern(), "", strOnNavigationEvent, strOnNavigationEvent2, iIntValue2, j, onnavigationevent, str2, str, null, eventValue, str3, 2048, null);
                accesssetNamep.onNavigationEvent.onWarmupCompleted(resolveresourcepath.IAuthTabCallback, false, iIntValue).IAuthTabCallback(NetConverter3.onExtraCallback()).bI_().onNavigationEvent().bK_();
            }
            Object[] objArr3 = {Integer.valueOf(iIntValue)};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(135386065);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Process.getGidForName("") + 31, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24887, 961621313, false, "onExtraCallback", new Class[]{Integer.TYPE});
            }
            ((Method) objOnExtraCallback4).invoke(obj, objArr3);
            return iIntValue >= 5;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final serializeRaw ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        serializeRaw serializeraw = (serializeRaw) function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 41;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return serializeraw;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if ((r3 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r5 == 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r5 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r12 = r12 + 11;
        o.resolveResourcePath.writeTypedObject = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if ((r12 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r5 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r5 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r5 != 4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r3 = o.onRetainNonConfigurationInstance.onNavigationEvent;
        r5 = r38.getActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r3.onExtraCallbackWithResult(r5) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        r3 = o.resolveResourcePath.writeTypedObject + 73;
        o.resolveResourcePath.IAuthTabCallback_Parcel = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if ((r3 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        r4 = 17 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r37 == o.UTF8Decoder.LOCK_SCREEN) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r37 == o.UTF8Decoder.LOCK_SCREEN) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        return o.r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.onExtraCallbackWithResult(r36.asBinder, r38, r37, r39, false, false, null, null, r41, r45, true, r46, r42, r47, false, 8312, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        r0 = o.getByteBuffer.onExtraCallback(new o.isProxy(o.isNumber.BIOMETRIC));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        r0 = o.getByteBuffer.onExtraCallback(new o.longExtractValue(o.isNumber.BIOMETRIC));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        r14 = o.asMaplambda6.onExtraCallback;
        r3 = o.createPaints.IAuthTabCallback;
        r5 = r3.access100();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        r5 = r5.getLogValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
    
        r15 = java.lang.String.valueOf(r5);
        r5 = viva.republica.toss.password.PasswordFragment.Companion;
        r19 = o.getColorInstance.onNavigationEvent(r38, r5.onExtraCallbackWithResult(r37));
        r20 = o.getColorInstance.onNavigationEvent(r38, r5.IAuthTabCallback(r37));
        r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        if (r5 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.MotionEvent.axisFromString("") + 31, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 24887, -265239605, false, "onWarmupCompleted", (java.lang.Class[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
    
        r5 = ((java.lang.reflect.Field) r5).get(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012c, code lost:
    
        r7 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
    
        if (r7 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
    
        r7 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) android.graphics.Color.green(0), 29 - android.text.TextUtils.lastIndexOf("", '0', 0), 24887 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), -1234421087, false, "IAuthTabCallbackStub", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015a, code lost:
    
        r21 = ((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke(r5, null)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0166, code lost:
    
        r3 = r3.access100();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016a, code lost:
    
        if (r3 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016c, code lost:
    
        r5 = o.resolveResourcePath.IAuthTabCallback_Parcel + 7;
        o.resolveResourcePath.writeTypedObject = r5 % 128;
        r5 = r5 % 2;
        r9 = r3.getLoginYN();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0179, code lost:
    
        r25 = r9;
        r28 = r37.getEventValue();
        r29 = (java.lang.String) onWarmupCompleted(im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new java.lang.Object[]{r48}, -1593382375, 1593382378, im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        r9 = new java.lang.Object[1];
        b(1943291991 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.View.combineMeasuredStates(0, 0), new char[]{'\n', 50107, 25929, 31306, 31356, 16016, 8384, 61146, 29034}, new char[]{22453, 54344, 5235, 15162}, new char[]{0, 0, 0, 0}, r9);
        r16 = ((java.lang.String) r9[0]).intern();
        r6 = new java.lang.Object[1];
        a(new char[]{36695, 18915, 43637, 23900}, '4' - android.text.AndroidCharacter.getMirror('0'), r6);
        o.asMaplambda6.onNavigationEvent(r14, r15, r16, ((java.lang.String) r6[0]).intern(), "", r19, r20, r21, r39, r41, r25, r42, null, r28, r29, 2048, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0204, code lost:
    
        if (r43 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0206, code lost:
    
        r0 = o.getByteBuffer.onExtraCallback(new o.asMap());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0212, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0213, code lost:
    
        if (r44 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0215, code lost:
    
        r3 = o.resolveResourcePath.writeTypedObject + 31;
        o.resolveResourcePath.IAuthTabCallback_Parcel = r3 % 128;
        r3 = r3 % 2;
        r44.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0241, code lost:
    
        return o.r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.onExtraCallbackWithResult(r36.asBinder, r38, r37, r39, false, false, null, null, r41, r45, true, r46, r42, r47, false, 8312, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r5 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0242, code lost:
    
        r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0246, code lost:
    
        if (r1 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0248, code lost:
    
        r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) android.text.TextUtils.getOffsetAfter("", 0), android.widget.ExpandableListView.getPackedPositionChild(0) + 31, 24887 - (android.view.ViewConfiguration.getTouchSlop() >> 8), -265239605, false, "onWarmupCompleted", (java.lang.Class[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0276, code lost:
    
        r1 = ((java.lang.reflect.Field) r1).get(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x027f, code lost:
    
        r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1519653344);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0283, code lost:
    
        if (r5 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0285, code lost:
    
        r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - android.os.Process.getGidForName("")), 30 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 24887 - android.graphics.Color.green(0), -1809117008, false, "onExtraCallback", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02b4, code lost:
    
        ((java.lang.reflect.Method) r5).invoke(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02b9, code lost:
    
        o.asDoublelambda2.IAuthTabCallback.onWarmupCompleted(r36.IAuthTabCallback, true, 0).IAuthTabCallback(o.NetConverter3.onExtraCallback()).bI_().onNavigationEvent().bK_();
        r36.IAuthTabCallbackStub.IAuthTabCallback_Parcel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02df, code lost:
    
        if (((o.BuildConfig) r49.IAuthTabCallback()) == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02e1, code lost:
    
        r0 = r49.IAuthTabCallback();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0, "");
        r0 = ((o.BuildConfig) r0).onNavigationEvent();
        r1 = o.resolveResourcePath.writeTypedObject + 3;
        o.resolveResourcePath.IAuthTabCallback_Parcel = r1 % 128;
        r1 = r1 % 2;
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f8, code lost:
    
        r0 = o.getByteBuffer.onWarmupCompleted(new o.CatalystInstanceImplJSProfilerTraceListener(o.isNumber.BIOMETRIC, r10, null, null, r37, false, false, false, 236, null));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0324, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r3 = o.resolveResourcePath.writeTypedObject + 87;
        r12 = r3 % 128;
        o.resolveResourcePath.IAuthTabCallback_Parcel = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.serializeRaw onExtraCallback(o.resolveResourcePath r36, o.UTF8Decoder r37, o.RememberLottieCompositionKtlottieComposition1 r38, long r39, o.shortValue.onNavigationEvent r41, java.lang.String r42, boolean r43, kotlin.jvm.functions.Function0 r44, boolean r45, boolean r46, kotlin.jvm.functions.Function1 r47, kotlin.Lazy r48, o.drawIconBackgroundColor r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolveResourcePath.onExtraCallback(o.resolveResourcePath, o.UTF8Decoder, o.RememberLottieCompositionKtlottieComposition1, long, o.shortValue$onNavigationEvent, java.lang.String, boolean, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.Lazy, o.drawIconBackgroundColor):o.serializeRaw");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 31;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(access100);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                        int iKeyCodeFromString = 12434 - KeyEvent.keyCodeFromString("");
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, keyRepeatDelay, iKeyCodeFromString, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i10 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 10, 12433 - MotionEvent.axisFromString(""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i10 + 1;
                    int i11 = $10 + 1;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, 19901 - View.combineMeasuredStates(0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 123;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 42;
                    int iAxisFromString = 1450 - MotionEvent.axisFromString("");
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode, i7, iAxisFromString, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 49123), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, TextUtils.getTrimmedLength("") + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 23972), (ViewConfiguration.getPressedStateDuration() >> 16) + 50, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 45848), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (access000 ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStubProxy ^ 7798559133331975163L))) ^ ((char) (getInterfaceDescriptor ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $10 + 37;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(o.RememberLottieCompositionKtlottieComposition1 r12, o.resolveResourcePath r13, kotlin.Lazy r14, o.SetDetectableSize r15) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            androidx.fragment.app.FragmentActivity r12 = r12.getActivity()
            java.util.Map r1 = r15.onExtraCallback()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            r4 = 1
            r5 = 0
            if (r2 < r3) goto L65
            if (r12 == 0) goto L65
            o.isJacksonCreator r2 = r13.onExtraCallback
            java.lang.String r2 = r2.onNavigationEvent()
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 != 0) goto L65
            int r2 = o.resolveResourcePath.writeTypedObject
            int r2 = r2 + 45
            int r3 = r2 % 128
            o.resolveResourcePath.IAuthTabCallback_Parcel = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L5c
            o.isJacksonCreator r13 = r13.onExtraCallback
            boolean r13 = r13.onNavigationEvent(r12)
            if (r13 == 0) goto L65
            r13 = 0
            boolean r13 = o.zzbc.onWarmupCompleted(r12, r13, r4, r3)
            if (r13 != 0) goto L65
            int r13 = o.resolveResourcePath.writeTypedObject
            int r13 = r13 + 107
            int r2 = r13 % 128
            o.resolveResourcePath.IAuthTabCallback_Parcel = r2
            int r13 = r13 % r0
            if (r13 == 0) goto L53
            boolean r12 = o.transparentBackground.onExtraCallback(r12)
            if (r12 != 0) goto L5a
            goto L65
        L53:
            boolean r12 = o.transparentBackground.onExtraCallback(r12)
            if (r12 != r4) goto L5a
            goto L65
        L5a:
            r12 = r4
            goto L6f
        L5c:
            o.isJacksonCreator r13 = r13.onExtraCallback
            r13.onNavigationEvent(r12)
            r3.hashCode()
            throw r3
        L65:
            int r12 = o.resolveResourcePath.IAuthTabCallback_Parcel
            int r12 = r12 + 57
            int r13 = r12 % 128
            o.resolveResourcePath.writeTypedObject = r13
            int r12 = r12 % r0
            r12 = r5
        L6f:
            int r13 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r6 = r13 >> 16
            int r13 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r13 = r13 >> 16
            char r7 = (char) r13
            r13 = 20
            char[] r8 = new char[r13]
            r8 = {x00b2: FILL_ARRAY_DATA , data: [-15078, -20142, -10233, 17928, 31249, 9992, 14651, -29275, 4955, 24972, -11974, 21746, 22337, -2499, 13355, -7350, 29324, 18726, 11478, -22856} // fill-array
            r13 = 4
            char[] r9 = new char[r13]
            r9 = {x00ca: FILL_ARRAY_DATA , data: [-27927, 24972, -10269, -32586} // fill-array
            char[] r10 = new char[r13]
            r10 = {x00d2: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r11 = r13
            b(r6, r7, r8, r9, r10, r11)
            r13 = r13[r5]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = r13.intern()
            java.lang.String r12 = o.zzaz.onExtraCallbackWithResult(r12)
            r1.put(r13, r12)
            android.os.Bundle r12 = onExtraCallback(r14)
            java.util.Map r12 = o.zzay.onWarmupCompleted(r12)
            r15.onExtraCallback(r12)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolveResourcePath.onWarmupCompleted(o.RememberLottieCompositionKtlottieComposition1, o.resolveResourcePath, kotlin.Lazy, o.SetDetectableSize):kotlin.Unit");
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = writeTypedObject + 93;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 63;
        writeTypedObject = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(o.RememberLottieCompositionKtlottieComposition1 r28, o.UTF8Decoder r29, long r30, o.shortValue.onNavigationEvent r32, java.lang.String r33, kotlin.Lazy r34, o.isJSONTypeIgnore r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolveResourcePath.onExtraCallback(o.RememberLottieCompositionKtlottieComposition1, o.UTF8Decoder, long, o.shortValue$onNavigationEvent, java.lang.String, kotlin.Lazy, o.isJSONTypeIgnore):kotlin.Unit");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        final resolveResourcePath resolveresourcepath = (resolveResourcePath) objArr[0];
        final RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[1];
        final UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[2];
        final shortValue.onNavigationEvent onnavigationevent = (shortValue.onNavigationEvent) objArr[3];
        final boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        final Function1 function1 = (Function1) objArr[5];
        final Function0 function0 = (Function0) objArr[6];
        final String str = (String) objArr[7];
        final long jLongValue = ((Number) objArr[8]).longValue();
        final boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
        String str2 = (String) objArr[10];
        final boolean zBooleanValue3 = ((Boolean) objArr[11]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        final Lazy lazyOnExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda11
            public final Object invoke() {
                return (Bundle) resolveResourcePath.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{function1}, 1356245018, -1356245009, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
            }
        });
        final Lazy lazyOnExtraCallbackWithResult2 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda14
            public final Object invoke() {
                return resolveResourcePath.onExtraCallbackWithResult(lazyOnExtraCallbackWithResult);
            }
        });
        getByteBuffer<drawIconBackgroundColor<BuildConfig>> getbytebufferOnExtraCallback = accessMapSafely.onNavigationEvent.onExtraCallback(rememberLottieCompositionKtlottieComposition1, str2);
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda15
            public final Object invoke(Object obj) {
                return Boolean.valueOf(resolveResourcePath.onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, jLongValue, onnavigationevent, str, resolveresourcepath, lazyOnExtraCallbackWithResult2, (drawIconBackgroundColor) obj));
            }
        };
        getByteBuffer getbytebufferOnWarmupCompleted = getbytebufferOnExtraCallback.onWarmupCompleted(new deserializeLongCollection() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda16
            public final boolean test(Object obj) {
                return resolveResourcePath.onTransact(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                resolveResourcePath resolveresourcepath2 = this.f$0;
                UTF8Decoder uTF8Decoder2 = uTF8Decoder;
                RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition12 = rememberLottieCompositionKtlottieComposition1;
                long j = jLongValue;
                shortValue.onNavigationEvent onnavigationevent2 = onnavigationevent;
                String str3 = str;
                boolean z = zBooleanValue2;
                Function0 function02 = function0;
                boolean z2 = zBooleanValue;
                boolean z3 = zBooleanValue3;
                return (serializeRaw) resolveResourcePath.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{resolveresourcepath2, uTF8Decoder2, rememberLottieCompositionKtlottieComposition12, Long.valueOf(j), onnavigationevent2, str3, Boolean.valueOf(z), function02, Boolean.valueOf(z2), Boolean.valueOf(z3), function1, lazyOnExtraCallbackWithResult2, (drawIconBackgroundColor) obj}, -359929196, 359929203, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
            }
        };
        getByteBuffer getbytebufferIAuthTabCallback = getbytebufferOnWarmupCompleted.IAuthTabCallback(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda18
            public final Object apply(Object obj) {
                return resolveResourcePath.asInterface(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return resolveResourcePath.onExtraCallbackWithResult(jLongValue, str, zBooleanValue3, lazyOnExtraCallbackWithResult2, rememberLottieCompositionKtlottieComposition1, resolveresourcepath, lazyOnExtraCallbackWithResult, (deserializeUriNullableCollection) obj);
            }
        };
        getByteBuffer getbytebufferOnWarmupCompleted2 = getbytebufferIAuthTabCallback.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda20
            public final void accept(Object obj) {
                resolveResourcePath.onNavigationEvent(function14, obj);
            }
        });
        final Function1 function15 = new Function1() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda21
            public final Object invoke(Object obj) {
                return resolveResourcePath.IAuthTabCallback(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, jLongValue, onnavigationevent, str, lazyOnExtraCallbackWithResult2, (isJSONTypeIgnore) obj);
            }
        };
        getByteBuffer getbytebufferOnExtraCallback2 = getbytebufferOnWarmupCompleted2.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda22
            public final void accept(Object obj) {
                resolveResourcePath.onWarmupCompleted(function15, obj);
            }
        });
        final Function1 function16 = new Function1() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return resolveResourcePath.onWarmupCompleted(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, jLongValue, onnavigationevent, str, lazyOnExtraCallbackWithResult2, (Throwable) obj);
            }
        };
        getByteBuffer getbytebufferOnNavigationEvent = getbytebufferOnExtraCallback2.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda13
            public final void accept(Object obj) throws Throwable {
                resolveResourcePath.asBinder(function16, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnNavigationEvent, "");
        int i2 = IAuthTabCallback_Parcel + 17;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return getbytebufferOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, String str, Lazy lazy, Throwable th) throws Throwable {
        String logValue;
        String strIntern;
        String loginYN;
        int i = 2 % 2;
        if (!(th instanceof isKotlinIgnore)) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{48523, 4498, 4235, 24868, 46929, 19828, 51559, 26524, 49262, 5806, 21674, 14153, 14610, 22557}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13, objArr);
            String strIntern2 = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9784), new char[]{44097, 59795, 11210, 61533, 62597, 16552, 41580, 16956, 4608, 6144, 37513, 16190, 16410, 8671, 12410, 27956, 42234, 46123, 45617, 50855, 43950, 44790, 37564, 26285, 54645, 38438, 36758, 51195, 24221, 10438}, new char[]{61598, 18544, 14491, 31270}, new char[]{0, 0, 0, 0}, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern2, ((String) objArr2[0]).intern(), th, (Map) null, 8, (Object) null);
            return Unit.INSTANCE;
        }
        isKotlinIgnore iskotlinignore = (isKotlinIgnore) th;
        if (iskotlinignore.onExtraCallbackWithResult() == isNumber.BIOMETRIC) {
            asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            if (indicatorViewAccess100 != null) {
                int i2 = writeTypedObject + 49;
                IAuthTabCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                logValue = indicatorViewAccess100.getLogValue();
            } else {
                logValue = null;
            }
            String strValueOf = String.valueOf(logValue);
            String eventName = iskotlinignore.onExtraCallbackWithResult().getEventName();
            if (!(!(th instanceof isProxy))) {
                Object[] objArr3 = new Object[1];
                b(ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42047), new char[]{21996, 41483, 41229, 17472, 33617, 36350}, new char[]{64439, 28477, 16197, 59044}, new char[]{0, 0, 0, 0}, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                int i4 = writeTypedObject + 13;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                Object[] objArr4 = new Object[1];
                a(new char[]{36695, 18915, 43637, 23900}, 4 - View.resolveSize(0, 0), objArr4);
                strIntern = ((String) objArr4[0]).intern();
            }
            String string = iskotlinignore.toString();
            PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
            String strOnNavigationEvent = getColorInstance.onNavigationEvent(rememberLottieCompositionKtlottieComposition1, onextracallbackwithresult.onExtraCallbackWithResult(uTF8Decoder));
            String strOnNavigationEvent2 = getColorInstance.onNavigationEvent(rememberLottieCompositionKtlottieComposition1, onextracallbackwithresult.IAuthTabCallback(uTF8Decoder));
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 30 - Color.red(0), 24886 - MotionEvent.axisFromString(""), -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 31 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 24888, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue();
                IndicatorView indicatorViewAccess1002 = createpaints.access100();
                if (indicatorViewAccess1002 != null) {
                    int i6 = writeTypedObject + 17;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    loginYN = indicatorViewAccess1002.getLoginYN();
                } else {
                    loginYN = null;
                }
                String str2 = strIntern;
                asMaplambda6.onNavigationEvent(asmaplambda6, strValueOf, eventName, str2, string, strOnNavigationEvent, strOnNavigationEvent2, iIntValue, j, onnavigationevent, loginYN, str, null, uTF8Decoder.getEventValue(), (String) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lazy}, -1593382375, 1593382378, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()), 2048, null);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getByteBuffer onExtraCallbackWithResult(resolveResourcePath resolveresourcepath, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, shortValue.onNavigationEvent onnavigationevent, boolean z, String str, Function1 function1, Function0 function0, long j, boolean z2, String str2, boolean z3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel;
        int i4 = i3 + 11;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        Function0 function02 = (i & 64) != 0 ? null : function0;
        boolean z4 = false;
        boolean z5 = (i & 256) != 0 ? false : z2;
        String str3 = (i & 512) != 0 ? null : str2;
        if ((i & 1024) != 0) {
            int i6 = i3 + 23;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z4 = z3;
        }
        return (getByteBuffer) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{resolveresourcepath, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, onnavigationevent, Boolean.valueOf(z), str, function1, function02, Long.valueOf(j), Boolean.valueOf(z5), str3, Boolean.valueOf(z4)}, 65157423, -65157421, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final resolveResourcePath resolveresourcepath = (resolveResourcePath) objArr[0];
        final RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[1];
        final UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[2];
        final shortValue.onNavigationEvent onnavigationevent = (shortValue.onNavigationEvent) objArr[3];
        final boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        final String str = (String) objArr[5];
        final Function1 function1 = (Function1) objArr[6];
        Function0 function0 = (Function0) objArr[7];
        final long jLongValue = ((Number) objArr[8]).longValue();
        final boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
        String str2 = (String) objArr[10];
        final boolean zBooleanValue3 = ((Boolean) objArr[11]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        getByteBuffer getbytebuffer = (getByteBuffer) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{resolveresourcepath, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, onnavigationevent, Boolean.valueOf(zBooleanValue), function1, function0, str, Long.valueOf(jLongValue), Boolean.valueOf(zBooleanValue2), str2, Boolean.valueOf(zBooleanValue3)}, -667959491, 667959491, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return resolveResourcePath.onNavigationEvent(this.f$0, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, jLongValue, onnavigationevent, zBooleanValue, zBooleanValue3, str, function1, zBooleanValue2, (Throwable) obj);
            }
        };
        getByteBuffer getbytebufferOnTransact = getbytebuffer.onTransact(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda10
            public final Object apply(Object obj) {
                return resolveResourcePath.IAuthTabCallbackDefault(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnTransact, "");
        int i2 = IAuthTabCallback_Parcel + 115;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return getbytebufferOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final serializeRaw IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        writeTypedObject = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        serializeRaw serializeraw = (serializeRaw) function1.invoke(obj);
        int i3 = writeTypedObject + 71;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return serializeraw;
        }
        obj2.hashCode();
        throw null;
    }

    private static final serializeRaw getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        serializeRaw serializeraw = (serializeRaw) function1.invoke(obj);
        int i3 = writeTypedObject + 23;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return serializeraw;
    }

    private static final serializeRaw onExtraCallbackWithResult(PasswordMatchLogRes passwordMatchLogRes) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(passwordMatchLogRes, "");
        accessMapSafely.onNavigationEvent.onNavigationEvent();
        getByteBuffer getbytebufferOnExtraCallback = getByteBuffer.onExtraCallback(new asMap());
        int i2 = writeTypedObject + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return getbytebufferOnExtraCallback;
    }

    private static final serializeRaw access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (serializeRaw) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final serializeRaw onExtraCallbackWithResult(Throwable th) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        accessMapSafely.onNavigationEvent.onNavigationEvent();
        getByteBuffer getbytebufferOnExtraCallback = getByteBuffer.onExtraCallback(new asMap());
        int i2 = writeTypedObject + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return getbytebufferOnExtraCallback;
    }

    private static final serializeRaw access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        serializeRaw serializeraw = (serializeRaw) function1.invoke(obj);
        int i3 = IAuthTabCallback_Parcel + 97;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return serializeraw;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        String string;
        resolveResourcePath resolveresourcepath = (resolveResourcePath) objArr[0];
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[1];
        UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        shortValue.onNavigationEvent onnavigationevent = (shortValue.onNavigationEvent) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        String str = (String) objArr[7];
        Function1 function1 = (Function1) objArr[8];
        PasswordMatchLogRes passwordMatchLogRes = (PasswordMatchLogRes) objArr[9];
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(passwordMatchLogRes, "");
            accessMapSafely.onNavigationEvent.onNavigationEvent();
            r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58 r8lambdaj8wxkoyvtumu6wceutecw9ckl58 = resolveresourcepath.asBinder;
            rememberLottieCompositionKtlottieComposition1.getActivity();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(passwordMatchLogRes, "");
        accessMapSafely.onNavigationEvent.onNavigationEvent();
        r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58 r8lambdaj8wxkoyvtumu6wceutecw9ckl582 = resolveresourcepath.asBinder;
        FragmentActivity activity = rememberLottieCompositionKtlottieComposition1.getActivity();
        if (activity != null) {
            int i3 = writeTypedObject + 31;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            string = activity.getString(R.string.app_bio_authenticate_fail_message);
        } else {
            string = null;
        }
        return r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.onExtraCallbackWithResult(r8lambdaj8wxkoyvtumu6wceutecw9ckl582, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, jLongValue, false, false, null, string, onnavigationevent, zBooleanValue, true, zBooleanValue2, str, function1, false, 8248, null);
    }

    private static final serializeRaw IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (serializeRaw) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final serializeRaw onExtraCallbackWithResult(resolveResourcePath resolveresourcepath, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, boolean z, boolean z2, String str, Function1 function1, Throwable th) throws Throwable {
        String str2;
        TossApiCallException.ApiError apiError;
        String strOnTransact;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        accessMapSafely.onNavigationEvent.onNavigationEvent();
        r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58 r8lambdaj8wxkoyvtumu6wceutecw9ckl58 = resolveresourcepath.asBinder;
        boolean z3 = th instanceof TossApiCallException.ApiError;
        TossApiCallException.ApiError apiError2 = z3 ? (TossApiCallException.ApiError) th : null;
        if (apiError2 != null) {
            int i2 = IAuthTabCallback_Parcel + 55;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                strOnTransact = apiError2.onTransact();
                int i3 = 81 / 0;
            } else {
                strOnTransact = apiError2.onTransact();
            }
            str2 = strOnTransact;
        } else {
            str2 = null;
        }
        if (z3) {
            int i4 = IAuthTabCallback_Parcel + 59;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            apiError = (TossApiCallException.ApiError) th;
        } else {
            int i6 = IAuthTabCallback_Parcel + 121;
            writeTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 2;
            }
            apiError = null;
        }
        return r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.onExtraCallbackWithResult(r8lambdaj8wxkoyvtumu6wceutecw9ckl58, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, false, false, str2, apiError != null ? apiError.getLocalizedMessage() : null, onnavigationevent, z, false, z2, str, function1, false, 8728, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x014d, code lost:
    
        if (r42 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0150, code lost:
    
        if (r42 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0152, code lost:
    
        r1 = o.accesssetNamep.onNavigationEvent;
        r0 = r32.IAuthTabCallback;
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015a, code lost:
    
        if (r3 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015c, code lost:
    
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 1), (android.os.Process.myTid() >> 22) + 30, 24887 - (android.os.Process.myPid() >> 22), -265239605, false, "onWarmupCompleted", (java.lang.Class[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x018e, code lost:
    
        r3 = ((java.lang.reflect.Field) r3).get(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0194, code lost:
    
        r2 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1266598351);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0198, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x019a, code lost:
    
        r2 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0)), 30 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 24888 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), -2050899807, false, "asInterface", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d7, code lost:
    
        r0 = r1.onWarmupCompleted(r0, false, ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(r3, null)).intValue()).IAuthTabCallbackStub();
        r2 = new viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda1();
        r0 = r0.IAuthTabCallback(new viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda2(r2));
        r1 = new viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda3();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01fb, code lost:
    
        return r0.onTransact(new viva.republica.toss.password.BiometricAuthPrompt$$ExternalSyntheticLambda4(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.serializeRaw onWarmupCompleted(final o.resolveResourcePath r32, final o.RememberLottieCompositionKtlottieComposition1 r33, final o.UTF8Decoder r34, final long r35, final o.shortValue.onNavigationEvent r37, final boolean r38, final boolean r39, final java.lang.String r40, final kotlin.jvm.functions.Function1 r41, boolean r42, java.lang.Throwable r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolveResourcePath.onWarmupCompleted(o.resolveResourcePath, o.RememberLottieCompositionKtlottieComposition1, o.UTF8Decoder, long, o.shortValue$onNavigationEvent, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function1, boolean, java.lang.Throwable):o.serializeRaw");
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static /* synthetic */ Bundle IAuthTabCallback(Function1 function1) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Bundle) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{function1}, 1356245018, -1356245009, iIAuthTabCallback, iIAuthTabCallback2);
    }

    public static /* synthetic */ serializeRaw IAuthTabCallbackStub(Function1 function1, Object obj) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (serializeRaw) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{function1, obj}, -1567636475, 1567636476, iIAuthTabCallback, iIAuthTabCallback2);
    }

    public static /* synthetic */ serializeRaw onNavigationEvent(resolveResourcePath resolveresourcepath, UTF8Decoder uTF8Decoder, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, long j, shortValue.onNavigationEvent onnavigationevent, String str, boolean z, Function0 function0, boolean z2, boolean z3, Function1 function1, Lazy lazy, drawIconBackgroundColor drawiconbackgroundcolor) {
        return (serializeRaw) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{resolveresourcepath, uTF8Decoder, rememberLottieCompositionKtlottieComposition1, Long.valueOf(j), onnavigationevent, str, Boolean.valueOf(z), function0, Boolean.valueOf(z2), Boolean.valueOf(z3), function1, lazy, drawiconbackgroundcolor}, -359929196, 359929203, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, resolveResourcePath resolveresourcepath, Lazy lazy, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{rememberLottieCompositionKtlottieComposition1, resolveresourcepath, lazy, setDetectableSize}, -960490277, 960490282, iIAuthTabCallback, iIAuthTabCallback2);
    }

    private static final serializeRaw onExtraCallback(resolveResourcePath resolveresourcepath, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, boolean z, boolean z2, String str, Function1 function1, PasswordMatchLogRes passwordMatchLogRes) {
        return (serializeRaw) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{resolveresourcepath, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, Long.valueOf(j), onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), str, function1, passwordMatchLogRes}, 2116887383, -2116887379, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{function1, obj}, -982185268, 982185276, iIAuthTabCallback, iIAuthTabCallback2);
    }

    private static final String onWarmupCompleted(Lazy<String> lazy) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (String) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lazy}, -1593382375, 1593382378, iIAuthTabCallback, iIAuthTabCallback2);
    }

    private static final Unit onExtraCallback(long j, String str, boolean z, Lazy lazy, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, resolveResourcePath resolveresourcepath, Lazy lazy2, deserializeUriNullableCollection deserializeurinullablecollection) {
        return (Unit) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{Long.valueOf(j), str, Boolean.valueOf(z), lazy, rememberLottieCompositionKtlottieComposition1, resolveresourcepath, lazy2, deserializeurinullablecollection}, -864489898, 864489904, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public final getByteBuffer<isJSONTypeIgnore> onExtraCallback(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull UTF8Decoder uTF8Decoder, @Nullable shortValue.onNavigationEvent onnavigationevent, boolean z, @NotNull String str, @NotNull Function1<? super TypeUtils7, Unit> function1, @Nullable Function0<Unit> function0, long j, boolean z2, @Nullable String str2, boolean z3) {
        return (getByteBuffer) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, onnavigationevent, Boolean.valueOf(z), str, function1, function0, Long.valueOf(j), Boolean.valueOf(z2), str2, Boolean.valueOf(z3)}, 65157423, -65157421, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public final getByteBuffer<isJSONTypeIgnore> onExtraCallback(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull UTF8Decoder uTF8Decoder, @Nullable shortValue.onNavigationEvent onnavigationevent, boolean z, @NotNull Function1<? super TypeUtils7, Unit> function1, @Nullable Function0<Unit> function0, @NotNull String str, long j, boolean z2, @Nullable String str2, boolean z3) {
        return (getByteBuffer) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, onnavigationevent, Boolean.valueOf(z), function1, function0, str, Long.valueOf(j), Boolean.valueOf(z2), str2, Boolean.valueOf(z3)}, -667959491, 667959491, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackDefault = (char) 56932;
        onTransact = (char) 19762;
        asInterface = (char) 11775;
        access100 = (char) 27752;
        access000 = 7798559133331975163L;
        IAuthTabCallbackStubProxy = -1776194565;
        getInterfaceDescriptor = (char) 47445;
    }
}
