package o;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Charsets;
import o.RealImageLoader_androidKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 {
    private static final onExtraCallback Companion;
    private static int asInterface = 0;
    private static int onExtraCallback = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final Context IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final getMax onNavigationEvent;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = onExtraCallback + 43;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1(@NotNull Context context, @NotNull getMax getmax, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getmax, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = context;
        this.onNavigationEvent = getmax;
        this.onExtraCallbackWithResult = str;
    }

    public static final /* synthetic */ onExtraCallback IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return Companion;
        }
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 49;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onExtraCallbackWithResult;
        int i5 = i2 + 21;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ getMax onNavigationEvent(RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        getMax getmax = realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onNavigationEvent;
        int i5 = i3 + 1;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return getmax;
    }

    public final Context onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent;
        private RealImageLoader_androidKt IAuthTabCallback;
        private final RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 onExtraCallback;
        private newImageLoader onExtraCallbackWithResult;
        private RealImageLoader_nonNativeKt onWarmupCompleted;

        public onWarmupCompleted(@NotNull RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, @NotNull newImageLoader newimageloader, @NotNull RealImageLoader_nonNativeKt realImageLoader_nonNativeKt, @NotNull RealImageLoader_androidKt realImageLoader_androidKt) {
            Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
            Intrinsics.checkNotNullParameter(newimageloader, "");
            Intrinsics.checkNotNullParameter(realImageLoader_nonNativeKt, "");
            Intrinsics.checkNotNullParameter(realImageLoader_androidKt, "");
            this.onExtraCallback = realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1;
            this.onExtraCallbackWithResult = newimageloader;
            this.onWarmupCompleted = realImageLoader_nonNativeKt;
            this.IAuthTabCallback = realImageLoader_androidKt;
        }

        public final boolean onExtraCallbackWithResult(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                boolean zOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(this.onExtraCallbackWithResult, this.onWarmupCompleted, RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onNavigationEvent(this.onExtraCallback).onNavigationEvent(str, RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onExtraCallback(this.onExtraCallback)), this.IAuthTabCallback);
                RealImageLoader_jvmCommonKt.onNavigationEvent();
                this.onExtraCallbackWithResult.onWarmupCompleted();
                Objects.toString(this.onWarmupCompleted);
                int i2 = IAuthTabCallbackDefault + 15;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return zOnWarmupCompleted;
            } catch (Exception e) {
                RealImageLoader_jvmCommonKt.onNavigationEvent();
                e.getMessage();
                RealImageLoaderKtaddServiceLoaderComponentslambda3inlinedsortedByDescending1.onExtraCallback(this.onExtraCallback).onExtraCallback(this.onExtraCallbackWithResult, this.onWarmupCompleted);
                return false;
            }
        }
    }

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 IAuthTabCallback;
        private RealImageLoader_nonNativeKt onExtraCallback;
        private newImageLoader onWarmupCompleted;

        public onNavigationEvent(@NotNull RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, @NotNull newImageLoader newimageloader, @NotNull RealImageLoader_nonNativeKt realImageLoader_nonNativeKt) {
            Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
            Intrinsics.checkNotNullParameter(newimageloader, "");
            Intrinsics.checkNotNullParameter(realImageLoader_nonNativeKt, "");
            this.IAuthTabCallback = realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1;
            this.onWarmupCompleted = newimageloader;
            this.onExtraCallback = realImageLoader_nonNativeKt;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        
            if (r1 != null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        
            r1 = o.RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onNavigationEvent(r5.IAuthTabCallback).IAuthTabCallback(r1, o.RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onExtraCallback(r5.IAuthTabCallback));
            o.RealImageLoader_jvmCommonKt.onNavigationEvent();
            r3 = r5.onWarmupCompleted;
            r5.onExtraCallback.onExtraCallbackWithResult();
            java.util.Objects.toString(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            r3 = o.RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onNavigationEvent.onNavigationEvent + 19;
            o.RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onNavigationEvent.onExtraCallbackWithResult = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        
            if ((r3 % 2) != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
        
            if (r1 != null) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String IAuthTabCallback() {
            String strOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            try {
                if (i2 % 2 == 0) {
                    strOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(this.onWarmupCompleted, this.onExtraCallback);
                    int i3 = 61 / 0;
                } else {
                    strOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(this.onWarmupCompleted, this.onExtraCallback);
                }
            } catch (Exception e) {
                RealImageLoader_jvmCommonKt.onNavigationEvent();
                e.getMessage();
                RealImageLoaderKtaddServiceLoaderComponentslambda3inlinedsortedByDescending1.onExtraCallback(this.IAuthTabCallback).onExtraCallback(this.onWarmupCompleted, this.onExtraCallback);
                return null;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final Context onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.onWarmupCompleted = context;
        }

        public final boolean onWarmupCompleted(@NotNull newImageLoader newimageloader, @NotNull RealImageLoader_nonNativeKt realImageLoader_nonNativeKt) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(newimageloader, "");
            Intrinsics.checkNotNullParameter(realImageLoader_nonNativeKt, "");
            List<File> listOnNavigationEvent = newimageloader.onNavigationEvent(realImageLoader_nonNativeKt);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent, 10));
            Iterator<T> it = listOnNavigationEvent.iterator();
            while (it.hasNext()) {
                arrayList.add(RealImageLoader_androidKt.Companion.onExtraCallback((File) it.next(), this.onWarmupCompleted));
            }
            if (arrayList.isEmpty()) {
                int i2 = IAuthTabCallback + 63;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            Iterator it2 = arrayList.iterator();
            do {
                Object obj = null;
                if (!it2.hasNext()) {
                    int i4 = onExtraCallback + 55;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return false;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i5 = IAuthTabCallback + 77;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    ((RealImageLoader_androidKt) it2.next()).IAuthTabCallback();
                    throw null;
                }
            } while (((RealImageLoader_androidKt) it2.next()).IAuthTabCallback());
            return true;
        }

        public final boolean onExtraCallback(@NotNull newImageLoader newimageloader, @NotNull RealImageLoader_nonNativeKt realImageLoader_nonNativeKt) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(newimageloader, "");
            Intrinsics.checkNotNullParameter(realImageLoader_nonNativeKt, "");
            List<File> listOnNavigationEvent = newimageloader.onNavigationEvent(realImageLoader_nonNativeKt);
            ArrayList<File> arrayList = new ArrayList();
            Iterator<T> it = listOnNavigationEvent.iterator();
            while (!(!it.hasNext())) {
                Object next = it.next();
                if (!RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.IAuthTabCallback().onExtraCallbackWithResult((File) next)) {
                    int i2 = IAuthTabCallback + 3;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    arrayList.add(next);
                }
            }
            while (true) {
                int i4 = onExtraCallback + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                boolean z = false;
                for (File file : arrayList) {
                    int i6 = onExtraCallback + 9;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (!z) {
                        int i8 = onExtraCallback + 103;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.IAuthTabCallback().onNavigationEvent(file);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.IAuthTabCallback().onNavigationEvent(file)) {
                        }
                    }
                    int i9 = IAuthTabCallback + 115;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    z = true;
                }
                return z;
            }
        }
    }

    public final String onExtraCallbackWithResult(@NotNull newImageLoader newimageloader, @NotNull RealImageLoader_nonNativeKt realImageLoader_nonNativeKt) {
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(newimageloader, "");
        Intrinsics.checkNotNullParameter(realImageLoader_nonNativeKt, "");
        Object obj = null;
        try {
            List<File> listOnNavigationEvent = newimageloader.onNavigationEvent(realImageLoader_nonNativeKt);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listOnNavigationEvent) {
                File file = (File) obj2;
                if (RealImageLoader_androidKt.Companion.onExtraCallback(file, this.IAuthTabCallback).IAuthTabCallback() && !Companion.onExtraCallbackWithResult(file)) {
                    int i2 = asInterface + 111;
                    onTransact = i2 % 128;
                    int i3 = i2 % 2;
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Companion.onNavigationEvent((File) it.next());
            }
            Iterator<T> it2 = listOnNavigationEvent.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                File file2 = (File) next;
                if (file2.canRead()) {
                    int i4 = onTransact + 97;
                    asInterface = i4 % 128;
                    if (i4 % 2 != 0) {
                        RealImageLoader_androidKt.Companion.onExtraCallback(file2, this.IAuthTabCallback).IAuthTabCallback();
                        obj.hashCode();
                        throw null;
                    }
                    if (!RealImageLoader_androidKt.Companion.onExtraCallback(file2, this.IAuthTabCallback).IAuthTabCallback()) {
                        break;
                    }
                }
            }
            File file3 = (File) next;
            if (file3 != null) {
                RealImageLoader_jvmCommonKt.onNavigationEvent();
                newimageloader.onWarmupCompleted();
                realImageLoader_nonNativeKt.onExtraCallbackWithResult();
                file3.getAbsolutePath();
                int i5 = onTransact + 87;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
            if (file3 == null) {
                int i7 = asInterface + 51;
                onTransact = i7 % 128;
                if (i7 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i8 = onTransact + 87;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                return FilesKt.readText(file3, Charsets.UTF_8);
            }
            int i9 = 58 / 0;
            return FilesKt.readText(file3, Charsets.UTF_8);
        } catch (Exception e) {
            RealImageLoader_jvmCommonKt.onNavigationEvent();
            e.getMessage();
            return null;
        }
    }

    public final boolean onWarmupCompleted(@NotNull newImageLoader newimageloader, @NotNull RealImageLoader_nonNativeKt realImageLoader_nonNativeKt, @NotNull String str, @NotNull RealImageLoader_androidKt realImageLoader_androidKt) {
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(newimageloader, "");
        Intrinsics.checkNotNullParameter(realImageLoader_nonNativeKt, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(realImageLoader_androidKt, "");
        try {
            newimageloader.onNavigationEvent();
            List<File> listOnNavigationEvent = newimageloader.onNavigationEvent(realImageLoader_nonNativeKt);
            ArrayList<File> arrayList = new ArrayList();
            for (Object obj : listOnNavigationEvent) {
                if (!Companion.onExtraCallbackWithResult((File) obj)) {
                    arrayList.add(obj);
                }
            }
            for (File file : arrayList) {
                RealImageLoader_jvmCommonKt.onNavigationEvent();
                file.getAbsolutePath();
                Companion.onNavigationEvent(file);
            }
            List<File> listOnNavigationEvent2 = newimageloader.onNavigationEvent(realImageLoader_nonNativeKt);
            ArrayList<File> arrayList2 = new ArrayList();
            Iterator<T> it = listOnNavigationEvent2.iterator();
            while (!(!it.hasNext())) {
                int i2 = asInterface + 121;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    next = it.next();
                    int i3 = 64 / 0;
                    if (Companion.onExtraCallbackWithResult((File) next)) {
                        arrayList2.add(next);
                    }
                } else {
                    next = it.next();
                    if (Companion.onExtraCallbackWithResult((File) next)) {
                        arrayList2.add(next);
                    }
                }
            }
            for (File file2 : arrayList2) {
                RealImageLoader_jvmCommonKt.onNavigationEvent();
                file2.getAbsolutePath();
                file2.delete();
            }
            String strOnWarmupCompleted = realImageLoader_nonNativeKt.onWarmupCompleted();
            File file3 = new File(newimageloader.onExtraCallbackWithResult(), "." + Random.onNavigationEvent.onNavigationEvent() + "." + strOnWarmupCompleted + "." + RealImageLoader_androidKt.onExtraCallback.onNavigationEvent.onExtraCallbackWithResult());
            RealImageLoader_jvmCommonKt.onNavigationEvent();
            realImageLoader_nonNativeKt.onExtraCallbackWithResult();
            file3.getAbsolutePath();
            Objects.toString(newimageloader);
            FilesKt.writeText(file3, str, Charsets.UTF_8);
            File file4 = new File(newimageloader.onExtraCallbackWithResult(), strOnWarmupCompleted + "." + realImageLoader_androidKt.onExtraCallbackWithResult());
            file3.renameTo(file4);
            RealImageLoader_jvmCommonKt.onNavigationEvent();
            file3.getAbsolutePath();
            file4.getAbsolutePath();
            int i4 = asInterface + 81;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
            return true;
        } catch (Exception e) {
            RealImageLoader_jvmCommonKt.onNavigationEvent();
            e.getMessage();
            return false;
        }
    }

    static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final boolean onNavigationEvent(@NotNull File file) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(file, "");
            boolean zRenameTo = file.renameTo(new File(file.getAbsolutePath() + "." + RealImageLoader_androidKt.onExtraCallback.onNavigationEvent.onExtraCallbackWithResult()));
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return zRenameTo;
        }

        public final boolean onExtraCallbackWithResult(@NotNull File file) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(file, "");
            boolean zAreEqual = Intrinsics.areEqual(FilesKt.getExtension(file), RealImageLoader_androidKt.onExtraCallback.onNavigationEvent.onExtraCallbackWithResult());
            int i4 = onExtraCallback + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return zAreEqual;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
