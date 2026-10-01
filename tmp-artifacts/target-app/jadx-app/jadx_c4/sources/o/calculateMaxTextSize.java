package o;

import im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda9;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class calculateMaxTextSize {
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent;
    private final Set<ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1> IAuthTabCallback;
    private final Map<String, ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1> onExtraCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallbackWithResult;
    private final ALCFaceValidationInfo onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~(i4 | i6)) | i2;
        int i8 = ~i4;
        int i9 = ~((~i2) | i8 | i6);
        int i10 = (~(i6 | i2)) | (~(i8 | (~i6)));
        int i11 = i4 + i2 + i5 + (1616745821 * i3) + (2077170981 * i);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i4) + 1587019776 + (806482222 * i2) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i5) + ((-395313152) * i3) + (904921088 * i) + (345505792 * i12);
        int i14 = (i4 * (-1558553916)) + 318941677 + (i2 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i5 * (-1558553459)) + (i3 * 397062201) + (i * 609114465) + (i12 * (-138936320));
        return i13 + ((i14 * i14) * 1630011392) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public calculateMaxTextSize(@NotNull Set<ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.onWarmupCompleted = new ALCFaceValidationInfo();
        this.onExtraCallbackWithResult = new LinkedHashMap();
        this.IAuthTabCallback = new LinkedHashSet();
        this.onExtraCallback = new LinkedHashMap();
        onExtraCallback(set);
    }

    public static final /* synthetic */ void onExtraCallback(calculateMaxTextSize calculatemaxtextsize, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        calculatemaxtextsize.onNavigationEvent(str);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        calculateMaxTextSize calculatemaxtextsize = (calculateMaxTextSize) objArr[0];
        String str = (String) objArr[1];
        Class<? extends drawTextBox> cls = (Class) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        calculatemaxtextsize.IAuthTabCallback(str, cls);
        int i4 = IAuthTabCallbackDefault + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public calculateMaxTextSize(@NotNull calculateMaxTextSize calculatemaxtextsize) {
        this((Set<ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1>) CollectionsKt.toMutableSet(calculatemaxtextsize.IAuthTabCallback));
        Intrinsics.checkNotNullParameter(calculatemaxtextsize, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public calculateMaxTextSize(@NotNull ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1... activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1Arr) {
        this((Set<ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1>) ArraysKt.toMutableSet(activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1Arr));
        Intrinsics.checkNotNullParameter(activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1Arr, "");
    }

    public final void onExtraCallback(@NotNull Collection<? extends ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1> collection) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(collection, "");
            this.IAuthTabCallback.addAll(collection);
            collection.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(collection, "");
        this.IAuthTabCallback.addAll(collection);
        Iterator<T> it = collection.iterator();
        int i3 = onNavigationEvent + 59;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        while (!(!it.hasNext())) {
            int i5 = IAuthTabCallbackDefault + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            onWarmupCompleted((ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1) it.next());
        }
    }

    private final void onWarmupCompleted(ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1) {
        int i = 2 % 2;
        this.onExtraCallbackWithResult.putAll(activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1.onNavigationEvent());
        Iterator<T> it = activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1.onExtraCallbackWithResult().iterator();
        int i2 = onNavigationEvent + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = onNavigationEvent + 39;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                this.onExtraCallback.put((String) it.next(), activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1);
                throw null;
            }
            String str = (String) it.next();
            if (this.onExtraCallback.put(str, activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1) != null) {
                throw new IllegalStateException(("duplicated handler name:" + str).toString());
            }
        }
    }

    public final void IAuthTabCallback(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull Class<? extends drawTextBox> cls) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(cls, "");
        List<String> list = this.onExtraCallbackWithResult.get(cls);
        if (list != null) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(list, textFieldScrollKtExternalSyntheticLambda0, this, cls, (access13800) null), 3, (Object) null);
            return;
        }
        int i4 = IAuthTabCallbackDefault + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    private final void IAuthTabCallback(String str, Class<? extends drawTextBox> cls) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.onExtraCallbackWithResult(str, cls);
            int i3 = 48 / 0;
        } else {
            this.onWarmupCompleted.onExtraCallbackWithResult(str, cls);
        }
        int i4 = IAuthTabCallbackDefault + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onNavigationEvent(str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final drawTextBox onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.IAuthTabCallback(str);
            throw null;
        }
        drawTextBox drawtextboxIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback(str);
        int i3 = onNavigationEvent + 17;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return drawtextboxIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        calculateMaxTextSize calculatemaxtextsize = (calculateMaxTextSize) objArr[0];
        boolean z = true;
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if (objArr[4] != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHandlerByName");
        }
        int i2 = IAuthTabCallbackDefault + 45;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0 ? (iIntValue & 2) == 0 : (iIntValue & 2) == 0) {
            z = zBooleanValue;
        } else {
            int i4 = i3 + 5;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return calculatemaxtextsize.onExtraCallbackWithResult(str, z);
    }

    public final drawTextBox onExtraCallbackWithResult(@NotNull String str, boolean z) {
        drawTextBox drawtextboxIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 = this.onExtraCallback.get(str);
        Object obj = null;
        if (activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 != null) {
            int i2 = onNavigationEvent + 61;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1.IAuthTabCallback(str);
                obj.hashCode();
                throw null;
            }
            drawtextboxIAuthTabCallback = activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1.IAuthTabCallback(str);
        } else {
            drawtextboxIAuthTabCallback = null;
        }
        if (drawtextboxIAuthTabCallback != null) {
            int i3 = onNavigationEvent + 1;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                return drawtextboxIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }
        if (!z) {
            return null;
        }
        int i4 = onNavigationEvent + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallback(str);
        }
        onExtraCallback(str);
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(calculateMaxTextSize calculatemaxtextsize, String str, Class cls) {
        int iIAuthTabCallback = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), 2074815311, new Object[]{calculatemaxtextsize, str, cls}, iIAuthTabCallback3, -2074815310, iIAuthTabCallback2, iIAuthTabCallback);
    }

    public static /* synthetic */ drawTextBox onExtraCallbackWithResult(calculateMaxTextSize calculatemaxtextsize, String str, boolean z, int i, Object obj) {
        Object[] objArr = {calculatemaxtextsize, str, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iIAuthTabCallback = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        return (drawTextBox) onWarmupCompleted(WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, objArr, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, iIAuthTabCallback2, iIAuthTabCallback);
    }
}
