package viva.republica.toss.common.web.message.handlers;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.features.ocr.models.appbridge.AppBridgeOcrResultModel;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseRoundCornerProgressBarSavedState1;
import o.ConvertFloatArrayToByteArray;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.castToByte;
import o.castToDate;
import o.findResAndMsg;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RequestIdCardOcrHandler$processOcrPayload$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super JsonObject>, Object> {
    final /* synthetic */ BaseRoundCornerProgressBarSavedState1.IAuthTabCallback $algorithm;
    final /* synthetic */ boolean $includeFrameImage;
    final /* synthetic */ boolean $includeImageFrames;
    final /* synthetic */ boolean $includeMarkedFrameImage;
    final /* synthetic */ boolean $includeMarkedImage;
    final /* synthetic */ Boolean $isFakeIdCard;
    final /* synthetic */ int $maxImageFrames;
    final /* synthetic */ String $rsaKey;
    int label;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static long onNavigationEvent = 7798559133331975163L;
    private static int onWarmupCompleted = -1776194565;
    private static char onExtraCallbackWithResult = 57217;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, int r8) {
        /*
            int r7 = 110 - r7
            byte[] r0 = viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$processOcrPayload$2.$$a
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r7 = r8
            r5 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$processOcrPayload$2.$$c(short, int, int):java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestIdCardOcrHandler$processOcrPayload$2(String str, boolean z, boolean z2, boolean z3, int i, Boolean bool, boolean z4, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, access13800<? super RequestIdCardOcrHandler$processOcrPayload$2> access13800Var) {
        super(2, access13800Var);
        this.$rsaKey = str;
        this.$includeImageFrames = z;
        this.$includeMarkedFrameImage = z2;
        this.$includeFrameImage = z3;
        this.$maxImageFrames = i;
        this.$isFakeIdCard = bool;
        this.$includeMarkedImage = z4;
        this.$algorithm = iAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Ref.ObjectRef objectRef, String str, boolean z, boolean z2, boolean z3, int i, Boolean bool, boolean z4, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, castToByte casttobyte) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onWarmupCompleted(objectRef, str, z, z2, z3, i, bool, z4, iAuthTabCallback, casttobyte);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(objectRef, str, z, z2, z3, i, bool, z4, iAuthTabCallback, casttobyte);
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RequestIdCardOcrHandler$processOcrPayload$2 requestIdCardOcrHandler$processOcrPayload$2 = new RequestIdCardOcrHandler$processOcrPayload$2(this.$rsaKey, this.$includeImageFrames, this.$includeMarkedFrameImage, this.$includeFrameImage, this.$maxImageFrames, this.$isFakeIdCard, this.$includeMarkedImage, this.$algorithm, access13800Var);
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return requestIdCardOcrHandler$processOcrPayload$2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super JsonObject> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = 28 / 0;
        } else {
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
        }
        int i4 = onExtraCallback + 27;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super JsonObject> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RequestIdCardOcrHandler$processOcrPayload$2 requestIdCardOcrHandler$processOcrPayload$2Create = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return requestIdCardOcrHandler$processOcrPayload$2Create.invokeSuspend(unit);
        }
        requestIdCardOcrHandler$processOcrPayload$2Create.invokeSuspend(unit);
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
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
        int i4 = $10 + 119;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 123;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43;
                    int i8 = 1451 - (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1));
                    byte b = (byte) i3;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), maximumFlingVelocity, i8, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49122);
                    int keyRepeatTimeout = 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i9 = 1495 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b3 = (byte) i3;
                    byte b4 = (byte) (b3 + 1);
                    String str$$c2 = $$c(b3, b4, (byte) (b4 - 1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, keyRepeatTimeout, i9, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i10 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i3] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 23972);
                    int iGreen = 50 - Color.green(i3);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3) + 22939;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i3] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, iGreen, iMakeMeasureSpec, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i3] = Integer.valueOf(i11);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char cResolveSize = (char) (View.resolveSize(i3, i3) + 45848);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29;
                    int i12 = 12578 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    c2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i3] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, maximumDrawingCacheSize, i12, 1401536470, false, "l", clsArr4);
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onWarmupCompleted ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
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
        objArr[0] = new String(cArr6);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.label != 0) {
            Object[] objArr = new Object[1];
            a((char) (ViewConfiguration.getEdgeSlop() >> 16), 1408563335 + (ViewConfiguration.getScrollBarSize() >> 8), new char[]{32398, 37905, 16634, 31204, 43468, 48477, 35225, 30181, 44318, 39983, 47628, 2121, 43303, 26619, 6553, 55193, 55274, 13595, 43851, 42010, 2996, 38664, 37667, 13703, 63269, 32154, 49456, 46041, 31909, 53043, 54515, 55313, 32996, 4721, 63649, 18837, 45285, 61825, 32106, 1171, 51390, 14978, 46298, 62279, 61888, 8455, 19099}, new char[]{0, 0, 0, 0}, new char[]{34660, 62712, 40787, 64699}, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        ResultKt.onNavigationEvent(obj);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new JsonObject();
        castToDate casttodate = castToDate.onWarmupCompleted;
        final String str = this.$rsaKey;
        final boolean z = this.$includeImageFrames;
        final boolean z2 = this.$includeMarkedFrameImage;
        final boolean z3 = this.$includeFrameImage;
        final int i4 = this.$maxImageFrames;
        final Boolean bool = this.$isFakeIdCard;
        final boolean z4 = this.$includeMarkedImage;
        final BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback = this.$algorithm;
        casttodate.onExtraCallback(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$processOcrPayload$2$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return RequestIdCardOcrHandler$processOcrPayload$2.onExtraCallbackWithResult(objectRef, str, z, z2, z3, i4, bool, z4, iAuthTabCallback, (castToByte) obj2);
            }
        });
        Object obj2 = objectRef.element;
        int i5 = IAuthTabCallback + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return obj2;
    }

    private static final Unit onWarmupCompleted(Ref.ObjectRef objectRef, String str, boolean z, boolean z2, boolean z3, int i, Boolean bool, boolean z4, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, castToByte casttobyte) throws Throwable {
        JsonObject jsonObjectOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (casttobyte == null) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1568988013 + (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{1164, 24687, 44194, 44659, 17476, 42868, 65310, 42682, 31894, 16481, 16418, 60174, 32275, 7901, 44635, 23626, 38726, 58636, 55415, 34361, 61924, 10342, 16878}, new char[]{0, 0, 0, 0}, new char[]{28024, 34011, 2141, 2506}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((char) (TextUtils.indexOf((CharSequence) "", '0') + 12327), 1879897161 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{46014, 24356, 31171, 42301, 41640, 3282, 5073, 13889, 32260, 8595, 7246, 63153, 32461, 58070, 53289, 5026, 61101}, new char[]{0, 0, 0, 0}, new char[]{18691, 3316, 9840, 55600}, objArr2);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        }
        if (casttobyte == null) {
            jsonObjectOnExtraCallback = new JsonObject();
        } else if (str.length() == 0) {
            int i5 = IAuthTabCallback + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr3 = {casttobyte, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i), bool, Boolean.valueOf(z4), false, false, false, null, 960, null};
            jsonObjectOnExtraCallback = ((AppBridgeOcrResultModel) castToByte.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1593654896, -1593654879, objArr3)).IAuthTabCallback();
        } else {
            Object[] objArr4 = {casttobyte, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i), bool, Boolean.valueOf(z4), false, false, false, null, 960, null};
            jsonObjectOnExtraCallback = AppBridgeOcrResultModel.onExtraCallback((AppBridgeOcrResultModel) castToByte.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1593654896, -1593654879, objArr4), str, iAuthTabCallback, false, 4, (Object) null);
            int i7 = onExtraCallback + 1;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        objectRef.element = jsonObjectOnExtraCallback;
        return Unit.INSTANCE;
    }
}
