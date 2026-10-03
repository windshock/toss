package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.JsonObject;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setSubject implements ALCFaceQuality {
    private static final byte[] $$a = {11, -55, -20, -91};
    private static final int $$b = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onExtraCallback = 478308888;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, byte r7) {
        /*
            byte[] r0 = o.setSubject.$$a
            int r5 = r5 * 4
            int r5 = 105 - r5
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r5 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r4 = -r4
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubject.$$c(byte, int, byte):java.lang.String");
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        onOutOfMemory onoutofmemoryOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
            int i3 = 47 / 0;
        } else {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        }
        int i4 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onoutofmemoryOnExtraCallback;
        }
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            int i6 = 84 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r1 = new o.setText(r24);
        r15 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, new char[]{65533, 6, 65529, 5}, false, 153 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), r15);
        r8 = r1.onNavigationEvent(((java.lang.String) r15[0]).intern(), "");
        r12 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 11, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 5, new char[]{65532, 5, 6, 65535, 7, '\t', 65532, 65529, 4, '\f', 65509}, true, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 154, r12);
        r1 = r1.onNavigationEvent(((java.lang.String) r12[0]).intern(), "");
        r12 = new java.lang.Object[1];
        a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, android.view.KeyEvent.getDeadChar(0, 0) + 27, new char[]{65524, 65511, 65525, 65520, 65515, 65488, 16, 17, 11, 22, 5, 3, 65488, 22, 16, 7, 22, 16, 11, 65488, 6, 11, 17, 20, 6, 16, 3, 65526}, true, 142 - android.text.TextUtils.lastIndexOf("", '0'), r12);
        r9 = new android.content.Intent(((java.lang.String) r12[0]).intern());
        r5 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r12 = new java.lang.Object[1];
        a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 34, 4 - android.text.TextUtils.getCapsMode("", 0, 0), new char[]{65482, 0, '\n', 18, 16, 65535, 65533, 16, '\n', 11, 65535, 65531, 19, 65533, 14, 65483, 14, 5, 0, 65482, 14, 11, 15, 14, 17, 65535, 65482, 0, 5, 11, 14, 0, '\n', 65533}, true, (android.os.Process.myTid() >> 22) + 149, r12);
        r9.setDataAndType(r5, ((java.lang.String) r12[0]).intern());
        r10 = new java.lang.Object[1];
        a(4 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), -((byte) android.view.KeyEvent.getModifierMetaStateMask()), new char[]{65533, 6, 65529, 5}, false, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 153, r10);
        r9.putExtra(((java.lang.String) r10[0]).intern(), r8);
        r6 = new java.lang.Object[1];
        a(android.view.View.resolveSize(0, 0) + 5, 1 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), new char[]{65530, 5, 65533, 4, 3}, false, android.graphics.Color.alpha(0) + 156, r6);
        r9.putExtra(((java.lang.String) r6[0]).intern(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x018a, code lost:
    
        r0.startActivity(r9);
        o.setOnOutOfMemeryErrorCallback.onExtraCallback(r25, (kotlin.jvm.functions.Function1) null, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0192, code lost:
    
        r0 = o.setSubject.onWarmupCompleted + 45;
        o.setSubject.onExtraCallbackWithResult = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x019b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x019c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x019d, code lost:
    
        o.ALCFaceBox.onExtraCallbackWithResult(r25, r0, (java.lang.String) null, (java.util.Map) null, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r0 = o.setSubject.onWarmupCompleted + 121;
        o.setSubject.onExtraCallbackWithResult = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r24, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubject.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r23, int r24, char[] r25, boolean r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubject.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }
}
