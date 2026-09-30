package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceDetection;
import o.getFaceFeatureValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceDetectionItem {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<ALCFaceLivenessMode> onNavigationEvent;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = onExtraCallback + 29;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        Object obj2 = null;
        if (!(obj instanceof ALCFaceDetectionItem)) {
            int i4 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, ((ALCFaceDetectionItem) obj).onNavigationEvent)) {
            return false;
        }
        int i5 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int i4 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALCFaceDetectionItem(@NotNull List<? extends ALCFaceLivenessMode> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
    }

    public final List<ALCFaceLivenessMode> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<ALCFaceLivenessMode> list = this.onNavigationEvent;
        int i4 = i3 + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ALCFaceDetectionItem onNavigationEvent(onNavigationEvent onnavigationevent, String str, Function1 function1, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 2) != 0) {
                function1 = null;
            }
            ALCFaceDetectionItem aLCFaceDetectionItemIAuthTabCallback = onnavigationevent.IAuthTabCallback(str, function1);
            int i4 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return aLCFaceDetectionItemIAuthTabCallback;
        }

        public final ALCFaceDetectionItem IAuthTabCallback(@NotNull String str, @Nullable Function1<? super Integer, ? extends ALCFaceLivenessMode> function1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            ArrayList arrayList = new ArrayList();
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    getFaceFeatureValue.Companion.onNavigationEvent(str.codePointAt(i2));
                    throw null;
                }
                int iCodePointAt = str.codePointAt(i2);
                try {
                    getFaceFeatureValue.onExtraCallbackWithResult onextracallbackwithresult = getFaceFeatureValue.Companion;
                    if (!(!onextracallbackwithresult.onNavigationEvent(iCodePointAt))) {
                        arrayList.add(onextracallbackwithresult.IAuthTabCallback(iCodePointAt));
                    } else {
                        ALCFaceDetection.IAuthTabCallback iAuthTabCallback = ALCFaceDetection.Companion;
                        if (!iAuthTabCallback.onExtraCallbackWithResult(iCodePointAt)) {
                            throw new IllegalStateException();
                        }
                        arrayList.add(iAuthTabCallback.onNavigationEvent(iCodePointAt));
                    }
                } catch (Exception unused) {
                    arrayList.add(function1 != null ? (ALCFaceLivenessMode) function1.invoke(Integer.valueOf(iCodePointAt)) : new ALCFaceLandmark((char) iCodePointAt));
                    int i4 = onWarmupCompleted + 67;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            return new ALCFaceDetectionItem(arrayList);
        }
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strJoinToString$default = CollectionsKt.joinToString$default(this.onNavigationEvent, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        int i4 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return strJoinToString$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
