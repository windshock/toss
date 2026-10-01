package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setProgressColor implements setupStyleable, BaseRoundCornerProgressBarOnProgressChangedListener {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static char asInterface;
    private static int onTransact;
    private static final IvParameterSpec onWarmupCompleted;
    private final setSecondaryProgressColor onExtraCallback;
    private final Cipher onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[setSecondaryProgressColor.values().length];
            try {
                iArr[setSecondaryProgressColor.RSA.ordinal()] = 1;
                int i = onNavigationEvent + 45;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 5;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setSecondaryProgressColor.AES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int i4 = onWarmupCompleted + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public setProgressColor(@NotNull setSecondaryProgressColor setsecondaryprogresscolor, int i, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(setsecondaryprogresscolor, "");
        Intrinsics.checkNotNullParameter(cipher, "");
        this.onExtraCallback = setsecondaryprogresscolor;
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = cipher;
    }

    public static final /* synthetic */ IvParameterSpec onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IvParameterSpec ivParameterSpec = onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return ivParameterSpec;
    }

    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static long onExtraCallback = 1582044260258865963L;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
            int i7 = ~i3;
            int i8 = ~i4;
            int i9 = ~(i7 | i8);
            int i10 = ~(i7 | i);
            int i11 = ~i;
            int i12 = i11 | i3;
            int i13 = ~(i4 | i12);
            int i14 = i9 | i10 | i13;
            int i15 = i13 | (~(i7 | i11 | i8));
            int i16 = (~i12) | i10;
            int i17 = i3 + i + i2 + ((-573665793) * i6) + ((-1595597844) * i5);
            int i18 = i17 * i17;
            int i19 = ((-1787860089) * i3) + 959184896 + (1033409659 * i) + ((-1473697548) * i14) + (1473697548 * i15) + ((-1410634874) * i16) + ((-377225216) * i2) + (1316749312 * i6) + (833617920 * i5) + (497221632 * i18);
            int i20 = ((i3 * 2143800573) - 1595758) + (i * 2143800249) + (i14 * (-324)) + (i15 * 324) + (i16 * 162) + (i2 * 2143800411) + (i6 * 1405922725) + (i5 * (-1943733020)) + (i18 * 1827733504);
            int i21 = i19 + (i20 * i20 * (-911933440));
            if (i21 == 1) {
                return onExtraCallback(objArr);
            }
            if (i21 != 2) {
                return i21 != 3 ? i21 != 4 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
            }
            Key key = (Key) objArr[1];
            GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) objArr[2];
            byte[] bArr = (byte[]) objArr[3];
            int i22 = 2 % 2;
            Intrinsics.checkNotNullParameter(key, "");
            Intrinsics.checkNotNullParameter(gCMParameterSpec, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{26205, 10018, 58553, 41538, 25527, 8504, 61107, 44142, 28042, 11040, 59522, 46644, 30652, 13639, 62159, 45127, 29131}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16763, objArr2);
            Cipher cipher = Cipher.getInstance(((String) objArr2[0]).intern());
            cipher.init(2, key, gCMParameterSpec);
            if (bArr != null) {
                cipher.updateAAD(bArr);
                int i23 = IAuthTabCallback + 61;
                onWarmupCompleted = i23 % 128;
                int i24 = i23 % 2;
            }
            setSecondaryProgressColor setsecondaryprogresscolor = setSecondaryProgressColor.AES;
            Intrinsics.checkNotNull(cipher);
            setProgressColor setprogresscolor = new setProgressColor(setsecondaryprogresscolor, 2, cipher);
            int i25 = IAuthTabCallback + 97;
            onWarmupCompleted = i25 % 128;
            int i26 = i25 % 2;
            return setprogresscolor;
        }

        private onNavigationEvent() {
        }

        static /* synthetic */ SecretKey onExtraCallbackWithResult(onNavigationEvent onnavigationevent, CharSequence charSequence, String str, int i, Object obj) throws Throwable {
            Object obj2;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 23;
                onWarmupCompleted = i6 % 128;
                char[] cArr = {26205, 34068, 41173};
                if (i6 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(cArr, 58189 / View.resolveSize(0, 1), objArr);
                    obj2 = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(cArr, View.resolveSize(0, 0) + 58189, objArr2);
                    obj2 = objArr2[0];
                }
                str = ((String) obj2).intern();
            }
            SecretKey secretKeyIAuthTabCallback = onnavigationevent.IAuthTabCallback(charSequence, str);
            int i7 = onWarmupCompleted + 79;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return secretKeyIAuthTabCallback;
        }

        private final SecretKey IAuthTabCallback(CharSequence charSequence, String str) {
            int i = 2 % 2;
            Object obj = null;
            SecretKeySpec secretKeySpec = new SecretKeySpec(PageKey.onWarmupCompleted(charSequence, null, 1, null), str);
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return secretKeySpec;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ setupStyleable onExtraCallbackWithResult(onNavigationEvent onnavigationevent, CharSequence charSequence, IvParameterSpec ivParameterSpec, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 99;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if ((i & 2) != 0) {
                int i6 = i4 + 119;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                ivParameterSpec = setProgressColor.onNavigationEvent();
                int i8 = onWarmupCompleted + 17;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            return onnavigationevent.onExtraCallbackWithResult(charSequence, ivParameterSpec);
        }

        @JvmStatic
        public final setupStyleable onExtraCallbackWithResult(@NotNull CharSequence charSequence, @NotNull IvParameterSpec ivParameterSpec) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(charSequence, "");
                Intrinsics.checkNotNullParameter(ivParameterSpec, "");
            } else {
                Intrinsics.checkNotNullParameter(charSequence, "");
                Intrinsics.checkNotNullParameter(ivParameterSpec, "");
            }
            return onNavigationEvent(onExtraCallbackWithResult(this, charSequence, (String) null, 1, (Object) null), ivParameterSpec);
        }

        public static /* synthetic */ setupStyleable onExtraCallbackWithResult(onNavigationEvent onnavigationevent, byte[] bArr, IvParameterSpec ivParameterSpec, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 125;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if ((i & 2) != 0) {
                int i6 = i4 + 55;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                ivParameterSpec = setProgressColor.onNavigationEvent();
            }
            return onnavigationevent.onWarmupCompleted(bArr, ivParameterSpec);
        }

        @JvmStatic
        public final setupStyleable onWarmupCompleted(@NotNull byte[] bArr, @NotNull IvParameterSpec ivParameterSpec) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(ivParameterSpec, "");
            Object[] objArr = new Object[1];
            a(new char[]{26205, 34068, 41173}, 58189 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            setupStyleable setupstyleableOnNavigationEvent = onNavigationEvent(new SecretKeySpec(bArr, ((String) objArr[0]).intern()), ivParameterSpec);
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return setupstyleableOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ setupStyleable onExtraCallbackWithResult(onNavigationEvent onnavigationevent, Key key, IvParameterSpec ivParameterSpec, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 2) != 0) {
                int i3 = IAuthTabCallback + 113;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                ivParameterSpec = setProgressColor.onNavigationEvent();
                int i5 = onWarmupCompleted + 69;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return onnavigationevent.onNavigationEvent(key, ivParameterSpec);
        }

        @JvmStatic
        public final setupStyleable onNavigationEvent(@NotNull Key key, @NotNull IvParameterSpec ivParameterSpec) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(key, "");
            Intrinsics.checkNotNullParameter(ivParameterSpec, "");
            Object[] objArr = new Object[1];
            a(new char[]{26205, 12996, 53109, 39908, 13355, 49487, 40433, 13944, 49828, 40914, 10365, 50416, 37237, 11701, 50923, 37707, 12200, 63512, 38264, 8668}, ((byte) KeyEvent.getModifierMetaStateMask()) + 21662, objArr);
            Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
            cipher.init(1, key, ivParameterSpec);
            setSecondaryProgressColor setsecondaryprogresscolor = setSecondaryProgressColor.AES;
            Intrinsics.checkNotNull(cipher);
            setProgressColor setprogresscolor = new setProgressColor(setsecondaryprogresscolor, 1, cipher);
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return setprogresscolor;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            CharSequence charSequence = (CharSequence) objArr[1];
            GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) objArr[2];
            byte[] bArr = (byte[]) objArr[3];
            int iIntValue = ((Number) objArr[4]).intValue();
            Object obj = objArr[5];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if ((iIntValue & 4) != 0) {
                int i5 = i3 + 39;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                bArr = null;
            }
            return onnavigationevent.onExtraCallbackWithResult(charSequence, gCMParameterSpec, bArr);
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 75;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 24 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 'k' - AndroidCharacter.getMirror('0'), 6383 - ExpandableListView.getPackedPositionType(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                int i6 = $10 + 29;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 59, 6383 - (ViewConfiguration.getTouchSlop() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        @JvmStatic
        public final setupStyleable onExtraCallbackWithResult(@NotNull CharSequence charSequence, @NotNull GCMParameterSpec gCMParameterSpec, @Nullable byte[] bArr) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(gCMParameterSpec, "");
            setupStyleable setupstyleableOnExtraCallback = onExtraCallback(onExtraCallbackWithResult(this, charSequence, (String) null, 1, (Object) null), gCMParameterSpec, bArr);
            int i4 = IAuthTabCallback + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
            return setupstyleableOnExtraCallback;
        }

        public static /* synthetic */ setupStyleable onWarmupCompleted(onNavigationEvent onnavigationevent, byte[] bArr, GCMParameterSpec gCMParameterSpec, byte[] bArr2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 11;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object obj2 = null;
            if ((i & 4) != 0) {
                bArr2 = null;
            }
            setupStyleable setupstyleable = (setupStyleable) IAuthTabCallback(-932965038, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{onnavigationevent, bArr, gCMParameterSpec, bArr2}, 932965038, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            int i5 = onWarmupCompleted + 41;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return setupstyleable;
            }
            obj2.hashCode();
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) objArr[2];
            byte[] bArr2 = (byte[]) objArr[3];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(gCMParameterSpec, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{26205, 34068, 41173}, 58189 - TextUtils.getOffsetBefore("", 0), objArr2);
            setupStyleable setupstyleableOnExtraCallback = onnavigationevent.onExtraCallback(new SecretKeySpec(bArr, ((String) objArr2[0]).intern()), gCMParameterSpec, bArr2);
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return setupstyleableOnExtraCallback;
            }
            throw null;
        }

        public static /* synthetic */ setupStyleable onWarmupCompleted(onNavigationEvent onnavigationevent, Key key, GCMParameterSpec gCMParameterSpec, byte[] bArr, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 25;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0 ? (i & 4) != 0 : (i & 5) != 0) {
                bArr = null;
            }
            setupStyleable setupstyleableOnExtraCallback = onnavigationevent.onExtraCallback(key, gCMParameterSpec, bArr);
            int i4 = onWarmupCompleted + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return setupstyleableOnExtraCallback;
            }
            throw null;
        }

        @JvmStatic
        public final setupStyleable onExtraCallback(@NotNull Key key, @NotNull GCMParameterSpec gCMParameterSpec, @Nullable byte[] bArr) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(key, "");
            Intrinsics.checkNotNullParameter(gCMParameterSpec, "");
            Object[] objArr = new Object[1];
            a(new char[]{26205, 10018, 58553, 41538, 25527, 8504, 61107, 44142, 28042, 11040, 59522, 46644, 30652, 13639, 62159, 45127, 29131}, 16762 - TextUtils.lastIndexOf("", '0', 0), objArr);
            Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
            cipher.init(1, key, gCMParameterSpec);
            if (bArr != null) {
                cipher.updateAAD(bArr);
            }
            setSecondaryProgressColor setsecondaryprogresscolor = setSecondaryProgressColor.AES;
            Intrinsics.checkNotNull(cipher);
            setProgressColor setprogresscolor = new setProgressColor(setsecondaryprogresscolor, 1, cipher);
            int i4 = onWarmupCompleted + 49;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return setprogresscolor;
            }
            throw null;
        }

        public static /* synthetic */ BaseRoundCornerProgressBarOnProgressChangedListener onWarmupCompleted(onNavigationEvent onnavigationevent, CharSequence charSequence, IvParameterSpec ivParameterSpec, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 2) != 0) {
                ivParameterSpec = setProgressColor.onNavigationEvent();
                int i5 = IAuthTabCallback + 107;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            return onnavigationevent.onExtraCallback(charSequence, ivParameterSpec);
        }

        @JvmStatic
        public final BaseRoundCornerProgressBarOnProgressChangedListener onExtraCallback(@NotNull CharSequence charSequence, @NotNull IvParameterSpec ivParameterSpec) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(ivParameterSpec, "");
            BaseRoundCornerProgressBarOnProgressChangedListener baseRoundCornerProgressBarOnProgressChangedListenerIAuthTabCallback = IAuthTabCallback(onExtraCallbackWithResult(this, charSequence, (String) null, 1, (Object) null), ivParameterSpec);
            int i4 = onWarmupCompleted + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return baseRoundCornerProgressBarOnProgressChangedListenerIAuthTabCallback;
        }

        public static /* synthetic */ BaseRoundCornerProgressBarOnProgressChangedListener onNavigationEvent(onNavigationEvent onnavigationevent, byte[] bArr, IvParameterSpec ivParameterSpec, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 2) != 0) {
                int i6 = i3 + 63;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                ivParameterSpec = setProgressColor.onNavigationEvent();
            }
            return onnavigationevent.onExtraCallback(bArr, ivParameterSpec);
        }

        @JvmStatic
        public final BaseRoundCornerProgressBarOnProgressChangedListener onExtraCallback(@NotNull byte[] bArr, @NotNull IvParameterSpec ivParameterSpec) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(ivParameterSpec, "");
            Object[] objArr = new Object[1];
            a(new char[]{26205, 34068, 41173}, 58189 - View.resolveSizeAndState(0, 0, 0), objArr);
            BaseRoundCornerProgressBarOnProgressChangedListener baseRoundCornerProgressBarOnProgressChangedListenerIAuthTabCallback = IAuthTabCallback(new SecretKeySpec(bArr, ((String) objArr[0]).intern()), ivParameterSpec);
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return baseRoundCornerProgressBarOnProgressChangedListenerIAuthTabCallback;
            }
            throw null;
        }

        public static /* synthetic */ BaseRoundCornerProgressBarOnProgressChangedListener onNavigationEvent(onNavigationEvent onnavigationevent, Key key, IvParameterSpec ivParameterSpec, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 17;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if ((i & 2) != 0) {
                int i6 = i4 + 43;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    setProgressColor.onNavigationEvent();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ivParameterSpec = setProgressColor.onNavigationEvent();
            }
            return onnavigationevent.IAuthTabCallback(key, ivParameterSpec);
        }

        @JvmStatic
        public final BaseRoundCornerProgressBarOnProgressChangedListener IAuthTabCallback(@NotNull Key key, @NotNull IvParameterSpec ivParameterSpec) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(key, "");
            Intrinsics.checkNotNullParameter(ivParameterSpec, "");
            Object[] objArr = new Object[1];
            a(new char[]{26205, 12996, 53109, 39908, 13355, 49487, 40433, 13944, 49828, 40914, 10365, 50416, 37237, 11701, 50923, 37707, 12200, 63512, 38264, 8668}, 21661 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
            cipher.init(2, key, ivParameterSpec);
            setSecondaryProgressColor setsecondaryprogresscolor = setSecondaryProgressColor.AES;
            Intrinsics.checkNotNull(cipher);
            setProgressColor setprogresscolor = new setProgressColor(setsecondaryprogresscolor, 2, cipher);
            int i2 = onWarmupCompleted + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return setprogresscolor;
        }

        public static /* synthetic */ BaseRoundCornerProgressBarOnProgressChangedListener onNavigationEvent(onNavigationEvent onnavigationevent, CharSequence charSequence, GCMParameterSpec gCMParameterSpec, byte[] bArr, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 25;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            if ((i & 4) != 0) {
                int i6 = i4 + 89;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                bArr = null;
            }
            return onnavigationevent.onNavigationEvent(charSequence, gCMParameterSpec, bArr);
        }

        @JvmStatic
        public final BaseRoundCornerProgressBarOnProgressChangedListener onNavigationEvent(@NotNull CharSequence charSequence, @NotNull GCMParameterSpec gCMParameterSpec, @Nullable byte[] bArr) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(gCMParameterSpec, "");
            Object[] objArr = {this, onExtraCallbackWithResult(this, charSequence, (String) null, 1, (Object) null), gCMParameterSpec, bArr};
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            BaseRoundCornerProgressBarOnProgressChangedListener baseRoundCornerProgressBarOnProgressChangedListener = (BaseRoundCornerProgressBarOnProgressChangedListener) IAuthTabCallback(-178461274, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, 178461276, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            int i4 = onWarmupCompleted + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return baseRoundCornerProgressBarOnProgressChangedListener;
        }

        public static /* synthetic */ BaseRoundCornerProgressBarOnProgressChangedListener onExtraCallback(onNavigationEvent onnavigationevent, byte[] bArr, GCMParameterSpec gCMParameterSpec, byte[] bArr2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 4) != 0) {
                int i6 = i3 + 25;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                bArr2 = null;
            }
            BaseRoundCornerProgressBarOnProgressChangedListener baseRoundCornerProgressBarOnProgressChangedListener = (BaseRoundCornerProgressBarOnProgressChangedListener) IAuthTabCallback(1916344480, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{onnavigationevent, bArr, gCMParameterSpec, bArr2}, -1916344477, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            int i8 = IAuthTabCallback + 17;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                return baseRoundCornerProgressBarOnProgressChangedListener;
            }
            throw null;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) objArr[2];
            byte[] bArr2 = (byte[]) objArr[3];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(gCMParameterSpec, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{26205, 34068, 41173}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 58189, objArr2);
            Object[] objArr3 = {onnavigationevent, new SecretKeySpec(bArr, ((String) objArr2[0]).intern()), gCMParameterSpec, bArr2};
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            BaseRoundCornerProgressBarOnProgressChangedListener baseRoundCornerProgressBarOnProgressChangedListener = (BaseRoundCornerProgressBarOnProgressChangedListener) IAuthTabCallback(-178461274, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr3, 178461276, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            int i2 = onWarmupCompleted + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 91 / 0;
            }
            return baseRoundCornerProgressBarOnProgressChangedListener;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
            CharSequence charSequence = (CharSequence) objArr[1];
            String str = (String) objArr[2];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(str, "");
            Key keyOnWarmupCompleted = setup.onWarmupCompleted(charSequence);
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(1, keyOnWarmupCompleted);
            setSecondaryProgressColor setsecondaryprogresscolor = setSecondaryProgressColor.RSA;
            Intrinsics.checkNotNull(cipher);
            setProgressColor setprogresscolor = new setProgressColor(setsecondaryprogresscolor, 1, cipher);
            int i2 = onWarmupCompleted + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 81 / 0;
            }
            return setprogresscolor;
        }

        public static /* synthetic */ setupStyleable onWarmupCompleted(onNavigationEvent onnavigationevent, CharSequence charSequence, GCMParameterSpec gCMParameterSpec, byte[] bArr, int i, Object obj) {
            Object[] objArr = {onnavigationevent, charSequence, gCMParameterSpec, bArr, Integer.valueOf(i), obj};
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (setupStyleable) IAuthTabCallback(2019717576, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, -2019717572, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }

        @JvmStatic
        public final BaseRoundCornerProgressBarOnProgressChangedListener onNavigationEvent(@NotNull Key key, @NotNull GCMParameterSpec gCMParameterSpec, @Nullable byte[] bArr) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (BaseRoundCornerProgressBarOnProgressChangedListener) IAuthTabCallback(-178461274, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, key, gCMParameterSpec, bArr}, 178461276, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }

        @JvmStatic
        public final BaseRoundCornerProgressBarOnProgressChangedListener IAuthTabCallback(@NotNull byte[] bArr, @NotNull GCMParameterSpec gCMParameterSpec, @Nullable byte[] bArr2) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (BaseRoundCornerProgressBarOnProgressChangedListener) IAuthTabCallback(1916344480, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, bArr, gCMParameterSpec, bArr2}, -1916344477, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }

        @JvmStatic
        public final setupStyleable onWarmupCompleted(@NotNull byte[] bArr, @NotNull GCMParameterSpec gCMParameterSpec, @Nullable byte[] bArr2) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (setupStyleable) IAuthTabCallback(-932965038, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, bArr, gCMParameterSpec, bArr2}, 932965038, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }

        @JvmStatic
        public final setupStyleable onWarmupCompleted(@NotNull CharSequence charSequence, @NotNull String str) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (setupStyleable) IAuthTabCallback(-1027099263, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, charSequence, str}, 1027099264, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
    }

    static {
        onExtraCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        Object[] objArr = new Object[1];
        a(new char[]{13790, 13790, 13790, 13790, 13790, 13790, 13790, 13790, 13790, 13790, 13790, 13790, 13790, 13790, 13790, 13790}, (byte) (TextUtils.getOffsetAfter("", 0) + 39), TextUtils.getCapsMode("", 0, 0) + 16, objArr);
        onWarmupCompleted = new IvParameterSpec(new GraniteBrownfieldModule_closeView(((String) objArr[0]).intern()).onWarmupCompleted());
        int i = IAuthTabCallbackStub + 109;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        r5 = r4.onExtraCallbackWithResult.doFinal(r5);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r1 = o.setProgressColor.onTransact + 15;
        o.setProgressColor.IAuthTabCallbackDefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r1 = r4.onNavigationEvent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r1 == 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1 == 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return new byte[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        return IAuthTabCallback(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        return onExtraCallback(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r1 != 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final byte[] onWarmupCompleted(byte[] bArr) throws BadPaddingException, NoWhenBranchMatchedException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 105;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            i = IAuthTabCallback.onExtraCallbackWithResult[this.onExtraCallback.ordinal()];
        } else {
            i = IAuthTabCallback.onExtraCallbackWithResult[this.onExtraCallback.ordinal()];
        }
    }

    @Override // o.setupStyleable
    public byte[] a_(@NotNull byte[] bArr) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (this.onNavigationEvent != 1) {
            Object[] objArr = new Object[1];
            a(new char[]{3, '\f', '\t', '\r', '\b', 4, 5, 2, 15, '\n', '\t', '\r', 7, 3, '\b', 6}, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 79), 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        int i2 = onTransact + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            byte[] bArrOnWarmupCompleted = onWarmupCompleted(bArr);
            int i4 = onTransact + 13;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return bArrOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            throw new BaseRoundCornerProgressBarSavedState(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r6 = onWarmupCompleted(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r1 = o.setProgressColor.IAuthTabCallbackDefault + 99;
        o.setProgressColor.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        throw new o.onProgressChanged(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r0 = new java.lang.Object[1];
        a(new char[]{3, '\f', '\t', '\r', '\b', 6, 5, 2, 15, '\n', '\t', '\r', 7, 3, '\b', 6}, (byte) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 113), android.widget.ExpandableListView.getPackedPositionType(0) + 16, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        throw new java.lang.IllegalStateException(((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5.onNavigationEvent == 3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r5.onNavigationEvent == 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1 = o.setProgressColor.onTransact + 33;
        o.setProgressColor.IAuthTabCallbackDefault = r1 % 128;
        r1 = r1 % 2;
     */
    @Override // o.BaseRoundCornerProgressBarOnProgressChangedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] onExtraCallbackWithResult(@NotNull byte[] bArr) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
        } else {
            Intrinsics.checkNotNullParameter(bArr, "");
        }
    }

    private final byte[] onExtraCallback(byte[] bArr) {
        int i = 2 % 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) (Math.ceil(bArr.length / 245.0d) * 256.0d));
        int i2 = IAuthTabCallbackDefault + 25;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 % 3;
        }
        int i4 = 0;
        while (i4 < bArr.length) {
            int i5 = IAuthTabCallbackDefault + 31;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int iMin = Math.min(bArr.length << i4, 10598);
                byteBufferAllocate.put(this.onExtraCallbackWithResult.doFinal(bArr, i4, iMin));
                i4 >>>= iMin;
            } else {
                int iMin2 = Math.min(bArr.length - i4, 245);
                byteBufferAllocate.put(this.onExtraCallbackWithResult.doFinal(bArr, i4, iMin2));
                i4 += iMin2;
            }
        }
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "");
        int i6 = IAuthTabCallbackDefault + 51;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return bArrArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final byte[] IAuthTabCallback(byte[] bArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
        int i4 = 0;
        while (i4 < bArr.length) {
            int i5 = onTransact + 85;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int iMin = Math.min(bArr.length << i4, 30280);
                byteBufferAllocate.put(this.onExtraCallbackWithResult.doFinal(bArr, i4, iMin));
                i4 %= iMin;
            } else {
                int iMin2 = Math.min(bArr.length - i4, 256);
                byteBufferAllocate.put(this.onExtraCallbackWithResult.doFinal(bArr, i4, iMin2));
                i4 += iMin2;
            }
            int i6 = onTransact + 13;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }
        int iPosition = byteBufferAllocate.position();
        byte[] bArr2 = new byte[iPosition];
        byteBufferAllocate.rewind();
        byteBufferAllocate.get(bArr2, 0, iPosition);
        return bArr2;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), Color.alpha(0) + 26, 23139 - (ViewConfiguration.getLongPressTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 26, View.getDefaultSize(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 107;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = i + 30;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $11 + 107;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (Process.myTid() >> 22)), Color.rgb(0, 0, 0) + 16777290, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), KeyEvent.keyCodeFromString("") + 30, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                        } else {
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i13 = 0; i13 < i; i13++) {
            int i14 = $10 + 27;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr4[i13] = (char) (cArr4[i13] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallback() {
        IAuthTabCallback = new char[]{64989, 64961, 64977, 64990, 64982, 64967, 64976, 64991, 64979, 64915, 64983, 64963, 64978, 64926, 64970, 64988};
        asInterface = (char) 51245;
    }
}
