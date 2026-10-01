package im.toss.core.tracker;

import android.content.Context;
import android.os.Process;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import o.AppSetIdAndScope1;
import o.ea10;
import o.getCodeNameBytes;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RemoteProcessLogIngressStore {
    public static final Companion Companion;
    private static final long IAuthTabCallback = TimeUnit.MINUTES.toMillis(5);
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onTransact;
    private final long onExtraCallback;
    private final AppSetIdAndScope1 onExtraCallbackWithResult;
    private final File onNavigationEvent;
    private final int onWarmupCompleted;

    public RemoteProcessLogIngressStore(@NotNull File file, int i, long j) {
        Intrinsics.checkNotNullParameter(file, "");
        this.onNavigationEvent = file;
        this.onWarmupCompleted = i;
        this.onExtraCallback = j;
        this.onExtraCallbackWithResult = ea10.onExtraCallbackWithResult("RemoteProcessLogIngress");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RemoteProcessLogIngressStore(File file, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asInterface + 99;
            IAuthTabCallbackStub = i3 % 128;
            i = i3 % 2 != 0 ? 126 : 100;
            int i4 = 2 % 2;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallbackStub + 91;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            j = 1048576;
        }
        this(file, i, j);
    }

    public final boolean onExtraCallback(@NotNull RemoteProcessLogEnvelope remoteProcessLogEnvelope) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(remoteProcessLogEnvelope, "");
        if (!onExtraCallbackWithResult()) {
            int i2 = IAuthTabCallbackStub + 41;
            asInterface = i2 % 128;
            return i2 % 2 == 0;
        }
        File file = new File(this.onNavigationEvent, Companion.onWarmupCompleted(Companion, remoteProcessLogEnvelope));
        File file2 = new File(this.onNavigationEvent, file.getName() + ".tmp-" + Process.myPid() + "-" + Thread.currentThread().getId());
        try {
            Result.Companion companion = Result.Companion;
            byte[] bytes = RemoteProcessLogJson.onNavigationEvent.onExtraCallback().onWarmupCompleted(RemoteProcessLogEnvelope.Companion.serializer(), remoteProcessLogEnvelope).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.getFD().sync();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!file2.renameTo(file)) {
            throw new IllegalStateException("Failed to publish remote process log envelope: " + file.getName());
        }
        int i3 = asInterface + 47;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        obj = Result.constructor-impl(Boolean.TRUE);
        if (Result.exceptionOrNull-impl(obj) != null) {
            file2.delete();
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i5 = IAuthTabCallbackStub + 27;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    public final List<ClaimedEnvelope> onNavigationEvent() {
        Object obj;
        int i = 2 % 2;
        if (!onExtraCallbackWithResult()) {
            return CollectionsKt.emptyList();
        }
        onExtraCallback();
        File[] fileArrListFiles = this.onNavigationEvent.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    if (StringsKt.endsWith$default(name, ".json", false, 2, (Object) null)) {
                        int i2 = asInterface + 121;
                        IAuthTabCallbackStub = i2 % 128;
                        if (i2 % 2 != 0) {
                            arrayList.add(file);
                            int i3 = 85 / 0;
                        } else {
                            arrayList.add(file);
                        }
                    }
                }
            }
            List<File> listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: im.toss.core.tracker.RemoteProcessLogIngressStore$claimBatch$$inlined$sortedBy$1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 87;
                    onExtraCallbackWithResult = i5 % 128;
                    File file2 = (File) t;
                    if (i5 % 2 == 0) {
                        getCodeNameBytes.IAuthTabCallback(file2.getName(), ((File) t2).getName());
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(file2.getName(), ((File) t2).getName());
                    int i6 = onExtraCallbackWithResult + 123;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return iIAuthTabCallback;
                }
            });
            if (listSortedWith != null) {
                ArrayList arrayList2 = new ArrayList();
                long length = 0;
                for (File file2 : listSortedWith) {
                    int i4 = IAuthTabCallbackStub + 71;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    if (arrayList2.size() >= this.onWarmupCompleted || (!arrayList2.isEmpty() && file2.length() + length > this.onExtraCallback)) {
                        break;
                    }
                    File file3 = new File(this.onNavigationEvent, file2.getName() + ".processing");
                    if (file2.renameTo(file3)) {
                        int i6 = IAuthTabCallbackStub + 59;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        try {
                            Result.Companion companion = Result.Companion;
                            obj = Result.constructor-impl((RemoteProcessLogEnvelope) RemoteProcessLogJson.onNavigationEvent.onExtraCallback().onExtraCallback(RemoteProcessLogEnvelope.Companion.serializer(), FilesKt.readText$default(file3, (Charset) null, 1, (Object) null)));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        if (Result.exceptionOrNull-impl(obj) != null) {
                            file3.getName();
                            IAuthTabCallback(file3);
                            obj = null;
                        }
                        RemoteProcessLogEnvelope remoteProcessLogEnvelope = (RemoteProcessLogEnvelope) obj;
                        if (remoteProcessLogEnvelope != null) {
                            Intrinsics.checkNotNull(file2);
                            arrayList2.add(new ClaimedEnvelope(file2, file3, remoteProcessLogEnvelope));
                            length += file3.length();
                        }
                    }
                }
                return arrayList2;
            }
        }
        return CollectionsKt.emptyList();
    }

    private final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (this.onNavigationEvent.isDirectory()) {
            return true;
        }
        if (this.onNavigationEvent.exists()) {
            int i2 = asInterface + 39;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                this.onNavigationEvent.delete();
                int i3 = 22 / 0;
            } else {
                this.onNavigationEvent.delete();
            }
        }
        if (!this.onNavigationEvent.mkdirs()) {
            int i4 = asInterface + 25;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (!this.onNavigationEvent.isDirectory()) {
                int i6 = asInterface + 107;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        return true;
    }

    private final void IAuthTabCallback(File file) {
        int i = 2 % 2;
        if (!file.renameTo(new File(this.onNavigationEvent, file.getName() + ".bad"))) {
            int i2 = asInterface + 69;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            file.delete();
        }
        int i4 = asInterface + 109;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        File[] fileArrListFiles = this.onNavigationEvent.listFiles();
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            int i4 = asInterface + 89;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 2;
            }
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    int i6 = asInterface + 7;
                    IAuthTabCallbackStub = i6 % 128;
                    Object obj = null;
                    if (i6 % 2 != 0) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        if (StringsKt.endsWith$default(name, ".processing", false, 2, (Object) null)) {
                            int i7 = IAuthTabCallbackStub + 39;
                            asInterface = i7 % 128;
                            if (i7 % 2 == 0) {
                                if ((file.lastModified() & jCurrentTimeMillis) >= IAuthTabCallback) {
                                    int i8 = IAuthTabCallbackStub + 65;
                                    asInterface = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        arrayList.add(file);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    arrayList.add(file);
                                } else {
                                    continue;
                                }
                            } else if (jCurrentTimeMillis - file.lastModified() < IAuthTabCallback) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        String name2 = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "");
                        if (!StringsKt.endsWith$default(name2, ".processing", false, 2, (Object) null)) {
                            continue;
                        }
                    }
                }
            }
            for (File file2 : arrayList) {
                File file3 = this.onNavigationEvent;
                String name3 = file2.getName();
                Intrinsics.checkNotNullExpressionValue(name3, "");
                if (!file2.renameTo(onExtraCallback(new File(file3, StringsKt.removeSuffix(name3, ".processing"))))) {
                    file2.getName();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r7 = r7.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r7 = kotlin.text.StringsKt.removeSuffix(r7, ".json");
        r7 = new java.io.File(r6.onNavigationEvent, r7 + "-recovered-" + java.lang.System.currentTimeMillis() + ".json");
        r1 = im.toss.core.tracker.RemoteProcessLogIngressStore.asInterface + 81;
        im.toss.core.tracker.RemoteProcessLogIngressStore.IAuthTabCallbackStub = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r7.exists() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if ((!r7.exists()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = im.toss.core.tracker.RemoteProcessLogIngressStore.IAuthTabCallbackStub + 123;
        im.toss.core.tracker.RemoteProcessLogIngressStore.asInterface = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final File onExtraCallback(File file) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ String onWarmupCompleted(Companion companion, RemoteProcessLogEnvelope remoteProcessLogEnvelope) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = companion.onWarmupCompleted(remoteProcessLogEnvelope);
            int i4 = IAuthTabCallback + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return strOnWarmupCompleted;
        }

        public final RemoteProcessLogIngressStore onWarmupCompleted(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            RemoteProcessLogIngressStore remoteProcessLogIngressStore = new RemoteProcessLogIngressStore(IAuthTabCallback(context), 0, 0L, 6, null);
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 94 / 0;
            }
            return remoteProcessLogIngressStore;
        }

        public final File IAuthTabCallback(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            File file = new File(context.getFilesDir(), "rn_remote_log_ingress");
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return file;
        }

        private final String onWarmupCompleted(RemoteProcessLogEnvelope remoteProcessLogEnvelope) {
            int i = 2 % 2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String string = (String) RemoteProcessLogEnvelope.onExtraCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{remoteProcessLogEnvelope}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1133045555, 1133045556, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
            if (StringsKt.isBlank(string)) {
                int i2 = onNavigationEvent + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i4 = IAuthTabCallback + 109;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 4;
                }
            }
            String str = jCurrentTimeMillis + "-" + Process.myPid() + "-" + string + ".json";
            int i6 = IAuthTabCallback + 73;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onTransact + 53;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
