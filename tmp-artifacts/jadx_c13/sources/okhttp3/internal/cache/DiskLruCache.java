package okhttp3.internal.cache;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TTAppOpenAdActivity9;
import o.TTAppOpenAdTransActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTFullScreenVideoActivity3;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import o.setExecute;
import o.setWrite;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.ForwardingSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DiskLruCache implements Closeable, Flushable, Lockable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final long ANY_SEQUENCE_NUMBER;
    public static final String CLEAN;
    public static final Companion Companion;
    public static final String DIRTY;
    private static long IAuthTabCallback = 0;
    public static final String JOURNAL_FILE;
    public static final String JOURNAL_FILE_BACKUP;
    public static final String JOURNAL_FILE_TEMP;
    public static final Regex LEGAL_KEY_PATTERN;
    public static final String MAGIC;
    public static final String READ;
    public static final String REMOVE;
    public static final String VERSION_1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final TTFullScreenVideoActivity3 directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final TTFullScreenVideoActivity3 journalFile;
    private final TTFullScreenVideoActivity3 journalFileBackup;
    private final TTFullScreenVideoActivity3 journalFileTmp;
    private TTAppOpenAdActivity9 journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    public static /* synthetic */ Unit $r8$lambda$VuSpHTv0MA2f3ewEQIlkNS7IWTk(DiskLruCache diskLruCache, IOException iOException) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewJournalWriter$lambda$0 = newJournalWriter$lambda$0(diskLruCache, iOException);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return unitNewJournalWriter$lambda$0;
    }

    public final Editor edit(@NotNull String str) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Editor editorEdit$default = i3 != 0 ? edit$default(this, str, 0L, 2, null) : edit$default(this, str, 0L, 2, null);
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return editorEdit$default;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 83;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), Color.argb(0, 0, 0, 0) + 59, 6383 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 59, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i6 = $10 + 17;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(@NotNull final FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, int i, int i2, long j, @NotNull TaskRunner taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(taskRunner, "");
        this.directory = tTFullScreenVideoActivity3;
        this.appVersion = i;
        this.valueCount = i2;
        this.fileSystem = new ForwardingFileSystem(fileSystem) { // from class: okhttp3.internal.cache.DiskLruCache$fileSystem$1
            @Override // okio.ForwardingFileSystem, okio.FileSystem
            public TTHistoryActivity41 sink(TTFullScreenVideoActivity3 tTFullScreenVideoActivity32, boolean z) throws IOException {
                Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
                TTFullScreenVideoActivity3 tTFullScreenVideoActivity3IAuthTabCallbackStub = tTFullScreenVideoActivity32.IAuthTabCallbackStub();
                if (tTFullScreenVideoActivity3IAuthTabCallbackStub != null) {
                    createDirectories(tTFullScreenVideoActivity3IAuthTabCallbackStub);
                }
                return super.sink(tTFullScreenVideoActivity32, z);
            }
        };
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = _UtilJvmKt.okHttpName + " Cache";
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                DiskLruCache diskLruCache = this.this$0;
                synchronized (diskLruCache) {
                    if (!DiskLruCache.access$getInitialized$p(diskLruCache) || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        DiskLruCache.access$setMostRecentTrimFailed$p(diskLruCache, true);
                    }
                    try {
                        if (DiskLruCache.access$journalRebuildRequired(diskLruCache)) {
                            diskLruCache.rebuildJournal$okhttp();
                            DiskLruCache.access$setRedundantOpCount$p(diskLruCache, 0);
                        }
                    } catch (IOException unused2) {
                        DiskLruCache.access$setMostRecentRebuildFailed$p(diskLruCache, true);
                        TTAppOpenAdActivity9 tTAppOpenAdActivity9Access$getJournalWriter$p = DiskLruCache.access$getJournalWriter$p(diskLruCache);
                        if (tTAppOpenAdActivity9Access$getJournalWriter$p != null) {
                            _UtilCommonKt.closeQuietly(tTAppOpenAdActivity9Access$getJournalWriter$p);
                        }
                        DiskLruCache.access$setJournalWriter$p(diskLruCache, TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.onExtraCallback()));
                    }
                    return -1L;
                }
            }
        };
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 > 0) {
            int i3 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.journalFile = tTFullScreenVideoActivity3.onWarmupCompleted(JOURNAL_FILE);
            this.journalFileTmp = tTFullScreenVideoActivity3.onWarmupCompleted(JOURNAL_FILE_TEMP);
            this.journalFileBackup = tTFullScreenVideoActivity3.onWarmupCompleted(JOURNAL_FILE_BACKUP);
            int i5 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public static final /* synthetic */ boolean access$getCivilizedFileSystem$p(DiskLruCache diskLruCache) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean z = diskLruCache.civilizedFileSystem;
        int i5 = i2 + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return z;
    }

    public static final /* synthetic */ boolean access$getInitialized$p(DiskLruCache diskLruCache) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = diskLruCache.initialized;
        int i5 = i2 + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public static final /* synthetic */ TTAppOpenAdActivity9 access$getJournalWriter$p(DiskLruCache diskLruCache) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TTAppOpenAdActivity9 tTAppOpenAdActivity9 = diskLruCache.journalWriter;
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return tTAppOpenAdActivity9;
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(DiskLruCache diskLruCache) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zJournalRebuildRequired = diskLruCache.journalRebuildRequired();
        int i4 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zJournalRebuildRequired;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setJournalWriter$p(DiskLruCache diskLruCache, TTAppOpenAdActivity9 tTAppOpenAdActivity9) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        diskLruCache.journalWriter = tTAppOpenAdActivity9;
        int i5 = i3 + 53;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setMostRecentRebuildFailed$p(DiskLruCache diskLruCache, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        diskLruCache.mostRecentRebuildFailed = z;
        int i5 = i3 + 101;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$setMostRecentTrimFailed$p(DiskLruCache diskLruCache, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        diskLruCache.mostRecentTrimFailed = z;
        int i5 = i2 + 17;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$setRedundantOpCount$p(DiskLruCache diskLruCache, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        diskLruCache.redundantOpCount = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TTFullScreenVideoActivity3 getDirectory() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TTFullScreenVideoActivity3 tTFullScreenVideoActivity3 = this.directory;
        int i5 = i2 + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return tTFullScreenVideoActivity3;
    }

    public final int getValueCount$okhttp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.valueCount;
        int i6 = i3 + 47;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return i5;
    }

    public final FileSystem getFileSystem$okhttp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        FileSystem fileSystem = this.fileSystem;
        int i5 = i3 + 47;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return fileSystem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getMaxSize() {
        long j;
        synchronized (this) {
            j = this.maxSize;
        }
        return j;
    }

    public final void setMaxSize(long j) {
        synchronized (this) {
            this.maxSize = j;
            if (this.initialized) {
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.lruEntries;
        }
        throw null;
    }

    public final boolean getClosed$okhttp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.closed;
        int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setClosed$okhttp(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.closed = z;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit newJournalWriter$lambda$0(DiskLruCache diskLruCache, IOException iOException) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iOException, "");
            boolean z = _UtilJvmKt.assertionsEnabled;
            throw null;
        }
        Intrinsics.checkNotNullParameter(iOException, "");
        if (_UtilJvmKt.assertionsEnabled) {
            int i3 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                Thread.holdsLock(diskLruCache);
                obj.hashCode();
                throw null;
            }
            if (!Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
        }
        diskLruCache.hasJournalErrors = true;
        return Unit.INSTANCE;
    }

    private final TTAppOpenAdActivity9 newJournalWriter() throws FileNotFoundException {
        int i = 2 % 2;
        TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new Function1() { // from class: okhttp3.internal.cache.DiskLruCache$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DiskLruCache.$r8$lambda$VuSpHTv0MA2f3ewEQIlkNS7IWTk(this.f$0, (IOException) obj);
            }
        }));
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return tTAppOpenAdActivity9OnExtraCallbackWithResult;
    }

    private final void readJournalLine(String str) throws IOException {
        String strSubstring;
        int i = 2 % 2;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i4, false, 4, (Object) null);
        Object obj = null;
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String str2 = REMOVE;
            if (iIndexOf$default == str2.length() && StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i4, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iIndexOf$default2 != -1) {
            String str3 = CLEAN;
            if (iIndexOf$default == str3.length()) {
                int i5 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0 ? StringsKt__StringsJVMKt.startsWith$default(str, str3, false, 2, null) : StringsKt__StringsJVMKt.startsWith$default(str, str3, false, 4, null)) {
                    String strSubstring2 = str.substring(iIndexOf$default2 + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp(null);
                    entry.setLengths$okhttp(listSplit$default);
                    return;
                }
            }
        }
        if (iIndexOf$default2 == -1) {
            int i6 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                DIRTY.length();
                obj.hashCode();
                throw null;
            }
            String str4 = DIRTY;
            if (iIndexOf$default == str4.length() && StringsKt__StringsJVMKt.startsWith$default(str, str4, false, 2, null)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str5 = READ;
            if (iIndexOf$default == str5.length() && StringsKt__StringsJVMKt.startsWith$default(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084 A[LOOP:1: B:20:0x0082->B:21:0x0084, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void processJournal() throws IOException {
        Entry entry;
        int i;
        int i2;
        int i3 = 2 % 2;
        _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            int i4 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i4 % 128;
            int i5 = 0;
            if (i4 % 2 != 0) {
                Entry next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                entry = next;
                if (entry.getCurrentEditor$okhttp() == null) {
                    i5 = 1;
                    i = this.valueCount;
                    while (i5 < i) {
                        int i6 = onNavigationEvent + 11;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            this.size %= entry.getLengths$okhttp()[i5];
                            i5 += 109;
                        } else {
                            this.size += entry.getLengths$okhttp()[i5];
                            i5++;
                        }
                        int i7 = onNavigationEvent + 71;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                    }
                } else {
                    entry.setCurrentEditor$okhttp(null);
                    i2 = this.valueCount;
                    while (i5 < i2) {
                        int i9 = onNavigationEvent + 27;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i5));
                        _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getDirtyFiles$okhttp().get(i5));
                        i5++;
                    }
                    it.remove();
                }
            } else {
                Entry next2 = it.next();
                Intrinsics.checkNotNullExpressionValue(next2, "");
                entry = next2;
                if (entry.getCurrentEditor$okhttp() == null) {
                    i = this.valueCount;
                    while (i5 < i) {
                    }
                } else {
                    entry.setCurrentEditor$okhttp(null);
                    i2 = this.valueCount;
                    while (i5 < i2) {
                    }
                    it.remove();
                }
            }
        }
        int i11 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
    }

    public final void rebuildJournal$okhttp() throws IOException {
        Throwable th;
        synchronized (this) {
            TTAppOpenAdActivity9 tTAppOpenAdActivity9 = this.journalWriter;
            if (tTAppOpenAdActivity9 != null) {
                tTAppOpenAdActivity9.close();
            }
            TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(this.fileSystem.sink(this.journalFileTmp, false));
            try {
                tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(MAGIC).onExtraCallbackWithResult(10);
                tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(VERSION_1).onExtraCallbackWithResult(10);
                tTAppOpenAdActivity9OnExtraCallbackWithResult.IAuthTabCallbackStubProxy(this.appVersion).onExtraCallbackWithResult(10);
                tTAppOpenAdActivity9OnExtraCallbackWithResult.IAuthTabCallbackStubProxy(this.valueCount).onExtraCallbackWithResult(10);
                tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallbackWithResult(10);
                for (Entry entry : this.lruEntries.values()) {
                    Intrinsics.checkNotNullExpressionValue(entry, "");
                    Entry entry2 = entry;
                    if (entry2.getCurrentEditor$okhttp() != null) {
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(DIRTY).onExtraCallbackWithResult(32);
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(entry2.getKey$okhttp());
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallbackWithResult(10);
                    } else {
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(CLEAN).onExtraCallbackWithResult(32);
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(entry2.getKey$okhttp());
                        entry2.writeLengths$okhttp(tTAppOpenAdActivity9OnExtraCallbackWithResult);
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallbackWithResult(10);
                    }
                }
                Unit unit = Unit.INSTANCE;
                if (tTAppOpenAdActivity9OnExtraCallbackWithResult != null) {
                    try {
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (tTAppOpenAdActivity9OnExtraCallbackWithResult != null) {
                    try {
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.close();
                    } catch (Throwable th4) {
                        setExecute.onNavigationEvent(th3, th4);
                    }
                }
                th = th3;
            }
            if (th == null) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.atomicMove(this.journalFile, this.journalFileBackup);
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                    _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileBackup);
                } else {
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                }
                TTAppOpenAdActivity9 tTAppOpenAdActivity92 = this.journalWriter;
                if (tTAppOpenAdActivity92 != null) {
                    _UtilCommonKt.closeQuietly(tTAppOpenAdActivity92);
                }
                this.journalWriter = newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } else {
                throw th;
            }
        }
    }

    public final Snapshot get(@NotNull String str) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            initialize();
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                return null;
            }
            Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
            if (snapshotSnapshot$okhttp == null) {
                return null;
            }
            this.redundantOpCount++;
            TTAppOpenAdActivity9 tTAppOpenAdActivity9 = this.journalWriter;
            Intrinsics.checkNotNull(tTAppOpenAdActivity9);
            tTAppOpenAdActivity9.onExtraCallback(READ).onExtraCallbackWithResult(32).onExtraCallback(str).onExtraCallbackWithResult(10);
            if (journalRebuildRequired()) {
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
            return snapshotSnapshot$okhttp;
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 17;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
            int i5 = i4 + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        return diskLruCache.edit(str, j);
    }

    public final Editor edit(@NotNull String str, long j) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            initialize();
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (j != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j)) {
                return null;
            }
            if ((entry != null ? entry.getCurrentEditor$okhttp() : null) != null) {
                return null;
            }
            if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                TTAppOpenAdActivity9 tTAppOpenAdActivity9 = this.journalWriter;
                Intrinsics.checkNotNull(tTAppOpenAdActivity9);
                tTAppOpenAdActivity9.onExtraCallback(DIRTY).onExtraCallbackWithResult(32).onExtraCallback(str).onExtraCallbackWithResult(10);
                tTAppOpenAdActivity9.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (entry == null) {
                    entry = new Entry(this, str);
                    this.lruEntries.put(str, entry);
                }
                Editor editor = new Editor(this, entry);
                entry.setCurrentEditor$okhttp(editor);
                return editor;
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return null;
        }
    }

    public final long size() throws IOException {
        long j;
        synchronized (this) {
            initialize();
            j = this.size;
        }
        return j;
    }

    public final void completeEdit$okhttp(@NotNull Editor editor, boolean z) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(editor, "");
            Entry entry$okhttp = editor.getEntry$okhttp();
            if (!Intrinsics.areEqual(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
                throw new IllegalStateException("Check failed.");
            }
            if (z && !entry$okhttp.getReadable$okhttp()) {
                int i = this.valueCount;
                for (int i2 = 0; i2 < i; i2++) {
                    boolean[] written$okhttp = editor.getWritten$okhttp();
                    Intrinsics.checkNotNull(written$okhttp);
                    if (!written$okhttp[i2]) {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i2))) {
                        editor.abort();
                        return;
                    }
                }
            }
            int i3 = this.valueCount;
            for (int i4 = 0; i4 < i3; i4++) {
                TTFullScreenVideoActivity3 tTFullScreenVideoActivity3 = entry$okhttp.getDirtyFiles$okhttp().get(i4);
                if (z && !entry$okhttp.getZombie$okhttp()) {
                    if (this.fileSystem.exists(tTFullScreenVideoActivity3)) {
                        TTFullScreenVideoActivity3 tTFullScreenVideoActivity32 = entry$okhttp.getCleanFiles$okhttp().get(i4);
                        this.fileSystem.atomicMove(tTFullScreenVideoActivity3, tTFullScreenVideoActivity32);
                        long j = entry$okhttp.getLengths$okhttp()[i4];
                        Long lOnExtraCallback = this.fileSystem.metadata(tTFullScreenVideoActivity32).onExtraCallback();
                        long jLongValue = lOnExtraCallback != null ? lOnExtraCallback.longValue() : 0L;
                        entry$okhttp.getLengths$okhttp()[i4] = jLongValue;
                        this.size = (this.size - j) + jLongValue;
                    }
                } else {
                    _UtilCommonKt.deleteIfExists(this.fileSystem, tTFullScreenVideoActivity3);
                }
            }
            entry$okhttp.setCurrentEditor$okhttp(null);
            if (entry$okhttp.getZombie$okhttp()) {
                removeEntry$okhttp(entry$okhttp);
                return;
            }
            this.redundantOpCount++;
            TTAppOpenAdActivity9 tTAppOpenAdActivity9 = this.journalWriter;
            Intrinsics.checkNotNull(tTAppOpenAdActivity9);
            if (entry$okhttp.getReadable$okhttp() || z) {
                entry$okhttp.setReadable$okhttp(true);
                tTAppOpenAdActivity9.onExtraCallback(CLEAN).onExtraCallbackWithResult(32);
                tTAppOpenAdActivity9.onExtraCallback(entry$okhttp.getKey$okhttp());
                entry$okhttp.writeLengths$okhttp(tTAppOpenAdActivity9);
                tTAppOpenAdActivity9.onExtraCallbackWithResult(10);
                if (z) {
                    long j2 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j2;
                    entry$okhttp.setSequenceNumber$okhttp(j2);
                }
            } else {
                this.lruEntries.remove(entry$okhttp.getKey$okhttp());
                tTAppOpenAdActivity9.onExtraCallback(REMOVE).onExtraCallbackWithResult(32);
                tTAppOpenAdActivity9.onExtraCallback(entry$okhttp.getKey$okhttp());
                tTAppOpenAdActivity9.onExtraCallbackWithResult(10);
            }
            tTAppOpenAdActivity9.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
    }

    private final boolean journalRebuildRequired() {
        int i = 2 % 2;
        int i2 = this.redundantOpCount;
        if (i2 >= 2000 && i2 >= this.lruEntries.size()) {
            int i3 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i3 % 128;
            return i3 % 2 != 0;
        }
        int i4 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return false;
    }

    public final boolean remove(@NotNull String str) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            initialize();
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                return false;
            }
            boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
            if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
                this.mostRecentTrimFailed = false;
            }
            return zRemoveEntry$okhttp;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[PHI: r1
      0x0038: PHI (r1v17 o.TTAppOpenAdActivity9) = (r1v16 o.TTAppOpenAdActivity9), (r1v18 o.TTAppOpenAdActivity9) binds: [B:12:0x0036, B:9:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeEntry$okhttp(@NotNull Entry entry) throws IOException {
        TTAppOpenAdActivity9 tTAppOpenAdActivity9;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        int i4 = 0;
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0) {
                int i5 = onNavigationEvent + 67;
                int i6 = i5 % 128;
                onExtraCallbackWithResult = i6;
                if (i5 % 2 == 0) {
                    tTAppOpenAdActivity9 = this.journalWriter;
                    int i7 = 73 / 0;
                    if (tTAppOpenAdActivity9 != null) {
                        int i8 = i6 + 43;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 != 0) {
                            tTAppOpenAdActivity9.onExtraCallback(DIRTY);
                            tTAppOpenAdActivity9.onExtraCallbackWithResult(76);
                            tTAppOpenAdActivity9.onExtraCallback(entry.getKey$okhttp());
                            tTAppOpenAdActivity9.onExtraCallbackWithResult(78);
                        } else {
                            tTAppOpenAdActivity9.onExtraCallback(DIRTY);
                            tTAppOpenAdActivity9.onExtraCallbackWithResult(32);
                            tTAppOpenAdActivity9.onExtraCallback(entry.getKey$okhttp());
                            tTAppOpenAdActivity9.onExtraCallbackWithResult(10);
                        }
                        tTAppOpenAdActivity9.flush();
                    }
                } else {
                    tTAppOpenAdActivity9 = this.journalWriter;
                    if (tTAppOpenAdActivity9 != null) {
                    }
                }
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i9 = this.valueCount;
        while (i4 < i9) {
            int i10 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i4));
                this.size += entry.getLengths$okhttp()[i4];
                entry.getLengths$okhttp()[i4] = 1;
                i4 += 127;
            } else {
                _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i4));
                this.size -= entry.getLengths$okhttp()[i4];
                entry.getLengths$okhttp()[i4] = 0;
                i4++;
            }
        }
        this.redundantOpCount++;
        TTAppOpenAdActivity9 tTAppOpenAdActivity92 = this.journalWriter;
        if (tTAppOpenAdActivity92 != null) {
            tTAppOpenAdActivity92.onExtraCallback(REMOVE);
            tTAppOpenAdActivity92.onExtraCallbackWithResult(32);
            tTAppOpenAdActivity92.onExtraCallback(entry.getKey$okhttp());
            tTAppOpenAdActivity92.onExtraCallbackWithResult(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    private final void checkNotClosed() {
        synchronized (this) {
            if (this.closed) {
                throw new IllegalStateException("cache is closed");
            }
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        synchronized (this) {
            if (this.initialized) {
                checkNotClosed();
                trimToSize();
                TTAppOpenAdActivity9 tTAppOpenAdActivity9 = this.journalWriter;
                Intrinsics.checkNotNull(tTAppOpenAdActivity9);
                tTAppOpenAdActivity9.flush();
            }
        }
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.closed;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Editor currentEditor$okhttp;
        synchronized (this) {
            if (this.initialized && !this.closed) {
                Collection<Entry> collectionValues = this.lruEntries.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    Intrinsics.checkNotNull(entry);
                    if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                TTAppOpenAdActivity9 tTAppOpenAdActivity9 = this.journalWriter;
                if (tTAppOpenAdActivity9 != null) {
                    _UtilCommonKt.closeQuietly(tTAppOpenAdActivity9);
                }
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        }
    }

    public final void trimToSize() throws IOException {
        int i = 2 % 2;
        while (this.size > this.maxSize) {
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!removeOldestEntry()) {
                int i4 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final boolean removeOldestEntry() throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        for (Entry entry : this.lruEntries.values()) {
            Intrinsics.checkNotNullExpressionValue(entry, "");
            Entry entry2 = entry;
            if (!entry2.getZombie$okhttp()) {
                int i6 = onNavigationEvent + 17;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                removeEntry$okhttp(entry2);
                return true;
            }
        }
        return false;
    }

    public final void delete() throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        close();
        _UtilCommonKt.deleteContents(this.fileSystem, this.directory);
        int i4 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void evictAll() throws IOException {
        synchronized (this) {
            initialize();
            Collection<Entry> collectionValues = this.lruEntries.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                Intrinsics.checkNotNull(entry);
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        }
    }

    private final void validateKey(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (LEGAL_KEY_PATTERN.onExtraCallbackWithResult(str)) {
            int i4 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    /* renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<Snapshot>, KMutableIterator {
        private final Iterator<Entry> delegate;
        private Snapshot nextSnapshot;
        private Snapshot removeSnapshot;

        AnonymousClass1() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            this.delegate = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Snapshot snapshotSnapshot$okhttp;
            if (this.nextSnapshot != null) {
                return true;
            }
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (diskLruCache.getClosed$okhttp()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    Entry next = this.delegate.next();
                    if (next != null && (snapshotSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.nextSnapshot = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                Unit unit = Unit.INSTANCE;
                return false;
            }
        }

        @Override // java.util.Iterator
        public Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            Intrinsics.checkNotNull(snapshot);
            return snapshot;
        }

        @Override // java.util.Iterator
        public void remove() {
            Snapshot snapshot = this.removeSnapshot;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                DiskLruCache.this.remove(snapshot.key());
            } catch (IOException unused) {
            } finally {
                this.removeSnapshot = null;
            }
        }
    }

    public final Iterator<Snapshot> snapshots() throws IOException {
        AnonymousClass1 anonymousClass1;
        synchronized (this) {
            initialize();
            anonymousClass1 = new AnonymousClass1();
        }
        return anonymousClass1;
    }

    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<TTHistoryActivity42> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(@NotNull DiskLruCache diskLruCache, String str, @NotNull long j, @NotNull List<? extends TTHistoryActivity42> list, long[] jArr) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(jArr, "");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        public final String key() {
            return this.key;
        }

        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final TTHistoryActivity42 getSource(int i) {
            return this.sources.get(i);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Iterator<TTHistoryActivity42> it = this.sources.iterator();
            while (it.hasNext()) {
                _UtilCommonKt.closeQuietly(it.next());
            }
        }
    }

    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(@NotNull DiskLruCache diskLruCache, Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "");
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final void detach$okhttp() throws IOException {
            if (Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this)) {
                if (DiskLruCache.access$getCivilizedFileSystem$p(this.this$0)) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final TTHistoryActivity42 newSource(int i) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                TTHistoryActivity42 tTHistoryActivity42Source = null;
                if (!this.entry.getReadable$okhttp() || !Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this) || this.entry.getZombie$okhttp()) {
                    return null;
                }
                try {
                    tTHistoryActivity42Source = diskLruCache.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(i));
                } catch (FileNotFoundException unused) {
                }
                return tTHistoryActivity42Source;
            }
        }

        public final TTHistoryActivity41 newSink(int i) {
            final DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this)) {
                    return TTCeilingLandingPageActivity5.onExtraCallback();
                }
                if (!this.entry.getReadable$okhttp()) {
                    boolean[] zArr = this.written;
                    Intrinsics.checkNotNull(zArr);
                    zArr[i] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(i)), new Function1() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DiskLruCache.Editor.newSink$lambda$0$0(diskLruCache, this, (IOException) obj);
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return TTCeilingLandingPageActivity5.onExtraCallback();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit newSink$lambda$0$0(DiskLruCache diskLruCache, Editor editor, IOException iOException) {
            Unit unit;
            Intrinsics.checkNotNullParameter(iOException, "");
            synchronized (diskLruCache) {
                editor.detach$okhttp();
                unit = Unit.INSTANCE;
            }
            return unit;
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this)) {
                    diskLruCache.completeEdit$okhttp(this, true);
                }
                this.done = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this)) {
                    diskLruCache.completeEdit$okhttp(this, false);
                }
                this.done = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final class Entry {
        private final List<TTFullScreenVideoActivity3> cleanFiles;
        private Editor currentEditor;
        private final List<TTFullScreenVideoActivity3> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(@NotNull DiskLruCache diskLruCache, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                List<TTFullScreenVideoActivity3> list = this.cleanFiles;
                TTFullScreenVideoActivity3 directory = this.this$0.getDirectory();
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                list.add(directory.onWarmupCompleted(string));
                sb.append(".tmp");
                List<TTFullScreenVideoActivity3> list2 = this.dirtyFiles;
                TTFullScreenVideoActivity3 directory2 = this.this$0.getDirectory();
                String string2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                list2.add(directory2.onWarmupCompleted(string2));
                sb.setLength(length);
            }
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final List<TTFullScreenVideoActivity3> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final List<TTFullScreenVideoActivity3> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final void setCurrentEditor$okhttp(@Nullable Editor editor) {
            this.currentEditor = editor;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setLengths$okhttp(@NotNull List<String> list) throws IOException {
            Intrinsics.checkNotNullParameter(list, "");
            if (list.size() != this.this$0.getValueCount$okhttp()) {
                invalidLengths(list);
                throw new setWrite();
            }
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = Long.parseLong(list.get(i));
                }
            } catch (NumberFormatException unused) {
                invalidLengths(list);
                throw new setWrite();
            }
        }

        public final void writeLengths$okhttp(@NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException {
            Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
            for (long j : this.lengths) {
                tTAppOpenAdActivity9.onExtraCallbackWithResult(32).IAuthTabCallbackStubProxy(j);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        public final Snapshot snapshot$okhttp() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
                if (!this.readable) {
                    return null;
                }
                if (!DiskLruCache.access$getCivilizedFileSystem$p(this.this$0) && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                    for (int i = 0; i < valueCount$okhttp; i++) {
                        arrayList.add(newSource(i));
                    }
                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        _UtilCommonKt.closeQuietly((TTHistoryActivity42) it.next());
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
        }

        private final TTHistoryActivity42 newSource(int i) throws IOException {
            final TTHistoryActivity42 tTHistoryActivity42Source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (DiskLruCache.access$getCivilizedFileSystem$p(this.this$0)) {
                return tTHistoryActivity42Source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new ForwardingSource(tTHistoryActivity42Source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // okio.ForwardingSource, o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
                public void close() throws IOException {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    DiskLruCache diskLruCache2 = diskLruCache;
                    DiskLruCache.Entry entry = this;
                    synchronized (diskLruCache2) {
                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                        if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                            diskLruCache2.removeEntry$okhttp(entry);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            };
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        onWarmupCompleted();
        Companion = new Companion(null);
        JOURNAL_FILE = "journal";
        JOURNAL_FILE_TEMP = "journal.tmp";
        JOURNAL_FILE_BACKUP = "journal.bkp";
        MAGIC = "libcore.io.DiskLruCache";
        Object[] objArr = new Object[1];
        a(new char[]{'*'}, ((Process.getThreadPriority(0) + 20) >> 6) + 25667, objArr);
        VERSION_1 = ((String) objArr[0]).intern();
        ANY_SEQUENCE_NUMBER = -1L;
        LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
        CLEAN = "CLEAN";
        DIRTY = "DIRTY";
        REMOVE = "REMOVE";
        READ = "READ";
        int i = onWarmupCompleted + 63;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public final void initialize() throws IOException {
        synchronized (this) {
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.atomicMove(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = _UtilCommonKt.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    try {
                        delete();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void readJournal() throws Throwable {
        int i = 2 % 2;
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(this.fileSystem.source(this.journalFile));
        try {
            String strOnUnminimized = tTAppOpenAdTransActivityOnExtraCallback.onUnminimized();
            String strOnUnminimized2 = tTAppOpenAdTransActivityOnExtraCallback.onUnminimized();
            String strOnUnminimized3 = tTAppOpenAdTransActivityOnExtraCallback.onUnminimized();
            String strOnUnminimized4 = tTAppOpenAdTransActivityOnExtraCallback.onUnminimized();
            String strOnUnminimized5 = tTAppOpenAdTransActivityOnExtraCallback.onUnminimized();
            if (Intrinsics.areEqual(MAGIC, strOnUnminimized)) {
                int i2 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (!(!Intrinsics.areEqual(VERSION_1, strOnUnminimized2)) && Intrinsics.areEqual(String.valueOf(this.appVersion), strOnUnminimized3) && Intrinsics.areEqual(String.valueOf(this.valueCount), strOnUnminimized4) && strOnUnminimized5.length() <= 0) {
                    int i4 = 0;
                    while (true) {
                        try {
                            readJournalLine(tTAppOpenAdTransActivityOnExtraCallback.onUnminimized());
                            i4++;
                        } catch (EOFException unused) {
                            this.redundantOpCount = i4 - this.lruEntries.size();
                            if (tTAppOpenAdTransActivityOnExtraCallback.IAuthTabCallback_Parcel()) {
                                TTAppOpenAdActivity9 tTAppOpenAdActivity9 = this.journalWriter;
                                if (tTAppOpenAdActivity9 != null) {
                                    _UtilCommonKt.closeQuietly(tTAppOpenAdActivity9);
                                }
                                this.journalWriter = newJournalWriter();
                            } else {
                                rebuildJournal$okhttp();
                            }
                            Unit unit = Unit.INSTANCE;
                            if (tTAppOpenAdTransActivityOnExtraCallback != null) {
                                int i5 = onExtraCallbackWithResult + 51;
                                onNavigationEvent = i5 % 128;
                                int i6 = i5 % 2;
                                try {
                                    tTAppOpenAdTransActivityOnExtraCallback.close();
                                    th = null;
                                } catch (Throwable th) {
                                    th = th;
                                    if (th != null) {
                                        throw th;
                                    }
                                    return;
                                }
                            } else {
                                th = null;
                            }
                            if (th != null) {
                            }
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strOnUnminimized + ", " + strOnUnminimized2 + ", " + strOnUnminimized4 + ", " + strOnUnminimized5 + ']');
        } catch (Throwable th2) {
            th = th2;
            if (tTAppOpenAdTransActivityOnExtraCallback != null) {
                try {
                    tTAppOpenAdTransActivityOnExtraCallback.close();
                    int i7 = onExtraCallbackWithResult + 49;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th3) {
                    setExecute.onNavigationEvent(th, th3);
                }
            }
            if (th != null) {
            }
        }
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -8899882714252016340L;
    }
}
