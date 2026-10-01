package im.toss.features.home.core.local.model.dst.handler;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.eventlog.EventLogLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseWorkerImplRenderReadyListener;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.onAlipayJSBridgeReady;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HandlerLocal$LocalAction$RemoveCardBillListContainerItem$$serializer implements aeu2<HandlerLocal.LocalAction.RemoveCardBillListContainerItem> {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final HandlerLocal$LocalAction$RemoveCardBillListContainerItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {104, -2, 24, -74};
    private static final int $$b = 26;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        int i3 = 4 - (i * 2);
        int i4 = s * 4;
        byte[] bArr = $$a;
        int i5 = 115 - (s2 * 3);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i2 = i3;
            int i7 = i4;
            i3 += -i7;
            i2++;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i2];
            i3 += -i7;
            i2++;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
            }
        } else {
            i2 = i3;
            i3 = i5;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 81;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 94 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 21;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return serialDescriptor;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 43424), 42 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $10 + 103;
                int i9 = i8 % 128;
                $11 = i9;
                if (i8 % 2 == 0) {
                    throw null;
                }
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = i9 + 19;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $10 + 115;
                        $11 = i13 % 128;
                        int i14 = i13 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12843), (Process.myTid() >> 22) + 55, 2167 - View.MeasureSpec.getMode(0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i12++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43424), (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, TextUtils.indexOf((CharSequence) "", '0') + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                        i4 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    int i15 = $11 + 29;
                    $10 = i15 % 128;
                    i4 = 2;
                    int i16 = i15 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - i4) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i7;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 86 - Drawable.resolveOpacity(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr5[i17] = (byte) (bArr4[i17] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        int i18 = $11 + 67;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            byte[] bArr6 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent % 0;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback - (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) >>> s)) ^ b));
                        } else {
                            byte[] bArr7 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        }
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        onWarmupCompleted();
        HandlerLocal$LocalAction$RemoveCardBillListContainerItem$$serializer handlerLocal$LocalAction$RemoveCardBillListContainerItem$$serializer = new HandlerLocal$LocalAction$RemoveCardBillListContainerItem$$serializer();
        INSTANCE = handlerLocal$LocalAction$RemoveCardBillListContainerItem$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.LocalAction.RemoveCardBillListContainerItem", handlerLocal$LocalAction$RemoveCardBillListContainerItem$$serializer, 4);
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (81 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), KeyEvent.keyCodeFromString("") - 75224386, (ViewConfiguration.getTouchSlop() >> 8) - 650431877, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 55, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("eventLog", false);
        setanimationsloop.onWarmupCompleted("runOption", false);
        Object[] objArr2 = new Object[1];
        a((short) KeyEvent.normalizeMetaState(0), (byte) (97 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) - 75224383, (-650431887) - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777162, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = asInterface + 65;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
        }
    }

    private HandlerLocal$LocalAction$RemoveCardBillListContainerItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, sp.IAuthTabCallback(HandlerLocal$LocalAction$RemoveCardBillListContainerItem$Data$$serializer.INSTANCE)};
        }
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(HandlerLocal$LocalAction$RemoveCardBillListContainerItem$Data$$serializer.INSTANCE);
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[1] = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        kSerializerArr[3] = BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult;
        kSerializerArr[5] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b A[PHI: r1 r15
      0x005b: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r15v5 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[PHI: r1 r15
      0x0036: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r15v2 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HandlerLocal.LocalAction.RemoveCardBillListContainerItem deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        String strAsInterface;
        int i;
        HandlerLocal.LocalAction.RemoveCardBillListContainerItem.Data data;
        EventLogLocal eventLogLocal;
        HandlerLocal.RunOption runOption;
        int i2 = 2 % 2;
        int i3 = onTransact + 81;
        asBinder = i3 % 128;
        HandlerLocal.RunOption runOption2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 67 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                EventLogLocal eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
                HandlerLocal.RunOption runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
                strAsInterface = strAsInterface2;
                i = 15;
                data = (HandlerLocal.LocalAction.RemoveCardBillListContainerItem.Data) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, HandlerLocal$LocalAction$RemoveCardBillListContainerItem$Data$$serializer.INSTANCE, (Object) null);
                eventLogLocal = eventLogLocal2;
                runOption = runOption3;
            } else {
                i = 0;
                boolean z = true;
                EventLogLocal eventLogLocal3 = null;
                strAsInterface = null;
                HandlerLocal.LocalAction.RemoveCardBillListContainerItem.Data data2 = null;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        int i5 = onTransact + 1;
                        asBinder = i5 % 128;
                        if (i5 % 2 == 0) {
                            if (iOnNavigationEvent == 1) {
                                eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                                i |= 2;
                                int i6 = onTransact + 71;
                                asBinder = i6 % 128;
                                int i7 = i6 % 2;
                            } else if (iOnNavigationEvent != 2) {
                                runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption2);
                                i |= 4;
                            } else {
                                if (iOnNavigationEvent != 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                data2 = (HandlerLocal.LocalAction.RemoveCardBillListContainerItem.Data) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, HandlerLocal$LocalAction$RemoveCardBillListContainerItem$Data$$serializer.INSTANCE, data2);
                                i |= 8;
                            }
                        } else if (iOnNavigationEvent == 1) {
                            eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                            i |= 2;
                            int i62 = onTransact + 71;
                            asBinder = i62 % 128;
                            int i72 = i62 % 2;
                        } else if (iOnNavigationEvent != 2) {
                        }
                    } else {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                    }
                }
                runOption = runOption2;
                eventLogLocal = eventLogLocal3;
                data = data2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.LocalAction.RemoveCardBillListContainerItem(i, strAsInterface, eventLogLocal, runOption, data, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m438deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        HandlerLocal.LocalAction.RemoveCardBillListContainerItem removeCardBillListContainerItemDeserialize = deserialize(decoder);
        int i4 = onTransact + 59;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return removeCardBillListContainerItemDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.LocalAction.RemoveCardBillListContainerItem removeCardBillListContainerItem) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(removeCardBillListContainerItem, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HandlerLocal.LocalAction.RemoveCardBillListContainerItem.onExtraCallbackWithResult(removeCardBillListContainerItem, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(removeCardBillListContainerItem, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HandlerLocal.LocalAction.RemoveCardBillListContainerItem.onExtraCallbackWithResult(removeCardBillListContainerItem, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.LocalAction.RemoveCardBillListContainerItem) obj);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -1606677174;
        onExtraCallback = -1538795470;
        onExtraCallbackWithResult = -2105338373;
        onWarmupCompleted = new byte[]{-95, 85, -86, -123, 123, -107, 8, 8};
    }
}
