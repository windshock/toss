package okio.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.TTBaseVideoActivity;
import o.TTBaseVideoActivity3;
import o.TTCeilingLandingPageActivity5;
import o.TTFullScreenVideoActivity3;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import o.TTHistoryLandingPageActivity13;
import o.TTHistoryLandingPageActivity2;
import o.getWrite;
import okhttp3.internal.url._UrlKt;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final TTFullScreenVideoActivity3 onExtraCallback = TTFullScreenVideoActivity3.onExtraCallback.IAuthTabCallback(TTFullScreenVideoActivity3.Companion, "/", false, 1, null);
    private final Lazy IAuthTabCallback;
    private final ClassLoader onExtraCallbackWithResult;
    private final FileSystem onWarmupCompleted;

    public ResourceFileSystem(@NotNull ClassLoader classLoader, boolean z, @NotNull FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(classLoader, "");
        Intrinsics.checkNotNullParameter(fileSystem, "");
        this.onExtraCallbackWithResult = classLoader;
        this.onWarmupCompleted = fileSystem;
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: okio.internal.ResourceFileSystem$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ResourceFileSystem.IAuthTabCallback(this.f$0);
            }
        });
        if (z) {
            onExtraCallbackWithResult().size();
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z, FileSystem fileSystem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z, (i & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List IAuthTabCallback(ResourceFileSystem resourceFileSystem) {
        return resourceFileSystem.onExtraCallback(resourceFileSystem.onExtraCallbackWithResult);
    }

    private final List<Pair<FileSystem, TTFullScreenVideoActivity3>> onExtraCallbackWithResult() {
        return (List) this.IAuthTabCallback.getValue();
    }

    @Override // okio.FileSystem
    public TTFullScreenVideoActivity3 canonicalize(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return onExtraCallbackWithResult(tTFullScreenVideoActivity3);
    }

    private final TTFullScreenVideoActivity3 onExtraCallbackWithResult(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        return onExtraCallback.onExtraCallback(tTFullScreenVideoActivity3, true);
    }

    @Override // okio.FileSystem
    public List<TTFullScreenVideoActivity3> list(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        String strOnNavigationEvent = onNavigationEvent(tTFullScreenVideoActivity3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair<FileSystem, TTFullScreenVideoActivity3> pair : onExtraCallbackWithResult()) {
            FileSystem fileSystemOnExtraCallbackWithResult = pair.onExtraCallbackWithResult();
            TTFullScreenVideoActivity3 tTFullScreenVideoActivity3IAuthTabCallback = pair.IAuthTabCallback();
            try {
                List<TTFullScreenVideoActivity3> list = fileSystemOnExtraCallbackWithResult.list(tTFullScreenVideoActivity3IAuthTabCallback.onWarmupCompleted(strOnNavigationEvent));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.onNavigationEvent((TTFullScreenVideoActivity3) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.onExtraCallbackWithResult((TTFullScreenVideoActivity3) it.next(), tTFullScreenVideoActivity3IAuthTabCallback));
                }
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (!z) {
            throw new FileNotFoundException("file not found: " + tTFullScreenVideoActivity3);
        }
        return CollectionsKt___CollectionsKt.toList(linkedHashSet);
    }

    @Override // okio.FileSystem
    public List<TTFullScreenVideoActivity3> listOrNull(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        String strOnNavigationEvent = onNavigationEvent(tTFullScreenVideoActivity3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Pair<FileSystem, TTFullScreenVideoActivity3>> it = onExtraCallbackWithResult().iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair<FileSystem, TTFullScreenVideoActivity3> next = it.next();
            FileSystem fileSystemOnExtraCallbackWithResult = next.onExtraCallbackWithResult();
            TTFullScreenVideoActivity3 tTFullScreenVideoActivity3IAuthTabCallback = next.IAuthTabCallback();
            List<TTFullScreenVideoActivity3> listListOrNull = fileSystemOnExtraCallbackWithResult.listOrNull(tTFullScreenVideoActivity3IAuthTabCallback.onWarmupCompleted(strOnNavigationEvent));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.onNavigationEvent((TTFullScreenVideoActivity3) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.onExtraCallbackWithResult((TTFullScreenVideoActivity3) it2.next(), tTFullScreenVideoActivity3IAuthTabCallback));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return CollectionsKt___CollectionsKt.toList(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity3 openReadOnly(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        if (!Companion.onNavigationEvent(tTFullScreenVideoActivity3)) {
            throw new FileNotFoundException("file not found: " + tTFullScreenVideoActivity3);
        }
        String strOnNavigationEvent = onNavigationEvent(tTFullScreenVideoActivity3);
        for (Pair<FileSystem, TTFullScreenVideoActivity3> pair : onExtraCallbackWithResult()) {
            try {
                return pair.onExtraCallbackWithResult().openReadOnly(pair.IAuthTabCallback().onWarmupCompleted(strOnNavigationEvent));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + tTFullScreenVideoActivity3);
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity3 openReadWrite(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity metadataOrNull(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        if (!Companion.onNavigationEvent(tTFullScreenVideoActivity3)) {
            return null;
        }
        String strOnNavigationEvent = onNavigationEvent(tTFullScreenVideoActivity3);
        for (Pair<FileSystem, TTFullScreenVideoActivity3> pair : onExtraCallbackWithResult()) {
            TTBaseVideoActivity tTBaseVideoActivityMetadataOrNull = pair.onExtraCallbackWithResult().metadataOrNull(pair.IAuthTabCallback().onWarmupCompleted(strOnNavigationEvent));
            if (tTBaseVideoActivityMetadataOrNull != null) {
                return tTBaseVideoActivityMetadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public TTHistoryActivity42 source(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        if (!Companion.onNavigationEvent(tTFullScreenVideoActivity3)) {
            throw new FileNotFoundException("file not found: " + tTFullScreenVideoActivity3);
        }
        TTFullScreenVideoActivity3 tTFullScreenVideoActivity32 = onExtraCallback;
        URL resource = this.onExtraCallbackWithResult.getResource(TTFullScreenVideoActivity3.onExtraCallback(tTFullScreenVideoActivity32, tTFullScreenVideoActivity3, false, 2, null).onExtraCallbackWithResult(tTFullScreenVideoActivity32).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + tTFullScreenVideoActivity3);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "");
        return TTCeilingLandingPageActivity5.IAuthTabCallback(inputStream);
    }

    @Override // okio.FileSystem
    public TTHistoryActivity41 sink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public TTHistoryActivity41 appendingSink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void delete(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        throw new IOException(this + " is read-only");
    }

    private final String onNavigationEvent(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        return onExtraCallbackWithResult(tTFullScreenVideoActivity3).onExtraCallbackWithResult(onExtraCallback).toString();
    }

    private final List<Pair<FileSystem, TTFullScreenVideoActivity3>> onExtraCallback(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources(_UrlKt.FRAGMENT_ENCODE_SET);
        Intrinsics.checkNotNullExpressionValue(resources, "");
        ArrayList<URL> list = Collections.list(resources);
        Intrinsics.checkNotNullExpressionValue(list, "");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            Intrinsics.checkNotNull(url);
            Pair<FileSystem, TTFullScreenVideoActivity3> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(url);
            if (pairOnExtraCallbackWithResult != null) {
                arrayList.add(pairOnExtraCallbackWithResult);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        ArrayList<URL> list2 = Collections.list(resources2);
        Intrinsics.checkNotNullExpressionValue(list2, "");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            Intrinsics.checkNotNull(url2);
            Pair<FileSystem, TTFullScreenVideoActivity3> pairOnExtraCallback = onExtraCallback(url2);
            if (pairOnExtraCallback != null) {
                arrayList2.add(pairOnExtraCallback);
            }
        }
        return CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    private final Pair<FileSystem, TTFullScreenVideoActivity3> onExtraCallbackWithResult(URL url) {
        if (Intrinsics.areEqual(url.getProtocol(), "file")) {
            return getWrite.IAuthTabCallback(this.onWarmupCompleted, TTFullScreenVideoActivity3.onExtraCallback.onNavigationEvent(TTFullScreenVideoActivity3.Companion, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final Pair<FileSystem, TTFullScreenVideoActivity3> onExtraCallback(URL url) {
        int iLastIndexOf$default;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (!StringsKt__StringsJVMKt.startsWith$default(string, "jar:file:", false, 2, null) || (iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) string, "!", 0, false, 6, (Object) null)) == -1) {
            return null;
        }
        TTFullScreenVideoActivity3.onExtraCallback onextracallback = TTFullScreenVideoActivity3.Companion;
        String strSubstring = string.substring(4, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return getWrite.IAuthTabCallback(TTHistoryLandingPageActivity13.IAuthTabCallback(TTFullScreenVideoActivity3.onExtraCallback.onNavigationEvent(onextracallback, new File(URI.create(strSubstring)), false, 1, null), this.onWarmupCompleted, new Function1() { // from class: okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ResourceFileSystem.onWarmupCompleted((TTHistoryLandingPageActivity2) obj));
            }
        }), onExtraCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onWarmupCompleted(TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity2) {
        Intrinsics.checkNotNullParameter(tTHistoryLandingPageActivity2, "");
        return Companion.onNavigationEvent(tTHistoryLandingPageActivity2.onWarmupCompleted());
    }

    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TTFullScreenVideoActivity3 onExtraCallbackWithResult() {
            return ResourceFileSystem.onExtraCallback;
        }

        public final TTFullScreenVideoActivity3 onExtraCallbackWithResult(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) {
            Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
            Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
            return onExtraCallbackWithResult().onWarmupCompleted(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsKt.removePrefix(tTFullScreenVideoActivity3.toString(), (CharSequence) tTFullScreenVideoActivity32.toString()), '\\', '/', false, 4, (Object) null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean onNavigationEvent(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
            return !StringsKt__StringsJVMKt.endsWith(tTFullScreenVideoActivity3.onNavigationEvent(), ".class", true);
        }
    }
}
