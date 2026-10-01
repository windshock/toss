package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class FeFloodView extends FilterPrimitiveView {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Pattern IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;

    @Nullable
    public ReadableArray onExtraCallback;
    public float onExtraCallbackWithResult;

    static {
        onExtraCallback();
        IAuthTabCallback = Pattern.compile("[0-9.-]+");
        int i = onNavigationEvent + 31;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 94 / 0;
        }
    }

    public FeFloodView(ReactContext reactContext) {
        super(reactContext);
        this.onExtraCallbackWithResult = 1.0f;
    }

    public void setFloodColor(@Nullable Dynamic dynamic) throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        if (dynamic == null || dynamic.isNull()) {
            this.onExtraCallback = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            setFloodColor(dynamic.asMap());
            int i2 = IAuthTabCallbackStub + 15;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = 0;
        if (dynamic.getType().equals(ReadableType.Number)) {
            this.onExtraCallback = JavaOnlyArray.of(new Object[]{0, Integer.valueOf(dynamic.asInt())});
        } else if (!(!r1.equals(ReadableType.Array))) {
            this.onExtraCallback = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = IAuthTabCallback.matcher(dynamic.asString());
            while (matcher.find()) {
                double d = Double.parseDouble(matcher.group());
                if (i3 < 3) {
                    int i4 = IAuthTabCallbackStub + 89;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    d /= 255.0d;
                }
                javaOnlyArray.pushDouble(d);
                i3++;
                int i6 = asInterface + 47;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 3;
                }
            }
            this.onExtraCallback = javaOnlyArray;
        }
        invalidate();
        int i8 = asInterface + 45;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59, KeyEvent.getDeadChar(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        int i4 = $10 + 89;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 60 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i6 = $10 + 45;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 3;
            }
        }
        objArr[0] = new String(cArr2);
    }

    public void setFloodColor(@Nullable ReadableMap readableMap) throws Throwable {
        int i = 2 % 2;
        if (readableMap == null) {
            int i2 = asInterface + 121;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback = null;
            invalidate();
            return;
        }
        Object[] objArr = new Object[1];
        b(new char[]{43766, 42372, 46092, 33946}, 3967 - Color.blue(0), objArr);
        int i4 = readableMap.getInt(((String) objArr[0]).intern());
        if (i4 == 0) {
            Object[] objArr2 = new Object[1];
            b(new char[]{43762, 24788, 16021, 62539, 33329, 23024, 6060}, 51767 - View.MeasureSpec.getSize(0), objArr2);
            if (readableMap.getType(((String) objArr2[0]).intern()).equals(ReadableType.Number)) {
                int i5 = IAuthTabCallbackStub + 23;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr3 = new Object[1];
                b(new char[]{43762, 24788, 16021, 62539, 33329, 23024, 6060}, 51767 - (Process.myTid() >> 22), objArr3);
                this.onExtraCallback = JavaOnlyArray.of(new Object[]{0, Integer.valueOf(readableMap.getInt(((String) objArr3[0]).intern()))});
            } else if (!(!r4.equals(ReadableType.Map))) {
                int i7 = IAuthTabCallbackStub + 73;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr4 = new Object[1];
                b(new char[]{43762, 24788, 16021, 62539, 33329, 23024, 6060}, 51768 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
                this.onExtraCallback = JavaOnlyArray.of(new Object[]{0, readableMap.getMap(((String) objArr4[0]).intern())});
            }
        } else if (i4 == 1) {
            int i9 = asInterface + 43;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            this.onExtraCallback = JavaOnlyArray.of(new Object[]{1, readableMap.getString("brushRef")});
            int i11 = asInterface + 25;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
        } else {
            this.onExtraCallback = JavaOnlyArray.of(new Object[]{Integer.valueOf(i4)});
        }
        invalidate();
    }

    public void setFloodOpacity(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = f;
        invalidate();
        int i4 = asInterface + 39;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    public Bitmap onNavigationEvent(HashMap<String, Bitmap> map, Bitmap bitmap) {
        int i = 2 % 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(129);
        paint.setStyle(Paint.Style.FILL);
        onExtraCallback(paint, this.onExtraCallbackWithResult, this.onExtraCallback);
        canvas.drawPaint(paint);
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onExtraCallback(Paint paint, float f, @Nullable ReadableArray readableArray) {
        double d;
        int iIntValue;
        int i = 2 % 2;
        if (readableArray.getInt(0) != 0) {
            return;
        }
        if (readableArray.size() == 2) {
            int i2 = IAuthTabCallbackStub + 49;
            asInterface = i2 % 128;
            if (i2 % 2 != 0 ? readableArray.getType(1) == ReadableType.Map : readableArray.getType(0) == ReadableType.Map) {
                iIntValue = ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue();
                int i3 = asInterface + 123;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iIntValue = readableArray.getInt(1);
            }
            paint.setColor((Math.round((iIntValue >>> 24) * f) << 24) | (iIntValue & 16777215));
            return;
        }
        if (readableArray.size() > 4) {
            int i5 = IAuthTabCallbackStub + 85;
            asInterface = i5 % 128;
            d = i5 % 2 == 0 ? (readableArray.getDouble(5) + f) / 255.0d : readableArray.getDouble(4) * f * 255.0d;
        } else {
            d = f * 255.0f;
        }
        paint.setARGB((int) d, (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
    }

    static void onExtraCallback() {
        onWarmupCompleted = 5299891254795775925L;
    }
}
