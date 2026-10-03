package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.send.periodic.PeriodicTransferPostActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UserNotice implements ALCFaceQuality {
    public static final onExtraCallbackWithResult Companion;
    private static char[] IAuthTabCallback;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static final byte[] $$a = {126, 1, 26, -71};
    private static final int $$b = 139;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = o.UserNotice.$$a
            int r8 = r8 * 4
            int r8 = 97 - r8
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UserNotice.$$c(byte, short, byte):java.lang.String");
    }

    static {
        onExtraCallback = 0;
        onWarmupCompleted();
        Companion = new onExtraCallbackWithResult(null);
        int i = onWarmupCompleted + 7;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        boolean z = i2 % 2 != 0;
        int i4 = i3 + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = IAuthTabCallbackDefault + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = IAuthTabCallbackDefault + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 85;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onNavigationEvent + 49;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            return;
        }
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, PeriodicTransferPostActivity.onWarmupCompleted.onNavigationEvent(PeriodicTransferPostActivity.Companion, context, ModuleSpecCompanion.Companion.onExtraCallback(new setText(jsonObject).onExtraCallbackWithResult()), false, true, (String) null, 4, (Object) null), 5001, (Bundle) null, 4, (Object) null);
        int i4 = onNavigationEvent + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        NativeArrayCompanion nativeArrayCompanion;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 79;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i != 5001) {
            return;
        }
        if (i2 == -1) {
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
            return;
        }
        if (bundle != null) {
            Object[] objArr = new Object[1];
            a(View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 23, (char) (ExpandableListView.getPackedPositionChild(0L) + 14785), objArr);
            nativeArrayCompanion = (NativeArrayCompanion) bundle.getParcelable(((String) objArr[0]).intern());
        } else {
            nativeArrayCompanion = null;
        }
        if (nativeArrayCompanion == null) {
            Object[] objArr2 = new Object[1];
            a(23 - TextUtils.indexOf("", ""), View.MeasureSpec.getMode(0) + 8, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), objArr2);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, "", ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
        } else {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, nativeArrayCompanion.IAuthTabCallback(), nativeArrayCompanion.onWarmupCompleted(), (Map) null, 4, (Object) null);
            int i6 = IAuthTabCallbackDefault + 75;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r27, int r28, char r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UserNotice.a(int, int, char, java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{54372, 53295, 56538, 55655, 50435, 49574, 52809, 51941, 63163, 62254, 65482, 58495, 57362, 60577, 59734, 38387, 37254, 40565, 39661, 34460, 33598, 36813, 46194, 60823, 59851, 58662, 57485, 64745, 63566, 63397, 62210};
        onExtraCallbackWithResult = 2459648369560643978L;
    }
}
