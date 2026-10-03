package o;

import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Dynamic {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static long onExtraCallback;
    public static final Dynamic onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{61948, 19994, 19897, 10716, 61841, 13317, 47419, 18149, 6224, 10831, 37702, 28846, 8725, 901, 34228, 27497, 19656, 31192, 65520, 1327, 22179, 28431, 54839, 16365, 24926, 17734, 51324, 10664}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        onExtraCallbackWithResult = new Dynamic();
        int i = onWarmupCompleted + 73;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Dynamic() {
    }

    public final boolean onExtraCallbackWithResult() throws Throwable {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub;
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a(new char[]{61948, 19994, 19897, 10716, 61841, 13317, 47419, 18149, 6224, 10831, 37702, 28846, 8725, 901, 34228, 27497, 19656, 31192, 65520, 1327, 22179, 28431, 54839, 16365, 24926, 17734, 51324, 10664}, (-1) % TextUtils.indexOf((CharSequence) "", 'P', 0, 1), objArr);
            obj = objArr[0];
        } else {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr2 = new Object[1];
            a(new char[]{61948, 19994, 19897, 10716, 61841, 13317, 47419, 18149, 6224, 10831, 37702, 28846, 8725, 901, 34228, 27497, 19656, 31192, 65520, 1327, 22179, 28431, 54839, 16365, 24926, 17734, 51324, 10664}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            obj = objArr2[0];
        }
        boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) obj).intern(), false);
        int i3 = asInterface + 55;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void onNavigationEvent(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a(new char[]{61948, 19994, 19897, 10716, 61841, 13317, 47419, 18149, 6224, 10831, 37702, 28846, 8725, 901, 34228, 27497, 19656, 31192, 65520, 1327, 22179, 28431, 54839, 16365, 24926, 17734, 51324, 10664}, TextUtils.getTrimmedLength(""), objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr[0]).intern(), z);
        int i4 = IAuthTabCallbackStub + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback() throws Throwable {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub;
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a(new char[]{61948, 19994, 19897, 10716, 61841, 13317, 47419, 18149, 6224, 10831, 37702, 28846, 8725, 901, 34228, 27497, 19656, 31192, 65520, 1327, 22179, 28431, 54839, 16365, 24926, 17734, 51324, 10664}, (CdmaCellLocation.convertQuartSecToDecDegrees(1) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(1) == 1.0d ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr2 = new Object[1];
            a(new char[]{61948, 19994, 19897, 10716, 61841, 13317, 47419, 18149, 6224, 10831, 37702, 28846, 8725, 901, 34228, 27497, 19656, 31192, 65520, 1327, 22179, 28431, 54839, 16365, 24926, 17734, 51324, 10664}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onTransact(((String) obj).intern());
    }

    public final boolean onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a(new char[]{61948, 19994, 19897, 10716, 61841, 13317, 47419, 18149, 6224, 10831, 37702, 28846, 8725, 901, 34228, 27497, 19656, 31192, 65520, 1327, 22179, 28431, 54839, 16365, 24926, 17734, 51324, 10664}, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        boolean zOnNavigationEvent = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr[0]).intern());
        int i4 = IAuthTabCallbackStub + 89;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 105;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 45764), 85 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 21233 - (ViewConfiguration.getScrollBarSize() >> 8), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 14186), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, (ViewConfiguration.getWindowTouchSlop() >> 8) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 117;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onExtraCallback() {
        onExtraCallback = 5570436762559119740L;
    }
}
