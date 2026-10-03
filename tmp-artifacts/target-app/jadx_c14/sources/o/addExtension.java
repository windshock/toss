package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.verify.unblock.UnblockSessionActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class addExtension implements ALCFaceQuality {
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {84, 79, 22, 41};
    private static final int $$b = 150;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = -1201716532;
    private static int onExtraCallback = -1538795483;
    private static int IAuthTabCallback = -1409566999;
    private static byte[] onNavigationEvent = {-3, -1, 45, -31, 0, -4, 11, 2, -4, -15, -9, 14, -2, 8, 6, 26, -32, 0, -4, 11, 2, -4, -15, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, int r8, short r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 115
            byte[] r0 = o.addExtension.$$a
            int r7 = r7 + 4
            int r9 = r9 * 4
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r7]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addExtension.$$c(byte, int, short):java.lang.String");
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onExtraCallback();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i3 = asBinder + 55;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = asBinder + 87;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a((short) (Process.myTid() >> 22), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 471374532, (-264007275) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 34, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            return;
        }
        UnblockSessionActivity.onNavigationEvent onnavigationevent = UnblockSessionActivity.Companion;
        Object[] objArr2 = new Object[1];
        a((short) Color.green(0), (byte) View.getDefaultSize(0, 0), (-471374522) - ExpandableListView.getPackedPositionType(0L), (-264007276) - Gravity.getAbsoluteGravity(0, 0), (-31) - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((short) ((-1) - ImageFormat.getBitsPerPixel(0)), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-471374522) - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) - 264007276, (-31) - ExpandableListView.getPackedPositionType(0L), objArr3);
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, UnblockSessionActivity.onNavigationEvent.onExtraCallback(onnavigationevent, context, strOnNavigationEvent, strIntern, ((String) objArr3[0]).intern(), (String) null, 16, (Object) null), 301, (Bundle) null, 4, (Object) null);
        int i2 = asBinder + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i2 == -1) {
            int i4 = asBinder + 85;
            asInterface = i4 % 128;
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, i4 % 2 == 0 ? 0 : 1, (Object) null);
            int i5 = asInterface + 121;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x027f A[PHI: r3
      0x027f: PHI (r3v9 int) = (r3v8 int), (r3v41 int) binds: [B:57:0x027d, B:54:0x026b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0289 A[PHI: r3
      0x0289: PHI (r3v38 int) = (r3v8 int), (r3v41 int) binds: [B:57:0x027d, B:54:0x026b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r24, byte r25, int r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addExtension.a(short, byte, int, int, int, java.lang.Object[]):void");
    }
}
