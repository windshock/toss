package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.github.luben.zstd.ZstdInputStream;
import com.github.luben.zstd.ZstdOutputStream;
import com.github.luben.zstd.util.Native;
import im.toss.features.edoc.register.AptPasswordActivity$;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.JsonElement;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.DiagnosticsWorker;
import o.RemoteWorkManager;
import o.TextRoundCornerProgressBarSavedState1;
import o.h1;
import o.wie2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RemoteWorkManager {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String IAuthTabCallback;
    private static String IAuthTabCallbackDefault = null;
    private static final Lazy IAuthTabCallbackStub;
    private static char[] IAuthTabCallbackStubProxy = null;
    private static boolean IAuthTabCallback_Parcel = false;
    private static int ICustomTabsCallback = 0;
    private static boolean access000 = false;
    private static int access100 = 0;
    private static boolean asBinder = false;
    private static final Object asInterface;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static long getInterfaceDescriptor = 0;
    private static final Lazy onExtraCallback;
    private static String onExtraCallbackWithResult = null;
    private static final Lazy onNavigationEvent;
    private static final Lazy onTransact;
    public static final RemoteWorkManager onWarmupCompleted;
    private static int readTypedObject = 1;

    public static final /* synthetic */ class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[h1.values().length];
            try {
                iArr[h1.TSS_ZSTD.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[DiagnosticsWorker.IAuthTabCallback.values().length];
            try {
                iArr2[DiagnosticsWorker.IAuthTabCallback.GZIP.ordinal()] = 1;
                int i2 = IAuthTabCallback + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[DiagnosticsWorker.IAuthTabCallback.ZSTD.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DiagnosticsWorker.IAuthTabCallback.NONE.ordinal()] = 3;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr2;
            int i6 = IAuthTabCallback + 21;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 80 / 0;
            }
        }
    }

    public static /* synthetic */ ConstraintsSizeResolverExternalSyntheticLambda0 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0OnMessageChannelReady = onMessageChannelReady();
        int i4 = ICustomTabsCallback + 113;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return constraintsSizeResolverExternalSyntheticLambda0OnMessageChannelReady;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityLayout();
        }
        onActivityLayout();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = (~((~i2) | i8)) | i7;
        int i10 = i3 | i8;
        int i11 = (~(i2 | i7 | i8)) | (~(i | i3));
        int i12 = i + i3 + i6 + (2049387148 * i4) + ((-609071723) * i5);
        int i13 = i12 * i12;
        int i14 = ((1483459036 * i) - 1284505600) + (2005429323 * i3) + (i9 * 1605645861) + (1083675574 * i10) + (1605645861 * i11) + ((-1205862400) * i6) + ((-243269632) * i4) + ((-895483904) * i5) + ((-1334837248) * i13);
        int i15 = ((i * 335895516) - 1139737737) + (i3 * 335898315) + (i9 * 933) + (i10 * (-1866)) + (i11 * 933) + (i6 * 335896449) + (i4 * (-616405876)) + (i5 * 126640917) + (i13 * 2020605952);
        switch (i14 + (i15 * i15 * (-544210944))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                h1 h1Var = (h1) objArr[0];
                int i16 = 2 % 2;
                int i17 = extraCallback + 9;
                ICustomTabsCallback = i17 % 128;
                int i18 = i17 % 2;
                CharSequence charSequenceOnExtraCallback = onExtraCallback(h1Var);
                int i19 = ICustomTabsCallback + 9;
                extraCallback = i19 % 128;
                int i20 = i19 % 2;
                return charSequenceOnExtraCallback;
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asBinder(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(-2130874262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 2130874264, new Object[0], AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).booleanValue();
        int i4 = extraCallback + 57;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ String onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        String strExtraCallbackWithResult = extraCallbackWithResult();
        int i3 = ICustomTabsCallback + 87;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return strExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private RemoteWorkManager() {
    }

    static {
        writeTypedObject();
        Object[] objArr = new Object[1];
        a(new char[]{18123, 18058, 57671, 2466, 10252, 63823, 45469, 2145, 58614, 27614, 23322, 21527, 529}, (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        RemoteWorkManager remoteWorkManager = new RemoteWorkManager();
        onWarmupCompleted = remoteWorkManager;
        onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.api.cipher.ApiCipher$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Boolean boolValueOf = Boolean.valueOf(RemoteWorkManager.onExtraCallbackWithResult());
                int i4 = IAuthTabCallback + 71;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return boolValueOf;
            }
        });
        onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.api.cipher.ApiCipher$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 45;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String strOnNavigationEvent = RemoteWorkManager.onNavigationEvent();
                int i4 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return strOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        asInterface = new Object();
        IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.api.cipher.ApiCipher$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    textRoundCornerProgressBarSavedState1OnExtraCallback = RemoteWorkManager.onExtraCallback();
                    int i3 = 17 / 0;
                } else {
                    textRoundCornerProgressBarSavedState1OnExtraCallback = RemoteWorkManager.onExtraCallback();
                }
                int i4 = onExtraCallback + 87;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return textRoundCornerProgressBarSavedState1OnExtraCallback;
                }
                throw null;
            }
        });
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{remoteWorkManager}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        Object[] objArr2 = new Object[1];
        a(new char[]{29072, 29152, 15094, 53800, 5, 53578, 23311, 58057}, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
        IAuthTabCallbackDefault = textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) objArr2[0]).intern(), "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState12 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{remoteWorkManager}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        Object[] objArr3 = new Object[1];
        b(null, new byte[]{-123, -126, -124, -125, -126, -127}, null, (Process.myTid() >> 22) + 127, objArr3);
        onExtraCallbackWithResult = textRoundCornerProgressBarSavedState12.onExtraCallbackWithResult(((String) objArr3[0]).intern(), "");
        onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.api.cipher.ApiCipher$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback = RemoteWorkManager.IAuthTabCallback();
                    int i3 = 42 / 0;
                } else {
                    constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback = RemoteWorkManager.IAuthTabCallback();
                }
                int i4 = onExtraCallback + 59;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback;
            }
        });
        int i = readTypedObject + 39;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 119;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) onNavigationEvent.getValue();
        if (i3 != 0) {
            return Boolean.valueOf(bool.booleanValue());
        }
        bool.booleanValue();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(getInterfaceDescriptor ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 11;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(getInterfaceDescriptor)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getTapTimeout() >> 16)), 84 - TextUtils.getOffsetBefore("", 0), 21233 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 14185), 19 - (Process.myPid() >> 22), 8808 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 53;
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

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            Native.load();
            int i4 = extraCallback + 57;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        } catch (LinkageError e) {
            AndroidCharacter.getMirror('0');
            Color.rgb(0, 0, 0);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a(new char[]{18123, 18058, 57671, 2466, 10252, 63823, 45469, 2145, 58614, 27614, 23322, 21527, 529}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new char[]{64508, 64390, 47010, 24388, 11856, 65294, 19867, 62528, 22920, 15653, 23887, 43047, 48957, 39657, 15335, 2567, 7532, 30810, 38420, 21641, 29389, 50741, 29779, 46959, 53300, 41972, 54015, 4423, 13860, 329, 45331, 29598, 35804, 61222, 28482, 56935, 59772, 19697, 52731, 14451, 20324, 10818, 43040, 39572, 44180, 34845, 1603, 58660, 523, 21939, 58594, 18292, 24620, 13120, 17200, 41350, 50632}, (Process.myTid() >> 22) + 1, objArr3);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr3[0]).intern(), e, (Map) null, 8, (Object) null);
            auth.IAuthTabCallback(auth.onNavigationEvent, e, null, 2, null);
            return false;
        }
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = (String) onExtraCallback.getValue();
        int i3 = extraCallback + 103;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static final String extraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        EnumEntries entries = h1.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            int i2 = extraCallback + 81;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            if (onExtraCallback.onExtraCallbackWithResult[((h1) obj).ordinal()] == 1) {
                int i4 = extraCallback + 3;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = {onWarmupCompleted};
                if (((Boolean) onExtraCallbackWithResult(2108936004, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -2108936000, objArr, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).booleanValue()) {
                }
            }
            arrayList.add(obj);
            int i6 = ICustomTabsCallback + 109;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{21540, 21512, 37441, 23578, 21834}, (Process.myPid() >> 22) + 1, objArr2);
        return CollectionsKt.joinToString$default(arrayList, ((String) objArr2[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.components.api.cipher.ApiCipher$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 71;
                onExtraCallback = i9 % 128;
                Object[] objArr3 = {(h1) obj2};
                if (i9 % 2 != 0) {
                    return (CharSequence) RemoteWorkManager.onExtraCallbackWithResult(-2012415029, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 2012415034, objArr3, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
                }
                int i10 = 6 / 0;
                return (CharSequence) RemoteWorkManager.onExtraCallbackWithResult(-2012415029, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 2012415034, objArr3, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
            }
        }, 30, (Object) null);
    }

    private static final CharSequence onExtraCallback(h1 h1Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(h1Var, "");
        String value = h1Var.getValue();
        int i4 = ICustomTabsCallback + 85;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return value;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder;
        }
        throw null;
    }

    public final boolean access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault.length();
            throw null;
        }
        if (IAuthTabCallbackDefault.length() > 0 && onExtraCallbackWithResult.length() > 0) {
            return true;
        }
        int i3 = extraCallback + 83;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
            if (IAuthTabCallbackDefault()) {
                if (IAuthTabCallbackStubProxy()) {
                    int i4 = ICustomTabsCallback + 25;
                    extraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else if (!(!IAuthTabCallbackDefault())) {
        }
        return false;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        if (getInterfaceDescriptor().length() <= 0) {
            return false;
        }
        int i2 = ICustomTabsCallback + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallbackStub().length() <= 0) {
            return false;
        }
        int i4 = ICustomTabsCallback + 15;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = IAuthTabCallbackStub.getValue();
        if (i3 != 0) {
            return (TextRoundCornerProgressBarSavedState1) value;
        }
        int i4 = 0 / 0;
        return (TextRoundCornerProgressBarSavedState1) value;
    }

    private static final TextRoundCornerProgressBarSavedState1 onActivityLayout() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RequestPostMessageChannel;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            textRoundCornerProgressBarSavedState1RequestPostMessageChannel = ((RealInterceptorChain) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), RealInterceptorChain.class)).extraCallback().requestPostMessageChannel();
            int i3 = 5 / 0;
        } else {
            Response response2 = Response.onNavigationEvent;
            textRoundCornerProgressBarSavedState1RequestPostMessageChannel = ((RealInterceptorChain) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), RealInterceptorChain.class)).extraCallback().requestPostMessageChannel();
        }
        int i4 = extraCallback + 125;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return textRoundCornerProgressBarSavedState1RequestPostMessageChannel;
    }

    private final void onWarmupCompleted(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 41;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault = str;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        Object[] objArr = new Object[1];
        a(new char[]{29072, 29152, 15094, 53800, 5, 53578, 23311, 58057}, 1 - KeyEvent.getDeadChar(0, 0), objArr);
        textRoundCornerProgressBarSavedState1.IAuthTabCallback(((String) objArr[0]).intern(), str, true);
        int i4 = extraCallback + 113;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    private final void onNavigationEvent(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult = str;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        Object[] objArr = new Object[1];
        b(null, new byte[]{-123, -126, -124, -125, -126, -127}, null, Color.alpha(0) + 127, objArr);
        textRoundCornerProgressBarSavedState1.IAuthTabCallback(((String) objArr[0]).intern(), str, true);
        int i4 = ICustomTabsCallback + 97;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onTransact(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        Object[] objArr = new Object[1];
        a(new char[]{42557, 42570, 23543, 45831, 52917, 8189, 6087, 44584, 1058, 53627, 48562}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        textRoundCornerProgressBarSavedState1.IAuthTabCallback(((String) objArr[0]).intern(), str, true);
        int i4 = ICustomTabsCallback + 81;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInterfaceDescriptor() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 25;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        Object[] objArr = new Object[1];
        a(new char[]{42557, 42570, 23543, 45831, 52917, 8189, 6087, 44584, 1058, 53627, 48562}, -Process.getGidForName(""), objArr);
        String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) objArr[0]).intern(), "");
        int i4 = ICustomTabsCallback + 57;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    private final void IAuthTabCallbackStub(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 45;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        Object[] objArr = new Object[1];
        b(null, new byte[]{-123, -126, -124, -125, -126, -120, -121, -126, -122}, null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, objArr);
        textRoundCornerProgressBarSavedState1.IAuthTabCallback(((String) objArr[0]).intern(), str, true);
        int i4 = ICustomTabsCallback + 109;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String IAuthTabCallbackStub() throws Throwable {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        Object obj;
        int i = 2 % 2;
        int i2 = extraCallback + 45;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted4 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        if (i3 != 0) {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, iOnWarmupCompleted, -1589628262, objArr, iOnWarmupCompleted3, iOnWarmupCompleted4, iOnWarmupCompleted2);
            Object[] objArr2 = new Object[1];
            b(null, new byte[]{-123, -126, -124, -125, -126, -120, -121, -126, -122}, null, 70 >> (ViewConfiguration.getMinimumFlingVelocity() % 67), objArr2);
            obj = objArr2[0];
        } else {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, iOnWarmupCompleted, -1589628262, objArr, iOnWarmupCompleted3, iOnWarmupCompleted4, iOnWarmupCompleted2);
            Object[] objArr3 = new Object[1];
            b(null, new byte[]{-123, -126, -124, -125, -126, -120, -121, -126, -122}, null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, objArr3);
            obj = objArr3[0];
        }
        String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) obj).intern(), "");
        int i4 = ICustomTabsCallback + 45;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final void IAuthTabCallback(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 77;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        Object[] objArr = new Object[1];
        a(new char[]{9298, 9253, 44905, 18329, 51063, 5695, 35321, 12301, 34403, 9721, 46202, 27720, 24735, 33318, 53964, 52748, 49863, 24733, 32565}, 1 - Color.blue(0), objArr);
        textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) objArr[0]).intern(), z, true);
        int i4 = ICustomTabsCallback + 35;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallbackStubProxy() throws Throwable {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        Object obj;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted4 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        if (i3 == 0) {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, iOnWarmupCompleted, -1589628262, objArr, iOnWarmupCompleted3, iOnWarmupCompleted4, iOnWarmupCompleted2);
            Object[] objArr2 = new Object[1];
            a(new char[]{9298, 9253, 44905, 18329, 51063, 5695, 35321, 12301, 34403, 9721, 46202, 27720, 24735, 33318, 53964, 52748, 49863, 24733, 32565}, (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        } else {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, iOnWarmupCompleted, -1589628262, objArr, iOnWarmupCompleted3, iOnWarmupCompleted4, iOnWarmupCompleted2);
            Object[] objArr3 = new Object[1];
            a(new char[]{9298, 9253, 44905, 18329, 51063, 5695, 35321, 12301, 34403, 9721, 46202, 27720, 24735, 33318, 53964, 52748, 49863, 24733, 32565}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
            obj = objArr3[0];
        }
        return textRoundCornerProgressBarSavedState1.onExtraCallback(((String) obj).intern(), false);
    }

    private final void IAuthTabCallbackDefault(String str) throws Throwable {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        Object obj;
        int i = 2 % 2;
        int i2 = extraCallback + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted4 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        if (i3 != 0) {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, iOnWarmupCompleted, -1589628262, objArr, iOnWarmupCompleted3, iOnWarmupCompleted4, iOnWarmupCompleted2);
            ViewConfiguration.getWindowTouchSlop();
            Object[] objArr2 = new Object[1];
            a(new char[]{38847, 38859, 55937, 12925, 45295, 25000, 12839, 35837, 13720, 20508, 50160, 55171, 54119}, 0, objArr2);
            obj = objArr2[0];
        } else {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, iOnWarmupCompleted, -1589628262, objArr, iOnWarmupCompleted3, iOnWarmupCompleted4, iOnWarmupCompleted2);
            Object[] objArr3 = new Object[1];
            a(new char[]{38847, 38859, 55937, 12925, 45295, 25000, 12839, 35837, 13720, 20508, 50160, 55171, 54119}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr3);
            obj = objArr3[0];
        }
        textRoundCornerProgressBarSavedState1.IAuthTabCallback(((String) obj).intern(), str, true);
    }

    private final String readTypedObject() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        Object[] objArr = new Object[1];
        a(new char[]{38847, 38859, 55937, 12925, 45295, 25000, 12839, 35837, 13720, 20508, 50160, 55171, 54119}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) objArr[0]).intern(), "");
        int i4 = extraCallback + 31;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ConstraintsSizeResolverExternalSyntheticLambda0 onActivityResized() {
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0 = (ConstraintsSizeResolverExternalSyntheticLambda0) onTransact.getValue();
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return constraintsSizeResolverExternalSyntheticLambda0;
    }

    private static final ConstraintsSizeResolverExternalSyntheticLambda0 onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = extraCallback + 67;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
        if (i3 == 0) {
            return ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
        }
        ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        String strOnExtraCallbackWithResult;
        synchronized (asInterface) {
            EstimateFaceQualityFromBGRImage estimateFaceQualityFromBGRImage = EstimateFaceQualityFromBGRImage.IAuthTabCallback;
            RemoteWorkManager remoteWorkManager = onWarmupCompleted;
            strOnExtraCallbackWithResult = estimateFaceQualityFromBGRImage.onExtraCallbackWithResult(remoteWorkManager.readTypedObject() + remoteWorkManager.onActivityResized().onNavigationEvent());
        }
        return strOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        RemoteWorkManager remoteWorkManager = (RemoteWorkManager) objArr[0];
        synchronized (asInterface) {
            asBinder = true;
            Unit unit = Unit.INSTANCE;
        }
        remoteWorkManager.onExtraCallback("", "");
        remoteWorkManager.extraCallback();
        remoteWorkManager.onExtraCallbackWithResult("");
        return null;
    }

    public final void onExtraCallback(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        synchronized (asInterface) {
            RemoteWorkManager remoteWorkManager = onWarmupCompleted;
            remoteWorkManager.onWarmupCompleted(str);
            remoteWorkManager.onNavigationEvent(str2);
            if (asBinder && str.length() > 0) {
                asBinder = false;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallbackStubProxy;
        char c = '0';
        if (cArr2 != null) {
            int i4 = $10 + 99;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), ImageFormat.getBitsPerPixel(0) + 78, 20951 - TextUtils.indexOf("", c, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(access100)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 75 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (!(!access000)) {
                int i7 = $11 + 59;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i9 = $11 + 15;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] % iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 63 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12214 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 64 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 12214 - Color.red(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (IAuthTabCallback_Parcel) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 63 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $10 + 43;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] >>> iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            String str = new String(cArr6);
            int i11 = $10 + 47;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            objArr[0] = str;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        RemoteWorkManager remoteWorkManager = (RemoteWorkManager) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() > 0) {
            int i4 = ICustomTabsCallback + 105;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (str2.length() > 0) {
                int i6 = extraCallback + 89;
                ICustomTabsCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    remoteWorkManager.onTransact(str);
                    remoteWorkManager.IAuthTabCallbackStub(str2);
                    throw null;
                }
                remoteWorkManager.onTransact(str);
                remoteWorkManager.IAuthTabCallbackStub(str2);
            }
        }
        int i7 = extraCallback + 99;
        ICustomTabsCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 5 / 0;
        }
        return null;
    }

    private final void extraCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact("");
        IAuthTabCallbackStub("");
        IAuthTabCallback(false);
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (asInterface) {
            onWarmupCompleted.IAuthTabCallbackDefault(str);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final String onExtraCallback(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (asInterface) {
            if (onExtraCallbackWithResult.length() == 0) {
                RemoteWorkManager remoteWorkManager = onWarmupCompleted;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{remoteWorkManager}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
                Object[] objArr = new Object[1];
                b(null, new byte[]{-123, -126, -124, -125, -126, -127}, null, 127 - (Process.myTid() >> 22), objArr);
                remoteWorkManager.onNavigationEvent(textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) objArr[0]).intern(), ""));
            }
            str2 = onExtraCallbackWithResult;
        }
        return str2;
    }

    public final String IAuthTabCallback(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (asInterface) {
            if (IAuthTabCallbackDefault.length() == 0) {
                RemoteWorkManager remoteWorkManager = onWarmupCompleted;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{remoteWorkManager}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
                Object[] objArr = new Object[1];
                a(new char[]{29072, 29152, 15094, 53800, 5, 53578, 23311, 58057}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
                remoteWorkManager.onWarmupCompleted(textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) objArr[0]).intern(), ""));
            }
            str2 = IAuthTabCallbackDefault;
        }
        return str2;
    }

    public static /* synthetic */ DiagnosticsWorker onNavigationEvent(RemoteWorkManager remoteWorkManager, TTAppOpenAdTransActivity tTAppOpenAdTransActivity, String str, String str2, DiagnosticsWorker.IAuthTabCallback iAuthTabCallback, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 121;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 8) != 0) {
            iAuthTabCallback = DiagnosticsWorker.IAuthTabCallback.GZIP;
            int i5 = extraCallback + 105;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return remoteWorkManager.onNavigationEvent(tTAppOpenAdTransActivity, str, str2, iAuthTabCallback);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final DiagnosticsWorker onNavigationEvent(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull String str, @NotNull String str2, @NotNull DiagnosticsWorker.IAuthTabCallback iAuthTabCallback) throws Throwable {
        byte[] bArrOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DiagnosticsWorker.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
        byte[] bArrOnMinimized = onMinimized();
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrOnMinimized);
        if (!tTAppOpenAdTransActivity.asBinder(513L)) {
            iAuthTabCallback2 = DiagnosticsWorker.IAuthTabCallback.NONE;
        }
        int i2 = onExtraCallback.onNavigationEvent[iAuthTabCallback2.ordinal()];
        if (i2 != 1) {
            int i3 = ICustomTabsCallback;
            int i4 = i3 + 107;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == 2) {
                bArrOnWarmupCompleted = onWarmupCompleted((TTHistoryActivity42) tTAppOpenAdTransActivity);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = i3 + 81;
                extraCallback = i6 % 128;
                int i7 = i6 % 2;
                bArrOnWarmupCompleted = tTAppOpenAdTransActivity.extraCallback();
            }
        } else {
            bArrOnWarmupCompleted = (byte[]) onExtraCallbackWithResult(2098252349, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -2098252348, new Object[]{this, tTAppOpenAdTransActivity}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        }
        String strOnExtraCallbackWithResult = Page.onExtraCallbackWithResult(setProgressColor.Companion.onExtraCallbackWithResult(str2, gCMParameterSpec, PageKey.onWarmupCompleted(str, null, 1, null)).a_(bArrOnWarmupCompleted), 0, 1, null);
        if (strOnExtraCallbackWithResult.length() != 0) {
            return new DiagnosticsWorker(strOnExtraCallbackWithResult, bArrOnMinimized, iAuthTabCallback2);
        }
        Object[] objArr = new Object[1];
        b(null, new byte[]{-106, -119, -112, -107, -115, -116, -126, -118, -108, -109, -110, -111, -127, -112, -113, -123, -127, -114, -115, -116, -123, -117, -118, -119, -126}, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        throw new BaseRoundCornerProgressBarSavedState(((String) objArr[0]).intern());
    }

    public final DiagnosticsWorker onExtraCallbackWithResult(@NotNull JsonElement jsonElement, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        try {
            wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
            iAuthTabCallback.onExtraCallback();
            HomeWatcherReceiver.IAuthTabCallback(iAuthTabCallback, JsonElement.Companion.serializer(), jsonElement, tTBaseActivity);
            DiagnosticsWorker diagnosticsWorkerOnNavigationEvent = onNavigationEvent(onWarmupCompleted, tTBaseActivity, str, str2, null, 8, null);
            CloseableKt.closeFinally(tTBaseActivity, (Throwable) null);
            int i2 = ICustomTabsCallback + 113;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 0;
            }
            return diagnosticsWorkerOnNavigationEvent;
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException, onProgressChanged {
        RemoteWorkManager remoteWorkManager = (RemoteWorkManager) objArr[0];
        DiagnosticsWorker diagnosticsWorker = (DiagnosticsWorker) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(diagnosticsWorker, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bArrOnExtraCallbackWithResult = setProgressColor.Companion.onNavigationEvent(str2, new GCMParameterSpec(128, diagnosticsWorker.onExtraCallback().access000()), PageKey.onWarmupCompleted(str, null, 1, null)).onExtraCallbackWithResult(Page.onNavigationEvent(diagnosticsWorker.onWarmupCompleted(), 0, 1, null));
        int i2 = onExtraCallback.onNavigationEvent[diagnosticsWorker.IAuthTabCallback().ordinal()];
        if (i2 == 1) {
            return remoteWorkManager.IAuthTabCallback(bArrOnExtraCallbackWithResult);
        }
        int i3 = extraCallback + 77;
        int i4 = i3 % 128;
        ICustomTabsCallback = i4;
        if (i3 % 2 == 0 ? i2 == 2 : i2 == 4) {
            return remoteWorkManager.onExtraCallbackWithResult(bArrOnExtraCallbackWithResult);
        }
        int i5 = i4 + 91;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String str3 = new String(bArrOnExtraCallbackWithResult, Charsets.UTF_8);
        int i7 = ICustomTabsCallback + 63;
        extraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 94 / 0;
        }
        return str3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final byte[] onExtraCallbackWithResult(@NotNull DiagnosticsWorker diagnosticsWorker, @NotNull String str, @NotNull String str2) throws NoWhenBranchMatchedException, onProgressChanged {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(diagnosticsWorker, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bArrOnExtraCallbackWithResult = setProgressColor.Companion.onNavigationEvent(str2, new GCMParameterSpec(128, diagnosticsWorker.onExtraCallback().access000()), PageKey.onWarmupCompleted(str, null, 1, null)).onExtraCallbackWithResult(Page.onNavigationEvent(diagnosticsWorker.onWarmupCompleted(), 0, 1, null));
        int i2 = onExtraCallback.onNavigationEvent[diagnosticsWorker.IAuthTabCallback().ordinal()];
        if (i2 == 1) {
            return onExtraCallback(bArrOnExtraCallbackWithResult);
        }
        int i3 = ICustomTabsCallback + 123;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (i2 != 2) {
            if (i2 == 3) {
                return bArrOnExtraCallbackWithResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        byte[] bArr = (byte[]) onExtraCallbackWithResult(89616576, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -89616570, new Object[]{this, bArrOnExtraCallbackWithResult}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        int i5 = extraCallback + 123;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return bArr;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TTHistoryActivity42 tTHistoryActivity42 = (TTHistoryActivity42) objArr[1];
        int i = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.IAuthTabCallback(new GZIPOutputStream(byteArrayOutputStream)));
        try {
            tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallbackWithResult(tTHistoryActivity42);
            Object obj = null;
            CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult, (Throwable) null);
            try {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                CloseableKt.closeFinally(byteArrayOutputStream, (Throwable) null);
                Intrinsics.checkNotNullExpressionValue(byteArray, "");
                int i2 = ICustomTabsCallback + 61;
                extraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return byteArray;
                }
                obj.hashCode();
                throw null;
            } finally {
            }
        } finally {
        }
    }

    private final String IAuthTabCallback(byte[] bArr) {
        int i = 2 % 2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(bArr)), Charsets.UTF_8), 8192);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            Object obj = null;
            CloseableKt.closeFinally(bufferedReader, (Throwable) null);
            int i2 = extraCallback + 95;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return text;
            }
            obj.hashCode();
            throw null;
        } finally {
        }
    }

    private final byte[] onExtraCallback(byte[] bArr) {
        int i = 2 % 2;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(bArr)), 8192);
        try {
            byte[] bytes = ByteStreamsKt.readBytes(bufferedInputStream);
            CloseableKt.closeFinally(bufferedInputStream, (Throwable) null);
            int i2 = extraCallback + 77;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return bytes;
        } finally {
        }
    }

    private final byte[] onWarmupCompleted(TTHistoryActivity42 tTHistoryActivity42) {
        int i = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.IAuthTabCallback(new ZstdOutputStream(byteArrayOutputStream)));
        try {
            tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallbackWithResult(tTHistoryActivity42);
            CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult, (Throwable) null);
            try {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                CloseableKt.closeFinally(byteArrayOutputStream, (Throwable) null);
                Intrinsics.checkNotNullExpressionValue(byteArray, "");
                int i2 = ICustomTabsCallback + 121;
                extraCallback = i2 % 128;
                int i3 = i2 % 2;
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    private final String onExtraCallbackWithResult(byte[] bArr) {
        int i = 2 % 2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream) new ZstdInputStream(new ByteArrayInputStream(bArr)), Charsets.UTF_8), 8192);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, (Throwable) null);
            int i2 = ICustomTabsCallback + 123;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 29 / 0;
            }
            return text;
        } finally {
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ZstdInputStream(new ByteArrayInputStream((byte[]) objArr[1])), 8192);
        try {
            byte[] bytes = ByteStreamsKt.readBytes(bufferedInputStream);
            CloseableKt.closeFinally(bufferedInputStream, (Throwable) null);
            int i2 = ICustomTabsCallback + 7;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            return bytes;
        } finally {
        }
    }

    private final byte[] onMinimized() {
        int i = 2 % 2;
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        int i2 = ICustomTabsCallback + 85;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return bArr;
    }

    public static /* synthetic */ CharSequence onExtraCallbackWithResult(h1 h1Var) {
        return (CharSequence) onExtraCallbackWithResult(-2012415029, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 2012415034, new Object[]{h1Var}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    private final TextRoundCornerProgressBarSavedState1 ICustomTabsCallback() {
        return (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult(1589628262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1589628262, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    private final byte[] onExtraCallback(TTHistoryActivity42 tTHistoryActivity42) {
        return (byte[]) onExtraCallbackWithResult(2098252349, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -2098252348, new Object[]{this, tTHistoryActivity42}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    private static final boolean onPostMessage() {
        return ((Boolean) onExtraCallbackWithResult(-2130874262, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 2130874264, new Object[0], AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).booleanValue();
    }

    private final byte[] onWarmupCompleted(byte[] bArr) {
        return (byte[]) onExtraCallbackWithResult(89616576, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -89616570, new Object[]{this, bArr}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    public final void onWarmupCompleted() {
        onExtraCallbackWithResult(-831430487, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 831430494, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    public final String onNavigationEvent(@NotNull DiagnosticsWorker diagnosticsWorker, @NotNull String str, @NotNull String str2) {
        return (String) onExtraCallbackWithResult(-1131521150, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1131521153, new Object[]{this, diagnosticsWorker, str, str2}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    public final boolean access100() {
        return ((Boolean) onExtraCallbackWithResult(2108936004, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -2108936000, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).booleanValue();
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        onExtraCallbackWithResult(-1652917707, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1652917715, new Object[]{this, str, str2}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    static void writeTypedObject() {
        getInterfaceDescriptor = -6501175774074137703L;
        IAuthTabCallbackStubProxy = new char[]{32549, 32601, 32587, 32563, 32589, 32591, 32548, 32517, 32592, 32603, 32596, 32598, 32586, 32566, 32594, 32599, 32602, 32742, 32569, 32590, 32605, 32741};
        access100 = -1184333882;
        IAuthTabCallback_Parcel = true;
        access000 = true;
    }
}
