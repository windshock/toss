package im.toss.ads_sdk.remote.model;

import android.os.Process;
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
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class SdkTemplateReviewed$$serializer implements aeu2<SdkTemplateReviewed> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char[] IAuthTabCallback = null;
    public static final SdkTemplateReviewed$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        SdkTemplateReviewed$$serializer sdkTemplateReviewed$$serializer = new SdkTemplateReviewed$$serializer();
        INSTANCE = sdkTemplateReviewed$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.SdkTemplateReviewed", sdkTemplateReviewed$$serializer, 1);
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 171, 0}, false, new byte[]{1, 1, 1, 0}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 91;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private SdkTemplateReviewed$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[0];
            kSerializerArr[1] = getWriggleLayout.onNavigationEvent;
        } else {
            kSerializerArr = new KSerializer[]{getWriggleLayout.onNavigationEvent};
        }
        int i3 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[PHI: r1 r11
      0x0037: PHI (r1v10 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v11 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r11v5 o.yw) = (r11v1 o.yw), (r11v7 o.yw) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1 r11
      0x0032: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v11 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r11v2 o.yw) = (r11v1 o.yw), (r11v7 o.yw) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SdkTemplateReviewed deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        String strAsInterface;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = 1;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            } else {
                int i4 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                strAsInterface = null;
                boolean z = true;
                int i6 = 0;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = onExtraCallbackWithResult + 109;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 = 1;
                    }
                }
                i3 = i6;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        SdkTemplateReviewed sdkTemplateReviewed = new SdkTemplateReviewed(i3, strAsInterface, (okycx) null);
        int i9 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            return sdkTemplateReviewed;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m60deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SdkTemplateReviewed sdkTemplateReviewed) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(sdkTemplateReviewed, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SdkTemplateReviewed.onExtraCallback(sdkTemplateReviewed, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sdkTemplateReviewed, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SdkTemplateReviewed.onExtraCallback(sdkTemplateReviewed, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SdkTemplateReviewed) obj);
        int i4 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 5;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 35283), 35 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 14238 - ((byte) KeyEvent.getModifierMetaStateMask()), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.getOffsetBefore("", 0)), 35 - (ViewConfiguration.getWindowTouchSlop() >> 8), 14239 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i8 = $10 + 125;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 10935), 65 - TextUtils.getOffsetAfter("", 0), 16718 - View.MeasureSpec.getSize(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), ExpandableListView.getPackedPositionType(0L) + 29, 17657 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 49467), 70 - ((Process.getThreadPriority(0) + 20) >> 6), 12486 - TextUtils.getOffsetAfter("", 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i12 = $11 + 25;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 1, cArr5, 1, i3);
                System.arraycopy(cArr5, 0, cArr3, i3 >>> i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 1, i3 / i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i13 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i13, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i13);
            }
        }
        if (z) {
            int i14 = $11 + 51;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i16 = $11 + 35;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] >> iArr[4]);
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{27329, 27481, 27479, 27503};
    }
}
