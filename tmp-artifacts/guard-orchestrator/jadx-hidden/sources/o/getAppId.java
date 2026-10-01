package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppNode61;
import o.makePFX_WINS;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class getAppId {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static long onExtraCallback;
    private static final List<String> onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final getAppId onWarmupCompleted;

    private getAppId() {
    }

    static {
        onExtraCallbackWithResult();
        onWarmupCompleted = new getAppId();
        Object[] objArr = new Object[1];
        a((char) (28681 - Color.argb(0, 0, 0, 0)), View.getDefaultSize(0, 0) + 1010234143, new char[]{27929, 26839, 24139, 17100, 12543, 31965, 44995, 8100, 51973, 3272, 18250, 11290, 52035, 58914, 15816, 10277, 52335}, new char[]{12464, 30568, 32307, 22434}, new char[]{8092, 14067, 2364, 61552}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (40828 - View.resolveSize(0, 0)), View.MeasureSpec.getSize(0), new char[]{30478, 39625, 47936, 41528, 27049, 6141, 22586, 51040, 2777, 21650, 39703, 19592, 42294, 61189, 38587, 26551}, new char[]{12464, 30568, 32307, 22434}, new char[]{47664, 64550, 31811, 55199}, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) - 347782659, new char[]{25359, 28108, 38430, 22606, 65499, 23426, 50932, 30512, 56762, 32373, 31543}, new char[]{12464, 30568, 32307, 22434}, new char[]{64771, 17729, 40171, 33431}, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((char) (59306 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0), new char[]{50581, 7153, 55141, 51744, 52584, 'j'}, new char[]{12464, 30568, 32307, 22434}, new char[]{25511, 56403, 43495, 35559}, objArr4);
        onExtraCallbackWithResult = CollectionsKt.listOf(new String[]{strIntern, strIntern2, strIntern3, ((String) objArr4[0]).intern()});
        int i = asBinder + 23;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final List<String> onExtraCallback(@NotNull String str) {
        Object next;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(str);
        Iterator<T> it = onExtraCallbackWithResult.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = IAuthTabCallbackStub + 119;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            next = it.next();
            if (StringsKt.endsWith$default(str, (String) next, false, 2, (Object) null)) {
                break;
            }
        }
        String str2 = (String) next;
        if (str2 != null) {
            int i6 = IAuthTabCallbackStub + 67;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            String strRemoveSuffix = StringsKt.removeSuffix(str, str2);
            if (strRemoveSuffix != null) {
                int i8 = IAuthTabCallbackStub + 121;
                asInterface = i8 % 128;
                if (i8 % 2 == 0) {
                    StringsKt.isBlank(strRemoveSuffix);
                    throw null;
                }
                String str3 = StringsKt.isBlank(strRemoveSuffix) ? null : strRemoveSuffix;
                if (str3 != null) {
                    listCreateListBuilder.add(str3);
                }
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
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
            int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
            int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
            makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
            cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
            cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            int i3 = $11 + 105;
            $10 = i3 % 128;
            int i4 = i3 % 2;
        }
        String str = new String(cArr6);
        int i5 = $11 + 67;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = 4294307614277851979L;
        onNavigationEvent = -1776194565;
        IAuthTabCallback = (char) 27643;
    }
}
