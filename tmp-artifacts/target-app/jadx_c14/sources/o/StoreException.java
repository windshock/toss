package o;

import android.os.Process;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class StoreException implements CollectionStore {
    private final GraniteBrownfieldModule_closeView IAuthTabCallback;
    private CharSequence onExtraCallbackWithResult;
    private final GraniteBrownfieldModule_closeView onNavigationEvent;
    private static final byte[] $$a = {113, 66, 51, 67};
    private static final int $$b = 151;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted = 478308880;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = o.StoreException.$$a
            int r6 = r6 * 2
            int r6 = 105 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StoreException.$$c(short, byte, int):java.lang.String");
    }

    public StoreException(@NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, @NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView2) {
        Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
        Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView2, "");
        this.IAuthTabCallback = graniteBrownfieldModule_closeView;
        this.onNavigationEvent = graniteBrownfieldModule_closeView2;
    }

    public final GraniteBrownfieldModule_closeView onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.IAuthTabCallback;
        int i4 = i2 + 69;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return graniteBrownfieldModule_closeView;
    }

    public final GraniteBrownfieldModule_closeView IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.CollectionStore
    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return "";
        }
        int i3 = 31 / 0;
        return "";
    }

    @Override // o.CollectionStore
    public List<String> IAuthTabCallback() {
        int i = 2 % 2;
        String strAsInterface = asInterface();
        if (strAsInterface == null) {
            int i2 = IAuthTabCallbackStub + 3;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            strAsInterface = "";
        }
        List<String> listListOf = CollectionsKt.listOf(strAsInterface);
        int i3 = IAuthTabCallbackStub + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return listListOf;
    }

    @Override // o.CollectionStore
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallback.length() != 6) {
            return true;
        }
        int i4 = IAuthTabCallbackStub + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            if (this.onNavigationEvent.length() != 11) {
                return true;
            }
        } else if (this.onNavigationEvent.length() != 7) {
            return true;
        }
        int i5 = IAuthTabCallbackStub + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.destroy();
        this.onNavigationEvent.destroy();
        int i4 = IAuthTabCallbackStub + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 15;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = charSequence;
        int i5 = i2 + 73;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private final String asInterface() {
        Object obj;
        String strOnExtraCallbackWithResult;
        CharSequence charSequence;
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        try {
            Result.Companion companion = Result.Companion;
            if (onNavigationEvent() || (charSequence = this.onExtraCallbackWithResult) == null) {
                strOnExtraCallbackWithResult = null;
            } else {
                Object[] objArr = new Object[1];
                a((ViewConfiguration.getTapTimeout() >> 16) + 3, 2 - KeyEvent.normalizeMetaState(0), new char[]{7, 65525, 6}, false, 133 - ExpandableListView.getPackedPositionGroup(0L), objArr);
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new X509EncodedKeySpec(Page.onNavigationEvent(charSequence.toString(), 0, 1, (Object) null)));
                Object[] objArr2 = new Object[1];
                a(19 - Process.getGidForName(""), 19 - MotionEvent.axisFromString(""), new char[]{4, 5, 65523, 65505, 65527, 65525, 65524, 65505, 2, 65533, 65525, 5, 65507, 2, 19, 22, 22, 27, ' ', 25}, false, (ViewConfiguration.getTapTimeout() >> 16) + 135, objArr2);
                Cipher cipher = Cipher.getInstance(((String) objArr2[0]).intern());
                cipher.init(1, publicKeyGeneratePublic);
                byte[] bArrDoFinal = cipher.doFinal(new GraniteBrownfieldModule_closeView(ArraysKt.plus(ArraysKt.plus(this.IAuthTabCallback.onExtraCallback(), '-'), this.onNavigationEvent.onExtraCallback())).onWarmupCompleted());
                Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
                strOnExtraCallbackWithResult = Page.onExtraCallbackWithResult(bArrDoFinal, 0, 1, (Object) null);
            }
            obj = Result.constructor-impl(strOnExtraCallbackWithResult);
            int i4 = onExtraCallback + 105;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i6 = IAuthTabCallbackStub + 13;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("IssueData", th2);
                throw null;
            }
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("IssueData", th2);
        }
        if (Result.onExtraCallback(obj)) {
            int i7 = onExtraCallback + 33;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        } else {
            obj2 = obj;
        }
        return (String) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r23, int r24, char[] r25, boolean r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StoreException.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }
}
