package viva.republica.toss.network.model.electronicdocument.wallet.submit;

import android.os.SystemClock;
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
import net.sf.scuba.smartcards.BuildConfig;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DocumentWalletSubmitOrg$$serializer implements aeu2<DocumentWalletSubmitOrg> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final DocumentWalletSubmitOrg$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        DocumentWalletSubmitOrg$$serializer documentWalletSubmitOrg$$serializer = new DocumentWalletSubmitOrg$$serializer();
        INSTANCE = documentWalletSubmitOrg$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.submit.DocumentWalletSubmitOrg", documentWalletSubmitOrg$$serializer, 2);
        setanimationsloop.onWarmupCompleted("organizationId", true);
        Object[] objArr = new Object[1];
        a(new char[]{52063, 50231, 54674, 58721}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3942, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }

    private DocumentWalletSubmitOrg$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        KSerializer<?>[] kSerializerArr = i2 % 2 == 0 ? new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), oty1.onExtraCallback} : new KSerializer[]{oty1.onExtraCallback, sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i3 = onExtraCallback + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return m60deserialize(decoder);
        }
        m60deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d A[PHI: r1 r13
      0x004d: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r13
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DocumentWalletSubmitOrg m60deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        long jIAuthTabCallbackDefault;
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 19 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i5 = onExtraCallback + 47;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                i = 3;
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            } else {
                String str2 = null;
                boolean z = true;
                long jIAuthTabCallbackDefault2 = 0;
                int i7 = 0;
                while (z) {
                    int i8 = onExtraCallback + 43;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i7 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i7 |= 2;
                    }
                }
                str = str2;
                i = i7;
                jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DocumentWalletSubmitOrg(i, jIAuthTabCallbackDefault, str, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DocumentWalletSubmitOrg) obj);
        int i4 = onExtraCallback + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DocumentWalletSubmitOrg documentWalletSubmitOrg) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(documentWalletSubmitOrg, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DocumentWalletSubmitOrg.onExtraCallback(documentWalletSubmitOrg, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 59;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 24 - View.MeasureSpec.getMode(0), 19627 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 58 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 6384 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $11 + 47;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 60, 6383 - View.MeasureSpec.makeMeasureSpec(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 59 - View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2);
        int i5 = $11 + 53;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 4604123706824674822L;
    }
}
