package o;

import com.applovin.shadow.okio.NioFileSystemWrappingFileSystem$;
import com.applovin.shadow.okio.NioSystemFileSystem$;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.path.CopyActionContext;
import kotlin.io.path.FileVisitorBuilder;
import kotlin.io.path.IllegalFileNameException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import net.sf.scuba.smartcards.BuildConfig;
import o.addUnreadableElfFiles;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class addUnreadableElfFiles extends addAllUnreadableElfFiles {

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[access16800.values().length];
            try {
                iArr[access16800.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[access16800.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[access16800.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[addAllRegisters.values().length];
            try {
                iArr2[addAllRegisters.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[addAllRegisters.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallback = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final addAllRegisters sm_(Path path, Path path2, Exception exc) throws Exception {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(path2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(exc, BuildConfig.FLAVOR);
        throw exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final access16800 sn_(boolean z, CopyActionContext copyActionContext, Path path, Path path2) throws IOException {
        Intrinsics.checkNotNullParameter(copyActionContext, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(path2, BuildConfig.FLAVOR);
        LinkOption[] linkOptionArrRT_ = access17000.onExtraCallback.rT_(z);
        boolean zIsDirectory = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{NioSystemFileSystem$.ExternalSyntheticApiModelOutline1.m()}, 1));
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrRT_, linkOptionArrRT_.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !zIsDirectory) {
            if (zIsDirectory) {
                st_(path2);
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(linkOptionArrRT_);
            spreadBuilder.add(NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline3.m());
            CopyOption[] copyOptionArr = (CopyOption[]) spreadBuilder.toArray(new CopyOption[spreadBuilder.size()]);
            Intrinsics.checkNotNullExpressionValue(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), BuildConfig.FLAVOR);
        }
        return access16800.CONTINUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final addAllRegisters so_(Path path, Path path2, Exception exc) throws Exception {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(path2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(exc, BuildConfig.FLAVOR);
        throw exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final access16800 sp_(boolean z, CopyActionContext copyActionContext, Path path, Path path2) {
        Intrinsics.checkNotNullParameter(copyActionContext, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(path2, BuildConfig.FLAVOR);
        return copyActionContext.rM_(path, path2, z);
    }

    private static final Path sk_(Path path, Path path2, Path path3, Path path4) throws IllegalFileNameException {
        Path pathResolve = path2.resolve(clearCurrentBacktrace.sN_(path4, path).toString());
        if (!pathResolve.normalize().startsWith(path3)) {
            throw new IllegalFileNameException(path4, pathResolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        Intrinsics.checkNotNull(pathResolve);
        return pathResolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult sl_(getBacktraceNote<? super Path, ? super Path, ? super Exception, ? extends addAllRegisters> getbacktracenote, Path path, Path path2, Path path3, Path path4, Exception exc) {
        return sB_((addAllRegisters) getbacktracenote.invoke(path4, sk_(path, path2, path3, path4), exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult sj_(ArrayList<Path> arrayList, getBacktraceNote<? super CopyActionContext, ? super Path, ? super Path, ? extends access16800> getbacktracenote, Path path, Path path2, Path path3, getBacktraceNote<? super Path, ? super Path, ? super Exception, ? extends addAllRegisters> getbacktracenote2, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                sh_(path4);
                Object objLast = CollectionsKt.last(arrayList);
                Intrinsics.checkNotNullExpressionValue(objLast, BuildConfig.FLAVOR);
                si_(path4, NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline7.m(objLast));
            }
            return sA_((access16800) getbacktracenote.invoke(access16900.onExtraCallbackWithResult, path4, sk_(path, path2, path3, path4)));
        } catch (Exception e) {
            return sl_(getbacktracenote2, path, path2, path3, path4, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ss_(final ArrayList arrayList, final getBacktraceNote getbacktracenote, final Path path, final Path path2, final Path path3, final getBacktraceNote getbacktracenote2, FileVisitorBuilder fileVisitorBuilder) {
        Intrinsics.checkNotNullParameter(fileVisitorBuilder, BuildConfig.FLAVOR);
        new Function2() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda14
            public final Object invoke(Object obj, Object obj2) {
                return addUnreadableElfFiles.sq_(arrayList, getbacktracenote, path, path2, path3, getbacktracenote2, (Path) obj, (BasicFileAttributes) obj2);
            }
        };
        new onExtraCallbackWithResult(arrayList, getbacktracenote, path, path2, path3, getbacktracenote2);
        new IAuthTabCallback(getbacktracenote2, path, path2, path3);
        new Function2() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda15
            public final Object invoke(Object obj, Object obj2) {
                return addUnreadableElfFiles.sr_(arrayList, getbacktracenote2, path, path2, path3, (Path) obj, (IOException) obj2);
            }
        };
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult sq_(ArrayList arrayList, getBacktraceNote getbacktracenote, Path path, Path path2, Path path3, getBacktraceNote getbacktracenote2, Path path4, BasicFileAttributes basicFileAttributes) {
        Intrinsics.checkNotNullParameter(path4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(basicFileAttributes, BuildConfig.FLAVOR);
        FileVisitResult fileVisitResultSj_ = sj_(arrayList, getbacktracenote, path, path2, path3, getbacktracenote2, path4, basicFileAttributes);
        if (fileVisitResultSj_ == FileVisitResult.CONTINUE) {
            arrayList.add(path4);
        }
        return fileVisitResultSj_;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
        final /* synthetic */ getBacktraceNote<CopyActionContext, Path, Path, access16800> $copyAction;
        final /* synthetic */ Path $normalizedTarget;
        final /* synthetic */ getBacktraceNote<Path, Path, Exception, addAllRegisters> $onError;
        final /* synthetic */ ArrayList<Path> $stack;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(ArrayList<Path> arrayList, getBacktraceNote<? super CopyActionContext, ? super Path, ? super Path, ? extends access16800> getbacktracenote, Path path, Path path2, Path path3, getBacktraceNote<? super Path, ? super Path, ? super Exception, ? extends addAllRegisters> getbacktracenote2) {
            super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
            this.$stack = arrayList;
            this.$copyAction = getbacktracenote;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$normalizedTarget = path3;
            this.$onError = getbacktracenote2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return sH_(NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline7.m(obj), clearMemoryDump.sI_(obj2));
        }

        public final FileVisitResult sH_(Path path, BasicFileAttributes basicFileAttributes) {
            Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(basicFileAttributes, BuildConfig.FLAVOR);
            return addUnreadableElfFiles.sj_(this.$stack, this.$copyAction, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, this.$onError, path, basicFileAttributes);
        }
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function2<Path, Exception, FileVisitResult> {
        final /* synthetic */ Path $normalizedTarget;
        final /* synthetic */ getBacktraceNote<Path, Path, Exception, addAllRegisters> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(getBacktraceNote<? super Path, ? super Path, ? super Exception, ? extends addAllRegisters> getbacktracenote, Path path, Path path2, Path path3) {
            super(2, Intrinsics.Kotlin.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
            this.$onError = getbacktracenote;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$normalizedTarget = path3;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return sJ_(NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline7.m(obj), (Exception) obj2);
        }

        public final FileVisitResult sJ_(Path path, Exception exc) {
            Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(exc, BuildConfig.FLAVOR);
            return addUnreadableElfFiles.sl_(this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, path, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult sr_(ArrayList arrayList, getBacktraceNote getbacktracenote, Path path, Path path2, Path path3, Path path4, IOException iOException) {
        Intrinsics.checkNotNullParameter(path4, BuildConfig.FLAVOR);
        CollectionsKt.removeLast(arrayList);
        if (iOException == null) {
            return FileVisitResult.CONTINUE;
        }
        return sl_(getbacktracenote, path, path2, path3, path4, iOException);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final FileVisitResult sA_(access16800 access16800Var) throws NoWhenBranchMatchedException {
        int i = onNavigationEvent.onWarmupCompleted[access16800Var.ordinal()];
        if (i == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return FileVisitResult.SKIP_SUBTREE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final FileVisitResult sB_(addAllRegisters addallregisters) throws NoWhenBranchMatchedException {
        int i = onNavigationEvent.onExtraCallback[addallregisters.ordinal()];
        if (i == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return FileVisitResult.SKIP_SUBTREE;
    }

    public static final void st_(@NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        List<Exception> listSu_ = su_(path);
        if (listSu_.isEmpty()) {
            return;
        }
        FileSystemException fileSystemExceptionRS_ = addAllBacktraceNote.rS_("Failed to delete one or more files. See suppressed exceptions for details.");
        Iterator<T> it = listSu_.iterator();
        while (it.hasNext()) {
            setRead.onWarmupCompleted(fileSystemExceptionRS_, (Exception) it.next());
        }
        throw fileSystemExceptionRS_;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<Exception> su_(Path path) throws IOException {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        boolean z = false;
        access17200 access17200Var = new access17200(0, 1, null);
        Path fileName = path.getFileName();
        if (fileName != null) {
            Path parent = path.getParent();
            if (parent == null) {
                parent = path.getFileSystem().getPath(BuildConfig.FLAVOR, new String[0]);
            }
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    if (addMemoryDump.onWarmupCompleted(directoryStreamNewDirectoryStream)) {
                        access17200Var.rQ_(parent);
                        sw_(addBacktraceNoteBytes.sC_(directoryStreamNewDirectoryStream), fileName, null, access17200Var);
                    } else {
                        z = true;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(directoryStreamNewDirectoryStream, (Throwable) null);
                    if (z) {
                    }
                } finally {
                }
            }
        } else {
            sy_(path, null, access17200Var);
        }
        return access17200Var.onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[Catch: Exception -> 0x003b, NoSuchFileException -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:4:0x0005, B:5:0x0012, B:7:0x0022, B:9:0x002f, B:10:0x0035), top: B:17:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:4:0x0005, B:5:0x0012, B:7:0x0022, B:9:0x002f, B:10:0x0035), top: B:17:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void sw_(SecureDirectoryStream<Path> secureDirectoryStream, Path path, Path path2, access17200 access17200Var) throws IOException {
        access17200Var.rN_(path);
        if (path2 != null) {
            try {
                Path pathRP_ = access17200Var.rP_();
                Intrinsics.checkNotNull(pathRP_);
                sh_(pathRP_);
                si_(pathRP_, path2);
                try {
                    if (!sz_(secureDirectoryStream, path, NioSystemFileSystem$.ExternalSyntheticApiModelOutline1.m())) {
                        int iOnExtraCallbackWithResult = access17200Var.onExtraCallbackWithResult();
                        sv_(secureDirectoryStream, path, access17200Var);
                        if (iOnExtraCallbackWithResult == access17200Var.onExtraCallbackWithResult()) {
                            secureDirectoryStream.deleteDirectory(path);
                            Unit unit = Unit.INSTANCE;
                        }
                    } else {
                        secureDirectoryStream.deleteFile(path);
                        Unit unit2 = Unit.INSTANCE;
                    }
                } catch (NoSuchFileException unused) {
                }
            } catch (Exception e) {
                access17200Var.onNavigationEvent(e);
            }
        } else if (!sz_(secureDirectoryStream, path, NioSystemFileSystem$.ExternalSyntheticApiModelOutline1.m())) {
        }
        access17200Var.rO_(path);
    }

    private static final void sv_(SecureDirectoryStream<Path> secureDirectoryStream, Path path, access17200 access17200Var) throws IOException {
        SecureDirectoryStream<Path> secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, NioSystemFileSystem$.ExternalSyntheticApiModelOutline1.m());
            } catch (NoSuchFileException unused) {
                secureDirectoryStreamNewDirectoryStream = null;
            }
            if (secureDirectoryStreamNewDirectoryStream == null) {
                return;
            }
            try {
                Iterator<Path> it = secureDirectoryStreamNewDirectoryStream.iterator();
                Intrinsics.checkNotNullExpressionValue(it, BuildConfig.FLAVOR);
                while (it.hasNext()) {
                    Path fileName = NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline7.m(it.next()).getFileName();
                    Intrinsics.checkNotNullExpressionValue(fileName, BuildConfig.FLAVOR);
                    sw_(secureDirectoryStreamNewDirectoryStream, fileName, access17200Var.rP_(), access17200Var);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(secureDirectoryStreamNewDirectoryStream, (Throwable) null);
            } finally {
            }
        } catch (Exception e) {
            access17200Var.onNavigationEvent(e);
        }
    }

    private static final boolean sz_(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf(clearBacktraceNote.sG_(secureDirectoryStream.getFileAttributeView(path, addUnreadableElfFilesBytes.onExtraCallbackWithResult(), (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private static final void sy_(Path path, Path path2, access17200 access17200Var) throws IOException {
        if (path2 != null) {
            try {
                sh_(path);
                si_(path, path2);
            } catch (Exception e) {
                access17200Var.onNavigationEvent(e);
                return;
            }
        }
        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{NioSystemFileSystem$.ExternalSyntheticApiModelOutline1.m()}, 1))) {
            int iOnExtraCallbackWithResult = access17200Var.onExtraCallbackWithResult();
            sx_(path, access17200Var);
            if (iOnExtraCallbackWithResult == access17200Var.onExtraCallbackWithResult()) {
                Files.deleteIfExists(path);
                return;
            }
            return;
        }
        Files.deleteIfExists(path);
    }

    private static final void sx_(Path path, access17200 access17200Var) throws IOException {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (Exception e) {
                access17200Var.onNavigationEvent(e);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStreamNewDirectoryStream = null;
        }
        if (directoryStreamNewDirectoryStream == null) {
            return;
        }
        try {
            Iterator<Path> it = directoryStreamNewDirectoryStream.iterator();
            Intrinsics.checkNotNullExpressionValue(it, BuildConfig.FLAVOR);
            while (it.hasNext()) {
                Path pathM = NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline7.m(it.next());
                Intrinsics.checkNotNull(pathM);
                sy_(pathM, path, access17200Var);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(directoryStreamNewDirectoryStream, (Throwable) null);
        } finally {
        }
    }

    public static final void sh_(@NotNull Path path) throws IllegalFileNameException {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        String strSK_ = clearCurrentBacktrace.sK_(path);
        int iHashCode = strSK_.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !strSK_.equals("./")) {
                                return;
                            }
                        } else if (!strSK_.equals("..")) {
                            return;
                        }
                    } else if (!strSK_.equals("..\\")) {
                        return;
                    }
                } else if (!strSK_.equals("../")) {
                    return;
                }
            } else if (!strSK_.equals(".\\")) {
                return;
            }
        } else if (!strSK_.equals(onVideoError.onExtraCallbackWithResult)) {
            return;
        }
        throw new IllegalFileNameException(path);
    }

    private static final void si_(Path path, Path path2) throws FileSystemLoopException {
        if (!Files.isSymbolicLink(path) && Files.isSameFile(path, path2)) {
            throw addBacktraceNote.rW_(path.toString());
        }
    }
}
