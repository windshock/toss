package im.toss.securities.widget.data.model.calendar;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.r2ExternalSyntheticLambda3;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class Event$$serializer implements aeu2<Event> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    public static final Event$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        Event$$serializer event$$serializer = new Event$$serializer();
        INSTANCE = event$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.calendar.Event", event$$serializer, 4);
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 182, 5}, true, new byte[]{1, 1, 0, 1, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new int[]{5, 4, 76, 0}, false, new byte[]{0, 1, 1, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("baseDate", false);
        setanimationsloop.onWarmupCompleted("dateTime", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 1;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Event$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrOnNavigationEvent = Event.onNavigationEvent();
            ?? r2 = new KSerializer[4];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            r2[0] = getwrigglelayout;
            r2[0] = lazyArrOnNavigationEvent[1].getValue();
            r2[2] = getwrigglelayout;
            r2[2] = sp.IAuthTabCallback(getwrigglelayout);
            kSerializerArr = r2;
        } else {
            Lazy[] lazyArrOnNavigationEvent2 = Event.onNavigationEvent();
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, lazyArrOnNavigationEvent2[1].getValue(), getwrigglelayout2, sp.IAuthTabCallback(getwrigglelayout2)};
        }
        int i3 = onExtraCallbackWithResult + 87;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0067 A[PHI: r0 r2 r3
      0x0067: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r3v11 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r0 r2 r3
      0x0041: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r3v3 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Event deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnNavigationEvent;
        int i;
        String str;
        r2ExternalSyntheticLambda3 r2externalsyntheticlambda3;
        String str2;
        String str3;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onExtraCallbackWithResult = i3 % 128;
        String strAsInterface = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnNavigationEvent = Event.onNavigationEvent();
            int i4 = 34 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                r2ExternalSyntheticLambda3 r2externalsyntheticlambda32 = (r2ExternalSyntheticLambda3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
                String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                i = 15;
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
                r2externalsyntheticlambda3 = r2externalsyntheticlambda32;
                str2 = strAsInterface2;
                str3 = strAsInterface3;
            } else {
                int i5 = 0;
                str = null;
                r2ExternalSyntheticLambda3 r2externalsyntheticlambda33 = null;
                String strAsInterface4 = null;
                boolean z = true;
                while (z) {
                    int i6 = onExtraCallbackWithResult + 45;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i8 = onExtraCallback + 25;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        if (iOnNavigationEvent == 0) {
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i5 |= 1;
                        } else if (iOnNavigationEvent == 1) {
                            r2externalsyntheticlambda33 = (r2ExternalSyntheticLambda3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), r2externalsyntheticlambda33);
                            i5 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i5 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str);
                            i5 |= 8;
                        }
                    } else {
                        z = false;
                    }
                }
                str3 = strAsInterface;
                r2externalsyntheticlambda3 = r2externalsyntheticlambda33;
                i = i5;
                str2 = strAsInterface4;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnNavigationEvent = Event.onNavigationEvent();
            if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Event(i, str2, r2externalsyntheticlambda3, str3, str, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m38deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Event eventDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return eventDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Event event) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(event, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            Event.onExtraCallback(event, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(event, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        Event.onExtraCallback(event, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Event) obj);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 45;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 36 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 14239 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 35284), 34 - TextUtils.lastIndexOf("", '0'), MotionEvent.axisFromString("") + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i = 2;
            }
            int i9 = $10 + 15;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i11 = $10 + 11;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                c = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = $10 + 23;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 65, (ViewConfiguration.getWindowTouchSlop() >> 8) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                            throw null;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 10935), 65 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16718 - TextUtils.getOffsetAfter("", 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i14] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr6 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 29 - View.MeasureSpec.makeMeasureSpec(0, 0), 17657 - TextUtils.indexOf("", "", 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objOnExtraCallback5).invoke(null, objArr6)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr7 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getLongPressTimeout() >> 16)), 70 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "", 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i16, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $11 + 93;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i19 = $10 + 101;
            $11 = i19 % 128;
            char c2 = 2;
            int i20 = i19 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[c2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i21 = $10 + 93;
                $11 = i21 % 128;
                c2 = 2;
                if (i21 % 2 == 0) {
                    int i22 = 3 % 4;
                }
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{27331, 27472, 27496, 27498, 27498, 27182, 27276, 27278, 27384};
    }
}
