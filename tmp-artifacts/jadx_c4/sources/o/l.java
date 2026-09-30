package o;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.payload.AppEventPayloadV1;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DetectFaceInSingleImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class l extends downloadZip {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static long asBinder = 5137047680081192356L;
    private static int onTransact = 1;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final Throwable onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Map<String, Object> onNavigationEvent;
    private final String onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = l.this.onExtraCallbackWithResult(false, this);
            int i4 = IAuthTabCallback + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    public l() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull String str) {
        this(str, null, null, null, null, null, 62, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull String str, @Nullable String str2) {
        this(str, str2, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull String str, @Nullable String str2, @Nullable Throwable th) {
        this(str, str2, th, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull String str, @Nullable String str2, @Nullable Throwable th, @Nullable String str3) {
        this(str, str2, th, str3, null, null, 48, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull String str, @Nullable String str2, @Nullable Throwable th, @Nullable String str3, @NotNull Map<String, ? extends Object> map) {
        this(str, str2, th, str3, map, null, 32, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.l) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 61;
        o.l.IAuthTabCallbackDefault = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (o.l) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallbackStub, r6.IAuthTabCallbackStub) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = o.l.onTransact + 109;
        o.l.IAuthTabCallbackDefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r6 = o.l.IAuthTabCallbackDefault + 75;
        o.l.onTransact = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if ((r6 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        r6 = o.l.IAuthTabCallbackDefault + 77;
        o.l.onTransact = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        r6 = o.l.onTransact + 75;
        o.l.IAuthTabCallbackDefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            int i4 = 53 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.IAuthTabCallbackStub.hashCode();
        String str = this.onWarmupCompleted;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Throwable th = this.onExtraCallback;
        if (th == null) {
            int i4 = IAuthTabCallbackDefault + 35;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = th.hashCode();
        }
        String str2 = this.onExtraCallbackWithResult;
        if (str2 != null) {
            int i6 = IAuthTabCallbackDefault + 19;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = str2.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode3) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackError(tag=" + this.IAuthTabCallbackStub + ", message=" + this.onWarmupCompleted + ", cause=" + this.onExtraCallback + ", service=" + this.onExtraCallbackWithResult + ", params=" + this.onNavigationEvent + ", company=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackDefault + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public l(@NotNull String str, @Nullable String str2, @Nullable Throwable th, @Nullable String str3, @NotNull Map<String, ? extends Object> map, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.IAuthTabCallbackStub = str;
        this.onWarmupCompleted = str2;
        this.onExtraCallback = th;
        this.onExtraCallbackWithResult = str3;
        this.onNavigationEvent = map;
        this.IAuthTabCallback = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(String str, String str2, Throwable th, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7;
        Map mapOnNavigationEvent;
        String strAsBinder;
        if ((i & 1) != 0) {
            str5 = "";
            int i2 = 2 % 2;
        } else {
            str5 = str;
        }
        Object obj = null;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallbackDefault + 47;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str6 = null;
        } else {
            str6 = str2;
        }
        Throwable th2 = (i & 4) != 0 ? null : th;
        if ((i & 8) != 0) {
            int i4 = 2 % 2;
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 16) != 0) {
            int i5 = IAuthTabCallbackDefault + 101;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            mapOnNavigationEvent = access8100.onNavigationEvent();
            int i7 = 2 % 2;
        } else {
            mapOnNavigationEvent = map;
        }
        if ((i & 32) != 0) {
            int i8 = onTransact + 47;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 != 0) {
                GetFeatureExtension.onWarmupCompleted.asBinder();
                throw null;
            }
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
            int i9 = 2 % 2;
        } else {
            strAsBinder = str4;
        }
        this(str5, str6, th2, str7, mapOnNavigationEvent, strAsBinder);
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 57;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Map<String, Object> map = this.onNavigationEvent;
        int i4 = i2 + 27;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return map;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        downloadZip.onExtraCallback(this, "error", this.IAuthTabCallbackStub, null, this.onWarmupCompleted, this.onExtraCallback, 4, null);
        int i4 = IAuthTabCallbackDefault + 83;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        Object obj;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i2 = IAuthTabCallbackDefault + 91;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = ((onWarmupCompleted) access13800Var).label;
                throw null;
            }
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i4 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        Object objOnExtraCallback = onwarmupcompleted2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, this.IAuthTabCallbackStub, "error", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            String str = this.IAuthTabCallback;
            onwarmupcompleted2.Z$0 = z;
            onwarmupcompleted2.label = 1;
            objOnExtraCallback = onExtraCallback(onnavigationevent, mapOnNavigationEvent, true, str, z, onwarmupcompleted2);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        Map map = (Map) objOnExtraCallback;
        if (GetFeatureExtension.onWarmupCompleted.onPostMessage()) {
            int i6 = IAuthTabCallbackDefault + 63;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(new char[]{24830, 39127, 37026, 34947, 32886, 47185, 45104}, (Process.myTid() >> 12) + 63521, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{24830, 39127, 37026, 34947, 32886, 47185, 45104}, 63521 - (Process.myTid() >> 22), objArr2);
                obj = objArr2[0];
            }
            map.put(((String) obj).intern(), this.onWarmupCompleted);
        }
        Throwable th = this.onExtraCallback;
        if (th != null) {
            map.put("stacktrace", RawQueries.onNavigationEvent(th, 0, 0, 3, null));
            map.put("error_name", th.getClass().getName());
            if (!Intrinsics.areEqual(th.getMessage(), this.onWarmupCompleted)) {
                map.put("error_message", th.getMessage());
            }
        }
        String str2 = this.IAuthTabCallbackStub;
        String str3 = this.onExtraCallbackWithResult;
        if (str3 == null) {
            str3 = "common";
        }
        return new AppEventPayloadV1(str2, "error", str3, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.IAuthTabCallback, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, this.onWarmupCompleted, 1044432, (DefaultConstructorMarker) null);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 117;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 24 - Drawable.resolveOpacity(0, 0), TextUtils.getOffsetAfter("", 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (asBinder ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 59 - (ViewConfiguration.getScrollBarSize() >> 8), 6383 - Drawable.resolveOpacity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 55;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 59, 6384 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }
}
