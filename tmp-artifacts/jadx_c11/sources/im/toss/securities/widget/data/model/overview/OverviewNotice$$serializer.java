package im.toss.securities.widget.data.model.overview;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewNotice$$serializer implements aeu2<OverviewNotice> {
    public static final OverviewNotice$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final byte[] $$a = {15, -57, -42, 5};
    private static final int $$b = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3;
        int i4 = (i * 3) + 4;
        int i5 = 1 - (s * 2);
        int i6 = (b * 2) + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6 += i4;
            i4 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = i4;
            i4 = bArr[i4];
            i6 += i4;
            i4 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult = 1;
        onWarmupCompleted();
        OverviewNotice$$serializer overviewNotice$$serializer = new OverviewNotice$$serializer();
        INSTANCE = overviewNotice$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.overview.OverviewNotice", overviewNotice$$serializer, 4);
        setanimationsloop.onWarmupCompleted("splitMerge", true);
        setanimationsloop.onWarmupCompleted("earningsAnnouncement", true);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getEdgeSlop() >> 16) + 7, 1 - Color.green(0), new char[]{4, 65532, 65534, 65528, '\n', '\n', 65532}, true, 132 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("alert", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 93;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
    }

    private OverviewNotice$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(OverviewNoticeMessage$$serializer.INSTANCE), sp.IAuthTabCallback(OverviewNoticeAlert$$serializer.INSTANCE)};
        int i4 = IAuthTabCallback + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewNotice deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Boolean bool;
        Boolean bool2;
        OverviewNoticeMessage overviewNoticeMessage;
        OverviewNoticeAlert overviewNoticeAlert;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            i = 0;
            boolean z = true;
            overviewNoticeMessage = null;
            bool2 = null;
            bool = null;
            overviewNoticeAlert = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 117;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getBgColor.IAuthTabCallback, bool);
                        i |= 1;
                        int i5 = IAuthTabCallback + 109;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                    } else if (iOnNavigationEvent != 1) {
                        int i7 = i3 + 49;
                        int i8 = i7 % 128;
                        IAuthTabCallback = i8;
                        int i9 = i7 % 2;
                        if (iOnNavigationEvent == 2) {
                            overviewNoticeMessage = (OverviewNoticeMessage) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, OverviewNoticeMessage$$serializer.INSTANCE, overviewNoticeMessage);
                            i |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i10 = i8 + 55;
                            onWarmupCompleted = i10 % 128;
                            if (i10 % 2 == 0) {
                                overviewNoticeAlert = (OverviewNoticeAlert) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, OverviewNoticeAlert$$serializer.INSTANCE, overviewNoticeAlert);
                                i |= 121;
                            } else {
                                overviewNoticeAlert = (OverviewNoticeAlert) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, OverviewNoticeAlert$$serializer.INSTANCE, overviewNoticeAlert);
                                i |= 8;
                            }
                        }
                    } else {
                        bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, bool2);
                        i |= 2;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            int i11 = onWarmupCompleted + 109;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            getBgColor getbgcolor = getBgColor.IAuthTabCallback;
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getbgcolor, (Object) null);
            bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getbgcolor, (Object) null);
            overviewNoticeMessage = (OverviewNoticeMessage) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, OverviewNoticeMessage$$serializer.INSTANCE, (Object) null);
            overviewNoticeAlert = (OverviewNoticeAlert) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, OverviewNoticeAlert$$serializer.INSTANCE, (Object) null);
            i = 15;
        }
        OverviewNoticeMessage overviewNoticeMessage2 = overviewNoticeMessage;
        Boolean bool3 = bool2;
        int i13 = i;
        Boolean bool4 = bool;
        OverviewNoticeAlert overviewNoticeAlert2 = overviewNoticeAlert;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewNotice(i13, bool4, bool3, overviewNoticeMessage2, overviewNoticeAlert2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m47deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        OverviewNotice overviewNoticeDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return overviewNoticeDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewNotice overviewNotice) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(overviewNotice, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            OverviewNotice.onNavigationEvent(overviewNotice, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(overviewNotice, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        OverviewNotice.onNavigationEvent(overviewNotice, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 13 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewNotice) obj);
        int i4 = IAuthTabCallback + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 121;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 23 - ExpandableListView.getPackedPositionType(0L), 10279 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 12843), 55 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2166 - TextUtils.lastIndexOf("", '0', 0, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            int i9 = $10 + 83;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16764373) - Color.rgb(0, 0, 0)), 55 - (ViewConfiguration.getJumpTapTimeout() >> 16), (-16775049) - Color.rgb(0, 0, 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onExtraCallback = 478308914;
    }
}
