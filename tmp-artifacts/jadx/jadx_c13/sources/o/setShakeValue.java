package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonException;
import o.setPreError;
import o.setShakeValue;
import o.uu;
import o.vbt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setShakeValue {
    private static final setPreError.onExtraCallback<Map<String, Integer>> onExtraCallback = new setPreError.onExtraCallback<>();
    private static final setPreError.onExtraCallback<String[]> onWarmupCompleted = new setPreError.onExtraCallback<>();

    public static final setPreError.onExtraCallback<Map<String, Integer>> onExtraCallback() {
        return onExtraCallback;
    }

    private static final void onExtraCallbackWithResult(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i) {
        String str2 = Intrinsics.areEqual(serialDescriptor.IAuthTabCallback(), vbt.onExtraCallbackWithResult.onWarmupCompleted) ? "enum value" : "property";
        if (map.containsKey(str)) {
            throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.onWarmupCompleted(i) + " is already one of the names for " + str2 + ' ' + serialDescriptor.onWarmupCompleted(((Number) access8000.onExtraCallback(map, str)).intValue()) + " in " + serialDescriptor);
        }
        map.put(str, Integer.valueOf(i));
    }

    private static final Map<String, Integer> IAuthTabCallback(SerialDescriptor serialDescriptor, wie2 wie2Var) {
        String strOnExtraCallback;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zOnWarmupCompleted = onWarmupCompleted(wie2Var, serialDescriptor);
        dyycx dyycxVarOnWarmupCompleted = onWarmupCompleted(serialDescriptor, wie2Var);
        int iOnExtraCallback = serialDescriptor.onExtraCallback();
        for (int i = 0; i < iOnExtraCallback; i++) {
            List<Annotation> listOnExtraCallbackWithResult = serialDescriptor.onExtraCallbackWithResult(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOnExtraCallbackWithResult) {
                if (obj instanceof PangleEncryptConstant) {
                    arrayList.add(obj);
                }
            }
            PangleEncryptConstant pangleEncryptConstant = (PangleEncryptConstant) CollectionsKt___CollectionsKt.singleOrNull((List) arrayList);
            if (pangleEncryptConstant != null && (strArrNames = pangleEncryptConstant.names()) != null) {
                for (String lowerCase : strArrNames) {
                    if (zOnWarmupCompleted) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    }
                    onExtraCallbackWithResult(linkedHashMap, serialDescriptor, lowerCase, i);
                }
            }
            if (zOnWarmupCompleted) {
                strOnExtraCallback = serialDescriptor.onWarmupCompleted(i).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(strOnExtraCallback, "");
            } else {
                strOnExtraCallback = dyycxVarOnWarmupCompleted != null ? dyycxVarOnWarmupCompleted.onExtraCallback(serialDescriptor, i, serialDescriptor.onWarmupCompleted(i)) : null;
            }
            if (strOnExtraCallback != null) {
                onExtraCallbackWithResult(linkedHashMap, serialDescriptor, strOnExtraCallback, i);
            }
        }
        return linkedHashMap.isEmpty() ? access8000.IAuthTabCallback() : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map onNavigationEvent(SerialDescriptor serialDescriptor, wie2 wie2Var) {
        return IAuthTabCallback(serialDescriptor, wie2Var);
    }

    public static final Map<String, Integer> onNavigationEvent(@NotNull final wie2 wie2Var, @NotNull final SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return (Map) encryptType4WithNoWrapBase64.onNavigationEvent(wie2Var).IAuthTabCallback(serialDescriptor, onExtraCallback, new Function0() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setShakeValue.onNavigationEvent(serialDescriptor, wie2Var);
            }
        });
    }

    public static final String[] onExtraCallback(@NotNull final SerialDescriptor serialDescriptor, @NotNull wie2 wie2Var, @NotNull final dyycx dyycxVar) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(dyycxVar, "");
        return (String[]) encryptType4WithNoWrapBase64.onNavigationEvent(wie2Var).IAuthTabCallback(serialDescriptor, onWarmupCompleted, new Function0() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setShakeValue.IAuthTabCallback(serialDescriptor, dyycxVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] IAuthTabCallback(SerialDescriptor serialDescriptor, dyycx dyycxVar) {
        int iOnExtraCallback = serialDescriptor.onExtraCallback();
        String[] strArr = new String[iOnExtraCallback];
        for (int i = 0; i < iOnExtraCallback; i++) {
            strArr[i] = dyycxVar.onExtraCallback(serialDescriptor, i, serialDescriptor.onWarmupCompleted(i));
        }
        return strArr;
    }

    public static final String IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor, @NotNull wie2 wie2Var, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        dyycx dyycxVarOnWarmupCompleted = onWarmupCompleted(serialDescriptor, wie2Var);
        return dyycxVarOnWarmupCompleted == null ? serialDescriptor.onWarmupCompleted(i) : onExtraCallback(serialDescriptor, wie2Var, dyycxVarOnWarmupCompleted)[i];
    }

    public static final dyycx onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor, @NotNull wie2 wie2Var) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        if (Intrinsics.areEqual(serialDescriptor.IAuthTabCallback(), uu.onExtraCallbackWithResult.onNavigationEvent)) {
            return wie2Var.IAuthTabCallback().access100();
        }
        return null;
    }

    private static final int onWarmupCompleted(SerialDescriptor serialDescriptor, wie2 wie2Var, String str) {
        Integer num = onNavigationEvent(wie2Var, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private static final boolean onWarmupCompleted(wie2 wie2Var, SerialDescriptor serialDescriptor) {
        return wie2Var.IAuthTabCallback().onTransact() && Intrinsics.areEqual(serialDescriptor.IAuthTabCallback(), vbt.onExtraCallbackWithResult.onWarmupCompleted);
    }

    public static final int IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor, @NotNull wie2 wie2Var, @NotNull String str) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (onWarmupCompleted(wie2Var, serialDescriptor)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return onWarmupCompleted(serialDescriptor, wie2Var, lowerCase);
        }
        if (onWarmupCompleted(serialDescriptor, wie2Var) != null) {
            return onWarmupCompleted(serialDescriptor, wie2Var, str);
        }
        int iOnExtraCallbackWithResult = serialDescriptor.onExtraCallbackWithResult(str);
        return (iOnExtraCallbackWithResult == -3 && wie2Var.IAuthTabCallback().IAuthTabCallbackStubProxy()) ? onWarmupCompleted(serialDescriptor, wie2Var, str) : iOnExtraCallbackWithResult;
    }

    public static /* synthetic */ int onWarmupCompleted(SerialDescriptor serialDescriptor, wie2 wie2Var, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return onExtraCallbackWithResult(serialDescriptor, wie2Var, str, str2);
    }

    public static final int onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, @NotNull wie2 wie2Var, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iIAuthTabCallback = IAuthTabCallback(serialDescriptor, wie2Var, str);
        if (iIAuthTabCallback != -3) {
            return iIAuthTabCallback;
        }
        throw new qn(serialDescriptor.onExtraCallbackWithResult() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean onExtraCallback(@NotNull SerialDescriptor serialDescriptor, @NotNull wie2 wie2Var) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        if (wie2Var.IAuthTabCallback().access000()) {
            return true;
        }
        List<Annotation> listOnNavigationEvent = serialDescriptor.onNavigationEvent();
        if ((listOnNavigationEvent instanceof Collection) && listOnNavigationEvent.isEmpty()) {
            return false;
        }
        Iterator<T> it = listOnNavigationEvent.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof renderDidFinish) {
                return true;
            }
        }
        return false;
    }
}
