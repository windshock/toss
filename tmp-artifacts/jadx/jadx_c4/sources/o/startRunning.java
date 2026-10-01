package o;

import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import o.onPreviewFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class startRunning {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final List<onPreviewFrame> onNavigationEvent = new ArrayList();

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i)) | i5;
        int i9 = i | i5 | i7;
        int i10 = i5 + i2 + i3 + (1159740906 * i6) + ((-617157175) * i4);
        int i11 = i10 * i10;
        int i12 = ((i5 * 934236018) - 2089811968) + (934236018 * i2) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i3) + (1488977920 * i6) + (2111832064 * i4) + (2070937600 * i11);
        int i13 = (i5 * (-824977050)) + 1921657099 + (i2 * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i3 * (-824977973)) + (i6 * (-135083378)) + (i4 * 1125239651) + (i11 * 298844160);
        return i12 + ((i13 * i13) * 2098200576) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        onPreviewFrame onpreviewframeIAuthTabCallback;
        startRunning startrunning = (startRunning) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        List<onPreviewFrame> list = startrunning.onNavigationEvent;
        if (str != null) {
            int i2 = IAuthTabCallback + 55;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                stopRunning.IAuthTabCallback(str);
                throw null;
            }
            onpreviewframeIAuthTabCallback = stopRunning.IAuthTabCallback(str);
            if (onpreviewframeIAuthTabCallback == null) {
                onpreviewframeIAuthTabCallback = onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult;
                int i3 = IAuthTabCallback + 27;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 % 3;
                }
            }
        }
        list.add(onpreviewframeIAuthTabCallback);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@Nullable Boolean bool) {
        onPreviewFrame onpreviewframeIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<onPreviewFrame> list = this.onNavigationEvent;
        if (bool != null) {
            int i5 = i2 + 39;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            onpreviewframeIAuthTabCallback = stopRunning.IAuthTabCallback(bool.booleanValue());
            if (onpreviewframeIAuthTabCallback == null) {
                onpreviewframeIAuthTabCallback = onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult;
                int i7 = onExtraCallback + 21;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        list.add(onpreviewframeIAuthTabCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@Nullable Integer num) {
        onPreviewFrame onpreviewframeOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<onPreviewFrame> list = this.onNavigationEvent;
        if (num != null) {
            int i5 = i3 + 47;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            onpreviewframeOnExtraCallback = stopRunning.onExtraCallback(num.intValue());
            if (onpreviewframeOnExtraCallback == null) {
                onpreviewframeOnExtraCallback = onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult;
                int i7 = onExtraCallback + 89;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        list.add(onpreviewframeOnExtraCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@Nullable Long l) {
        onPreviewFrame onpreviewframeOnWarmupCompleted;
        int i = 2 % 2;
        List<onPreviewFrame> list = this.onNavigationEvent;
        if (l != null) {
            int i2 = IAuthTabCallback + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onpreviewframeOnWarmupCompleted = stopRunning.onWarmupCompleted(l.longValue());
            if (onpreviewframeOnWarmupCompleted == null) {
                onpreviewframeOnWarmupCompleted = onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult;
                int i4 = IAuthTabCallback + 53;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 3;
                }
            }
        }
        list.add(onpreviewframeOnWarmupCompleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@Nullable Double d) {
        onPreviewFrame onpreviewframeOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            List<onPreviewFrame> list = this.onNavigationEvent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<onPreviewFrame> list2 = this.onNavigationEvent;
        if (d != null) {
            int i4 = i3 + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            onpreviewframeOnNavigationEvent = stopRunning.onNavigationEvent(d.doubleValue());
            if (onpreviewframeOnNavigationEvent == null) {
                onpreviewframeOnNavigationEvent = onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult;
                int i6 = onExtraCallback + 81;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 % 3;
                }
            }
        }
        list2.add(onpreviewframeOnNavigationEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@Nullable JsonElement jsonElement) {
        onPreviewFrame onpreviewframeOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<onPreviewFrame> list = this.onNavigationEvent;
        if (jsonElement != null) {
            int i5 = i2 + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            onpreviewframeOnWarmupCompleted = stopRunning.onWarmupCompleted(jsonElement);
            if (onpreviewframeOnWarmupCompleted == null) {
                onpreviewframeOnWarmupCompleted = onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult;
                int i7 = onExtraCallback + 39;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        list.add(onpreviewframeOnWarmupCompleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[PHI: r1
      0x002f: PHI (r1v6 java.util.List<o.onPreviewFrame>) = 
      (r1v3 java.util.List<o.onPreviewFrame>)
      (r1v4 java.util.List<o.onPreviewFrame>)
      (r1v8 java.util.List<o.onPreviewFrame>)
     binds: [B:8:0x0027, B:10:0x002d, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r1
      0x0029: PHI (r1v4 java.util.List<o.onPreviewFrame>) = (r1v3 java.util.List<o.onPreviewFrame>), (r1v8 java.util.List<o.onPreviewFrame>) binds: [B:8:0x0027, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        List<onPreviewFrame> list;
        onPreviewFrame onpreviewframeOnNavigationEvent;
        startRunning startrunning = (startRunning) objArr[0];
        com.google.gson.JsonElement jsonElement = (com.google.gson.JsonElement) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            list = startrunning.onNavigationEvent;
            int i3 = 12 / 0;
            if (jsonElement != null) {
                onpreviewframeOnNavigationEvent = stopRunning.onNavigationEvent(jsonElement);
                if (onpreviewframeOnNavigationEvent == null) {
                    onpreviewframeOnNavigationEvent = onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult;
                    int i4 = IAuthTabCallback + 125;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        } else {
            list = startrunning.onNavigationEvent;
            if (jsonElement != null) {
            }
        }
        list.add(onpreviewframeOnNavigationEvent);
        return null;
    }

    public final void IAuthTabCallback(@NotNull onPreviewFrame onpreviewframe) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onpreviewframe, "");
            this.onNavigationEvent.add(onpreviewframe);
        } else {
            Intrinsics.checkNotNullParameter(onpreviewframe, "");
            this.onNavigationEvent.add(onpreviewframe);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.add(onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult);
            throw null;
        }
        this.onNavigationEvent.add(onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult);
        int i3 = IAuthTabCallback + 91;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final onPreviewFrame[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        return (onPreviewFrame[]) (i2 % 2 == 0 ? this.onNavigationEvent.toArray(new onPreviewFrame[1]) : this.onNavigationEvent.toArray(new onPreviewFrame[0]));
    }

    public final void IAuthTabCallback(@Nullable com.google.gson.JsonElement jsonElement) {
        onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this, jsonElement}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public final void onExtraCallback(@Nullable String str) {
        onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }
}
