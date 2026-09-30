package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.Ascii;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.RippleKtExternalSyntheticLambda0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ScaffoldKtExternalSyntheticLambda9 implements RippleKtExternalSyntheticLambda0 {
    static final Pattern IAuthTabCallback;
    private static final Pattern IAuthTabCallbackDefault;
    private static int IAuthTabCallback_Parcel;
    private static final Pattern asBinder;
    private static final Pattern asInterface;
    private static final onExtraCallback onExtraCallback;
    private static final Pattern onExtraCallbackWithResult;
    static final Pattern onNavigationEvent;
    private static int onTransact;
    private static final Pattern onWarmupCompleted;
    private final XmlPullParserFactory IAuthTabCallbackStub;
    private static final byte[] $$a = {102, 12, 98, 84};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int access000 = 1;
    private static int IAuthTabCallbackStubProxy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i2 + 4;
        byte[] bArr = $$a;
        int i7 = (s2 * 2) + 1;
        int i8 = (s * 3) + 105;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i9 = i7;
            i4 = i6;
            i5 = 0;
            i6 += -i9;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
                return new String(bArr2, 0);
            }
            i4++;
            i9 = bArr[i4];
            i6 += -i9;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
            }
        } else {
            i3 = 0;
            i6 = i8;
            i4 = i6;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
            }
        }
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~((~i3) | i8);
        int i10 = i6 | i9 | (~(i2 | i3));
        int i11 = (~(i3 | i6)) | (~(i8 | i3)) | (~(i8 | i6));
        int i12 = i6 + i2 + i7 + (1351532378 * i5) + (1237199896 * i4);
        int i13 = i12 * i12;
        int i14 = ((-211156802) * i6) + 1314914304 + ((-491389116) * i2) + (2007367491 * i10) + (i11 * (-2007367491)) + ((-2007367491) * i9) + (1796210688 * i7) + ((-1818230784) * i5) + ((-914358272) * i4) + ((-2051670016) * i13);
        int i15 = ((i6 * 406040238) - 634933780) + (i2 * 406038884) + (i10 * (-677)) + (i11 * 677) + (i9 * 677) + (i7 * 406039561) + (i5 * 1283666474) + (i4 * 1712827608) + (i13 * (-77201408));
        int i16 = i14 + (i15 * i15 * 1831469056);
        return i16 != 1 ? i16 != 2 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public int onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = access100 + 5;
        int i4 = i3 % 128;
        access000 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 99;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return 1;
    }

    static {
        IAuthTabCallback_Parcel = 0;
        IAuthTabCallback();
        onWarmupCompleted = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
        asInterface = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
        asBinder = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
        onNavigationEvent = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
        IAuthTabCallback = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
        IAuthTabCallbackDefault = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
        onExtraCallbackWithResult = Pattern.compile("^(\\d+) (\\d+)$");
        onExtraCallback = new onExtraCallback(30.0f, 1, 1);
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public ScaffoldKtExternalSyntheticLambda9() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.IAuthTabCallbackStub = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onTransact)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 35125), View.MeasureSpec.getMode(0) + 23, 10278 - Color.green(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 55 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i8 = $11 + 7;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i10 = $10 + 81;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getJumpTapTimeout() >> 16)), ((byte) KeyEvent.getModifierMetaStateMask()) + 56, 2167 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 2083011369;
            }
            int i12 = $10 + 31;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, int i2, int i3, RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        int i4 = 2 % 2;
        int i5 = access100 + 69;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            RangeSliderLogic.onNavigationEvent(onNavigationEvent(bArr, i2, i3), onnavigationevent, textFieldDecoratorModifierNodeExternalSyntheticLambda10);
            int i6 = 51 / 0;
        } else {
            RangeSliderLogic.onNavigationEvent(onNavigationEvent(bArr, i2, i3), onnavigationevent, textFieldDecoratorModifierNodeExternalSyntheticLambda10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    @Override // o.RippleKtExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RadioButtonKt onNavigationEvent(byte[] bArr, int i2, int i3) throws Throwable {
        onExtraCallback onextracallback;
        int i4;
        int i5 = 2 % 2;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.IAuthTabCallbackStub.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1(""));
            Object obj = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            onExtraCallback onextracallbackOnWarmupCompleted = onExtraCallback;
            int i6 = 15;
            int i7 = 0;
            onWarmupCompleted onwarmupcompletedIAuthTabCallback = null;
            SecureTextFieldKtExternalSyntheticLambda0 secureTextFieldKtExternalSyntheticLambda0 = null;
            int iOnWarmupCompleted = 15;
            while (eventType != 1) {
                ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8 = (ScaffoldKtExternalSyntheticLambda8) arrayDeque.peek();
                if (i7 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            int i8 = access000 + 81;
                            access100 = i8 % 128;
                            if (i8 % 2 != 0) {
                                onextracallbackOnWarmupCompleted = onWarmupCompleted(xmlPullParserNewPullParser);
                                iOnWarmupCompleted = onWarmupCompleted(xmlPullParserNewPullParser, 102);
                            } else {
                                onextracallbackOnWarmupCompleted = onWarmupCompleted(xmlPullParserNewPullParser);
                                iOnWarmupCompleted = onWarmupCompleted(xmlPullParserNewPullParser, i6);
                            }
                            onwarmupcompletedIAuthTabCallback = IAuthTabCallback(xmlPullParserNewPullParser);
                        }
                        onExtraCallback onextracallback2 = onextracallbackOnWarmupCompleted;
                        onWarmupCompleted onwarmupcompleted = onwarmupcompletedIAuthTabCallback;
                        int i9 = iOnWarmupCompleted;
                        if (onExtraCallback(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                onextracallback = onextracallback2;
                                IAuthTabCallback(xmlPullParserNewPullParser, map, i9, onwarmupcompleted, map2, map3);
                            } else {
                                onextracallback = onextracallback2;
                                try {
                                    ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8OnWarmupCompleted = onWarmupCompleted(xmlPullParserNewPullParser, scaffoldKtExternalSyntheticLambda8, map2, onextracallback);
                                    arrayDeque.push(scaffoldKtExternalSyntheticLambda8OnWarmupCompleted);
                                    if (scaffoldKtExternalSyntheticLambda8 != null) {
                                        int i10 = access100 + 29;
                                        access000 = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            scaffoldKtExternalSyntheticLambda8.onExtraCallbackWithResult(scaffoldKtExternalSyntheticLambda8OnWarmupCompleted);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        scaffoldKtExternalSyntheticLambda8.onExtraCallbackWithResult(scaffoldKtExternalSyntheticLambda8OnWarmupCompleted);
                                    }
                                } catch (RadioButtonKtExternalSyntheticLambda1 e) {
                                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("TtmlParser", "Suppressing parser error", e);
                                }
                            }
                            i4 = access000 + 33;
                            access100 = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i11 = 2 / 5;
                            }
                            onextracallbackOnWarmupCompleted = onextracallback;
                            onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
                            iOnWarmupCompleted = i9;
                        } else {
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            onextracallback = onextracallback2;
                        }
                        i7++;
                        i4 = access000 + 33;
                        access100 = i4 % 128;
                        if (i4 % 2 != 0) {
                        }
                        onextracallbackOnWarmupCompleted = onextracallback;
                        onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
                        iOnWarmupCompleted = i9;
                    } else if (eventType == 4) {
                        int i12 = access100 + 19;
                        access000 = i12 % 128;
                        if (i12 % 2 == 0) {
                            ((ScaffoldKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(scaffoldKtExternalSyntheticLambda8)).onExtraCallbackWithResult(ScaffoldKtExternalSyntheticLambda8.onExtraCallbackWithResult(xmlPullParserNewPullParser.getText()));
                            throw null;
                        }
                        ((ScaffoldKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(scaffoldKtExternalSyntheticLambda8)).onExtraCallbackWithResult(ScaffoldKtExternalSyntheticLambda8.onExtraCallbackWithResult(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            secureTextFieldKtExternalSyntheticLambda0 = new SecureTextFieldKtExternalSyntheticLambda0((ScaffoldKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult((ScaffoldKtExternalSyntheticLambda8) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i7++;
                } else if (eventType == 3) {
                    i7--;
                    int i13 = access100 + 61;
                    access000 = i13 % 128;
                    int i14 = i13 % 2;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                i6 = 15;
            }
            return (RadioButtonKt) RecordingInputConnection_androidKt.onExtraCallbackWithResult(secureTextFieldKtExternalSyntheticLambda0);
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    private static onExtraCallback onWarmupCompleted(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f;
        int i2 = 2 % 2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i3 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i4 = access100 + 119;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            RecordingInputConnection_androidKt.onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = Integer.parseInt(r3[0]) / Integer.parseInt(r3[1]);
        } else {
            f = 1.0f;
        }
        onExtraCallback onextracallback = onExtraCallback;
        int i6 = onextracallback.onExtraCallback;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            int i7 = access100 + 71;
            access000 = i7 % 128;
            if (i7 % 2 != 0) {
                i6 = Integer.parseInt(attributeValue3);
            } else {
                Integer.parseInt(attributeValue3);
                throw null;
            }
        }
        int i8 = onextracallback.onWarmupCompleted;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            int i9 = access100 + 71;
            access000 = i9 % 128;
            int i10 = i9 % 2;
            i8 = Integer.parseInt(attributeValue4);
        }
        return new onExtraCallback(i3 * f, i6, i8);
    }

    private static int onWarmupCompleted(XmlPullParser xmlPullParser, int i2) throws NumberFormatException {
        int i3 = 2 % 2;
        int i4 = access000 + 109;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            int i6 = access100 + 105;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            return i2;
        }
        Matcher matcher = onExtraCallbackWithResult.matcher(attributeValue);
        boolean z = false;
        if (!matcher.matches()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            int i8 = access000 + 83;
            access100 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 0;
            }
            return i2;
        }
        try {
            int i10 = Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1)));
            int i11 = Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(2)));
            if (i10 != 0 && i11 != 0) {
                z = true;
            }
            RecordingInputConnection_androidKt.onExtraCallback(z, "Invalid cell resolution " + i10 + " " + i11);
            return i11;
        } catch (NumberFormatException unused) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i2;
        }
    }

    private static onWarmupCompleted IAuthTabCallback(XmlPullParser xmlPullParser) {
        int i2 = 2 % 2;
        int i3 = access100 + 81;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            String strOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
            if (strOnNavigationEvent == null) {
                int i4 = access100 + 63;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            Matcher matcher = IAuthTabCallbackDefault.matcher(strOnNavigationEvent);
            if (!matcher.matches()) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring non-pixel tts extent: " + strOnNavigationEvent);
                int i6 = access000 + 63;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                return null;
            }
            try {
                return new onWarmupCompleted(Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1))), Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(2))));
            } catch (NumberFormatException unused) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring malformed tts extent: " + strOnNavigationEvent);
                return null;
            }
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        obj.hashCode();
        throw null;
    }

    private static Map<String, SecureTextFieldKtExternalSyntheticLambda1> IAuthTabCallback(XmlPullParser xmlPullParser, Map<String, SecureTextFieldKtExternalSyntheticLambda1> map, int i2, @Nullable onWarmupCompleted onwarmupcompleted, Map<String, SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1> map2, Map<String, String> map3) throws Throwable {
        int i3 = 2 % 2;
        do {
            xmlPullParser.next();
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getJumpTapTimeout() >> 16) + 5, 4 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{'\t', 65532, 65525, 3, 4}, false, ImageFormat.getBitsPerPixel(0) + 185, objArr);
            if (TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onWarmupCompleted(xmlPullParser, ((String) objArr[0]).intern())) {
                Object[] objArr2 = new Object[1];
                a(5 - Gravity.getAbsoluteGravity(0, 0), 3 - TextUtils.indexOf("", "", 0, 0), new char[]{'\t', 65532, 65525, 3, 4}, false, View.resolveSizeAndState(0, 0, 0) + 184, objArr2);
                String strOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, ((String) objArr2[0]).intern());
                SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1 = (SecureTextFieldKtExternalSyntheticLambda1) onExtraCallback(new Object[]{xmlPullParser, new SecureTextFieldKtExternalSyntheticLambda1()}, -609984772, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 609984774, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (strOnNavigationEvent != null) {
                    String[] strArrOnNavigationEvent = onNavigationEvent(strOnNavigationEvent);
                    int length = strArrOnNavigationEvent.length;
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = access100 + 69;
                        access000 = i5 % 128;
                        if (i5 % 2 == 0) {
                            secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent(map.get(strArrOnNavigationEvent[i4]));
                        } else {
                            secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent(map.get(strArrOnNavigationEvent[i4]));
                            i4++;
                        }
                    }
                }
                String strOnTransact = secureTextFieldKtExternalSyntheticLambda1.onTransact();
                if (strOnTransact != null) {
                    int i6 = access100 + 123;
                    access000 = i6 % 128;
                    if (i6 % 2 == 0) {
                        map.put(strOnTransact, secureTextFieldKtExternalSyntheticLambda1);
                        int i7 = 21 / 0;
                    } else {
                        map.put(strOnTransact, secureTextFieldKtExternalSyntheticLambda1);
                    }
                }
            } else if (TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onWarmupCompleted(xmlPullParser, TtmlNode.TAG_REGION)) {
                SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1 secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(xmlPullParser, i2, onwarmupcompleted, map);
                if (secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1OnWarmupCompleted != null) {
                    map2.put(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallback, secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1OnWarmupCompleted);
                }
            } else if (TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onWarmupCompleted(xmlPullParser, TtmlNode.TAG_METADATA)) {
                onExtraCallback(xmlPullParser, map3);
            }
        } while (!TextFieldDecoratorModifierNodeExternalSyntheticLambda5.IAuthTabCallback(xmlPullParser, TtmlNode.TAG_HEAD));
        int i8 = access100 + 121;
        access000 = i8 % 128;
        if (i8 % 2 != 0) {
            return map;
        }
        throw null;
    }

    private static void onExtraCallback(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        int i2 = 2 % 2;
        do {
            xmlPullParser.next();
            if (TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onWarmupCompleted(xmlPullParser, TtmlNode.TAG_IMAGE)) {
                int i3 = access100 + 107;
                access000 = i3 % 128;
                if (i3 % 2 == 0) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, TtmlNode.ATTR_ID);
                    throw null;
                }
                String strOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, TtmlNode.ATTR_ID);
                if (strOnNavigationEvent != null) {
                    int i4 = access000 + 95;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    map.put(strOnNavigationEvent, xmlPullParser.nextText());
                }
            }
        } while (!TextFieldDecoratorModifierNodeExternalSyntheticLambda5.IAuthTabCallback(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02e4 A[PHI: r3
      0x02e4: PHI (r3v2 int) = (r3v1 int), (r3v0 int), (r3v0 int) binds: [B:102:0x02e2, B:95:0x02d1, B:96:0x02d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1 onWarmupCompleted(XmlPullParser xmlPullParser, int i2, @Nullable onWarmupCompleted onwarmupcompleted, Map<String, SecureTextFieldKtExternalSyntheticLambda1> map) throws Throwable {
        float f;
        float f2;
        int i3;
        float f3;
        float f4;
        int i4;
        float f5;
        int i5;
        int i6;
        int i7;
        float f6;
        SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1;
        int i8 = 2;
        int i9 = 2 % 2;
        String strOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, TtmlNode.ATTR_ID);
        if (strOnNavigationEvent == null) {
            return null;
        }
        String strOnNavigationEvent2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, TtmlNode.ATTR_TTS_ORIGIN);
        if (strOnNavigationEvent2 == null) {
            Object[] objArr = new Object[1];
            a(TextUtils.lastIndexOf("", '0') + 6, 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{'\t', 65532, 65525, 3, 4}, false, 183 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            String strOnNavigationEvent3 = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, ((String) objArr[0]).intern());
            if (strOnNavigationEvent3 != null) {
                int i10 = access000 + 7;
                access100 = i10 % 128;
                int i11 = i10 % 2;
                SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda12 = map.get(strOnNavigationEvent3);
                if (secureTextFieldKtExternalSyntheticLambda12 != null) {
                    int i12 = access100 + 123;
                    access000 = i12 % 128;
                    if (i12 % 2 == 0) {
                        strOnNavigationEvent2 = secureTextFieldKtExternalSyntheticLambda12.asInterface();
                        int i13 = 97 / 0;
                    } else {
                        strOnNavigationEvent2 = secureTextFieldKtExternalSyntheticLambda12.asInterface();
                    }
                }
            }
        }
        if (strOnNavigationEvent2 != null) {
            Matcher matcher = IAuthTabCallback.matcher(strOnNavigationEvent2);
            Matcher matcher2 = IAuthTabCallbackDefault.matcher(strOnNavigationEvent2);
            if (matcher.matches()) {
                int i14 = access000 + 101;
                access100 = i14 % 128;
                int i15 = i14 % 2;
                try {
                    f2 = Float.parseFloat((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1))) / 100.0f;
                    f = Float.parseFloat((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(2))) / 100.0f;
                } catch (NumberFormatException unused) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring region with malformed origin: " + strOnNavigationEvent2);
                    return null;
                }
            } else {
                if (!matcher2.matches()) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring region with unsupported origin: " + strOnNavigationEvent2);
                    return null;
                }
                if (onwarmupcompleted == null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring region with missing tts:extent: " + strOnNavigationEvent2);
                    return null;
                }
                try {
                    int i16 = Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher2.group(1)));
                    f2 = i16 / onwarmupcompleted.onExtraCallbackWithResult;
                    f = Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher2.group(2))) / onwarmupcompleted.onNavigationEvent;
                } catch (NumberFormatException unused2) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring region with malformed origin: " + strOnNavigationEvent2);
                    return null;
                }
            }
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        String strOnNavigationEvent4 = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (strOnNavigationEvent4 == null) {
            int i17 = access100 + 55;
            access000 = i17 % 128;
            int i18 = i17 % 2;
            Object[] objArr2 = new Object[1];
            a(MotionEvent.axisFromString("") + 6, (ViewConfiguration.getTapTimeout() >> 16) + 3, new char[]{'\t', 65532, 65525, 3, 4}, false, 183 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
            i3 = 0;
            String strOnNavigationEvent5 = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, ((String) objArr2[0]).intern());
            if (strOnNavigationEvent5 != null && (secureTextFieldKtExternalSyntheticLambda1 = map.get(strOnNavigationEvent5)) != null) {
                strOnNavigationEvent4 = secureTextFieldKtExternalSyntheticLambda1.IAuthTabCallback();
            }
        } else {
            i3 = 0;
        }
        if (strOnNavigationEvent4 != null) {
            Matcher matcher3 = IAuthTabCallback.matcher(strOnNavigationEvent4);
            Matcher matcher4 = IAuthTabCallbackDefault.matcher(strOnNavigationEvent4);
            if (matcher3.matches()) {
                try {
                    float f7 = Float.parseFloat((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher3.group(1))) / 100.0f;
                    f4 = Float.parseFloat((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher3.group(2))) / 100.0f;
                    f6 = f7;
                } catch (NumberFormatException unused3) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring region with malformed extent: " + strOnNavigationEvent2);
                    return null;
                }
            } else {
                if (!matcher4.matches()) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring region with unsupported extent: " + strOnNavigationEvent2);
                    return null;
                }
                if (onwarmupcompleted == null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring region with missing tts:extent: " + strOnNavigationEvent2);
                    return null;
                }
                try {
                    int i19 = Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher4.group(1)));
                    f6 = i19 / onwarmupcompleted.onExtraCallbackWithResult;
                    f4 = Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher4.group(2))) / onwarmupcompleted.onNavigationEvent;
                } catch (NumberFormatException unused4) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Ignoring region with malformed extent: " + strOnNavigationEvent2);
                    return null;
                }
            }
            f3 = f6;
        } else {
            f3 = 1.0f;
            f4 = 1.0f;
        }
        String strOnNavigationEvent6 = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
        if (strOnNavigationEvent6 != null) {
            String lowerCase = Ascii.toLowerCase(strOnNavigationEvent6);
            if (lowerCase.equals(TtmlNode.CENTER)) {
                i4 = i2;
                f5 = f + (f4 / 2.0f);
                i5 = 1;
            } else if (lowerCase.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                i4 = i2;
                f5 = f + f4;
                i5 = 2;
            } else {
                i4 = i2;
                f5 = f;
                i5 = i3;
            }
        }
        float f8 = 1.0f / i4;
        String strOnNavigationEvent7 = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
        if (strOnNavigationEvent7 != null) {
            int i20 = access100 + 111;
            access000 = i20 % 128;
            if (i20 % 2 == 0) {
                Ascii.toLowerCase(strOnNavigationEvent7).hashCode();
                throw null;
            }
            String lowerCase2 = Ascii.toLowerCase(strOnNavigationEvent7);
            int iHashCode = lowerCase2.hashCode();
            if (iHashCode == 3694) {
                if (lowerCase2.equals("tb")) {
                    i7 = i3;
                }
                if (i7 == 0) {
                }
            } else if (iHashCode != 3553396) {
                i7 = (iHashCode == 3553576 && lowerCase2.equals(TtmlNode.VERTICAL_RL)) ? 2 : -1;
                if (i7 == 0 || i7 == 1) {
                    i6 = i8;
                } else {
                    if (i7 == 2) {
                        i6 = 1;
                    }
                    i8 = Integer.MIN_VALUE;
                    i6 = i8;
                }
            } else {
                if (lowerCase2.equals(TtmlNode.VERTICAL_LR)) {
                    i7 = 1;
                }
                if (i7 == 0) {
                    i6 = i8;
                }
            }
        } else {
            i8 = Integer.MIN_VALUE;
            i6 = i8;
        }
        return new SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1(strOnNavigationEvent, f2, f5, 0, i5, f3, f4, 1, f8, i6);
    }

    private static String[] onNavigationEvent(String str) {
        int i2 = 2 % 2;
        String strTrim = str.trim();
        if (!strTrim.isEmpty()) {
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(strTrim, "\\s+");
        }
        int i3 = access000 + 1;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        String[] strArr = new String[0];
        int i6 = i4 + 117;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 17 / 0;
        }
        return strArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        char c;
        char c2;
        XmlPullParser xmlPullParser = (XmlPullParser) objArr[0];
        SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = (SecureTextFieldKtExternalSyntheticLambda1) objArr[1];
        int i2 = 2 % 2;
        int i3 = access000 + 123;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int attributeCount = xmlPullParser.getAttributeCount();
        int i5 = 0;
        while (i5 < attributeCount) {
            int i6 = access000 + 119;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            String attributeValue = xmlPullParser.getAttributeValue(i5);
            String attributeName = xmlPullParser.getAttributeName(i5);
            char c3 = 'V';
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (!attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        c3 = 65535;
                        break;
                    } else {
                        c3 = 0;
                        break;
                    }
                case -1289044182:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_EXTENT)) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        c3 = 2;
                        break;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        c3 = 3;
                        break;
                    }
                    break;
                case -1008619738:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_ORIGIN)) {
                        int i8 = access100 + 95;
                        access000 = i8 % 128;
                        if (i8 % 2 != 0) {
                            c3 = 4;
                            break;
                        }
                    }
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        c3 = 5;
                        break;
                    }
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals(TtmlNode.ATTR_ID)) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_RUBY)) {
                        c3 = '\b';
                        break;
                    }
                    break;
                case 94842723:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_COLOR)) {
                        c3 = '\t';
                        break;
                    }
                    break;
                case 109403361:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_SHEAR)) {
                        int i9 = access000 + 103;
                        access100 = i9 % 128;
                        if (i9 % 2 == 0) {
                            c3 = '\n';
                            break;
                        }
                    }
                    break;
                case 110138194:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_COMBINE)) {
                        int i10 = access100 + 31;
                        access000 = i10 % 128;
                        if (i10 % 2 != 0) {
                            c3 = 11;
                            break;
                        }
                    }
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        c3 = '\f';
                        break;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_EMPHASIS)) {
                        c3 = '\r';
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_RUBY_POSITION)) {
                        c3 = 14;
                        break;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        c3 = 15;
                        break;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals(TtmlNode.ATTR_EBUTTS_MULTI_ROW_ALIGN)) {
                        c3 = 16;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onWarmupCompleted(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onNavigationEvent(attributeValue);
                    break;
                case 2:
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).IAuthTabCallback(attributeValue);
                    break;
                case 3:
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onWarmupCompleted((Layout.Alignment) onExtraCallback(new Object[]{attributeValue}, -405330641, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 405330641, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent()));
                    break;
                case 4:
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onWarmupCompleted(attributeValue);
                    break;
                case 5:
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    switch (lowerCase.hashCode()) {
                        case -1461280213:
                            if (!lowerCase.equals(TtmlNode.NO_UNDERLINE)) {
                                int i11 = access100 + 85;
                                access000 = i11 % 128;
                                int i12 = i11 % 2;
                                c = 65535;
                                break;
                            } else {
                                c = 0;
                                break;
                            }
                        case -1026963764:
                            if (!lowerCase.equals(TtmlNode.UNDERLINE)) {
                                c = 65535;
                                break;
                            } else {
                                c = 1;
                                break;
                            }
                        case 913457136:
                            if (lowerCase.equals(TtmlNode.NO_LINETHROUGH)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (lowerCase.equals(TtmlNode.LINETHROUGH)) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onExtraCallback(false);
                        break;
                    } else if (c == 1) {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onExtraCallback(true);
                        break;
                    } else if (c == 2) {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).IAuthTabCallback(false);
                        break;
                    } else if (c == 3) {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).IAuthTabCallback(true);
                        break;
                    }
                    break;
                case 6:
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onNavigationEvent(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    Object[] objArr2 = new Object[1];
                    a(5 - (ViewConfiguration.getFadingEdgeLength() >> 16), 3 - View.resolveSizeAndState(0, 0, 0), new char[]{'\t', 65532, 65525, 3, 4}, false, ExpandableListView.getPackedPositionChild(0L) + 185, objArr2);
                    if (((String) objArr2[0]).intern().equals(xmlPullParser.getName())) {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onExtraCallback(attributeValue);
                        break;
                    }
                    break;
                case '\b':
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    switch (lowerCase2.hashCode()) {
                        case -618561360:
                            if (!lowerCase2.equals(TtmlNode.RUBY_BASE_CONTAINER)) {
                                c2 = 65535;
                                break;
                            } else {
                                int i13 = access100 + 117;
                                access000 = i13 % 128;
                                if (i13 % 2 != 0) {
                                    c2 = 0;
                                    break;
                                } else {
                                    c2 = 1;
                                    break;
                                }
                            }
                        case -410956671:
                            if (lowerCase2.equals(TtmlNode.RUBY_CONTAINER)) {
                            }
                            break;
                        case -250518009:
                            if (lowerCase2.equals(TtmlNode.RUBY_DELIMITER)) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -136074796:
                            if (lowerCase2.equals(TtmlNode.RUBY_TEXT_CONTAINER)) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 3016401:
                            if (lowerCase2.equals(TtmlNode.RUBY_BASE)) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3556653:
                            Object[] objArr3 = new Object[1];
                            a(4 - (Process.myTid() >> 22), 2 - TextUtils.indexOf("", ""), new char[]{7, 3, 3, 65524}, false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 184, objArr3);
                            if (lowerCase2.equals(((String) objArr3[0]).intern())) {
                                c2 = 5;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 == 1) {
                            secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).IAuthTabCallback(1);
                            break;
                        } else if (c2 == 2) {
                            secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).IAuthTabCallback(4);
                            break;
                        } else if (c2 == 3) {
                            secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).IAuthTabCallback(3);
                            break;
                        } else if (c2 != 4) {
                            if (c2 == 5) {
                            }
                        }
                    } else {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).IAuthTabCallback(2);
                        break;
                    }
                    break;
                case '\t':
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted);
                    try {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.onExtraCallback(TextFieldCoreModifierNodestartCursorJob1ExternalSyntheticLambda0.onExtraCallback(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\n':
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onExtraCallbackWithResult(((Float) onExtraCallback(new Object[]{attributeValue}, 887691412, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -887691411, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).floatValue());
                    break;
                case 11:
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    if (!lowerCase3.equals(TtmlNode.COMBINE_ALL)) {
                        Object[] objArr4 = new Object[1];
                        a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, (ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{2, 65529, 2, 3}, true, 180 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
                        if (lowerCase3.equals(((String) objArr4[0]).intern())) {
                            secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onExtraCallbackWithResult(false);
                            break;
                        }
                    } else {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onExtraCallbackWithResult(true);
                        break;
                    }
                    break;
                case '\f':
                    try {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted);
                        IAuthTabCallback(attributeValue, secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted);
                        break;
                    } catch (RadioButtonKtExternalSyntheticLambda1 unused2) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case '\r':
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onWarmupCompleted(ScaffoldKtExternalSyntheticLambda7.onExtraCallbackWithResult(attributeValue));
                    break;
                case 14:
                    if (!Ascii.toLowerCase(attributeValue).equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        if (!r7.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                            int i14 = access100 + 119;
                            access000 = i14 % 128;
                            int i15 = i14 % 2;
                            break;
                        } else {
                            secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onExtraCallbackWithResult(2);
                            break;
                        }
                    } else {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).onExtraCallbackWithResult(1);
                        break;
                    }
                case 15:
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted);
                    try {
                        secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted(TextFieldCoreModifierNodestartCursorJob1ExternalSyntheticLambda0.onExtraCallback(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted).IAuthTabCallback((Layout.Alignment) onExtraCallback(new Object[]{attributeValue}, -405330641, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 405330641, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent()));
                    break;
            }
            i5++;
            int i16 = access100 + 107;
            access000 = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 5 % 3;
            }
        }
        return secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted;
    }

    private static SecureTextFieldKtExternalSyntheticLambda1 onWarmupCompleted(@Nullable SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1) {
        int i2 = 2 % 2;
        int i3 = access100 + 95;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if (secureTextFieldKtExternalSyntheticLambda1 == null) {
            secureTextFieldKtExternalSyntheticLambda1 = new SecureTextFieldKtExternalSyntheticLambda1();
        }
        int i5 = access000 + 31;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return secureTextFieldKtExternalSyntheticLambda1;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        char c = 0;
        String str = (String) objArr[0];
        int i2 = 2 % 2;
        int i3 = access100 + 41;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Ascii.toLowerCase(str).hashCode();
            obj.hashCode();
            throw null;
        }
        String lowerCase = Ascii.toLowerCase(str);
        switch (lowerCase.hashCode()) {
            case -1364013995:
                if (lowerCase.equals(TtmlNode.CENTER)) {
                    int i4 = access100 + 89;
                    access000 = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                } else {
                    c = 65535;
                    break;
                }
            case 100571:
                if (lowerCase.equals(TtmlNode.END)) {
                    int i6 = access000 + 81;
                    access100 = i6 % 128;
                    int i7 = i6 % 2;
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (!(!lowerCase.equals(TtmlNode.LEFT))) {
                    int i8 = access100 + 45;
                    access000 = i8 % 128;
                    if (i8 % 2 != 0) {
                        c = 2;
                        break;
                    } else {
                        c = 4;
                        break;
                    }
                }
                break;
            case 108511772:
                if (lowerCase.equals(TtmlNode.RIGHT)) {
                    c = 3;
                    break;
                }
                break;
            case 109757538:
                if (lowerCase.equals("start")) {
                }
                break;
        }
        if (c == 0) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (c != 1) {
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        return null;
                    }
                }
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065 A[PHI: r29
      0x0065: PHI (r29v7 int) = (r29v0 int), (r29v1 int), (r29v2 int), (r29v3 int), (r29v4 int), (r29v8 int) binds: [B:26:0x00fb, B:23:0x00ef, B:20:0x00e3, B:17:0x00cd, B:14:0x00b7, B:8:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ScaffoldKtExternalSyntheticLambda8 onWarmupCompleted(XmlPullParser xmlPullParser, @Nullable ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8, Map<String, SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1> map, onExtraCallback onextracallback) throws Throwable {
        long j;
        long j2;
        int i2;
        char c;
        int i3;
        String strSubstring;
        int i4 = 2;
        int i5 = 2 % 2;
        int attributeCount = xmlPullParser.getAttributeCount();
        SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1 = (SecureTextFieldKtExternalSyntheticLambda1) onExtraCallback(new Object[]{xmlPullParser, null}, -609984772, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 609984774, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        int i6 = 0;
        String str = null;
        int i7 = 0;
        String str2 = "";
        long jIAuthTabCallback = -9223372036854775807L;
        long jIAuthTabCallback2 = -9223372036854775807L;
        long jIAuthTabCallback3 = -9223372036854775807L;
        String[] strArr = null;
        while (i7 < attributeCount) {
            int i8 = access000 + 83;
            access100 = i8 % 128;
            if (i8 % i4 != 0) {
                String attributeName = xmlPullParser.getAttributeName(i7);
                xmlPullParser.getAttributeValue(i7);
                attributeName.hashCode();
                throw null;
            }
            String attributeName2 = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            switch (attributeName2.hashCode()) {
                case -934795532:
                    i2 = attributeCount;
                    if (!attributeName2.equals(TtmlNode.TAG_REGION)) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case 99841:
                    i2 = attributeCount;
                    if (attributeName2.equals("dur")) {
                        c = 1;
                        break;
                    }
                    break;
                case 100571:
                    i2 = attributeCount;
                    if (attributeName2.equals(TtmlNode.END)) {
                        c = 2;
                        break;
                    }
                    break;
                case 93616297:
                    i2 = attributeCount;
                    if (attributeName2.equals("begin")) {
                        int i9 = access100 + 115;
                        access000 = i9 % 128;
                        int i10 = i9 % 2;
                        c = 3;
                        break;
                    }
                    break;
                case 109780401:
                    i2 = attributeCount;
                    Object[] objArr = new Object[1];
                    a(4 - (ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, new char[]{'\t', 65532, 65525, 3, 4}, false, 184 - Color.argb(i6, i6, i6, i6), objArr);
                    if (attributeName2.equals(((String) objArr[0]).intern())) {
                        int i11 = access000 + 29;
                        access100 = i11 % 128;
                        int i12 = i11 % 2;
                        c = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (!(!attributeName2.equals("backgroundImage"))) {
                        i2 = attributeCount;
                        c = 5;
                        break;
                    }
                default:
                    i2 = attributeCount;
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i3 = 0;
                if (map.containsKey(attributeValue)) {
                    str2 = attributeValue;
                }
            } else if (c == 1) {
                i3 = 0;
                jIAuthTabCallback3 = IAuthTabCallback(attributeValue, onextracallback);
            } else if (c == 2) {
                i3 = 0;
                jIAuthTabCallback2 = IAuthTabCallback(attributeValue, onextracallback);
            } else if (c == 3) {
                i3 = 0;
                jIAuthTabCallback = IAuthTabCallback(attributeValue, onextracallback);
            } else if (c == 4) {
                i3 = 0;
                String[] strArrOnNavigationEvent = onNavigationEvent(attributeValue);
                if (strArrOnNavigationEvent.length > 0) {
                    strArr = strArrOnNavigationEvent;
                }
            } else if (c != 5) {
                i3 = 0;
            } else if (attributeValue.startsWith("#")) {
                int i13 = access100 + 9;
                access000 = i13 % 128;
                if (i13 % 2 == 0) {
                    i3 = 0;
                    strSubstring = attributeValue.substring(0);
                } else {
                    i3 = 0;
                    strSubstring = attributeValue.substring(1);
                }
                str = strSubstring;
            } else {
                i3 = 0;
            }
            i7++;
            i6 = i3;
            attributeCount = i2;
            i4 = 2;
        }
        if (scaffoldKtExternalSyntheticLambda8 != null) {
            long j3 = scaffoldKtExternalSyntheticLambda8.asBinder;
            j = -9223372036854775807L;
            if (j3 != -9223372036854775807L) {
                if (jIAuthTabCallback != -9223372036854775807L) {
                    jIAuthTabCallback += j3;
                }
                if (jIAuthTabCallback2 != -9223372036854775807L) {
                    jIAuthTabCallback2 += j3;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j4 = jIAuthTabCallback;
        if (jIAuthTabCallback2 != j) {
            j2 = jIAuthTabCallback2;
        } else if (jIAuthTabCallback3 != j) {
            int i14 = access100 + 69;
            access000 = i14 % 128;
            j2 = i14 % 2 == 0 ? j4 | jIAuthTabCallback3 : j4 + jIAuthTabCallback3;
        } else if (scaffoldKtExternalSyntheticLambda8 != null) {
            j2 = scaffoldKtExternalSyntheticLambda8.onNavigationEvent;
            if (j2 != -9223372036854775807L) {
                int i15 = access100 + 71;
                access000 = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        return ScaffoldKtExternalSyntheticLambda8.onWarmupCompleted(xmlPullParser.getName(), j4, j2, secureTextFieldKtExternalSyntheticLambda1, strArr, str2, str, scaffoldKtExternalSyntheticLambda8);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean onExtraCallback(String str) throws Throwable {
        int i2 = 2 % 2;
        if (!str.equals("tt")) {
            int i3 = access100 + 109;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            if (!str.equals(TtmlNode.TAG_HEAD) && !str.equals(TtmlNode.TAG_BODY) && !str.equals(TtmlNode.TAG_DIV)) {
                int i5 = access100 + 5;
                access000 = i5 % 128;
                Object obj = null;
                if (i5 % 2 == 0) {
                    str.equals(TtmlNode.TAG_P);
                    obj.hashCode();
                    throw null;
                }
                if (!str.equals(TtmlNode.TAG_P) && !str.equals(TtmlNode.TAG_SPAN) && !str.equals(TtmlNode.TAG_BR)) {
                    int i6 = access000 + 87;
                    access100 = i6 % 128;
                    int i7 = i6 % 2;
                    a(5 - (ViewConfiguration.getWindowTouchSlop() >> 8), 3 - Color.green(0), new char[]{'\t', 65532, 65525, 3, 4}, false, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 184, new Object[1]);
                    if (!str.equals(((String) r3[0]).intern())) {
                        int i8 = access100 + 117;
                        access000 = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 65 / 0;
                            if (!str.equals(TtmlNode.TAG_STYLING)) {
                                if (!str.equals(TtmlNode.TAG_LAYOUT)) {
                                    int i10 = access000 + 15;
                                    access100 = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        int i11 = 84 / 0;
                                        if (!str.equals(TtmlNode.TAG_REGION)) {
                                            if (!str.equals(TtmlNode.TAG_METADATA)) {
                                                int i12 = access000 + 49;
                                                access100 = i12 % 128;
                                                if (i12 % 2 != 0) {
                                                    str.equals(TtmlNode.TAG_IMAGE);
                                                    throw null;
                                                }
                                                if (!str.equals(TtmlNode.TAG_IMAGE)) {
                                                    a(4 - Gravity.getAbsoluteGravity(0, 0), 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{65534, 65531, 14, 65531}, true, Color.red(0) + 174, new Object[1]);
                                                    if ((!str.equals(((String) r0[0]).intern())) && !str.equals(TtmlNode.TAG_INFORMATION)) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (!str.equals(TtmlNode.TAG_REGION)) {
                                    }
                                }
                            }
                        } else if (!str.equals(TtmlNode.TAG_STYLING)) {
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void IAuthTabCallback(String str, SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1) throws RadioButtonKtExternalSyntheticLambda1 {
        Matcher matcher;
        char c;
        int i2 = 2 % 2;
        int i3 = access100 + 89;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        String[] strArrOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(str, "\\s+");
        if (strArrOnNavigationEvent.length == 1) {
            matcher = asBinder.matcher(str);
        } else {
            if (strArrOnNavigationEvent.length != 2) {
                throw new RadioButtonKtExternalSyntheticLambda1("Invalid number of entries for fontSize: " + strArrOnNavigationEvent.length + ".");
            }
            int i5 = access100 + 67;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            matcher = asBinder.matcher(strArrOnNavigationEvent[1]);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
            int i7 = access100 + 97;
            access000 = i7 % 128;
            int i8 = i7 % 2;
        }
        if (!matcher.matches()) {
            throw new RadioButtonKtExternalSyntheticLambda1("Invalid expression for fontSize: '" + str + "'.");
        }
        int i9 = access100 + 67;
        access000 = i9 % 128;
        int i10 = i9 % 2;
        String str2 = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(3));
        int iHashCode = str2.hashCode();
        if (iHashCode != 37) {
            if (iHashCode != 3240) {
                c = (iHashCode == 3592 && str2.equals("px")) ? (char) 2 : (char) 65535;
            } else if (str2.equals("em")) {
                c = 1;
            }
        } else if (str2.equals("%")) {
            c = 0;
        }
        if (c == 0) {
            secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent(3);
        } else if (c == 1) {
            secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent(2);
        } else {
            if (c != 2) {
                throw new RadioButtonKtExternalSyntheticLambda1("Invalid unit for fontSize: '" + str2 + "'.");
            }
            secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent(1);
        }
        secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent(Float.parseFloat((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1))));
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        int i2 = 2 % 2;
        int i3 = access000 + 7;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onNavigationEvent.matcher(str).matches();
            throw null;
        }
        Matcher matcher = onNavigationEvent.matcher(str);
        if (matcher.matches()) {
            try {
                return Float.valueOf(Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1))))));
            } catch (NumberFormatException e) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("TtmlParser", "Failed to parse shear: " + str, e);
                return Float.valueOf(Float.MAX_VALUE);
            }
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TtmlParser", "Invalid value for shear: " + str);
        int i4 = access000 + 123;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(Float.MAX_VALUE);
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r3.matches() != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long IAuthTabCallback(String str, onExtraCallback onextracallback) throws RadioButtonKtExternalSyntheticLambda1, NumberFormatException {
        Matcher matcher;
        double d;
        double d2;
        int i2 = 2 % 2;
        int i3 = access100 + 13;
        access000 = i3 % 128;
        int i4 = 5;
        if (i3 % 2 != 0) {
            matcher = onWarmupCompleted.matcher(str);
            if (!matcher.matches()) {
                i4 = 4;
                Matcher matcher2 = asInterface.matcher(str);
                if (!matcher2.matches()) {
                    throw new RadioButtonKtExternalSyntheticLambda1("Malformed time expression: " + str);
                }
                double d3 = Double.parseDouble((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher2.group(1)));
                String str2 = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher2.group(2));
                int iHashCode = str2.hashCode();
                if (iHashCode != 102) {
                    if (iHashCode != 104) {
                        if (iHashCode != 109) {
                            if (iHashCode != 116) {
                                if (iHashCode != 3494 || !str2.equals("ms")) {
                                    i4 = -1;
                                }
                            } else if (str2.equals("t")) {
                                i4 = 3;
                            }
                        } else if (str2.equals("m")) {
                            i4 = 2;
                        }
                    } else if (str2.equals("h")) {
                        i4 = 1;
                    }
                } else if (str2.equals("f")) {
                    int i5 = access100 + 111;
                    access000 = i5 % 128;
                    i4 = (i5 % 2 == 0 ? 0 : 1) ^ 1;
                }
                if (i4 != 0) {
                    if (i4 == 1) {
                        d2 = 3600.0d;
                    } else if (i4 == 2) {
                        d2 = 60.0d;
                    } else {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                d = 1000.0d;
                            }
                            return (long) (d3 * 1000000.0d);
                        }
                        d = onextracallback.onWarmupCompleted;
                    }
                    d3 *= d2;
                    int i6 = access000 + 125;
                    access100 = i6 % 128;
                    int i7 = i6 % 2;
                    return (long) (d3 * 1000000.0d);
                }
                d = onextracallback.IAuthTabCallback;
                int i8 = access100 + 77;
                access000 = i8 % 128;
                int i9 = i8 % 2;
                d3 /= d;
                return (long) (d3 * 1000000.0d);
            }
            int i10 = access000 + 101;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            double d4 = Long.parseLong((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1))) * 3600;
            double d5 = Long.parseLong((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(2))) * 60;
            double d6 = Long.parseLong((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d7 = strGroup != null ? Double.parseDouble(strGroup) : 0.0d;
            return (long) ((d4 + d5 + d6 + d7 + (matcher.group(5) != null ? Long.parseLong(r0) / onextracallback.IAuthTabCallback : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r0) / onextracallback.onExtraCallback) / onextracallback.IAuthTabCallback : 0.0d)) * 1000000.0d);
        }
        matcher = onWarmupCompleted.matcher(str);
    }

    private static Layout.Alignment IAuthTabCallback(String str) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Layout.Alignment) onExtraCallback(new Object[]{str}, -405330641, iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 405330641, iOnNavigationEvent2);
    }

    private static float onExtraCallbackWithResult(String str) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return ((Float) onExtraCallback(new Object[]{str}, 887691412, iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -887691411, iOnNavigationEvent2)).floatValue();
    }

    private static SecureTextFieldKtExternalSyntheticLambda1 onWarmupCompleted(XmlPullParser xmlPullParser, SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (SecureTextFieldKtExternalSyntheticLambda1) onExtraCallback(new Object[]{xmlPullParser, secureTextFieldKtExternalSyntheticLambda1}, -609984772, iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 609984774, iOnNavigationEvent2);
    }

    static void IAuthTabCallback() {
        onTransact = 478308961;
    }

    static final class onExtraCallback {
        final float IAuthTabCallback;
        final int onExtraCallback;
        final int onWarmupCompleted;

        onExtraCallback(float f, int i2, int i3) {
            this.IAuthTabCallback = f;
            this.onExtraCallback = i2;
            this.onWarmupCompleted = i3;
        }
    }

    static final class onWarmupCompleted {
        final int onExtraCallbackWithResult;
        final int onNavigationEvent;

        onWarmupCompleted(int i2, int i3) {
            this.onExtraCallbackWithResult = i2;
            this.onNavigationEvent = i3;
        }
    }
}
