package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ALCFaceSDK {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onWarmupCompleted;

    String access000();

    default boolean extraCallbackWithResult() {
        int i = 2 % 2;
        return false;
    }

    Map<String, Object> onNavigationEvent();

    List<String> writeTypedObject();

    default boolean access100() {
        int i = 2 % 2;
        boolean z = false;
        if (writeTypedObject() != null && (!r0.contains(r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId()))) {
            z = true;
        }
        return !z;
    }

    default boolean onWarmupCompleted(@NotNull r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdaqfjxzpq89uignp4inuj4r5tibc, "");
        List<String> listWriteTypedObject = writeTypedObject();
        if (listWriteTypedObject != null) {
            return listWriteTypedObject.contains(r8lambdaqfjxzpq89uignp4inuj4r5tibc.getId());
        }
        return false;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        static final /* synthetic */ IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();
        private static final List<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> onExtraCallback = CollectionsKt.listOf(new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.APPSFLYER, r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FACEBOOK, r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FIREBASE});

        private IAuthTabCallback() {
        }

        public static final /* synthetic */ List onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 33;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            List<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> list = onExtraCallback;
            int i5 = i2 + 103;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            throw null;
        }

        static {
            int i = IAuthTabCallback + 49;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    default List<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        List listOnNavigationEvent = IAuthTabCallback.onNavigationEvent();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOnNavigationEvent) {
            if (!(!onWarmupCompleted((r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc) obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
