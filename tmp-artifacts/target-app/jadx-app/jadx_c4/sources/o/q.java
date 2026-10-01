package o;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
public final class q extends downloadZip {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackDefault = -4874565876170056709L;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Map<String, Object> onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = q.this.onExtraCallbackWithResult(false, this);
            int i4 = onNavigationEvent + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public q() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@NotNull String str) {
        this(str, null, null, null, null, 30, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@NotNull String str, @Nullable String str2) {
        this(str, str2, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this(str, str2, str3, null, null, 24, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, ? extends Object> map) {
        this(str, str2, str3, map, null, 16, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 101;
        asBinder = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 9;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 115;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, qVar.onExtraCallbackWithResult)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, qVar.IAuthTabCallback)) {
            if (Intrinsics.areEqual(this.onExtraCallback, qVar.onExtraCallback)) {
                return Intrinsics.areEqual(this.onWarmupCompleted, qVar.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, qVar.onNavigationEvent);
            }
            int i7 = IAuthTabCallbackStub + 119;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = asBinder;
        int i10 = i9 + 125;
        IAuthTabCallbackStub = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 77;
        IAuthTabCallbackStub = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 34 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        asBinder = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.onExtraCallbackWithResult.hashCode();
            str = this.IAuthTabCallback;
            iHashCode2 = 1;
            if (str != null) {
                iHashCode3 = 1;
                iHashCode2 = iHashCode3;
                iHashCode3 = str.hashCode();
            }
            int i3 = asBinder + 65;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode = this.onExtraCallbackWithResult.hashCode();
            str = this.IAuthTabCallback;
            if (str == null) {
                iHashCode2 = 0;
                int i32 = asBinder + 65;
                IAuthTabCallbackStub = i32 % 128;
                int i42 = i32 % 2;
            }
            iHashCode2 = iHashCode3;
            iHashCode3 = str.hashCode();
        }
        String str2 = this.onExtraCallback;
        if (str2 != null) {
            int i5 = IAuthTabCallbackStub + 81;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                str2.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode2 = str2.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackInfo(tag=" + this.onExtraCallbackWithResult + ", message=" + this.IAuthTabCallback + ", service=" + this.onExtraCallback + ", params=" + this.onWarmupCompleted + ", company=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallbackStub + 65;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return str;
    }

    public q(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, ? extends Object> map, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = str2;
        this.onExtraCallback = str3;
        this.onWarmupCompleted = map;
        this.onNavigationEvent = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(String str, String str2, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5 = "";
        String str6 = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackStub + 117;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                str6.hashCode();
                throw null;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i4 = 2 % 2;
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            map = access8100.onNavigationEvent();
            int i5 = asBinder + 117;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        Map map2 = map;
        if ((i & 16) != 0) {
            int i8 = asBinder + 39;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            str4 = GetFeatureExtension.onWarmupCompleted.asBinder();
            int i10 = IAuthTabCallbackStub + 37;
            asBinder = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        }
        this(str, str5, str6, map2, str4);
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = asBinder + 55;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            map = this.onWarmupCompleted;
            int i4 = 92 / 0;
        } else {
            map = this.onWarmupCompleted;
        }
        int i5 = i3 + 43;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        downloadZip.onExtraCallback(this, "info", this.onExtraCallbackWithResult, null, this.IAuthTabCallback, null, 20, null);
        int i4 = IAuthTabCallbackStub + 65;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i2 - 2147483648;
                int i3 = asBinder + 19;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        onExtraCallback onextracallback2 = onextracallback;
        Object objOnExtraCallback = onextracallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallback2.label;
        if (i5 != 0) {
            int i6 = IAuthTabCallbackStub + 29;
            int i7 = i6 % 128;
            asBinder = i7;
            int i8 = i6 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = i7 + 117;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, this.onExtraCallbackWithResult, "info", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            String str = this.onNavigationEvent;
            onextracallback2.Z$0 = z;
            onextracallback2.label = 1;
            objOnExtraCallback = onExtraCallback(onnavigationevent, mapOnNavigationEvent, true, str, z, onextracallback2);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        Map map = (Map) objOnExtraCallback;
        if (GetFeatureExtension.onWarmupCompleted.onPostMessage()) {
            int i10 = IAuthTabCallbackStub + 49;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{7841, 53880, 34589, 30924, 11753, 7870, 53839}, 52433 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            map.put(((String) objArr[0]).intern(), this.IAuthTabCallback);
        }
        String str2 = this.onExtraCallbackWithResult;
        String str3 = this.onExtraCallback;
        if (str3 == null) {
            str3 = "common";
        }
        return new AppEventPayloadV1(str2, "info", str3, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.onNavigationEvent, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, this.IAuthTabCallback, 1044432, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        long j;
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, AndroidCharacter.getMirror('0') + 19579, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackDefault ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 59, ImageFormat.getBitsPerPixel(0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $10 + 23;
                $11 = i4 % 128;
                int i5 = i4 % 2;
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
            int i6 = $10 + 85;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 59 - (ViewConfiguration.getTapTimeout() >> 16), 6383 - TextUtils.indexOf("", ""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 58 - ExpandableListView.getPackedPositionChild(j), 6383 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i7 = $11 + 87;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            j = 0;
        }
        objArr[0] = new String(cArr2);
    }
}
