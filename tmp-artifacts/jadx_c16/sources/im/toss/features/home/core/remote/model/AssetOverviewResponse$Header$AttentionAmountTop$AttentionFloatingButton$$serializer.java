package im.toss.features.home.core.remote.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.remote.model.AssetOverviewResponse;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse$;
import im.toss.features.home.core.remote.model.dst.widget.ButtonResponse;
import im.toss.features.home.core.remote.model.dst.widget.ButtonResponse$;
import im.toss.features.home.core.remote.model.dst.widget.ImageSourceResponse;
import im.toss.features.home.core.remote.model.dst.widget.TextContentResponse;
import im.toss.features.home.core.remote.model.dst.widget.TextContentResponse$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.getSpecificKey;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer implements aeu2<AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final AssetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static boolean onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 49;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        AssetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer assetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer = new AssetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer();
        INSTANCE = assetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton", assetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer, 5);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("icon", false);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -125, -126, -127}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-121, -122, -127, -127, -123, -124}, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        descriptor = setanimationsloop;
        int i = asBinder + 55;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private AssetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(getSpecificKey.IAuthTabCallback), sp.IAuthTabCallback(TextContentResponse$.serializer.INSTANCE), sp.IAuthTabCallback(ButtonResponse$.serializer.INSTANCE), sp.IAuthTabCallback(ImpressionEventLogResponse$.serializer.INSTANCE)};
        int i4 = asInterface + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ImageSourceResponse imageSourceResponse;
        ButtonResponse buttonResponse;
        ImpressionEventLogResponse impressionEventLogResponse;
        int i;
        TextContentResponse textContentResponse;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallbackDefault + 93;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            ImageSourceResponse imageSourceResponse2 = (ImageSourceResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getSpecificKey.IAuthTabCallback, (Object) null);
            textContentResponse = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentResponse$.serializer.INSTANCE, (Object) null);
            str = str2;
            buttonResponse = (ButtonResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ButtonResponse$.serializer.INSTANCE, (Object) null);
            impressionEventLogResponse = (ImpressionEventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ImpressionEventLogResponse$.serializer.INSTANCE, (Object) null);
            imageSourceResponse = imageSourceResponse2;
            i = 31;
        } else {
            int i5 = 0;
            boolean z2 = true;
            TextContentResponse textContentResponse2 = null;
            String str3 = null;
            ButtonResponse buttonResponse2 = null;
            ImpressionEventLogResponse impressionEventLogResponse2 = null;
            imageSourceResponse = null;
            while (z2) {
                int i6 = IAuthTabCallbackDefault + 25;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = IAuthTabCallbackDefault;
                    int i9 = i8 + 95;
                    asInterface = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i10 = i8 + 41;
                        int i11 = i10 % 128;
                        asInterface = i11;
                        if (i10 % 2 == 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                            imageSourceResponse = (ImageSourceResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getSpecificKey.IAuthTabCallback, imageSourceResponse);
                            i5 |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            int i12 = i11 + 87;
                            IAuthTabCallbackDefault = i12 % 128;
                            int i13 = i12 % 2;
                            if (iOnNavigationEvent != 3) {
                                int i14 = i11 + 51;
                                IAuthTabCallbackDefault = i14 % 128;
                                int i15 = i14 % 2;
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                impressionEventLogResponse2 = (ImpressionEventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ImpressionEventLogResponse$.serializer.INSTANCE, impressionEventLogResponse2);
                                i5 |= 16;
                            } else {
                                buttonResponse2 = (ButtonResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ButtonResponse$.serializer.INSTANCE, buttonResponse2);
                                i5 |= 8;
                            }
                        } else {
                            textContentResponse2 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentResponse$.serializer.INSTANCE, textContentResponse2);
                            i5 |= 4;
                        }
                        z = false;
                    } else {
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i5 |= 1;
                        z = false;
                    }
                } else {
                    z2 = z;
                }
            }
            buttonResponse = buttonResponse2;
            impressionEventLogResponse = impressionEventLogResponse2;
            i = i5;
            textContentResponse = textContentResponse2;
            str = str3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton(i, str, imageSourceResponse, textContentResponse, buttonResponse, impressionEventLogResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m525deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton attentionFloatingButtonDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return attentionFloatingButtonDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton attentionFloatingButton) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(attentionFloatingButton, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton.onExtraCallback(attentionFloatingButton, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(attentionFloatingButton, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton.onExtraCallback(attentionFloatingButton, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton) obj);
        int i4 = IAuthTabCallbackDefault + 87;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 115;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 77 - ExpandableListView.getPackedPositionGroup(j), 20952 - Color.argb(0, 0, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 74 - ImageFormat.getBitsPerPixel(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16036, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (onNavigationEvent) {
            int i6 = $11 + 75;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 63 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf("", "", 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 49;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] >> iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $11 + 1;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] >>> iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 63 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 63 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            i5 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{32610, 32625, 32614, 32636, 32609, 32623, 32616};
        IAuthTabCallback = -1184334050;
        onExtraCallback = true;
        onNavigationEvent = true;
    }
}
