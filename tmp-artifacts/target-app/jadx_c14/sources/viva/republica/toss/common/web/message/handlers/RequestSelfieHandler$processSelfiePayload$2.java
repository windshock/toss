package viva.republica.toss.common.web.message.handlers;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseRoundCornerProgressBarSavedState1;
import o.Page;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.alreadyInitialized;
import o.createFragment4App;
import o.decodeUrlContent;
import o.findResAndMsg;
import o.zzba;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RequestSelfieHandler$processSelfiePayload$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super JsonObject>, Object> {
    final /* synthetic */ BaseRoundCornerProgressBarSavedState1.IAuthTabCallback $algorithm;
    final /* synthetic */ boolean $includeAdditionalSamplings;
    final /* synthetic */ boolean $includeLivenessFaceImages;
    final /* synthetic */ String $rsaKey;
    final /* synthetic */ byte[] $selfieImage;
    int label;
    private static final byte[] $$a = {74, 75, -50, -9};
    private static final int $$b = 55;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static long onWarmupCompleted = 614802675531273264L;
    private static int onNavigationEvent = -1776194565;
    private static char onExtraCallbackWithResult = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, short r9) {
        /*
            byte[] r0 = viva.republica.toss.common.web.message.handlers.RequestSelfieHandler$processSelfiePayload$2.$$a
            int r8 = r8 + 109
            int r9 = r9 * 2
            int r9 = r9 + 4
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r7
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r3 = r3 + 1
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestSelfieHandler$processSelfiePayload$2.$$c(int, int, short):java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestSelfieHandler$processSelfiePayload$2(byte[] bArr, String str, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, boolean z, boolean z2, access13800<? super RequestSelfieHandler$processSelfiePayload$2> access13800Var) {
        super(2, access13800Var);
        this.$selfieImage = bArr;
        this.$rsaKey = str;
        this.$algorithm = iAuthTabCallback;
        this.$includeAdditionalSamplings = z;
        this.$includeLivenessFaceImages = z2;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super JsonObject> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = onExtraCallback + 87;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RequestSelfieHandler$processSelfiePayload$2 requestSelfieHandler$processSelfiePayload$2 = new RequestSelfieHandler$processSelfiePayload$2(this.$selfieImage, this.$rsaKey, this.$algorithm, this.$includeAdditionalSamplings, this.$includeLivenessFaceImages, access13800Var);
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return requestSelfieHandler$processSelfiePayload$2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onExtraCallback + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objIAuthTabCallback;
        }
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 33;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int maximumFlingVelocity = 43 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int modifierMetaStateMask2 = 1450 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b = (byte) i3;
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(modifierMetaStateMask, maximumFlingVelocity, modifierMetaStateMask2, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i3;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - KeyEvent.normalizeMetaState(i3)), 44 - (ViewConfiguration.getEdgeSlop() >> 16), 1494 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 23972), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, 22939 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 45848), (ViewConfiguration.getScrollBarSize() >> 8) + 29, View.resolveSize(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 81;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this.label != 0) {
            Object[] objArr = new Object[1];
            a((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1060696581, new char[]{5269, 9583, 44739, 32702, 22034, 50972, 6111, 30000, 45991, 57006, 48404, 19490, 8447, 49503, 10669, 35264, 21428, 29096, 31240, 43300, 64021, 33226, 46328, 22286, 51241, 20180, 43292, 58229, 31827, 59759, 47200, 39171, 23266, 57538, 40005, 1475, 9196, 16076, 7974, 26412, 23441, 64770, 56715, 36303, 46929, 52017, 57292}, new char[]{16331, 15393, 15344, 25778}, new char[]{1338, 14578, 11839, 15181}, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        int i5 = i2 + 3;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        ResultKt.onNavigationEvent(obj);
        if (this.$selfieImage == null) {
            return new JsonObject();
        }
        List list2 = null;
        if (this.$rsaKey.length() == 0) {
            return new decodeUrlContent(Page.onExtraCallbackWithResult(this.$selfieImage, 0, 1, (Object) null)).onNavigationEvent();
        }
        JsonObject jsonObjectIAuthTabCallback = new decodeUrlContent(Page.onExtraCallbackWithResult(this.$selfieImage, 0, 1, (Object) null)).IAuthTabCallback(this.$rsaKey, this.$algorithm);
        boolean z = this.$includeAdditionalSamplings;
        String str = this.$rsaKey;
        BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback = this.$algorithm;
        boolean z2 = this.$includeLivenessFaceImages;
        if (z) {
            try {
                Result.Companion companion = Result.Companion;
                list = Result.constructor-impl(createFragment4App.onExtraCallback.onExtraCallbackWithResult());
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                list = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                list = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            Result.exceptionOrNull-impl(list);
            if (Result.onExtraCallback(list)) {
                int i7 = onExtraCallback + 113;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    list2.hashCode();
                    throw null;
                }
            } else {
                list2 = list;
            }
            list2 = list2;
            createFragment4App.onExtraCallback.IAuthTabCallback();
        }
        if (list2 != null) {
            Object[] objArr2 = new Object[1];
            a((char) (23750 - Color.argb(0, 0, 0, 0)), View.MeasureSpec.getMode(0) - 423316029, new char[]{15406, 16937, 58771, 35727, 8820, 61790, 55415, 5515, 27576, 33985, 241, 3480, 59159, 22693, 38782, 34534, 5899, 31156, 24329}, new char[]{16331, 15393, 15344, 25778}, new char[]{49968, 50357, 50918, 3420}, objArr2);
            jsonObjectIAuthTabCallback.add(((String) objArr2[0]).intern(), BaseRoundCornerProgressBarSavedState1.onExtraCallbackWithResult.onExtraCallback(str, list2, iAuthTabCallback));
        }
        if (z2) {
            List listOnExtraCallbackWithResult = alreadyInitialized.onExtraCallback.onExtraCallbackWithResult();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnExtraCallbackWithResult, 10));
            Iterator it = listOnExtraCallbackWithResult.iterator();
            int i8 = onExtraCallback + 33;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            while (it.hasNext()) {
                arrayList.add(zzba.onExtraCallbackWithResult((Bitmap) ((Pair) it.next()).getFirst(), 92));
            }
            if (!arrayList.isEmpty()) {
                Object[] objArr3 = new Object[1];
                a((char) (26491 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Color.blue(0), new char[]{49353, 44891, 18186, 51867, 35572, 38821, 25033, 37711, 17319, 43059, 23977, 4929, 47525, 62750, 9434, 65508, 56349, 52083}, new char[]{16331, 15393, 15344, 25778}, new char[]{50010, 45726, 31574, 13671}, objArr3);
                jsonObjectIAuthTabCallback.add(((String) objArr3[0]).intern(), BaseRoundCornerProgressBarSavedState1.onExtraCallbackWithResult.onExtraCallback(str, arrayList, iAuthTabCallback));
            }
            alreadyInitialized.onExtraCallback.onWarmupCompleted();
        }
        return jsonObjectIAuthTabCallback;
    }
}
