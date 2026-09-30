package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitLocal;
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
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer implements aeu2<CardBillDetailCardBenefitLocal.CardBenefitCardImage> {
    private static long IAuthTabCallback;
    public static final CardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {114, 69, -115, -114};
    private static final int $$b = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4;
        int i5 = i + 4;
        byte[] bArr = $$a;
        int i6 = (i2 * 4) + 1;
        int i7 = 97 - (b * 3);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i7 += i8;
            i3 = i4;
            int i9 = i5;
            int i10 = i7;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i10;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            int i11 = i9 + 1;
            i5 = i11;
            i7 = bArr[i11];
            i8 = i10;
            i7 += i8;
            i3 = i4;
            int i92 = i5;
            int i102 = i7;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i102;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            int i922 = i5;
            int i1022 = i7;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i1022;
            if (i4 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 109;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 99;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult = 0;
        onNavigationEvent();
        CardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer cardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer = new CardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer();
        INSTANCE = cardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitLocal.CardBenefitCardImage", cardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer, 2);
        Object[] objArr = new Object[1];
        a((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(TextUtils.getTrimmedLength("") + 8, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, (char) Gravity.getAbsoluteGravity(0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 105;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private CardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, CardBillDetailCardBenefitLocal.CardBenefitCardImage.onWarmupCompleted()[1].getValue()};
        int i4 = onNavigationEvent + 85;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardBillDetailCardBenefitLocal.CardBenefitCardImage deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        CardBillDetailCardBenefitLocal.CardBenefitCardImage.onNavigationEvent onnavigationevent;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 57;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            CardBillDetailCardBenefitLocal.CardBenefitCardImage.onWarmupCompleted();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = CardBillDetailCardBenefitLocal.CardBenefitCardImage.onWarmupCompleted();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
            onnavigationevent = (CardBillDetailCardBenefitLocal.CardBenefitCardImage.onNavigationEvent) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            i = 3;
        } else {
            int i4 = 0;
            strAsInterface = null;
            CardBillDetailCardBenefitLocal.CardBenefitCardImage.onNavigationEvent onnavigationevent2 = null;
            boolean z = true;
            while (z) {
                int i5 = IAuthTabCallbackStub + 101;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i7 = onNavigationEvent + 61;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i9 = onNavigationEvent + 57;
                    IAuthTabCallbackStub = i9 % 128;
                    if (i9 % 2 == 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        onnavigationevent2 = (CardBillDetailCardBenefitLocal.CardBenefitCardImage.onNavigationEvent) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), onnavigationevent2);
                        i4 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        onnavigationevent2 = (CardBillDetailCardBenefitLocal.CardBenefitCardImage.onNavigationEvent) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), onnavigationevent2);
                        i4 |= 2;
                    }
                } else {
                    strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
                    i4 |= 1;
                }
            }
            onnavigationevent = onnavigationevent2;
            i = i4;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new CardBillDetailCardBenefitLocal.CardBenefitCardImage(i, strAsInterface, onnavigationevent, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m313deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        CardBillDetailCardBenefitLocal.CardBenefitCardImage cardBenefitCardImageDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return cardBenefitCardImageDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardBillDetailCardBenefitLocal.CardBenefitCardImage cardBenefitCardImage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(cardBenefitCardImage, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CardBillDetailCardBenefitLocal.CardBenefitCardImage.onWarmupCompleted(cardBenefitCardImage, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 91 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(cardBenefitCardImage, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            CardBillDetailCardBenefitLocal.CardBenefitCardImage.onWarmupCompleted(cardBenefitCardImage, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallbackStub + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardBillDetailCardBenefitLocal.CardBenefitCardImage) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $10 + 125;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 59697), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, AndroidCharacter.getMirror('0') + 10925, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46134), 31 - (ViewConfiguration.getPressedStateDuration() >> 16), Color.red(0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 49123), (Process.myTid() >> 22) + 44, TextUtils.indexOf((CharSequence) "", '0') + 1495, -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 47;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49124), 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1493 - ExpandableListView.getPackedPositionChild(0L), -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 49123), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, ExpandableListView.getPackedPositionGroup(0L) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{60861, 59648, 58567, 58264, 65365, 64028, 61936, 52407, 60832, 59668, 58582, 58266};
        IAuthTabCallback = -1686766366369978003L;
    }
}
