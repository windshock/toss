package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.LifecycleEventObserver;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.gson.JsonObject;
import com.tmoney.LiveCheckConstants;
import im.toss.core.webkit.bridge.PlayNotificationSoundHandler$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFaceYuvToByteArray implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private static char[] onExtraCallbackWithResult = {51244, 64981, 64986, 64965, 64966, 64961, 51245, 51242, 64960, 64991, 64967, 51240, 64982, 64978, 51243, 64977};
    private static char onExtraCallback = 51245;

    public static /* synthetic */ void onExtraCallback(ExoPlayer exoPlayer, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(exoPlayer, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ExoPlayer exoPlayer) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(exoPlayer);
        int i4 = onWarmupCompleted + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(getFaceYuvToByteArray getfaceyuvtobytearray, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getfaceyuvtobytearray.onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            super.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super.onExtraCallback();
        int i3 = onWarmupCompleted + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onNavigationEvent + 9;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            super.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i3 = onNavigationEvent + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onWarmupCompleted(str);
        }
        super.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onNavigationEvent + 31;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{5, 6, 13910}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 96), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a(new char[]{0, 3, '\r', 7, 14, '\t', 13893}, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 70), 7 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{5, 1, '\n', '\t', 13869}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45), View.combineMeasuredStates(0, 0) + 5, objArr3);
        boolean z = Boolean.parseBoolean(settext.onNavigationEvent(strIntern, ((String) objArr3[0]).intern()));
        if (!StringsKt.isBlank(strOnNavigationEvent)) {
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, strOnNavigationEvent, z);
                return;
            }
            onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, strOnNavigationEvent, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            int i3 = onNavigationEvent + 115;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
                int i4 = 89 / 0;
            } else {
                onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            }
        }
        int i5 = onNavigationEvent + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit IAuthTabCallback(ExoPlayer exoPlayer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exoPlayer, "");
        exoPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(5).build(), false);
        exoPlayer.setPlayWhenReady(true);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return unit;
    }

    private static final void onNavigationEvent(ExoPlayer exoPlayer, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult2 = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY;
            throw null;
        }
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY) {
            exoPlayer.release();
        }
        int i3 = onWarmupCompleted + 21;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted implements Player.Listener {
        final /* synthetic */ TextFieldKeyInputExternalSyntheticLambda9 IAuthTabCallback;
        final /* synthetic */ getFaceYuvToByteArray IAuthTabCallbackStub;
        final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ onExtraCallback;
        final /* synthetic */ boolean onExtraCallbackWithResult;
        final /* synthetic */ ExoPlayer onNavigationEvent;
        final /* synthetic */ LifecycleEventObserver onWarmupCompleted;
        private static final byte[] $$a = {79, -25, -14, 102};
        private static final int $$b = 83;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int getInterfaceDescriptor = 1;
        private static long IAuthTabCallbackDefault = 7798559133331975163L;
        private static int asBinder = -1776194565;
        private static char onTransact = 5970;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, int i, byte b2) {
            int i2;
            int i3;
            int i4 = 3 - (b * 3);
            int i5 = 110 - b2;
            int i6 = (i * 2) + 1;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                i3 = i4;
                int i7 = i6;
                i2 = 0;
                i4 += -i7;
                bArr2[i2] = (byte) i4;
                i2++;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                i3++;
                i7 = bArr[i3];
                i4 += -i7;
                bArr2[i2] = (byte) i4;
                i2++;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                i3 = i4;
                i4 = i5;
                bArr2[i2] = (byte) i4;
                i2++;
                if (i2 == i6) {
                }
            }
        }

        onWarmupCompleted(boolean z, getFaceYuvToByteArray getfaceyuvtobytearray, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9, LifecycleEventObserver lifecycleEventObserver, ExoPlayer exoPlayer) {
            this.onExtraCallbackWithResult = z;
            this.IAuthTabCallbackStub = getfaceyuvtobytearray;
            this.onExtraCallback = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
            this.IAuthTabCallback = textFieldKeyInputExternalSyntheticLambda9;
            this.onWarmupCompleted = lifecycleEventObserver;
            this.onNavigationEvent = exoPlayer;
        }

        public void onPlaybackStateChanged(int i) {
            int i2 = 2 % 2;
            int i3 = asInterface + 43;
            int i4 = i3 % 128;
            getInterfaceDescriptor = i4;
            if (i3 % 2 != 0 ? i == 3 : i == 3) {
                if (this.onExtraCallbackWithResult) {
                    int i5 = i4 + 33;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    getFaceYuvToByteArray.onNavigationEvent(this.IAuthTabCallbackStub, this.onExtraCallback);
                    return;
                }
                return;
            }
            if (i == 4) {
                int i7 = i4 + 69;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    IAuthTabCallback();
                } else {
                    IAuthTabCallback();
                    int i8 = 49 / 0;
                }
            }
        }

        private final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 7;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                this.IAuthTabCallback.onExtraCallbackWithResult(this.onWarmupCompleted);
                this.onNavigationEvent.release();
            } else {
                this.IAuthTabCallback.onExtraCallbackWithResult(this.onWarmupCompleted);
                this.onNavigationEvent.release();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public void onPlayerError(PlaybackException playbackException) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 57;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(playbackException, "");
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31626), (Process.getThreadPriority(0) + 20) >> 6, new char[]{62366, 38163, 10282, 42701, 28950, 41234, 47909, 33924, 62708, 8347, 4515, 61594, 23701, 57568, 28899, 33899, 26938, 18994, 17571, 44460, 42785, 58019, 25054, 59680, 45670, 45761, 44662, 58519}, new char[]{0, 0, 0, 0}, new char[]{26536, 10585, 35380, 53627}, objArr);
            convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr[0]).intern(), playbackException);
            IAuthTabCallback();
            int i4 = asInterface + 31;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $10 + 103;
                $11 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 42, Process.getGidForName("") + 1452, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 44, TextUtils.indexOf("", "") + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 50 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45847), 29 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackDefault ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i6 = $11 + 45;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }
    }

    private final void onExtraCallbackWithResult(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, boolean z) {
        Context context;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            int i3 = 45 / 0;
            if (context == null) {
                return;
            }
        } else {
            context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            if (context == null) {
                return;
            }
        }
        Context context2 = context;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getLifecycle();
        ExoPlayer exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(CommonModule_setSecureScreen.onWarmupCompleted, context2, str, (LoadControl) null, (Function1) null, new PlayNotificationSoundHandler$.ExternalSyntheticLambda0(), 12, (Object) null);
        PlayNotificationSoundHandler$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new PlayNotificationSoundHandler$.ExternalSyntheticLambda1(exoPlayerIAuthTabCallback);
        lifecycle.IAuthTabCallback(externalSyntheticLambda1);
        exoPlayerIAuthTabCallback.addListener(new onWarmupCompleted(z, this, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, lifecycle, externalSyntheticLambda1, exoPlayerIAuthTabCallback));
        exoPlayerIAuthTabCallback.prepare();
        int i4 = onNavigationEvent + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    private final void onExtraCallbackWithResult(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            minFresh.onWarmupCompleted(context, new long[]{0, 600}, (int[]) null, 2, (Object) null);
        }
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 95;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 26 - View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionChild(j) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 16777242 + Color.rgb(0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $10 + 55;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                i2 = i + 96;
                cArr4[i2] = (char) (cArr[i2] / b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            int i8 = $10 + 1;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i10 = $10 + 105;
                $11 = i10 % 128;
                int i11 = i10 % 2;
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
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24825 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 73 - Process.getGidForName(""), 8088 - KeyEvent.normalizeMetaState(0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 30, 19488 - ExpandableListView.getPackedPositionGroup(0L), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i13 = $10 + 91;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        } else {
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
