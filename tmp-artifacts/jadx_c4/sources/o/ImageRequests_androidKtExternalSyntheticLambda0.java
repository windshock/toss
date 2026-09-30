package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageRequests_androidKtExternalSyntheticLambda0 implements ALCFaceSDK11 {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int IAuthTabCallback = 8;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final TextRoundCornerProgressBarSavedState1 onWarmupCompleted;

    static {
        int i = onNavigationEvent + 99;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public ImageRequests_androidKtExternalSyntheticLambda0(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.onWarmupCompleted = textRoundCornerProgressBarSavedState1;
    }

    @Override // o.ALCFaceSDK11
    public C0063getFeatureExtension onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        C0063getFeatureExtension c0063getFeatureExtension = (C0063getFeatureExtension) TextRoundCornerProgressBarSavedState1.onWarmupCompleted(this.onWarmupCompleted, str, C0063getFeatureExtension.class, null, 4, null);
        int i4 = asBinder + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return c0063getFeatureExtension;
        }
        throw null;
    }

    @Override // o.ALCFaceSDK11
    public void IAuthTabCallback(@NotNull C0063getFeatureExtension c0063getFeatureExtension) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(c0063getFeatureExtension, "");
            this.onWarmupCompleted.IAuthTabCallback(c0063getFeatureExtension.onExtraCallback(), c0063getFeatureExtension);
        } else {
            Intrinsics.checkNotNullParameter(c0063getFeatureExtension, "");
            this.onWarmupCompleted.IAuthTabCallback(c0063getFeatureExtension.onExtraCallback(), c0063getFeatureExtension);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.ALCFaceSDK11
    public void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted.onTransact(str);
            int i3 = 31 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted.onTransact(str);
        }
        int i4 = asBinder + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.ALCFaceSDK11
    public C0062getAttributeExtension onNavigationEvent(@NotNull String str) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            objOnWarmupCompleted = TextRoundCornerProgressBarSavedState1.onWarmupCompleted(this.onWarmupCompleted, IAuthTabCallback(str), C0062getAttributeExtension.class, null, 2, null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            objOnWarmupCompleted = TextRoundCornerProgressBarSavedState1.onWarmupCompleted(this.onWarmupCompleted, IAuthTabCallback(str), C0062getAttributeExtension.class, null, 4, null);
        }
        return (C0062getAttributeExtension) objOnWarmupCompleted;
    }

    @Override // o.ALCFaceSDK11
    public void onExtraCallbackWithResult(@NotNull C0062getAttributeExtension c0062getAttributeExtension) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(c0062getAttributeExtension, "");
        this.onWarmupCompleted.IAuthTabCallback(IAuthTabCallback(c0062getAttributeExtension.onExtraCallbackWithResult()), c0062getAttributeExtension);
        int i4 = asBinder + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
    }

    @Override // o.ALCFaceSDK11
    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted.onTransact(IAuthTabCallback(str));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted.onTransact(IAuthTabCallback(str));
        int i3 = onExtraCallback + 25;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
    }

    @Override // o.ALCFaceSDK11
    public void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            drawBackgroundProgress.IAuthTabCallback(this.onWarmupCompleted, z);
            int i3 = 50 / 0;
        } else {
            drawBackgroundProgress.IAuthTabCallback(this.onWarmupCompleted, z);
        }
        int i4 = onExtraCallback + 123;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    private final String IAuthTabCallback(String str) {
        int i = 2 % 2;
        String str2 = "group:" + str;
        int i2 = onExtraCallback + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    @Override // o.ALCFaceSDK11
    public Collection<String> IAuthTabCallback() {
        int i = 2 % 2;
        Collection collectionOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        ArrayList arrayList = new ArrayList();
        int i2 = onExtraCallback + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        for (Object obj : collectionOnWarmupCompleted) {
            int i4 = onExtraCallback + 21;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.startsWith$default((String) obj, "group:", false, 2, (Object) null)) {
                int i6 = onExtraCallback + 125;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(obj);
                if (i7 == 0) {
                    throw null;
                }
            }
        }
        return arrayList;
    }

    @Override // o.ALCFaceSDK11
    public Collection<String> onNavigationEvent() {
        int i = 2 % 2;
        Collection collectionOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionOnWarmupCompleted) {
            int i2 = onExtraCallback + 39;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (!(!StringsKt.startsWith$default((String) obj, "group:", false, 2, (Object) null))) {
                arrayList.add(obj);
                int i4 = asBinder + 21;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i6 = onExtraCallback + 97;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                arrayList2.add(StringsKt.removePrefix((String) it.next(), "group:"));
                throw null;
            }
            arrayList2.add(StringsKt.removePrefix((String) it.next(), "group:"));
        }
        return arrayList2;
    }
}
