package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.rn.toss.core.bundle.cache.RnBundleFileProcessLock;
import im.toss.rn.toss.core.bundle.model.BundleMetadata;
import im.toss.rn.toss.core.common.process.RnProcessRuntime;
import im.toss.rn.toss.core.common.process.RnRemoteProcessGuardRecorder;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 {
    public static final onExtraCallback Companion;
    private static byte[] IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static short[] asInterface;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final MaxNativeAdLoaderImpla onWarmupCompleted;
    private static final byte[] $$a = {108, -1, -36, 99};
    private static final int $$b = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackDefault = 0;

    private static String $$c(short s, byte b, int i) {
        int i2 = 115 - (s * 2);
        int i3 = i + 4;
        byte[] bArr = $$a;
        int i4 = b * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + i3;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i3 + 1;
            i2 += bArr[i8];
            i3 = i8;
            i6 = i7;
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        onExtraCallbackWithResult();
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallbackDefault + 55;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 82 / 0;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i7 | i8 | i5)) | (~(i6 | i3 | i5));
        int i10 = ~i5;
        int i11 = (~(i8 | i6)) | (~(i8 | i10));
        int i12 = (~(i5 | i3)) | (~(i7 | i10));
        int i13 = i6 + i3 + i2 + ((-564018846) * i) + (483938512 * i4);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i6) + 752877568 + ((-1516524009) * i3) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i2) + (1390411776 * i) + (452984832 * i4) + ((-1135738880) * i14);
        int i16 = ((i6 * 1456092922) - 824780772) + (i3 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i2 * 1456093799) + (i * 578355822) + (i4 * 1098359728) + (i14 * 1868693504);
        return i15 + ((i16 * i16) * 2110914560) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    @Inject
    public r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4(@NotNull MaxNativeAdLoaderImpla maxNativeAdLoaderImpla) {
        Intrinsics.checkNotNullParameter(maxNativeAdLoaderImpla, "");
        this.onWarmupCompleted = maxNativeAdLoaderImpla;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 r8lambda2dedie2xf7declmcf5taijldvi4 = (r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        onExtraCallback onextracallback = Companion;
        File fileOnExtraCallbackWithResult = onExtraCallback.onExtraCallbackWithResult(onextracallback, r8lambda2dedie2xf7declmcf5taijldvi4.onWarmupCompleted.onExtraCallbackWithResult(str2, str3), onExtraCallback.onExtraCallbackWithResult(onextracallback, str, str4), null, 2, null);
        int i4 = onTransact + 125;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return fileOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final File onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        onExtraCallback onextracallback = Companion;
        File fileOnExtraCallbackWithResult = onExtraCallback.onExtraCallbackWithResult(onextracallback, this.onWarmupCompleted.onExtraCallbackWithResult(str2, str3), onExtraCallback.onExtraCallbackWithResult(onextracallback, str, str4), ".meta");
        int i4 = onTransact + 49;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return fileOnExtraCallbackWithResult;
    }

    public final boolean onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        File file = (File) onWarmupCompleted(new Object[]{this, str, str2, str3, str4}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1891120194, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, 1891120195);
        File fileOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, str3, str4);
        if (file.exists()) {
            int i2 = onTransact + 31;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            boolean zExists = fileOnExtraCallbackWithResult.exists();
            if (i3 == 0) {
                int i4 = 15 / 0;
                if (zExists) {
                    return true;
                }
            } else if (zExists) {
                return true;
            }
        }
        int i5 = asBinder + 33;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BundleMetadata onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (!onNavigationEvent(str, str2, str3, str4)) {
            int i2 = onTransact + 79;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 45 / 0;
            }
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(onExtraCallbackWithResult(str, str2, str3, str4)));
            try {
                BundleMetadata bundleMetadataOnExtraCallback = BundleMetadata.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
                CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                obj = Result.constructor-impl(bundleMetadataOnExtraCallback);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        BundleMetadata bundleMetadata = (BundleMetadata) (Result.onExtraCallback(obj) ? null : obj);
        int i4 = asBinder + 41;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return bundleMetadata;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v47 ??, still in use, count: 1, list:
          (r2v47 ?? I:im.toss.rn.toss.core.bundle.model.BundleMetadata) from 0x0169: INVOKE (r2v49 ?? I:java.lang.String) = 
          (r7v51 ?? I:im.toss.rn.toss.core.bundle.model.BundleMetadata$Companion)
          (r2v47 ?? I:im.toss.rn.toss.core.bundle.model.BundleMetadata)
         VIRTUAL call: im.toss.rn.toss.core.bundle.model.BundleMetadata.Companion.onWarmupCompleted(im.toss.rn.toss.core.bundle.model.BundleMetadata):java.lang.String A[Catch: all -> 0x02b7, MD:(im.toss.rn.toss.core.bundle.model.BundleMetadata):java.lang.String (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    public final void IAuthTabCallback(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v47 ??, still in use, count: 1, list:
          (r2v47 ?? I:im.toss.rn.toss.core.bundle.model.BundleMetadata) from 0x0169: INVOKE (r2v49 ?? I:java.lang.String) = 
          (r7v51 ?? I:im.toss.rn.toss.core.bundle.model.BundleMetadata$Companion)
          (r2v47 ?? I:im.toss.rn.toss.core.bundle.model.BundleMetadata)
         VIRTUAL call: im.toss.rn.toss.core.bundle.model.BundleMetadata.Companion.onWarmupCompleted(im.toss.rn.toss.core.bundle.model.BundleMetadata):java.lang.String A[Catch: all -> 0x02b7, MD:(im.toss.rn.toss.core.bundle.model.BundleMetadata):java.lang.String (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c8 A[Catch: all -> 0x01dd, TryCatch #15 {all -> 0x01dd, blocks: (B:46:0x0138, B:74:0x01c2, B:76:0x01c8, B:77:0x01cd, B:73:0x01b8), top: B:123:0x0138, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [im.toss.rn.toss.core.bundle.model.BundleMetadata$Companion] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [im.toss.rn.toss.core.bundle.model.BundleMetadata] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Object obj;
        Throwable th;
        Object obj2;
        Object obj3;
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback;
        ReentrantLock reentrantLockPutIfAbsent;
        r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 r8lambda2dedie2xf7declmcf5taijldvi4 = (r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        synchronized (r8lambda2dedie2xf7declmcf5taijldvi4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            r8lambda2dedie2xf7declmcf5taijldvi4.onWarmupCompleted("BundleFileManager.updateBundleMeta", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("region", str2), getWrite.IAuthTabCallback("company", str3)}));
            RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
            File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(r8lambda2dedie2xf7declmcf5taijldvi4.onWarmupCompleted.onWarmupCompleted());
            ConcurrentHashMap<String, ReentrantLock> concurrentHashMapOnExtraCallback = rnBundleFileProcessLock.onExtraCallback();
            String canonicalPath = fileOnExtraCallback.getCanonicalPath();
            ReentrantLock reentrantLock = concurrentHashMapOnExtraCallback.get(canonicalPath);
            if (reentrantLock == null && (reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.putIfAbsent(canonicalPath, (reentrantLock = new ReentrantLock()))) != null) {
                reentrantLock = reentrantLockPutIfAbsent;
            }
            ReentrantLock reentrantLock2 = reentrantLock;
            reentrantLock2.lock();
            try {
                Object obj4 = null;
                if (reentrantLock2.getHoldCount() > 1) {
                    File fileOnExtraCallbackWithResult = r8lambda2dedie2xf7declmcf5taijldvi4.onWarmupCompleted.onExtraCallbackWithResult(str2, str3);
                    File fileOnExtraCallbackWithResult2 = r8lambda2dedie2xf7declmcf5taijldvi4.onExtraCallbackWithResult(str, str2, str3, str4);
                    onExtraCallback onextracallback = Companion;
                    File fileOnExtraCallbackWithResult3 = onExtraCallback.onExtraCallbackWithResult(onextracallback, fileOnExtraCallbackWithResult, onExtraCallback.onExtraCallbackWithResult(onextracallback, str, str4), ".meta.tmp");
                    try {
                        Result.Companion companion = Result.Companion;
                        tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(fileOnExtraCallbackWithResult2));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.Companion;
                        obj3 = Result.constructor-impl(ResultKt.createFailure(th2));
                    }
                    try {
                        BundleMetadata.Companion companion3 = BundleMetadata.Companion;
                        BundleMetadata bundleMetadataOnExtraCallback = companion3.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
                        CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                        TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.onExtraCallback(fileOnExtraCallbackWithResult3, false, 1, (Object) null));
                        obj4 = null;
                        try {
                            tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(companion3.onWarmupCompleted(BundleMetadata.onNavigationEvent(bundleMetadataOnExtraCallback, null, null, null, null, 0L, jLongValue, null, 95, null)));
                            obj4 = null;
                            CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult, (Throwable) null);
                            obj3 = Result.constructor-impl(Boolean.valueOf(fileOnExtraCallbackWithResult3.renameTo(fileOnExtraCallbackWithResult2)));
                            if (Result.exceptionOrNull-impl(obj3) != null) {
                                Companion.IAuthTabCallback(fileOnExtraCallbackWithResult3);
                            }
                            ResultKt.onNavigationEvent(obj3);
                            obj2 = obj4;
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    File parentFile = fileOnExtraCallback.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new RandomAccessFile(fileOnExtraCallback, "rw").getChannel();
                    try {
                        FileLock fileLockLock = channel.lock();
                        try {
                            File fileOnExtraCallbackWithResult4 = r8lambda2dedie2xf7declmcf5taijldvi4.onWarmupCompleted.onExtraCallbackWithResult(str2, str3);
                            File fileOnExtraCallbackWithResult5 = r8lambda2dedie2xf7declmcf5taijldvi4.onExtraCallbackWithResult(str, str2, str3, str4);
                            onExtraCallback onextracallback2 = Companion;
                            ?? OnExtraCallback = ".meta.tmp";
                            File fileOnExtraCallbackWithResult6 = onExtraCallback.onExtraCallbackWithResult(onextracallback2, fileOnExtraCallbackWithResult4, onExtraCallback.onExtraCallbackWithResult(onextracallback2, str, str4), ".meta.tmp");
                            try {
                                Result.Companion companion4 = Result.Companion;
                                TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback2 = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(fileOnExtraCallbackWithResult5));
                                try {
                                    try {
                                        BundleMetadata.Companion companion5 = BundleMetadata.Companion;
                                        OnExtraCallback = companion5.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback2);
                                        CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback2, (Throwable) null);
                                        TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult2 = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.onExtraCallback(fileOnExtraCallbackWithResult6, false, 1, (Object) null));
                                        OnExtraCallback = 0;
                                        try {
                                            BundleMetadata bundleMetadataOnNavigationEvent = BundleMetadata.onNavigationEvent(OnExtraCallback, null, null, null, null, 0L, jLongValue, null, 95, null);
                                            OnExtraCallback = companion5;
                                            tTAppOpenAdActivity9OnExtraCallbackWithResult2.onExtraCallback(OnExtraCallback.onWarmupCompleted(bundleMetadataOnNavigationEvent));
                                            th = null;
                                            CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult2, (Throwable) null);
                                            obj = Result.constructor-impl(Boolean.valueOf(fileOnExtraCallbackWithResult6.renameTo(fileOnExtraCallbackWithResult5)));
                                        } catch (Throwable th3) {
                                            OnExtraCallback = 0;
                                            OnExtraCallback = 0;
                                            try {
                                                throw th3;
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    Result.Companion companion6 = Result.Companion;
                                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                                    th = OnExtraCallback;
                                    if (Result.exceptionOrNull-impl(obj) != null) {
                                    }
                                    ResultKt.onNavigationEvent(obj);
                                    CloseableKt.closeFinally(channel, th);
                                    obj2 = th;
                                    return obj2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                OnExtraCallback = 0;
                            }
                            if (Result.exceptionOrNull-impl(obj) != null) {
                                Companion.IAuthTabCallback(fileOnExtraCallbackWithResult6);
                            }
                            ResultKt.onNavigationEvent(obj);
                            CloseableKt.closeFinally(channel, th);
                            obj2 = th;
                        } finally {
                            fileLockLock.release();
                        }
                    } finally {
                    }
                }
            } finally {
                reentrantLock2.unlock();
            }
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01be A[PHI: r3
      0x01be: PHI (r3v47 int) = (r3v9 int), (r3v50 int) binds: [B:43:0x01bc, B:40:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c0 A[PHI: r3
      0x01c0: PHI (r3v10 int) = (r3v9 int), (r3v50 int) binds: [B:43:0x01bc, B:40:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getEdgeSlop() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 42, 22439 - ExpandableListView.getPackedPositionGroup(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = IAuthTabCallback;
                if (bArr != null) {
                    int i7 = $10 + 21;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12843);
                            int iLastIndexOf = 54 - TextUtils.lastIndexOf("", '0', 0, 0);
                            int iRgb = (-16775049) - Color.rgb(0, 0, 0);
                            byte b2 = $$a[1];
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMakeMeasureSpec, iLastIndexOf, iRgb, -299036574, false, $$c(b3, b3, b2), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $11 + 65;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr3 = IAuthTabCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43424), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, (Process.myTid() >> 22) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (asInterface[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    int i12 = $11 + 117;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            if (iIntValue > 0) {
                int i14 = $11 + 107;
                int i15 = i14 % 128;
                $10 = i15;
                if (i14 % 2 != 0) {
                    i4 = ((i >> iIntValue) % 4) / ((int) (onExtraCallbackWithResult - 4629411779493505016L));
                    if (z) {
                        int i16 = i15 + 39;
                        int i17 = i16 % 128;
                        $11 = i17;
                        int i18 = i16 % 2;
                        int i19 = i17 + 91;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                    if (!z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 85, 9567 - (KeyEvent.getMaxKeyCode() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i21 = 0; i21 < length2; i21++) {
                        bArr5[i21] = (byte) (bArr4[i21] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = asInterface;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[Catch: all -> 0x01cd, TryCatch #4 {all -> 0x01cd, blocks: (B:10:0x0035, B:12:0x003d, B:14:0x0049, B:16:0x004d, B:18:0x0055, B:20:0x005b, B:22:0x005f, B:24:0x0067, B:26:0x006d, B:28:0x0071, B:30:0x0087, B:32:0x0098, B:34:0x00a9, B:37:0x00c2, B:36:0x00ba, B:38:0x00c8, B:39:0x00d0, B:40:0x00d9, B:41:0x00dd, B:43:0x00e3, B:44:0x00e6, B:80:0x01b8, B:91:0x01c9, B:92:0x01cc, B:45:0x00f1, B:78:0x01b4, B:84:0x01c0, B:85:0x01c3, B:46:0x00f5, B:48:0x0101, B:50:0x0105, B:52:0x010d, B:54:0x0113, B:56:0x0117, B:58:0x011f, B:60:0x0125, B:62:0x0129, B:64:0x0145, B:66:0x0156, B:68:0x0167, B:71:0x0180, B:70:0x0178, B:72:0x018b, B:73:0x019f, B:74:0x01af, B:88:0x01c6), top: B:105:0x0035, outer: #1, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0178 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:46:0x00f5, B:48:0x0101, B:50:0x0105, B:52:0x010d, B:54:0x0113, B:56:0x0117, B:58:0x011f, B:60:0x0125, B:62:0x0129, B:64:0x0145, B:66:0x0156, B:68:0x0167, B:71:0x0180, B:70:0x0178, B:72:0x018b, B:73:0x019f, B:74:0x01af), top: B:99:0x00f5, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback() {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        File[] fileArrListFiles3;
        File[] fileArrListFiles4;
        ReentrantLock reentrantLockPutIfAbsent;
        synchronized (this) {
            onExtraCallbackWithResult(this, "BundleFileManager.cleanUpTemporaryFiles", null, 2, null);
            RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
            File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(this.onWarmupCompleted.onWarmupCompleted());
            ConcurrentHashMap<String, ReentrantLock> concurrentHashMapOnExtraCallback = rnBundleFileProcessLock.onExtraCallback();
            String canonicalPath = fileOnExtraCallback.getCanonicalPath();
            ReentrantLock reentrantLock = concurrentHashMapOnExtraCallback.get(canonicalPath);
            if (reentrantLock == null && (reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.putIfAbsent(canonicalPath, (reentrantLock = new ReentrantLock()))) != null) {
                reentrantLock = reentrantLockPutIfAbsent;
            }
            ReentrantLock reentrantLock2 = reentrantLock;
            reentrantLock2.lock();
            try {
                int i = 0;
                if (reentrantLock2.getHoldCount() > 1) {
                    File[] fileArrListFiles5 = this.onWarmupCompleted.onWarmupCompleted().listFiles();
                    if (fileArrListFiles5 != null) {
                        int length = fileArrListFiles5.length;
                        int i2 = 0;
                        while (i2 < length) {
                            File file = fileArrListFiles5[i2];
                            if (file.isDirectory() && (fileArrListFiles3 = file.listFiles()) != null) {
                                int length2 = fileArrListFiles3.length;
                                int i3 = 0;
                                while (i3 < length2) {
                                    File file2 = fileArrListFiles3[i3];
                                    if (file2.isDirectory() && (fileArrListFiles4 = file2.listFiles()) != null) {
                                        int length3 = fileArrListFiles4.length;
                                        int i4 = 0;
                                        while (i4 < length3) {
                                            File file3 = fileArrListFiles4[i4];
                                            String name = file3.getName();
                                            Intrinsics.checkNotNullExpressionValue(name, "");
                                            File[] fileArr = fileArrListFiles5;
                                            if (!StringsKt.endsWith$default(name, ".old", false, 2, (Object) null)) {
                                                String name2 = file3.getName();
                                                Intrinsics.checkNotNullExpressionValue(name2, "");
                                                if (!StringsKt.endsWith$default(name2, ".meta.old", false, 2, (Object) null)) {
                                                    String name3 = file3.getName();
                                                    Intrinsics.checkNotNullExpressionValue(name3, "");
                                                    if (!StringsKt.endsWith$default(name3, ".tmp", false, 2, (Object) null)) {
                                                        String name4 = file3.getName();
                                                        Intrinsics.checkNotNullExpressionValue(name4, "");
                                                        if (StringsKt.endsWith$default(name4, ".meta.tmp", false, 2, (Object) null)) {
                                                            onExtraCallback onextracallback = Companion;
                                                            Intrinsics.checkNotNull(file3);
                                                            onextracallback.IAuthTabCallback(file3);
                                                        }
                                                    }
                                                }
                                            }
                                            i4++;
                                            fileArrListFiles5 = fileArr;
                                        }
                                    }
                                    i3++;
                                    fileArrListFiles5 = fileArrListFiles5;
                                }
                            }
                            i2++;
                            fileArrListFiles5 = fileArrListFiles5;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    File parentFile = fileOnExtraCallback.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new RandomAccessFile(fileOnExtraCallback, "rw").getChannel();
                    try {
                        FileLock fileLockLock = channel.lock();
                        try {
                            File[] fileArrListFiles6 = this.onWarmupCompleted.onWarmupCompleted().listFiles();
                            if (fileArrListFiles6 != null) {
                                int length4 = fileArrListFiles6.length;
                                int i5 = 0;
                                while (i5 < length4) {
                                    File file4 = fileArrListFiles6[i5];
                                    if (file4.isDirectory() && (fileArrListFiles = file4.listFiles()) != null) {
                                        int length5 = fileArrListFiles.length;
                                        int i6 = i;
                                        while (i6 < length5) {
                                            File file5 = fileArrListFiles[i6];
                                            if (file5.isDirectory() && (fileArrListFiles2 = file5.listFiles()) != null) {
                                                int length6 = fileArrListFiles2.length;
                                                int i7 = i;
                                                while (i7 < length6) {
                                                    File file6 = fileArrListFiles2[i7];
                                                    String name5 = file6.getName();
                                                    Intrinsics.checkNotNullExpressionValue(name5, "");
                                                    File[] fileArr2 = fileArrListFiles6;
                                                    int i8 = length4;
                                                    File[] fileArr3 = fileArrListFiles;
                                                    if (!StringsKt.endsWith$default(name5, ".old", false, 2, (Object) null)) {
                                                        String name6 = file6.getName();
                                                        Intrinsics.checkNotNullExpressionValue(name6, "");
                                                        if (!StringsKt.endsWith$default(name6, ".meta.old", false, 2, (Object) null)) {
                                                            String name7 = file6.getName();
                                                            Intrinsics.checkNotNullExpressionValue(name7, "");
                                                            if (!StringsKt.endsWith$default(name7, ".tmp", false, 2, (Object) null)) {
                                                                String name8 = file6.getName();
                                                                Intrinsics.checkNotNullExpressionValue(name8, "");
                                                                if (StringsKt.endsWith$default(name8, ".meta.tmp", false, 2, (Object) null)) {
                                                                    onExtraCallback onextracallback2 = Companion;
                                                                    Intrinsics.checkNotNull(file6);
                                                                    onextracallback2.IAuthTabCallback(file6);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i7++;
                                                    i = 0;
                                                    length4 = i8;
                                                    fileArrListFiles = fileArr3;
                                                    fileArrListFiles6 = fileArr2;
                                                }
                                            }
                                            i6++;
                                            i = i;
                                            length4 = length4;
                                            fileArrListFiles = fileArrListFiles;
                                            fileArrListFiles6 = fileArrListFiles6;
                                        }
                                    }
                                    i5++;
                                    i = i;
                                    length4 = length4;
                                    fileArrListFiles6 = fileArrListFiles6;
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                            CloseableKt.closeFinally(channel, (Throwable) null);
                        } finally {
                            fileLockLock.release();
                        }
                    } finally {
                    }
                }
            } finally {
                reentrantLock2.unlock();
            }
        }
    }

    public static /* synthetic */ void onNavigationEvent(r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 r8lambda2dedie2xf7declmcf5taijldvi4, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 125;
        int i4 = i3 % 128;
        asBinder = i4;
        Object obj2 = null;
        if (i3 % 2 != 0 ? (i & 8) != 0 : (i & 86) != 0) {
            int i5 = i4 + 65;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            str4 = null;
        }
        r8lambda2dedie2xf7declmcf5taijldvi4.IAuthTabCallback(str, str2, str3, str4);
        int i7 = asBinder + 47;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        ReentrantLock reentrantLockPutIfAbsent;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            onWarmupCompleted("BundleFileManager.invalidateBundle", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("region", str2), getWrite.IAuthTabCallback("company", str3)}));
            RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
            File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(this.onWarmupCompleted.onWarmupCompleted());
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
                    onExtraCallback onextracallback = Companion;
                    onextracallback.IAuthTabCallback((File) onWarmupCompleted(new Object[]{this, str, str2, str3, str4}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1891120194, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1891120195));
                    onextracallback.IAuthTabCallback(onExtraCallbackWithResult(str, str2, str3, str4));
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
                            onExtraCallback onextracallback2 = Companion;
                            onextracallback2.IAuthTabCallback((File) onWarmupCompleted(new Object[]{this, str, str2, str3, str4}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1891120194, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1891120195));
                            onextracallback2.IAuthTabCallback(onExtraCallbackWithResult(str, str2, str3, str4));
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(channel, (Throwable) null);
                        } finally {
                            fileLockLock.release();
                        }
                    } finally {
                    }
                }
            } finally {
                reentrantLock2.unlock();
            }
        }
    }

    public final void onWarmupCompleted() {
        ReentrantLock reentrantLockPutIfAbsent;
        synchronized (this) {
            onExtraCallbackWithResult(this, "BundleFileManager.clearCaches", null, 2, null);
            RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
            File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(this.onWarmupCompleted.onWarmupCompleted());
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
                    FilesKt.deleteRecursively(this.onWarmupCompleted.onWarmupCompleted());
                } else {
                    File parentFile = fileOnExtraCallback.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new RandomAccessFile(fileOnExtraCallback, "rw").getChannel();
                    try {
                        FileLock fileLockLock = channel.lock();
                        try {
                            FilesKt.deleteRecursively(this.onWarmupCompleted.onWarmupCompleted());
                            CloseableKt.closeFinally(channel, (Throwable) null);
                        } finally {
                            fileLockLock.release();
                        }
                    } finally {
                    }
                }
            } finally {
                reentrantLock2.unlock();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallbackWithResult(r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 r8lambda2dedie2xf7declmcf5taijldvi4, String str, Map map, int i, Object obj) throws setWrite {
        int i2 = 2 % 2;
        int i3 = asBinder + 51;
        onTransact = i3 % 128;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            map = access8100.onNavigationEvent();
            int i4 = asBinder + 111;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        r8lambda2dedie2xf7declmcf5taijldvi4.onWarmupCompleted(str, map);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
    private final void onWarmupCompleted(String str, Map<String, String> map) throws setWrite {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (RnProcessRuntime.onWarmupCompleted.IAuthTabCallback()) {
            RnRemoteProcessGuardRecorder.IAuthTabCallback.onExtraCallbackWithResult(str, map);
            throw new setWrite();
        }
        int i4 = asBinder + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static final /* synthetic */ File onExtraCallbackWithResult(onExtraCallback onextracallback, File file, String str, String str2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onextracallback.onNavigationEvent(file, str, str2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            File fileOnNavigationEvent = onextracallback.onNavigationEvent(file, str, str2);
            int i3 = onWarmupCompleted + 91;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return fileOnNavigationEvent;
        }

        public static final /* synthetic */ String onExtraCallbackWithResult(onExtraCallback onextracallback, String str, String str2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback.onExtraCallback(str, str2);
            }
            onextracallback.onExtraCallback(str, str2);
            throw null;
        }

        private final String onNavigationEvent(String str) {
            TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                tTBaseLandingPageActivityOnExtraCallback = TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(iAuthTabCallback, bytes, 0, 1, 5, (Object) null);
            } else {
                TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback2 = TTBaseLandingPageActivity.Companion;
                byte[] bytes2 = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "");
                tTBaseLandingPageActivityOnExtraCallback = TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(iAuthTabCallback2, bytes2, 0, 0, 3, (Object) null);
            }
            return tTBaseLandingPageActivityOnExtraCallback.onTransact().asInterface();
        }

        private final String onExtraCallback(String str, String str2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 46 / 0;
                if (str2 == null) {
                    return str;
                }
            } else if (str2 == null) {
                return str;
            }
            if (StringsKt.isBlank(str2)) {
                return str;
            }
            String str3 = str2 + TossSecRoute.Main.PATH + str;
            int i4 = onWarmupCompleted + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str3;
        }

        static /* synthetic */ File onExtraCallbackWithResult(onExtraCallback onextracallback, File file, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 111;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if ((i & 2) != 0) {
                int i6 = i4 + 43;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                str2 = "";
            }
            return onextracallback.onNavigationEvent(file, str, str2);
        }

        private final File onNavigationEvent(File file, String str, String str2) {
            int i = 2 % 2;
            File file2 = new File(file, onNavigationEvent(str) + str2);
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
            }
            return file2;
        }

        public final void IAuthTabCallback(@NotNull File file) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(file, "");
            if (file.exists()) {
                int i4 = onWarmupCompleted + 91;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                file.delete();
            }
            int i6 = onExtraCallback + 115;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 0 / 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc A[Catch: all -> 0x013d, PHI: r6 r9
      0x00cc: PHI (r6v5 ??) = (r6v20 ??), (r6v21 ??) binds: [B:19:0x00ca, B:15:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r9v14 int) = (r9v31 int), (r9v32 int) binds: [B:19:0x00ca, B:15:0x009d] A[DONT_GENERATE, DONT_INLINE], TryCatch #9 {all -> 0x013d, blocks: (B:14:0x0097, B:42:0x0134, B:20:0x00cc, B:23:0x00d3, B:25:0x00e1, B:27:0x00ee, B:29:0x00f8, B:31:0x011e, B:39:0x012f, B:40:0x0132, B:18:0x00c4, B:24:0x00db, B:36:0x012c), top: B:128:0x0071, outer: #4, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133 A[PHI: r6 r9
      0x0133: PHI (r6v7 java.io.File) = 
      (r6v9 java.io.File)
      (r6v10 java.io.File)
      (r6v11 java.io.File)
      (r6v12 java.io.File)
      (r6v13 java.io.File)
      (r6v14 java.io.File)
      (r6v15 java.io.File)
     binds: [B:19:0x00ca, B:26:0x00ec, B:28:0x00f6, B:30:0x011c, B:32:0x0126, B:22:0x00d2, B:15:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r9v16 int) = (r9v20 int), (r9v21 int), (r9v22 int), (r9v23 int), (r9v24 int), (r9v25 int), (r9v26 int) binds: [B:19:0x00ca, B:26:0x00ec, B:28:0x00f6, B:30:0x011c, B:32:0x0126, B:22:0x00d2, B:15:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0241 A[Catch: all -> 0x026b, TryCatch #6 {all -> 0x026b, blocks: (B:61:0x0193, B:90:0x023b, B:92:0x0241, B:93:0x0249, B:96:0x025b, B:89:0x0231, B:62:0x01b7, B:64:0x01bf, B:67:0x01c6, B:69:0x01d4, B:71:0x01e2, B:73:0x01ec, B:75:0x0212, B:86:0x0227, B:83:0x0222, B:84:0x0225, B:80:0x021f, B:68:0x01ce), top: B:123:0x0193, outer: #2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0251  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @Nullable String str8) throws IOException {
        Object obj;
        boolean zBooleanValue;
        Object obj2;
        File file;
        File file2;
        boolean z;
        int i;
        File file3;
        int i2;
        File file4;
        ReentrantLock reentrantLockPutIfAbsent;
        ?? r6 = str6;
        int i3 = 2 % 2;
        int i4 = onTransact + 65;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter((Object) r6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
        File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(this.onWarmupCompleted.onWarmupCompleted());
        ConcurrentHashMap<String, ReentrantLock> concurrentHashMapOnExtraCallback = rnBundleFileProcessLock.onExtraCallback();
        String canonicalPath = fileOnExtraCallback.getCanonicalPath();
        ReentrantLock reentrantLock = concurrentHashMapOnExtraCallback.get(canonicalPath);
        if (reentrantLock == null && (reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.putIfAbsent(canonicalPath, (reentrantLock = new ReentrantLock()))) != null) {
            reentrantLock = reentrantLockPutIfAbsent;
        }
        ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            boolean z2 = true;
            if (reentrantLock2.getHoldCount() > 1) {
                int i6 = asBinder + 5;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                    file2 = r6;
                    file = i7;
                }
                if (i7 != 0) {
                    File file5 = (File) onWarmupCompleted(new Object[]{this, str, r6, str7, str8}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1891120194, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1891120195);
                    File fileOnExtraCallbackWithResult = onExtraCallbackWithResult(str, r6, str7, str8);
                    Result.Companion companion2 = Result.Companion;
                    boolean zExists = file5.exists();
                    file4 = fileOnExtraCallbackWithResult;
                    i2 = file5;
                    r6 = fileOnExtraCallbackWithResult;
                    i7 = file5;
                    if (zExists) {
                        if (r6.exists()) {
                            TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted((File) r6));
                            try {
                                BundleMetadata bundleMetadataOnExtraCallback = BundleMetadata.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
                                CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                                file4 = r6;
                                i2 = i7;
                                if (Intrinsics.areEqual(bundleMetadataOnExtraCallback.IAuthTabCallbackStub(), str2)) {
                                    file4 = r6;
                                    i2 = i7;
                                    if (Intrinsics.areEqual(bundleMetadataOnExtraCallback.onNavigationEvent(), str3)) {
                                        file4 = r6;
                                        i2 = i7;
                                        if (Intrinsics.areEqual((String) BundleMetadata.onExtraCallback(2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{bundleMetadataOnExtraCallback}), str4)) {
                                            file4 = r6;
                                            i2 = i7;
                                            if (Intrinsics.areEqual(bundleMetadataOnExtraCallback.onTransact(), str5)) {
                                                z = true;
                                                file3 = r6;
                                                i = i7;
                                            }
                                            obj2 = Result.constructor-impl(Boolean.valueOf(z));
                                            file2 = file3;
                                            file = i;
                                            if (Result.exceptionOrNull-impl(obj2) != null) {
                                                int i8 = onTransact + 49;
                                                asBinder = i8 % 128;
                                                int i9 = i8 % 2;
                                                onExtraCallback onextracallback = Companion;
                                                onextracallback.IAuthTabCallback(file);
                                                onextracallback.IAuthTabCallback(file2);
                                            }
                                            Boolean bool = Boolean.FALSE;
                                            if (!(!Result.onExtraCallback(obj2))) {
                                                int i10 = asBinder + 103;
                                                onTransact = i10 % 128;
                                                int i11 = i10 % 2;
                                                obj2 = bool;
                                            }
                                            zBooleanValue = ((Boolean) obj2).booleanValue();
                                        }
                                    }
                                }
                            } finally {
                            }
                        } else {
                            file4 = r6;
                            i2 = i7;
                        }
                        z = false;
                        file3 = file4;
                        i = i2;
                        obj2 = Result.constructor-impl(Boolean.valueOf(z));
                        file2 = file3;
                        file = i;
                        if (Result.exceptionOrNull-impl(obj2) != null) {
                        }
                        Boolean bool2 = Boolean.FALSE;
                        if (!(!Result.onExtraCallback(obj2))) {
                        }
                        zBooleanValue = ((Boolean) obj2).booleanValue();
                    } else {
                        z = false;
                        file3 = file4;
                        i = i2;
                        obj2 = Result.constructor-impl(Boolean.valueOf(z));
                        file2 = file3;
                        file = i;
                        if (Result.exceptionOrNull-impl(obj2) != null) {
                        }
                        Boolean bool22 = Boolean.FALSE;
                        if (!(!Result.onExtraCallback(obj2))) {
                        }
                        zBooleanValue = ((Boolean) obj2).booleanValue();
                    }
                } else {
                    File file6 = (File) onWarmupCompleted(new Object[]{this, str, r6, str7, str8}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1891120194, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1891120195);
                    File fileOnExtraCallbackWithResult2 = onExtraCallbackWithResult(str, r6, str7, str8);
                    Result.Companion companion3 = Result.Companion;
                    boolean zExists2 = file6.exists();
                    file4 = fileOnExtraCallbackWithResult2;
                    i2 = file6;
                    r6 = fileOnExtraCallbackWithResult2;
                    i7 = file6;
                    if (zExists2) {
                    }
                }
            } else {
                File parentFile = fileOnExtraCallback.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new RandomAccessFile(fileOnExtraCallback, "rw").getChannel();
                try {
                    FileLock fileLockLock = channel.lock();
                    try {
                        File file7 = (File) onWarmupCompleted(new Object[]{this, str, r6, str7, str8}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1891120194, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1891120195);
                        File fileOnExtraCallbackWithResult3 = onExtraCallbackWithResult(str, r6, str7, str8);
                        try {
                            Result.Companion companion4 = Result.Companion;
                        } catch (Throwable th2) {
                            Result.Companion companion5 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(th2));
                        }
                        if (file7.exists() && fileOnExtraCallbackWithResult3.exists()) {
                            TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback2 = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(fileOnExtraCallbackWithResult3));
                            try {
                                BundleMetadata bundleMetadataOnExtraCallback2 = BundleMetadata.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback2);
                                CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback2, (Throwable) null);
                                if (!(!Intrinsics.areEqual(bundleMetadataOnExtraCallback2.IAuthTabCallbackStub(), str2)) && Intrinsics.areEqual(bundleMetadataOnExtraCallback2.onNavigationEvent(), str3)) {
                                    if (!Intrinsics.areEqual((String) BundleMetadata.onExtraCallback(2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{bundleMetadataOnExtraCallback2}), str4) || !Intrinsics.areEqual(bundleMetadataOnExtraCallback2.onTransact(), str5)) {
                                    }
                                    obj = Result.constructor-impl(Boolean.valueOf(z2));
                                    if (Result.exceptionOrNull-impl(obj) != null) {
                                    }
                                    Boolean bool3 = Boolean.FALSE;
                                    if (Result.onExtraCallback(obj)) {
                                    }
                                    zBooleanValue = ((Boolean) obj).booleanValue();
                                    CloseableKt.closeFinally(channel, (Throwable) null);
                                }
                            } finally {
                            }
                        } else {
                            z2 = false;
                            obj = Result.constructor-impl(Boolean.valueOf(z2));
                            if (Result.exceptionOrNull-impl(obj) != null) {
                                onExtraCallback onextracallback2 = Companion;
                                onextracallback2.IAuthTabCallback(file7);
                                onextracallback2.IAuthTabCallback(fileOnExtraCallbackWithResult3);
                            }
                            Boolean bool32 = Boolean.FALSE;
                            if (Result.onExtraCallback(obj)) {
                                int i12 = onTransact + 9;
                                asBinder = i12 % 128;
                                int i13 = i12 % 2;
                                obj = bool32;
                            }
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            CloseableKt.closeFinally(channel, (Throwable) null);
                        }
                    } finally {
                        fileLockLock.release();
                    }
                } finally {
                }
            }
            return zBooleanValue;
        } finally {
            reentrantLock2.unlock();
        }
    }

    public final File onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (File) onWarmupCompleted(new Object[]{this, str, str2, str3, str4}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1891120194, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, 1891120195);
    }

    public final void onNavigationEvent(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        Object[] objArr = {this, str, Long.valueOf(j), str2, str3, str4};
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        onWarmupCompleted(objArr, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1055338990, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, 1055338990);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = -721902652;
        onExtraCallback = -1538795429;
        onNavigationEvent = -861460091;
        IAuthTabCallback = new byte[]{8, -4, 26, -14, -2, 8};
    }
}
