package viva.republica.toss.guest;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.isTestMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestPasswordResetViewModel extends isTestMode {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static long IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    public static final int onWarmupCompleted;
    private boolean onExtraCallback;
    private final TextLinkScopeExternalSyntheticLambda7 onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    static {
        onTransact();
        Companion = new IAuthTabCallback(null);
        onWarmupCompleted = 8;
        int i = asInterface + 37;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public GuestPasswordResetViewModel(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7) {
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        this.onExtraCallbackWithResult = textLinkScopeExternalSyntheticLambda7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        return r1.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        r1 = viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackDefault + 43;
        viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackStub = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        r0 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        r2 = viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackDefault + 99;
        viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackStub = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean IAuthTabCallbackStub() throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackStub
            int r1 = r1 + 95
            int r2 = r1 % 128
            viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackDefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L3a
            o.TextLinkScopeExternalSyntheticLambda7 r1 = r8.onExtraCallbackWithResult
            r3 = 29
            char[] r3 = new char[r3]
            r3 = {x0080: FILL_ARRAY_DATA , data: [24334, 17844, 27217, 4332, 13718, -9641, -16152, -6775, -30164, -20286, 21896, 31284, 24790, 1398, 10784, -12089, -2689, -26109, -32583, -23199, 18944, 28849, 5471, 14869, 8375, -15029, -5130, -28525, -19135} // fill-array
            long r4 = android.os.SystemClock.currentThreadTimeMillis()
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 25191(0x6267, float:3.53E-41)
            int r5 = r5 % r4
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            a(r3, r5, r4)
            r3 = r4[r2]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.intern()
            java.lang.Object r1 = r1.onExtraCallback(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L71
            goto L63
        L3a:
            o.TextLinkScopeExternalSyntheticLambda7 r1 = r8.onExtraCallbackWithResult
            r3 = 29
            char[] r3 = new char[r3]
            r3 = {x00a2: FILL_ARRAY_DATA , data: [24334, 17844, 27217, 4332, 13718, -9641, -16152, -6775, -30164, -20286, 21896, 31284, 24790, 1398, 10784, -12089, -2689, -26109, -32583, -23199, 18944, 28849, 5471, 14869, 8375, -15029, -5130, -28525, -19135} // fill-array
            long r4 = android.os.SystemClock.currentThreadTimeMillis()
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r4 = 6824 - r4
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            a(r3, r4, r5)
            r3 = r5[r2]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.intern()
            java.lang.Object r1 = r1.onExtraCallback(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L71
        L63:
            int r2 = viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackDefault
            int r2 = r2 + 99
            int r3 = r2 % 128
            viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackStub = r3
            int r2 = r2 % r0
            boolean r0 = r1.booleanValue()
            return r0
        L71:
            int r1 = viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackDefault
            int r1 = r1 + 43
            int r3 = r1 % 128
            viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackStub = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L7f
            r0 = 73
            int r0 = r0 / r2
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackStub():boolean");
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i3 + 21;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return z;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.onNavigationEvent = z;
        int i5 = i3 + 77;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i2 + 99;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = z;
        if (i3 == 0) {
            throw null;
        }
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        Boolean bool = (Boolean) this.onExtraCallbackWithResult.onExtraCallback("STATE_IS_START_CERTIFY");
        if (bool == null) {
            int i2 = IAuthTabCallbackDefault + 117;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        boolean zBooleanValue = bool.booleanValue();
        if (i5 != 0) {
            int i6 = 38 / 0;
        }
        return zBooleanValue;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.onWarmupCompleted("STATE_IS_START_CERTIFY", Boolean.valueOf(z));
            return;
        }
        this.onExtraCallbackWithResult.onWarmupCompleted("STATE_IS_START_CERTIFY", Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0068, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        r1 = r1.booleanValue();
        r2 = viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackDefault + 45;
        viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackStub = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onNavigationEvent() throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackDefault
            int r1 = r1 + 73
            int r2 = r1 % 128
            viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            r2 = 48497(0xbd71, float:6.7959E-41)
            r3 = 16
            java.lang.String r4 = ""
            r5 = 0
            if (r1 != 0) goto L39
            o.TextLinkScopeExternalSyntheticLambda7 r1 = r6.onExtraCallbackWithResult
            char[] r3 = new char[r3]
            r3 = {x0072: FILL_ARRAY_DATA , data: [24334, -7582, 9725, 26442, -21810, -5087, 12222, 28951, -19318, -2078, 14718, 31961, -16823, -15966, 823, 18075} // fill-array
            int r4 = android.text.TextUtils.indexOf(r4, r4, r5)
            int r2 = r2 << r4
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            a(r3, r2, r4)
            r2 = r4[r5]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.Object r1 = r1.onExtraCallback(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L71
            goto L5b
        L39:
            o.TextLinkScopeExternalSyntheticLambda7 r1 = r6.onExtraCallbackWithResult
            char[] r3 = new char[r3]
            r3 = {x0086: FILL_ARRAY_DATA , data: [24334, -7582, 9725, 26442, -21810, -5087, 12222, 28951, -19318, -2078, 14718, 31961, -16823, -15966, 823, 18075} // fill-array
            int r4 = android.text.TextUtils.indexOf(r4, r4, r5)
            int r4 = r4 + r2
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            a(r3, r4, r2)
            r2 = r2[r5]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.Object r1 = r1.onExtraCallback(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L71
        L5b:
            boolean r1 = r1.booleanValue()
            int r2 = viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackDefault
            int r2 = r2 + 45
            int r3 = r2 % 128
            viva.republica.toss.guest.GuestPasswordResetViewModel.IAuthTabCallbackStub = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L6b
            return r1
        L6b:
            r0 = 0
            r0.hashCode()
            r0 = 0
            throw r0
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetViewModel.onNavigationEvent():boolean");
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) this.onExtraCallbackWithResult.onExtraCallback("EXTRA_IS_FROM_LOGIN");
        if (bool == null) {
            return false;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = IAuthTabCallbackStub + 9;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 37;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), TextUtils.indexOf("", "") + 24, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() & (IAuthTabCallback + 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 59, 6383 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 24 - Gravity.getAbsoluteGravity(0, 0), 19627 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 58 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 6382 - TextUtils.lastIndexOf("", '0', 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i6 = $11 + 99;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 59 - View.resolveSize(0, 0), 6383 - (Process.myTid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    static void onTransact() {
        IAuthTabCallback = 1009105397580683900L;
    }
}
