package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TTBaseLandingPageActivity implements Serializable, Comparable<TTBaseLandingPageActivity> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final TTBaseLandingPageActivity EMPTY;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted = 0;
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws NoSuchAlgorithmException {
        int i7 = ~((~i2) | i6);
        int i8 = ~i4;
        int i9 = i7 | (~(i8 | i6));
        int i10 = ~i6;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i2);
        int i13 = (~(i8 | i2)) | i11 | i12;
        int i14 = (~(i4 | i10)) | i12;
        int i15 = i2 + i6 + i5 + (1039959776 * i3) + ((-2046201414) * i);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i2) - 8388608) + ((-1785926397) * i6) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i5) + ((-201326592) * i3) + ((-406847488) * i) + (529399808 * i16);
        int i18 = ((i2 * 868240256) - 1765242424) + (i6 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i5 * 868239597) + (i3 * 817356128) + (i * 406493490) + (i16 * 645267456);
        int i19 = i17 + (i18 * i18 * 681705472);
        if (i19 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i19 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i19 == 3) {
            return onExtraCallback(objArr);
        }
        TTBaseLandingPageActivity tTBaseLandingPageActivity = (TTBaseLandingPageActivity) objArr[0];
        int i20 = 2 % 2;
        int i21 = onNavigationEvent + 19;
        IAuthTabCallback = i21 % 128;
        int i22 = i21 % 2;
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback = tTBaseLandingPageActivity.onExtraCallback("SHA-256");
        int i23 = IAuthTabCallback + 65;
        onNavigationEvent = i23 % 128;
        int i24 = i23 % 2;
        return tTBaseLandingPageActivityOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TTBaseLandingPageActivity tTBaseLandingPageActivityIAuthTabCallback = Companion.IAuthTabCallback(str);
        int i4 = onNavigationEvent + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return tTBaseLandingPageActivityIAuthTabCallback;
    }

    @JvmStatic
    public static final TTBaseLandingPageActivity onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = Companion;
        if (i3 == 0) {
            return iAuthTabCallback.onExtraCallbackWithResult(str);
        }
        iAuthTabCallback.onExtraCallbackWithResult(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final TTBaseLandingPageActivity onExtraCallbackWithResult(@NotNull byte... bArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TTBaseLandingPageActivity tTBaseLandingPageActivityIAuthTabCallback = Companion.IAuthTabCallback(bArr);
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return tTBaseLandingPageActivityIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TTBaseLandingPageActivity(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.data = bArr;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(tTBaseLandingPageActivity);
        int i4 = IAuthTabCallback + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return iOnExtraCallbackWithResult;
    }

    public final byte[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = this.data;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return bArr;
    }

    public final int onExtraCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.hashCode;
            int i5 = 49 / 0;
        } else {
            i = this.hashCode;
        }
        int i6 = i3 + 49;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        this.hashCode = i;
        int i6 = i4 + 27;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.utf8;
        int i5 = i2 + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return str;
    }

    public final void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.utf8 = str;
        int i5 = i2 + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public String onExtraCallbackWithResult(@NotNull Charset charset) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charset, "");
        String str = new String(this.data, charset);
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return str;
    }

    public final TTBaseLandingPageActivity onTransact() throws NoSuchAlgorithmException {
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            tTBaseLandingPageActivityOnExtraCallback = onExtraCallback("MD5");
            int i3 = 4 / 0;
        } else {
            tTBaseLandingPageActivityOnExtraCallback = onExtraCallback("MD5");
        }
        int i4 = onNavigationEvent + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return tTBaseLandingPageActivityOnExtraCallback;
        }
        throw null;
    }

    public final TTBaseLandingPageActivity IAuthTabCallbackDefault() throws NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback("SHA-1");
        }
        onExtraCallback("SHA-1");
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 13;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 24 - (ViewConfiguration.getTouchSlop() >> 8), Color.red(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (onWarmupCompleted % 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 59, 6383 - Color.red(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 25, 19627 - View.MeasureSpec.makeMeasureSpec(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ onWarmupCompleted);
                    try {
                        Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), View.resolveSizeAndState(0, 0, 0) + 59, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 43;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 59 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i8 = $10 + 85;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i9 = 42 / 0;
            objArr[0] = str;
        }
    }

    public TTBaseLandingPageActivity onExtraCallback(@NotNull String str) throws NoSuchAlgorithmException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, access100());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        TTBaseLandingPageActivity tTBaseLandingPageActivity = new TTBaseLandingPageActivity(bArrDigest);
        int i2 = onNavigationEvent + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return tTBaseLandingPageActivity;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TTBaseLandingPageActivity tTBaseLandingPageActivity = (TTBaseLandingPageActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if (objArr[4] != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((iIntValue3 & 1) != 0) {
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = 0;
        }
        if ((iIntValue3 & 2) != 0) {
            int i4 = onNavigationEvent + 81;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                iIntValue2 = TTAppOpenAdActivity6.onWarmupCompleted();
                int i5 = 36 / 0;
            } else {
                iIntValue2 = TTAppOpenAdActivity6.onWarmupCompleted();
            }
        }
        return tTBaseLandingPageActivity.onExtraCallbackWithResult(iIntValue, iIntValue2);
    }

    public final byte onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        byte bOnNavigationEvent = onNavigationEvent(i);
        int i5 = IAuthTabCallback + 61;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return bOnNavigationEvent;
    }

    public final int access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent = onNavigationEvent();
        int i3 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public void onWarmupCompleted(@NotNull TTBaseActivity tTBaseActivity, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            TTHistoryLandingPageActivity.onWarmupCompleted(this, tTBaseActivity, i, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        TTHistoryLandingPageActivity.onWarmupCompleted(this, tTBaseActivity, i, i2);
        int i5 = onNavigationEvent + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r1 = r1 + 83;
        o.TTBaseLandingPageActivity.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return r4.onWarmupCompleted(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if ((r7 & 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ int onExtraCallback(TTBaseLandingPageActivity tTBaseLandingPageActivity, TTBaseLandingPageActivity tTBaseLandingPageActivity2, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = i4 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
    }

    public final int onWarmupCompleted(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            onExtraCallback(tTBaseLandingPageActivity.IAuthTabCallbackStub(), i);
            throw null;
        }
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        int iOnExtraCallback = onExtraCallback(tTBaseLandingPageActivity.IAuthTabCallbackStub(), i);
        int i4 = onNavigationEvent + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return iOnExtraCallback;
    }

    public static /* synthetic */ int IAuthTabCallback(TTBaseLandingPageActivity tTBaseLandingPageActivity, TTBaseLandingPageActivity tTBaseLandingPageActivity2, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i2 & 2) != 0) {
            i = TTAppOpenAdActivity6.onWarmupCompleted();
            int i5 = IAuthTabCallback + 37;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        return tTBaseLandingPageActivity.onExtraCallbackWithResult(tTBaseLandingPageActivity2, i);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallbackWithResult = Companion.onExtraCallbackWithResult(objectInputStream, objectInputStream.readInt());
        Object[] objArr = new Object[1];
        a(new char[]{38927, 2515, 48045, 11649}, 37337 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        Field declaredField = TTBaseLandingPageActivity.class.getDeclaredField(((String) objArr[0]).intern());
        declaredField.setAccessible(true);
        declaredField.set(this, tTBaseLandingPageActivityOnExtraCallbackWithResult.data);
        int i4 = IAuthTabCallback + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            objectOutputStream.writeInt(this.data.length);
            objectOutputStream.write(this.data);
            int i3 = onNavigationEvent + 113;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 99 / 0;
                return;
            }
            return;
        }
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
        throw null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ TTBaseLandingPageActivity onExtraCallback(IAuthTabCallback iAuthTabCallback, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = TTAppOpenAdActivity6.onWarmupCompleted();
            }
            return iAuthTabCallback.onWarmupCompleted(bArr, i, i2);
        }

        private IAuthTabCallback() {
        }

        @JvmStatic
        public final TTBaseLandingPageActivity onWarmupCompleted(@NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new TTBaseLandingPageActivity(bArr);
        }

        @JvmStatic
        public final TTBaseLandingPageActivity onExtraCallbackWithResult(@NotNull String str, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charset, "");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return new TTBaseLandingPageActivity(bytes);
        }

        @JvmStatic
        public final TTBaseLandingPageActivity onExtraCallbackWithResult(@NotNull InputStream inputStream, int i) throws IOException {
            Intrinsics.checkNotNullParameter(inputStream, "");
            if (i < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    throw new EOFException();
                }
                i2 += i3;
            }
            return new TTBaseLandingPageActivity(bArr);
        }

        @Deprecated
        public final TTBaseLandingPageActivity onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return onExtraCallback(str);
        }

        @Deprecated
        public final TTBaseLandingPageActivity onWarmupCompleted(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return IAuthTabCallback(str);
        }

        @Deprecated
        public final TTBaseLandingPageActivity onExtraCallback(@NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            return onWarmupCompleted(byteBuffer);
        }

        @JvmStatic
        public final TTBaseLandingPageActivity IAuthTabCallback(@NotNull byte... bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
            return new TTBaseLandingPageActivity(bArrCopyOf);
        }

        @JvmStatic
        public final TTBaseLandingPageActivity onWarmupCompleted(@NotNull byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "");
            int iOnExtraCallback = TTAppOpenAdActivity6.onExtraCallback(bArr, i2);
            TTAppOpenAdActivity6.onExtraCallbackWithResult(bArr.length, i, iOnExtraCallback);
            return new TTBaseLandingPageActivity(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, iOnExtraCallback + i));
        }

        @JvmStatic
        public final TTBaseLandingPageActivity IAuthTabCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            TTBaseLandingPageActivity tTBaseLandingPageActivity = new TTBaseLandingPageActivity(TTHistoryActivity6.onExtraCallback(str));
            tTBaseLandingPageActivity.onNavigationEvent(str);
            return tTBaseLandingPageActivity;
        }

        @JvmStatic
        public final TTBaseLandingPageActivity onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            byte[] bArrIAuthTabCallback = TTAppOpenAdActivity8.IAuthTabCallback(str);
            if (bArrIAuthTabCallback != null) {
                return new TTBaseLandingPageActivity(bArrIAuthTabCallback);
            }
            return null;
        }

        @JvmStatic
        public final TTBaseLandingPageActivity onExtraCallbackWithResult(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                bArr[i] = (byte) ((TTHistoryActivity7.onExtraCallbackWithResult(str.charAt(i2)) << 4) + TTHistoryActivity7.onExtraCallbackWithResult(str.charAt(i2 + 1)));
            }
            return new TTBaseLandingPageActivity(bArr);
        }
    }

    @Deprecated
    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            access100();
            throw null;
        }
        int iAccess100 = access100();
        int i3 = onNavigationEvent + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iAccess100;
    }

    static {
        writeTypedObject();
        Companion = new IAuthTabCallback(null);
        EMPTY = new TTBaseLandingPageActivity(new byte[0]);
        int i = onExtraCallbackWithResult + 99;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder();
            throw null;
        }
        String strAsBinder = asBinder();
        if (strAsBinder == null) {
            strAsBinder = TTHistoryActivity6.onExtraCallback(IAuthTabCallbackStub());
            onNavigationEvent(strAsBinder);
            int i3 = IAuthTabCallback + 71;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 2;
            }
        }
        return strAsBinder;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 != 0 ? TTAppOpenAdActivity8.onNavigationEvent(onWarmupCompleted(), null, 1, null) : TTAppOpenAdActivity8.onNavigationEvent(onWarmupCompleted(), null, 1, null);
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr = new char[onWarmupCompleted().length << 1];
        byte[] bArrOnWarmupCompleted = onWarmupCompleted();
        int length = bArrOnWarmupCompleted.length;
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            byte b = bArrOnWarmupCompleted[i5];
            cArr[i4] = TTHistoryLandingPageActivity.onExtraCallback()[(b >> 4) & 15];
            cArr[i4 + 1] = TTHistoryLandingPageActivity.onExtraCallback()[b & 15];
            i5++;
            i4 += 2;
        }
        String strConcatToString = StringsKt__StringsJVMKt.concatToString(cArr);
        int i6 = IAuthTabCallback + 61;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return strConcatToString;
    }

    public TTBaseLandingPageActivity IAuthTabCallbackStubProxy() {
        byte[] bArrCopyOf;
        int i;
        int i2 = 2 % 2;
        for (int i3 = 0; i3 < onWarmupCompleted().length; i3++) {
            byte b = onWarmupCompleted()[i3];
            if (b >= 65) {
                int i4 = IAuthTabCallback + 39;
                int i5 = i4 % 128;
                onNavigationEvent = i5;
                int i6 = i4 % 2;
                if (b <= 90) {
                    int i7 = i5 + 125;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        byte[] bArrOnWarmupCompleted = onWarmupCompleted();
                        bArrCopyOf = Arrays.copyOf(bArrOnWarmupCompleted, bArrOnWarmupCompleted.length);
                        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                        i = i3 % 0;
                        bArrCopyOf[i3] = (byte) (b % 52);
                    } else {
                        byte[] bArrOnWarmupCompleted2 = onWarmupCompleted();
                        bArrCopyOf = Arrays.copyOf(bArrOnWarmupCompleted2, bArrOnWarmupCompleted2.length);
                        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                        i = i3 + 1;
                        bArrCopyOf[i3] = (byte) (b + 32);
                    }
                    int i8 = onNavigationEvent + 105;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    while (i < bArrCopyOf.length) {
                        int i10 = IAuthTabCallback + 73;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        byte b2 = bArrCopyOf[i];
                        if (b2 >= 65 && b2 <= 90) {
                            bArrCopyOf[i] = (byte) (b2 + 32);
                        }
                        i++;
                    }
                    return new TTBaseLandingPageActivity(bArrCopyOf);
                }
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r6 <= onWarmupCompleted().length) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r1 = o.TTBaseLandingPageActivity.onNavigationEvent + 31;
        r2 = r1 % 128;
        o.TTBaseLandingPageActivity.IAuthTabCallback = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if ((r6 >>> r5) < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if ((r6 - r5) < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r1 = r2 + 113;
        o.TTBaseLandingPageActivity.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r5 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r2 = r2 + 101;
        o.TTBaseLandingPageActivity.onNavigationEvent = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r6 != onWarmupCompleted().length) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        r5 = o.TTBaseLandingPageActivity.onNavigationEvent + 39;
        o.TTBaseLandingPageActivity.IAuthTabCallback = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if ((r5 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        return new o.TTBaseLandingPageActivity(kotlin.collections.ArraysKt___ArraysJvmKt.copyOfRange(onWarmupCompleted(), r5, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        throw new java.lang.IllegalArgumentException("endIndex < beginIndex");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        throw new java.lang.IllegalArgumentException(("endIndex > length(" + onWarmupCompleted().length + ')').toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r6 <= onWarmupCompleted().length) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TTBaseLandingPageActivity onExtraCallbackWithResult(int i, int i2) {
        int i3 = 2 % 2;
        int iOnExtraCallback = TTAppOpenAdActivity6.onExtraCallback(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        int i4 = onNavigationEvent + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
    }

    public byte onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrOnWarmupCompleted = onWarmupCompleted();
        if (i4 != 0) {
            return bArrOnWarmupCompleted[i];
        }
        byte b = bArrOnWarmupCompleted[i];
        int i5 = 26 / 0;
        return b;
    }

    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int length = onWarmupCompleted().length;
        int i4 = IAuthTabCallback + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return length;
    }

    public byte[] access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bArrOnWarmupCompleted = onWarmupCompleted();
            byte[] bArrCopyOf = Arrays.copyOf(bArrOnWarmupCompleted, bArrOnWarmupCompleted.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
            return bArrCopyOf;
        }
        byte[] bArrOnWarmupCompleted2 = onWarmupCompleted();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrOnWarmupCompleted2, bArrOnWarmupCompleted2.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "");
        int i3 = 55 / 0;
        return bArrCopyOf2;
    }

    public byte[] IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bArrOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onExtraCallbackWithResult(int i, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        boolean zIAuthTabCallback = tTBaseLandingPageActivity.IAuthTabCallback(i2, onWarmupCompleted(), i, i3);
        int i7 = IAuthTabCallback + 71;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 2 / 0;
        }
        return zIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (((java.lang.Boolean) o.TTAppOpenAdActivity6.onNavigationEvent(o.setVisitUrl.onExtraCallbackWithResult(), o.setVisitUrl.onExtraCallbackWithResult(), new java.lang.Object[]{onWarmupCompleted(), java.lang.Integer.valueOf(r16), r17, java.lang.Integer.valueOf(r18), java.lang.Integer.valueOf(r19)}, -386312370, 386312371, o.setVisitUrl.onExtraCallbackWithResult(), o.setVisitUrl.onExtraCallbackWithResult())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
    
        if (((java.lang.Boolean) o.TTAppOpenAdActivity6.onNavigationEvent(o.setVisitUrl.onExtraCallbackWithResult(), o.setVisitUrl.onExtraCallbackWithResult(), new java.lang.Object[]{onWarmupCompleted(), java.lang.Integer.valueOf(r16), r17, java.lang.Integer.valueOf(r18), java.lang.Integer.valueOf(r19)}, -386312370, 386312371, o.setVisitUrl.onExtraCallbackWithResult(), o.setVisitUrl.onExtraCallbackWithResult())).booleanValue() != true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        r0 = o.TTBaseLandingPageActivity.onNavigationEvent + 1;
        o.TTBaseLandingPageActivity.IAuthTabCallback = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IAuthTabCallback(int i, @NotNull byte[] bArr, int i2, int i3) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (i >= 0 && i <= onWarmupCompleted().length - i3) {
            int i5 = IAuthTabCallback;
            int i6 = i5 + 63;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (i2 >= 0 && i2 <= bArr.length - i3) {
                int i8 = i5 + 37;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 99 / 0;
                }
            }
        }
        int i10 = onNavigationEvent + 49;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 96 / 0;
        }
        return false;
    }

    public void onNavigationEvent(int i, @NotNull byte[] bArr, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        ArraysKt___ArraysJvmKt.copyInto(onWarmupCompleted(), bArr, i2, i, i3 + i);
        int i7 = onNavigationEvent + 7;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(0, tTBaseLandingPageActivity, 0, tTBaseLandingPageActivity.access100());
        int i4 = IAuthTabCallback + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iAccess100;
        TTBaseLandingPageActivity tTBaseLandingPageActivity = (TTBaseLandingPageActivity) objArr[0];
        TTBaseLandingPageActivity tTBaseLandingPageActivity2 = (TTBaseLandingPageActivity) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity2, "");
            iAccess100 = tTBaseLandingPageActivity.access100() * tTBaseLandingPageActivity2.access100();
        } else {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity2, "");
            iAccess100 = tTBaseLandingPageActivity.access100() - tTBaseLandingPageActivity2.access100();
        }
        return Boolean.valueOf(tTBaseLandingPageActivity.onExtraCallbackWithResult(iAccess100, tTBaseLandingPageActivity2, 0, tTBaseLandingPageActivity2.access100()));
    }

    public int onExtraCallback(@NotNull byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        int length = onWarmupCompleted().length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!((Boolean) TTAppOpenAdActivity6.onNavigationEvent(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{onWarmupCompleted(), Integer.valueOf(iMax), bArr, 0, Integer.valueOf(bArr.length)}, -386312370, 386312371, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).booleanValue()) {
            if (iMax == length) {
                return -1;
            }
            int i5 = onNavigationEvent + 123;
            IAuthTabCallback = i5 % 128;
            iMax = i5 % 2 != 0 ? iMax + 13 : iMax + 1;
        }
        int i6 = onNavigationEvent + 61;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 71 / 0;
        }
        return iMax;
    }

    public final int onExtraCallbackWithResult(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        int iOnWarmupCompleted = onWarmupCompleted(tTBaseLandingPageActivity.IAuthTabCallbackStub(), i);
        int i5 = onNavigationEvent + 1;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return iOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int onWarmupCompleted(@NotNull byte[] bArr, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        for (int iMin = Math.min(TTAppOpenAdActivity6.onExtraCallback(this, i), onWarmupCompleted().length - bArr.length); iMin >= 0; iMin--) {
            int i3 = IAuthTabCallback + 95;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                if (((Boolean) TTAppOpenAdActivity6.onNavigationEvent(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{onWarmupCompleted(), Integer.valueOf(iMin), bArr, 1, Integer.valueOf(bArr.length)}, -386312370, 386312371, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).booleanValue()) {
                    return iMin;
                }
            } else {
                if (((Boolean) TTAppOpenAdActivity6.onNavigationEvent(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{onWarmupCompleted(), Integer.valueOf(iMin), bArr, 0, Integer.valueOf(bArr.length)}, -386312370, 386312371, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).booleanValue()) {
                    return iMin;
                }
            }
        }
        int i4 = onNavigationEvent + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return -1;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (obj == this) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof TTBaseLandingPageActivity) {
            TTBaseLandingPageActivity tTBaseLandingPageActivity = (TTBaseLandingPageActivity) obj;
            if (tTBaseLandingPageActivity.access100() == onWarmupCompleted().length) {
                int i7 = onNavigationEvent + 3;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArrOnWarmupCompleted = onWarmupCompleted();
                if (i8 == 0 ? !(!tTBaseLandingPageActivity.IAuthTabCallback(0, bArrOnWarmupCompleted, 0, onWarmupCompleted().length)) : tTBaseLandingPageActivity.IAuthTabCallback(1, bArrOnWarmupCompleted, 0, onWarmupCompleted().length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = onExtraCallback();
            if (iOnExtraCallback == 0) {
                int iHashCode = Arrays.hashCode(onWarmupCompleted());
                onWarmupCompleted(iHashCode);
                return iHashCode;
            }
            int i3 = onNavigationEvent + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iOnExtraCallback;
        }
        onExtraCallback();
        throw null;
    }

    public int onExtraCallbackWithResult(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        int iAccess100 = access100();
        int iAccess1002 = tTBaseLandingPageActivity.access100();
        int iMin = Math.min(iAccess100, iAccess1002);
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= iMin) {
                if (iAccess100 == iAccess1002) {
                    return 0;
                }
                if (iAccess100 < iAccess1002) {
                    return -1;
                }
                int i3 = IAuthTabCallback + 23;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return 1;
                }
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i2) & 255;
            int iOnExtraCallbackWithResult2 = tTBaseLandingPageActivity.onExtraCallbackWithResult(i2) & 255;
            if (iOnExtraCallbackWithResult != iOnExtraCallbackWithResult2) {
                if (iOnExtraCallbackWithResult >= iOnExtraCallbackWithResult2) {
                    return 1;
                }
                int i4 = onNavigationEvent + 113;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return -1;
                }
                obj.hashCode();
                throw null;
            }
            int i5 = onNavigationEvent + 13;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            i2++;
        }
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int length = onWarmupCompleted().length;
            throw null;
        }
        if (onWarmupCompleted().length == 0) {
            int i3 = onNavigationEvent + 25;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return "[size=0]";
            }
            int i4 = 98 / 0;
            return "[size=0]";
        }
        int iOnExtraCallbackWithResult = TTHistoryLandingPageActivity.onExtraCallbackWithResult(onWarmupCompleted(), 64);
        if (iOnExtraCallbackWithResult != -1) {
            String strIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
            String strSubstring = strIAuthTabCallback_Parcel.substring(0, iOnExtraCallbackWithResult);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (iOnExtraCallbackWithResult >= strIAuthTabCallback_Parcel.length()) {
                return "[text=" + strReplace$default + ']';
            }
            return "[size=" + onWarmupCompleted().length + " text=" + strReplace$default + "…]";
        }
        int i5 = onNavigationEvent + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        if (onWarmupCompleted().length <= 64) {
            return "[hex=" + asInterface() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(onWarmupCompleted().length);
        sb.append(" hex=");
        int iOnExtraCallback = TTAppOpenAdActivity6.onExtraCallback(this, 64);
        if (iOnExtraCallback > onWarmupCompleted().length) {
            throw new IllegalArgumentException(("endIndex > length(" + onWarmupCompleted().length + ')').toString());
        }
        if (iOnExtraCallback < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        int i7 = IAuthTabCallback + 111;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            sb.append((iOnExtraCallback == onWarmupCompleted().length ? this : new TTBaseLandingPageActivity(ArraysKt___ArraysJvmKt.copyOfRange(onWarmupCompleted(), 0, iOnExtraCallback))).asInterface());
            sb.append("…]");
            return sb.toString();
        }
        int length2 = onWarmupCompleted().length;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final TTBaseLandingPageActivity onWarmupCompleted(@NotNull String str) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (TTBaseLandingPageActivity) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 937523353, new Object[]{str}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2, -937523350);
    }

    public static /* synthetic */ TTBaseLandingPageActivity onExtraCallbackWithResult(TTBaseLandingPageActivity tTBaseLandingPageActivity, int i, int i2, int i3, Object obj) {
        Object[] objArr = {tTBaseLandingPageActivity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (TTBaseLandingPageActivity) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1563978884, objArr, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -1563978883);
    }

    public final boolean onExtraCallback(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return ((Boolean) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1770740459, new Object[]{this, tTBaseLandingPageActivity}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2, 1770740461)).booleanValue();
    }

    public final TTBaseLandingPageActivity getInterfaceDescriptor() {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (TTBaseLandingPageActivity) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -803068074, new Object[]{this}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2, 803068074);
    }

    static void writeTypedObject() {
        onWarmupCompleted = 8011078284376481116L;
    }
}
