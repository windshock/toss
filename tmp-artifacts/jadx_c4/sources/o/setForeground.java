package o;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.LayoutShadowNode;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setForeground {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final access6900<startWork> IAuthTabCallback;
    private static int IAuthTabCallbackStub = 0;
    public static final setForeground onExtraCallback;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = (~((~i3) | i8)) | i7;
        int i10 = i5 | i8;
        int i11 = (~(i3 | i7 | i8)) | (~(i2 | i5));
        int i12 = i2 + i5 + i + (2049387148 * i6) + ((-609071723) * i4);
        int i13 = i12 * i12;
        int i14 = ((i2 * 335895516) - 1139737737) + (i5 * 335898315) + (i9 * 933) + (i10 * (-1866)) + (i11 * 933) + (335896449 * i) + ((-616405876) * i6) + (126640917 * i4) + (i13 * 2020605952);
        int i15 = ((1483459036 * i2) - 1284505600) + (2005429323 * i5) + (i9 * 1605645861) + (1083675574 * i10) + (1605645861 * i11) + ((-1205862400) * i) + ((-243269632) * i6) + ((-895483904) * i4) + ((-1334837248) * i13) + (i14 * i14 * (-544210944));
        if (i15 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i15 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
        }
        Activity activity = (Activity) objArr[1];
        int i16 = 2 % 2;
        int i17 = onTransact + 121;
        IAuthTabCallbackStub = i17 % 128;
        int i18 = i17 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            access6900<startWork> access6900Var = IAuthTabCallback;
            ArrayList<startWork> arrayList = new ArrayList();
            for (Object obj : access6900Var) {
                startWork startwork = (startWork) obj;
                if (((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue()) {
                    runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = startwork.onWarmupCompleted();
                    if (runonuithreaddelayedOnWarmupCompleted != null) {
                        int i19 = onTransact + 107;
                        IAuthTabCallbackStub = i19 % 128;
                        int i20 = i19 % 2;
                        if (!runonuithreaddelayedOnWarmupCompleted.postMessage()) {
                        }
                    }
                    WeakReference<ViewGroup> weakReferenceIAuthTabCallback = startwork.IAuthTabCallback();
                    if ((weakReferenceIAuthTabCallback != null ? weakReferenceIAuthTabCallback.get() : null) == viewGroup && startwork.onNavigationEvent() > 0) {
                        int i21 = onTransact + 11;
                        IAuthTabCallbackStub = i21 % 128;
                        if (i21 % 2 != 0) {
                            if (startwork.onNavigationEvent() * jUptimeMillis >= 1000) {
                                arrayList.add(obj);
                            }
                        } else if (jUptimeMillis - startwork.onNavigationEvent() >= 1000) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
            for (startWork startwork2 : arrayList) {
                setForeground setforeground = onExtraCallback;
                Map<String, ? extends Object> mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName()));
                Object[] objArr2 = new Object[1];
                a(new char[]{28464, 60189, 8481, 4177, 28484, 17236, 28940, 59476, 53215, 41928, 53653}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                setforeground.onExtraCallback("clear_timed_out_pending_close", ((String) objArr2[0]).intern(), startwork2, mapOnNavigationEvent);
                startwork2.ICustomTabsCallback_Parcel();
                Function0 function0 = (Function0) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new Object[]{startwork2}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1666755789);
                if (function0 != null) {
                    int i22 = onTransact + 85;
                    IAuthTabCallbackStub = i22 % 128;
                    int i23 = i22 % 2;
                    function0.invoke();
                }
                onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startwork2, false, false, 4, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            }
        }
        return null;
    }

    private setForeground() {
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {DERSet.onExtraCallback};
            int iOnExtraCallback = getKekid.onExtraCallback();
            ((Boolean) DERSet.onExtraCallback(893486076, objArr, -893486055, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).booleanValue();
            throw null;
        }
        Object[] objArr2 = {DERSet.onExtraCallback};
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        boolean zBooleanValue = ((Boolean) DERSet.onExtraCallback(893486076, objArr2, -893486055, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback2)).booleanValue();
        int i3 = onTransact + 103;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    public final boolean IAuthTabCallback(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        if (!asBinder()) {
            return false;
        }
        int i4 = onTransact + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Intent intent = activity.getIntent();
        if (intent == null) {
            return false;
        }
        int i6 = onTransact + 23;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            String stringExtra = intent.getStringExtra("scale_transition");
            return stringExtra != null && Intrinsics.areEqual(StringsKt.toBooleanStrictOrNull(stringExtra), Boolean.TRUE);
        }
        intent.getStringExtra("scale_transition");
        throw null;
    }

    public final String onExtraCallback(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intent intent = activity.getIntent();
        Object obj = null;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("transition_session_id");
            int i4 = onTransact + 125;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return stringExtra;
            }
            throw null;
        }
        int i5 = IAuthTabCallbackStub + 77;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static {
        asInterface();
        onExtraCallback = new setForeground();
        IAuthTabCallback = new access6900<>();
        int i = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ startWork onWarmupCompleted(setForeground setforeground, String str, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 7;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i6 = i4 + 27;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 58 / 0;
            }
            str = null;
        }
        startWork startworkOnNavigationEvent = setforeground.onNavigationEvent(str);
        int i8 = onTransact + 17;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return startworkOnNavigationEvent;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r10 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r3 = "try_push_blocked";
        r5 = null;
        r6 = null;
        r7 = 44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r3 = "try_push_blocked";
        r5 = null;
        r6 = null;
        r7 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        onExtraCallback(r9, r3, r4, r5, r6, r7, null);
        r10 = o.setForeground.IAuthTabCallbackStub + 105;
        o.setForeground.onTransact = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r8 = new o.startWork(onWarmupCompleted(r10));
        r8.onExtraCallback(true);
        o.setForeground.IAuthTabCallback.addLast(r8);
        onExtraCallback(o.setForeground.onExtraCallback, "try_push_success", null, r8, null, 10, null);
        r10 = o.setForeground.onTransact + 59;
        o.setForeground.IAuthTabCallbackStub = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if ((r10 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r10 = 45 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r4 = r1;
        r10 = o.setForeground.IAuthTabCallbackStub + 49;
        o.setForeground.onTransact = r10 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final startWork onNavigationEvent(@Nullable String str) throws Throwable {
        String strOnTransact;
        int i = 2 % 2;
        int i2 = onTransact + 91;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            strOnTransact = onTransact();
            int i3 = 35 / 0;
        } else {
            strOnTransact = onTransact();
        }
    }

    public final startWork onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        startWork startwork = (startWork) IAuthTabCallback.onExtraCallback();
        int i4 = IAuthTabCallbackStub + 45;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return startwork;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if ((r3 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r3 = o.setForeground.IAuthTabCallbackStub + 31;
        o.setForeground.onTransact = r3 % 128;
        r3 = r3 % 2;
        r1 = r1.access100();
        r3 = o.setForeground.IAuthTabCallbackStub + 5;
        o.setForeground.onTransact = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onNavigationEvent() {
        startWork startworkOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onTransact + 29;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            startworkOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 39 / 0;
        } else {
            startworkOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 91;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - TextUtils.getOffsetAfter("", 0)), 84 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 14185), 19 - Color.blue(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 53;
                $10 = i6 % 128;
                int i7 = i6 % 2;
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

    public final boolean IAuthTabCallback(@NotNull startWork startwork) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startwork, "");
        if (!onNavigationEvent(startwork)) {
            onExtraCallback(this, "request_close_skipped", "entry_not_found", startwork, null, 8, null);
            int i4 = onTransact + 63;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        if (!((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startwork}, iOnExtraCallback2, 796467999)).booleanValue()) {
            int i6 = onTransact + 79;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            startwork.onExtraCallbackWithResult(true);
            startwork.onExtraCallbackWithResult(SystemClock.uptimeMillis());
            startwork.onWarmupCompleted(false);
            int i8 = onTransact + 17;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
        }
        onExtraCallback(this, "request_close_success", null, startwork, null, 10, null);
        return true;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        Object objPrevious;
        setForeground setforeground = (setForeground) objArr[0];
        Activity activity = (Activity) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            int i4 = IAuthTabCallbackStub + 63;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
            return null;
        }
        access6900<startWork> access6900Var = IAuthTabCallback;
        ListIterator listIterator = access6900Var.listIterator(access6900Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            startWork startwork = (startWork) objPrevious;
            if (((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue()) {
                if (((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 173212765, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -173212764)).booleanValue()) {
                    continue;
                } else {
                    int i6 = IAuthTabCallbackStub + 115;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        startwork.onWarmupCompleted();
                        throw null;
                    }
                    runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = startwork.onWarmupCompleted();
                    if (runonuithreaddelayedOnWarmupCompleted == null || !runonuithreaddelayedOnWarmupCompleted.postMessage()) {
                        WeakReference<ViewGroup> weakReferenceIAuthTabCallback = startwork.IAuthTabCallback();
                        if ((weakReferenceIAuthTabCallback != null ? weakReferenceIAuthTabCallback.get() : null) == viewGroup) {
                            break;
                        }
                    }
                }
            }
        }
        startWork startwork2 = (startWork) objPrevious;
        if (startwork2 != null) {
            startwork2.onWarmupCompleted(true);
            onExtraCallback(setforeground, "consume_pending_close", null, startwork2, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())), 2, null);
            return startwork2;
        }
        int i7 = onTransact + 25;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final startWork onExtraCallback(@NotNull String str, boolean z, int i, int i2) throws Throwable {
        String str2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        startWork startworkOnExtraCallback = onExtraCallback(str);
        if (startworkOnExtraCallback == null) {
            int i4 = IAuthTabCallbackStub + 55;
            int i5 = i4 % 128;
            onTransact = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 1;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            str2 = "entry_missing";
        } else if (z) {
            int i9 = onTransact + 59;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 88 / 0;
            }
            str2 = "target_available";
        } else {
            str2 = "target_unavailable";
        }
        onExtraCallback("apply_close_fallback_requested", str2, startworkOnExtraCallback, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("requested_session_id", str), getWrite.IAuthTabCallback("available", Boolean.valueOf(z)), getWrite.IAuthTabCallback("screen_width", Integer.valueOf(i)), getWrite.IAuthTabCallback("screen_height", Integer.valueOf(i2))}));
        if (startworkOnExtraCallback == null) {
            return null;
        }
        startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -102710934, new Object[]{startworkOnExtraCallback, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 102710934);
        return startworkOnExtraCallback;
    }

    private final String onWarmupCompleted(String str) {
        int i = 2 % 2;
        String str2 = null;
        String string = str != null ? StringsKt.trim(str).toString() : null;
        if (string == null) {
            int i2 = IAuthTabCallbackStub + 53;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            string = "";
        }
        if (string.length() > 0) {
            int i4 = onTransact + 39;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr = {onExtraCallback, string};
                ((Boolean) onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -690935982, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 690935984, objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).booleanValue();
                str2.hashCode();
                throw null;
            }
            Object[] objArr2 = {onExtraCallback, string};
            if (!((Boolean) onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -690935982, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 690935984, objArr2, LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).booleanValue()) {
                str2 = string;
            }
        }
        if (str2 != null) {
            return str2;
        }
        int i5 = onTransact + 17;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final void onExtraCallback() throws Throwable {
        setForeground setforeground;
        String str;
        String str2;
        Map map;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 69;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            startWork startwork = (startWork) IAuthTabCallback.IAuthTabCallbackDefault();
            if (startwork != null) {
                int i4 = IAuthTabCallbackStub + 41;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    setforeground = onExtraCallback;
                    str = "clear_current";
                    str2 = null;
                    map = null;
                    i = 78;
                } else {
                    setforeground = onExtraCallback;
                    str = "clear_current";
                    str2 = null;
                    map = null;
                    i = 10;
                }
                onExtraCallback(setforeground, str, str2, startwork, map, i, null);
                startWork.onExtraCallbackWithResult(startwork, false, 1, null);
                return;
            }
            return;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        setForeground setforeground = (setForeground) objArr[0];
        startWork startwork = (startWork) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        if ((iIntValue & 2) != 0) {
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 47;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 25;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            zBooleanValue = true;
        }
        if ((iIntValue & 4) != 0) {
            int i7 = onTransact + 83;
            IAuthTabCallbackStub = i7 % 128;
            zBooleanValue2 = i7 % 2 != 0;
        }
        setforeground.onExtraCallback(startwork, zBooleanValue, zBooleanValue2);
        int i8 = onTransact + 1;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull startWork startwork, boolean z, boolean z2) throws Throwable {
        int iNextIndex;
        Integer numValueOf;
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startwork, "");
        if (z) {
            access6900<startWork> access6900Var = IAuthTabCallback;
            numValueOf = Integer.valueOf(CollectionsKt.getLastIndex(access6900Var));
            if (numValueOf.intValue() < 0 || access6900Var.onExtraCallback() != startwork) {
                numValueOf = null;
            }
        } else {
            access6900<startWork> access6900Var2 = IAuthTabCallback;
            ListIterator listIterator = access6900Var2.listIterator(access6900Var2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    int i2 = onTransact + 39;
                    IAuthTabCallbackStub = i2 % 128;
                    int i3 = i2 % 2;
                    iNextIndex = -1;
                    break;
                }
                if (((startWork) listIterator.previous()) == startwork) {
                    iNextIndex = listIterator.nextIndex();
                    int i4 = IAuthTabCallbackStub + 99;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
            }
            numValueOf = Integer.valueOf(iNextIndex);
            if (numValueOf.intValue() < 0) {
            }
        }
        if (numValueOf != null) {
            onExtraCallback(this, "clear_entry", null, startwork, null, 10, null);
            startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2115563899, new Object[]{(startWork) IAuthTabCallback.remove(numValueOf.intValue()), Boolean.valueOf(z2)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2115563909);
            return;
        }
        if (!(!z)) {
            int i6 = onTransact + 9;
            IAuthTabCallbackStub = i6 % 128;
            str = "not_stack_top";
            if (i6 % 2 != 0) {
                int i7 = 16 / 0;
            }
        } else {
            str = "entry_missing";
        }
        onExtraCallback(this, "clear_entry_skipped", str, startwork, null, 8, null);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        setForeground setforeground = (setForeground) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        startWork startworkOnExtraCallbackWithResult = setforeground.onExtraCallbackWithResult();
        if (startworkOnExtraCallbackWithResult == null) {
            int i4 = onTransact + 97;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        String strOnTransact = setforeground.onTransact();
        if (strOnTransact == null) {
            return false;
        }
        if (!Intrinsics.areEqual(strOnTransact, "pending_end") && !Intrinsics.areEqual(strOnTransact, "close_running")) {
            return false;
        }
        onExtraCallback(setforeground, "clear_blocking_return_transition", strOnTransact, startworkOnExtraCallbackWithResult, null, 8, null);
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = startworkOnExtraCallbackWithResult.onWarmupCompleted();
        if (runonuithreaddelayedOnWarmupCompleted != null) {
            int i6 = IAuthTabCallbackStub + 23;
            onTransact = i6 % 128;
            if (i6 % 2 != 0 ? runonuithreaddelayedOnWarmupCompleted.postMessage() : !runonuithreaddelayedOnWarmupCompleted.postMessage()) {
                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2 = startworkOnExtraCallbackWithResult.onWarmupCompleted();
                if (runonuithreaddelayedOnWarmupCompleted2 != null) {
                    runonuithreaddelayedOnWarmupCompleted2.asInterface(1.0f);
                }
                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted3 = startworkOnExtraCallbackWithResult.onWarmupCompleted();
                if (runonuithreaddelayedOnWarmupCompleted3 != null) {
                    runonuithreaddelayedOnWarmupCompleted3.onNavigationEvent();
                }
            }
        }
        if (setforeground.onExtraCallbackWithResult() == startworkOnExtraCallbackWithResult) {
            startworkOnExtraCallbackWithResult.ICustomTabsCallback_Parcel();
            Function0 function0 = (Function0) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new Object[]{startworkOnExtraCallbackWithResult}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1666755789);
            if (function0 != null) {
                int i7 = onTransact + 57;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                function0.invoke();
            }
            int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startworkOnExtraCallbackWithResult, false, false, 6, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        return true;
    }

    public final void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        while (true) {
            access6900<startWork> access6900Var = IAuthTabCallback;
            if (!(!access6900Var.isEmpty())) {
                int i2 = onTransact + 95;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            int i4 = onTransact + 49;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                startWork startwork = (startWork) access6900Var.removeLast();
                onExtraCallback(onExtraCallback, "cancel_all_entry", null, startwork, null, 75, null);
                startwork.ICustomTabsCallback_Parcel();
                startWork.onExtraCallbackWithResult(startwork, true, 1, null);
            } else {
                startWork startwork2 = (startWork) access6900Var.removeLast();
                onExtraCallback(onExtraCallback, "cancel_all_entry", null, startwork2, null, 10, null);
                startwork2.ICustomTabsCallback_Parcel();
                startWork.onExtraCallbackWithResult(startwork2, false, 1, null);
            }
        }
    }

    public final boolean IAuthTabCallbackDefault() {
        startWork startworkOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            asBinder();
            throw null;
        }
        if (!asBinder() || (startworkOnExtraCallbackWithResult = onExtraCallbackWithResult()) == null) {
            return false;
        }
        int i3 = IAuthTabCallbackStub + 1;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean zICustomTabsService = startworkOnExtraCallbackWithResult.ICustomTabsService();
        if (i4 == 0) {
            if (!zICustomTabsService) {
                return false;
            }
        } else if (!zICustomTabsService) {
            return false;
        }
        int i5 = onTransact + 79;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final boolean onExtraCallbackWithResult(@Nullable String str) {
        startWork startworkOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (str == null || (startworkOnExtraCallbackWithResult = onExtraCallback(str)) == null) {
            startworkOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        if (!asBinder()) {
            return false;
        }
        int i2 = onTransact + 75;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (startworkOnExtraCallbackWithResult == null) {
            return false;
        }
        int i5 = i3 + 121;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        if (!startworkOnExtraCallbackWithResult.ICustomTabsService()) {
            return false;
        }
        int i7 = onTransact + 3;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(setForeground setforeground, String str, String str2, startWork startwork, Map map, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            int i5 = i3 + 15;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i7 = IAuthTabCallbackStub + 57;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            startwork = setforeground.onExtraCallbackWithResult();
        }
        if ((i & 8) != 0) {
            map = access8100.onNavigationEvent();
        }
        setforeground.onExtraCallback(str, str2, startwork, (Map<String, ? extends Object>) map);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull String str, @Nullable String str2, @Nullable startWork startwork, @NotNull Map<String, ? extends Object> map) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        FrameLayout frameLayout;
        boolean z5;
        WeakReference<ViewGroup> weakReferenceIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        startWork startworkOnExtraCallbackWithResult = onExtraCallbackWithResult();
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("stage", str);
        Object[] objArr = new Object[1];
        a(new char[]{5621, 28883, 44131, 63558, 5511, 55446, 64578, 'U', 46362, 14365}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str2);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("stack_size", Integer.valueOf(IAuthTabCallback.size()));
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("entry_session_id", startwork != null ? startwork.access100() : null);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("current_session_id", startworkOnExtraCallbackWithResult != null ? startworkOnExtraCallbackWithResult.access100() : null);
        if (startwork != null) {
            int i2 = onTransact + 69;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            z = startworkOnExtraCallbackWithResult == startwork;
        }
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("is_current_entry", Boolean.valueOf(z));
        if (startwork != null) {
            int i4 = onTransact + 27;
            IAuthTabCallbackStub = i4 % 128;
            z2 = i4 % 2 == 0 ? startwork.ICustomTabsService() : startwork.ICustomTabsService();
        }
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("entry_is_valid", Boolean.valueOf(z2));
        if (startwork == null || !startwork.mayLaunchUrl()) {
            z3 = false;
        } else {
            int i5 = IAuthTabCallbackStub + 87;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            z3 = true;
        }
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("entry_is_preparing", Boolean.valueOf(z3));
        if (startwork != null) {
            int i7 = IAuthTabCallbackStub + 83;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                z4 = ((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue();
            } else if (((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue()) {
            }
        }
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback("pending_end_transition", Boolean.valueOf(z4));
        if (startwork != null) {
            int i8 = IAuthTabCallbackStub + 13;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            WeakReference<FrameLayout> interfaceDescriptor = startwork.getInterfaceDescriptor();
            frameLayout = interfaceDescriptor != null ? interfaceDescriptor.get() : null;
        }
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback("has_overlay", Boolean.valueOf(frameLayout != null));
        if (((startwork == null || (weakReferenceIAuthTabCallback = startwork.IAuthTabCallback()) == null) ? null : weakReferenceIAuthTabCallback.get()) != null) {
            int i10 = IAuthTabCallbackStub + 11;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            z5 = true;
        } else {
            z5 = false;
        }
        Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, getWrite.IAuthTabCallback("has_host_decor", Boolean.valueOf(z5))});
        mapIAuthTabCallback.putAll(map);
        Unit unit = Unit.INSTANCE;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "scale_transition_state", (String) null, mapIAuthTabCallback, (String) null, false, (String) null, 58, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r1.mayLaunchUrl() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return "preparing";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r3 = r1.writeTypedObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r5 = o.setForeground.IAuthTabCallbackStub + 59;
        o.setForeground.onTransact = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r3.postMessage() != true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r1 = o.setForeground.IAuthTabCallbackStub + 93;
        o.setForeground.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        return "open_running";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r3 = r1.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r5 = o.setForeground.IAuthTabCallbackStub + 77;
        o.setForeground.onTransact = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r3.postMessage() != true) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r1 = o.setForeground.IAuthTabCallbackStub + 89;
        r2 = r1 % 128;
        o.setForeground.onTransact = r2;
        r1 = r1 % 2;
        r2 = r2 + 73;
        o.setForeground.IAuthTabCallbackStub = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if ((r2 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r1 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        return "close_running";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        r4 = o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        r8 = o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (((java.lang.Boolean) o.startWork.onExtraCallback(o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), r4, o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new java.lang.Object[]{r1}, r8, 796467999)).booleanValue() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r1 = o.setForeground.onTransact + 63;
        o.setForeground.IAuthTabCallbackStub = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        if ((r1 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        return "pending_end";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onTransact() {
        startWork startworkOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            startworkOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 71 / 0;
        } else {
            startworkOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        access6900<startWork> access6900Var = IAuthTabCallback;
        if (access6900Var != null) {
            int i4 = IAuthTabCallbackStub + 1;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                access6900Var.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (access6900Var.isEmpty()) {
                return false;
            }
        }
        Iterator it = access6900Var.iterator();
        while (it.hasNext()) {
            if (!(!Intrinsics.areEqual(((startWork) it.next()).access100(), str))) {
                int i5 = IAuthTabCallbackStub + 67;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return false;
    }

    public final startWork onExtraCallback(@NotNull String str) {
        Object objPrevious;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        access6900<startWork> access6900Var = IAuthTabCallback;
        ListIterator listIterator = access6900Var.listIterator(access6900Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (!(!Intrinsics.areEqual(((startWork) objPrevious).access100(), str))) {
                int i2 = onTransact + 65;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                break;
            }
        }
        startWork startwork = (startWork) objPrevious;
        int i4 = onTransact + 15;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return startwork;
    }

    public final boolean onNavigationEvent(@NotNull startWork startwork) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startwork, "");
        access6900<startWork> access6900Var = IAuthTabCallback;
        if (access6900Var != null) {
            int i2 = onTransact + 39;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                access6900Var.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (access6900Var.isEmpty()) {
                return false;
            }
        }
        Iterator it = access6900Var.iterator();
        while (it.hasNext()) {
            int i3 = onTransact + 5;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            if (((startWork) it.next()) == startwork) {
                return true;
            }
        }
        int i5 = IAuthTabCallbackStub + 9;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setForeground setforeground, startWork startwork, boolean z, boolean z2, int i, Object obj) throws Throwable {
        Object[] objArr = {setforeground, startwork, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), obj};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public final boolean onWarmupCompleted() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(iOnNavigationEvent2, -913239865, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 913239869, new Object[]{this}, iOnNavigationEvent3)).booleanValue();
    }

    public final void onExtraCallbackWithResult(@NotNull Activity activity) throws Throwable {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onWarmupCompleted(iOnNavigationEvent2, 1992638348, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1992638345, new Object[]{this, activity}, iOnNavigationEvent3);
    }

    public final startWork onWarmupCompleted(@NotNull Activity activity) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (startWork) onWarmupCompleted(iOnNavigationEvent2, -1958547545, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1958547546, new Object[]{this, activity}, iOnNavigationEvent3);
    }

    public final boolean IAuthTabCallback(@NotNull String str) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(iOnNavigationEvent2, -690935982, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 690935984, new Object[]{this, str}, iOnNavigationEvent3)).booleanValue();
    }

    static void asInterface() {
        onNavigationEvent = 3627430947967062828L;
    }
}
