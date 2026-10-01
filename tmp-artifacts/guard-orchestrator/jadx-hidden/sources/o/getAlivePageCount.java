package o;

import android.telephony.cdma.CdmaCellLocation;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.enums.EnumEntries;
import o.AppNode61;
import o.makePFX_WINS;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class getAlivePageCount {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getAlivePageCount[] $VALUES;
    public static final getAlivePageCount HIDDEN;
    private static char IAuthTabCallback = 0;
    public static final getAlivePageCount VISIBLE;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;

    private static final /* synthetic */ getAlivePageCount[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getAlivePageCount[] getalivepagecountArr = {VISIBLE, HIDDEN};
        int i5 = i2 + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return getalivepagecountArr;
        }
        throw null;
    }

    public static EnumEntries<getAlivePageCount> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<getAlivePageCount> enumEntries = $ENTRIES;
        int i4 = i3 + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static getAlivePageCount valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getAlivePageCount getalivepagecount = (getAlivePageCount) Enum.valueOf(getAlivePageCount.class, str);
        if (i3 != 0) {
            return getalivepagecount;
        }
        throw null;
    }

    public static getAlivePageCount[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getAlivePageCount[] getalivepagecountArr = (getAlivePageCount[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return getalivepagecountArr;
    }

    private getAlivePageCount(String str, int i) {
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 911849189 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{4231, 20612, 41459, 26274, 18138, 52775, 63348}, new char[]{39204, 40982, 14269, 49006}, new char[]{58774, 22966, 54582, 17778}, objArr);
        VISIBLE = new getAlivePageCount(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 45659), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{50278, 15030, 62511, 63312, 26556, 4861}, new char[]{39204, 40982, 14269, 49006}, new char[]{60941, 55222, 23504, 46002}, objArr2);
        HIDDEN = new getAlivePageCount(((String) objArr2[0]).intern(), 1);
        getAlivePageCount[] getalivepagecountArr$values = $values();
        $VALUES = getalivepagecountArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getalivepagecountArr$values);
        int i = onTransact + 63;
        asBinder = i % 128;
        int i2 = i % 2;
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
            int i3 = $10 + 117;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
            int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
            makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
            cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
            cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
        }
        String str = new String(cArr6);
        int i5 = $10 + 81;
        $11 = i5 % 128;
        if (i5 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i6 = 8 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = -3218882364566932769L;
        onWarmupCompleted = -1776194565;
        IAuthTabCallback = (char) 27643;
    }
}
