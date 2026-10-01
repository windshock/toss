package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.UtilsKtExternalSyntheticLambda17;
import o.access3502;
import o.getPermissions;
import o.interceptPermissionModel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getPluginPermissionModel extends setScaleAndCenter {
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static long onNavigationEvent = 4948316597417868343L;
    private static int onTransact = -1776194565;
    private static char asInterface = 27643;

    private static String $$c(int i, int i2, byte b) {
        int i3 = i2 + 109;
        int i4 = b * 4;
        byte[] bArr = $$a;
        int i5 = (i * 4) + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i3 += i5;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i5];
            i5++;
            i3 += b2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPluginPermissionModel(@NotNull onNavigationEvent onnavigationevent) {
        super(onnavigationevent, (String) null, false, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        new getPermissions(this).onExtraCallback();
        new interceptPermissionModel(this).onNavigationEvent();
    }

    public final ArrayList<NativeKeyboardObserverSpec> onExtraCallback(@NotNull NativeReactDevToolsSettingsManagerSpec nativeReactDevToolsSettingsManagerSpec) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeReactDevToolsSettingsManagerSpec, "");
        int i2 = zzaj.onWarmupCompleted().onNavigationEvent().get(1);
        ArrayList<NativeKeyboardObserverSpec> arrayList = new ArrayList<>();
        String str = (String) NativeReactDevToolsSettingsManagerSpec.onNavigationEvent(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1478617677, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1478617678, new Object[]{nativeReactDevToolsSettingsManagerSpec}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
        String strAsBinder = nativeReactDevToolsSettingsManagerSpec.asBinder();
        String strOnExtraCallback = nativeReactDevToolsSettingsManagerSpec.onExtraCallback();
        Iterator it = nativeReactDevToolsSettingsManagerSpec.asInterface().iterator();
        int size = 0;
        while (it.hasNext()) {
            int i3 = asBinder + 97;
            IAuthTabCallbackStub = i3 % 128;
            size = i3 % 2 == 0 ? size - ((NativeRedBoxSpec) it.next()).IAuthTabCallbackDefault().size() : size + ((NativeRedBoxSpec) it.next()).IAuthTabCallbackDefault().size();
        }
        arrayList.add(new getPermissions.onExtraCallbackWithResult(str, strAsBinder, strOnExtraCallback, "총 " + size + "회"));
        String str2 = "";
        for (NativeRedBoxSpec nativeRedBoxSpec : nativeReactDevToolsSettingsManagerSpec.asInterface()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str3 = String.format("%d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(nativeRedBoxSpec.asBinder()), Integer.valueOf(nativeRedBoxSpec.IAuthTabCallbackStub())}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            if (!Intrinsics.areEqual(str2, str3)) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M월");
                Date date = CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult().parse(str3);
                Intrinsics.checkNotNull(date);
                String str4 = simpleDateFormat.format(date);
                if (i2 == nativeRedBoxSpec.asBinder()) {
                    arrayList.add(new interceptPermissionModel.onNavigationEvent(str4 + " 거래내역"));
                } else {
                    arrayList.add(new interceptPermissionModel.onNavigationEvent(nativeRedBoxSpec.asBinder() + "년 " + str4 + " 거래내역"));
                }
                str2 = str3;
            }
            arrayList.add(nativeRedBoxSpec);
            arrayList.addAll(onExtraCallback(nativeRedBoxSpec.IAuthTabCallbackDefault()));
        }
        if (arrayList.size() == 1) {
            Object[] objArr = new Object[1];
            a((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 20633), (-1935615562) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{31405, 59191, 25658, 27997, 40915, 63346, 41571, 20301, 17432, 15441, 56781, 14969, 14811, 40867, 43778, 61466, 24520, 1662, 28067, 19054, 4970, 37077, 58852, 55581, 27144, 8805, 56741, 15246, 60249, 15941, 1978, 27584, 57408, 17069, 38309, 33628, 56335, 50423, 28872, 51663, 63659, 29122, 61985, 31007, 46836, 142, 22967, 21982, 11965, 48495, 42492, 35938, 4038, 15415, 8533}, new char[]{38860, 63331, 65420, 10385}, new char[]{46373, 41177, 39052, 5456}, objArr);
            arrayList.add(new access3502.IAuthTabCallback("내역이 없어요", ((String) objArr[0]).intern(), ""));
            int i4 = asBinder + 45;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return arrayList;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 69;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    int iMakeMeasureSpec = 43 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iAlpha = 1451 - Color.alpha(0);
                    byte b = $$a[3];
                    byte b2 = (byte) (b - 1);
                    byte b3 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iMakeMeasureSpec, iAlpha, 228868077, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char c2 = (char) (49123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int iArgb = 44 - Color.argb(0, 0, 0, 0);
                    int iRgb = (-16775722) - Color.rgb(0, 0, 0);
                    byte b4 = (byte) ($$a[3] - 1);
                    byte b5 = b4;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iArgb, iRgb, 1533236389, false, $$c(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.getOffsetAfter("", 0)), ExpandableListView.getPackedPositionType(0L) + 50, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - Color.argb(0, 0, 0, 0)), 28 - ImageFormat.getBitsPerPixel(0), TextUtils.lastIndexOf("", '0', 0, 0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onTransact ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 107;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
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
}
