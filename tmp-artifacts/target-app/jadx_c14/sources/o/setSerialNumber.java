package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.LifecycleEventObserver;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.setSerialNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.PollingMotionInfoHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setSerialNumber implements ALCFaceQuality {
    private final IAuthTabCallback IAuthTabCallback;
    private final setTid<onNavigationEvent> onExtraCallback;
    private static final byte[] $$a = {79, 9, 94, -7};
    private static final int $$b = 252;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static long onExtraCallbackWithResult = 7798559133331975163L;
    private static int onNavigationEvent = -1730539120;
    private static char onWarmupCompleted = 27643;
    private static int[] IAuthTabCallbackStub = {-1239144726, 1211036547, -1979333197, -1811678392, 813806740, 824298451, -1750282798, -281298813, -1902484180, 1967778931, 1999005386, 1944364414, 1859018844, -926960687, 1837104155, 2146283766, -1251081549, 42975872};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = o.setSerialNumber.$$a
            int r6 = 110 - r6
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = r8 * 2
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L28:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSerialNumber.$$c(byte, int, byte):java.lang.String");
    }

    public static /* synthetic */ Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(setonoutofmemeryerrorcallback, onnavigationevent);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(setonoutofmemeryerrorcallback, onnavigationevent);
        int i3 = IAuthTabCallbackDefault + 77;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 1 / 0;
        }
        return unitOnNavigationEvent;
    }

    public setSerialNumber() {
        setTid<onNavigationEvent> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        this.onExtraCallback = settidOnNavigationEvent;
        this.IAuthTabCallback = new IAuthTabCallback();
    }

    public static final /* synthetic */ setTid onExtraCallback(setSerialNumber setserialnumber) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        setTid<onNavigationEvent> settid = setserialnumber.onExtraCallback;
        int i5 = i3 + 99;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return settid;
    }

    public static final /* synthetic */ IAuthTabCallback onWarmupCompleted(setSerialNumber setserialnumber) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = setserialnumber.IAuthTabCallback;
        int i5 = i3 + 7;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = asBinder + 123;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = asBinder + 43;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallbackDefault + 17;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
    }

    public static final class IAuthTabCallback extends DSAParameter {
        IAuthTabCallback() {
        }

        @Override // o.DSAParameter
        public void onExtraCallbackWithResult(float f, float f2, float f3) {
            double dOnExtraCallbackWithResult = 360.0d - onExtraCallbackWithResult(f);
            if (dOnExtraCallbackWithResult >= 360.0d) {
                dOnExtraCallbackWithResult -= 360.0d;
            }
            double dOnExtraCallbackWithResult2 = onExtraCallbackWithResult(f2);
            setSerialNumber.onExtraCallback(setSerialNumber.this).onExtraCallback(new onNavigationEvent(dOnExtraCallbackWithResult, -dOnExtraCallbackWithResult2, onExtraCallbackWithResult(f3)));
        }

        private final double onExtraCallbackWithResult(float f) {
            return Math.toDegrees(f);
        }
    }

    private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        a((char) (65237 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1259345595 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{16561, 18970, 61391, 22231, 58973}, new char[]{0, 0, 0, 0}, new char[]{48067, 4118, 54347, 39166}, objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), Double.valueOf(onnavigationevent.IAuthTabCallback()));
        Object[] objArr2 = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 56249), TextUtils.getCapsMode("", 0, 0), new char[]{17656, 11558, 29991, 4577}, new char[]{0, 0, 0, 0}, new char[]{42711, 12084, 47245, 61403}, objArr2);
        jsonObject.addProperty(((String) objArr2[0]).intern(), Double.valueOf(onnavigationevent.onExtraCallbackWithResult()));
        Object[] objArr3 = new Object[1];
        b(new int[]{-1057863348, -875594651, -617546581, 473803096}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, objArr3);
        jsonObject.addProperty(((String) objArr3[0]).intern(), Double.valueOf(onnavigationevent.onNavigationEvent()));
        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 7;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        return unit;
    }

    public void onExtraCallbackWithResult(@NotNull final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        final Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            setText settext = new setText(jsonObject);
            Object[] objArr = new Object[1];
            b(new int[]{1022963081, -1414265009, 1384382695, -1323036159}, 8 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
            Double doubleOrNull = StringsKt.toDoubleOrNull(settext.onNavigationEvent(((String) objArr[0]).intern(), ""));
            if (doubleOrNull != null) {
                long jOnExtraCallbackWithResult = getBacktraceNoteBytes.onExtraCallbackWithResult(doubleOrNull.doubleValue() * 1000.0d);
                r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getLifecycle().IAuthTabCallback(new LifecycleEventObserver() { // from class: viva.republica.toss.common.web.message.handlers.PollingMotionInfoHandler$onHandleMessage$1
                    public void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                        int i3 = IAuthTabCallback.IAuthTabCallback[onextracallbackwithresult.ordinal()];
                        if (i3 == 1) {
                            setSerialNumber.onWarmupCompleted(this.IAuthTabCallback).onWarmupCompleted(context);
                            return;
                        }
                        if (i3 == 2) {
                            setSerialNumber.onWarmupCompleted(this.IAuthTabCallback).onNavigationEvent(context);
                        } else {
                            if (i3 != 3) {
                                return;
                            }
                            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getLifecycle().onExtraCallbackWithResult(this);
                            setSerialNumber.onExtraCallback(this.IAuthTabCallback).onExtraCallback();
                        }
                    }
                });
                getByteBuffer getbytebufferIAuthTabCallbackDefault = this.onExtraCallback.IAuthTabCallbackDefault(jOnExtraCallbackWithResult, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(getbytebufferIAuthTabCallbackDefault, "");
                IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(getbytebufferIAuthTabCallbackDefault, (Function1) null, (Function0) null, new PollingMotionInfoHandler$.ExternalSyntheticLambda0(setonoutofmemeryerrorcallback), 3, (Object) null), r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            }
        }
        int i3 = IAuthTabCallbackDefault + 107;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 42 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-16775765) - Color.rgb(0, 0, 0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49123), View.resolveSizeAndState(0, 0, 0) + 44, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 23972), 50 - View.combineMeasuredStates(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 29 - (ViewConfiguration.getTouchSlop() >> 8), 12576 - TextUtils.indexOf((CharSequence) "", '0', 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i6 = $10 + 75;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i8 = $10 + 117;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallbackStub;
        int i3 = -1469660336;
        int i4 = 16;
        if (iArr3 != null) {
            int i5 = $10 + 15;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 63;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 72 - (ViewConfiguration.getTapTimeout() >> i4), ExpandableListView.getPackedPositionGroup(0L) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $10 + 117;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackStub;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 72 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.myTid() >> 22) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i11++;
                i3 = -1469660336;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 39, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 4033), TextUtils.lastIndexOf("", '0', 0, 0) + 79, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
