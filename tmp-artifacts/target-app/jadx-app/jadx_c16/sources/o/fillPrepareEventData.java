package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.iap.ac.config.lite.preset.PresetParser;
import com.initech.inibase.logger.spi.LocationInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.AppManagerImpl1;
import o.AppManagerImpl2;
import o.preCreateApp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class fillPrepareEventData {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final fillPrepareEventData onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        IAuthTabCallback();
        onNavigationEvent = new fillPrepareEventData();
        int i = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private fillPrepareEventData() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final List<AppManagerImpl2.onExtraCallbackWithResult> onExtraCallbackWithResult(@NotNull preCreateApp precreateapp, int i) throws Throwable {
        Collection collectionPlus;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(precreateapp, "");
        if (Intrinsics.areEqual(precreateapp, preCreateApp.onWarmupCompleted.IAuthTabCallback)) {
            String[] strArr = {".", "!", "@", "#", "$", "%", "^", "&", "*", "("};
            collectionPlus = new ArrayList(10);
            for (int i5 = 0; i5 < 10; i5++) {
                collectionPlus.add(new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted(strArr[i5]));
            }
        } else {
            if (!Intrinsics.areEqual(precreateapp, preCreateApp.onExtraCallbackWithResult.onWarmupCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            IntRange intRange = new IntRange(1, 9);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            IntIterator it = intRange.iterator();
            int i6 = IAuthTabCallbackDefault + 81;
            while (true) {
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted(String.valueOf(it.nextInt())));
                i6 = IAuthTabCallbackDefault + 41;
            }
            Object[] objArr = new Object[1];
            a(new char[]{12322}, TextUtils.getOffsetAfter("", 0) + 34939, objArr);
            collectionPlus = CollectionsKt.plus(arrayList, CollectionsKt.listOf(new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted(((String) objArr[0]).intern())));
        }
        List<AppManagerImpl2.onExtraCallbackWithResult> mutableList = CollectionsKt.toMutableList(collectionPlus);
        mutableList.add(i, AppManagerImpl2.onExtraCallbackWithResult.onExtraCallback.onExtraCallbackWithResult);
        return mutableList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final List<Pair<AppManagerImpl2.onExtraCallbackWithResult, AppManagerImpl2.onExtraCallbackWithResult>> IAuthTabCallback(@NotNull AppManagerImpl1 appManagerImpl1, int i) throws NoWhenBranchMatchedException {
        ArrayList arrayListArrayListOf;
        AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(appManagerImpl1, "");
        ArrayList arrayListArrayListOf2 = CollectionsKt.arrayListOf(new String[]{"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListArrayListOf2, 10));
        Iterator it = arrayListArrayListOf2.iterator();
        while (!(!it.hasNext())) {
            String str = (String) it.next();
            if (Intrinsics.areEqual(appManagerImpl1, AppManagerImpl1.onNavigationEvent.onExtraCallback)) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                onwarmupcompleted = new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted(upperCase);
            } else {
                if (!Intrinsics.areEqual(appManagerImpl1, AppManagerImpl1.IAuthTabCallback.onExtraCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                onwarmupcompleted = new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted(lowerCase);
            }
            arrayList.add(onwarmupcompleted);
        }
        if (Intrinsics.areEqual(appManagerImpl1, AppManagerImpl1.onNavigationEvent.onExtraCallback)) {
            arrayListArrayListOf = CollectionsKt.arrayListOf(new String[]{"ㅃ", "ㅉ", "ㄸ", "ㄲ", "ㅆ", "ㅛ", "ㅕ", "ㅑ", "ㅒ", "ㅖ"});
        } else {
            if (!Intrinsics.areEqual(appManagerImpl1, AppManagerImpl1.IAuthTabCallback.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = onExtraCallback + 95;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            arrayListArrayListOf = CollectionsKt.arrayListOf(new String[]{"ㅂ", "ㅈ", "ㄷ", "ㄱ", "ㅅ", "ㅛ", "ㅕ", "ㅑ", "ㅐ", "ㅔ"});
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListArrayListOf, 10));
        Iterator it2 = arrayListArrayListOf.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted((String) it2.next()));
        }
        IntRange intRange = new IntRange(0, 9);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        IntIterator it3 = intRange.iterator();
        while (it3.hasNext()) {
            int i5 = onExtraCallback + 5;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int iNextInt = it3.nextInt();
            arrayList3.add(getWrite.IAuthTabCallback(arrayList.get(iNextInt), arrayList2.get(iNextInt)));
        }
        List<Pair<AppManagerImpl2.onExtraCallbackWithResult, AppManagerImpl2.onExtraCallbackWithResult>> mutableList = CollectionsKt.toMutableList(arrayList3);
        AppManagerImpl2.onExtraCallbackWithResult.onExtraCallback onextracallback = AppManagerImpl2.onExtraCallbackWithResult.onExtraCallback.onExtraCallbackWithResult;
        mutableList.add(i, getWrite.IAuthTabCallback(onextracallback, onextracallback));
        return mutableList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final List<Pair<AppManagerImpl2.onExtraCallbackWithResult, AppManagerImpl2.onExtraCallbackWithResult>> onWarmupCompleted(@NotNull AppManagerImpl1 appManagerImpl1, int i) throws NoWhenBranchMatchedException {
        AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(appManagerImpl1, "");
        ArrayList<String> arrayListArrayListOf = CollectionsKt.arrayListOf(new String[]{"A", "S", "D", "F", "G", "H", "J", "K", "L"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListArrayListOf, 10));
        int i3 = onExtraCallback + 123;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        for (String str : arrayListArrayListOf) {
            if (Intrinsics.areEqual(appManagerImpl1, AppManagerImpl1.onNavigationEvent.onExtraCallback)) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                onwarmupcompleted = new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted(upperCase);
            } else {
                if (!Intrinsics.areEqual(appManagerImpl1, AppManagerImpl1.IAuthTabCallback.onExtraCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                onwarmupcompleted = new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted(lowerCase);
            }
            arrayList.add(onwarmupcompleted);
        }
        ArrayList arrayListArrayListOf2 = CollectionsKt.arrayListOf(new String[]{"ㅁ", "ㄴ", "ㅇ", "ㄹ", "ㅎ", "ㅗ", "ㅓ", "ㅏ", "ㅣ"});
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListArrayListOf2, 10));
        Iterator it = arrayListArrayListOf2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted((String) it.next()));
        }
        IntRange intRange = new IntRange(0, 8);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        IntIterator it2 = intRange.iterator();
        while (it2.hasNext()) {
            int i5 = IAuthTabCallbackDefault + 33;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int iNextInt = it2.nextInt();
                arrayList3.add(getWrite.IAuthTabCallback(arrayList.get(iNextInt), arrayList2.get(iNextInt)));
                throw null;
            }
            int iNextInt2 = it2.nextInt();
            arrayList3.add(getWrite.IAuthTabCallback(arrayList.get(iNextInt2), arrayList2.get(iNextInt2)));
        }
        List<Pair<AppManagerImpl2.onExtraCallbackWithResult, AppManagerImpl2.onExtraCallbackWithResult>> mutableList = CollectionsKt.toMutableList(arrayList3);
        AppManagerImpl2.onExtraCallbackWithResult.onExtraCallback onextracallback = AppManagerImpl2.onExtraCallbackWithResult.onExtraCallback.onExtraCallbackWithResult;
        mutableList.add(i, getWrite.IAuthTabCallback(onextracallback, onextracallback));
        return mutableList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final List<Pair<AppManagerImpl2.onExtraCallbackWithResult, AppManagerImpl2.onExtraCallbackWithResult>> onNavigationEvent(@NotNull AppManagerImpl1 appManagerImpl1, int i) throws NoWhenBranchMatchedException {
        AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(appManagerImpl1, "");
        ArrayList<String> arrayListArrayListOf = CollectionsKt.arrayListOf(new String[]{"Z", "X", "C", "V", "B", "N", "M"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListArrayListOf, 10));
        for (String str : arrayListArrayListOf) {
            int i3 = onExtraCallback + 97;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (Intrinsics.areEqual(appManagerImpl1, AppManagerImpl1.onNavigationEvent.onExtraCallback)) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                onwarmupcompleted = new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted(upperCase);
            } else {
                if (!Intrinsics.areEqual(appManagerImpl1, AppManagerImpl1.IAuthTabCallback.onExtraCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                onwarmupcompleted = new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted(lowerCase);
            }
            arrayList.add(onwarmupcompleted);
        }
        ArrayList arrayListArrayListOf2 = CollectionsKt.arrayListOf(new String[]{"ㅋ", "ㅌ", "ㅊ", "ㅍ", "ㅠ", "ㅜ", "ㅡ"});
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListArrayListOf2, 10));
        Iterator it = arrayListArrayListOf2.iterator();
        int i5 = IAuthTabCallbackDefault + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            arrayList2.add(new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted((String) it.next()));
        }
        IntRange intRange = new IntRange(0, 6);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        IntIterator it2 = intRange.iterator();
        int i7 = IAuthTabCallbackDefault + 107;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        while (!(!it2.hasNext())) {
            int i9 = onExtraCallback + 21;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 == 0) {
                int iNextInt = it2.nextInt();
                arrayList3.add(getWrite.IAuthTabCallback(arrayList.get(iNextInt), arrayList2.get(iNextInt)));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iNextInt2 = it2.nextInt();
            arrayList3.add(getWrite.IAuthTabCallback(arrayList.get(iNextInt2), arrayList2.get(iNextInt2)));
        }
        List<Pair<AppManagerImpl2.onExtraCallbackWithResult, AppManagerImpl2.onExtraCallbackWithResult>> mutableList = CollectionsKt.toMutableList(arrayList3);
        AppManagerImpl2.onExtraCallbackWithResult.onExtraCallback onextracallback = AppManagerImpl2.onExtraCallbackWithResult.onExtraCallback.onExtraCallbackWithResult;
        mutableList.add(i, getWrite.IAuthTabCallback(onextracallback, onextracallback));
        return mutableList;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 105;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 % 5;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 47;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 23 - ((byte) KeyEvent.getModifierMetaStateMask()), 19627 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 59 - View.MeasureSpec.getMode(0), 6383 - Color.green(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i8 = $10 + 17;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 3 / 2;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i10 = $11 + 123;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 59 - (ViewConfiguration.getScrollBarSize() >> 8), 6383 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i12 = $11 + 15;
        $10 = i12 % 128;
        if (i12 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i13 = 31 / 0;
            objArr[0] = str;
        }
    }

    public final List<AppManagerImpl2.onExtraCallbackWithResult> onWarmupCompleted() {
        AppManagerImpl2.onExtraCallbackWithResult.onExtraCallback onwarmupcompleted;
        int i = 2 % 2;
        String[] strArr = {")", "-", PresetParser.UNDERLINE, "+", "=", "[", "{", "]", "}", "|", "\\", ";", ":", "'", "\"", ",", "<", ">", LocationInfo.NA, "/", "~", "`", "￦", "", "", "", "", "", ""};
        ArrayList arrayList = new ArrayList(29);
        int i2 = IAuthTabCallbackDefault + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < 29; i4++) {
            String str = strArr[i4];
            if (Intrinsics.areEqual(str, "")) {
                int i5 = onExtraCallback + 107;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                onwarmupcompleted = AppManagerImpl2.onExtraCallbackWithResult.onExtraCallback.onExtraCallbackWithResult;
            } else {
                onwarmupcompleted = new AppManagerImpl2.onExtraCallbackWithResult.onWarmupCompleted(str);
            }
            arrayList.add(onwarmupcompleted);
        }
        return arrayList;
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = 2008605314373432613L;
    }
}
