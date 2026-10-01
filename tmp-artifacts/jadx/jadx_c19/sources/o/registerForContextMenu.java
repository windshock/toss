package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.alibaba.ariver.kernel.RVParams;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class registerForContextMenu implements Serializable {
    private static int $10 = 0;
    private static int $11 = 1;
    protected static final registerForContextMenu IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    protected static final registerForContextMenu onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static long onWarmupCompleted = 0;
    private static final long serialVersionUID = 1;
    protected final boolean _isContentTextual;
    protected final int _length;
    protected final int _maxRawContentLength;
    protected final int _offset;
    protected final transient Object onExtraCallback;

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int i2 = 2 % 2;
        int i3 = asBinder + 109;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i2 = 2 % 2;
        int i3 = asBinder + 29;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        asInterface();
        Object obj = null;
        IAuthTabCallback = new registerForContextMenu(false, null);
        onExtraCallbackWithResult = new registerForContextMenu(false, null);
        int i2 = onNavigationEvent + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $11 + 111;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16823028), AndroidCharacter.getMirror('0') + '$', 21233 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 19 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 8808 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 25;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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

    @Deprecated
    protected registerForContextMenu(boolean z, Object obj) {
        this(z, obj, -1, -1, getSharedElementReturnTransition.IAuthTabCallback());
    }

    protected registerForContextMenu(boolean z, Object obj, getSharedElementReturnTransition getsharedelementreturntransition) {
        this(z, obj, -1, -1, getsharedelementreturntransition);
    }

    protected registerForContextMenu(boolean z, Object obj, int i2, int i3, getSharedElementReturnTransition getsharedelementreturntransition) {
        this._isContentTextual = z;
        this.onExtraCallback = obj;
        this._offset = i2;
        this._length = i3;
        this._maxRawContentLength = getsharedelementreturntransition.onExtraCallback();
    }

    public static registerForContextMenu onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = asBinder + 7;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        registerForContextMenu registerforcontextmenu = IAuthTabCallback;
        int i6 = i4 + 105;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return registerforcontextmenu;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static registerForContextMenu onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        registerForContextMenu registerforcontextmenu = onExtraCallbackWithResult;
        int i6 = i3 + 73;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return registerforcontextmenu;
    }

    public static registerForContextMenu IAuthTabCallback(boolean z, Object obj, int i2, int i3, getSharedElementReturnTransition getsharedelementreturntransition) {
        int i4 = 2 % 2;
        registerForContextMenu registerforcontextmenu = new registerForContextMenu(z, obj, i2, i3, getsharedelementreturntransition);
        int i5 = onTransact + 53;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return registerforcontextmenu;
    }

    public static registerForContextMenu onExtraCallbackWithResult(boolean z, Object obj, getSharedElementReturnTransition getsharedelementreturntransition) {
        int i2 = 2 % 2;
        registerForContextMenu registerforcontextmenu = new registerForContextMenu(z, obj, getsharedelementreturntransition);
        int i3 = onTransact + 3;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return registerforcontextmenu;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static registerForContextMenu onExtraCallback(boolean z, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 11;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if (!(!(obj instanceof registerForContextMenu))) {
            int i6 = i4 + 7;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return (registerForContextMenu) obj;
        }
        return new registerForContextMenu(z, obj);
    }

    public static registerForContextMenu IAuthTabCallback(Object obj) {
        int i2 = 2 % 2;
        int i3 = asBinder + 43;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return onExtraCallback(false, obj);
    }

    protected Object readResolve() {
        int i2 = 2 % 2;
        int i3 = asBinder + 17;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean IAuthTabCallbackStub() {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asBinder + 5;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 == 0) {
            z = this._isContentTextual;
            int i5 = 31 / 0;
        } else {
            z = this._isContentTextual;
        }
        int i6 = i4 + 61;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public Object IAuthTabCallbackDefault() {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 31;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Object obj = this.onExtraCallback;
        int i6 = i3 + 31;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return obj;
    }

    public int onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = asBinder + 25;
        int i4 = i3 % 128;
        onTransact = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = this._offset;
        int i6 = i4 + 67;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    public int onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onTransact + 85;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return this._length;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected int onTransact() {
        int i2 = 2 % 2;
        int i3 = onTransact + 109;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        int i6 = this._maxRawContentLength;
        int i7 = i4 + 25;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String IAuthTabCallback() {
        int i2 = 2 % 2;
        String string = onExtraCallback(new StringBuilder(RVParams.WEBVIEW_FONT_SIZE_LARGEST)).toString();
        int i3 = asBinder + 21;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public StringBuilder onExtraCallback(StringBuilder sb) throws Throwable {
        int i2 = 2 % 2;
        Object objIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        String strIAuthTabCallback = null;
        if (objIAuthTabCallbackDefault == null) {
            int i3 = asBinder + 79;
            int i4 = i3 % 128;
            onTransact = i4;
            int i5 = i3 % 2;
            if (this != onExtraCallbackWithResult) {
                Object[] objArr = new Object[1];
                a(new char[]{8484, 47228, 49676, 24143, 8561, 29506, 21671, 15441, 3243, 16667, 1762}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr);
                sb.append(((String) objArr[0]).intern());
                return sb;
            }
            int i6 = i4 + 99;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                sb.append("REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled)");
                return sb;
            }
            sb.append("REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled)");
            throw null;
        }
        Class<?> cls = objIAuthTabCallbackDefault instanceof Class ? (Class) objIAuthTabCallbackDefault : objIAuthTabCallbackDefault.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (objIAuthTabCallbackDefault instanceof byte[]) {
            name = "byte[]";
        } else if (objIAuthTabCallbackDefault instanceof char[]) {
            int i7 = asBinder + 3;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            name = "char[]";
        }
        sb.append('(');
        sb.append(name);
        sb.append(')');
        if (IAuthTabCallbackStub()) {
            int iOnTransact = onTransact();
            int[] iArr = {onWarmupCompleted(), onNavigationEvent()};
            String str = " chars";
            if (objIAuthTabCallbackDefault instanceof CharSequence) {
                int i9 = asBinder + 41;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    onExtraCallback((CharSequence) objIAuthTabCallbackDefault, iArr, iOnTransact);
                    strIAuthTabCallback.hashCode();
                    throw null;
                }
                strIAuthTabCallback = onExtraCallback((CharSequence) objIAuthTabCallbackDefault, iArr, iOnTransact);
            } else if (objIAuthTabCallbackDefault instanceof char[]) {
                strIAuthTabCallback = onExtraCallbackWithResult((char[]) objIAuthTabCallbackDefault, iArr, iOnTransact);
            } else if (objIAuthTabCallbackDefault instanceof byte[]) {
                int i10 = onTransact + 83;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
                strIAuthTabCallback = IAuthTabCallback((byte[]) objIAuthTabCallbackDefault, iArr, iOnTransact);
                str = " bytes";
            }
            if (strIAuthTabCallback != null) {
                onWarmupCompleted(sb, strIAuthTabCallback);
                if (iArr[1] > iOnTransact) {
                    sb.append("[truncated ");
                    sb.append(iArr[1] - iOnTransact);
                    sb.append(str);
                    sb.append(']');
                    return sb;
                }
            }
        } else if (objIAuthTabCallbackDefault instanceof byte[]) {
            int iOnNavigationEvent = onNavigationEvent();
            if (iOnNavigationEvent < 0) {
                int i12 = asBinder + 123;
                onTransact = i12 % 128;
                if (i12 % 2 == 0) {
                    int length = ((byte[]) objIAuthTabCallbackDefault).length;
                    throw null;
                }
                iOnNavigationEvent = ((byte[]) objIAuthTabCallbackDefault).length;
            }
            sb.append('[');
            sb.append(iOnNavigationEvent);
            sb.append(" bytes]");
        }
        return sb;
    }

    protected String onExtraCallback(CharSequence charSequence, int[] iArr, int i2) {
        CharSequence charSequenceSubSequence;
        int i3 = 2 % 2;
        int i4 = asBinder + 77;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            onWarmupCompleted(iArr, charSequence.length());
            int i5 = iArr[1];
            charSequenceSubSequence = charSequence.subSequence(i5, Math.min(i5, i2) >> i5);
        } else {
            onWarmupCompleted(iArr, charSequence.length());
            int i6 = iArr[0];
            charSequenceSubSequence = charSequence.subSequence(i6, Math.min(iArr[1], i2) + i6);
        }
        String string = charSequenceSubSequence.toString();
        int i7 = onTransact + 27;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected String onExtraCallbackWithResult(char[] cArr, int[] iArr, int i2) {
        int i3 = 2 % 2;
        onWarmupCompleted(iArr, cArr.length);
        String str = new String(cArr, iArr[0], Math.min(iArr[1], i2));
        int i4 = asBinder + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    protected String IAuthTabCallback(byte[] bArr, int[] iArr, int i2) {
        int i3 = 2 % 2;
        onWarmupCompleted(iArr, bArr.length);
        String str = new String(bArr, iArr[0], Math.min(iArr[1], i2), StandardCharsets.UTF_8);
        int i4 = onTransact + 107;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return str;
    }

    protected void onWarmupCompleted(int[] iArr, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = asBinder;
        int i6 = i5 + 75;
        onTransact = i6 % 128;
        if (i6 % 2 != 0 ? (i3 = iArr[0]) < 0 : (i3 = iArr[1]) < 0) {
            i3 = 0;
        } else if (i3 >= i2) {
            int i7 = i5 + 47;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            i3 = i2;
        }
        iArr[0] = i3;
        int i9 = iArr[1];
        int i10 = i2 - i3;
        if (i9 < 0 || i9 > i10) {
            iArr[1] = i10;
            return;
        }
        int i11 = i5 + 61;
        onTransact = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected int onWarmupCompleted(StringBuilder sb, String str) {
        int i2 = 2 % 2;
        sb.append('\"');
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i4 = onTransact + 93;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            char cCharAt = str.charAt(i3);
            if (!Character.isISOControl(cCharAt) || !IAuthTabCallback(sb, cCharAt)) {
                sb.append(cCharAt);
            }
            i3++;
            int i6 = asBinder + 27;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
        sb.append('\"');
        return str.length();
    }

    protected boolean IAuthTabCallback(StringBuilder sb, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact;
        int i5 = i4 + 43;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (i2 == 13 || i2 == 10) {
            int i7 = i4 + 117;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        sb.append('\\');
        sb.append('u');
        sb.append(postponeEnterTransition.onWarmupCompleted((i2 >> 12) & 15));
        sb.append(postponeEnterTransition.onWarmupCompleted((i2 >> 8) & 15));
        sb.append(postponeEnterTransition.onWarmupCompleted((i2 >> 4) & 15));
        sb.append(postponeEnterTransition.onWarmupCompleted(i2 & 15));
        int i8 = asBinder + 89;
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r9 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r2 = r2 + 53;
        o.registerForContextMenu.asBinder = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if ((r9 instanceof o.registerForContextMenu) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r9 = (o.registerForContextMenu) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r8._offset != r9._offset) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r8._length != r9._length) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        r9 = r9.onExtraCallback;
        r1 = r8.onExtraCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r9 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r9 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r2 = r2 + 87;
        o.registerForContextMenu.asBinder = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if ((r2 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        if ((r1 instanceof java.io.File) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if ((r1 instanceof java.net.URL) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
    
        r6 = r2 + 59;
        o.registerForContextMenu.asBinder = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if ((r1 instanceof java.net.URI) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        if (r1 != r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        r2 = r2 + 43;
        o.registerForContextMenu.asBinder = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0076, code lost:
    
        if ((r2 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0078, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        return r1.equals(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 119;
        o.registerForContextMenu.asBinder = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = asBinder + 49;
        int i4 = i3 % 128;
        onTransact = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            int i5 = 6 / 0;
        }
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onTransact + 27;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Objects.hashCode(this.onExtraCallback);
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        return iHashCode;
    }

    static void asInterface() {
        onWarmupCompleted = -2033081699407384452L;
    }
}
