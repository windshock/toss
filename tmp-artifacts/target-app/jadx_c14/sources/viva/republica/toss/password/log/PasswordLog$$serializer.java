package viva.republica.toss.password.log;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PasswordLog$$serializer implements aeu2<PasswordLog> {
    public static final int $stable;
    private static byte[] IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final PasswordLog$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 123;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, short r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 115
            int r8 = r8 + 4
            byte[] r0 = viva.republica.toss.password.log.PasswordLog$$serializer.$$a
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.log.PasswordLog$$serializer.$$c(short, short, short):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 47;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        IAuthTabCallbackStub = 1;
        onNavigationEvent();
        PasswordLog$$serializer passwordLog$$serializer = new PasswordLog$$serializer();
        INSTANCE = passwordLog$$serializer;
        $stable = 8;
        Object[] objArr = new Object[1];
        a((short) ((-8) - TextUtils.indexOf("", "", 0)), (byte) (89 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.indexOf("", "") + 419686447, 1725617552 - (ViewConfiguration.getPressedStateDuration() >> 16), (-2) - (Process.myTid() >> 22), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), passwordLog$$serializer, 3);
        Object[] objArr2 = new Object[1];
        a((short) (ExpandableListView.getPackedPositionType(0L) + 108), (byte) (87 - ImageFormat.getBitsPerPixel(0)), 419686491 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 1725617543, TextUtils.indexOf("", "", 0, 0) - 39, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 58), (byte) (ExpandableListView.getPackedPositionGroup(0L) - 27), Color.red(0) + 419686496, Process.getGidForName("") + 1725617537, Color.rgb(0, 0, 0) + 16777179, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a((short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 48), (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 92), 419686504 + (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1725617549 - Process.getGidForName(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 37, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onTransact + 71;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private PasswordLog$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{getBgColor.IAuthTabCallback, getDynamicHeight.onWarmupCompleted, getWriggleLayout.onNavigationEvent};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[1] = getBgColor.IAuthTabCallback;
        kSerializerArr[0] = getDynamicHeight.onWarmupCompleted;
        kSerializerArr[2] = getWriggleLayout.onNavigationEvent;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        PasswordLog passwordLogM139deserialize = m139deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return passwordLogM139deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PasswordLog m139deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean z;
        String strAsInterface;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 25;
        asInterface = i4 % 128;
        String strAsInterface2 = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            strAsInterface2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            z = zOnExtraCallbackWithResult;
            i = iOnTransact;
            i2 = 7;
        } else {
            boolean z2 = true;
            boolean zOnExtraCallbackWithResult2 = false;
            int iOnTransact2 = 0;
            int i5 = 0;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = false;
                } else if (iOnNavigationEvent == 0) {
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i5 |= 1;
                    int i6 = asInterface + 85;
                    IAuthTabCallbackDefault = i6 % 128;
                    int i7 = i6 % 2;
                } else if (iOnNavigationEvent != 1) {
                    int i8 = asInterface + 27;
                    IAuthTabCallbackDefault = i8 % 128;
                    if (i8 % 2 == 0) {
                        if (iOnNavigationEvent != 4) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i5 |= 4;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i5 |= 4;
                    }
                } else {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                    i5 |= 2;
                }
            }
            z = zOnExtraCallbackWithResult2;
            strAsInterface = strAsInterface2;
            i = iOnTransact2;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PasswordLog(i2, z, i, strAsInterface, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PasswordLog) obj);
        int i4 = IAuthTabCallbackDefault + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PasswordLog passwordLog) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(passwordLog, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PasswordLog.onWarmupCompleted(passwordLog, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 13;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 30 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallbackDefault + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r27, byte r28, int r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.log.PasswordLog$$serializer.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    static void onNavigationEvent() {
        onExtraCallback = 1119604697;
        onWarmupCompleted = -1538795482;
        onExtraCallbackWithResult = 1029894894;
        IAuthTabCallback = new byte[]{-95, -118, -79, -69, 106, -95, 109, 105, 91, 88, -117, -82, -95, 106, 103, -109, -69, 106, -95, 109, 105, 91, -72, 43, -30, 105, 109, -94, 47, -108, -89, -93, -92, 83, -76, 108, 82, -70, 45, -108, -78, 84, -70, 51, 49, -7, 67, -41, 72, -96, -23, -96, -122, -1, -93, -70, -21, -121, -120, -23, -123, -118, -36, Byte.MIN_VALUE, -47, 8, 8, 8, 8};
    }
}
