package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.MimeTypeMap;
import android.widget.ExpandableListView;
import androidx.core.content.FileProvider;
import com.google.gson.JsonObject;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class X509CertificateStructure implements ALCFaceQuality {
    private static short[] IAuthTabCallbackDefault;
    private static final byte[] $$a = {106, -23, 12, Byte.MIN_VALUE};
    private static final int $$b = 52;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static long onWarmupCompleted = -7586121782004689505L;
    private static int onNavigationEvent = -901560878;
    private static int IAuthTabCallback = -1538795495;
    private static int onExtraCallbackWithResult = -190120173;
    private static byte[] onExtraCallback = {10, -64, 52, 51, -126, 50, -103, 51, -122, 54, 62, -103, -8, -50, -115, -125, 73, 50, 33, -2, -114, -58, 126, -60, -34, -116, -16, -23, 39, 57, -5, -38, 50, -64, 48, -1, -111, -1, -84, -111, -29, -83, -1, -11, Byte.MAX_VALUE, 115, -24, Byte.MAX_VALUE, -69, -104, -19, 123, -24, -19, Byte.MAX_VALUE, -23, 123};

    static final class onExtraCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return X509CertificateStructure.onNavigationEvent(X509CertificateStructure.this, null, null, this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return X509CertificateStructure.onExtraCallback(X509CertificateStructure.this, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, int r8) {
        /*
            byte[] r0 = o.X509CertificateStructure.$$a
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r6 = r6 * 4
            int r6 = r6 + 115
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.X509CertificateStructure.$$c(short, byte, int):java.lang.String");
    }

    public static final /* synthetic */ String IAuthTabCallback(X509CertificateStructure x509CertificateStructure, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return x509CertificateStructure.onNavigationEvent(str);
        }
        x509CertificateStructure.onNavigationEvent(str);
        throw null;
    }

    public static final /* synthetic */ File onExtraCallback(X509CertificateStructure x509CertificateStructure, File file, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        File fileOnWarmupCompleted = x509CertificateStructure.onWarmupCompleted(file, str);
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        int i5 = asBinder + 35;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return fileOnWarmupCompleted;
    }

    public static final /* synthetic */ Object onExtraCallback(X509CertificateStructure x509CertificateStructure, Context context, String str, String str2, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = x509CertificateStructure.onExtraCallback(context, str, str2, access13800Var);
        int i4 = asInterface + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public static final /* synthetic */ Object onNavigationEvent(X509CertificateStructure x509CertificateStructure, Context context, String str, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = x509CertificateStructure.IAuthTabCallback(context, str, access13800Var);
        int i4 = asInterface + 91;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = asBinder + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asInterface + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = asInterface + 1;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = asInterface + 11;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 13 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = asInterface + 111;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 69;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = asInterface + 103;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 17;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 3;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 13;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 24 - TextUtils.getOffsetBefore("", 0), 19627 - Color.blue(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (onWarmupCompleted | 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 59 - Drawable.resolveOpacity(0, 0), 6383 - (ViewConfiguration.getScrollBarSize() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "", 0) + 24, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), View.getDefaultSize(0, 0) + 59, TextUtils.indexOf((CharSequence) "", '0', 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            return;
        }
        Object[] objArr = new Object[1];
        a(new char[]{20700, 354, 62362, 42029, 5697}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20899, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object obj = null;
        if (strOnNavigationEvent.length() <= 0) {
            int i2 = asBinder + 89;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            str2 = null;
        } else {
            str2 = strOnNavigationEvent;
        }
        Object[] objArr2 = new Object[1];
        b((byte) ((-93) - (Process.myPid() >> 22)), (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 41), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1845796295, TextUtils.getOffsetBefore("", 0) - 18, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1357719215, objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        if (strOnNavigationEvent2.length() <= 0) {
            int i4 = asInterface + 23;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str3 = null;
        } else {
            str3 = strOnNavigationEvent2;
        }
        Object[] objArr3 = new Object[1];
        b((byte) (KeyEvent.normalizeMetaState(0) + 52), (short) ((-8) - Color.argb(0, 0, 0, 0)), (-1845796288) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-18) - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0, 0) - 1357719218, objArr3);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        if (strOnNavigationEvent3.length() <= 0) {
            int i5 = asBinder + 77;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            strOnNavigationEvent3 = null;
        }
        Object[] objArr4 = new Object[1];
        a(new char[]{20686, 26712, 8694, 63750, 45698, 18996, 851, 56546}, 14489 - Color.blue(0), objArr4);
        String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        if (strOnNavigationEvent4.length() <= 0) {
            strOnNavigationEvent4 = null;
        }
        Object[] objArr5 = new Object[1];
        a(new char[]{20686, 50496, 31686, 36942, 1768, 47948, 53722, 17998}, (Process.myPid() >> 22) + 38273, objArr5);
        String strOnNavigationEvent5 = settext.onNavigationEvent(((String) objArr5[0]).intern(), "");
        String str5 = strOnNavigationEvent5.length() <= 0 ? null : strOnNavigationEvent5;
        Object[] objArr6 = new Object[1];
        b((byte) (TextUtils.indexOf("", "", 0, 0) - 36), (short) (KeyEvent.normalizeMetaState(0) + 56), (-1845796279) - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) - 17, KeyEvent.keyCodeFromString("") - 1357719209, objArr6);
        String strOnNavigationEvent6 = settext.onNavigationEvent(((String) objArr6[0]).intern(), "");
        if (strOnNavigationEvent6.length() <= 0) {
            int i7 = asInterface + 11;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            str4 = null;
        } else {
            str4 = strOnNavigationEvent6;
        }
        Object[] objArr7 = new Object[1];
        a(new char[]{20699, 6296, 49264, 34849, 29077, 14690, 57651, 43689, 4709, 55859, 33695, 19325, 13094, 64668, 42108}, 18516 - TextUtils.lastIndexOf("", '0', 0, 0), objArr7);
        String strOnNavigationEvent7 = settext.onNavigationEvent(((String) objArr7[0]).intern(), "");
        String str6 = strOnNavigationEvent7.length() <= 0 ? null : strOnNavigationEvent7;
        Object[] objArr8 = new Object[1];
        b((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 53), (short) (83 - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf("", "", 0) - 1845796271, (ViewConfiguration.getTapTimeout() >> 16) - 18, (ViewConfiguration.getLongPressTimeout() >> 16) - 1357719209, objArr8);
        String strOnNavigationEvent8 = settext.onNavigationEvent(((String) objArr8[0]).intern(), "");
        if (strOnNavigationEvent8.length() <= 0) {
            strOnNavigationEvent8 = null;
        }
        if (strOnNavigationEvent4 != null) {
            int i9 = asBinder + 51;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            if (str5 != null) {
                onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, context, str2, strOnNavigationEvent4, str5, setonoutofmemeryerrorcallback);
                return;
            }
        }
        if (str3 == null) {
            int i10 = asBinder + 87;
            asInterface = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (strOnNavigationEvent3 == null) {
                Object[] objArr9 = new Object[1];
                a(new char[]{20714, 50256, 31218, 60677, 724, 46646, 11079, 16634, 62563, 27014, 40233, 12976, 42908, 56162, 28804, 58389, 6648, 36550, 8795, 22524, 51971, 24750, 37910, 2392, 48884, 53878, 18398, 64292, 4190, 34262, 14650, 44687, 49725, 30643, 60618, '#'}, 38040 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr9);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr9[0]).intern(), (String) null, (Map) null, 6, (Object) null);
            }
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(strOnNavigationEvent3, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, this, context, str4, str6, strOnNavigationEvent8, str2, str3, settext, setonoutofmemeryerrorcallback, (access13800) null), 3, (Object) null);
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Uri>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fileData;
        final /* synthetic */ String $fileName;
        int label;
        final /* synthetic */ X509CertificateStructure this$0;
        private static final byte[] $$a = {66, -42, -1, 80};
        private static final int $$b = 181;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onExtraCallback = 1;
        private static char[] onExtraCallbackWithResult = {60850, 12609, 21568, 31557, 40535, 34061, 23027, 15610, 5110, 63166, 54774, 43241, 36778, 25257, 16832, 9427, 64457, 57035, 48591, 37059, 30605, 19086, 10672, 3251, 58300, 50865, 42416, 30883, 24554, 13033, 4507, 62616, 52108, 44689, 36233, 24707, 18381, 6862, 63845, 56447, 45934, 38518, 29986, 18533, 12133, 636, 57693, 50243, 39758, 32343, 23884, 12355};
        private static long onNavigationEvent = -608167498772303576L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r5, short r6, byte r7) {
            /*
                int r5 = r5 * 2
                int r5 = 97 - r5
                byte[] r0 = o.X509CertificateStructure.onNavigationEvent.$$a
                int r6 = r6 + 4
                int r7 = r7 * 2
                int r1 = r7 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r5
                r5 = r7
                r3 = r2
                goto L27
            L15:
                r3 = r2
            L16:
                int r6 = r6 + 1
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L23:
                int r3 = r3 + 1
                r4 = r0[r6]
            L27:
                int r5 = r5 + r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.X509CertificateStructure.onNavigationEvent.$$c(byte, short, byte):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Context context, X509CertificateStructure x509CertificateStructure, String str, String str2, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.this$0 = x509CertificateStructure;
            this.$fileName = str;
            this.$fileData = str2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$context, this.this$0, this.$fileName, this.$fileData, access13800Var);
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Uri> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Uri> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i4 = $10 + 55;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i6 = $11 + 111;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i - i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 59697), Color.argb(0, 0, 0, 0) + 17, (ViewConfiguration.getScrollBarSize() >> 8) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 46134), TextUtils.getCapsMode("", 0, 0) + 31, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            char mode = (char) (49123 - View.MeasureSpec.getMode(0));
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 45;
                            int iResolveSizeAndState = 1494 - View.resolveSizeAndState(0, 0, 0);
                            byte b = $$a[2];
                            byte b2 = (byte) (b + 1);
                            byte b3 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, iIndexOf, iResolveSizeAndState, -1657859959, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    Object[] objArr5 = {Integer.valueOf(onExtraCallbackWithResult[i + i8])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Process.getGidForName("") + 18, 10974 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 46134), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49123);
                        int iResolveSize = 44 - View.resolveSize(0, 0);
                        int maxKeyCode = 1494 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b4 = $$a[2];
                        byte b5 = (byte) (b4 + 1);
                        byte b6 = b4;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarFadeDuration, iResolveSize, maxKeyCode, -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    char cBlue = (char) (Color.blue(0) + 49123);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                    int i9 = 1494 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b7 = $$a[2];
                    byte b8 = (byte) (b7 + 1);
                    byte b9 = b7;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cBlue, doubleTapTimeout, i9, -1657859959, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
            }
            String str = new String(cArr);
            int i10 = $11 + 81;
            $10 = i10 % 128;
            if (i10 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i11 = 9 / 0;
                objArr[0] = str;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, 47 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26810), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            File cacheDir = this.$context.getCacheDir();
            Object[] objArr2 = new Object[1];
            a(ExpandableListView.getPackedPositionChild(0L) + 1, 5 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), objArr2);
            File file = new File(cacheDir, ((String) objArr2[0]).intern());
            file.mkdirs();
            File fileOnExtraCallback = X509CertificateStructure.onExtraCallback(this.this$0, file, this.$fileName);
            byte[] bytes = this.$fileData.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Cookies_clearByName.onWarmupCompleted(Base64.decode(bytes, 0), fileOnExtraCallback);
            Uri uriForFile = FileProvider.getUriForFile(this.$context, zzaj.onNavigationEvent().onUnminimized(), fileOnExtraCallback);
            int i4 = onExtraCallback + 7;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
            }
            return uriForFile;
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static final byte[] $$a = {105, -91, -115, 31};
        private static final int $$b = 94;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 478308977;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ $contentOwner;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fileData;
        final /* synthetic */ String $fileName;
        final /* synthetic */ String $title;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r7, int r8, int r9) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r9 = r9 * 2
                int r9 = 105 - r9
                byte[] r0 = o.X509CertificateStructure.IAuthTabCallbackStub.$$a
                int r8 = r8 * 2
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r9 = r7
                r3 = r8
                r4 = r2
                goto L2a
            L17:
                r3 = r2
                r6 = r9
                r9 = r7
                r7 = r6
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L28:
                r3 = r0[r9]
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                int r9 = r9 + 1
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.X509CertificateStructure.IAuthTabCallbackStub.$$c(int, int, int):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(Context context, String str, String str2, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str3, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$fileName = str;
            this.$fileData = str2;
            this.$contentOwner = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
            this.$title = str3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = X509CertificateStructure.this.new IAuthTabCallbackStub(this.$context, this.$fileName, this.$fileData, this.$contentOwner, this.$callbackProxy, this.$title, access13800Var);
            int i2 = IAuthTabCallback + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01d7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r24, int r25, char[] r26, boolean r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 481
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.X509CertificateStructure.IAuthTabCallbackStub.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[PHI: r2
          0x0082: PHI (r2v36 java.lang.Object) = (r2v14 java.lang.Object), (r2v38 java.lang.Object) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r6
          0x0028: PHI (r6v2 int) = (r6v1 int), (r6v13 int) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 805
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.X509CertificateStructure.IAuthTabCallbackStub.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void onExtraCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Context context, String str, String str2, String str3, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(context, str2, str3, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, str, null), 3, (Object) null);
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Uri>, Object> {
        private static short[] onExtraCallback;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $data;
        int label;
        final /* synthetic */ X509CertificateStructure this$0;
        private static final byte[] $$a = {57, 126, 65, 8};
        private static final int $$b = 198;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int asBinder = 1;
        private static int onExtraCallbackWithResult = 306639116;
        private static int onWarmupCompleted = -1538795454;
        private static int IAuthTabCallback = -1539803430;
        private static byte[] onNavigationEvent = {-120, 120, 112, 110, 126, 29, 17, 41, 7, 55, -9, 6, 36, 28, 56, -13, 19, 23, 62, -56, -51, 1, -122, -108, -124, -98, -107, -100, -110, -85, -46, 71, -125, -86, -127, -26, -104, 81, -103, -101, -104, -105, -108, -47, -106, 90, -126, -110, -88, -112, -110, -47, -104, 81, -121, -121, -111, -83, -126, -22, -106, 64, -102, -29, 67, -97, -86, -99, 8, 8, 8, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, short r7, short r8) {
            /*
                int r7 = r7 * 4
                int r7 = r7 + 115
                int r6 = r6 * 3
                int r6 = 1 - r6
                int r8 = r8 * 2
                int r8 = 4 - r8
                byte[] r0 = o.X509CertificateStructure.IAuthTabCallback.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r6
                r4 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r8]
            L26:
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.X509CertificateStructure.IAuthTabCallback.$$c(short, short, short):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Context context, X509CertificateStructure x509CertificateStructure, String str, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.this$0 = x509CertificateStructure;
            this.$data = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$context, this.this$0, this.$data, access13800Var);
            int i2 = asBinder + 25;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 115;
            asInterface = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Uri> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Uri> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 53;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                iAuthTabCallbackCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(unit);
            int i4 = asInterface + 111;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 23;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a((short) (105 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 1241437970, 20929 - AndroidCharacter.getMirror('0'), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 27, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            File cacheDir = this.$context.getCacheDir();
            Object[] objArr2 = new Object[1];
            a((short) (View.MeasureSpec.makeMeasureSpec(0, 0) - 114), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.normalizeMetaState(0) + 1241437948, (-8367721) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 67, objArr2);
            File file = new File(cacheDir, ((String) objArr2[0]).intern());
            file.mkdirs();
            X509CertificateStructure x509CertificateStructure = this.this$0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            a((short) ((-27) - View.MeasureSpec.getMode(0)), (byte) (ViewConfiguration.getTouchSlop() >> 8), 1241437953 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-8367743) - ExpandableListView.getPackedPositionChild(0L), TextUtils.indexOf("", "") - 59, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(jCurrentTimeMillis);
            Object[] objArr4 = new Object[1];
            a((short) (58 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 1241437967 - (Process.myPid() >> 22), (-8367780) - (ViewConfiguration.getTouchSlop() >> 8), (-70) - KeyEvent.normalizeMetaState(0), objArr4);
            sb.append(((String) objArr4[0]).intern());
            File fileOnExtraCallback = X509CertificateStructure.onExtraCallback(x509CertificateStructure, file, sb.toString());
            byte[] bytes = this.$data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Cookies_clearByName.onWarmupCompleted(Base64.decode(bytes, 0), fileOnExtraCallback);
            Uri uriForFile = FileProvider.getUriForFile(this.$context, zzaj.onNavigationEvent().onUnminimized(), fileOnExtraCallback);
            int i4 = asInterface + 61;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
            }
            return uriForFile;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            int i5 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 43424), 42 - View.combineMeasuredStates(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    byte[] bArr = onNavigationEvent;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i6 = $10 + 11;
                        $11 = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 3 % 2;
                        }
                        for (int i8 = 0; i8 < length; i8++) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 12843), View.getDefaultSize(0, 0) + 55, 2167 - (ViewConfiguration.getTouchSlop() >> 8), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i9 = $11 + 97;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        byte[] bArr3 = onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 43424), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, 22439 - TextUtils.getOffsetAfter("", 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    int i11 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j));
                    if (z) {
                        i4 = 1;
                    } else {
                        int i12 = $10 + 95;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 4 / 4;
                        }
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i4;
                    try {
                        Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 86 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        byte[] bArr4 = onNavigationEvent;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i14 = 0; i14 < length2; i14++) {
                                int i15 = $11 + 75;
                                $10 = i15 % 128;
                                if (i15 % 2 != 0) {
                                    bArr5[i14] = (byte) (bArr4[i14] - (-4629411779493505016L));
                                } else {
                                    bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                                }
                            }
                            bArr4 = bArr5;
                        }
                        boolean z2 = bArr4 != null;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            int i16 = $11 + 93;
                            $10 = i16 % 128;
                            if (i16 % 2 != 0) {
                                throw null;
                            }
                            if (z2) {
                                byte[] bArr6 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                short[] sArr = onExtraCallback;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                            int i17 = $10 + 23;
                            $11 = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i18 = 5 / 3;
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(android.content.Context r7, java.lang.String r8, o.access13800<? super android.net.Uri> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.X509CertificateStructure.asBinder
            int r1 = r1 + 49
            int r2 = r1 % 128
            o.X509CertificateStructure.asInterface = r2
            int r1 = r1 % r0
            boolean r1 = r9 instanceof o.X509CertificateStructure.onExtraCallback
            if (r1 == 0) goto L1f
            r1 = r9
            o.X509CertificateStructure$onExtraCallback r1 = (o.X509CertificateStructure.onExtraCallback) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.label = r2
            goto L24
        L1f:
            o.X509CertificateStructure$onExtraCallback r1 = new o.X509CertificateStructure$onExtraCallback
            r1.<init>(r9)
        L24:
            java.lang.Object r9 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L69
            if (r3 != r4) goto L46
            int r7 = o.X509CertificateStructure.asInterface
            int r7 = r7 + 65
            int r8 = r7 % 128
            o.X509CertificateStructure.asBinder = r8
            int r7 = r7 % r0
            java.lang.Object r7 = r1.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r1.L$0
            android.content.Context r7 = (android.content.Context) r7
            kotlin.ResultKt.onNavigationEvent(r9)
            goto L94
        L46:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r8 = 47
            char[] r8 = new char[r8]
            r8 = {x009a: FILL_ARRAY_DATA , data: [20683, 32584, 4038, -8633, -4468, -17063, 19905, 7183, 11399, -1197, -29753, 23120, 27345, 14664, -13885, -26624, -22376, 30555, 2015, -10659, -6445, -19121, 17883, 5151, 9367, -3240, -31780, 21061, 25307, 12638, -15917, -28656, -24408, 20350, 8163, 11903, -284, -29395, 24045, 27744, 15602, -13458, -25609, -21897, 31469, 2411, -9757} // fill-array
            int r9 = android.view.ViewConfiguration.getScrollBarSize()
            int r9 = r9 >> 8
            int r9 = r9 + 12161
            java.lang.Object[] r0 = new java.lang.Object[r4]
            a(r8, r9, r0)
            r8 = 0
            r8 = r0[r8]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            r7.<init>(r8)
            throw r7
        L69:
            kotlin.ResultKt.onNavigationEvent(r9)
            o.GeckoHubImp r9 = o.putChannelInfo.IAuthTabCallback()
            o.X509CertificateStructure$IAuthTabCallback r3 = new o.X509CertificateStructure$IAuthTabCallback
            r5 = 0
            r3.<init>(r7, r6, r8, r5)
            java.lang.Object r7 = o.access15400.onNavigationEvent(r7)
            r1.L$0 = r7
            java.lang.Object r7 = o.access15400.onNavigationEvent(r8)
            r1.L$1 = r7
            r1.label = r4
            java.lang.Object r9 = o.maybeUpdateAnimatable.onExtraCallback(r9, r3, r1)
            if (r9 != r2) goto L94
            int r7 = o.X509CertificateStructure.asBinder
            int r7 = r7 + 91
            int r8 = r7 % 128
            o.X509CertificateStructure.asInterface = r8
            int r7 = r7 % r0
            return r2
        L94:
            java.lang.String r7 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.X509CertificateStructure.IAuthTabCallback(android.content.Context, java.lang.String, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(android.content.Context r12, java.lang.String r13, java.lang.String r14, o.access13800<? super android.net.Uri> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.X509CertificateStructure.onExtraCallback(android.content.Context, java.lang.String, java.lang.String, o.access13800):java.lang.Object");
    }

    private final String onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strSubstringAfterLast = StringsKt.substringAfterLast(str, '.', "");
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = strSubstringAfterLast.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
        int i4 = asBinder + 17;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return mimeTypeFromExtension;
    }

    private final File onWarmupCompleted(File file, String str) throws Throwable {
        int i = 2 % 2;
        File file2 = new File(file, new File(str).getName());
        Intrinsics.checkNotNull(file2.getCanonicalPath());
        Intrinsics.checkNotNullExpressionValue(file.getCanonicalPath(), "");
        Object obj = null;
        if (!StringsKt.startsWith$default(r12, r11, false, 2, (Object) null)) {
            Object[] objArr = new Object[1];
            b((byte) ((ViewConfiguration.getTapTimeout() >> 16) + 94), (short) (28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-1845796314) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf("", "") - 18, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1357719254, objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        int i2 = asBinder;
        int i3 = i2 + 97;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r27, short r28, int r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.X509CertificateStructure.b(byte, short, int, int, int, java.lang.Object[]):void");
    }
}
