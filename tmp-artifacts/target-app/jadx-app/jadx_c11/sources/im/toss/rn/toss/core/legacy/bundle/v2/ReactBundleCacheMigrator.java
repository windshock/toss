package im.toss.rn.toss.core.legacy.bundle.v2;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import im.toss.rn.toss.core.bundle.cache.RnBundleFileProcessLock;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TimeoutCompanionNONE1;
import o.getCodeNameBytes;
import o.r8lambda8mviLOQqqUbMmgyt26CXIocfr8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactBundleCacheMigrator {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static long IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onTransact;
    private final Lazy IAuthTabCallback;
    private volatile boolean onExtraCallback;
    private List<Migration> onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private final r8lambda8mviLOQqqUbMmgyt26CXIocfr8 onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        int i = IAuthTabCallbackDefault + 69;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        ReactBundleCacheMigrator reactBundleCacheMigrator = (ReactBundleCacheMigrator) objArr[0];
        File file = (File) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(reactBundleCacheMigrator, file);
        }
        onExtraCallbackWithResult(reactBundleCacheMigrator, file);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i3)) | (~(i8 | i3));
        int i10 = ~i3;
        int i11 = (~(i10 | i)) | (~(i8 | i));
        int i12 = ~(i8 | i7 | i10);
        int i13 = i3 + i + i2 + ((-2109949842) * i4) + (2078889904 * i6);
        int i14 = i13 * i13;
        int i15 = ((-1963971821) * i3) + 932184064 + (61854959 * i) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i2) + (610271232 * i4) + (922746880 * i6) + (671350784 * i14);
        int i16 = (i3 * (-573803825)) + 196542130 + (i * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i2 * (-573803307)) + (i4 * (-843101306)) + (i6 * (-1524517520)) + (i14 * 458489856);
        return i15 + ((i16 * i16) * 64749568) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ReactBundleCacheMigrator reactBundleCacheMigrator = (ReactBundleCacheMigrator) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        File fileIAuthTabCallback = IAuthTabCallback(reactBundleCacheMigrator);
        int i4 = asBinder + 25;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return fileIAuthTabCallback;
    }

    @Inject
    public ReactBundleCacheMigrator(@NotNull r8lambda8mviLOQqqUbMmgyt26CXIocfr8 r8lambda8mviloqqqubmmgyt26cxiocfr8) {
        Intrinsics.checkNotNullParameter(r8lambda8mviloqqqubmmgyt26cxiocfr8, "");
        this.onWarmupCompleted = r8lambda8mviloqqqubmmgyt26cxiocfr8;
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                File file = (File) ReactBundleCacheMigrator.onExtraCallbackWithResult(-1129836413, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1129836414, new Object[]{this.f$0}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
                int i4 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return file;
            }
        });
        this.onNavigationEvent = new Object();
        this.onExtraCallbackWithResult = CollectionsKt.listOf(new Migration(1, new Function1() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) ReactBundleCacheMigrator.onExtraCallbackWithResult(-1382007576, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1382007576, new Object[]{this.f$0, (File) obj}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
                int i4 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        }));
    }

    private final File onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        File file = (File) this.IAuthTabCallback.getValue();
        int i3 = onTransact + 93;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return file;
    }

    private static final File IAuthTabCallback(ReactBundleCacheMigrator reactBundleCacheMigrator) {
        int i = 2 % 2;
        File file = new File(reactBundleCacheMigrator.onWarmupCompleted.get(), "toss_react_bundle_cache");
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return file;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(ReactBundleCacheMigrator reactBundleCacheMigrator, File file) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        reactBundleCacheMigrator.onExtraCallback(file);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return unit;
    }

    public final void onNavigationEvent() {
        ReentrantLock reentrantLockPutIfAbsent;
        if (this.onExtraCallback) {
            return;
        }
        synchronized (this.onNavigationEvent) {
            if (this.onExtraCallback) {
                return;
            }
            RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
            File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(onExtraCallback());
            ConcurrentHashMap<String, ReentrantLock> concurrentHashMapOnExtraCallback = rnBundleFileProcessLock.onExtraCallback();
            String canonicalPath = fileOnExtraCallback.getCanonicalPath();
            ReentrantLock reentrantLock = concurrentHashMapOnExtraCallback.get(canonicalPath);
            if (reentrantLock == null && (reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.putIfAbsent(canonicalPath, (reentrantLock = new ReentrantLock()))) != null) {
                reentrantLock = reentrantLockPutIfAbsent;
            }
            ReentrantLock reentrantLock2 = reentrantLock;
            reentrantLock2.lock();
            try {
                if (reentrantLock2.getHoldCount() > 1) {
                    List listSortedWith = CollectionsKt.sortedWith(this.onExtraCallbackWithResult, new Comparator() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator$migrateIfNeeded$lambda$0$0$$inlined$sortedBy$1
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            int i = 2 % 2;
                            int i2 = IAuthTabCallback + 57;
                            onExtraCallbackWithResult = i2 % 128;
                            ReactBundleCacheMigrator.Migration migration = (ReactBundleCacheMigrator.Migration) t;
                            if (i2 % 2 != 0) {
                                return getCodeNameBytes.IAuthTabCallback(Integer.valueOf(migration.IAuthTabCallback()), Integer.valueOf(((ReactBundleCacheMigrator.Migration) t2).IAuthTabCallback()));
                            }
                            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Integer.valueOf(migration.IAuthTabCallback()), Integer.valueOf(((ReactBundleCacheMigrator.Migration) t2).IAuthTabCallback()));
                            int i3 = 26 / 0;
                            return iIAuthTabCallback;
                        }
                    });
                    if (listSortedWith.isEmpty()) {
                        this.onExtraCallback = true;
                        return;
                    }
                    if (!onExtraCallback().exists()) {
                        this.onExtraCallback = true;
                        return;
                    }
                    Ref.IntRef intRef = new Ref.IntRef();
                    int iOnWarmupCompleted = onWarmupCompleted(onExtraCallback());
                    intRef.element = iOnWarmupCompleted;
                    intRef.element = RangesKt.coerceAtMost(iOnWarmupCompleted, ((Migration) CollectionsKt.last(listSortedWith)).IAuthTabCallback());
                    ArrayList<Migration> arrayList = new ArrayList();
                    for (Object obj : listSortedWith) {
                        if (((Migration) obj).IAuthTabCallback() > intRef.element) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        this.onExtraCallback = true;
                        return;
                    }
                    for (Migration migration : arrayList) {
                        migration.onNavigationEvent().invoke(onExtraCallback());
                        onExtraCallback(onExtraCallback(), migration.IAuthTabCallback());
                        intRef.element = migration.IAuthTabCallback();
                    }
                    this.onExtraCallback = true;
                    Unit unit = Unit.INSTANCE;
                } else {
                    File parentFile = fileOnExtraCallback.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new RandomAccessFile(fileOnExtraCallback, "rw").getChannel();
                    try {
                        FileLock fileLockLock = channel.lock();
                        try {
                            List listSortedWith2 = CollectionsKt.sortedWith(this.onExtraCallbackWithResult, new Comparator() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator$migrateIfNeeded$lambda$0$0$$inlined$sortedBy$1
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    int i = 2 % 2;
                                    int i2 = IAuthTabCallback + 57;
                                    onExtraCallbackWithResult = i2 % 128;
                                    ReactBundleCacheMigrator.Migration migration2 = (ReactBundleCacheMigrator.Migration) t;
                                    if (i2 % 2 != 0) {
                                        return getCodeNameBytes.IAuthTabCallback(Integer.valueOf(migration2.IAuthTabCallback()), Integer.valueOf(((ReactBundleCacheMigrator.Migration) t2).IAuthTabCallback()));
                                    }
                                    int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Integer.valueOf(migration2.IAuthTabCallback()), Integer.valueOf(((ReactBundleCacheMigrator.Migration) t2).IAuthTabCallback()));
                                    int i3 = 26 / 0;
                                    return iIAuthTabCallback;
                                }
                            });
                            if (listSortedWith2.isEmpty()) {
                                this.onExtraCallback = true;
                                CloseableKt.closeFinally(channel, (Throwable) null);
                                return;
                            }
                            if (!onExtraCallback().exists()) {
                                this.onExtraCallback = true;
                                CloseableKt.closeFinally(channel, (Throwable) null);
                                return;
                            }
                            Ref.IntRef intRef2 = new Ref.IntRef();
                            int iOnWarmupCompleted2 = onWarmupCompleted(onExtraCallback());
                            intRef2.element = iOnWarmupCompleted2;
                            intRef2.element = RangesKt.coerceAtMost(iOnWarmupCompleted2, ((Migration) CollectionsKt.last(listSortedWith2)).IAuthTabCallback());
                            ArrayList<Migration> arrayList2 = new ArrayList();
                            for (Object obj2 : listSortedWith2) {
                                if (((Migration) obj2).IAuthTabCallback() > intRef2.element) {
                                    arrayList2.add(obj2);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                this.onExtraCallback = true;
                                CloseableKt.closeFinally(channel, (Throwable) null);
                                return;
                            }
                            for (Migration migration2 : arrayList2) {
                                migration2.onNavigationEvent().invoke(onExtraCallback());
                                onExtraCallback(onExtraCallback(), migration2.IAuthTabCallback());
                                intRef2.element = migration2.IAuthTabCallback();
                            }
                            this.onExtraCallback = true;
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(channel, (Throwable) null);
                        } finally {
                            fileLockLock.release();
                        }
                    } finally {
                    }
                }
                reentrantLock2.unlock();
                Unit unit3 = Unit.INSTANCE;
            } finally {
                reentrantLock2.unlock();
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackStub ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            int i3 = $10 + 81;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackStub)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 84 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.argb(0, 0, 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 3;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(File file) throws Throwable {
        int i = 2 % 2;
        if (file.exists()) {
            File file2 = new File(file, "kr");
            Object[] objArr = new Object[1];
            a(new char[]{6383, 21593, 6284, 24906, 31409, 35279, 4155, 10718}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, objArr);
            File file3 = new File(file2, ((String) objArr[0]).intern());
            File file4 = new File(file2, "bank");
            File file5 = new File(file, "bank");
            if (!(!file5.exists())) {
                int i2 = onTransact + 43;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 75 / 0;
                    if (file5.isDirectory()) {
                        onExtraCallback(file5, file4);
                    }
                } else if (file5.isDirectory()) {
                }
            }
            List<File> listOnExtraCallbackWithResult = onExtraCallbackWithResult(file.listFiles());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOnExtraCallbackWithResult) {
                if (!Intrinsics.areEqual(((File) obj).getName(), ".migration_version")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!Intrinsics.areEqual(((File) obj2).getName(), ".migration_completed")) {
                    int i4 = asBinder + 45;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (!(!it.hasNext())) {
                Object next = it.next();
                if (!Intrinsics.areEqual(((File) next).getName(), "bank")) {
                    arrayList3.add(next);
                }
            }
            ArrayList<File> arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (!Intrinsics.areEqual(((File) obj3).getName(), "kr")) {
                    int i6 = onTransact + 79;
                    asBinder = i6 % 128;
                    if (i6 % 2 == 0) {
                        arrayList4.add(obj3);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    arrayList4.add(obj3);
                }
            }
            if (arrayList4.isEmpty()) {
                return;
            }
            int i7 = onTransact + 79;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            file3.mkdirs();
            file2.mkdirs();
            for (File file6 : arrayList4) {
                onExtraCallback(file6, new File(file3, file6.getName()));
            }
        }
    }

    private final int onWarmupCompleted(File file) {
        int i = 2 % 2;
        File file2 = new File(file, ".migration_version");
        if (file2.exists()) {
            Integer intOrNull = StringsKt.toIntOrNull(FilesKt.readText$default(file2, (Charset) null, 1, (Object) null));
            if (intOrNull == null) {
                return 0;
            }
            int i2 = onTransact + 99;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return RangesKt.coerceAtLeast(intOrNull.intValue(), 0);
        }
        File file3 = new File(file, ".migration_completed");
        if (!file3.exists()) {
            return 0;
        }
        int i4 = onTransact + 57;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallback(file, 1);
            file3.delete();
            return 0;
        }
        onExtraCallback(file, 1);
        file3.delete();
        return 1;
    }

    private final void onExtraCallback(File file, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 107;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (!file.exists()) {
                file.mkdirs();
                int i4 = onTransact + 101;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
            FilesKt.writeText$default(new File(file, ".migration_version"), String.valueOf(i), (Charset) null, 2, (Object) null);
            return;
        }
        file.exists();
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(File file, File file2) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        Object obj = null;
        if (!file.exists() || file.renameTo(file2)) {
            int i4 = asBinder + 97;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (file2.exists()) {
            int i5 = onTransact + 109;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                FilesKt.deleteRecursively(file2);
            } else {
                FilesKt.deleteRecursively(file2);
                obj.hashCode();
                throw null;
            }
        }
        FilesKt.copyRecursively$default(file, file2, true, (Function2) null, 4, (Object) null);
        FilesKt.deleteRecursively(file);
    }

    private final List<File> onExtraCallbackWithResult(File[] fileArr) {
        List<File> list;
        int i = 2 % 2;
        int i2 = asBinder + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (fileArr != null && (list = ArraysKt.toList(fileArr)) != null) {
            int i4 = onTransact + 31;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return list;
        }
        List<File> listEmptyList = CollectionsKt.emptyList();
        int i6 = onTransact + 37;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return listEmptyList;
    }

    public static final class Migration {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final int onExtraCallback;
        private final Function1<File, Unit> onNavigationEvent;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r7 instanceof im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator.Migration) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        
            if (r6.onExtraCallback == ((im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator.Migration) r7).onExtraCallback) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            r2 = r2 + 97;
            im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator.Migration.IAuthTabCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        
            if ((r2 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            r7 = 95 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
        
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(r6.onNavigationEvent, r7.onNavigationEvent)) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            r7 = im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator.Migration.onWarmupCompleted + 101;
            im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator.Migration.IAuthTabCallback = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 81 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.onExtraCallback);
            return i3 != 0 ? (iHashCode + 7) >>> this.onNavigationEvent.hashCode() : (iHashCode * 31) + this.onNavigationEvent.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Migration(version=" + this.onExtraCallback + ", action=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallback + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 97 / 0;
            }
            return str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Migration(int i, @NotNull Function1<? super File, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = i;
            this.onNavigationEvent = function1;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.onExtraCallback;
            int i6 = i3 + 83;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 45 / 0;
            }
            return i5;
        }

        public final Function1<File, Unit> onNavigationEvent() {
            Function1<File, Unit> function1;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                function1 = this.onNavigationEvent;
                int i4 = 50 / 0;
            } else {
                function1 = this.onNavigationEvent;
            }
            int i5 = i3 + 87;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            throw null;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ File onExtraCallback(ReactBundleCacheMigrator reactBundleCacheMigrator) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (File) onExtraCallbackWithResult(-1129836413, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1129836414, new Object[]{reactBundleCacheMigrator}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(ReactBundleCacheMigrator reactBundleCacheMigrator, File file) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(-1382007576, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1382007576, new Object[]{reactBundleCacheMigrator, file}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStub = -8648939754118230416L;
    }
}
