package o;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ParamUtils1;
import o.adInfo;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ParamUtils1 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final ParamUtils1 IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface;
    private static final wie2 onExtraCallback;
    public static final String onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static final String onWarmupCompleted;

    public static /* synthetic */ Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(adinfo);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private ParamUtils1() {
    }

    static {
        onExtraCallbackWithResult();
        String str = "";
        Object[] objArr = new Object[1];
        a(new char[]{30368, 41153, 55895, 62923, 12105}, TextUtils.indexOf("", "", 0, 0) + 54907, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        IAuthTabCallback = new ParamUtils1();
        if ("".length() == 0) {
            int i = IAuthTabCallbackStub + 75;
            int i2 = i % 128;
            asBinder = i2;
            int i3 = i % 2;
            int i4 = i2 + 117;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = null;
        }
        onWarmupCompleted = str;
        onExtraCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.facepay.FaceSdk$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 59;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnNavigationEvent = ParamUtils1.onNavigationEvent((adInfo) obj);
                int i10 = onWarmupCompleted + 113;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                return unitOnNavigationEvent;
            }
        }, 1, (Object) null);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final wie2 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        wie2 wie2Var = onExtraCallback;
        int i5 = i3 + 55;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return wie2Var;
    }

    private static final Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallback(true);
        adinfo.onExtraCallbackWithResult(true);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 13;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 24 - TextUtils.getTrimmedLength(""), TextUtils.lastIndexOf("", '0', 0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 60 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $10 + 65;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 67;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 59 - View.resolveSize(0, 0), 6383 - (Process.myPid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = -3443951936699305053L;
    }
}
