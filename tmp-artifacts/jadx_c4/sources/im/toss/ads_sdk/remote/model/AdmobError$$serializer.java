package im.toss.ads_sdk.remote.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class AdmobError$$serializer implements aeu2<AdmobError> {
    public static final int $stable;
    public static final AdmobError$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 52;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent = 1;

    private static String $$c(int i, int i2, short s) {
        int i3 = (i * 2) + 97;
        int i4 = (i2 * 3) + 4;
        byte[] bArr = $$a;
        int i5 = s * 2;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 += -i5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i4];
            i4++;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i5])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 59697), Color.alpha(0) + 17, Drawable.resolveOpacity(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 46134), 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 20220 - View.MeasureSpec.getSize(0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 49123), 44 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $10 + 103;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 43 - ((byte) KeyEvent.getModifierMetaStateMask()), 1494 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = -1401950695;
        }
        String str = new String(cArr);
        int i8 = $11 + 103;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static {
        onExtraCallbackWithResult = 0;
        onNavigationEvent();
        AdmobError$$serializer admobError$$serializer = new AdmobError$$serializer();
        INSTANCE = admobError$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.AdmobError", admobError$$serializer, 3);
        setanimationsloop.onWarmupCompleted("code", true);
        setanimationsloop.onWarmupCompleted("domain", true);
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getTouchSlop() >> 8, 7 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 31;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AdmobError$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = IAuthTabCallback + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AdmobError deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        Integer num;
        int i;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            Integer num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            num = num2;
            i = 7;
            str2 = str3;
        } else {
            int i3 = 0;
            boolean z = true;
            String str4 = null;
            Integer num3 = null;
            String str5 = null;
            while (!(!z)) {
                int i4 = IAuthTabCallbackStub + 43;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = IAuthTabCallback + 63;
                    IAuthTabCallbackStub = i5 % 128;
                    if (i5 % 2 == 0) {
                        if (iOnNavigationEvent == 0) {
                            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                            i3 |= 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                            i3 |= 4;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                        i3 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num3);
                    i3 |= 1;
                    int i6 = IAuthTabCallbackStub + 103;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            int i8 = IAuthTabCallbackStub + 75;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            str = str4;
            num = num3;
            i = i3;
            str2 = str5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AdmobError(i, num, str2, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AdmobError admobErrorDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 63;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return admobErrorDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdmobError admobError) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(admobError, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AdmobError.onNavigationEvent(admobError, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdmobError) obj);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 88 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallbackStub + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{60857, 58796, 64925, 62960, 52673, 50466, 56607};
        onWarmupCompleted = 78269010012726729L;
    }
}
