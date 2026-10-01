package o;

import com.applovin.shadow.okio.NioFileSystemWrappingFileSystem$;
import com.applovin.shadow.okio.NioSystemFileSystem$;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;
import o.TTFullScreenVideoActivity3;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TTDelegateActivity extends TTCeilingLandingPageActivity7 {
    @Override // o.TTCeilingLandingPageActivity7, okio.FileSystem
    public TTBaseVideoActivity metadataOrNull(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return sR_(tTFullScreenVideoActivity3.sS_());
    }

    protected final TTBaseVideoActivity sR_(@NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "");
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) NioSystemFileSystem$.ExternalSyntheticApiModelOutline0.m(), NioSystemFileSystem$.ExternalSyntheticApiModelOutline1.m());
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            TTFullScreenVideoActivity3 tTFullScreenVideoActivity3ST_ = symbolicLink != null ? TTFullScreenVideoActivity3.onExtraCallback.sT_(TTFullScreenVideoActivity3.Companion, symbolicLink, false, 1, null) : null;
            long size = attributes.size();
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lSQ_ = fileTimeCreationTime != null ? sQ_(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lSQ_2 = fileTimeLastModifiedTime != null ? sQ_(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new TTBaseVideoActivity(zIsRegularFile, zIsDirectory, tTFullScreenVideoActivity3ST_, Long.valueOf(size), lSQ_, lSQ_2, fileTimeLastAccessTime != null ? sQ_(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    private final Long sQ_(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // o.TTCeilingLandingPageActivity7, okio.FileSystem
    public void atomicMove(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        try {
            Files.move(tTFullScreenVideoActivity3.sS_(), tTFullScreenVideoActivity32.sS_(), NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline2.m(), NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline3.m());
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // o.TTCeilingLandingPageActivity7, okio.FileSystem
    public void createSymlink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        Files.createSymbolicLink(tTFullScreenVideoActivity3.sS_(), tTFullScreenVideoActivity32.sS_(), new FileAttribute[0]);
    }

    @Override // o.TTCeilingLandingPageActivity7
    public String toString() {
        return "NioSystemFileSystem";
    }
}
