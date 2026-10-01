package im.toss.facepay.validation.model.init.config.quality;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class QcV2Config$$serializer implements aeu2<QcV2Config> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final QcV2Config$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onTransact = 1;
    private static long onWarmupCompleted;

    private QcV2Config$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 45;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        QcV2Config$$serializer qcV2Config$$serializer = new QcV2Config$$serializer();
        INSTANCE = qcV2Config$$serializer;
        Object[] objArr = new Object[1];
        a(new int[]{0, 63, 0, 41}, true, new byte[]{0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1}, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), qcV2Config$$serializer, 9);
        Object[] objArr2 = new Object[1];
        a(new int[]{63, 10, 143, 0}, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 0, 0}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new int[]{73, 9, 156, 0}, false, new byte[]{1, 0, 0, 1, 1, 0, 0, 0, 1}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        b(new char[]{36596, 36505, 62027, 48735, 1023, 38714, 39782, 29198}, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        a(new int[]{82, 10, 0, 9}, true, new byte[]{1, 0, 0, 0, 1, 1, 1, 1, 0, 0}, objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        Object[] objArr6 = new Object[1];
        b(new char[]{35284, 35258, 64403, 46979, 11768, 53013, 46439, 10814, 47218, 34235, 59178, 55395, 59908, 19454, 53528, 34423, 7387, 6673, 1015, 46497, 20202}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), true);
        Object[] objArr7 = new Object[1];
        a(new int[]{92, 3, 26, 0}, false, new byte[]{1, 0, 0}, objArr7);
        setanimationsloop.onWarmupCompleted(((String) objArr7[0]).intern(), true);
        Object[] objArr8 = new Object[1];
        a(new int[]{95, 5, 0, 2}, false, new byte[]{1, 1, 0, 1, 1}, objArr8);
        setanimationsloop.onWarmupCompleted(((String) objArr8[0]).intern(), true);
        Object[] objArr9 = new Object[1];
        a(new int[]{100, 4, 0, 0}, true, new byte[]{0, 0, 1, 1}, objArr9);
        setanimationsloop.onWarmupCompleted(((String) objArr9[0]).intern(), true);
        Object[] objArr10 = new Object[1];
        a(new int[]{104, 12, 46, 10}, true, new byte[]{1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1}, objArr10);
        setanimationsloop.onWarmupCompleted(((String) objArr10[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 101;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        dj3 dj3Var = dj3.onWarmupCompleted;
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {dj3Var, dj3Var, dj3Var, dj3Var, dj3Var, setvideolistener, setvideolistener, setvideolistener, dj3Var};
        int i4 = onTransact + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final QcV2Config deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        float f;
        int i;
        float f2;
        double d;
        float fOnWarmupCompleted;
        float f3;
        float f4;
        double d2;
        float fOnWarmupCompleted2;
        double dIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onTransact + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onExtraCallback + 87;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            float fOnWarmupCompleted3 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
            float fOnWarmupCompleted4 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            float fOnWarmupCompleted5 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
            float fOnWarmupCompleted6 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
            double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
            double dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 6);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 7);
            fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 8);
            f2 = fOnWarmupCompleted3;
            i = 511;
            f3 = fOnWarmupCompleted6;
            f = fOnWarmupCompleted5;
            f4 = fOnWarmupCompleted4;
            d2 = dIAuthTabCallback2;
            d = dIAuthTabCallback3;
        } else {
            float fOnWarmupCompleted7 = 0.0f;
            float fOnWarmupCompleted8 = 0.0f;
            float fOnWarmupCompleted9 = 0.0f;
            float fOnWarmupCompleted10 = 0.0f;
            boolean z = true;
            double dIAuthTabCallback4 = 0.0d;
            double dIAuthTabCallback5 = 0.0d;
            double dIAuthTabCallback6 = 0.0d;
            float fOnWarmupCompleted11 = 0.0f;
            float fOnWarmupCompleted12 = 0.0f;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i5 |= 1;
                        fOnWarmupCompleted11 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                        break;
                    case 1:
                        fOnWarmupCompleted10 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        fOnWarmupCompleted7 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        fOnWarmupCompleted8 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        fOnWarmupCompleted9 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        dIAuthTabCallback5 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
                        i5 |= 32;
                        break;
                    case 6:
                        dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 6);
                        i5 |= 64;
                        break;
                    case 7:
                        dIAuthTabCallback6 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 7);
                        i5 |= 128;
                        break;
                    case 8:
                        fOnWarmupCompleted12 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 8);
                        i5 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            f = fOnWarmupCompleted7;
            i = i5;
            f2 = fOnWarmupCompleted11;
            d = dIAuthTabCallback4;
            fOnWarmupCompleted = fOnWarmupCompleted8;
            f3 = fOnWarmupCompleted9;
            f4 = fOnWarmupCompleted10;
            d2 = dIAuthTabCallback5;
            fOnWarmupCompleted2 = fOnWarmupCompleted12;
            dIAuthTabCallback = dIAuthTabCallback6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new QcV2Config(i, f2, f4, f, fOnWarmupCompleted, f3, d2, d, dIAuthTabCallback, fOnWarmupCompleted2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m324deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        QcV2Config qcV2ConfigDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 3;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return qcV2ConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull QcV2Config qcV2Config) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(qcV2Config, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            QcV2Config.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1896173477, iOnNavigationEvent, 1896173478, new Object[]{qcV2Config, vylVarOnExtraCallback, serialDescriptor}, iOnNavigationEvent3, iOnNavigationEvent2);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(qcV2Config, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent5 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent6 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        QcV2Config.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1896173477, iOnNavigationEvent4, 1896173478, new Object[]{qcV2Config, vylVarOnExtraCallback2, serialDescriptor2}, iOnNavigationEvent6, iOnNavigationEvent5);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (QcV2Config) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 89;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 45;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Drawable.resolveOpacity(0, 0)), Process.getGidForName("") + 85, ExpandableListView.getPackedPositionChild(0L) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - TextUtils.lastIndexOf("", '0')), 19 - ExpandableListView.getPackedPositionGroup(0L), Process.getGidForName("") + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 25;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 44 / 0;
            objArr[0] = str;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int i7 = $10 + 33;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.resolveSize(0, 0)), View.getDefaultSize(0, 0) + 35, 14238 - MotionEvent.axisFromString(""), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
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
                int i10 = $11 + 105;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 10936), 65 - View.getDefaultSize(0, 0), View.MeasureSpec.getMode(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Process.getGidForName("") + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 49467), Color.argb(0, 0, 0, 0) + 70, Color.green(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i15 = $10 + 39;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i4 >> trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent / 0;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i16 = $10 + 59;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i17 = $10 + 53;
        $11 = i17 % 128;
        int i18 = i17 % 2;
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{27257, 27168, 27175, 27142, 27167, 27168, 27173, 27173, 27141, 27139, 27174, 27178, 27175, 27168, 27139, 27136, 27168, 27170, 27168, 27172, 27180, 27176, 27172, 27176, 27173, 27164, 27165, 27171, 27174, 27172, 27178, 27180, 27181, 27140, 27166, 27197, 27199, 27199, 27167, 27139, 27173, 27174, 27174, 27177, 27172, 27168, 27159, 27252, 27146, 27154, 27156, 27249, 27165, 27192, 27168, 27172, 27176, 27173, 27197, 27137, 27140, 27174, 27177, 27191, 27320, 27314, 27470, 27317, 27325, 27309, 27296, 27312, 27317, 27339, 27467, 27313, 27469, 27458, 27486, 27460, 27462, 27460, 27260, 27170, 27197, 27172, 27176, 27175, 27172, 27199, 27194, 27197, 27143, 27337, 27336, 27263, 27179, 27170, 27170, 27168, 27256, 27170, 27171, 27198, 27136, 27353, 27335, 27354, 27370, 27346, 27350, 27354, 27351, 27375, 27351, 27351};
        onWarmupCompleted = 3190700455247886201L;
    }
}
