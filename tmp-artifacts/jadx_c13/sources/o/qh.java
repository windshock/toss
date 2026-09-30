package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.oq;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class qh extends qye {
    private static final byte[] $$a = {23, -38, -83, 70};
    private static final int $$b = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static long onWarmupCompleted = 4234594740898432128L;
    private static int asBinder = -1776194565;
    private static char asInterface = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3 = 110 - s;
        byte[] bArr = $$a;
        int i4 = 4 - (i * 2);
        int i5 = b * 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i3 = i5;
            int i6 = i4;
            int i7 = 0;
            i3 += -i4;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i2 + 1;
            i6 = i4;
            i4 = bArr[i4];
            i7 = i8;
            i3 += -i4;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    @Override // o.qq
    void onWarmupCompleted(Appendable appendable, int i, oq.onExtraCallback onextracallback) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 97;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super.IAuthTabCallback();
        int i4 = onTransact + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ qq asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        qq qqVarAsBinder = super.asBinder();
        int i4 = onTransact + 93;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return qqVarAsBinder;
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ int cz_() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super.cz_();
        }
        super.cz_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ String onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            super.onExtraCallback(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnExtraCallback = super.onExtraCallback(str);
        int i3 = IAuthTabCallbackDefault + 57;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallback;
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ boolean onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super.onExtraCallbackWithResult(str);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult(str);
        int i3 = onTransact + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ String onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onNavigationEvent(str);
        }
        super.onNavigationEvent(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ qq onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        qq qqVarOnNavigationEvent = super.onNavigationEvent(str, str2);
        int i4 = onTransact + 45;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return qqVarOnNavigationEvent;
    }

    public qh(String str, String str2, String str3) throws Throwable {
        oas.onExtraCallback(str);
        oas.onExtraCallback(str2);
        oas.onExtraCallback(str3);
        Object[] objArr = new Object[1];
        a((char) (ExpandableListView.getPackedPositionType(0L) + 9356), View.resolveSize(0, 0), new char[]{51076, 33055, 55035, 2492}, new char[]{28539, 46300, 16717, 22270}, new char[]{56369, 65018, 36089, 5156}, objArr);
        onNavigationEvent(((String) objArr[0]).intern(), str);
        onNavigationEvent("publicId", str2);
        onNavigationEvent("systemId", str3);
        onExtraCallbackWithResult();
    }

    public void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (str != null) {
            onNavigationEvent("pubSysKey", str);
            int i4 = IAuthTabCallbackDefault + 23;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (onWarmupCompleted("systemId") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1 = o.qh.IAuthTabCallbackDefault + 99;
        o.qh.onTransact = r1 % 128;
        r1 = r1 % 2;
        onNavigationEvent("pubSysKey", "SYSTEM");
        r1 = o.qh.onTransact + 123;
        o.qh.IAuthTabCallbackDefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (onWarmupCompleted("publicId") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (onWarmupCompleted("publicId") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = o.qh.onTransact + 47;
        o.qh.IAuthTabCallbackDefault = r1 % 128;
        r1 = r1 % 2;
        onNavigationEvent("pubSysKey", "PUBLIC");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
    }

    @Override // o.qq
    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return "#doctype";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // o.qq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void IAuthTabCallback(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
            if (onextracallback.IAuthTabCallbackDefault() == oq.onExtraCallback.IAuthTabCallback.html) {
                if (onWarmupCompleted("publicId") || onWarmupCompleted("systemId")) {
                    appendable.append("<!DOCTYPE");
                } else {
                    appendable.append("<!doctype");
                }
            }
        } else if (onextracallback.IAuthTabCallbackDefault() == oq.onExtraCallback.IAuthTabCallback.html) {
        }
        Object[] objArr = new Object[1];
        a((char) (9356 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 1, new char[]{51076, 33055, 55035, 2492}, new char[]{28539, 46300, 16717, 22270}, new char[]{56369, 65018, 36089, 5156}, objArr);
        if (onWarmupCompleted(((String) objArr[0]).intern())) {
            Appendable appendableAppend = appendable.append(" ");
            Object[] objArr2 = new Object[1];
            a((char) (9356 - KeyEvent.normalizeMetaState(0)), ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{51076, 33055, 55035, 2492}, new char[]{28539, 46300, 16717, 22270}, new char[]{56369, 65018, 36089, 5156}, objArr2);
            appendableAppend.append(onExtraCallback(((String) objArr2[0]).intern()));
            int i5 = IAuthTabCallbackDefault + 71;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        if (onWarmupCompleted("pubSysKey")) {
            appendable.append(" ").append(onExtraCallback("pubSysKey"));
            int i7 = IAuthTabCallbackDefault + 77;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
        if (!(!onWarmupCompleted("publicId"))) {
            appendable.append(" \"").append(onExtraCallback("publicId")).append('\"');
        }
        if (onWarmupCompleted("systemId")) {
            appendable.append(" \"").append(onExtraCallback("systemId")).append('\"');
        }
        appendable.append('>');
    }

    private boolean onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = nfe.onNavigationEvent(onExtraCallback(str));
        return i3 == 0 ? zOnNavigationEvent : !zOnNavigationEvent;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i6 = $11 + 15;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $10 + 125;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char mode = (char) View.MeasureSpec.getMode(i5);
                    int packedPositionGroup = 43 - ExpandableListView.getPackedPositionGroup(0L);
                    int iIndexOf = TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 1451;
                    byte b = (byte) i5;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, packedPositionGroup, iIndexOf, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49123);
                        int iRed = Color.red(i5) + 44;
                        int capsMode = 1494 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, i5, i5);
                        byte b3 = (byte) ($$b & 5);
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatTimeout, iRed, capsMode, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), 50 - View.MeasureSpec.getSize(0), 22940 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                i2 = 2;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 45848), 29 - (ViewConfiguration.getLongPressTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i3 = i2;
                            i5 = 0;
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
        objArr[0] = new String(cArr6);
    }
}
