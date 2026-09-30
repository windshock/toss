package viva.republica.toss.common.web.message.handlers;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
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
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.web.message.handlers.GetTelephonyInfoHandler;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class GetTelephonyInfoHandler$TelephonyInfo$$serializer implements aeu2<GetTelephonyInfoHandler.TelephonyInfo> {
    public static final int $stable;
    private static long IAuthTabCallback;
    public static final GetTelephonyInfoHandler$TelephonyInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static final byte[] $$a = {0, ISOFileInfo.DATA_BYTES1, ISO7816.INS_MSE, -14, ISO7816.INS_REHABILITATE_CHV};
    private static final int $$b = 42;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 97 - (b2 * 2);
        int i4 = b * 4;
        int i5 = (i * 2) + 5;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i5++;
            i3 += -i7;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i5++;
            i3 += -i7;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 57;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 86 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 119;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 43;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, 19675 - AndroidCharacter.getMirror('0'), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 58 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 69;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 59 - (Process.myTid() >> 22), 6382 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        char c2;
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            c2 = '0';
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59745 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, KeyEvent.getDeadChar(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 31 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 20220 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 49123);
                        int iRed = 44 - Color.red(0);
                        int iAlpha = Color.alpha(0) + 1494;
                        byte b = $$a[0];
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, iRed, iAlpha, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i5 = $10 + 27;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
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
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf(BuildConfig.FLAVOR, c2) + 49124);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 44;
                int packedPositionGroup2 = 1494 - ExpandableListView.getPackedPositionGroup(j);
                byte b3 = $$a[0];
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, threadPriority, packedPositionGroup2, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i7 = $10 + 117;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            c2 = '0';
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    static {
        onExtraCallback = 0;
        onExtraCallbackWithResult();
        GetTelephonyInfoHandler$TelephonyInfo$$serializer getTelephonyInfoHandler$TelephonyInfo$$serializer = new GetTelephonyInfoHandler$TelephonyInfo$$serializer();
        INSTANCE = getTelephonyInfoHandler$TelephonyInfo$$serializer;
        $stable = 8;
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.makeMeasureSpec(0, 0) + 85, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 347), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), getTelephonyInfoHandler$TelephonyInfo$$serializer, 9);
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 85, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        b(new char[]{52379, 40310, 28495, 14710, 35651, 21828, 10088, 61787, 17189, 11571, 65329, 18721, 6931, 58644, 46866, 494, 54256}, 20983 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        b(new char[]{52379, 41716, 4171, 34756, 30027, 58616, 23075, 51636, 48948, 11931, 39984, 29584, 57852, 22382, 50941, 46170, 11217, 39262, 2215, 65075, 28049, 49945, 45725, 8223, 38526, 1530, 64372}, ExpandableListView.getPackedPositionType(0L) + 28277, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        Object[] objArr5 = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 93, 30 - KeyEvent.getDeadChar(0, 0), (char) ExpandableListView.getPackedPositionType(0L), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), false);
        Object[] objArr6 = new Object[1];
        a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 124, Color.alpha(0) + 22, (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 60598), objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), false);
        Object[] objArr7 = new Object[1];
        b(new char[]{52379, 50384, 56323, 54368, 60891, 58626, 64836, 63149, 36373, 34373, 40893, 38855, 44875, 41090, 47358, 45096, 18832, 16850, 22836, 21159, 27331, 25125, 31341, 29651, 2819, 888, 5289, 11277, 9287, 15792, 13794}, 2128 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), objArr7);
        setanimationsloop.onWarmupCompleted(((String) objArr7[0]).intern(), false);
        Object[] objArr8 = new Object[1];
        b(new char[]{52379, 61170, 34905, 43978, 17744, 24760, 545, 15803, 57123, 64151, 38140, 46710, 20962, 29540, 11980, 51225, 60327, 34083, 41101, 16925, 31847, 8190, 14705, 54483, 63059, 37286, 45874}, KeyEvent.getDeadChar(0, 0) + 8819, objArr8);
        setanimationsloop.onWarmupCompleted(((String) objArr8[0]).intern(), false);
        Object[] objArr9 = new Object[1];
        b(new char[]{52379, 42996, 6731, 36548, 24907, 54776, 18467, 15540, 38708, 2971, 65072, 21136, 50684, 47214, 11517, 34650, 31697, 61022, 17063, 13619, 43409, 7193, 61597, 27423, 56958, 45818, 9588, 39396, 3146, 57573, 23329, 53163, 41531, 5761, 35089, 31854, 53479, 19311, 16325, 37454, 1748}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 27509, objArr9);
        setanimationsloop.onWarmupCompleted(((String) objArr9[0]).intern(), false);
        Object[] objArr10 = new Object[1];
        b(new char[]{52379, 33614, 21308, 9207, 62369, 17303, 4685, 57877, 45823, 728, 53894, 41330, 28980, 49441, 37317, 24993, 12399, 32804, 20495, 8412, 61623, 18278, 5974, 59180, 47080, 1956, 55194, 42579, 30259, 50917, 38641, 26263, 13636, 34104, 22014, 9686, 62856, 17520, 5163, 58394, 46302, 1212, 56171, 43865}, 20430 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr10);
        setanimationsloop.onWarmupCompleted(((String) objArr10[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 119;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private GetTelephonyInfoHandler$TelephonyInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getDynamicHeight.onWarmupCompleted;
        KSerializer<?> kSerializer2 = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer2, kSerializer2, kSerializer2, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer2), sp.IAuthTabCallback(kSerializer2), sp.IAuthTabCallback(kSerializer2), sp.IAuthTabCallback(kSerializer2)};
        int i4 = asInterface + 55;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        GetTelephonyInfoHandler.TelephonyInfo telephonyInfoM17deserialize = m17deserialize(decoder);
        int i4 = asInterface + 37;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return telephonyInfoM17deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0090 A[PHI: r0 r2
      0x0090: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003c, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v10 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003c, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r0 r2
      0x003e: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003c, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v10 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003c, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GetTelephonyInfoHandler.TelephonyInfo m17deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        boolean zOnExtraCallbackWithResult;
        int i;
        SerialDescriptor serialDescriptor2;
        Boolean bool;
        int i2;
        Integer num;
        Boolean bool2;
        boolean z;
        Boolean bool3;
        boolean z2;
        Boolean bool4;
        Integer num2;
        int i3 = 2 % 2;
        int i4 = asInterface + 49;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = 7;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i6 = 43 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                boolean zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                Integer num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getDynamicHeight.onWarmupCompleted, (Object) null);
                getBgColor getbgcolor = getBgColor.IAuthTabCallback;
                Boolean bool5 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getbgcolor, (Object) null);
                Boolean bool6 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getbgcolor, (Object) null);
                Boolean bool7 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getbgcolor, (Object) null);
                Boolean bool8 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getbgcolor, (Object) null);
                int i7 = asInterface + 29;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                SerialDescriptor serialDescriptor3 = serialDescriptor;
                i = 511;
                serialDescriptor2 = serialDescriptor3;
                bool = bool7;
                i2 = iOnTransact;
                num = num3;
                bool2 = bool6;
                z = zOnExtraCallbackWithResult2;
                bool3 = bool5;
                z2 = zOnExtraCallbackWithResult3;
                bool4 = bool8;
            } else {
                boolean z3 = true;
                int i9 = 0;
                int iOnTransact2 = 0;
                boolean zOnExtraCallbackWithResult4 = false;
                boolean zOnExtraCallbackWithResult5 = false;
                Boolean bool9 = null;
                Boolean bool10 = null;
                Boolean bool11 = null;
                Integer num4 = null;
                Boolean bool12 = null;
                boolean zOnExtraCallbackWithResult6 = false;
                while (z3) {
                    int i10 = IAuthTabCallbackStub + 13;
                    asInterface = i10 % 128;
                    int i11 = i10 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z3 = false;
                            i5 = 7;
                        case 0:
                            i9 |= 1;
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                            i5 = 7;
                        case 1:
                            i9 |= 2;
                            num4 = num4;
                            zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                            i5 = 7;
                        case 2:
                            zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i9 |= 4;
                            i5 = 7;
                        case 3:
                            num2 = num4;
                            zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                            i9 |= 8;
                            num4 = num2;
                            i5 = 7;
                        case 4:
                            num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getDynamicHeight.onWarmupCompleted, num4);
                            i9 |= 16;
                            num4 = num2;
                            i5 = 7;
                        case 5:
                            bool11 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getBgColor.IAuthTabCallback, bool11);
                            i9 |= 32;
                            i5 = 7;
                        case 6:
                            bool12 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getBgColor.IAuthTabCallback, bool12);
                            i9 |= 64;
                        case 7:
                            bool10 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getBgColor.IAuthTabCallback, bool10);
                            i9 |= 128;
                        case 8:
                            bool9 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getBgColor.IAuthTabCallback, bool9);
                            i9 |= 256;
                            int i12 = IAuthTabCallbackStub + 121;
                            asInterface = i12 % 128;
                            int i13 = i12 % 2;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                serialDescriptor2 = serialDescriptor;
                i = i9;
                bool3 = bool11;
                z = zOnExtraCallbackWithResult4;
                z2 = zOnExtraCallbackWithResult5;
                num = num4;
                bool = bool10;
                bool2 = bool12;
                i2 = iOnTransact2;
                bool4 = bool9;
                zOnExtraCallbackWithResult = zOnExtraCallbackWithResult6;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor2);
        return new GetTelephonyInfoHandler.TelephonyInfo(i, i2, z, z2, zOnExtraCallbackWithResult, num, bool3, bool2, bool, bool4, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetTelephonyInfoHandler.TelephonyInfo) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 17;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetTelephonyInfoHandler.TelephonyInfo telephonyInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(telephonyInfo, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        GetTelephonyInfoHandler.TelephonyInfo.onNavigationEvent(telephonyInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new char[]{60665, 47604, 18141, 5080, 47337, 17831, 4742, 49025, 17514, 4431, 48727, 19232, 4148, 48388, 19037, 4341, 48576, 19150, 6072, 48375, 18820, 5786, 41838, 18556, 5456, 41507, 20341, 5150, 41234, 20455, 5309, 41420, 20138, 7086, 41112, 19864, 6752, 42864, 19469, 6489, 42558, 29443, 6175, 42725, 29682, 6359, 42432, 29423, 8104, 42136, 29055, 7757, 43842, 28761, 7462, 43553, 30487, 7650, 43765, 30672, 7422, 43435, 30389, 910, 43079, 30076, 581, 44893, 29739, 304, 44561, 31583, 459, 44744, 31703, 172, 44455, 31373, 1948, 44143, 31062, 1652, 54053, 30783, 1288, 60839, 47279, 18333, 4769, 47603, 17659, 5078, 48862, 60861, 47285, 18336, 4746, 47603, 17632, 5085, 48868, 17713, 4123, 48898, 19063, 4478, 48238, 19277, 4520, 48281, 19343, 5859, 48625, 18645, 6081, 41526, 18701, 5142, 41847, 20078, 5446, 41033, 20154, 273, 21529, 43819, 65047, 21829, 43085, 65376, 21096, 43443, 64692, 21376, 42689, 64968, 20705, 43000, 64773, 20513, 42801, 64082, 20829, 42085, 64374};
        IAuthTabCallback = 2700835189203843270L;
        onExtraCallbackWithResult = -8552873298451805755L;
    }
}
