package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class emitTossBundleLoader_onSendEvent {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("pollCheckMeta")
    private final DocumentWalletPollCheckMeta pollCheckMeta;

    @SerializedName("status")
    private final onExtraCallback status;

    /* JADX WARN: Multi-variable type inference failed */
    public emitTossBundleLoader_onSendEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emitTossBundleLoader_onSendEvent)) {
            int i2 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        emitTossBundleLoader_onSendEvent emittossbundleloader_onsendevent = (emitTossBundleLoader_onSendEvent) obj;
        if (this.status != emittossbundleloader_onsendevent.status) {
            int i3 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.pollCheckMeta, emittossbundleloader_onsendevent.pollCheckMeta)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = this.status;
        if (onextracallback == null) {
            int i5 = i3 + 33;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = onextracallback.hashCode();
            int i7 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        DocumentWalletPollCheckMeta documentWalletPollCheckMeta = this.pollCheckMeta;
        return (iHashCode * 31) + (documentWalletPollCheckMeta != null ? documentWalletPollCheckMeta.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletGetJoinStatusResp(status=" + this.status + ", pollCheckMeta=" + this.pollCheckMeta + ")";
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
        return str;
    }

    public emitTossBundleLoader_onSendEvent(@Nullable onExtraCallback onextracallback, @Nullable DocumentWalletPollCheckMeta documentWalletPollCheckMeta) {
        this.status = onextracallback;
        this.pollCheckMeta = documentWalletPollCheckMeta;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ emitTossBundleLoader_onSendEvent(onExtraCallback onextracallback, DocumentWalletPollCheckMeta documentWalletPollCheckMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onextracallback = null;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
            int i6 = 2 % 2;
            documentWalletPollCheckMeta = null;
        }
        this(onextracallback, documentWalletPollCheckMeta);
    }

    public final onExtraCallback onExtraCallbackWithResult() {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            onextracallback = this.status;
            int i4 = 97 / 0;
        } else {
            onextracallback = this.status;
        }
        int i5 = i3 + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    public final DocumentWalletPollCheckMeta onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        DocumentWalletPollCheckMeta documentWalletPollCheckMeta = this.pollCheckMeta;
        int i4 = i2 + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return documentWalletPollCheckMeta;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final onExtraCallback IN_PROCESS;
        public static final onExtraCallback SUCCESS;
        private static int onExtraCallback = 0;
        private static long onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {SUCCESS, IN_PROCESS};
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 53;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallback + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            a(new char[]{23939, 40386, 56605, 7494, 23689, 40160, 56361}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49222, objArr);
            SUCCESS = new onExtraCallback(((String) objArr[0]).intern(), 0);
            IN_PROCESS = new onExtraCallback("IN_PROCESS", 1);
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = IAuthTabCallback + 39;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $10 + 113;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i5 = $11 + 61;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 24 - TextUtils.getCapsMode("", 0, 0), Color.rgb(0, 0, 0) + 16796843, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() * (onExtraCallbackWithResult % 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 59, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                    int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ onExtraCallbackWithResult);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 59 - View.resolveSize(0, 0), 6384 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        static void IAuthTabCallback() {
            onExtraCallbackWithResult = 3219297593251846375L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r1 = o.emitTossBundleLoader_onSendEvent.IAuthTabCallback + 23;
        o.emitTossBundleLoader_onSendEvent.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5.status == o.emitTossBundleLoader_onSendEvent.onExtraCallback.SUCCESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r5.status == o.emitTossBundleLoader_onSendEvent.onExtraCallback.SUCCESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = o.emitTossBundleLoader_onSendEvent.IAuthTabCallback + 41;
        o.emitTossBundleLoader_onSendEvent.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean IAuthTabCallback() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.emitTossBundleLoader_onSendEvent.IAuthTabCallback
            int r1 = r1 + 43
            int r2 = r1 % 128
            o.emitTossBundleLoader_onSendEvent.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            o.emitTossBundleLoader_onSendEvent$onExtraCallback r1 = r5.status
            o.emitTossBundleLoader_onSendEvent$onExtraCallback r3 = o.emitTossBundleLoader_onSendEvent.onExtraCallback.SUCCESS
            r4 = 57
            int r4 = r4 / r2
            if (r1 != r3) goto L2a
            goto L1f
        L19:
            o.emitTossBundleLoader_onSendEvent$onExtraCallback r1 = r5.status
            o.emitTossBundleLoader_onSendEvent$onExtraCallback r3 = o.emitTossBundleLoader_onSendEvent.onExtraCallback.SUCCESS
            if (r1 != r3) goto L2a
        L1f:
            int r1 = o.emitTossBundleLoader_onSendEvent.IAuthTabCallback
            int r1 = r1 + 41
            int r2 = r1 % 128
            o.emitTossBundleLoader_onSendEvent.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r0 = 1
            return r0
        L2a:
            int r1 = o.emitTossBundleLoader_onSendEvent.IAuthTabCallback
            int r1 = r1 + 23
            int r3 = r1 % 128
            o.emitTossBundleLoader_onSendEvent.onExtraCallbackWithResult = r3
            int r1 = r1 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.emitTossBundleLoader_onSendEvent.IAuthTabCallback():boolean");
    }
}
