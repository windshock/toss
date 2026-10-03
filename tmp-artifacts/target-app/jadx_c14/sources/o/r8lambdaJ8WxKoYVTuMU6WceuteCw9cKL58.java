package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.tosscert.ui.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.TypeUtils7;
import o.r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58;
import o.shortValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.password.PasswordFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58 {
    private static final byte[] $$a = {125, 44, 8, -98};
    private static final int $$b = 31;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static long onWarmupCompleted = 5633944859732497993L;
    private static int onExtraCallback = -1776194565;
    private static char onExtraCallbackWithResult = 27643;
    private static char[] IAuthTabCallback = {32564, 32566, 32545, 32554, 32547, 32603, 32606, 32551, 32522, 32575, 32571, 32517, 32534, 32560, 32523, 32570, 32515, 32514, 32512, 32526, 32532, 32519, 32513, 32574, 32516, 32533, 32527, 32568, 32521, 32569, 32548, 32544, 32602, 32549, 32607};
    private static int onNavigationEvent = -1184333865;
    private static boolean IAuthTabCallbackStub = true;
    private static boolean onTransact = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r8 = r8 + 4
            byte[] r0 = o.r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 + 109
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.$$c(int, short, int):java.lang.String");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[0];
        UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        shortValue.onNavigationEvent onnavigationevent = (shortValue.onNavigationEvent) objArr[3];
        String str = (String) objArr[4];
        String str2 = (String) objArr[5];
        isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objArr[6];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, jLongValue, onnavigationevent, str, str2, isjsontypeignore);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, jLongValue, onnavigationevent, str, str2, isjsontypeignore);
        int i3 = asBinder + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, String str, String str2, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, onnavigationevent, str, str2, th);
        }
        onExtraCallback(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, j, onnavigationevent, str, str2, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x056f A[EDGE_INSN: B:65:0x056f->B:56:0x056f BREAK  A[LOOP:0: B:47:0x0549->B:66:?]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x057a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object onExtraCallback(int r34, int r35, int r36, int r37, int r38, java.lang.Object[] r39, int r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.onExtraCallback(int, int, int, int, int, java.lang.Object[], int):java.lang.Object");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setTid settid = (setTid) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback3, -642205867, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{settid, dialogInterface}, 642205870);
        }
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(typeUtils7);
        int i4 = IAuthTabCallbackDefault + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ isJSONTypeIgnore onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(function1, obj);
        }
        onExtraCallbackWithResult(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ isJSONTypeIgnore onExtraCallbackWithResult(UTF8Decoder uTF8Decoder, asDouble asdouble) throws num, unwrapOptional, isXmlField, isProxy {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        isJSONTypeIgnore isjsontypeignoreOnNavigationEvent = onNavigationEvent(uTF8Decoder, asdouble);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 89;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return isjsontypeignoreOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, setTid settid, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(context, settid, commonModule_setLeftEdgeTouchEnabled);
        int i4 = asBinder + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, Intent intent, Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rememberLottieCompositionKtlottieComposition1, intent, bitmap);
        int i4 = IAuthTabCallbackDefault + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = asBinder + 61;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    @Inject
    public r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58() {
    }

    public static /* synthetic */ getByteBuffer onExtraCallbackWithResult(r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58 r8lambdaj8wxkoyvtumu6wceutecw9ckl58, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, boolean z, boolean z2, String str, String str2, shortValue.onNavigationEvent onnavigationevent, boolean z3, boolean z4, boolean z5, String str3, Function1 function1, boolean z6, int i, Object obj) {
        UTF8Decoder uTF8Decoder2;
        boolean z7;
        boolean z8;
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = asBinder + 65;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            uTF8Decoder2 = UTF8Decoder.UNKNOWN;
        } else {
            uTF8Decoder2 = uTF8Decoder;
        }
        boolean z9 = (i & 8) != 0 ? false : z;
        boolean z10 = (i & 16) != 0 ? false : z2;
        String str4 = (i & 32) != 0 ? null : str;
        String str5 = (i & 64) != 0 ? null : str2;
        boolean z11 = (i & 256) != 0 ? false : z3;
        if ((i & 512) != 0) {
            int i5 = IAuthTabCallbackDefault + 35;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z7 = false;
        } else {
            z7 = z4;
        }
        if ((i & 1024) != 0) {
            int i7 = IAuthTabCallbackDefault + 121;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            z8 = false;
        } else {
            z8 = z5;
        }
        return (getByteBuffer) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -506706108, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{r8lambdaj8wxkoyvtumu6wceutecw9ckl58, rememberLottieCompositionKtlottieComposition1, uTF8Decoder2, Long.valueOf(j), Boolean.valueOf(z9), Boolean.valueOf(z10), str4, str5, onnavigationevent, Boolean.valueOf(z11), Boolean.valueOf(z7), Boolean.valueOf(z8), str3, (i & 4096) != 0 ? new Function1() { // from class: viva.republica.toss.password.PinAuthPrompt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.onExtraCallback((TypeUtils7) obj2);
            }
        } : function1, Boolean.valueOf((i & 8192) == 0 ? z6 : false)}, 506706108);
    }

    private static final Unit onNavigationEvent(TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(typeUtils7, "");
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, Intent intent, Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            setInstallResult.IAuthTabCallback.onWarmupCompleted(bitmap);
            FragmentActivity activity = rememberLottieCompositionKtlottieComposition1.getActivity();
            if (activity != null) {
                activity.startActivity(intent);
                int i3 = asBinder + 95;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 % 2;
                }
            }
            return Unit.INSTANCE;
        }
        setInstallResult.IAuthTabCallback.onWarmupCompleted(bitmap);
        rememberLottieCompositionKtlottieComposition1.getActivity();
        throw null;
    }

    private static final isJSONTypeIgnore onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) function1.invoke(obj);
        int i3 = asBinder + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return isjsontypeignore;
    }

    private static final isJSONTypeIgnore onNavigationEvent(UTF8Decoder uTF8Decoder, asDouble asdouble) throws num, unwrapOptional, isXmlField, isProxy {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(asdouble, "");
            return r8lambdaNISr3ZgihCdsRcRopFrHwKc0N6I.onExtraCallbackWithResult(asdouble, uTF8Decoder);
        }
        Intrinsics.checkNotNullParameter(asdouble, "");
        isJSONTypeIgnore isjsontypeignoreOnExtraCallbackWithResult = r8lambdaNISr3ZgihCdsRcRopFrHwKc0N6I.onExtraCallbackWithResult(asdouble, uTF8Decoder);
        int i3 = 35 / 0;
        return isjsontypeignoreOnExtraCallbackWithResult;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 43;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, String str, String str2, isJSONTypeIgnore isjsontypeignore) throws Throwable {
        String loginYN;
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        Object obj = null;
        String strValueOf = String.valueOf(indicatorViewAccess100 != null ? indicatorViewAccess100.getLogValue() : null);
        String eventName = isjsontypeignore.IAuthTabCallback().getEventName();
        PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
        String strOnNavigationEvent = getColorInstance.onNavigationEvent(rememberLottieCompositionKtlottieComposition1, onextracallbackwithresult.onExtraCallbackWithResult(uTF8Decoder));
        String strOnNavigationEvent2 = getColorInstance.onNavigationEvent(rememberLottieCompositionKtlottieComposition1, onextracallbackwithresult.IAuthTabCallback(uTF8Decoder));
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1835826654);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 30 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 24887, -1546421070, false, "IAuthTabCallbackDefault", new Class[0]);
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(obj2, null)).intValue();
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            if (indicatorViewAccess1002 != null) {
                int i4 = asBinder + 27;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    indicatorViewAccess1002.getLoginYN();
                    obj.hashCode();
                    throw null;
                }
                loginYN = indicatorViewAccess1002.getLoginYN();
            } else {
                loginYN = null;
            }
            String eventValue = uTF8Decoder.getEventValue();
            Object[] objArr = new Object[1];
            a((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1233311057, new char[]{57952, 22632, 14243, 48725, 15231, 22361, 63845}, new char[]{15794, 38495, 50998, 8725}, new char[]{20836, 33493, 24649, 25623}, objArr);
            asMaplambda6.onNavigationEvent(asmaplambda6, strValueOf, eventName, ((String) objArr[0]).intern(), "", strOnNavigationEvent, strOnNavigationEvent2, iIntValue, j, onnavigationevent, loginYN, str, null, eventValue, str2, 2048, null);
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallbackDefault + 9;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = asBinder + 31;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $10 + 59;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 35;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i3));
                    int mirror = '[' - AndroidCharacter.getMirror('0');
                    int i8 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1451;
                    byte b = (byte) ($$b & 1);
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, mirror, i8, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i3;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.blue(i3)), (Process.myTid() >> 22) + 44, 1494 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23972), 50 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 22939 - TextUtils.indexOf("", ""), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    c2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, Color.alpha(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit onExtraCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, String str, String str2, Throwable th) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 91;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if (!(th instanceof isKotlinIgnore)) {
            int i6 = i4 + 111;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return Unit.INSTANCE;
        }
        if (th instanceof unwrapOptional) {
            int i8 = i2 + 113;
            asBinder = i8 % 128;
            if (i8 % 2 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            str.hashCode();
            throw null;
        }
        if (th instanceof num) {
            return Unit.INSTANCE;
        }
        asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        String strValueOf = String.valueOf(indicatorViewAccess100 != null ? indicatorViewAccess100.getLogValue() : null);
        isKotlinIgnore iskotlinignore = (isKotlinIgnore) th;
        String eventName = iskotlinignore.onExtraCallbackWithResult().getEventName();
        if (th instanceof isProxy) {
            Object[] objArr = new Object[1];
            b(null, new byte[]{-123, -124, -127, -125, -126, -127}, null, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((char) (29513 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.getMaxKeyCode() >> 16, new char[]{4022, 5708, 3851, 18220}, new char[]{15794, 38495, 50998, 8725}, new char[]{57496, 29194, 18654, 29043}, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        String string = iskotlinignore.toString();
        PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
        String strOnNavigationEvent = getColorInstance.onNavigationEvent(rememberLottieCompositionKtlottieComposition1, onextracallbackwithresult.onExtraCallbackWithResult(uTF8Decoder));
        String strOnNavigationEvent2 = getColorInstance.onNavigationEvent(rememberLottieCompositionKtlottieComposition1, onextracallbackwithresult.IAuthTabCallback(uTF8Decoder));
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 30, Color.red(0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 30 - Color.alpha(0), 24887 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(obj2, null)).intValue();
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            asMaplambda6.onNavigationEvent(asmaplambda6, strValueOf, eventName, strIntern, string, strOnNavigationEvent, strOnNavigationEvent2, iIntValue, j, onnavigationevent, indicatorViewAccess1002 != null ? indicatorViewAccess1002.getLoginYN() : null, str, null, uTF8Decoder.getEventValue(), str2, 2048, null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull final setTid<Boolean> settid) {
        final Context context;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
            Intrinsics.checkNotNullParameter(settid, "");
            boolean z = rememberLottieCompositionKtlottieComposition1 instanceof Activity;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Intrinsics.checkNotNullParameter(settid, "");
        if (rememberLottieCompositionKtlottieComposition1 instanceof Activity) {
            context = (Activity) rememberLottieCompositionKtlottieComposition1;
        } else {
            int i3 = IAuthTabCallbackDefault + 7;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            context = null;
        }
        if (context == null) {
            int i5 = IAuthTabCallbackDefault + 19;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            context = ((Fragment) rememberLottieCompositionKtlottieComposition1).getContext();
        }
        if (context != null) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.password.PinAuthPrompt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2) {
                    return r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.onNavigationEvent(context, settid, (CommonModule_setLeftEdgeTouchEnabled) obj2);
                }
            });
            return;
        }
        settid.onExtraCallback(Boolean.TRUE);
        int i7 = IAuthTabCallbackDefault + 47;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setTid settid = (setTid) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            settid.onExtraCallback(Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        settid.onExtraCallback(Boolean.TRUE);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 125;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onWarmupCompleted(Context context, final setTid settid, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(viva.republica.toss.R.string.app_biometric_password_required));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.password.PinAuthPrompt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                Object[] objArr2 = {settid, (DialogInterface) obj};
                int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                return (Unit) r8lambdaJ8WxKoYVTuMU6WceuteCw9cKL58.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1738050423, iIAuthTabCallback, iIAuthTabCallback2, objArr2, -1738050422);
            }
        })};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 91;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int i3 = $11 + 23;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 77 - TextUtils.getCapsMode("", 0, 0), 20952 - (Process.myTid() >> 22), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), KeyEvent.keyCodeFromString("") + 75, TextUtils.indexOf("", "", 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (onTransact) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $11 + 13;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 63 - (ViewConfiguration.getFadingEdgeLength() >> 16), 12213 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            String str = new String(cArr4);
            int i9 = $10 + 111;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
            return;
        }
        if (!IAuthTabCallbackStub) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            try {
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 63, 12214 - TextUtils.getTrimmedLength(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i6 = 1052772399;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ Unit onExtraCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, long j, shortValue.onNavigationEvent onnavigationevent, String str, String str2, isJSONTypeIgnore isjsontypeignore) {
        Object[] objArr = {rememberLottieCompositionKtlottieComposition1, uTF8Decoder, Long.valueOf(j), onnavigationevent, str, str2, isjsontypeignore};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1247425533, iIAuthTabCallback, iIAuthTabCallback2, objArr, -1247425531);
    }

    public static /* synthetic */ Unit onNavigationEvent(setTid settid, DialogInterface dialogInterface) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback3, 1738050423, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{settid, dialogInterface}, -1738050422);
    }

    private static final Unit onExtraCallback(setTid settid, DialogInterface dialogInterface) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback3, -642205867, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{settid, dialogInterface}, 642205870);
    }

    public final getByteBuffer<isJSONTypeIgnore> IAuthTabCallback(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull UTF8Decoder uTF8Decoder, long j, boolean z, boolean z2, @Nullable String str, @Nullable String str2, @Nullable shortValue.onNavigationEvent onnavigationevent, boolean z3, boolean z4, boolean z5, @NotNull String str3, @NotNull Function1<? super TypeUtils7, Unit> function1, boolean z6) {
        Object[] objArr = {this, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), str, str2, onnavigationevent, Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), str3, function1, Boolean.valueOf(z6)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (getByteBuffer) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -506706108, iIAuthTabCallback, iIAuthTabCallback2, objArr, 506706108);
    }
}
