package im.toss.securities.widget.overview.ui.small.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
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
import o.dj3;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewSmallWidgetState$NotTradeableUser$$serializer implements aeu2<OverviewSmallWidgetState.NotTradeableUser> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final OverviewSmallWidgetState$NotTradeableUser$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 55;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        OverviewSmallWidgetState$NotTradeableUser$$serializer overviewSmallWidgetState$NotTradeableUser$$serializer = new OverviewSmallWidgetState$NotTradeableUser$$serializer();
        INSTANCE = overviewSmallWidgetState$NotTradeableUser$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("GuestUser", overviewSmallWidgetState$NotTradeableUser$$serializer, 2);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 0, 0}, false, new byte[]{1, 1, 0, 0, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private OverviewSmallWidgetState$NotTradeableUser$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        KSerializer<?>[] kSerializerArr = i2 % 2 != 0 ? new KSerializer[]{dj3.onWarmupCompleted, OverviewSmallWidgetState.NotTradeableUser.onExtraCallbackWithResult()[1].getValue()} : new KSerializer[]{OverviewSmallWidgetState.NotTradeableUser.onExtraCallbackWithResult()[0].getValue(), dj3.onWarmupCompleted};
        int i3 = onExtraCallback + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OverviewSmallWidgetState.NotTradeableUser deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        DisplaySetting displaySetting;
        float fOnWarmupCompleted;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = OverviewSmallWidgetState.NotTradeableUser.onExtraCallbackWithResult();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            displaySetting = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            i = 3;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            DisplaySetting displaySetting2 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback;
                    int i7 = i6 + 103;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 72 / 0;
                        if (iOnNavigationEvent == 0) {
                            displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), displaySetting2);
                            i5 |= 1;
                        } else {
                            if (iOnNavigationEvent == 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i9 = i6 + 55;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                            i5 |= 2;
                        }
                    } else if (iOnNavigationEvent == 0) {
                        displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), displaySetting2);
                        i5 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                    }
                } else {
                    z = false;
                }
            }
            displaySetting = displaySetting2;
            fOnWarmupCompleted = fOnWarmupCompleted2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewSmallWidgetState.NotTradeableUser(i, displaySetting, fOnWarmupCompleted, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m80deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        OverviewSmallWidgetState.NotTradeableUser notTradeableUserDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return notTradeableUserDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewSmallWidgetState.NotTradeableUser notTradeableUser) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(notTradeableUser, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OverviewSmallWidgetState.NotTradeableUser.onExtraCallbackWithResult(notTradeableUser, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewSmallWidgetState.NotTradeableUser) obj);
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
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
        char[] cArr = onWarmupCompleted;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = $11 + 19;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 35283), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 35, (-16762977) - Color.rgb(0, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - ExpandableListView.getPackedPositionChild(0L)), 64 - ImageFormat.getBitsPerPixel(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16717, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (Process.myPid() >> 22) + 29, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.indexOf((CharSequence) "", '0')), 69 - TextUtils.indexOf((CharSequence) "", '0', 0), ((Process.getThreadPriority(0) + 20) >> 6) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i12 = $10 + 31;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new char[]{27262, 27176, 27168, 27170, 27178};
    }
}
