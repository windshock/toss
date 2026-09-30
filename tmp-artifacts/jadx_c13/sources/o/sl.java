package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class sl implements Cloneable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String[] IAuthTabCallback;
    private static final String[] IAuthTabCallbackDefault;
    private static final Map<String, sl> IAuthTabCallbackStub;
    private static char[] ICustomTabsCallback = null;
    private static final String[] asBinder;
    private static int extraCallbackWithResult = 1;
    private static final String[] onExtraCallback;
    private static final String[] onExtraCallbackWithResult;
    private static int onMinimized = 0;
    private static final String[] onNavigationEvent;
    private static int onPostMessage = 1;
    private static final String[] onWarmupCompleted;
    private static int writeTypedObject;
    private String extraCallback;
    private String getInterfaceDescriptor;
    private boolean access100 = true;
    private boolean access000 = true;
    private boolean asInterface = false;
    private boolean readTypedObject = false;
    private boolean IAuthTabCallback_Parcel = false;
    private boolean onTransact = false;
    private boolean IAuthTabCallbackStubProxy = false;

    protected /* synthetic */ Object clone() throws CloneNotSupportedException {
        sl slVarOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onPostMessage + 37;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            slVarOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 60 / 0;
        } else {
            slVarOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        int i4 = onPostMessage + 103;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return slVarOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallbackStubProxy();
        IAuthTabCallbackStub = new HashMap();
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 120, 2}, true, new byte[]{0, 1, 0, 1, 1}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{5, 5, 126, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{10, 4, 143, 4}, true, null, objArr3);
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", strIntern, "meta", "link", strIntern2, "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", ((String) objArr3[0]).intern(), "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        IAuthTabCallback = strArr;
        Object[] objArr4 = new Object[1];
        a(new int[]{14, 5, 0, 0}, true, new byte[]{0, 1, 1, 0, 1}, objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new int[]{19, 6, 0, 1}, false, new byte[]{0, 0, 1, 1, 0, 1}, objArr5);
        String strIntern4 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new int[]{25, 4, 196, 0}, true, new byte[]{1, 1, 1, 1}, objArr6);
        IAuthTabCallbackDefault = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", strIntern3, "select", "textarea", "label", strIntern4, "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", ((String) objArr6[0]).intern(), "bdi", "s", "strike", "nobr"};
        Object[] objArr7 = new Object[1];
        a(new int[]{14, 5, 0, 0}, true, new byte[]{0, 1, 1, 0, 1}, objArr7);
        onExtraCallback = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", ((String) objArr7[0]).intern(), "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        Object[] objArr8 = new Object[1];
        a(new int[]{5, 5, 126, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr8);
        String strIntern5 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a(new int[]{0, 5, 120, 2}, true, new byte[]{0, 1, 0, 1, 1}, objArr9);
        onExtraCallbackWithResult = new String[]{strIntern5, "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", ((String) objArr9[0]).intern(), "ins", "del", "s"};
        Object[] objArr10 = new Object[1];
        a(new int[]{5, 5, 126, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr10);
        asBinder = new String[]{"pre", "plaintext", ((String) objArr10[0]).intern(), "textarea"};
        Object[] objArr11 = new Object[1];
        a(new int[]{19, 6, 0, 1}, false, new byte[]{0, 0, 1, 1, 0, 1}, objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a(new int[]{14, 5, 0, 0}, true, new byte[]{0, 1, 1, 0, 1}, objArr12);
        onNavigationEvent = new String[]{strIntern6, "fieldset", ((String) objArr12[0]).intern(), "keygen", "object", "output", "select", "textarea"};
        Object[] objArr13 = new Object[1];
        a(new int[]{14, 5, 0, 0}, true, new byte[]{0, 1, 1, 0, 1}, objArr13);
        onWarmupCompleted = new String[]{((String) objArr13[0]).intern(), "keygen", "object", "select", "textarea"};
        for (int i = 0; i < 69; i++) {
            IAuthTabCallback(new sl(strArr[i]));
        }
        for (String str : IAuthTabCallbackDefault) {
            sl slVar = new sl(str);
            slVar.access100 = false;
            slVar.access000 = false;
            IAuthTabCallback(slVar);
        }
        String[] strArr2 = onExtraCallback;
        int length = strArr2.length;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = extraCallbackWithResult + 25;
            writeTypedObject = i5 % 128;
            if (i5 % i2 != 0) {
                sl slVar2 = IAuthTabCallbackStub.get(strArr2[i4]);
                oas.onExtraCallback(slVar2);
                slVar2.asInterface = true;
                i4 += 30;
            } else {
                sl slVar3 = IAuthTabCallbackStub.get(strArr2[i4]);
                oas.onExtraCallback(slVar3);
                slVar3.asInterface = true;
                i4++;
            }
            i2 = 2;
        }
        for (String str2 : onExtraCallbackWithResult) {
            sl slVar4 = IAuthTabCallbackStub.get(str2);
            oas.onExtraCallback(slVar4);
            slVar4.access000 = false;
        }
        int i6 = 0;
        String[] strArr3 = asBinder;
        int length2 = strArr3.length;
        int i7 = writeTypedObject + 81;
        extraCallbackWithResult = i7 % 128;
        int i8 = 2;
        int i9 = i7 % 2;
        int i10 = 0;
        while (i10 < length2) {
            int i11 = extraCallbackWithResult + 93;
            writeTypedObject = i11 % 128;
            int i12 = i11 % i8;
            sl slVar5 = IAuthTabCallbackStub.get(strArr3[i10]);
            oas.onExtraCallback(slVar5);
            slVar5.IAuthTabCallback_Parcel = true;
            i10++;
            i8 = 2;
        }
        String[] strArr4 = onNavigationEvent;
        int length3 = strArr4.length;
        int i13 = 0;
        while (i13 < length3) {
            int i14 = extraCallbackWithResult + 93;
            writeTypedObject = i14 % 128;
            if (i14 % 2 != 0) {
                sl slVar6 = IAuthTabCallbackStub.get(strArr4[i13]);
                oas.onExtraCallback(slVar6);
                slVar6.onTransact = true;
                i13 += 69;
            } else {
                sl slVar7 = IAuthTabCallbackStub.get(strArr4[i13]);
                oas.onExtraCallback(slVar7);
                slVar7.onTransact = true;
                i13++;
            }
        }
        String[] strArr5 = onWarmupCompleted;
        int length4 = strArr5.length;
        int i15 = writeTypedObject + 87;
        extraCallbackWithResult = i15 % 128;
        int i16 = i15 % 2;
        while (i6 < length4) {
            int i17 = writeTypedObject + 69;
            extraCallbackWithResult = i17 % 128;
            if (i17 % 2 == 0) {
                sl slVar8 = IAuthTabCallbackStub.get(strArr5[i6]);
                oas.onExtraCallback(slVar8);
                slVar8.IAuthTabCallbackStubProxy = true;
                i6 += 65;
            } else {
                sl slVar9 = IAuthTabCallbackStub.get(strArr5[i6]);
                oas.onExtraCallback(slVar9);
                slVar9.IAuthTabCallbackStubProxy = true;
                i6++;
            }
        }
    }

    private sl(String str) {
        this.extraCallback = str;
        this.getInterfaceDescriptor = oiz.onExtraCallbackWithResult(str);
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 39;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        String str = this.extraCallback;
        int i5 = i2 + 33;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = onMinimized + 37;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getInterfaceDescriptor;
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return str;
    }

    public static sl onExtraCallback(String str, sjd sjdVar) {
        int i = 2 % 2;
        int i2 = onMinimized + 103;
        onPostMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            oas.onExtraCallback(str);
            Map<String, sl> map = IAuthTabCallbackStub;
            sl slVar = map.get(str);
            if (slVar != null) {
                return slVar;
            }
            String strIAuthTabCallback = sjdVar.IAuthTabCallback(str);
            oas.onExtraCallbackWithResult(strIAuthTabCallback);
            sl slVar2 = map.get(oiz.onExtraCallbackWithResult(strIAuthTabCallback));
            if (slVar2 == null) {
                sl slVar3 = new sl(strIAuthTabCallback);
                slVar3.access100 = false;
                return slVar3;
            }
            if (!sjdVar.IAuthTabCallback() || !(!strIAuthTabCallback.equals(r3))) {
                int i3 = onPostMessage + 83;
                onMinimized = i3 % 128;
                if (i3 % 2 == 0) {
                    return slVar2;
                }
                obj.hashCode();
                throw null;
            }
            int i4 = onMinimized + 59;
            onPostMessage = i4 % 128;
            if (i4 % 2 != 0) {
                sl slVarOnExtraCallbackWithResult = slVar2.onExtraCallbackWithResult();
                slVarOnExtraCallbackWithResult.extraCallback = strIAuthTabCallback;
                return slVarOnExtraCallbackWithResult;
            }
            slVar2.onExtraCallbackWithResult().extraCallback = strIAuthTabCallback;
            throw null;
        }
        oas.onExtraCallback(str);
        IAuthTabCallbackStub.get(str);
        obj.hashCode();
        throw null;
    }

    public static sl onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onPostMessage + 15;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(str, sjd.onExtraCallbackWithResult);
            throw null;
        }
        sl slVarOnExtraCallback = onExtraCallback(str, sjd.onExtraCallbackWithResult);
        int i3 = onPostMessage + 43;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            return slVarOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 75;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.access100;
        int i5 = i2 + 65;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 47;
        int i3 = i2 % 128;
        onMinimized = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.access000;
        int i4 = i3 + 91;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 65;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        boolean z = !this.access100;
        int i5 = i2 + 93;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return z;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 101;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.asInterface;
        int i5 = i2 + 39;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean asInterface() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 73;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        if (!this.asInterface) {
            int i5 = i2 + 23;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
            if (!this.readTypedObject) {
                return false;
            }
        }
        int i7 = onMinimized + 5;
        onPostMessage = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onMinimized + 107;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zContainsKey = IAuthTabCallbackStub.containsKey(this.extraCallback);
        int i4 = onMinimized + 57;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return zContainsKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onPostMessage + 11;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub.containsKey(str);
            throw null;
        }
        boolean zContainsKey = IAuthTabCallbackStub.containsKey(str);
        int i3 = onMinimized + 19;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return zContainsKey;
    }

    public boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onPostMessage + 75;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallback_Parcel;
        int i5 = i3 + 111;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean asBinder() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 95;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onTransact;
        int i4 = i2 + 97;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return z;
    }

    sl IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onPostMessage + 49;
        int i3 = i2 % 128;
        onMinimized = i3;
        if (i2 % 2 != 0) {
            this.readTypedObject = false;
        } else {
            this.readTypedObject = true;
        }
        int i4 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return this;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl)) {
            return false;
        }
        sl slVar = (sl) obj;
        if (!this.extraCallback.equals(slVar.extraCallback) || this.asInterface != slVar.asInterface) {
            return false;
        }
        if (this.access000 != slVar.access000) {
            int i2 = onPostMessage + 95;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.access100 != slVar.access100) {
            int i4 = onPostMessage + 81;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.IAuthTabCallback_Parcel != slVar.IAuthTabCallback_Parcel || this.readTypedObject != slVar.readTypedObject) {
            return false;
        }
        if (this.onTransact != slVar.onTransact) {
            int i5 = onPostMessage + 9;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.IAuthTabCallbackStubProxy != slVar.IAuthTabCallbackStubProxy) {
            return false;
        }
        int i7 = onMinimized + 17;
        onPostMessage = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onPostMessage + 19;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.extraCallback.hashCode() * 31) + (this.access100 ? 1 : 0)) * 31) + (this.access000 ? 1 : 0)) * 31) + (this.asInterface ? 1 : 0)) * 31) + (this.readTypedObject ? 1 : 0)) * 31) + (this.IAuthTabCallback_Parcel ? 1 : 0)) * 31) + (this.onTransact ? 1 : 0)) * 31) + (this.IAuthTabCallbackStubProxy ? 1 : 0);
        int i4 = onMinimized + 119;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = ICustomTabsCallback;
        long j = 0;
        Throwable th = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.resolveSize(0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 36, 14239 - (Process.myTid() >> 22), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = $11 + 7;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16766281) - Color.rgb(0, 0, 0)), 65 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 16718 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(th, objArr3)).charValue();
                            throw th;
                        } catch (Throwable th3) {
                            Throwable cause2 = th3.getCause();
                            if (cause2 == null) {
                                throw th3;
                            }
                            throw cause2;
                        }
                    }
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 10935), 65 - ExpandableListView.getPackedPositionGroup(0L), 16719 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, View.MeasureSpec.getSize(0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49466), 71 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                th = null;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
            int i13 = $11 + 3;
            $10 = i13 % 128;
            i = 2;
            int i14 = i13 % 2;
        } else {
            i = 2;
        }
        if (z) {
            int i15 = $11 + 87;
            $10 = i15 % 128;
            int i16 = i15 % i;
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
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i17 = $10 + 89;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onMinimized + 7;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return this.extraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected sl onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 59;
        onMinimized = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                sl slVar = (sl) super.clone();
                int i3 = onMinimized + 43;
                onPostMessage = i3 % 128;
                if (i3 % 2 != 0) {
                    return slVar;
                }
                obj.hashCode();
                throw null;
            }
            obj.hashCode();
            throw null;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void IAuthTabCallback(sl slVar) {
        int i = 2 % 2;
        int i2 = onMinimized + 23;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub.put(slVar.extraCallback, slVar);
        int i4 = onPostMessage + 71;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void IAuthTabCallbackStubProxy() {
        ICustomTabsCallback = new char[]{27192, 27301, 27306, 27310, 27300, 27191, 27298, 27298, 27296, 27304, 27315, 27318, 27326, 27314, 27252, 27194, 27196, 27169, 27173, 27257, 27174, 27173, 27194, 27194, 27199, 27356, 27488, 27488, 27496};
    }
}
