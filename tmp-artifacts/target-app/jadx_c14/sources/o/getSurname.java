package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.webview.TossWebView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.getPseudonym;
import o.getSurname;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSurname {
    private static byte[] IAuthTabCallback;
    private static short[] IAuthTabCallbackDefault;
    private static int asInterface;
    private static int onExtraCallback;
    public static final getSurname onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {40, 108, -113, 75};
    private static final int $$b = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = r8 * 3
            int r8 = 115 - r8
            byte[] r1 = o.getSurname.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r6 = r6 + 1
            int r8 = r8 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSurname.$$c(byte, int, byte):java.lang.String");
    }

    static {
        asInterface = 0;
        onNavigationEvent();
        onExtraCallbackWithResult = new getSurname();
        int i = onTransact + 11;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getPseudonym getpseudonym = (getPseudonym) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        List list = (List) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        String str = (String) objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {getpseudonym, function0, list, Integer.valueOf(iIntValue), str};
        if (i3 != 0) {
            return (Unit) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 667874441, objArr2, -667874440, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 15;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i2);
        int i11 = ~i3;
        int i12 = (~(i8 | i11 | i4)) | i10;
        int i13 = (~(i2 | i11)) | (~(i7 | i11));
        int i14 = i4 + i3 + i5 + (1941422536 * i6) + ((-555707305) * i);
        int i15 = i14 * i14;
        int i16 = (i4 * (-2131549542)) + 177471488 + ((-2131549542) * i3) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i5) + ((-1363148800) * i6) + (2141716480 * i) + ((-573308928) * i15);
        int i17 = ((i4 * 487360618) - 1291405921) + (i3 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i5 * 487361161) + (i6 * (-1188264952)) + (i * 624576655) + (i15 * (-25952256));
        int i18 = i16 + (i17 * i17 * 74186752);
        return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(TossWebView tossWebView, String str, getPseudonym getpseudonym, List list, Function0 function0) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tossWebView, str, getpseudonym, list, function0);
        int i4 = IAuthTabCallbackStub + 95;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, Function0 function0, getPseudonym getpseudonym, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(list, function0, getpseudonym, str);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, function0, getpseudonym, str);
        int i3 = asBinder + 23;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private getSurname() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(java.util.List r4, kotlin.jvm.functions.Function0 r5, o.getPseudonym r6, java.lang.String r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            if (r7 == 0) goto L1e
            int r2 = o.getSurname.IAuthTabCallbackStub
            int r2 = r2 + 115
            int r3 = r2 % 128
            o.getSurname.asBinder = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L18
            boolean r7 = java.lang.Boolean.parseBoolean(r7)
            if (r7 == 0) goto L2a
            goto L1e
        L18:
            boolean r7 = java.lang.Boolean.parseBoolean(r7)
            if (r7 == r1) goto L2a
        L1e:
            o.getSurname r7 = o.getSurname.onExtraCallbackWithResult
            boolean r4 = r7.onNavigationEvent(r4)
            r4 = r4 ^ r1
            if (r4 == 0) goto L2a
            r5.invoke()
        L2a:
            o.getSurname r4 = o.getSurname.onExtraCallbackWithResult
            r4.onExtraCallback(r6)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            int r5 = o.getSurname.IAuthTabCallbackStub
            int r5 = r5 + 51
            int r6 = r5 % 128
            o.getSurname.asBinder = r6
            int r5 = r5 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSurname.onExtraCallbackWithResult(java.util.List, kotlin.jvm.functions.Function0, o.getPseudonym, java.lang.String):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(im.toss.webview.TossWebView r16, java.lang.String r17, final o.getPseudonym r18, final java.util.List r19, final kotlin.jvm.functions.Function0 r20) throws java.lang.Throwable {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = 2
            int r5 = r4 % r4
            int r5 = o.getSurname.asBinder
            int r5 = r5 + 111
            int r6 = r5 % 128
            o.getSurname.IAuthTabCallbackStub = r6
            int r5 = r5 % r4
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L1d
            r5 = 6
            int r5 = r5 / r7
            if (r0 == 0) goto L79
            goto L1f
        L1d:
            if (r0 == 0) goto L79
        L1f:
            if (r1 == 0) goto L79
            o.getSurname r4 = o.getSurname.onExtraCallbackWithResult
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            int r1 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r1 = r1 >> 16
            short r8 = (short) r1
            int r1 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r1 = r1 >> 16
            int r1 = r1 + 6
            byte r9 = (byte) r1
            int r1 = android.view.ViewConfiguration.getTouchSlop()
            int r1 = r1 >> 8
            r10 = -2111287293(0xffffffff82285003, float:-1.2365653E-37)
            int r10 = r10 + r1
            java.lang.String r1 = ""
            int r1 = android.text.TextUtils.getOffsetAfter(r1, r7)
            r11 = 374019522(0x164b15c2, float:1.6405075E-25)
            int r11 = r11 - r1
            long r12 = android.os.Process.getElapsedCpuTime()
            r14 = 0
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            int r12 = r1 + (-74)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r13 = r1
            a(r8, r9, r10, r11, r12, r13)
            r1 = r1[r7]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            viva.republica.toss.common.web.message.handlers.cascraping.CaWebViewBackPressHandler$$ExternalSyntheticLambda1 r5 = new viva.republica.toss.common.web.message.handlers.cascraping.CaWebViewBackPressHandler$$ExternalSyntheticLambda1
            r7 = r20
            r5.<init>()
            r4.onWarmupCompleted(r0, r2, r1, r5)
            goto L97
        L79:
            r7 = r20
            o.getSurname r0 = o.getSurname.onExtraCallbackWithResult
            boolean r1 = r0.onNavigationEvent(r3)
            r1 = r1 ^ r6
            if (r1 == r6) goto L88
            r0.onExtraCallback(r2)
            goto L97
        L88:
            r20.invoke()
            r0.onExtraCallback(r2)
            int r0 = o.getSurname.asBinder
            int r0 = r0 + 75
            int r1 = r0 % 128
            o.getSurname.IAuthTabCallbackStub = r1
            int r0 = r0 % r4
        L97:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSurname.IAuthTabCallback(im.toss.webview.TossWebView, java.lang.String, o.getPseudonym, java.util.List, kotlin.jvm.functions.Function0):kotlin.Unit");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if ((!r1.onExtraCallbackWithResult()) == true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r12 = o.getSurname.asBinder + 63;
        o.getSurname.IAuthTabCallbackStub = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r8 = r1.onExtraCallback();
        r10 = new java.util.ArrayList();
        r2 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r2.hasNext() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r5 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (((o.RuntimeScheduler) r5).onTransact() == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        r6 = o.getSurname.asBinder + 37;
        o.getSurname.IAuthTabCallbackStub = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if ((r6 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        r10.add(r5);
        r5 = 83 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r10.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r10.isEmpty() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r12 = o.getSurname.asBinder + 39;
        o.getSurname.IAuthTabCallbackStub = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r12 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        r2 = o.getSurname.asBinder + 41;
        o.getSurname.IAuthTabCallbackStub = r2 % 128;
        r2 = r2 % 2;
        r0 = r12.extraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r6 = r0;
        r1.onWarmupCompleted(true);
        r7 = r1;
        r12 = onWarmupCompleted(r11, r1, r10, 0, new viva.republica.toss.common.web.message.handlers.cascraping.CaWebViewBackPressHandler$$ExternalSyntheticLambda2(r12, r6, r7, r8, r13), 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r12 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        onExtraCallback(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onExtraCallback(@org.jetbrains.annotations.Nullable final im.toss.webview.TossWebView r12, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r13) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getSurname.IAuthTabCallbackStub
            int r1 = r1 + 91
            int r2 = r1 % 128
            o.getSurname.asBinder = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            o.getPseudonym r1 = r11.onNavigationEvent(r12)
            r2 = 17
            int r2 = r2 / r3
            if (r1 != 0) goto L28
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            o.getPseudonym r1 = r11.onNavigationEvent(r12)
            if (r1 != 0) goto L28
        L27:
            return r3
        L28:
            boolean r2 = r1.onExtraCallbackWithResult()
            r4 = 1
            r2 = r2 ^ r4
            if (r2 == r4) goto L3a
            int r12 = o.getSurname.asBinder
            int r12 = r12 + 63
            int r13 = r12 % 128
            o.getSurname.IAuthTabCallbackStub = r13
            int r12 = r12 % r0
            return r3
        L3a:
            java.util.List r8 = r1.onExtraCallback()
            r2 = r8
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r2 = r2.iterator()
        L4a:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r2.next()
            r6 = r5
            o.RuntimeScheduler r6 = (o.RuntimeScheduler) r6
            java.lang.String r6 = r6.onTransact()
            if (r6 == 0) goto L4a
            int r6 = o.getSurname.asBinder
            int r6 = r6 + 37
            int r7 = r6 % 128
            o.getSurname.IAuthTabCallbackStub = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L6f
            r10.add(r5)
            r5 = 83
            int r5 = r5 / r3
            goto L4a
        L6f:
            r10.add(r5)
            goto L4a
        L73:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L83
            int r12 = o.getSurname.asBinder
            int r12 = r12 + 39
            int r13 = r12 % 128
            o.getSurname.IAuthTabCallbackStub = r13
            int r12 = r12 % r0
            return r3
        L83:
            if (r12 == 0) goto L93
            int r2 = o.getSurname.asBinder
            int r2 = r2 + 41
            int r3 = r2 % 128
            o.getSurname.IAuthTabCallbackStub = r3
            int r2 = r2 % r0
            java.lang.String r0 = r12.extraCallbackWithResult()
            goto L94
        L93:
            r0 = 0
        L94:
            r6 = r0
            r1.onWarmupCompleted(r4)
            r0 = 0
            viva.republica.toss.common.web.message.handlers.cascraping.CaWebViewBackPressHandler$$ExternalSyntheticLambda2 r2 = new viva.republica.toss.common.web.message.handlers.cascraping.CaWebViewBackPressHandler$$ExternalSyntheticLambda2
            r4 = r2
            r5 = r12
            r7 = r1
            r9 = r13
            r4.<init>()
            r9 = 4
            r12 = 0
            r4 = r11
            r5 = r1
            r6 = r10
            r7 = r0
            r8 = r2
            r10 = r12
            boolean r12 = onWarmupCompleted(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto Lb3
            r11.onExtraCallback(r1)
        Lb3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSurname.onExtraCallback(im.toss.webview.TossWebView, kotlin.jvm.functions.Function0):boolean");
    }

    private final void onExtraCallback(getPseudonym getpseudonym) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getpseudonym.onWarmupCompleted(false);
        int i4 = asBinder + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void onNavigationEvent(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(str);
        int i4 = asBinder + 27;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(WebView webView, getPseudonym getpseudonym, String str, final Function1<? super String, Unit> function1) throws Throwable {
        int i = 2 % 2;
        try {
            webView.evaluateJavascript(str, new ValueCallback() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.CaWebViewBackPressHandler$$ExternalSyntheticLambda0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    getSurname.onExtraCallback(function1, (String) obj);
                }
            });
            int i2 = IAuthTabCallbackStub + 77;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            onExtraCallback(getpseudonym);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a((short) View.resolveSizeAndState(0, 0, 0), (byte) ((-125) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (-2111287292) - Color.blue(0), 374019548 - TextUtils.lastIndexOf("", '0', 0, 0), (-50) - (KeyEvent.getMaxKeyCode() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((short) Color.argb(0, 0, 0, 0), (byte) (112 - View.getDefaultSize(0, 0)), (-2111287268) - (Process.myPid() >> 22), (ViewConfiguration.getJumpTapTimeout() >> 16) + 374019583, (ViewConfiguration.getTouchSlop() >> 8) - 50, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), th, (Map) null, 8, (Object) null);
        }
    }

    private final boolean onNavigationEvent(List<RuntimeScheduler> list) {
        int i = 2 % 2;
        Iterator<RuntimeScheduler> it = list.iterator();
        while (it.hasNext()) {
            WebView webViewIAuthTabCallbackDefault = it.next().IAuthTabCallbackDefault();
            if (webViewIAuthTabCallbackDefault != null && !(!webViewIAuthTabCallbackDefault.canGoBack())) {
                int i2 = asBinder + 61;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                webViewIAuthTabCallbackDefault.goBack();
                return i3 == 0;
            }
        }
        int i4 = IAuthTabCallbackStub + 99;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return false;
    }

    static /* synthetic */ boolean onWarmupCompleted(getSurname getsurname, getPseudonym getpseudonym, List list, int i, Function0 function0, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = asBinder;
        int i5 = i4 + 23;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 4) != 0) {
            int i7 = i4 + 77;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        return getsurname.onNavigationEvent(getpseudonym, list, i, function0);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        getPseudonym getpseudonym = (getPseudonym) objArr[0];
        List<RuntimeScheduler> list = (List) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Function0<Unit> function0 = (Function0) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onExtraCallbackWithResult.onNavigationEvent(getpseudonym, list, iIntValue + 1, function0);
        int i4 = IAuthTabCallbackStub + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zOnNavigationEvent);
    }

    private final boolean onNavigationEvent(final getPseudonym getpseudonym, final List<RuntimeScheduler> list, final int i, final Function0<Unit> function0) throws Throwable {
        int i2 = 2 % 2;
        RuntimeScheduler runtimeScheduler = (RuntimeScheduler) CollectionsKt.getOrNull(list, i);
        if (runtimeScheduler == null) {
            int i3 = IAuthTabCallbackStub + 37;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        String strOnTransact = runtimeScheduler.onTransact();
        if (strOnTransact == null) {
            return ((Boolean) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -126299922, new Object[]{getpseudonym, list, Integer.valueOf(i), function0}, 126299924, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue();
        }
        WebView webViewIAuthTabCallbackDefault = runtimeScheduler.IAuthTabCallbackDefault();
        if (webViewIAuthTabCallbackDefault != null) {
            StringBuilder sb = new StringBuilder();
            setTopGuideFontSize.onExtraCallback(sb, strOnTransact);
            Object[] objArr = new Object[1];
            a((short) (Color.rgb(0, 0, 0) + 16777216), (byte) (6 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ExpandableListView.getPackedPositionType(0L) - 2111287293, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 374019522, (-73) - TextUtils.getOffsetAfter("", 0), objArr);
            sb.append(((String) objArr[0]).intern());
            onWarmupCompleted(webViewIAuthTabCallbackDefault, getpseudonym, sb.toString(), new Function1() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.CaWebViewBackPressHandler$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    getPseudonym getpseudonym2 = getpseudonym;
                    Function0 function02 = function0;
                    List list2 = list;
                    Integer numValueOf = Integer.valueOf(i);
                    int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                    int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                    int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                    return (Unit) getSurname.onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, -1495040352, new Object[]{getpseudonym2, function02, list2, numValueOf, (String) obj}, 1495040352, iOnWarmupCompleted2, iOnWarmupCompleted3);
                }
            });
            return true;
        }
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -126299922, new Object[]{getpseudonym, list, Integer.valueOf(i), function0}, 126299924, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue();
        int i5 = IAuthTabCallbackStub + 49;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getPseudonym getpseudonym = (getPseudonym) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        List list = (List) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        String str = (String) objArr[4];
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            int i5 = i2 + 113;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            if (Boolean.parseBoolean(str)) {
                int i7 = IAuthTabCallbackStub + 95;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    onExtraCallbackWithResult.onExtraCallback(getpseudonym);
                    return Unit.INSTANCE;
                }
                onExtraCallbackWithResult.onExtraCallback(getpseudonym);
                Unit unit = Unit.INSTANCE;
                throw null;
            }
        }
        Object[] objArr2 = {getpseudonym, list, Integer.valueOf(iIntValue), function0};
        if (!((Boolean) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -126299922, objArr2, 126299924, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final getPseudonym onNavigationEvent(TossWebView tossWebView) {
        Object tag;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (tossWebView != null) {
            tag = tossWebView.getTag(R.id.ca_webview_scrapers);
        } else {
            int i4 = i3 + 67;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            tag = null;
        }
        if (!(tag instanceof getPseudonym)) {
            return null;
        }
        int i6 = IAuthTabCallbackStub + 103;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return (getPseudonym) tag;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01aa A[PHI: r0
      0x01aa: PHI (r0v9 int) = (r0v8 int), (r0v40 int) binds: [B:39:0x01a8, B:36:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ac A[PHI: r0
      0x01ac: PHI (r0v37 int) = (r0v8 int), (r0v40 int) binds: [B:39:0x01a8, B:36:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r27, byte r28, int r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSurname.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getPseudonym getpseudonym, Function0 function0, List list, int i, String str) {
        Object[] objArr = {getpseudonym, function0, list, Integer.valueOf(i), str};
        return (Unit) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1495040352, objArr, 1495040352, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private static final boolean onExtraCallbackWithResult(getPseudonym getpseudonym, List<RuntimeScheduler> list, int i, Function0<Unit> function0) {
        Object[] objArr = {getpseudonym, list, Integer.valueOf(i), function0};
        return ((Boolean) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -126299922, objArr, 126299924, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue();
    }

    private static final Unit onWarmupCompleted(getPseudonym getpseudonym, Function0 function0, List list, int i, String str) {
        Object[] objArr = {getpseudonym, function0, list, Integer.valueOf(i), str};
        return (Unit) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 667874441, objArr, -667874440, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    static void onNavigationEvent() {
        onExtraCallback = -644843531;
        onNavigationEvent = -1538795453;
        onWarmupCompleted = 1307783790;
        IAuthTabCallback = new byte[]{15, -122, 114, -125, 125, -122, -110, 94, -117, -123, 120, -87, 110, -125, -119, -108, 64, -103, 119, -104, Byte.MAX_VALUE, 118, -123, 125, -107, -121, -127, 123, 112, -125, Byte.MAX_VALUE, -109, 124, Byte.MAX_VALUE, -113, 119, -120, 106, -109, 109, 111, -99, -119, 107, -108, 113, 115, -109, 105, 8, 8, 8};
    }
}
