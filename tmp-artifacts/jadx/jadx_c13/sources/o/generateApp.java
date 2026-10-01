package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class generateApp {
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private final calculateDurationInForegroundbugsnag_android_core_release IAuthTabCallback;
    private final ArrayList<findProcessName> onExtraCallbackWithResult;
    private AppDataCollector[] onNavigationEvent;
    private Set<Character> onWarmupCompleted;

    public generateApp(@NotNull calculateDurationInForegroundbugsnag_android_core_release calculatedurationinforegroundbugsnag_android_core_release) {
        Intrinsics.checkNotNullParameter(calculatedurationinforegroundbugsnag_android_core_release, "");
        this.IAuthTabCallback = calculatedurationinforegroundbugsnag_android_core_release;
        this.onExtraCallbackWithResult = new ArrayList<>();
    }

    public final float onWarmupCompleted() {
        int size;
        float fOnExtraCallback;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 89;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            size = this.onExtraCallbackWithResult.size();
            i = 1;
            fOnExtraCallback = 1.0f;
        } else {
            size = this.onExtraCallbackWithResult.size();
            fOnExtraCallback = 0.0f;
            i = 0;
        }
        while (i < size) {
            int i4 = onTransact + 39;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            fOnExtraCallback += this.onExtraCallbackWithResult.get(i).onExtraCallback();
            i++;
        }
        return fOnExtraCallback;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int size = this.onExtraCallbackWithResult.size();
        float fFloatValue = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = onTransact + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = {this.onExtraCallbackWithResult.get(i4)};
            fFloatValue += ((Float) findProcessName.onNavigationEvent(-1776784766, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1776784766, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult())).floatValue();
        }
        return fFloatValue;
    }

    private final char[] onExtraCallbackWithResult() {
        int size;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            size = this.onExtraCallbackWithResult.size();
            cArr = new char[size];
            i = 1;
        } else {
            size = this.onExtraCallbackWithResult.size();
            cArr = new char[size];
            i = 0;
        }
        while (i < size) {
            int i4 = onTransact + 1;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[i] = this.onExtraCallbackWithResult.get(i).IAuthTabCallback();
                i += 42;
            } else {
                cArr[i] = this.onExtraCallbackWithResult.get(i).IAuthTabCallback();
                i++;
            }
        }
        return cArr;
    }

    public final void onExtraCallbackWithResult(@NotNull String... strArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        int length = strArr.length;
        AppDataCollector[] appDataCollectorArr = new AppDataCollector[length];
        int i2 = onExtraCallback + 23;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 4;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            appDataCollectorArr[i5] = new AppDataCollector(strArr[i5]);
        }
        this.onNavigationEvent = appDataCollectorArr;
        this.onWarmupCompleted = new HashSet();
        int length2 = strArr.length;
        while (i4 < length2) {
            int i6 = onExtraCallback + 79;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            Set<Character> set = this.onWarmupCompleted;
            Intrinsics.checkNotNull(set);
            AppDataCollector[] appDataCollectorArr2 = this.onNavigationEvent;
            Intrinsics.checkNotNull(appDataCollectorArr2);
            set.addAll(appDataCollectorArr2[i4].onNavigationEvent());
            i4++;
            int i8 = onTransact + 95;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull char[] cArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cArr, "");
        if (this.onNavigationEvent == null) {
            throw new IllegalStateException("Need to call #setCharacterLists first.");
        }
        int i2 = onExtraCallback + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < this.onExtraCallbackWithResult.size()) {
            findProcessName findprocessname = this.onExtraCallbackWithResult.get(i4);
            Intrinsics.checkNotNullExpressionValue(findprocessname, "");
            if (((Float) findProcessName.onNavigationEvent(-1776784766, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1776784766, new Object[]{findprocessname}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult())).floatValue() > 0.0f) {
                int i5 = onTransact + 11;
                onExtraCallback = i5 % 128;
                i4 = i5 % 2 != 0 ? i4 + 71 : i4 + 1;
            } else {
                Intrinsics.checkNotNull(this.onExtraCallbackWithResult.remove(i4));
            }
        }
        getProcessImportance getprocessimportance = getProcessImportance.onNavigationEvent;
        char[] cArrOnExtraCallbackWithResult = onExtraCallbackWithResult();
        Set<Character> set = this.onWarmupCompleted;
        Intrinsics.checkNotNull(set);
        int[] iArrOnExtraCallback = getprocessimportance.onExtraCallback(cArrOnExtraCallbackWithResult, cArr, set);
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArrOnExtraCallback) {
            if (i8 == 0) {
                this.onExtraCallbackWithResult.get(i6).onExtraCallback(cArr[i7]);
            } else if (i8 == 1) {
                ArrayList<findProcessName> arrayList = this.onExtraCallbackWithResult;
                AppDataCollector[] appDataCollectorArr = this.onNavigationEvent;
                Intrinsics.checkNotNull(appDataCollectorArr);
                arrayList.add(i6, new findProcessName(appDataCollectorArr, this.IAuthTabCallback));
                this.onExtraCallbackWithResult.get(i6).onExtraCallback(cArr[i7]);
            } else {
                if (i8 != 2) {
                    throw new IllegalArgumentException("Unknown action: " + i8);
                }
                this.onExtraCallbackWithResult.get(i6).onExtraCallback((char) 0);
                i6++;
            }
            i6++;
            i7++;
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int size = this.onExtraCallbackWithResult.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = onTransact + 23;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                findProcessName findprocessname = this.onExtraCallbackWithResult.get(i2);
                Intrinsics.checkNotNullExpressionValue(findprocessname, "");
                findprocessname.onExtraCallbackWithResult();
                i2 += 62;
            } else {
                findProcessName findprocessname2 = this.onExtraCallbackWithResult.get(i2);
                Intrinsics.checkNotNullExpressionValue(findprocessname2, "");
                findprocessname2.onExtraCallbackWithResult();
                i2++;
            }
        }
        int i4 = onExtraCallback + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int size = this.onExtraCallbackWithResult.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                findProcessName findprocessname = this.onExtraCallbackWithResult.get(i2);
                Intrinsics.checkNotNullExpressionValue(findprocessname, "");
                Object[] objArr = {findprocessname, Float.valueOf(f)};
                findProcessName.onNavigationEvent(-288861722, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 288861723, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                i2 += 109;
            } else {
                findProcessName findprocessname2 = this.onExtraCallbackWithResult.get(i2);
                Intrinsics.checkNotNullExpressionValue(findprocessname2, "");
                Object[] objArr2 = {findprocessname2, Float.valueOf(f)};
                findProcessName.onNavigationEvent(-288861722, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 288861723, objArr2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                i2++;
            }
        }
        int i4 = onTransact + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull Canvas canvas, @NotNull Paint paint) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        int size = this.onExtraCallbackWithResult.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = onExtraCallback + 53;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            findProcessName findprocessname = this.onExtraCallbackWithResult.get(i2);
            Intrinsics.checkNotNullExpressionValue(findprocessname, "");
            findProcessName findprocessname2 = findprocessname;
            findprocessname2.onExtraCallback(canvas, paint);
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            canvas.translate(((Float) findProcessName.onNavigationEvent(-1776784766, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1776784766, new Object[]{findprocessname2}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult())).floatValue(), 0.0f);
        }
        int i5 = onTransact + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
