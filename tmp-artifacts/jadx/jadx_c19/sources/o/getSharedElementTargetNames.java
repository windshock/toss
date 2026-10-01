package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getSharedElementTargetNames implements Serializable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final getSharedElementTargetNames IAuthTabCallback;
    private static int IAuthTabCallbackStub = 0;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 0;
    private static final long serialVersionUID = 2;
    protected final int _columnNr;
    protected final registerForContextMenu _contentReference;
    protected final int _lineNr;
    protected final long _totalBytes;
    protected final long _totalChars;
    protected transient String onNavigationEvent;

    static {
        onExtraCallbackWithResult();
        IAuthTabCallback = new getSharedElementTargetNames(registerForContextMenu.onExtraCallbackWithResult(), -1L, -1L, -1, -1);
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getSharedElementTargetNames(registerForContextMenu registerforcontextmenu, long j, int i2, int i3) {
        this(registerforcontextmenu, -1L, j, i2, i3);
    }

    public getSharedElementTargetNames(registerForContextMenu registerforcontextmenu, long j, long j2, int i2, int i3) {
        if (registerforcontextmenu == null) {
            registerforcontextmenu = registerForContextMenu.onExtraCallbackWithResult();
            int i4 = onTransact + 7;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this._contentReference = registerforcontextmenu;
        this._totalBytes = j;
        this._totalChars = j2;
        this._lineNr = i2;
        this._columnNr = i3;
        int i7 = onTransact + 31;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    public String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = this._contentReference.IAuthTabCallback();
        }
        String str = this.onNavigationEvent;
        int i5 = IAuthTabCallbackStub + 119;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int i7 = $10 + 77;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 35284), Color.rgb(0, 0, 0) + 16777251, ((Process.getThreadPriority(0) + 20) >> 6) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i9 = $11 + 27;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 64 - MotionEvent.axisFromString(""), 16718 - (KeyEvent.getMaxKeyCode() >> 16), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), View.MeasureSpec.getMode(0) + 29, 17657 - KeyEvent.keyCodeFromString(""), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.blue(0)), 69 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12486 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
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
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i14 = $10 + 121;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] << iArr[5]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r12.append("line: ");
        r1 = r11._lineNr;
        r6 = 72 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r1 < 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        r12.append("line: ");
        r1 = r11._lineNr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r1 < 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r6 = o.getSharedElementTargetNames.IAuthTabCallbackStub + 33;
        o.getSharedElementTargetNames.onTransact = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if ((r6 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        r12.append(r1);
        r1 = 67 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r12.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        r9 = new java.lang.Object[1];
        a(new int[]{0, 7, 69, 3}, false, new byte[]{0, 0, 1, 1, 1, 1, 1}, r9);
        r12.append(((java.lang.String) r9[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        r12.append(", column: ");
        r1 = r11._columnNr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r1 < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        r2 = o.getSharedElementTargetNames.IAuthTabCallbackStub + 63;
        o.getSharedElementTargetNames.onTransact = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if ((r2 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        r12.append(r1);
        r0 = 41 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        r12.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        r2 = new java.lang.Object[1];
        a(new int[]{0, 7, 69, 3}, false, new byte[]{0, 0, 1, 1, 1, 1, 1}, r2);
        r12.append(((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r11._lineNr <= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        r12.append("line: ");
        r12.append(r11._lineNr);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (r11._columnNr <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r12.append(", column: ");
        r12.append(r11._columnNr);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        r1 = o.getSharedElementTargetNames.IAuthTabCallbackStub + 101;
        o.getSharedElementTargetNames.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        r12.append("byte offset: #");
        r0 = r11._totalBytes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (r0 < 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        r12.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        r2 = new java.lang.Object[1];
        a(new int[]{0, 7, 69, 3}, false, new byte[]{0, 0, 1, 1, 1, 1, 1}, r2);
        r12.append(((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r11._contentReference.IAuthTabCallbackStub() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r11._contentReference.IAuthTabCallbackStub() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = o.getSharedElementTargetNames.onTransact + 71;
        o.getSharedElementTargetNames.IAuthTabCallbackStub = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StringBuilder IAuthTabCallback(StringBuilder sb) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 1;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 75;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        int i6 = this._contentReference == null ? 1 : 2;
        int i7 = (((i6 ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
        int i8 = i4 + 55;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (obj == this) {
            int i3 = IAuthTabCallbackStub + 51;
            onTransact = i3 % 128;
            return i3 % 2 != 0;
        }
        if (obj == null) {
            int i4 = IAuthTabCallbackStub + 125;
            onTransact = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!(obj instanceof getSharedElementTargetNames)) {
            return false;
        }
        getSharedElementTargetNames getsharedelementtargetnames = (getSharedElementTargetNames) obj;
        registerForContextMenu registerforcontextmenu = this._contentReference;
        if (registerforcontextmenu == null) {
            if (getsharedelementtargetnames._contentReference != null) {
                int i5 = IAuthTabCallbackStub;
                int i6 = i5 + 87;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 27;
                onTransact = i8 % 128;
                if (i8 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        } else if (!registerforcontextmenu.equals(getsharedelementtargetnames._contentReference)) {
            return false;
        }
        return this._lineNr == getsharedelementtargetnames._lineNr && this._columnNr == getsharedelementtargetnames._columnNr && this._totalChars == getsharedelementtargetnames._totalChars && this._totalBytes == getsharedelementtargetnames._totalBytes;
    }

    public String toString() throws Throwable {
        int i2 = 2 % 2;
        String strIAuthTabCallback = IAuthTabCallback();
        StringBuilder sb = new StringBuilder(strIAuthTabCallback.length() + 40);
        sb.append("[Source: ");
        sb.append(strIAuthTabCallback);
        sb.append("; ");
        StringBuilder sbIAuthTabCallback = IAuthTabCallback(sb);
        sbIAuthTabCallback.append(']');
        String string = sbIAuthTabCallback.toString();
        int i3 = onTransact + 57;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{27140, 27350, 27353, 27352, 27352, 27359, 27359};
    }
}
