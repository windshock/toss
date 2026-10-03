package viva.republica.toss.common.web.message.handlers;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.findResAndMsg;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RequestSelfieHandler$onSelfieImageReceived$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = {27255, 27198, 27172, 27179, 27181, 27151, 27245, 27144, 27175, 27199, 27194, 27170, 27173, 27138, 27245, 27145, 27199, 27140, 27144, 27170, 27176, 27180, 27178, 27175, 27173, 27168, 27194, 27196, 27198, 27198, 27175, 27151, 27146, 27168, 27168, 27198, 27141, 27245, 27144, 27174, 27171, 27196, 27196, 27173, 27142, 27245, 27148, 27172, 27175, 27188, 27199, 27174, 27197, 27168, 27190, 27170, 27197, 27168, 27199, 27195, 27196, 27176, 27158, 27199, 27176, 27197, 27194, 27168, 27191, 27168, 27175, 27175, 27144, 27260, 27169, 27196, 27257, 27159, 27157, 27198, 27176, 27181, 27178};
    private static int onWarmupCompleted = 1;
    final /* synthetic */ String $altCode;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ $contentOwner;
    final /* synthetic */ String $errorCode;
    final /* synthetic */ boolean $includeLivenessFaceImages;
    final /* synthetic */ setText $parsedMessage;
    final /* synthetic */ int $resultCode;
    final /* synthetic */ byte[] $selfieImage;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ RequestSelfieHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestSelfieHandler$onSelfieImageReceived$1(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, int i, setText settext, RequestSelfieHandler requestSelfieHandler, byte[] bArr, boolean z, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, String str2, access13800<? super RequestSelfieHandler$onSelfieImageReceived$1> access13800Var) {
        super(2, access13800Var);
        this.$contentOwner = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        this.$resultCode = i;
        this.$parsedMessage = settext;
        this.this$0 = requestSelfieHandler;
        this.$selfieImage = bArr;
        this.$includeLivenessFaceImages = z;
        this.$callbackProxy = setonoutofmemeryerrorcallback;
        this.$errorCode = str;
        this.$altCode = str2;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RequestSelfieHandler$onSelfieImageReceived$1 requestSelfieHandler$onSelfieImageReceived$1 = new RequestSelfieHandler$onSelfieImageReceived$1(this.$contentOwner, this.$resultCode, this.$parsedMessage, this.this$0, this.$selfieImage, this.$includeLivenessFaceImages, this.$callbackProxy, this.$errorCode, this.$altCode, access13800Var);
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return requestSelfieHandler$onSelfieImageReceived$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return onNavigationEvent(findresandmsg, access13800Var);
        }
        onNavigationEvent(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0167 A[PHI: r0 r1 r3
      0x0167: PHI (r0v27 boolean) = (r0v26 boolean), (r0v39 boolean) binds: [B:33:0x0165, B:29:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r1v8 o.BaseRoundCornerProgressBarSavedState1$IAuthTabCallback) = 
      (r1v7 o.BaseRoundCornerProgressBarSavedState1$IAuthTabCallback)
      (r1v16 o.BaseRoundCornerProgressBarSavedState1$IAuthTabCallback)
     binds: [B:33:0x0165, B:29:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r3v6 java.lang.String) = (r3v5 java.lang.String), (r3v9 java.lang.String) binds: [B:33:0x0165, B:29:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestSelfieHandler$onSelfieImageReceived$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int i7 = $11 + 71;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 77;
                $10 = i9 % 128;
                int i10 = i9 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.combineMeasuredStates(0, 0)), 35 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 14240 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = $10 + 73;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i13 = $11 + 29;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i15 = $10 + 3;
                $11 = i15 % 128;
                if (i15 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (Process.myTid() >> 22) + 29, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 10935), 65 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - MotionEvent.axisFromString("")), 70 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i18 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i18, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i18);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i19 = $10 + 3;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
