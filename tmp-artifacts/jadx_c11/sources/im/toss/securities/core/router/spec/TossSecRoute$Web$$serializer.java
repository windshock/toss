package im.toss.securities.core.router.spec;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import kotlin.Deprecated;
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
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class TossSecRoute$Web$$serializer implements aeu2<TossSecRoute.Web> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TossSecRoute$Web$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        TossSecRoute$Web$$serializer tossSecRoute$Web$$serializer = new TossSecRoute$Web$$serializer();
        INSTANCE = tossSecRoute$Web$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.router.spec.TossSecRoute.Web", tossSecRoute$Web$$serializer, 2);
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 61, 0}, false, new byte[]{0, 1, 0}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("id", true);
        descriptor = setanimationsloop;
        $stable = 8;
        int i = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private TossSecRoute$Web$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = onExtraCallback + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TossSecRoute.Web deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            i = 0;
            strAsInterface = null;
            str = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i3 = onExtraCallback + 117;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        int i4 = onNavigationEvent + 37;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str);
                        i |= 2;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            int i6 = onNavigationEvent + 61;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossSecRoute.Web(i, strAsInterface, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m26deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossSecRoute.Web webDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return webDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossSecRoute.Web web) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(web, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TossSecRoute.Web.onWarmupCompleted(web, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 76 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(web, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            TossSecRoute.Web.onWarmupCompleted(web, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossSecRoute.Web) obj);
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 49;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35282), 35 - ((Process.getThreadPriority(0) + 20) >> 6), Color.alpha(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.indexOf("", "")), 35 - Color.red(0), 14239 - (ViewConfiguration.getLongPressTimeout() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i = 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i9 = $10 + 11;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = $11 + 67;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.MeasureSpec.getMode(0)), (Process.myPid() >> 22) + 65, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 10935), 65 - View.combineMeasuredStates(0, 0), 16718 - (Process.myPid() >> 22), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr6 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objOnExtraCallback5).invoke(null, objArr6)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr7 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 70 - Color.green(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i14, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i15 = $11 + 29;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i17 = $10 + 61;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            int i18 = $10 + 65;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new char[]{27159, 27390, 27362};
    }
}
