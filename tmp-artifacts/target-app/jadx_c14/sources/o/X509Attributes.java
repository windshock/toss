package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class X509Attributes implements ALCFaceResult {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = onExtraCallbackWithResult;
        int i5 = ((i4 | 63) << 1) - (i4 ^ 63);
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        int i5 = IAuthTabCallback;
        int i6 = ((i5 | 71) << 1) - (i5 ^ 71);
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i5 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = (i4 ^ 33) + ((i4 & 33) << 1);
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i6 == 0) {
            throw null;
        }
        int i7 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = (i2 & 119) + (i2 | 119);
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onExtraCallbackWithResult;
        int i5 = (i4 ^ 93) + ((i4 & 93) << 1);
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onExtraCallbackWithResult;
        int i5 = (i4 ^ 11) + ((i4 & 11) << 1);
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<Unit, access13800<? super Unit>, Object> {
        final /* synthetic */ String $callback;
        final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
        int label;
        private static final byte[] $$a = {48, -42, 66, -37};
        private static final int $$b = 138;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 478308940;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r7, byte r8, byte r9) {
            /*
                byte[] r0 = o.X509Attributes.onExtraCallback.$$a
                int r7 = r7 * 2
                int r7 = 3 - r7
                int r9 = r9 * 2
                int r9 = r9 + 105
                int r8 = r8 * 3
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r9 = r7
                r3 = r8
                r4 = r2
                goto L2c
            L17:
                r3 = r2
                r6 = r9
                r9 = r7
                r7 = r6
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r9 = r9 + 1
                if (r4 != r8) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L2a:
                r3 = r0[r9]
            L2c:
                int r7 = r7 + r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.X509Attributes.onExtraCallback.$$c(byte, byte, byte):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, String str, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$callbackProxy = settopguidebackgroundcolor;
            this.$callback = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$callbackProxy, this.$callback, access13800Var);
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((Unit) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(Unit unit, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(unit, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 17 / 0;
            }
            int i5 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        
            if (r1 != null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        
            r1 = o.X509Attributes.onExtraCallback.IAuthTabCallback;
            r2 = r1 + 17;
            o.X509Attributes.onExtraCallback.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
            r1 = r1 + 15;
            o.X509Attributes.onExtraCallback.onExtraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
            r1 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        
            o.setTopGuideBackgroundColor.onExtraCallbackWithResult(r10, r1, (kotlin.jvm.functions.Function1) null, 2, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            r0 = new java.lang.Object[1];
            a(android.view.View.resolveSizeAndState(0, 0, 0) + 47, android.graphics.Color.red(0) + 26, new char[]{'\r', 65483, 65476, '\t', 22, 19, '\n', '\t', 6, 65476, 65483, '\t', 17, 25, 23, '\t', 22, 65483, 65476, 19, 24, 65476, 16, 16, 5, 7, '\t', 18, '\r', 24, 25, 19, 22, 19, 7, 65476, '\f', 24, '\r', 27, 65476, 65483, '\t', 15, 19, 26, 18}, true, 193 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        
            throw new java.lang.IllegalStateException(((java.lang.String) r0[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r9.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r9.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r10);
            r10 = r9.$callbackProxy;
            r1 = r9.$callback;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.X509Attributes.onExtraCallback.IAuthTabCallback
                int r1 = r1 + 93
                int r2 = r1 % 128
                o.X509Attributes.onExtraCallback.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L17
                int r1 = r9.label
                r3 = 55
                int r3 = r3 / r2
                if (r1 != 0) goto L3d
                goto L1b
            L17:
                int r1 = r9.label
                if (r1 != 0) goto L3d
            L1b:
                kotlin.ResultKt.onNavigationEvent(r10)
                o.setTopGuideBackgroundColor r10 = r9.$callbackProxy
                java.lang.String r1 = r9.$callback
                if (r1 != 0) goto L36
                int r1 = o.X509Attributes.onExtraCallback.IAuthTabCallback
                int r2 = r1 + 17
                int r3 = r2 % 128
                o.X509Attributes.onExtraCallback.onExtraCallbackWithResult = r3
                int r2 = r2 % r0
                int r1 = r1 + 15
                int r2 = r1 % 128
                o.X509Attributes.onExtraCallback.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                java.lang.String r1 = ""
            L36:
                r2 = 0
                o.setTopGuideBackgroundColor.onExtraCallbackWithResult(r10, r1, r2, r0, r2)
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L3d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                int r0 = android.view.View.resolveSizeAndState(r2, r2, r2)
                r1 = 47
                int r3 = r0 + 47
                int r0 = android.graphics.Color.red(r2)
                int r4 = r0 + 26
                char[] r5 = new char[r1]
                r5 = {x0070: FILL_ARRAY_DATA , data: [13, -53, -60, 9, 22, 19, 10, 9, 6, -60, -53, 9, 17, 25, 23, 9, 22, -53, -60, 19, 24, -60, 16, 16, 5, 7, 9, 18, 13, 24, 25, 19, 22, 19, 7, -60, 12, 24, 13, 27, -60, -53, 9, 15, 19, 26, 18} // fill-array
                r6 = 1
                r0 = 0
                float r1 = android.util.TypedValue.complexToFraction(r2, r0, r0)
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                int r7 = 193 - r0
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r8 = r0
                a(r3, r4, r5, r6, r7, r8)
                r0 = r0[r2]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.X509Attributes.onExtraCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0173  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.X509Attributes.onExtraCallback.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = (i2 & 11) + (i2 | 11);
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i5 = onExtraCallbackWithResult;
        int i6 = (i5 & 55) + (i5 | 55);
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            int i7 = 76 / 0;
        } else {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        }
        String strOnExtraCallback = new setText(jsonObject).onExtraCallback();
        int i8 = onExtraCallbackWithResult;
        int i9 = ((i8 | 45) << 1) - (i8 ^ 45);
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        IAnimation iAnimationOnWarmupCompleted = TextFieldKeyInputExternalSyntheticLambda8.onWarmupCompleted(UST_CERT_GetPublicKeyInfo.onWarmupCompleted.prefetchWithMultipleUrls(), webViewContentOwner.getLifecycle(), TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
        onExtraCallback onextracallback = new onExtraCallback(settopguidebackgroundcolor, strOnExtraCallback, null);
        int i11 = onExtraCallbackWithResult;
        int i12 = (i11 ^ 47) + ((i11 & 47) << 1);
        IAuthTabCallback = i12 % 128;
        int i13 = i12 % 2;
        ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(iAnimationOnWarmupCompleted, onextracallback), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(webViewContentOwner));
        int i14 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i14 % 128;
        int i15 = i14 % 2;
    }
}
