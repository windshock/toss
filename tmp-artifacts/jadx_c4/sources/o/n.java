package o;

import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
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
public final class n extends downloadZip {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static long asBinder = 1309802008136536842L;
    private static int asInterface;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Map<String, Object> onNavigationEvent;
    private final String onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = n.this.onExtraCallbackWithResult(false, this);
            int i4 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
    }

    public n() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@NotNull String str) {
        this(str, null, null, null, null, 30, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@NotNull String str, @Nullable String str2) {
        this(str, str2, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this(str, str2, str3, null, null, 24, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, ? extends Object> map) {
        this(str, str2, str3, map, null, 16, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.n) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (o.n) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r6 = o.n.asInterface + 45;
        o.n.IAuthTabCallbackDefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback)) == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r6 = o.n.IAuthTabCallbackDefault + 1;
        o.n.asInterface = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        return false;
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
        int i2 = asInterface + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        String str = this.onExtraCallback;
        int i2 = 0;
        if (str == null) {
            int i3 = IAuthTabCallbackDefault + 99;
            asInterface = i3 % 128;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.IAuthTabCallback;
        if (str2 != null) {
            int i4 = IAuthTabCallbackDefault + 39;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int iHashCode3 = str2.hashCode();
            if (i5 != 0) {
                int i6 = 39 / 0;
            }
            i2 = iHashCode3;
        }
        return (((((((iHashCode2 * 31) + iHashCode) * 31) + i2) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackDebug(tag=" + this.onExtraCallbackWithResult + ", message=" + this.onExtraCallback + ", service=" + this.IAuthTabCallback + ", params=" + this.onNavigationEvent + ", company=" + this.onWarmupCompleted + ")";
        int i2 = asInterface + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public n(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, ? extends Object> map, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onExtraCallbackWithResult = str;
        this.onExtraCallback = str2;
        this.IAuthTabCallback = str3;
        this.onNavigationEvent = map;
        this.onWarmupCompleted = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(String str, String str2, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5 = "";
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallbackDefault + 103;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } else {
            str5 = str2;
        }
        String str6 = (i & 4) != 0 ? null : str3;
        Map mapOnNavigationEvent = (i & 8) != 0 ? access8100.onNavigationEvent() : map;
        if ((i & 16) != 0) {
            int i6 = asInterface + 25;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            str4 = GetFeatureExtension.onWarmupCompleted.asBinder();
        }
        this(str, str5, str6, mapOnNavigationEvent, str4);
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 39;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Map<String, Object> map = this.onNavigationEvent;
        int i4 = i2 + 65;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        downloadZip.onExtraCallback(this, "debug", this.onExtraCallbackWithResult, null, this.onExtraCallback, null, 20, null);
        int i4 = asInterface + 67;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            int i2 = asInterface + 125;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = ((onExtraCallback) access13800Var).label;
                throw null;
            }
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = asInterface + 101;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                onextracallback.label = i4 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        onExtraCallback onextracallback2 = onextracallback;
        Object objOnExtraCallback = onextracallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallback2.label;
        if (i7 != 0) {
            int i8 = asInterface + 51;
            int i9 = i8 % 128;
            IAuthTabCallbackDefault = i9;
            int i10 = i8 % 2;
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = i9 + 109;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, this.onExtraCallbackWithResult, "debug", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            String str = this.onWarmupCompleted;
            onextracallback2.Z$0 = z;
            onextracallback2.label = 1;
            objOnExtraCallback = onExtraCallback(onnavigationevent, mapOnNavigationEvent, false, str, z, onextracallback2);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        Map map = (Map) objOnExtraCallback;
        if (GetFeatureExtension.onWarmupCompleted.onPostMessage()) {
            int i13 = asInterface + 55;
            IAuthTabCallbackDefault = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{35608, 35701, 29917, 23742, 9909, 28110, 30410, 5551, 11105, 38087, 55028}, (-1) - TextUtils.lastIndexOf("", '0', 0), objArr);
            map.put(((String) objArr[0]).intern(), this.onExtraCallback);
        }
        String str2 = this.onExtraCallbackWithResult;
        String str3 = this.IAuthTabCallback;
        if (str3 == null) {
            str3 = "common";
        }
        return new AppEventPayloadV1(str2, "debug", str3, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.onWarmupCompleted, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, this.onExtraCallback, 1044432, (DefaultConstructorMarker) null);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asBinder ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 99;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 3;
        }
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 5;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45812), 84 - (ViewConfiguration.getWindowTouchSlop() >> 8), 21281 - AndroidCharacter.getMirror('0'), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 14185), 19 - View.MeasureSpec.getMode(0), 8808 - Drawable.resolveOpacity(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}
