package im.toss.features.alltab.core.remote.model.event_curation;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EventCurationResponse$$serializer implements aeu2<EventCurationResponse> {
    public static final EventCurationResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {48, 86, 58, 71};
    private static final int $$b = 104;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 1;

    private static String $$c(int i, byte b, byte b2) {
        int i2 = b2 * 2;
        int i3 = (b * 4) + 97;
        byte[] bArr = $$a;
        int i4 = i + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i3);
            i4 = i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            int i6 = i4 + 1;
            i3 += -bArr[i6];
            i4 = i6;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onWarmupCompleted = 0;
        onExtraCallback();
        EventCurationResponse$$serializer eventCurationResponse$$serializer = new EventCurationResponse$$serializer();
        INSTANCE = eventCurationResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.alltab.core.remote.model.event_curation.EventCurationResponse", eventCurationResponse$$serializer, 7);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("menuEntryId", false);
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, (char) (26766 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("logoImageUrl", false);
        Object[] objArr2 = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 5, 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (38598 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("service", false);
        setanimationsloop.onWarmupCompleted("landingUrl", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 119;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private EventCurationResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1Var);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(oty1Var);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onNavigationEvent + 117;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final EventCurationResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        Long l;
        Long l2;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 6;
        Long l3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            oty1 oty1Var = oty1.onExtraCallback;
            Long l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, (Object) null);
            Long l5 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1Var, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            i = 127;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            l2 = l5;
            l = l4;
            str3 = str7;
            str = str6;
        } else {
            i = 0;
            boolean z = true;
            String str8 = null;
            Long l6 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (z) {
                int i6 = onNavigationEvent + 15;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i7 = IAuthTabCallbackStub + 81;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        i5 = 6;
                        z = false;
                        continue;
                    case 0:
                        l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l3);
                        i |= 1;
                        i5 = 6;
                        continue;
                    case 1:
                        l6 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l6);
                        i |= 2;
                        continue;
                    case 2:
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str8);
                        i |= 4;
                        break;
                    case 3:
                        str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str11);
                        i |= 8;
                        break;
                    case 4:
                        str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str12);
                        i |= 16;
                        break;
                    case 5:
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str10);
                        i |= 32;
                        break;
                    case 6:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str9);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str8;
            l = l3;
            l2 = l6;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = str12;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new EventCurationResponse(i, l, l2, str, str4, str5, str3, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m68deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        EventCurationResponse eventCurationResponseDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 57;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return eventCurationResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EventCurationResponse eventCurationResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(eventCurationResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            EventCurationResponse.onExtraCallbackWithResult(eventCurationResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(eventCurationResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        EventCurationResponse.onExtraCallbackWithResult(eventCurationResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 21;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (EventCurationResponse) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 11 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallbackStub + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 31;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i << i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - ExpandableListView.getPackedPositionType(0L)), TextUtils.getOffsetBefore("", 0) + 31, View.resolveSizeAndState(0, 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123), 44 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onExtraCallback[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.resolveSize(0, 0) + 17, TextUtils.getOffsetAfter("", 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getLongPressTimeout() >> 16)), Drawable.resolveOpacity(0, 0) + 31, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 44 - KeyEvent.getDeadChar(0, 0), 1494 - (KeyEvent.getMaxKeyCode() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 115;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) (-1);
                byte b6 = (byte) (b5 + 1);
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 49123), View.resolveSize(0, 0) + 44, (ViewConfiguration.getPressedStateDuration() >> 16) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallback() {
        onExtraCallback = new char[]{34093, 38447, 41747, 48232, 51520, 31606, 26728, 23903, 16940, 14108, 9440, 2520, 65215, 58243, 55146, 50250};
        onExtraCallbackWithResult = 7466834949765856971L;
    }
}
