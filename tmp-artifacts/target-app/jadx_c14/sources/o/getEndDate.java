package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getEndDate implements ALCFaceQuality {
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback;
    private static char[] onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {112, 44, -46, -27};
    private static final int $$b = 146;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r8 = r8 * 2
            int r8 = 105 - r8
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r1 = o.getEndDate.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEndDate.$$c(int, byte, int):java.lang.String");
    }

    static {
        onWarmupCompleted = 1;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new int[]{0, 11, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1}, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new onWarmupCompleted(null);
        int i = onExtraCallback + 69;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(getEndDate getenddate, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, String str2, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getenddate.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, str2, setonoutofmemeryerrorcallback);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 87;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackStub + 27;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallbackStub + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = asInterface + 63;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new int[]{138, 11, 100, 3}, false, new byte[]{1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1}, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        if (StringsKt.isBlank(strOnNavigationEvent)) {
            int i2 = IAuthTabCallbackStub + 121;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = new Object[1];
            a(new int[]{149, 23, 0, 0}, false, new byte[]{0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1}, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(11 - View.MeasureSpec.getSize(0), 14 - View.resolveSizeAndState(0, 0, 0), new char[]{6, 65525, 4, 19, 65528, 65533, 0, 65525, '\n', 2, 65533, 7, 1, 65525}, 257 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), true, objArr3);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr3[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(onExtraCallback(settext));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = null;
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        onExtraCallback onextracallback = (onExtraCallback) obj;
        if (onextracallback != null) {
            onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, strOnNavigationEvent, onextracallback, setonoutofmemeryerrorcallback);
            return;
        }
        int i4 = IAuthTabCallbackStub + 9;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, null, strOnNavigationEvent, setonoutofmemeryerrorcallback);
        } else {
            IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, null, strOnNavigationEvent, setonoutofmemeryerrorcallback);
            obj2.hashCode();
            throw null;
        }
    }

    private final void onExtraCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, onExtraCallback onextracallback, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            if (context == null) {
                Object[] objArr = new Object[1];
                a(new int[]{11, 27, 0, 13}, true, new byte[]{0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1}, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 11, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1}, objArr2);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
                return;
            }
            Response response = Response.onNavigationEvent;
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(((DistributionPointName) Response.onExtraCallback(context, DistributionPointName.class)).ReportDrawnKtExternalSyntheticLambda1(), str, onextracallback, this, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, null), 3, (Object) null);
            int i3 = asInterface + 63;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ onExtraCallback $attribution;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ $contentOwner;
        final /* synthetic */ String $packageName;
        final /* synthetic */ checkModelValidation $tracker;
        int label;
        final /* synthetic */ getEndDate this$0;
        private static final byte[] $$a = {7, 75, -84, -52};
        private static final int $$b = 165;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onExtraCallback = 1;
        private static int IAuthTabCallback = 478308961;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, int r7, byte r8) {
            /*
                int r7 = r7 * 3
                int r7 = 105 - r7
                int r6 = r6 * 3
                int r6 = 4 - r6
                byte[] r0 = o.getEndDate.IAuthTabCallback.$$a
                int r8 = r8 * 3
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r5 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r6]
            L26:
                int r7 = r7 + r3
                int r6 = r6 + 1
                r3 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getEndDate.IAuthTabCallback.$$c(int, int, byte):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(checkModelValidation checkmodelvalidation, String str, onExtraCallback onextracallback, getEndDate getenddate, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$tracker = checkmodelvalidation;
            this.$packageName = str;
            this.$attribution = onextracallback;
            this.this$0 = getenddate;
            this.$contentOwner = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$tracker, this.$packageName, this.$attribution, this.this$0, this.$contentOwner, this.$callbackProxy, access13800Var);
            int i2 = onExtraCallbackWithResult + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 74 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                iAuthTabCallbackCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 35;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    checkModelValidation checkmodelvalidation = this.$tracker;
                    String str2 = this.$packageName;
                    String strIAuthTabCallback = this.$attribution.IAuthTabCallback();
                    Map mapOnExtraCallback = this.$attribution.onExtraCallback();
                    this.label = 1;
                    obj = checkmodelvalidation.onNavigationEvent(str2, strIAuthTabCallback, mapOnExtraCallback, 3000L, this);
                    if (obj == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 27;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        Object[] objArr = new Object[1];
                        a(TextUtils.lastIndexOf("", '0', 0, 0) + 48, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43, new char[]{65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16}, false, 164 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                str = (String) obj;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
                str = null;
            }
            getEndDate.onNavigationEvent(this.this$0, this.$contentOwner, str, this.$packageName, this.$callbackProxy);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0174  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r23, int r24, char[] r25, boolean r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 391
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getEndDate.IAuthTabCallback.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }
    }

    private final void IAuthTabCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, String str2, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{38, 46, 94, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str2);
            str = sb.toString();
        }
        if (onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, str2)) {
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
            int i4 = asInterface + 111;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{84, 29, 0, 14}, true, new byte[]{0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1}, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{0, 11, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1}, objArr3);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr3[0]).intern(), (Map) null, 4, (Object) null);
    }

    private final boolean onNavigationEvent(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, String str2) {
        Object obj;
        int i = 2 % 2;
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            int i2 = IAuthTabCallbackStub + 55;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Intent intentOnWarmupCompleted = BufferedDecoder.onWarmupCompleted.onWarmupCompleted(context, Uri.parse(str), str2);
        if (intentOnWarmupCompleted == null) {
            int i4 = asInterface + 77;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intentOnWarmupCompleted, 1249, (Bundle) null, 4, (Object) null);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        boolean zOnNavigationEvent = Result.onNavigationEvent(obj);
        int i6 = IAuthTabCallbackStub + 95;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return zOnNavigationEvent;
    }

    private final onExtraCallback onExtraCallback(setText settext) throws Throwable {
        Map mapOnNavigationEvent;
        Set setEntrySet;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        b(View.MeasureSpec.getMode(0) + 8, ((Process.getThreadPriority(0) + 20) >> 6) + 11, new char[]{7, '\b', 65525, 65532, 5, 7, 7, 65524, 1, 2, 65532}, KeyEvent.normalizeMetaState(0) + 290, true, objArr);
        JsonObject jsonObjectOnExtraCallback = settext.onExtraCallback(((String) objArr[0]).intern(), new JsonObject());
        Object[] objArr2 = new Object[1];
        a(new int[]{113, 8, 0, 0}, true, new byte[]{0, 1, 1, 1, 1, 1, 1, 0}, objArr2);
        JsonElement jsonElement = jsonObjectOnExtraCallback.get(((String) objArr2[0]).intern());
        String asString = null;
        String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
        Object[] objArr3 = new Object[1];
        a(new int[]{121, 9, 153, 0}, true, new byte[]{1, 1, 0, 1, 0, 1, 1, 0, 1}, objArr3);
        if (!Intrinsics.areEqual(asString2, ((String) objArr3[0]).intern())) {
            int i2 = asInterface + 117;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        Object[] objArr4 = new Object[1];
        b(Process.getGidForName("") + 10, Color.alpha(0) + 16, new char[]{65527, '\b', 65527, 3, 65531, '\n', 65531, '\b', '\t', 65529, 11, '\t', '\n', 5, 3, 65510}, 287 - Gravity.getAbsoluteGravity(0, 0), false, objArr4);
        JsonObject asJsonObject = jsonObjectOnExtraCallback.getAsJsonObject(((String) objArr4[0]).intern());
        if (asJsonObject == null || (setEntrySet = asJsonObject.entrySet()) == null) {
            int i4 = IAuthTabCallbackStub + 91;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            mapOnNavigationEvent = null;
        } else {
            ArrayList<Map.Entry> arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((JsonElement) ((Map.Entry) obj).getValue()).isJsonPrimitive()) {
                    int i6 = IAuthTabCallbackStub + 71;
                    asInterface = i6 % 128;
                    if (i6 % 2 == 0) {
                        arrayList.add(obj);
                        int i7 = 27 / 0;
                    } else {
                        arrayList.add(obj);
                    }
                }
            }
            mapOnNavigationEvent = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (Map.Entry entry : arrayList) {
                int i8 = IAuthTabCallbackStub + 111;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.checkNotNull(entry);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback((String) entry.getKey(), ((JsonElement) entry.getValue()).getAsString());
                mapOnNavigationEvent.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
            }
        }
        if (mapOnNavigationEvent == null) {
            int i10 = asInterface + 11;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            mapOnNavigationEvent = access8100.onNavigationEvent();
            int i12 = asInterface + 81;
            IAuthTabCallbackStub = i12 % 128;
            int i13 = i12 % 2;
        }
        Object[] objArr5 = new Object[1];
        a(new int[]{130, 8, 0, 2}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1}, objArr5);
        JsonElement jsonElement2 = jsonObjectOnExtraCallback.get(((String) objArr5[0]).intern());
        if (jsonElement2 != null) {
            int i14 = IAuthTabCallbackStub + 55;
            asInterface = i14 % 128;
            if (i14 % 2 == 0) {
                jsonElement2.getAsString();
                throw null;
            }
            asString = jsonElement2.getAsString();
        }
        return new onExtraCallback(asString, mapOnNavigationEvent);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r21, int r22, char[] r23, int r24, boolean r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEndDate.b(int, int, char[], int, boolean, java.lang.Object[]):void");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 37;
                $10 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 34 - TextUtils.indexOf((CharSequence) "", '0'), 14238 - TextUtils.lastIndexOf("", '0', 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i10 = $11 + 87;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - MotionEvent.axisFromString("")), 65 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 16718 - (ViewConfiguration.getTouchSlop() >> 8), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 29, 17658 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getTapTimeout() >> 16)), 70 - View.MeasureSpec.makeMeasureSpec(0, 0), View.combineMeasuredStates(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $11 + 47;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 >>> i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 - i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i15, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i15);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i16 = $10 + 33;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 2 / 2;
                }
            }
        }
        String str = new String(cArr3);
        int i18 = $11 + 81;
        $10 = i18 % 128;
        if (i18 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{27244, 27146, 27142, 27140, 27147, 27149, 27164, 27160, 27143, 27140, 27137, 27230, 27143, 27173, 27175, 27196, 27181, 27183, 27199, 27175, 27170, 27199, 27168, 27175, 27173, 27192, 27168, 27170, 27199, 27168, 27175, 27151, 27145, 27168, 27145, 27143, 27172, 27178, 27181, 27266, 27292, 27294, 27265, 27386, 27356, 27331, 27363, 27266, 27274, 27269, 27391, 27366, 27271, 27267, 27271, 27273, 27272, 27369, 27368, 27273, 27266, 27362, 27361, 27295, 27265, 27264, 27271, 27366, 27368, 27272, 27264, 27265, 27361, 27369, 27276, 27268, 27270, 27277, 27270, 27267, 27385, 27388, 27274, 27360, 27257, 27175, 27172, 27169, 27145, 27145, 27199, 27140, 27148, 27178, 27174, 27172, 27179, 27181, 27175, 27170, 27176, 27172, 27197, 27198, 27173, 27146, 27148, 27175, 27173, 27172, 27171, 27173, 27146, 27255, 27173, 27178, 27176, 27169, 27196, 27198, 27199, 27339, 27466, 27462, 27461, 27468, 27467, 27460, 27463, 27471, 27262, 27180, 27174, 27172, 27174, 27179, 27174, 27168, 27180, 27269, 27267, 27264, 27266, 27272, 27269, 27268, 27270, 27268, 27379, 27254, 27174, 27180, 27177, 27176, 27178, 27176, 27159, 27161, 27177, 27175, 27148, 27146, 27168, 27143, 27143, 27173, 27173, 27197, 27169, 27171, 27173, 27178};
        IAuthTabCallback = 478309020;
    }
}
