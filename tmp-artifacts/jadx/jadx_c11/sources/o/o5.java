package o;

import im.toss.uikit.widget.TdsSkeletonV1View;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class o5 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final TdsSkeletonV1View.IAuthTabCallback onNavigationEvent(@Nullable String str) {
        TdsSkeletonV1View.IAuthTabCallback.onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        if (str != null) {
            switch (str.hashCode()) {
                case -2044746538:
                    if (str.equals("subtitleList")) {
                        int i2 = onExtraCallbackWithResult + 63;
                        onNavigationEvent = i2 % 128;
                        if (i2 % 2 == 0) {
                            return TdsSkeletonV1View.IAuthTabCallback.asBinder.onExtraCallback;
                        }
                        TdsSkeletonV1View.IAuthTabCallback.asBinder asbinder = TdsSkeletonV1View.IAuthTabCallback.asBinder.onExtraCallback;
                        throw null;
                    }
                    break;
                case -1959567019:
                    if (str.equals("subtitleListWithIcon")) {
                        int i3 = onNavigationEvent + 79;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 != 0) {
                            return TdsSkeletonV1View.IAuthTabCallback.access000.IAuthTabCallback;
                        }
                        int i4 = 20 / 0;
                        return TdsSkeletonV1View.IAuthTabCallback.access000.IAuthTabCallback;
                    }
                    break;
                case -1260153063:
                    if (str.equals("payDetail")) {
                        return TdsSkeletonV1View.IAuthTabCallback.IAuthTabCallbackDefault.onWarmupCompleted;
                    }
                    break;
                case -1140116589:
                    if (str.equals("topList")) {
                        int i5 = onNavigationEvent + 111;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            return TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor.IAuthTabCallback;
                        }
                        TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor getinterfacedescriptor = TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor.IAuthTabCallback;
                        throw null;
                    }
                    break;
                case -1044977637:
                    if (str.equals("amountTopList")) {
                        return TdsSkeletonV1View.IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted;
                    }
                    break;
                case -8386852:
                    if (!(!str.equals("cardOnly"))) {
                        int i6 = onExtraCallbackWithResult + 25;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 != 0) {
                            onnavigationevent = TdsSkeletonV1View.IAuthTabCallback.onNavigationEvent.onExtraCallback;
                            int i7 = 37 / 0;
                        } else {
                            onnavigationevent = TdsSkeletonV1View.IAuthTabCallback.onNavigationEvent.onExtraCallback;
                        }
                        int i8 = onExtraCallbackWithResult + 27;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        return onnavigationevent;
                    }
                    break;
                case 305586962:
                    if (str.equals("topListWithIcon")) {
                        return TdsSkeletonV1View.IAuthTabCallback.access100.onExtraCallback;
                    }
                    break;
                case 524914586:
                    if (str.equals("amountTopListWithIcon")) {
                        return TdsSkeletonV1View.IAuthTabCallback.onWarmupCompleted.onWarmupCompleted;
                    }
                    break;
                case 1345504618:
                    if (str.equals("listOnly")) {
                        return TdsSkeletonV1View.IAuthTabCallback.onTransact.onNavigationEvent;
                    }
                    break;
                case 1377200944:
                    if (str.equals("listWithIconOnlyy")) {
                        int i10 = onNavigationEvent + 121;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 != 0) {
                            return TdsSkeletonV1View.IAuthTabCallback.asInterface.onExtraCallback;
                        }
                        TdsSkeletonV1View.IAuthTabCallback.asInterface asinterface = TdsSkeletonV1View.IAuthTabCallback.asInterface.onExtraCallback;
                        throw null;
                    }
                    break;
            }
        }
        return TdsSkeletonV1View.IAuthTabCallback.IAuthTabCallbackStub.onWarmupCompleted;
    }
}
