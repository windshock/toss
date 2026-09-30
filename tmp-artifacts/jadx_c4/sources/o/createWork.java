package o;

import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class createWork {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final createWork onWarmupCompleted = new createWork();

    static {
        int i = onExtraCallback + 43;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 84 / 0;
        }
    }

    private createWork() {
    }

    public final boolean IAuthTabCallback(@NotNull TTAppOpenAdActivity3 tTAppOpenAdActivity3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity3, "");
        List listOnExtraCallback = tTAppOpenAdActivity3.onExtraCallback();
        if (listOnExtraCallback == null) {
            int i2 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                CollectionsKt.emptyList();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            listOnExtraCallback = CollectionsKt.emptyList();
        }
        List list = listOnExtraCallback;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            int i3 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String string = ((ParcelUuid) it.next()).getUuid().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            arrayList.add(lowerCase);
        }
        String lowerCase2 = OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallbackDefault().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return arrayList.contains(lowerCase2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return o.ProcessorExternalSyntheticLambda1.iOS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r5 = o.ProcessorExternalSyntheticLambda1.ANDROID;
        r1 = o.createWork.onExtraCallbackWithResult + 9;
        o.createWork.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if ((!onExtraCallbackWithResult(r5)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((!onExtraCallbackWithResult(r5)) != true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ProcessorExternalSyntheticLambda1 onNavigationEvent(@NotNull TTAppOpenAdActivity3 tTAppOpenAdActivity3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tTAppOpenAdActivity3, "");
            int i3 = 14 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tTAppOpenAdActivity3, "");
        }
    }

    private final boolean onExtraCallbackWithResult(TTAppOpenAdActivity3 tTAppOpenAdActivity3) {
        int i = 2 % 2;
        byte[] bArrOnExtraCallbackWithResult = tTAppOpenAdActivity3.onExtraCallbackWithResult(76);
        if (bArrOnExtraCallbackWithResult != null) {
            int i2 = onNavigationEvent + 117;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (bArrOnExtraCallbackWithResult.length != 0) {
                int i5 = i3 + 87;
                onNavigationEvent = i5 % 128;
                return i5 % 2 != 0;
            }
        }
        return false;
    }
}
