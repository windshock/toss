package o;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import o.rzo;
import o.szb;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class rc extends ulm {
    static final String[] IAuthTabCallback;
    static final String[] IAuthTabCallbackStub;
    private static int ICustomTabsCallback_Parcel;
    static final String[] asInterface;
    private static int mayLaunchUrl;
    static final String[] onExtraCallback;
    static final String[] onExtraCallbackWithResult;
    static final String[] onNavigationEvent;
    static final String[] onTransact;
    static final String[] onWarmupCompleted;
    private String[] ICustomTabsCallbackDefault = {null};

    @Nullable
    private qgr ICustomTabsCallbackStub;
    private rzo ICustomTabsCallbackStubProxy;
    private boolean extraCallbackWithResult;
    private ArrayList<rzo> extraCommand;
    private boolean onActivityLayout;
    private boolean onActivityResized;
    private boolean onMessageChannelReady;
    private ArrayList<qgr> onMinimized;

    @Nullable
    private pu onPostMessage;
    private rzo onRelationshipValidationResult;
    private List<String> onUnminimized;
    private szb.IAuthTabCallbackDefault readTypedObject;

    @Nullable
    private qgr writeTypedObject;
    private static final byte[] $$a = {114, 69, -115, -114};
    private static final int $$b = 69;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int isEngagementSignalsApiAvailable = 0;
    private static int prefetch = 1;
    private static int ICustomTabsService = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4 = (i * 2) + 105;
        byte[] bArr = $$a;
        int i5 = s * 4;
        int i6 = 3 - (i2 * 4);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i6;
            int i9 = 0;
            i4 = (-i4) + i6;
            i6 = i8;
            i3 = i9;
            int i10 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i10];
            i6 = i4;
            i4 = b;
            i9 = i3 + 1;
            i8 = i10;
            i4 = (-i4) + i6;
            i6 = i8;
            i3 = i9;
            int i102 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1022 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    @Override // o.ulm
    public /* bridge */ /* synthetic */ boolean onNavigationEvent(String str, om omVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 21;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onNavigationEvent(str, omVar);
        }
        super.onNavigationEvent(str, omVar);
        throw null;
    }

    static {
        ICustomTabsCallback_Parcel = 0;
        ICustomTabsCallbackStub();
        IAuthTabCallbackStub = new String[]{"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
        IAuthTabCallback = new String[]{"ol", "ul"};
        Object[] objArr = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 6, 3 - KeyEvent.normalizeMetaState(0), new char[]{5, 6, 65523, 65535, 0, 5}, true, KeyEvent.getDeadChar(0, 0) + 172, objArr);
        onExtraCallback = new String[]{((String) objArr[0]).intern()};
        asInterface = new String[]{"html", "table"};
        onExtraCallbackWithResult = new String[]{"optgroup", "option"};
        onNavigationEvent = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
        onTransact = new String[]{"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        Object[] objArr2 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 6, 3 - View.combineMeasuredStates(0, 0), new char[]{5, 6, 65523, 65535, 0, 5}, true, 172 - View.MeasureSpec.getMode(0), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(5 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{65534, 0, 5, 4, 65529}, false, 173 - Gravity.getAbsoluteGravity(0, 0), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777221, Color.rgb(0, 0, 0) + 16777220, new char[]{65532, '\t', 4, 3, 65525}, true, View.MeasureSpec.makeMeasureSpec(0, 0) + 173, objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 5, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, new char[]{65535, 7, 65532, 7, 65528}, true, Color.alpha(0) + 170, objArr5);
        onWarmupCompleted = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", strIntern, "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", strIntern2, "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", strIntern3, "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", ((String) objArr5[0]).intern(), "tr", "ul", "wbr", "xmp"};
        int i = ICustomTabsService + 27;
        ICustomTabsCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ulm
    sjd asBinder() {
        int i = 2 % 2;
        int i2 = prefetch + 1;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        sjd sjdVar = sjd.onNavigationEvent;
        int i4 = isEngagementSignalsApiAvailable + 51;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return sjdVar;
        }
        throw null;
    }

    @Override // o.ulm
    protected void onWarmupCompleted(Reader reader, String str, tz tzVar) {
        int i = 2 % 2;
        super.onWarmupCompleted(reader, str, tzVar);
        this.ICustomTabsCallbackStubProxy = rzo.Initial;
        this.onRelationshipValidationResult = null;
        this.extraCallbackWithResult = false;
        this.ICustomTabsCallbackStub = null;
        this.onPostMessage = null;
        this.writeTypedObject = null;
        this.onMinimized = new ArrayList<>();
        this.extraCommand = new ArrayList<>();
        this.onUnminimized = new ArrayList();
        this.readTypedObject = new szb.IAuthTabCallbackDefault();
        this.onActivityResized = true;
        this.onActivityLayout = false;
        this.onMessageChannelReady = false;
        int i2 = isEngagementSignalsApiAvailable + 13;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 123;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(mayLaunchUrl)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0')), 23 - Color.blue(0), KeyEvent.normalizeMetaState(0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 12843), (ViewConfiguration.getScrollBarSize() >> 8) + 55, 2167 - Color.green(0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $11 + 77;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getScrollBarSize() >> 8)), View.MeasureSpec.getSize(0) + 55, Color.green(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.ulm
    protected boolean IAuthTabCallback(szb szbVar) {
        int i = 2 % 2;
        int i2 = prefetch + 13;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.asBinder = szbVar;
            boolean zProcess = this.ICustomTabsCallbackStubProxy.process(szbVar, this);
            int i3 = isEngagementSignalsApiAvailable + 97;
            prefetch = i3 % 128;
            if (i3 % 2 != 0) {
                return zProcess;
            }
            obj.hashCode();
            throw null;
        }
        this.asBinder = szbVar;
        this.ICustomTabsCallbackStubProxy.process(szbVar, this);
        throw null;
    }

    boolean onNavigationEvent(szb szbVar, rzo rzoVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = szbVar;
        boolean zProcess = rzoVar.process(szbVar, this);
        int i4 = prefetch + 59;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return zProcess;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void onNavigationEvent(rzo rzoVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 25;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallbackStubProxy = rzoVar;
        if (i4 == 0) {
            int i5 = 89 / 0;
        }
        int i6 = i3 + 37;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
    }

    rzo ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = prefetch + 73;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        rzo rzoVar = this.ICustomTabsCallbackStubProxy;
        int i5 = i3 + 53;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return rzoVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void extraCallback() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 25;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        this.onRelationshipValidationResult = this.ICustomTabsCallbackStubProxy;
        int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    rzo onMinimized() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 95;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        rzo rzoVar = this.onRelationshipValidationResult;
        int i5 = i2 + 113;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return rzoVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 55;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        this.onActivityResized = z;
        if (i3 == 0) {
            throw null;
        }
    }

    boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 77;
        int i3 = i2 % 128;
        prefetch = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onActivityResized;
        int i4 = i3 + 119;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    oq asInterface() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 95;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        oq oqVar = this.access000;
        int i4 = isEngagementSignalsApiAvailable + 51;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return oqVar;
    }

    String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = prefetch + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String str = this.IAuthTabCallbackDefault;
            throw null;
        }
        String str2 = this.IAuthTabCallbackDefault;
        int i3 = prefetch + 31;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            return str2;
        }
        obj.hashCode();
        throw null;
    }

    void IAuthTabCallbackStub(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 3;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            if (!this.extraCallbackWithResult) {
                String strOnNavigationEvent = qgrVar.onNavigationEvent("href");
                if (strOnNavigationEvent.length() != 0) {
                    int i3 = prefetch + 71;
                    isEngagementSignalsApiAvailable = i3 % 128;
                    int i4 = i3 % 2;
                    this.IAuthTabCallbackDefault = strOnNavigationEvent;
                    this.extraCallbackWithResult = true;
                    this.access000.asBinder(strOnNavigationEvent);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    boolean readTypedObject() {
        int i = 2 % 2;
        int i2 = prefetch + 21;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onMessageChannelReady;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void onExtraCallback(rzo rzoVar) {
        int i = 2 % 2;
        int i2 = prefetch + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        if (this.getInterfaceDescriptor.onExtraCallbackWithResult().onNavigationEvent()) {
            this.getInterfaceDescriptor.onExtraCallbackWithResult().add(new rg(this.access100, "Unexpected %s token [%s] when in state [%s]", this.asBinder.IAuthTabCallback_Parcel(), this.asBinder, rzoVar));
        }
        int i4 = prefetch + 23;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
    }

    qgr onNavigationEvent(szb.asBinder asbinder) {
        int i = 2 % 2;
        if (asbinder.extraCallback() && !asbinder.onExtraCallback.onExtraCallbackWithResult()) {
            int i2 = isEngagementSignalsApiAvailable + 81;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
            if (asbinder.onExtraCallback.IAuthTabCallback(this.IAuthTabCallbackStubProxy) > 0) {
                int i4 = isEngagementSignalsApiAvailable + 81;
                prefetch = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr = new Object[0];
                    objArr[1] = asbinder.IAuthTabCallback;
                    onExtraCallbackWithResult("Dropped duplicate attribute(s) in tag [%s]", objArr);
                } else {
                    onExtraCallbackWithResult("Dropped duplicate attribute(s) in tag [%s]", asbinder.IAuthTabCallback);
                }
                int i5 = isEngagementSignalsApiAvailable + 21;
                prefetch = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (!asbinder.writeTypedObject()) {
            qgr qgrVar = new qgr(onExtraCallbackWithResult(asbinder.ICustomTabsCallback(), this.IAuthTabCallbackStubProxy), null, this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(asbinder.onExtraCallback));
            onNavigationEvent(qgrVar);
            return qgrVar;
        }
        int i7 = prefetch + 35;
        isEngagementSignalsApiAvailable = i7 % 128;
        if (i7 % 2 == 0) {
            qgr qgrVarOnExtraCallback = onExtraCallback(asbinder);
            this.extraCallback.add(qgrVarOnExtraCallback);
            this.ICustomTabsCallback.IAuthTabCallback(uc.Data);
            this.ICustomTabsCallback.onExtraCallbackWithResult(this.readTypedObject.access100().onWarmupCompleted(qgrVarOnExtraCallback.mayLaunchUrl()));
            return qgrVarOnExtraCallback;
        }
        qgr qgrVarOnExtraCallback2 = onExtraCallback(asbinder);
        this.extraCallback.add(qgrVarOnExtraCallback2);
        this.ICustomTabsCallback.IAuthTabCallback(uc.Data);
        this.ICustomTabsCallback.onExtraCallbackWithResult(this.readTypedObject.access100().onWarmupCompleted(qgrVarOnExtraCallback2.mayLaunchUrl()));
        int i8 = 29 / 0;
        return qgrVarOnExtraCallback2;
    }

    qgr asInterface(String str) {
        int i = 2 % 2;
        qgr qgrVar = new qgr(onExtraCallbackWithResult(str, this.IAuthTabCallbackStubProxy), null);
        onNavigationEvent(qgrVar);
        int i2 = prefetch + 115;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return qgrVar;
    }

    void onNavigationEvent(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 115;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback((qq) qgrVar);
            this.extraCallback.add(qgrVar);
            int i3 = 12 / 0;
        } else {
            onExtraCallback((qq) qgrVar);
            this.extraCallback.add(qgrVar);
        }
    }

    qgr onExtraCallback(szb.asBinder asbinder) {
        int i = 2 % 2;
        sl slVarOnExtraCallbackWithResult = onExtraCallbackWithResult(asbinder.ICustomTabsCallback(), this.IAuthTabCallbackStubProxy);
        Object obj = null;
        qgr qgrVar = new qgr(slVarOnExtraCallbackWithResult, null, this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(asbinder.onExtraCallback));
        onExtraCallback((qq) qgrVar);
        if (asbinder.writeTypedObject()) {
            int i2 = isEngagementSignalsApiAvailable + 19;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
            if (!slVarOnExtraCallbackWithResult.IAuthTabCallbackDefault()) {
                slVarOnExtraCallbackWithResult.IAuthTabCallback_Parcel();
            } else {
                int i4 = prefetch + 79;
                isEngagementSignalsApiAvailable = i4 % 128;
                if (i4 % 2 != 0) {
                    slVarOnExtraCallbackWithResult.onNavigationEvent();
                    obj.hashCode();
                    throw null;
                }
                if (!slVarOnExtraCallbackWithResult.onNavigationEvent()) {
                    this.ICustomTabsCallback.onExtraCallbackWithResult("Tag [%s] cannot be self closing; not a void tag", slVarOnExtraCallbackWithResult.onTransact());
                    int i5 = isEngagementSignalsApiAvailable + 23;
                    prefetch = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 67 / 0;
                    }
                    return qgrVar;
                }
            }
        }
        return qgrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    pu onWarmupCompleted(szb.asBinder asbinder, boolean z, boolean z2) {
        int i = 2 % 2;
        Object obj = null;
        pu puVar = new pu(onExtraCallbackWithResult(asbinder.ICustomTabsCallback(), this.IAuthTabCallbackStubProxy), null, this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(asbinder.onExtraCallback));
        if (z2) {
            int i2 = isEngagementSignalsApiAvailable + 77;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
            if (!getInterfaceDescriptor("template")) {
                onWarmupCompleted(puVar);
            }
        }
        onExtraCallback((qq) puVar);
        if (z) {
            int i4 = isEngagementSignalsApiAvailable + 23;
            prefetch = i4 % 128;
            if (i4 % 2 == 0) {
                this.extraCallback.add(puVar);
                obj.hashCode();
                throw null;
            }
            this.extraCallback.add(puVar);
        }
        int i5 = prefetch + 101;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return puVar;
    }

    void onExtraCallback(szb.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        onExtraCallback(new pks(onextracallbackwithresult.access000()));
        int i2 = isEngagementSignalsApiAvailable + 119;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    void IAuthTabCallback(szb.onExtraCallback onextracallback) {
        qq qkmVar;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsCallbackDefault().onMinimized();
            onextracallback.access000();
            onextracallback.onTransact();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        qgr qgrVarICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        String strOnMinimized = qgrVarICustomTabsCallbackDefault.onMinimized();
        String strAccess000 = onextracallback.access000();
        if (onextracallback.onTransact()) {
            qkmVar = new pk(strAccess000);
            int i3 = prefetch + 57;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
        } else if (IAuthTabCallback_Parcel(strOnMinimized)) {
            qkmVar = new pj(strAccess000);
            int i5 = prefetch + 115;
            isEngagementSignalsApiAvailable = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 3;
            }
        } else {
            qkmVar = new qkm(strAccess000);
        }
        qgrVarICustomTabsCallbackDefault.onExtraCallback(qkmVar);
    }

    private void onExtraCallback(qq qqVar) {
        pu puVar;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGBA_YVYU;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        if (this.extraCallback.isEmpty()) {
            this.access000.onExtraCallback(qqVar);
        } else if (writeTypedObject() && nfe.onExtraCallbackWithResult(ICustomTabsCallbackDefault().onMinimized(), rzo.onExtraCallback.newAuthTabSession)) {
            onExtraCallbackWithResult(qqVar);
        } else {
            ICustomTabsCallbackDefault().onExtraCallback(qqVar);
            int i4 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGBA_YVYU;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
        }
        if (qqVar instanceof qgr) {
            int i6 = isEngagementSignalsApiAvailable + 7;
            prefetch = i6 % 128;
            int i7 = i6 % 2;
            qgr qgrVar = (qgr) qqVar;
            if (!qgrVar.ICustomTabsCallback_Parcel().asBinder() || (puVar = this.onPostMessage) == null) {
                return;
            }
            int i8 = isEngagementSignalsApiAvailable + 93;
            prefetch = i8 % 128;
            int i9 = i8 % 2;
            puVar.onExtraCallback(qgrVar);
            if (i9 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    qgr onActivityLayout() {
        ArrayList<qgr> arrayList;
        int i;
        int i2 = 2 % 2;
        int i3 = prefetch + 69;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            int size = this.extraCallback.size();
            arrayList = this.extraCallback;
            i = size >> 1;
        } else {
            int size2 = this.extraCallback.size();
            arrayList = this.extraCallback;
            i = size2 - 1;
        }
        return arrayList.remove(i);
    }

    void asInterface(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallback.add(qgrVar);
        int i4 = isEngagementSignalsApiAvailable + 89;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    ArrayList<qgr> access100() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 81;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<qgr> arrayList = this.extraCallback;
        int i4 = isEngagementSignalsApiAvailable + 17;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    boolean onTransact(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 19;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(this.extraCallback, qgrVar);
        int i4 = prefetch + 63;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    boolean getInterfaceDescriptor(String str) {
        int i = 2 % 2;
        int i2 = prefetch + 99;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallbackWithResult(str) != null) {
            return true;
        }
        int i4 = isEngagementSignalsApiAvailable + 27;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static boolean onWarmupCompleted(ArrayList<qgr> arrayList, qgr qgrVar) {
        int i;
        int i2 = 2 % 2;
        int size = arrayList.size();
        int i3 = size - 1;
        if (i3 >= 256) {
            int i4 = isEngagementSignalsApiAvailable + 71;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            i = size - 257;
        } else {
            int i6 = prefetch + 29;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        while (i3 >= i) {
            if (arrayList.get(i3) == qgrVar) {
                return true;
            }
            i3--;
            int i8 = isEngagementSignalsApiAvailable + 35;
            prefetch = i8 % 128;
            int i9 = i8 % 2;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    qgr onExtraCallbackWithResult(String str) {
        int size;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = prefetch + 5;
        isEngagementSignalsApiAvailable = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            size = this.extraCallback.size();
            if (size >= 8389) {
                i = size;
                i3 = prefetch + 73;
                isEngagementSignalsApiAvailable = i3 % 128;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i2 = size - 257;
            }
            i = size;
            i2 = 0;
        } else {
            size = this.extraCallback.size();
            i = size - 1;
            if (i < 256) {
                size = i;
                i = size;
                i2 = 0;
            }
            i3 = prefetch + 73;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 == 0) {
            }
        }
        while (i >= i2) {
            qgr qgrVar = this.extraCallback.get(i);
            if (qgrVar.onMinimized().equals(str)) {
                int i6 = isEngagementSignalsApiAvailable + 9;
                prefetch = i6 % 128;
                int i7 = i6 % 2;
                return qgrVar;
            }
            i--;
        }
        return null;
    }

    boolean IAuthTabCallbackStubProxy(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = prefetch + 125;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int i4 = prefetch + 63;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        for (int size = this.extraCallback.size() - 1; size >= 0; size--) {
            if (this.extraCallback.get(size) == qgrVar) {
                int i6 = isEngagementSignalsApiAvailable + 87;
                prefetch = i6 % 128;
                if (i6 % 2 == 0) {
                    this.extraCallback.remove(size);
                    return false;
                }
                this.extraCallback.remove(size);
                return true;
            }
        }
        return false;
    }

    @Nullable
    qgr IAuthTabCallbackStubProxy(String str) {
        int i = 2 % 2;
        int size = this.extraCallback.size() - 1;
        while (true) {
            Object obj = null;
            if (size < 0) {
                int i2 = isEngagementSignalsApiAvailable + 93;
                prefetch = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            qgr qgrVar = this.extraCallback.get(size);
            this.extraCallback.remove(size);
            if (qgrVar.onMinimized().equals(str)) {
                int i3 = isEngagementSignalsApiAvailable + 79;
                prefetch = i3 % 128;
                if (i3 % 2 != 0) {
                    return qgrVar;
                }
                obj.hashCode();
                throw null;
            }
            size--;
            int i4 = isEngagementSignalsApiAvailable + 111;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    void onExtraCallback(String... strArr) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 113;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        int size = this.extraCallback.size() - 1;
        while (size >= 0) {
            qgr qgrVar = this.extraCallback.get(size);
            this.extraCallback.remove(size);
            if (nfe.onExtraCallbackWithResult(qgrVar.onMinimized(), strArr)) {
                return;
            }
            int i4 = prefetch;
            int i5 = i4 + 87;
            isEngagementSignalsApiAvailable = i5 % 128;
            size = i5 % 2 != 0 ? size + 109 : size - 1;
            int i6 = i4 + 39;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    void access000(String str) {
        int i = 2 % 2;
        int i2 = prefetch + 91;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int size = this.extraCallback.size() - 1;
        while (size >= 0) {
            int i4 = isEngagementSignalsApiAvailable + 21;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            if (this.extraCallback.get(size).onMinimized().equals(str)) {
                return;
            }
            this.extraCallback.remove(size);
            size--;
            int i6 = prefetch + 119;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 57;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent("table", "template");
            return;
        }
        String[] strArr = new String[4];
        strArr[0] = "table";
        strArr[0] = "template";
        onNavigationEvent(strArr);
    }

    void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = prefetch + 91;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent("tbody", "tfoot", "thead", "template");
        int i4 = prefetch + 83;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 39;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            String[] strArr = new String[4];
            strArr[1] = "tr";
            strArr[1] = "template";
            onNavigationEvent(strArr);
        } else {
            onNavigationEvent("tr", "template");
        }
        int i3 = isEngagementSignalsApiAvailable + 85;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
    }

    private void onNavigationEvent(String... strArr) {
        int i = 2 % 2;
        int i2 = prefetch + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int size = this.extraCallback.size() - 1;
        while (size >= 0) {
            if (nfe.onNavigationEvent(this.extraCallback.get(size).onMinimized(), strArr)) {
                return;
            }
            int i4 = isEngagementSignalsApiAvailable + 5;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            if (!(!r3.onMinimized().equals("html"))) {
                return;
            }
            int i6 = prefetch + 89;
            isEngagementSignalsApiAvailable = i6 % 128;
            if (i6 % 2 != 0) {
                this.extraCallback.remove(size);
                size += 15;
            } else {
                this.extraCallback.remove(size);
                size--;
            }
        }
    }

    @Nullable
    qgr onWarmupCompleted(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = prefetch + 43;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int i4 = isEngagementSignalsApiAvailable + 9;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        for (int size = this.extraCallback.size() - 1; size >= 0; size--) {
            int i6 = isEngagementSignalsApiAvailable + 43;
            prefetch = i6 % 128;
            int i7 = i6 % 2;
            if (this.extraCallback.get(size) == qgrVar) {
                int i8 = isEngagementSignalsApiAvailable + 63;
                prefetch = i8 % 128;
                return i8 % 2 == 0 ? this.extraCallback.get(size >> 1) : this.extraCallback.get(size - 1);
            }
        }
        return null;
    }

    void IAuthTabCallback(qgr qgrVar, qgr qgrVar2) {
        boolean z;
        int i = 2 % 2;
        int iLastIndexOf = this.extraCallback.lastIndexOf(qgrVar);
        if (iLastIndexOf != -1) {
            int i2 = prefetch + 37;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = isEngagementSignalsApiAvailable + 109;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        oas.onExtraCallback(z);
        this.extraCallback.add(iLastIndexOf + 1, qgrVar2);
    }

    void onWarmupCompleted(qgr qgrVar, qgr qgrVar2) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 49;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this.extraCallback, qgrVar, qgrVar2);
        int i4 = prefetch + 19;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private void onExtraCallback(ArrayList<qgr> arrayList, qgr qgrVar, qgr qgrVar2) {
        boolean z;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 23;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        int iLastIndexOf = arrayList.lastIndexOf(qgrVar);
        if (iLastIndexOf != -1) {
            int i4 = isEngagementSignalsApiAvailable + 119;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        oas.onExtraCallback(z);
        arrayList.set(iLastIndexOf, qgrVar2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onUnminimized() {
        int size;
        int size2;
        rzo rzoVar;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        prefetch = i2 % 128;
        int i3 = (i2 % 2 != 0 ? (size2 = (size = this.extraCallback.size()) + (-1)) < 256 : (size2 = (size = this.extraCallback.size()) + (-1)) < 312) ? 0 : size - 257;
        if (this.extraCallback.size() == 0) {
            onNavigationEvent(rzo.InBody);
        }
        boolean z = false;
        while (size2 >= i3) {
            qgr qgrVar = this.extraCallback.get(size2);
            char c = 1;
            if (size2 == i3) {
                if (this.onMessageChannelReady) {
                    int i4 = isEngagementSignalsApiAvailable + 23;
                    int i5 = i4 % 128;
                    prefetch = i5;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    qgr qgrVar2 = this.writeTypedObject;
                    int i6 = i5 + 9;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    int i7 = i6 % 2;
                    qgrVar = qgrVar2;
                }
                z = true;
            }
            String strOnMinimized = qgrVar != null ? qgrVar.onMinimized() : _UrlKt.FRAGMENT_ENCODE_SET;
            switch (strOnMinimized.hashCode()) {
                case -1644953643:
                    if (!strOnMinimized.equals("frameset")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -1321546630:
                    if (!strOnMinimized.equals("template")) {
                    }
                    break;
                case -906021636:
                    if (strOnMinimized.equals("select")) {
                        c = 2;
                        break;
                    }
                    break;
                case -636197633:
                    if (strOnMinimized.equals("colgroup")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3696:
                    if (strOnMinimized.equals("td")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3700:
                    if (strOnMinimized.equals("th")) {
                        int i8 = isEngagementSignalsApiAvailable + 61;
                        prefetch = i8 % 128;
                        int i9 = i8 % 2;
                        c = 5;
                        break;
                    }
                    break;
                case 3710:
                    if (strOnMinimized.equals("tr")) {
                        int i10 = prefetch + 31;
                        isEngagementSignalsApiAvailable = i10 % 128;
                        int i11 = i10 % 2;
                        c = 6;
                        break;
                    }
                    break;
                case 3029410:
                    if (strOnMinimized.equals("body")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3198432:
                    if (strOnMinimized.equals("head")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3213227:
                    if (strOnMinimized.equals("html")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 110115790:
                    if (strOnMinimized.equals("table")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 110157846:
                    if (strOnMinimized.equals("tbody")) {
                        c = 11;
                        break;
                    }
                    break;
                case 110277346:
                    if (strOnMinimized.equals("tfoot")) {
                        int i12 = prefetch + 105;
                        isEngagementSignalsApiAvailable = i12 % 128;
                        int i13 = i12 % 2;
                        c = '\f';
                        break;
                    }
                    break;
                case 110326868:
                    if (strOnMinimized.equals("thead")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 552573414:
                    if (strOnMinimized.equals("caption")) {
                        c = 14;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    onNavigationEvent(rzo.InFrameset);
                    return;
                case 1:
                    rzo rzoVarOnExtraCallback = onExtraCallback();
                    oas.onNavigationEvent(rzoVarOnExtraCallback, "Bug: no template insertion mode on stack!");
                    onNavigationEvent(rzoVarOnExtraCallback);
                    return;
                case 2:
                    onNavigationEvent(rzo.InSelect);
                    return;
                case 3:
                    onNavigationEvent(rzo.InColumnGroup);
                    int i14 = prefetch + 29;
                    isEngagementSignalsApiAvailable = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    return;
                case 4:
                case 5:
                    if (!z) {
                        onNavigationEvent(rzo.InCell);
                        return;
                    }
                    break;
                case 6:
                    onNavigationEvent(rzo.InRow);
                    return;
                case 7:
                    onNavigationEvent(rzo.InBody);
                    return;
                case '\b':
                    if (!z) {
                        onNavigationEvent(rzo.InHead);
                        return;
                    }
                    break;
                case '\t':
                    if (this.ICustomTabsCallbackStub == null) {
                        int i15 = isEngagementSignalsApiAvailable + 29;
                        prefetch = i15 % 128;
                        if (i15 % 2 == 0) {
                            rzo rzoVar2 = rzo.BeforeHead;
                            throw null;
                        }
                        rzoVar = rzo.BeforeHead;
                    } else {
                        rzoVar = rzo.AfterHead;
                    }
                    onNavigationEvent(rzoVar);
                    return;
                case '\n':
                    onNavigationEvent(rzo.InTable);
                    return;
                case 11:
                case '\f':
                case '\r':
                    onNavigationEvent(rzo.InTableBody);
                    int i16 = isEngagementSignalsApiAvailable + 41;
                    prefetch = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                    return;
                case 14:
                    onNavigationEvent(rzo.InCaption);
                    return;
            }
            if (z) {
                onNavigationEvent(rzo.InBody);
                return;
            }
            size2--;
        }
    }

    private boolean IAuthTabCallback(String str, String[] strArr, String[] strArr2) {
        int i = 2 % 2;
        int i2 = prefetch + 35;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String[] strArr3 = this.ICustomTabsCallbackDefault;
        strArr3[0] = str;
        boolean zOnWarmupCompleted = onWarmupCompleted(strArr3, strArr, strArr2);
        int i4 = isEngagementSignalsApiAvailable + 87;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return zOnWarmupCompleted;
    }

    private boolean onWarmupCompleted(String[] strArr, String[] strArr2, String[] strArr3) {
        int size;
        int size2;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 1;
        prefetch = i2 % 128;
        int i3 = (i2 % 2 != 0 ? (size2 = (size = this.extraCallback.size()) + (-1)) <= 100 : (size2 = (size = this.extraCallback.size()) + (-1)) <= 57) ? 0 : size - 101;
        while (size2 >= i3) {
            int i4 = isEngagementSignalsApiAvailable + 11;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            String strOnMinimized = this.extraCallback.get(size2).onMinimized();
            if (nfe.onExtraCallbackWithResult(strOnMinimized, strArr)) {
                return true;
            }
            if (nfe.onExtraCallbackWithResult(strOnMinimized, strArr2)) {
                int i6 = prefetch + 83;
                isEngagementSignalsApiAvailable = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (strArr3 != null && nfe.onExtraCallbackWithResult(strOnMinimized, strArr3)) {
                return false;
            }
            size2--;
        }
        return false;
    }

    boolean IAuthTabCallback(String[] strArr) {
        boolean zOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = prefetch + 93;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            zOnWarmupCompleted = onWarmupCompleted(strArr, IAuthTabCallbackStub, (String[]) null);
            int i3 = 79 / 0;
        } else {
            zOnWarmupCompleted = onWarmupCompleted(strArr, IAuthTabCallbackStub, (String[]) null);
        }
        int i4 = isEngagementSignalsApiAvailable + 65;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    boolean onTransact(String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(str, (String[]) null);
        int i4 = isEngagementSignalsApiAvailable + 95;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    boolean onNavigationEvent(String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 111;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(str, IAuthTabCallbackStub, strArr);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(str, IAuthTabCallbackStub, strArr);
        int i3 = isEngagementSignalsApiAvailable + 89;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback;
    }

    boolean IAuthTabCallbackStub(String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(str, IAuthTabCallback);
        int i4 = isEngagementSignalsApiAvailable + 25;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    boolean onExtraCallback(String str) {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            zOnNavigationEvent = onNavigationEvent(str, onExtraCallback);
            int i3 = 85 / 0;
        } else {
            zOnNavigationEvent = onNavigationEvent(str, onExtraCallback);
        }
        int i4 = isEngagementSignalsApiAvailable + 89;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    boolean asBinder(String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(str, asInterface, null);
        int i4 = prefetch + 93;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    boolean IAuthTabCallbackDefault(String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 59;
        prefetch = i2 % 128;
        for (int size = i2 % 2 == 0 ? this.extraCallback.size() : this.extraCallback.size() - 1; size >= 0; size--) {
            int i3 = prefetch + 109;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 == 0) {
                String strOnMinimized = this.extraCallback.get(size).onMinimized();
                if (strOnMinimized.equals(str)) {
                    return true;
                }
                if (!nfe.onExtraCallbackWithResult(strOnMinimized, onExtraCallbackWithResult)) {
                    return false;
                }
            } else {
                this.extraCallback.get(size).onMinimized().equals(str);
                throw null;
            }
        }
        oas.onWarmupCompleted("Should not be reachable");
        return false;
    }

    void access100(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = prefetch + 3;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallbackStub = qgrVar;
        int i5 = i3 + 21;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
    }

    qgr getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 77;
        int i3 = i2 % 128;
        prefetch = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        qgr qgrVar = this.ICustomTabsCallbackStub;
        int i4 = i3 + 101;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return qgrVar;
    }

    boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = prefetch + 39;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        boolean z = this.onActivityLayout;
        int i5 = i3 + 105;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = prefetch + 107;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        this.onActivityLayout = z;
        int i5 = i3 + 111;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
    }

    @Nullable
    pu IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = prefetch + 73;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        pu puVar = this.onPostMessage;
        int i5 = i3 + 85;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return puVar;
    }

    void onWarmupCompleted(pu puVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 51;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        this.onPostMessage = puVar;
        int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void ICustomTabsCallback() {
        int i = 2 % 2;
        this.onUnminimized = new ArrayList();
        int i2 = prefetch + 33;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
    }

    List<String> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 17;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.onUnminimized;
        int i5 = i2 + 19;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void onWarmupCompleted(String str) {
        int i = 2 % 2;
        while (nfe.onExtraCallbackWithResult(ICustomTabsCallbackDefault().onMinimized(), onNavigationEvent)) {
            if (str != null) {
                int i2 = isEngagementSignalsApiAvailable + 55;
                prefetch = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 61 / 0;
                    if (access100(str)) {
                        return;
                    }
                } else if (access100(str)) {
                    return;
                }
            }
            onActivityLayout();
            int i4 = prefetch + 97;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 2;
            }
        }
    }

    void onTransact() {
        int i = 2 % 2;
        int i2 = prefetch + 33;
        isEngagementSignalsApiAvailable = i2 % 128;
        onWarmupCompleted(i2 % 2 != 0);
    }

    void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = prefetch + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String[] strArr = z ? onTransact : onNavigationEvent;
        while (nfe.onExtraCallbackWithResult(ICustomTabsCallbackDefault().onMinimized(), strArr)) {
            int i4 = isEngagementSignalsApiAvailable + 47;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            onActivityLayout();
            int i6 = isEngagementSignalsApiAvailable + 25;
            prefetch = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    void onNavigationEvent(String str) {
        int i = 2 % 2;
        onWarmupCompleted(str);
        if (!str.equals(ICustomTabsCallbackDefault().onMinimized())) {
            int i2 = isEngagementSignalsApiAvailable + 109;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(ICustomTabsCallbackStubProxy());
        }
        IAuthTabCallbackStubProxy(str);
        int i4 = isEngagementSignalsApiAvailable + 13;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }

    boolean onExtraCallbackWithResult(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
            return nfe.onExtraCallbackWithResult(qgrVar.onMinimized(), onWarmupCompleted);
        }
        return nfe.onExtraCallbackWithResult(qgrVar.onMinimized(), onWarmupCompleted);
    }

    qgr extraCallbackWithResult() {
        int i = 2 % 2;
        if (this.onMinimized.size() <= 0) {
            return null;
        }
        int i2 = prefetch + 71;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        qgr qgrVar = this.onMinimized.get(r1.size() - 1);
        int i4 = isEngagementSignalsApiAvailable + 103;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return qgrVar;
        }
        throw null;
    }

    int asBinder(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 79;
        prefetch = i2 % 128;
        for (int i3 = i2 % 2 == 0 ? 1 : 0; i3 < this.onMinimized.size(); i3++) {
            int i4 = prefetch + 115;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            if (qgrVar == this.onMinimized.get(i3)) {
                int i6 = isEngagementSignalsApiAvailable + 57;
                prefetch = i6 % 128;
                int i7 = i6 % 2;
                return i3;
            }
        }
        return -1;
    }

    qgr onPostMessage() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 43;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        int size = this.onMinimized.size();
        if (size <= 0) {
            return null;
        }
        int i4 = prefetch + 73;
        isEngagementSignalsApiAvailable = i4 % 128;
        return this.onMinimized.remove(i4 % 2 != 0 ? size % 1 : size - 1);
    }

    void IAuthTabCallbackDefault(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = prefetch + 113;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(qgrVar);
            this.onMinimized.add(qgrVar);
        } else {
            onExtraCallback(qgrVar);
            this.onMinimized.add(qgrVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    void IAuthTabCallback(qgr qgrVar, int i) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 55;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(qgrVar);
        try {
            this.onMinimized.add(i, qgrVar);
            int i5 = isEngagementSignalsApiAvailable + 31;
            prefetch = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (IndexOutOfBoundsException unused) {
            this.onMinimized.add(qgrVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onExtraCallback(qgr qgrVar) {
        int size;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 109;
        prefetch = i2 % 128;
        int i3 = 1;
        if (i2 % 2 == 0) {
            size = this.onMinimized.size() >> 1;
        } else {
            size = this.onMinimized.size() - 1;
            i3 = 0;
        }
        while (size >= 0) {
            qgr qgrVar2 = this.onMinimized.get(size);
            if (qgrVar2 == null) {
                return;
            }
            int i4 = prefetch + 85;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
                if (onExtraCallbackWithResult(qgrVar, qgrVar2)) {
                    i3++;
                }
            } else if (onExtraCallbackWithResult(qgrVar, qgrVar2)) {
            }
            if (i3 == 3) {
                this.onMinimized.remove(size);
                return;
            }
            size--;
            int i6 = isEngagementSignalsApiAvailable + 27;
            prefetch = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private boolean onExtraCallbackWithResult(qgr qgrVar, qgr qgrVar2) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 47;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        if (qgrVar.onMinimized().equals(qgrVar2.onMinimized()) && qgrVar.access000().equals(qgrVar2.access000())) {
            int i4 = prefetch + 119;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = isEngagementSignalsApiAvailable + 85;
        prefetch = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007a -> B:28:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onActivityResized() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            o.qgr r1 = r8.extraCallbackWithResult()
            if (r1 == 0) goto Lb4
            int r2 = o.rc.prefetch
            int r2 = r2 + 119
            int r3 = r2 % 128
            o.rc.isEngagementSignalsApiAvailable = r3
            int r2 = r2 % r0
            if (r2 != 0) goto Lac
            boolean r2 = r8.onTransact(r1)
            if (r2 != 0) goto Lb4
            int r2 = o.rc.isEngagementSignalsApiAvailable
            int r2 = r2 + 65
            int r3 = r2 % 128
            o.rc.prefetch = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L32
            java.util.ArrayList<o.qgr> r2 = r8.onMinimized
            int r2 = r2.size()
            int r5 = r2 << 12
            if (r5 >= 0) goto L4a
            goto L3c
        L32:
            java.util.ArrayList<o.qgr> r2 = r8.onMinimized
            int r2 = r2.size()
            int r5 = r2 + (-12)
            if (r5 >= 0) goto L4a
        L3c:
            int r5 = o.rc.prefetch
            int r5 = r5 + 23
            int r6 = r5 % 128
            o.rc.isEngagementSignalsApiAvailable = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L49
            r5 = r4
            goto L4a
        L49:
            r5 = r3
        L4a:
            int r2 = r2 - r4
            r6 = r2
        L4c:
            if (r6 != r5) goto L58
            int r5 = o.rc.prefetch
            int r5 = r5 + 81
            int r7 = r5 % 128
            o.rc.isEngagementSignalsApiAvailable = r7
            int r5 = r5 % r0
            goto L7b
        L58:
            java.util.ArrayList<o.qgr> r1 = r8.onMinimized
            int r6 = r6 + (-1)
            java.lang.Object r1 = r1.get(r6)
            o.qgr r1 = (o.qgr) r1
            if (r1 == 0) goto L7a
            boolean r7 = r8.onTransact(r1)
            if (r7 == 0) goto L4c
            int r4 = o.rc.isEngagementSignalsApiAvailable
            int r5 = r4 + 5
            int r7 = r5 % 128
            o.rc.prefetch = r7
            int r5 = r5 % r0
            int r4 = r4 + 87
            int r5 = r4 % 128
            o.rc.prefetch = r5
            int r4 = r4 % r0
        L7a:
            r4 = r3
        L7b:
            if (r4 != 0) goto L88
            java.util.ArrayList<o.qgr> r0 = r8.onMinimized
            int r6 = r6 + 1
            java.lang.Object r0 = r0.get(r6)
            o.qgr r0 = (o.qgr) r0
            r1 = r0
        L88:
            o.oas.onExtraCallback(r1)
            java.lang.String r0 = r1.onMinimized()
            o.qgr r0 = r8.asInterface(r0)
            int r4 = r1.postMessage()
            if (r4 <= 0) goto La4
            o.om r4 = r0.access000()
            o.om r5 = r1.access000()
            r4.IAuthTabCallback(r5)
        La4:
            java.util.ArrayList<o.qgr> r4 = r8.onMinimized
            r4.set(r6, r0)
            if (r6 != r2) goto L7a
            goto Lb4
        Lac:
            r8.onTransact(r1)
            r0 = 0
            r0.hashCode()
            throw r0
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rc.onActivityResized():void");
    }

    void onExtraCallbackWithResult() {
        int i = 2 % 2;
        while (!this.onMinimized.isEmpty()) {
            int i2 = prefetch + 89;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                onPostMessage();
                throw null;
            }
            if (onPostMessage() == null) {
                break;
            }
        }
        int i3 = prefetch + 49;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 44 / 0;
        }
    }

    void access000(qgr qgrVar) {
        int i = 2 % 2;
        int size = this.onMinimized.size() - 1;
        while (size >= 0) {
            int i2 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGBA_YVYU;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
            if (this.onMinimized.get(size) == qgrVar) {
                int i4 = isEngagementSignalsApiAvailable + 59;
                prefetch = i4 % 128;
                int i5 = i4 % 2;
                this.onMinimized.remove(size);
                return;
            }
            size--;
            int i6 = isEngagementSignalsApiAvailable + 115;
            prefetch = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    boolean IAuthTabCallback(qgr qgrVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 97;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(this.onMinimized, qgrVar);
        int i4 = isEngagementSignalsApiAvailable + 29;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    qgr IAuthTabCallback(String str) {
        qgr qgrVar;
        int i = 2 % 2;
        for (int size = this.onMinimized.size() - 1; size >= 0 && (qgrVar = this.onMinimized.get(size)) != null; size--) {
            int i2 = prefetch + 85;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                qgrVar.onMinimized().equals(str);
                throw null;
            }
            if (!(!qgrVar.onMinimized().equals(str))) {
                int i3 = isEngagementSignalsApiAvailable + 95;
                prefetch = i3 % 128;
                int i4 = i3 % 2;
                return qgrVar;
            }
        }
        return null;
    }

    void onExtraCallback(qgr qgrVar, qgr qgrVar2) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 21;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this.onMinimized, qgrVar, qgrVar2);
        if (i3 == 0) {
            throw null;
        }
    }

    void access000() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        prefetch = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onMinimized.add(null);
        } else {
            this.onMinimized.add(null);
            obj.hashCode();
            throw null;
        }
    }

    void onExtraCallbackWithResult(qq qqVar) {
        qgr qgrVarOnWarmupCompleted;
        int i = 2 % 2;
        qgr qgrVarOnExtraCallbackWithResult = onExtraCallbackWithResult("table");
        boolean z = false;
        if (qgrVarOnExtraCallbackWithResult == null) {
            qgrVarOnWarmupCompleted = this.extraCallback.get(0);
            int i2 = isEngagementSignalsApiAvailable + 29;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
        } else if (qgrVarOnExtraCallbackWithResult.ICustomTabsCallbackDefault() != null) {
            int i4 = isEngagementSignalsApiAvailable + 63;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            qgrVarOnWarmupCompleted = null;
            qgrVarOnExtraCallbackWithResult.ICustomTabsCallbackDefault();
            z = true;
        } else {
            qgrVarOnWarmupCompleted = onWarmupCompleted(qgrVarOnExtraCallbackWithResult);
        }
        if (!z) {
            qgrVarOnWarmupCompleted.onExtraCallback(qqVar);
            return;
        }
        int i6 = prefetch + 13;
        isEngagementSignalsApiAvailable = i6 % 128;
        int i7 = i6 % 2;
        oas.onExtraCallback(qgrVarOnExtraCallbackWithResult);
        qgrVarOnExtraCallbackWithResult.IAuthTabCallback(qqVar);
    }

    void onExtraCallbackWithResult(rzo rzoVar) {
        int i = 2 % 2;
        int i2 = prefetch + Imgproc.COLOR_YUV2RGBA_YVYU;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            this.extraCommand.add(rzoVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.extraCommand.add(rzoVar);
        int i3 = prefetch + 19;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return r3.extraCommand.remove(r0.size() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r1 = o.rc.isEngagementSignalsApiAvailable + 77;
        o.rc.prefetch = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r3.extraCommand.size() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r3.extraCommand.size() > 0) goto L9;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    rzo onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 113;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
    }

    int onRelationshipValidationResult() {
        int size;
        int i = 2 % 2;
        int i2 = prefetch + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            size = this.extraCommand.size();
            int i3 = 90 / 0;
        } else {
            size = this.extraCommand.size();
        }
        int i4 = isEngagementSignalsApiAvailable + 79;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    @Nullable
    rzo onExtraCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 87;
        prefetch = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.extraCommand.size();
            obj.hashCode();
            throw null;
        }
        if (this.extraCommand.size() <= 0) {
            return null;
        }
        rzo rzoVar = this.extraCommand.get(r1.size() - 1);
        int i3 = isEngagementSignalsApiAvailable + 123;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        return rzoVar;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TreeBuilder{currentToken=" + this.asBinder + ", state=" + this.ICustomTabsCallbackStubProxy + ", currentElement=" + ICustomTabsCallbackDefault() + '}';
        int i2 = prefetch + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // o.ulm
    protected boolean IAuthTabCallback_Parcel(String str) throws Throwable {
        int i = 2 % 2;
        if (!str.equals("script")) {
            Object[] objArr = new Object[1];
            a(TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 5, 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{65532, '\t', 4, 3, 65525}, true, 173 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            if (!str.equals(((String) objArr[0]).intern())) {
                int i2 = isEngagementSignalsApiAvailable + 119;
                prefetch = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
        }
        int i4 = isEngagementSignalsApiAvailable + 105;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ICustomTabsCallbackStub() {
        mayLaunchUrl = 478308884;
    }
}
