package o;

import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.ALCAgeGenderGENDER;
import o.ALCFaceAuthInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCAgeGenderGENDER {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ CharSequence IAuthTabCallback(char c) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnNavigationEvent = onNavigationEvent(c);
        int i4 = onExtraCallback + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return charSequenceOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i6 | i3);
        int i11 = i9 | i10;
        int i12 = ~i6;
        int i13 = i9 | (~(i12 | i)) | i10;
        int i14 = (~(i3 | i6 | i)) | (~(i7 | i12 | i8));
        int i15 = i6 + i + i5 + (1322235619 * i2) + (440487356 * i4);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i6) - 2100690944) + ((-281430247) * i) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i5) + ((-942931968) * i2) + ((-1410334720) * i4) + (1251606528 * i16);
        int i18 = (i6 * 157034417) + 1376579869 + (i * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i5 * 157035401) + (i2 * (-982187909)) + (i4 * (-1869533796)) + (i16 * (-899022848));
        return i17 + ((i18 * i18) * (-511311872)) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ CharSequence onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallback = onExtraCallback(str);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        int i5 = onExtraCallback + 119;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return charSequenceOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String onExtraCallback(char c) {
        int i = 2 % 2;
        getFaceFeatureValue getfacefeaturevalue = new getFaceFeatureValue(c, (char) 12623, (char) 0, 4, null);
        getFaceFeatureValue getfacefeaturevalue2 = new getFaceFeatureValue(c, (char) 12643, (char) 12622);
        String str = "[" + c + getfacefeaturevalue.IAuthTabCallbackDefault() + "-" + getfacefeaturevalue2.IAuthTabCallbackDefault() + "]";
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static final CharSequence onNavigationEvent(char c) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(c);
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    public static final String onNavigationEvent(@NotNull ALCFaceAuthInfo aLCFaceAuthInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aLCFaceAuthInfo, "");
        String strJoinToString$default = CollectionsKt.joinToString$default(aLCFaceAuthInfo.onExtraCallback(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.core.utils.SyllablePatternsKt$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 31;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                char cCharValue = ((Character) obj).charValue();
                if (i4 == 0) {
                    return ALCAgeGenderGENDER.IAuthTabCallback(cCharValue);
                }
                ALCAgeGenderGENDER.IAuthTabCallback(cCharValue);
                throw null;
            }
        }, 30, (Object) null);
        if (aLCFaceAuthInfo.onExtraCallback().size() <= 1) {
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return strJoinToString$default;
        }
        String str = strJoinToString$default + "|" + onExtraCallback(aLCFaceAuthInfo.IAuthTabCallback());
        int i4 = onNavigationEvent + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final String onNavigationEvent(@NotNull ALCFaceDetection aLCFaceDetection) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aLCFaceDetection, "");
            onNavigationEvent(aLCFaceDetection.IAuthTabCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aLCFaceDetection, "");
        String strOnNavigationEvent = onNavigationEvent(aLCFaceDetection.IAuthTabCallback());
        int i3 = onNavigationEvent + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return strOnNavigationEvent;
    }

    public static final String onExtraCallback(@NotNull ALCFaceLivenessMode aLCFaceLivenessMode) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aLCFaceLivenessMode, "");
        if (aLCFaceLivenessMode instanceof ALCFaceDetection) {
            return onNavigationEvent((ALCFaceDetection) aLCFaceLivenessMode);
        }
        if (!(aLCFaceLivenessMode instanceof getFaceFeatureValue)) {
            return Regex.Companion.IAuthTabCallback(aLCFaceLivenessMode.toString());
        }
        String string = ((getFaceFeatureValue) aLCFaceLivenessMode).toString();
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getFaceFeatureValue getfacefeaturevalue = (getFaceFeatureValue) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getfacefeaturevalue, "");
            Intrinsics.areEqual(getfacefeaturevalue.onExtraCallbackWithResult(), ALCFaceAuthInfo.Companion.onExtraCallback());
            throw null;
        }
        Intrinsics.checkNotNullParameter(getfacefeaturevalue, "");
        ALCFaceAuthInfo aLCFaceAuthInfoOnExtraCallbackWithResult = getfacefeaturevalue.onExtraCallbackWithResult();
        ALCFaceAuthInfo.IAuthTabCallback iAuthTabCallback = ALCFaceAuthInfo.Companion;
        if (Intrinsics.areEqual(aLCFaceAuthInfoOnExtraCallbackWithResult, iAuthTabCallback.onExtraCallback())) {
            return "[" + getfacefeaturevalue.IAuthTabCallbackDefault() + "-" + getFaceFeatureValue.onExtraCallbackWithResult(getfacefeaturevalue, null, null, (char) 12622, 3, null).IAuthTabCallbackDefault() + "]";
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(onExtraCallback(getFaceFeatureValue.onExtraCallbackWithResult(getfacefeaturevalue, null, null, Character.valueOf(getfacefeaturevalue.onExtraCallbackWithResult().IAuthTabCallback()), 3, null)));
        if (getfacefeaturevalue.onExtraCallbackWithResult().onExtraCallback().size() > 1) {
            linkedHashSet.add(onExtraCallback(getFaceFeatureValue.onExtraCallbackWithResult(getfacefeaturevalue, null, null, (Character) CollectionsKt.first(getfacefeaturevalue.onExtraCallbackWithResult().onExtraCallback()), 3, null)) + "(\\s?" + onExtraCallback(((Character) CollectionsKt.last(getfacefeaturevalue.onExtraCallbackWithResult().onExtraCallback())).charValue()) + ")");
        }
        linkedHashSet.add(onExtraCallback(getFaceFeatureValue.onWarmupCompleted(getfacefeaturevalue, null, null, iAuthTabCallback.onExtraCallback(), 3, null)) + "(\\s?" + onNavigationEvent(getfacefeaturevalue.onExtraCallbackWithResult()) + ")");
        String strJoinToString$default = CollectionsKt.joinToString$default(linkedHashSet, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        int i3 = onExtraCallback + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return strJoinToString$default;
        }
        obj.hashCode();
        throw null;
    }

    private static final CharSequence onExtraCallback(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = "(\\s?" + str + "\\s?)";
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String strOnExtraCallback;
        int i = 0;
        ALCFaceDetectionItem aLCFaceDetectionItem = (ALCFaceDetectionItem) objArr[0];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aLCFaceDetectionItem, "");
        List<ALCFaceLivenessMode> listOnExtraCallback = aLCFaceDetectionItem.onExtraCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnExtraCallback, 10));
        Iterator<T> it = listOnExtraCallback.iterator();
        while (!(!it.hasNext())) {
            int i3 = onExtraCallback + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Object next = it.next();
            if (i < 0) {
                int i5 = onNavigationEvent + 69;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CollectionsKt.throwIndexOverflow();
            }
            ALCFaceLivenessMode aLCFaceLivenessMode = (ALCFaceLivenessMode) next;
            if (!(!(aLCFaceLivenessMode instanceof getFaceFeatureValue))) {
                int i6 = onNavigationEvent + 105;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0 ? i != aLCFaceDetectionItem.onExtraCallback().size() - 1 : i != aLCFaceDetectionItem.onExtraCallback().size() + 1) {
                    strOnExtraCallback = onExtraCallback(aLCFaceLivenessMode);
                } else {
                    strOnExtraCallback = (String) onExtraCallback(1543007351, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{(getFaceFeatureValue) aLCFaceLivenessMode}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1543007350);
                    int i7 = onNavigationEvent + 65;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            arrayList.add(strOnExtraCallback);
            i++;
        }
        return CollectionsKt.joinToString$default(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.core.utils.SyllablePatternsKt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = onExtraCallback + 47;
                onExtraCallbackWithResult = i10 % 128;
                String str = (String) obj;
                if (i10 % 2 == 0) {
                    return ALCAgeGenderGENDER.onExtraCallbackWithResult(str);
                }
                ALCAgeGenderGENDER.onExtraCallbackWithResult(str);
                throw null;
            }
        }, 30, (Object) null);
    }

    public static final String onNavigationEvent(@NotNull getFaceFeatureValue getfacefeaturevalue) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (String) onExtraCallback(1543007351, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{getfacefeaturevalue}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1543007350);
    }

    public static final String onNavigationEvent(@NotNull ALCFaceDetectionItem aLCFaceDetectionItem) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (String) onExtraCallback(343121645, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{aLCFaceDetectionItem}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -343121645);
    }
}
