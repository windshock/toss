package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.TTHistoryActivity2;
import o.access16100;
import o.access16700;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return createTempDir(str, str2, file);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final File createTempDir(@NotNull String str, @Nullable String str2, @Nullable File file) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        File fileCreateTempFile = File.createTempFile(str, str2, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            Intrinsics.checkNotNull(fileCreateTempFile);
            return fileCreateTempFile;
        }
        throw new IOException("Unable to create temporary directory " + fileCreateTempFile + '.');
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return createTempFile(str, str2, file);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final File createTempFile(@NotNull String str, @Nullable String str2, @Nullable File file) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        File fileCreateTempFile = File.createTempFile(str, str2, file);
        Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "");
        return fileCreateTempFile;
    }

    public static String getExtension(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return StringsKt__StringsKt.substringAfterLast(name, '.', _UrlKt.FRAGMENT_ENCODE_SET);
    }

    public static final String getInvariantSeparatorsPath(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        char c = File.separatorChar;
        if (c != '/') {
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "");
            return StringsKt__StringsJVMKt.replace$default(path, c, '/', false, 4, (Object) null);
        }
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "");
        return path2;
    }

    public static String getNameWithoutExtension(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return StringsKt__StringsKt.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
    }

    public static final String toRelativeString(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    public static File relativeTo(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        return new File(toRelativeString(file, file2));
    }

    public static final File relativeToOrSelf(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        return relativeStringOrNull$FilesKt__UtilsKt != null ? new File(relativeStringOrNull$FilesKt__UtilsKt) : file;
    }

    public static final File relativeToOrNull(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File file, File file2) {
        access16100 access16100VarNormalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(FilesKt__FilePathComponentsKt.toComponents(file));
        access16100 access16100VarNormalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(FilesKt__FilePathComponentsKt.toComponents(file2));
        if (!Intrinsics.areEqual(access16100VarNormalize$FilesKt__UtilsKt.IAuthTabCallback(), access16100VarNormalize$FilesKt__UtilsKt2.IAuthTabCallback())) {
            return null;
        }
        int iOnExtraCallback = access16100VarNormalize$FilesKt__UtilsKt2.onExtraCallback();
        int iOnExtraCallback2 = access16100VarNormalize$FilesKt__UtilsKt.onExtraCallback();
        int iMin = Math.min(iOnExtraCallback2, iOnExtraCallback);
        int i = 0;
        while (i < iMin && Intrinsics.areEqual(access16100VarNormalize$FilesKt__UtilsKt.onNavigationEvent().get(i), access16100VarNormalize$FilesKt__UtilsKt2.onNavigationEvent().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = iOnExtraCallback - 1;
        if (i <= i2) {
            while (!Intrinsics.areEqual(access16100VarNormalize$FilesKt__UtilsKt2.onNavigationEvent().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < iOnExtraCallback2) {
            if (i < iOnExtraCallback) {
                sb.append(File.separatorChar);
            }
            List listDrop = CollectionsKt___CollectionsKt.drop(access16100VarNormalize$FilesKt__UtilsKt.onNavigationEvent(), i);
            String str = File.separator;
            Intrinsics.checkNotNullExpressionValue(str, "");
            CollectionsKt___CollectionsKt.joinTo$default(listDrop, sb, str, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = TTHistoryActivity2.SIZE;
        }
        return copyTo(file, file2, z, i);
    }

    public static final File copyTo(@NotNull File file, @NotNull File file2, boolean z, int i) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z) {
                throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (file2.mkdirs()) {
                return file2;
            }
            throw new FileSystemException(file, file2, "Failed to create target directory.");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                ByteStreamsKt.copyTo(fileInputStream, fileOutputStream, i);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                CloseableKt.closeFinally(fileInputStream, null);
                return file2;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function2 = new Function2() { // from class: kotlin.io.FilesKt__UtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return FilesKt__UtilsKt.copyRecursively$lambda$0$FilesKt__UtilsKt((File) obj2, (IOException) obj3);
                }
            };
        }
        return copyRecursively(file, file2, z, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final access16700 copyRecursively$lambda$0$FilesKt__UtilsKt(File file, IOException iOException) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        throw iOException;
    }

    public static final boolean copyRecursively(@NotNull File file, @NotNull File file2, boolean z, @NotNull final Function2<? super File, ? super IOException, ? extends access16700> function2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (!file.exists()) {
            return function2.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != access16700.TERMINATE;
        }
        try {
            Iterator<File> itIAuthTabCallback = FilesKt__FileTreeWalkKt.walkTopDown(file).onNavigationEvent(new Function2() { // from class: kotlin.io.FilesKt__UtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FilesKt__UtilsKt.copyRecursively$lambda$1$FilesKt__UtilsKt(function2, (File) obj, (IOException) obj2);
                }
            }).IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
                File next = itIAuthTabCallback.next();
                if (!next.exists()) {
                    if (function2.invoke(next, new NoSuchFileException(next, null, "The source file doesn't exist.", 2, null)) == access16700.TERMINATE) {
                        return false;
                    }
                } else {
                    File file3 = new File(file2, toRelativeString(next, file));
                    if (file3.exists() && (!next.isDirectory() || !file3.isDirectory())) {
                        if (z) {
                            if (file3.isDirectory()) {
                                if (!deleteRecursively(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (function2.invoke(file3, new FileAlreadyExistsException(next, file3, "The destination file already exists.")) == access16700.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file3.mkdirs();
                    } else if (copyTo$default(next, file3, z, 0, 4, null).length() != next.length() && function2.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == access16700.TERMINATE) {
                        return false;
                    }
                }
            }
            return true;
        } catch (TerminateException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copyRecursively$lambda$1$FilesKt__UtilsKt(Function2 function2, File file, IOException iOException) throws TerminateException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        if (function2.invoke(file, iOException) != access16700.TERMINATE) {
            return Unit.INSTANCE;
        }
        throw new TerminateException(file);
    }

    public static boolean deleteRecursively(@NotNull File file) {
        boolean z;
        Intrinsics.checkNotNullParameter(file, "");
        Iterator<File> itIAuthTabCallback = FilesKt__FileTreeWalkKt.walkBottomUp(file).IAuthTabCallback();
        while (true) {
            while (itIAuthTabCallback.hasNext()) {
                File next = itIAuthTabCallback.next();
                if (next.delete() || !next.exists()) {
                    z = z;
                }
            }
            return z;
        }
    }

    public static final boolean startsWith(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        access16100 components = FilesKt__FilePathComponentsKt.toComponents(file);
        access16100 components2 = FilesKt__FilePathComponentsKt.toComponents(file2);
        if (Intrinsics.areEqual(components.IAuthTabCallback(), components2.IAuthTabCallback()) && components.onExtraCallback() >= components2.onExtraCallback()) {
            return components.onNavigationEvent().subList(0, components2.onExtraCallback()).equals(components2.onNavigationEvent());
        }
        return false;
    }

    public static final boolean startsWith(@NotNull File file, @NotNull String str) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        return startsWith(file, new File(str));
    }

    public static final boolean endsWith(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        access16100 components = FilesKt__FilePathComponentsKt.toComponents(file);
        access16100 components2 = FilesKt__FilePathComponentsKt.toComponents(file2);
        if (components2.onExtraCallbackWithResult()) {
            return Intrinsics.areEqual(file, file2);
        }
        int iOnExtraCallback = components.onExtraCallback() - components2.onExtraCallback();
        if (iOnExtraCallback < 0) {
            return false;
        }
        return components.onNavigationEvent().subList(iOnExtraCallback, components.onExtraCallback()).equals(components2.onNavigationEvent());
    }

    public static final boolean endsWith(@NotNull File file, @NotNull String str) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        return endsWith(file, new File(str));
    }

    public static final File normalize(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        access16100 components = FilesKt__FilePathComponentsKt.toComponents(file);
        File fileIAuthTabCallback = components.IAuthTabCallback();
        List<File> listNormalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(components.onNavigationEvent());
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return resolve(fileIAuthTabCallback, CollectionsKt___CollectionsKt.joinToString$default(listNormalize$FilesKt__UtilsKt, str, null, null, 0, null, null, 62, null));
    }

    private static final access16100 normalize$FilesKt__UtilsKt(access16100 access16100Var) {
        return new access16100(access16100Var.IAuthTabCallback(), normalize$FilesKt__UtilsKt(access16100Var.onNavigationEvent()));
    }

    private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (Intrinsics.areEqual(name, ".")) {
                Unit unit = Unit.INSTANCE;
            } else if (Intrinsics.areEqual(name, "..")) {
                if (arrayList.isEmpty() || Intrinsics.areEqual(((File) CollectionsKt___CollectionsKt.last((List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                }
            } else {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public static final File resolve(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        if (FilesKt__FilePathComponentsKt.isRooted(file2)) {
            return file2;
        }
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (string.length() != 0) {
            char c = File.separatorChar;
            if (!StringsKt__StringsKt.endsWith$default((CharSequence) string, c, false, 2, (Object) null)) {
                return new File(string + c + file2);
            }
        }
        return new File(string + file2);
    }

    public static File resolve(@NotNull File file, @NotNull String str) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        return resolve(file, new File(str));
    }

    public static final File resolveSibling(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        access16100 components = FilesKt__FilePathComponentsKt.toComponents(file);
        return resolve(resolve(components.IAuthTabCallback(), components.onExtraCallback() == 0 ? new File("..") : components.IAuthTabCallback(0, components.onExtraCallback() - 1)), file2);
    }

    public static final File resolveSibling(@NotNull File file, @NotNull String str) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        return resolveSibling(file, new File(str));
    }
}
