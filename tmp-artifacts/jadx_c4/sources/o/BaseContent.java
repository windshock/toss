package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.util.TypedValue;
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
public final class BaseContent extends downloadZip {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static long onWarmupCompleted = -9011318644029878895L;
    private final Map<String, Object> IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseContent.this.onExtraCallbackWithResult(false, this);
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 33;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 41;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof BaseContent)) {
            int i7 = i2 + 61;
            IAuthTabCallbackStub = i7 % 128;
            return i7 % 2 == 0;
        }
        BaseContent baseContent = (BaseContent) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, baseContent.onExtraCallbackWithResult)) {
            int i8 = IAuthTabCallbackStub + 85;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, baseContent.onExtraCallback)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onNavigationEvent, baseContent.onNavigationEvent))) {
            return Intrinsics.areEqual(this.IAuthTabCallback, baseContent.IAuthTabCallback);
        }
        int i9 = asInterface + 111;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        String str = this.onExtraCallback;
        if (str == null) {
            int i2 = asInterface + 125;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.onNavigationEvent;
        int iHashCode3 = (((((iHashCode2 * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = IAuthTabCallbackStub + 63;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode3;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackAssert(tag=" + this.onExtraCallbackWithResult + ", message=" + this.onExtraCallback + ", service=" + this.onNavigationEvent + ", params=" + this.IAuthTabCallback + ")";
        int i2 = asInterface + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseContent(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallbackWithResult = str;
        this.onExtraCallback = str2;
        this.onNavigationEvent = str3;
        this.IAuthTabCallback = map;
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.IAuthTabCallback;
        int i5 = i3 + 23;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        downloadZip.onExtraCallback(this, "assert", this.onExtraCallbackWithResult, null, this.onExtraCallback, null, 20, null);
        int i4 = IAuthTabCallbackStub + 95;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z2 = access13800Var instanceof IAuthTabCallback;
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i3 = iAuthTabCallback.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i3 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object objIAuthTabCallback = iAuthTabCallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = iAuthTabCallback2.label;
        if (i4 != 0) {
            int i5 = asInterface + 59;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        } else {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, this.onExtraCallbackWithResult, "assert", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            iAuthTabCallback2.Z$0 = z;
            iAuthTabCallback2.label = 1;
            objIAuthTabCallback = downloadZip.IAuthTabCallback(this, onnavigationevent, mapOnNavigationEvent, true, null, z, iAuthTabCallback2, 8, null);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i7 = asInterface + 15;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                return objOnWarmupCompleted;
            }
        }
        Map map = (Map) objIAuthTabCallback;
        Object[] objArr = new Object[1];
        a(new char[]{23608, 23637, 19847, 44189, 22514, 47999, 16852, 46166, 34349, 40177, 27478}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr);
        map.put(((String) objArr[0]).intern(), this.onExtraCallback);
        String str = this.onExtraCallbackWithResult;
        String str2 = this.onNavigationEvent;
        if (str2 == null) {
            int i9 = IAuthTabCallbackStub + 85;
            asInterface = i9 % 128;
            if (i9 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str2 = "common";
        }
        return new AppEventPayloadV1(str, "assert", str2, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, this.onExtraCallback, 1048528, (DefaultConstructorMarker) null);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 103;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 45;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 45812), 84 - Color.red(0), 21233 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 19 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
